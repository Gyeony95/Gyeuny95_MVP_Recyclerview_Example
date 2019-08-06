package com.example.mvp_recyclerview_test

import android.content.Context
import java.util.ArrayList

interface RecyclerviewContract {
    interface View {

        fun updateItems(items: ArrayList<LastestFriends>, isClear: Boolean)

        fun notifyAdapter()
    }

    interface Presenter {
        var view: View//프레센터에 왜 뷰가..?
        var recyclerviewdata: RecyclerviewData

        fun loadItems(context: Context, isClear: Boolean)
    }
}