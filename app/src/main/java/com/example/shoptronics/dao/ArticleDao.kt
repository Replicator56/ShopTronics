package com.example.shoptronics.dao

import com.example.shoptronics.bo.Article

interface ArticleDao {
    fun findById(id: Long): Article?
    fun insert(article: Article): Long
}