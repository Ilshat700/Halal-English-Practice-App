package com.example.halalenglishpracticeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.graphics.Color
import com.example.halalenglishpracticeapp.bottom_navigation.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MainScreen()

        }
    }
}



@Composable
fun PeopleScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
    ) {
        itemsIndexed(
            listOf(
                ItemRowModel(R.drawable.java1, "qwerty", "Lorem ipsum dolor sit" +
                        " amet, consectetuer adipiscing elit. Aenean commodo ligula eget" +
                        " dolor. Aenean massa."),
                ItemRowModel(R.drawable.java2, "uiop", "test"),
                ItemRowModel(R.drawable.java3, "asdfg", "test"),
                ItemRowModel(R.drawable.java4, "hjk", "test"),
                ItemRowModel(R.drawable.kzn, "qwe", "test"),
                ItemRowModel(R.drawable.kotlin, "tyqwer", "test"),
                ItemRowModel(R.drawable.ubuntu, "qert", "test"),
                ItemRowModel(R.drawable.java2, "uiop", "test"),
                ItemRowModel(R.drawable.java3, "asdfg", "test"),
                ItemRowModel(R.drawable.java4, "hjk", "test"),
                ItemRowModel(R.drawable.kzn, "qwe", "test"),
                ItemRowModel(R.drawable.kotlin, "tyqwer", "test"),
                ItemRowModel(R.drawable.ubuntu, "qert", "test")
            )
        ) { index, item ->
            MyRow(item = item)
        }
    }

}


