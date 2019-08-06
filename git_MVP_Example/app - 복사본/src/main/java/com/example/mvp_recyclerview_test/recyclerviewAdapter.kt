package com.example.mvp_recyclerview_test

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

class recyclerviewAdapter(val context: Context) :
        RecyclerView.Adapter<RecyclerviewViewHolder>() {

    var arrayList: ArrayList<LastestFriends>? = null




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewViewHolder
            = RecyclerviewViewHolder(LayoutInflater.from(context).inflate(R.layout.item_lastest_friends, parent, false))



    override fun getItemCount() = arrayList?.size ?: 0
/*
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(arrayList[position], context)



    }
*/
    override fun onBindViewHolder(holder: RecyclerviewViewHolder, position: Int) {
        val item = arrayList?.get(position)

    holder?.textView_lastest_Friends_Country?.text = item?.country
    holder?.textView_lastest_Friends_Date?.text = item?.country
    holder?.textView_lastest_Friends_Name?.text = item?.country
    //holder?.textView_lastest_Friends_Send_Message?.text = item?.country

    holder?.imageView_lastest_Friends_Trash_Button?.setOnClickListener {//아이템 클릭 리스너
        Toast.makeText(context, "삭제버튼눌림", Toast.LENGTH_SHORT).show()
    }
    holder?.imageView_like_Button?.setOnClickListener {//아이템 클릭 리스너
        Toast.makeText(context, "좋아요버튼눌림", Toast.LENGTH_SHORT).show()
    }
    holder?.textView_lastest_Friends_Send_Message?.setOnClickListener {//아이템 클릭 리스너
        Toast.makeText(context, "메시지전송버튼 눌림", Toast.LENGTH_SHORT).show()
    }
    holder?.imageView_lastest_Friends_Image?.setOnClickListener {//아이템 클릭 리스너
        Toast.makeText(context, "작은프로필이미지 눌림", Toast.LENGTH_SHORT).show()
    }
    holder?.imageView_lastest_Friends_Big_Image?.setOnClickListener {//아이템 클릭 리스너
        Toast.makeText(context, "큰프로필이미지 눌림", Toast.LENGTH_SHORT).show()
    }





    holder?.itemView?.setOnClickListener {//아이템 클릭 리스너
            Toast.makeText(context, "Show ${item?.name}", Toast.LENGTH_SHORT).show()
        }
    }




}