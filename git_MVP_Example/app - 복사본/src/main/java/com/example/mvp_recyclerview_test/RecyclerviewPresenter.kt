package com.example.mvp_recyclerview_test

import android.content.Context

class RecyclerviewPresenter:RecyclerviewContract.Presenter {
    lateinit override var view: RecyclerviewContract.View

    lateinit override var recyclerviewdata: RecyclerviewData


    override fun loadItems(context: Context, isClear: Boolean) {
        recyclerviewdata.getSampleList(context, 10).let {//권한과 크기를 입력
            view.updateItems(it, isClear)//뷰를 업데이트 시키는 부분
            view.notifyAdapter()//뷰 새로고침
        }
    }
}