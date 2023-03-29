package com.example.countgame.domain.usecases

import com.example.countgame.domain.entity.Question
import com.example.countgame.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, MAX_OPTIONS)
    }

    private companion object {
        private const val MAX_OPTIONS = 6
    }
}

