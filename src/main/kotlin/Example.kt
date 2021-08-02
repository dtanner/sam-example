fun interface Thinger {
    fun doThing()
}

class ThingerService: Thinger {
    override fun doThing() {}
}

class BService(
    private val thinger: Thinger
) {
    fun run() {
        thinger.doThing()
    }
}

fun main() {
    val thingerService = ThingerService()
    val bService = BService(thingerService)
    bService.run()
}
