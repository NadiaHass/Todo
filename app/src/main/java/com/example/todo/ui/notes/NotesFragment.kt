package com.example.todo.ui.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.todo.R
import com.example.todo.databinding.FragmentAddBinding
import com.example.todo.databinding.FragmentNotesBinding

class NotesFragment : Fragment() {
    private var _binding: FragmentNotesBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotesBinding.inflate(inflater, container, false)

        binding.fabAddNote.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_notesFragment_to_addFragment)
        }

        binding.frameLayout.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_notesFragment_to_viewNoteFragment)
        }

        return binding.root
    }
}