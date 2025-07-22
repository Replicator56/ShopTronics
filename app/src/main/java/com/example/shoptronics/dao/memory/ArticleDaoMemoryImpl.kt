package com.example.shoptronics.dao.memory

import com.example.shoptronics.bo.Article
import com.example.shoptronics.dao.ArticleDao
import java.util.Date

class ArticleDaoMemoryImpl : ArticleDao {
      private val articles: MutableList<Article> = mutableListOf(
        Article(
            id = 1,
            name = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
            description = "Your perfect pack for everyday use and walks in the forest...",
            price = 109.95,
            urlImage = "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
            category = "men's clothing",
            date = Date()
        ),
        Article(
            id = 2,
            name = "Mens Casual Premium Slim Fit T-Shirts",
            description = "Slim-fitting style, contrast raglan long sleeve...",
            price = 22.3,
            urlImage = "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg",
            category = "men's clothing",
            date = Date()
        ),
        Article(
            id = 3,
            name = "Mens Cotton Jacket",
            description = "Great outerwear jackets for Spring/Autumn/Winter...",
            price = 55.99,
            urlImage = "https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg",
            category = "men's clothing",
            date = Date()
        )
    )

    override fun findById(id: Long): Article? {
        return articles.find { article ->
            article.id == id }
    }

    override fun insert(article: Article): Long {
        article.id = articles.size.toLong()+1
        articles.add(article)
        return article.id
    }
}