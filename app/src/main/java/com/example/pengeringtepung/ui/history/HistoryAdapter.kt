package com.example.pengeringtepung.ui.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pengeringtepung.databinding.ItemHistoryVerticalBinding
import com.example.pengeringtepung.model.HistoryModel
import com.example.pengeringtepung.response.history.Data

class HistoryAdapter (
    private val listData : List<HistoryModel>,
    /*private val itemAdapterCallback : ItemAdapterCallback,*/
) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>(){

    inner class ViewHolder(val binding:ItemHistoryVerticalBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoryVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

        /*val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_pastorders, parent, false)
        return ViewHolder(view)*/

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /*holder.bind(listData[position], itemAdapterCallback)*/
        with(holder){
            with(listData[position]){
                binding.tvTempVal.text = this.temp
                binding.tvHumVal.text = this.hum
                binding.tvVoltVal.text = this.volt
                binding.tvBeratAwalVal.text = this.beratAwal
                binding.tvBeratAkhirVal.text = this.beratAkhir
                binding.tvDate.text = this.timeStamp
                binding.tvKadarAirVal.text = this.kadarAir

                if (status == "Kadar Air Terlalu Rendah"){
                    binding.tvWarning.visibility = View.VISIBLE
                    binding.tvSuccess.visibility = View.GONE
                    binding.ivPosterSuccess2.visibility = View.GONE
                    binding.ivPosterWarning.visibility = View.VISIBLE
                } else{
                    binding.tvWarning.visibility = View.GONE
                    binding.tvSuccess.visibility = View.VISIBLE
                    binding.ivPosterSuccess2.visibility = View.VISIBLE
                    binding.ivPosterWarning.visibility = View.GONE
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    /*class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : Data, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.food.name
                tvPrice.formatPrice(data.food.price.toString())
                tvDate.text = data.food.createdAt.convertLongToTime("MMM dd , HH.mm")

                Glide.with(context)
                    .load(data.food.picturePath)
                    .into(ivPoster)

                if(data.status.equals("CANCELLED", true)) {
                    tvCancelled.visibility = View.VISIBLE
                }

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }*/

    /*interface ItemAdapterCallback {
        fun onClick(v: View, data:Data)
    }*/

}