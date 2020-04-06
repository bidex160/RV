package com.example.rv

import android.content.Context
import android.net.sip.SipSession
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class recycleviewadapter (val context: Context, val listitem:List<dataitem>, val listener: (dataitem) -> Unit) : RecyclerView.Adapter<recycleviewadapter.Viewholder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.recyclelayout , parent, false)
        return Viewholder(view)
    }

    override fun getItemCount() = listitem.size


    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.bind (listitem[position], listener)

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    class Viewholder(itemView:View) : RecyclerView.ViewHolder (itemView){
        val name : TextView = itemView.findViewById(R.id.View1)
        val img : ImageView = itemView.findViewById(R.id.image1)

        fun bind (dataitem: dataitem, listener: (dataitem) -> Unit){
            name.text = dataitem.name
            img.setImageResource(dataitem.imgurl)
            img.setOnClickListener(View.OnClickListener {
            listener (dataitem)

                //Toast.makeText(itemView.context, dataitem.name, Toast.LENGTH_LONG).show()
            })

        }

    }

}






