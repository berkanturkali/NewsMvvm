package com.example.newsmvvm.business.domain.model

import com.example.newsmvvm.framework.datasource.network.model.ArticleDTO
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("status")
    @Expose
    val status: String,
    @SerializedName("totalResults")
    @Expose
    val totalResults: Int,
    @SerializedName("articles")
    @Expose
    val articles: List<ArticleDTO>
)