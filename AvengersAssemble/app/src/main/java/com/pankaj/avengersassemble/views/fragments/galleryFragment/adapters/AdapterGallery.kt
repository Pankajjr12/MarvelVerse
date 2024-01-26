package com.pankaj.avengersassemble.views.fragments.galleryFragment.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pankaj.avengersassemble.R
import com.pankaj.avengersassemble.model.GalleryModel
import com.pankaj.avengersassemble.views.fragments.characterDetail.CharacterActivity
import com.pankaj.avengersassemble.views.fragments.movieDetailFragment.MovieDetailActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_gallery.view.*

class AdapterGallery(val context: Context,var userlist:List<GalleryModel>):RecyclerView.Adapter<AdapterGallery.MyViewModel>() {
    class MyViewModel(item: View):RecyclerView.ViewHolder(item) {
        val img=item.imgGal
        val txt=item.ficName
        val txt1=item.realName
        val layout=item.hLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewModel {
       val lay=LayoutInflater.from(context).inflate(R.layout.adapter_gallery,parent,false)
        return MyViewModel(lay)
    }

    override fun onBindViewHolder(holder: MyViewModel, position: Int) {
        val dellist:GalleryModel=userlist[position]
        holder.txt1.text=dellist.real_name

        holder.txt.text=dellist.fiction_name
        Picasso.get().load(dellist.image).into(holder.img)
        holder.layout.setOnClickListener {
            if (position==0) {
                val intent = Intent(context, CharacterActivity::class.java)
                intent.putExtra("characters", "wanda")
                context.startActivity(intent)
            }
            else if (position==1)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","black")
                context.startActivity(intent)
            }
            else if(position==2)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","thor")
                context.startActivity(intent)
            }
            else if(position==3)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","iron")
                context.startActivity(intent)
            }
            else if(position==4)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","marvel")
                context.startActivity(intent)
            }
            else if(position==5)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","america")
                context.startActivity(intent)
            }
            else if(position==6)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","hulk")
                context.startActivity(intent)
            }
            else if(position==7)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","panther")
                context.startActivity(intent)
            }
            else if(position==8)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","hawk")
                context.startActivity(intent)
            }
            else if(position==9)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","winter")
                context.startActivity(intent)
            }
            else if(position==10)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","vision")
                context.startActivity(intent)
            }
            else if(position==11)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","spider")
                context.startActivity(intent)
            }
            else if(position==12)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","war")
                context.startActivity(intent)
            }
            else if(position==13)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","doctor")
                context.startActivity(intent)
            }
            else if(position==14)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","loki")
                context.startActivity(intent)
            }
            else if(position==15)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","thanos")
                context.startActivity(intent)
            }
            else if(position==16)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","kang")
                context.startActivity(intent)
            }
            else if(position==17)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","falcon")
                context.startActivity(intent)
            }
            else if(position==18)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","wong")
                context.startActivity(intent)
            }
            else if(position==19)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","star")
                context.startActivity(intent)
            }
            else if(position==20)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","drax")
                context.startActivity(intent)
            }
            else if(position==21)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","gamora")
                context.startActivity(intent)
            }
            else if(position==22)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","mantis")
                context.startActivity(intent)
            }
            else if(position==23)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","rocket")
                context.startActivity(intent)
            }
            else if(position==24)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","groot")
                context.startActivity(intent)
            }
            else if(position==25)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","nebula")
                context.startActivity(intent)
            }
            else if(position==26)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","shuri")
                context.startActivity(intent)
            }
            else if(position==27)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","okaye")
                context.startActivity(intent)
            }
            else if(position==28)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","odin")
                context.startActivity(intent)
            }
            else if(position==29)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","minute")
                context.startActivity(intent)
            }
            else if(position==30)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","valk")
                context.startActivity(intent)
            }
            else if(position==31)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","antman")
                context.startActivity(intent)
            }
            else if(position==32)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","wasp")
                context.startActivity(intent)
            }
            else if(position==33)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","hamdell")
                context.startActivity(intent)
            }
            else if(position==34)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","happy")
                context.startActivity(intent)
            }
            else if(position==35) {
                val intent = Intent(context, CharacterActivity::class.java)
                intent.putExtra("characters", "yel")
                context.startActivity(intent)
            }
            else if(position==36)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","fury")
                context.startActivity(intent)
            }
            else if(position==37)
            {
                val intent=Intent(context,CharacterActivity::class.java)
                intent.putExtra("characters","egor")
                context.startActivity(intent)
            }
        }
        }
    override fun getItemCount(): Int {
       return userlist.size
    }
}