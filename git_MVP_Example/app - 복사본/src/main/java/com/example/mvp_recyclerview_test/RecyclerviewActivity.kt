package com.example.mvp_recyclerview_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

import kotlinx.android.synthetic.main.activity_recyclerview.*
import java.util.ArrayList

class RecyclerviewActivity : AppCompatActivity(), RecyclerviewContract.View{

    private val recyclerView by lazy { //리사이클러뷰 선언
        findViewById(R.id.recyclerview) as RecyclerView
    }
    var mAdapter: recyclerviewAdapter? =null
    private lateinit var presenter: RecyclerviewPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        //프레센터 세팅
        presenter = RecyclerviewPresenter().apply {
            view = this@RecyclerviewActivity
            recyclerviewdata = RecyclerviewData
        }


        //어댑터 선언
        mAdapter = recyclerviewAdapter(this)
        recyclerview.adapter = mAdapter
        //레이아웃 매니저 선언
        val lm = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        recyclerview.layoutManager = lm
        recyclerview.setHasFixedSize(true)//아이템이 추가삭제될때 크기측면에서 오류 안나게 해줌


        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerview)


        //아이템 불러오기
        presenter.loadItems(this, false)


    }





    override fun updateItems(items: ArrayList<LastestFriends>, isClear: Boolean) {
        mAdapter?.apply {
            if (isClear) {
                arrayList?.clear()
            }
            arrayList = items
        }    }

    override fun notifyAdapter() {
        mAdapter?.notifyDataSetChanged()
    }











}
