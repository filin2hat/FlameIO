package dev.filinhat.framesdk.data

enum class SortOrder(
    val value: String,
) {
    CommentCount("comment_count"),
    FileSize("file_size"),
    FileType("file_type"),
    Id("id"),
    Label("label"),
    Name("name"),
    UploadedAt("uploaded_at"),
}

data class SortOrders(
    val orders: Set<SortOrder>,
) {
    private val string by lazy {
        orders.joinToString(separator = "|") { it.value }
    }

    override fun toString(): String = super.toString()
}
