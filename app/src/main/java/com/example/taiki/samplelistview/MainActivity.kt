package com.example.taiki.samplelistview

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: Bitmap
        image = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)

        val objects = ArrayList<CustomData>()

        val item1 = CustomData()
        item1.setImagaData(image)
        item1.textData = "1つめだぞ〜"

        val item2 = CustomData()
        item2.setImagaData(image)
        item2.textData = "2つめだぞ〜"

        val item3 = CustomData()
        item3.setImagaData(image)
        item3.textData = "3つめだぞ〜"
        
        objects.add(item1)
        objects.add(item2)
        objects.add(item3)

        val customAdapater = MyArrayAdapter(this,0,objects)
        val listView = findViewById(R.id.listView) as ListView
        listView.adapter = customAdapater

    }
}
