package feature.player.presenter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import feature.player.presenter.adapter.BirdsAdapter
import feature.player.presenter.databinding.FragmentMainBinding

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel : MainFragmentViewModel
    private lateinit var birdsAdapter: BirdsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMainBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainFragmentViewModel::class.java]
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        birdsAdapter = BirdsAdapter()

        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = birdsAdapter

        viewModel.getAllPlayersDataLiveData.observe(viewLifecycleOwner) {
            birdsAdapter.model = it
        }

        birdsAdapter.setClickListener {
            viewModel.navigateToDetailScreen(it)
        }

    }
}