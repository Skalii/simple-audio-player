package skalii.sample.simpleaudioplayer.window

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MainWindow : Application() {

    override fun start(primaryStage: Stage?) {

        val root: Parent = FXMLLoader.load(javaClass.classLoader.getResource("fxml/main-window.fxml"))
        val scene = Scene(root)

        if (primaryStage != null) {
            primaryStage.scene = scene
            primaryStage.show()
        }

    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            launch(MainWindow::class.java, *args)
        }

    }

}