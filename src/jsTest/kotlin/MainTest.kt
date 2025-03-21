import com.github.template.main
import kotlinx.browser.document
import kotlinx.dom.appendElement
import org.w3c.dom.Element
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class MainTest {
    @Test
    fun thingsShouldWork() {
        val expectedParagraph = "Hello World!"

        val root = preparePage()
        main()

        val p = assertNotNull(root.getElementsByTagName("p").item(0), "p element not found in root")
        assertEquals(expectedParagraph, p.textContent)
    }

    private fun preparePage(): Element {
        return document.body?.appendElement("div") {
            id = "root"
        } ?: error("Couldn't find root element")
    }
}