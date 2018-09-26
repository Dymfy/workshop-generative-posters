import org.openrndr.Program
import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.configuration
import org.openrndr.draw.FontImageMap
import org.openrndr.extensions.Screenshots
import org.openrndr.filter.blend.add
import org.openrndr.filter.blur.GaussianBlur

class Typography001: Program() {

    var drawFunc = {}
    override fun setup() {

        val gaussianBlur = GaussianBlur()


        drawFunc = {
            poster(drawer) {
                drawer.background(ColorRGBa.BLACK)
                drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 60.0, 9.0)
                layer(post = gaussianBlur.apply {
                    gain = 5.0
                    spread = 1.0
                    window = 25
                    sigma = Math.cos(seconds)*10.0 + 10.0

//B in %
                }, blend = add) {
                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 60.0, 2.0)
                    drawer.text("%%", 100.0, 100.0)
                    drawer.text("%%", 100.0, 150.0)
                    drawer.text("%%", 100.0, 200.0)
                    drawer.text("%%", 100.0, 250.0)
                    drawer.text("%%", 100.0, 300.0)
                    drawer.text("%%", 150.0, 100.0)
                    drawer.text("%", 200.0, 100.0)
                    drawer.text("%%", 200.0, 150.0)
                    drawer.text("%%", 200.0, 250.0)
                    drawer.text("%", 200.0, 300.0)
                    drawer.text("%%%", 150.0, 200.0)
                    drawer.text("%%", 150.0, 300.0)
// A in %
                    drawer.text("%%%%", 300.0, 50.0)
                    drawer.text("%%", 300.0, 100.0)
                    drawer.text("%%%%", 300.0, 150.0)
                    drawer.text("%%", 300.0, 200.0)
                    drawer.text("%%", 300.0, 250.0)
                    drawer.text("%%", 400.0, 50.0)
                    drawer.text("%%", 400.0, 100.0)
                    drawer.text("%%", 400.0, 150.0)
                    drawer.text("%%", 400.0, 200.0)
                    drawer.text("%%", 400.0, 250.0)

                    // letter N
                    drawer.text("%%%%", 300.0, 350.0)
                    drawer.text("%%", 300.0, 400.0)
                    drawer.text("%%", 300.0, 450.0)
                    drawer.text("%%", 300.0, 500.0)
                    drawer.text("%%", 300.0, 550.0)
                    drawer.text("%%", 400.0, 350.0)
                    drawer.text("%%", 400.0, 400.0)
                    drawer.text("%%", 400.0, 450.0)
                    drawer.text("%%", 400.0, 500.0)
                    drawer.text("%%", 400.0, 550.0)





                    //drawer.text("%%", 150.0, 100.0)
                    //drawer.text("%", 200.0, 100.0)
                    //drawer.text("%%", 200.0, 150.0)
                    // drawer.text("%%", 200.0, 250.0)
                    // drawer.text("%", 200.0, 300.0)
                    // drawer.text("%%%", 150.0, 200.0)
                    // drawer.text("%%", 150.0, 300.0)

                }
            }
        }

        // -- extend with screenshots, spacebar to shoot
        extend(Screenshots())
    }

    override fun draw() {
        drawFunc()
    }

}

// -- entry point of the application
fun main(args: Array<String>) {
    application(Typography001(), configuration {
        height = 680
        width = 500

    })
}