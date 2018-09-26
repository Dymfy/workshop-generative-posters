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

                drawer.fill = ColorRGBa.BLUE
                drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 22.0, 2.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 0.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 20.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 40.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 60.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 80.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 100.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 120.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 140.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 160.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 180.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 200.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 220.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 240.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 260.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 280.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 300.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 320.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 340.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 360.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 380.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 400.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 420.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 440.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 460.0)
                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 480.0)









                layer(post = gaussianBlur.apply {
                    gain = 8.0
                    spread = 7.0
                    window = 25
                    sigma = Math.cos(seconds)*4.0 + 4.0
                }, blend = add) {
                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 740.0, 2.0)
                    drawer.text("))", 85.0, 410.0)
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
    application(Typography001(), configuration {  })

}