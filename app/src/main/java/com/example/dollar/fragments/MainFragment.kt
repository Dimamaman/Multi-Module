package com.example.dollar.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dollar.R
import com.example.dollar.adapter.BirdsAdapter
import com.example.dollar.data.Contacts
import com.example.dollar.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    private lateinit var birdsAdapter: BirdsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMainBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)

        birdsAdapter = BirdsAdapter()
        birdsAdapter.model = Contacts.getAllBirds()
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = birdsAdapter

    }
}