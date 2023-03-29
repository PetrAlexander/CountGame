package com.example.countgame.domain.usecases

import com.example.countgame.domain.entity.GameSettings
import com.example.countgame.domain.entity.Level
import com.example.countgame.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}