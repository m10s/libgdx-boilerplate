package com.example.libgdx.boilerplate

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object DesktopLauncher {

    @JvmStatic fun main(arg: Array<String>) {
        val game = Game()
        val config = LwjglApplicationConfiguration()
        config.width = 800
        config.height = 600

        LwjglApplication(game, config)
    }
}

class Game : ApplicationAdapter()