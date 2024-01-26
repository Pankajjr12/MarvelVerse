package com.test.assignment.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.assignment.R
import com.test.assignment.teams.afghan.AfghanistanActivity
import com.test.assignment.teams.africa.SouthAfricaActivity
import com.test.assignment.teams.australia.AustraliaActivity
import com.test.assignment.teams.bangla.BangladeshActivity
import com.test.assignment.teams.endland.EnglandActivity
import com.test.assignment.teams.india.IndiaActivity
import com.test.assignment.teams.lanka.SriActivity
import com.test.assignment.teams.newzealand.NewzealandActivity
import com.test.assignment.teams.pakistan.PakistanActivity
import com.test.assignment.teams.west.WestIndiesActivity
import kotlinx.android.synthetic.main.row_layout.view.*

class AdapterCountry(val context: Context):RecyclerView.Adapter<AdapterCountry.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val count = itemView.txtCountry
        val click = itemView.card
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return MyViewHolder(layout)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        when (position) {
            0 -> {
                holder.count.text = "Afghanistan"
            }
            1 -> {
                holder.count.text = "Australia"
            }
            2 -> {
                holder.count.text = "Bangladesh"
            }
            3 -> {
                holder.count.text = "England"
            }
            4-> {
                holder.count.text = "India"
            }
            5 -> {
                holder.count.text = "New Zealand"
            }
            6 -> {
                holder.count.text = "Pakistan"
            }
            7 -> {
                holder.count.text = "South Africa"
            }
            8 -> {
                holder.count.text = "Srilanka"
            }
            9 -> {
                holder.count.text = "West Indies"
            }
        }

        holder.click.setOnClickListener {
            when (position) {
                0 -> {
                    val intent = Intent(context,AfghanistanActivity::class.java)
                    context.startActivity(intent)
                }
                1 -> {

                    val intent = Intent(context, AustraliaActivity::class.java)
                    intent.putExtra("players", "australia")
                    context.startActivity(intent)
                }
                2 -> {

                    val intent = Intent(context, BangladeshActivity::class.java)
                    intent.putExtra("players", "bang")
                    context.startActivity(intent)
                }
                3 -> {

                    val intent = Intent(context, EnglandActivity::class.java)
                    intent.putExtra("players", "england")
                    context.startActivity(intent)
                }
                4 -> {

                    val intent = Intent(context, IndiaActivity::class.java)
                    intent.putExtra("players", "ind")
                    context.startActivity(intent)

                }
                5 -> {

                    val intent = Intent(context, NewzealandActivity::class.java)
                    intent.putExtra("players", "new")
                    context.startActivity(intent)

                }

                6 -> {

                    val intent = Intent(context, PakistanActivity::class.java)
                    intent.putExtra("players", "pakistan")
                    context.startActivity(intent)
                }
                7 -> {

                    val intent = Intent(context, SouthAfricaActivity::class.java)
                    intent.putExtra("players", "africa")
                    context.startActivity(intent)
                }
                8 -> {

                    val intent = Intent(context, SriActivity::class.java)
                    intent.putExtra("players", "lanka")
                    context.startActivity(intent)
                }
                9 -> {

                    val intent = Intent(context, WestIndiesActivity::class.java)
                    intent.putExtra("players", "west")
                    context.startActivity(intent)
                }
            }
        }

    }
    override fun getItemCount(): Int {
        return 10
    }
}