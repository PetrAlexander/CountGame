package com.example.countgame.domain.repository

import com.example.countgame.domain.entity.GameSettings
import com.example.countgame.domain.entity.Level
import com.example.countgame.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}