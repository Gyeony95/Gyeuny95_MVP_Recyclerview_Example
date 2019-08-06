package com.example.mvp_recyclerview_test

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RecyclerviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    val imageView_lastest_Friends_Image by lazy {
        itemView.findViewById(R.id.lastest_Friends_Image) as ImageView
    }
    val imageView_lastest_Friends_Big_Image by lazy {
        itemView.findViewById(R.id.lastest_Friends_Big_Image) as ImageView
    }
    val imageView_like_Button by lazy {
        itemView.findViewById(R.id.like_Button) as ImageView
    }
    val imageView_lastest_Friends_Trash_Button by lazy {
        itemView.findViewById(R.id.lastest_Friends_Trash_Button) as ImageView
    }




    val textView_lastest_Friends_Name by lazy {
        itemView.findViewById(R.id.lastest_Friends_Name) as TextView
    }
    val textView_lastest_Friends_Country by lazy {
        itemView.findViewById(R.id.lastest_Friends_Country) as TextView
    }
    val textView_lastest_Friends_Date by lazy {
        itemView.findViewById(R.id.lastest_Friends_Date) as TextView
    }
    val textView_lastest_Friends_Send_Message by lazy {
        itemView.findViewById(R.id.lastest_Friends_Send_Message) as TextView
    }



}