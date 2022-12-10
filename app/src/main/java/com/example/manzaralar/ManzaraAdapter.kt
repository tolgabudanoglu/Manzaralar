package com.example.manzaralar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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

        var oanOlusturulanManzara = manzaralar.get(position)
        holder?.setData(oanOlusturulanManzara,position)

        /*holder?.manzaraBaslik?.text = manzaralar.get(position).baslik
        holder?.manzaraAciklama?.text = manzaralar.get(position).aciklama
        holder?.manzaraResim?.setImageResource(manzaralar.get(position).resim)

         */
    }

    override fun getItemCount(): Int {

        return manzaralar.size

    }


    class ManzaraViewHolder(itemView: View) : ViewHolder(itemView) {

        fun setData(oankiManzara:Manzara,position: Int) {

            manzaraBaslik.text = oankiManzara.baslik
            manzaraAciklama.text = oankiManzara.aciklama
            manzaraResim.setImageResource(oankiManzara.resim)

            btnKopyala.setOnClickListener{

            }
            btnSil.setOnClickListener{

            }


        }

        var tekSatir = itemView as CardView

        var manzaraBaslik=tekSatir.tvManzaraBaslik as TextView
        var manzaraAciklama=tekSatir.tvManzaraAciklama
        var manzaraResim=tekSatir.imgManzara
        var btnKopyala = tekSatir.imgCopy
        var btnSil = tekSatir.imgDel



    }






}