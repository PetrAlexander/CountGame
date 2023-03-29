package com.example.countgame.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import com.example.countgame.R
import com.example.countgame.databinding.FragmentChooseLevelBinding
import com.example.countgame.domain.entity.Level


class ChooseLevelFragment : Fragment() {
    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("Binding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        with(binding) {
            buttonLevelTest.setOnClickListener {
                launchGameScreen(Level.TEST)
            }
            buttonLevelEasy.setOnClickListener {
                launchGameScreen(Level.EASY)
            }
            buttonLevelNormal.setOnClickListener {
                launchGameScreen(Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener {
                launchGameScreen(Level.HARD)
            }
        }
    }

    private fun launchGameScreen(level: Level) {
        findNavController().navigate(
            ChooseLevelFragmentDirections.actionChooseLevelFragmentToGameFragment(
                level
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
