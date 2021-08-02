import org.junit.jupiter.api.Test

internal class BServiceTest {

    @Test
    fun testDoThing() {
        val service = BService(
            thinger = {}
        )
        service.run()
    }

}
