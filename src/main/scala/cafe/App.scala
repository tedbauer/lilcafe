package cafe;

import org.scalajs.dom
import org.scalajs.dom.document

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.html

object App {

  type Ctx2D = dom.CanvasRenderingContext2D

  def main(args: Array[String]): Unit = {
    document.addEventListener(
      "DOMContentLoaded",
      { (e: dom.Event) =>
        val canvas = document
          .createElement("canvas")
          .asInstanceOf[html.Canvas]
        canvas.width = 400
        canvas.height = 300
        val canvasCtx =
          canvas
            .getContext("2d")
            .asInstanceOf[Ctx2D]

        document.body.appendChild(canvas)

        var background =
          dom.document.createElement("img").asInstanceOf[dom.HTMLImageElement]
        background.src = "assets/background.png"
        background.onload = (e: dom.Event) => {
          canvasCtx.drawImage(background, 0, 0, 325, 225)

          var dollar =
            dom.document.createElement("img").asInstanceOf[dom.HTMLImageElement]
          dollar.src = "assets/dollar_sign.png"
          dollar.onload = (e: dom.Event) => {
            canvasCtx.drawImage(dollar, 30, 40, 20, 20)
          }

          var chair1 =
            dom.document.createElement("img").asInstanceOf[dom.HTMLImageElement]
          chair1.src = "assets/chair.png"
          chair1.onload = (e: dom.Event) => {
            canvasCtx.drawImage(chair1, 60, 120, 50, 50)

            var person =
              dom.document
                .createElement("img")
                .asInstanceOf[dom.HTMLImageElement]
            chair1.src = "assets/person.png"
            chair1.onload = (e: dom.Event) => {
              canvasCtx.drawImage(chair1, 73, 125, 42, 42)
            }
          }

          var table1 =
            dom.document.createElement("img").asInstanceOf[dom.HTMLImageElement]
          table1.src = "assets/table.png"
          table1.onload = (e: dom.Event) => {
            canvasCtx.drawImage(table1, 110, 120, 50, 50)

            var coffee =
              dom.document
                .createElement("img")
                .asInstanceOf[dom.HTMLImageElement]
            coffee.src = "assets/coffee.png"
            coffee.onload = (e: dom.Event) => {
              canvasCtx.drawImage(coffee, 110, 100, 42, 42)
            }

            canvasCtx.font = "15px serif";
            canvasCtx.fillText("" + 0, 52, 55)
          }
        }
      }
    );
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

}
