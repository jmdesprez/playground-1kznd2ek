fun msg(channel: String, msg: String?) {
    println("""TECHIO> message --channel "$channel" "$msg"""")
}

fun success(success: Boolean) {
    println("TECHIO> success $success")
}

class Channel(private val name: String) {
    fun msg(msg: String?) = msg(name, msg)
}

fun channel(name: String, block: Channel.() -> Unit) {
    Channel(name).apply(block)
}

enum class AnnotateType(val label: String) {
    INFO("info"),
    WARNING("warning"),
    ERROR("error")
}

fun annotate(
    filePath: String,
    line: Int,
    msg: String,
    column: Int?,
    type: AnnotateType = AnnotateType.ERROR,
    channel: String?
) {
    fun String.escape() = """"${replace("\"", "\\\"")}""""

    val position = if (column != null) "$line:$column" else "$line"

    val fileOption = "file" to filePath
    val positionOption = "position" to position
    val typeOption = "type" to type.label
    val channelOption = "channel" to channel

    val options = listOf(fileOption, positionOption, typeOption, channelOption).filter { it.second != null }
        .joinToString(separator = " ") {
            "--${it.first} ${it.second?.escape()}"
        }

    println("TECHIO> annotate $options ${msg.escape()}")
}

fun main(args: Array<String>) {
    annotate("Main.java", 4, "mlkjlmf \" not found", 8, AnnotateType.WARNING, "compilation")
}