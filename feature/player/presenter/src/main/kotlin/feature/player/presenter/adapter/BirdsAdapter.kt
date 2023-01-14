package feature.player.presenter.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import feature.player.models.PlayerModel
import feature.player.presenter.R
import feature.player.presenter.databinding.BirdsItemBinding

class BirdsAdapter: RecyclerView.Adapter<BirdsAdapter.VH>() {
    var model: List<PlayerModel> = listOf()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    inner class VH(val binding: BirdsItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.birds_item,parent,false)
        val binding = BirdsItemBinding.bind(view)
        return VH(binding)
    }

    private var clickListener : ((id : Long) -> Unit) ? = null

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: VH, position: Int) {
        val player = model[position]
        holder.binding.birdsName.text = player.name
        holder.binding.birdsOrder.text = "Number: ${player.number}"
        holder.binding.birdsFamily.text = "Team: ${player.team}"

        Glide.with(holder.itemView.context).load(player.image).into(holder.binding.birdsImage)

        holder.itemView.setOnClickListener {
            clickListener?.invoke(player.id)
        }

    }

    fun setClickListener(f : (Long)-> Unit) {
        clickListener = f
    }

    override fun getItemCount(): Int = model.size
}