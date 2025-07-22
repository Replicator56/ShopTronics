package com.example.shoptronics.repository

import com.example.shoptronics.dao.DaoFactory
import com.example.shoptronics.dao.DaoType
import com.example.shoptronics.bo.Article
import com.example.shoptronics.dao.ArticleDao

object ArticleRepository {
    private val articleDao: ArticleDao = DaoFactory.createArticleDAO(DaoType.MEMORY)

    fun getArticle(id: Long): Article?{
        return articleDao.findById(id)
    }

    fun addArticle(article: Article): Long {
        return articleDao.insert(article)
    }
}