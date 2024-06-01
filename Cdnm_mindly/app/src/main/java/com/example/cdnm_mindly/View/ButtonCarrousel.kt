package com.example.cdnm_mindly.View

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ButtonCarrousel {
    @Composable
    fun AutoScrollingLazyRow() {
        val lazyListState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()

        LazyRow(state = lazyListState) {
            items(100) { index ->
                ElevatedButton(
                    onClick = { /* TODO: Acción al hacer clic */ },
                    modifier = Modifier
                ) {
                    Text(text = "Botón $index")
                }
                Spacer(modifier = Modifier.size(10.dp))
            }
        }

        LaunchedEffect(Unit) {
            autoScroll(lazyListState, coroutineScope)
        }
    }

    private fun autoScroll(lazyListState: LazyListState, coroutineScope: CoroutineScope) {
        coroutineScope.launch {
            while (true) {
                val itemCount = lazyListState.layoutInfo.totalItemsCount
                val currentItemIndex = lazyListState.firstVisibleItemIndex
                val nextItemIndex = if (currentItemIndex + 1 >= itemCount) 0 else currentItemIndex + 1

                lazyListState.animateScrollToItem(nextItemIndex)
                delay(1300)
            }
        }
    }
}