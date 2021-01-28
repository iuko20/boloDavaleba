package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyvleview)

        val pictures = arrayListOf<Pictures>()

        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))
        pictures.add(Pictures(1, "სურათი 1", "https://wallpaperaccess.com/full/2409545.jpg"))
        pictures.add(Pictures(2, "სურათი 2", "https://s1.1zoom.me/b5050/813/Houses_Skyscrapers_Synthwave_by_Joey_Jazz_562750_1366x768.jpg"))
        pictures.add(Pictures(3,"სურათი 3", "https://images.wallpaperscraft.com/image/starry_sky_night_trees_night_landscape_118760_1366x768.jpg" ))
        pictures.add(Pictures(4, "სურათი 4", "https://www.itl.cat/pics/b/21/211196_1366x768-wallpaper.jpg"))


        val adapter = PicturesAdapter(pictures)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }
}