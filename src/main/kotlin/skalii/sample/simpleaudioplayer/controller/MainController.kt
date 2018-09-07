package skalii.sample.simpleaudioplayer.controller


import java.net.URL
import java.util.*

import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.stage.FileChooser


class MainController : Initializable {

    @FXML
    var mainButton: Button = Button()

    override fun initialize(location: URL?, resources: ResourceBundle?) {

        mainButton.setOnAction {

            val audio: AudioInputStream =
                    AudioSystem.getAudioInputStream(
                            FileChooser().showOpenDialog(
                                    null
                            ).absoluteFile
                    )

            AudioSystem.getClip().run {
                open(audio)
                framePosition = 0
                start()
            }
        }

    }

}