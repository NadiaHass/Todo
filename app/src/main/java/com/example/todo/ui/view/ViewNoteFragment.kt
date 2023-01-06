package com.example.todo.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.todo.R
import com.example.todo.databinding.FragmentUpdateBinding
import com.example.todo.databinding.FragmentViewNoteBinding

class ViewNoteFragment : Fragment() {
    private var _binding: FragmentViewNoteBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewNoteBinding.inflate(inflater, container, false)

        binding.ivEdit.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_viewNoteFragment_to_updateFragment)
        }
        return binding.root    }
}