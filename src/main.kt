import io.javalin.Javalin

fun main(_args: Array<String>) {
    val app = Javalin.create().start(8080)
    app.get("/") { ctx -> ctx.result("Hello world") }
}