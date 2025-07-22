package com.example.shoptronics

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shoptronics.bo.Article
import com.example.shoptronics.repository.ArticleRepository
import com.example.shoptronics.ui.theme.ShopTronicsTheme

//logt
private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            ShopTronicsTheme {
                val article = ArticleRepository.getArticle(2)
                Log.i(TAG, article.toString())
                val id = ArticleRepository.addArticle(
                    Article(
                        name = "Test"
                    )
                )
                Log.e(TAG, ArticleRepository.getArticle(id).toString())
            }
        }
    }
}