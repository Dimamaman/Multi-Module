package com.example.dollar.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.dollar.R
import com.example.dollar.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private lateinit var binding: FragmentDetailBinding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentDetailBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity?)!!.setSupportActionBar(binding.toolbar)
        (activity as AppCompatActivity?)!!.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_detailFragment_to_mainFragment)
        }


        binding.apply {
            collapsingToolBar.title = args.birdsName.name
            Glide.with(requireActivity()).load(args.birdsName.image).into(birdsDetailImage)
            about.text = args.birdsName.descrioption
        }

        binding.shareButton.setOnClickListener {
            shareSucces()
        }
    }

    private fun shareSucces() {
        startActivity(getShareIntent())
    }
    private fun getShareIntent() : Intent {
        val args = DetailFragmentArgs.fromBundle(requireArguments())
        return ShareCompat.IntentBuilder.from(requireActivity())
            .setText("${args.birdsName}\n ${args.birdsName.descrioption}")
            .setType("text/plain")
            .intent
    }
}