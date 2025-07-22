package com.example.shoptronics.dao

import com.example.shoptronics.dao.memory.ArticleDaoMemoryImpl

abstract class DaoFactory {
    companion object {
        fun createArticleDAO(type: DaoType): ArticleDao {
            return when (type) {
                DaoType.MEMORY -> ArticleDaoMemoryImpl()
                DaoType.NETWORK -> throw NotImplementedError("Pas encore implémenté")
            }
        }
    }
}

