package com.example.manzaralar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.tek_satir.view.*


class ManzaraAdapter(tumManzaralar:ArrayList<Manzara>): RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var manzaralar=tumManzaralar



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManzaraViewHolder {

        var inflater = LayoutInflater.from(parent?.context)
        var tekSatir=inflater.inflate(R.layout.tek_satir,parent,false)

        return ManzaraViewHolder(tekSatir)


    }

    override fun onBindViewHolder(holder: ManzaraViewHolder, position: Int) {

        holder?.manzaraBaslik?.text = manzaralar.get(position).baslik
        holder?.manzaraAciklama?.text = manzaralar.get(position).aciklama
        holder?.manzaraResim?.setImageResource(manzaralar.get(position).resim)
    }

    override fun getItemCount(): Int {

        return manzaralar.size

    }


    class ManzaraViewHolder(itemView: View) : ViewHolder(itemView) {

        var tekSatir = itemView as CardView

        var manzaraBaslik=tekSatir.tvManzaraBaslik
        var manzaraAciklama=tekSatir.tvManzaraAciklama
        var manzaraResim=tekSatir.imgManzara

    }






}