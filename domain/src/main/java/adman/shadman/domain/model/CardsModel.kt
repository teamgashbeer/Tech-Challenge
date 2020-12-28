package adman.shadman.domain.model


import com.google.gson.annotations.SerializedName

data class CardsModel(
    @SerializedName("cards")
    val cards: List<Card?>? = null
) {
    data class Card(
        @SerializedName("code")
        val code: Int? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("image")
        val image: String? = null,
        @SerializedName("sound")
        val sound: String? = null,
        @SerializedName("tag")
        val tag: String? = null,
        @SerializedName("title")
        val title: String? = null
    )
}