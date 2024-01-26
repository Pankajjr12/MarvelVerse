package com.pankaj.avengersassemble.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R
import kotlinx.android.synthetic.main.adapter_weapon_row.view.*

class AdapterWeapon(val context: Context):RecyclerView.Adapter<AdapterWeapon.MyViewModel>() {
    class MyViewModel (item: View):RecyclerView.ViewHolder(item){
        val img_weapons=item.cirWeapon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewModel {
        val layout=LayoutInflater.from(context).inflate(R.layout.adapter_weapon_row,parent,false)
        return MyViewModel(layout)
    }

    override fun onBindViewHolder(holder: MyViewModel, position: Int) {
        if (position == 0) {
            holder.img_weapons.setCircleBackgroundColorResource(R.color.light_grey)
            holder.img_weapons.setImageResource(R.drawable.thortool)
        }
        else if (position == 1) {
            holder.img_weapons.setCircleBackgroundColorResource(R.color.light_grey)
            holder.img_weapons.setImageResource(R.drawable.irontool)
        }
        else if (position == 2) {
            holder.img_weapons.setCircleBackgroundColorResource(R.color.light_grey)
            holder.img_weapons.setImageResource(R.drawable.webtool)
        }
        else if (position == 3) {
            holder.img_weapons.setCircleBackgroundColorResource(R.color.light_grey)
            holder.img_weapons.setImageResource(R.drawable.blacktool)
        }
    }

    override fun getItemCount(): Int {
   return 4
    }

}