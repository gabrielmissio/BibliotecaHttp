package br.com.gmissio.httpbooks

import com.google.gson.annotations.SerializedName

data class Publisher (
    @SerializedName("novatec")
    var categories: List<Category> = emptyList()
)