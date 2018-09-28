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
import org.openrndr.Application
import org.openrndr.Configuration



class Typography001: Program() {

    var drawFunc = {}

    lateinit var image2: ColorBuffer;
    override fun setup() {

        // extend(ScreenRecorder())

        val gaussianBlur = GaussianBlur()

        image2 = ColorBuffer.fromUrl("file:data/giphy1.gif");



        drawFunc = {
            poster(drawer) {
                drawer.rectangle(10.0, 10.0, 600.0, 140.0)
                drawer.image(image2, image2.bounds, Rectangle(-30.0, 40.0, image2.bounds.width*2.0, image2.bounds.height*2.0))
                drawer.rectangle(50.0, 100.0, 50.0, 100.0)
                drawer.rectangle(300.0, 50.0, 50.0, 120.0)
                drawer.rectangle(150.0, 70.0, 50.0, 130.0)
                drawer.rectangle(200.0, 90.0, 50.0, 140.0)
                drawer.fill = ColorRGBa.PINK
                drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 22.0, 2.0)
                var xpos = 0.0;
                for( i in 0..9 ){
                    xpos = ( seconds * 60 ) % width;
                    drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", xpos, i*200.0 + 10)
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
//                drawer.text("((((((((((((((((((((((((((((00000000((((((((((((((((((((((((((", 0.0, 180.0)
//                drawer.text("(((((((((((((((((((((((((((000000000((((((((((((((((((((((((((", 0.0, 200.0)
//                drawer.text("((((((((((((((((((000000000000000000((((((((((((((((((((((((((", 0.0, 220.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 240.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 260.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((", 0.0, 280.0)
//                drawer.text("((((((((((((((((((((((((((((((((((((((((((((", 0.0, 480.0)
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
                    spread = 200.0
                    window = 25
                    sigma = Math.cos(seconds)*4.0 + 4.0
                }, blend = add) {
                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 740.0, 2.0)
                    drawer.text(" )", 85.0, 410.0)
                    drawer.fill = ColorRGBa.PINK
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
                    sigma = Math.cos(seconds)*10.0 + 1800.0
                }, blend = add) {

                    drawer.fontMap = FontImageMap.fromUrl("file:data/fonts/IBMPlexMono-Bold.ttf", 40.0, 2.0)
                    drawer.fill = ColorRGBa.PINK
                    drawer.text("GIFJES WERKEN NIET,", 100.0, 400.0)
                }
            }




        }

        // -- extend with screenshots, spacebar to shoot
        extend(Screenshots())
    }





    override fun draw() {
        drawFunc()
        drawer.fill = ColorRGBa.PINK
        drawer.circle(mouse.position, 5.0)


    }

//    override fun draw() {
//        drawFunc()
//    }

}

// -- entry point of the application
fun main(args: Array<String>) {
    application(Typography001(), configuration {
        height = 950
        width = 600
//test
    })
}