package com.example.mvp_recyclerview_test

import android.content.Context
import java.util.ArrayList

object RecyclerviewData {
    fun getSampleList(context: Context, size: Int) : ArrayList<LastestFriends> {
        val list = ArrayList<LastestFriends>()
        for (index in 0..size) {//입력받은 사이즈만큼 반복
            //val name = String.format("sample_%02d", (Math.random() * 15).toInt())//들어가는 네임 데이타
            //val resource = context.resources.getIdentifier(name, "drawable", context.packageName)
            var name:String = "name"
            var country:String = "country"
            var photo:String = "ic_default_profile"
            var big_photo:String = "ic_default_profile"
            var date:String = "date"
            list.add(LastestFriends(name, country, photo, big_photo, date))
        }
        return list
    }

}