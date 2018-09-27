import org.openrndr.Program
import org.openrndr.application
import org.openrndr.color.ColorRGBa
import org.openrndr.configuration
import org.openrndr.draw.ColorBuffer
import org.openrndr.draw.FontImageMap
import org.openrndr.extensions.Screenshots
import org.openrndr.ffmpeg.ScreenRecorder
import org.openrndr.filter.blend.add
import org.openrndr.filter.blur.GaussianBlur
import org.openrndr.shape.Rectangle


class Typography001: Program() {

    var drawFunc = {}

    lateinit var image2: ColorBuffer;
    lateinit var image3: ColorBuffer;
    override fun setup() {

        // extend(ScreenRecorder())

        val gaussianBlur = GaussianBlur()

        image2 = ColorBuffer.fromUrl("file:data/datum.png");
        image3 = ColorBuffer.fromUrl("file:data/code zwarte strepen.png");
        drawFunc = {
            poster(drawer) {
                drawer.rectangle(10.0, 10.0, 120.0, 140.0)

                drawer.image(image2, image2.bounds, Rectangle(-30.0, 0.0, image2.bounds.width*1.0, image2.bounds.height*1.0))
                drawer.image(image3, image2.bounds, Rectangle(0.0, 0.0, image3.bounds.width*0.5, image3.bounds.height*0.5))
                drawer.rectangle(30.0, 30.0, 150.0, 170.0)
                drawer.rectangle(60.0, 60.0, 180.0, 200.0)
                drawer.rectangle(90.0, 90.0, 210.0, 230.0)
                drawer.rectangle(95.0, 95.0, 215.0, 235.0)
                drawer.fill = ColorRGBa.BLACK
                drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 22.0, 2.0)
                var xpos = 0.0;
                for( i in 0..3 ){
                    xpos = ( seconds * 10 ) % width;
                    drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", xpos, i*20.0 + 10)
                }
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", seconds*-10, 0.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 20.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 40.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 60.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 80.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 100.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 120.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 140.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 160.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 180.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 200.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 220.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 240.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 260.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 280.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 300.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 320.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 340.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 360.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 380.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 400.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 420.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 440.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 460.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 480.0)
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









                layer(post = gaussianBlur.apply {
                    gain = 8.0
                    spread = 7.0
                    window = 25
                    sigma = Math.cos(seconds)*4.0 + 4.0
                }, blend = add) {
                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 740.0, 2.0)
                    drawer.text(" )", 85.0, 410.0)
                    drawer.fill = ColorRGBa.YELLOW
                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 300.0, 2.0)
                    drawer.text("--", 0.0, 0.0)
                    drawer.text("-", 320.0, 400.0)
                    drawer.text("--", 400.0, 510.0)
                    drawer.text("--", 410.0, 100.0)
                    drawer.text("-", 320.0, 200.0)



                }

                layer(post = gaussianBlur.apply {
                    gain = 9.0
                    spread = 3.0
                    window = 25
                    sigma = Math.cos(seconds)*20.0 + 20.0
                }, blend = add) {

                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 40.0, 2.0)
                    drawer.fill = ColorRGBa.PINK
                    drawer.text("Maarja,", 100.0, 400.0)
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
        height = 950
        width = 600

    })
}