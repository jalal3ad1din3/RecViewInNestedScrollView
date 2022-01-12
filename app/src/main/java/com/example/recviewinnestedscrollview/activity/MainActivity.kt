package com.example.recviewinnestedscrollview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewinnestedscrollview.R
import com.example.recviewinnestedscrollview.adapter.CustomAdapter
import com.example.recviewinnestedscrollview.modul.Member
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        val members = prapareMemberList()
        refreshAdapter(members)

    }
    fun initViews(){
        recyclerView.layoutManager = GridLayoutManager(this,1)
        recyclerView.isNestedScrollingEnabled = false
    }
fun prapareMemberList():List<Member>{

    val members =ArrayList<Member>()
    for (i in 0..5){
        members.add(Member("Salom"))
    }
return members
}

   fun refreshAdapter(member: List<Member>){
       val adapter = CustomAdapter(member)
       recyclerView.adapter = adapter
   }
}