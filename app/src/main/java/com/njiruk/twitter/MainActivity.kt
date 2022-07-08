package com.njiruk.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.njiruk.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tweet()
    }
    fun tweet(){
        var tweet = Twitter("","Juma Jacobs","j.juma","am a boy am a girl am female","","50","","","","","")
        var tweet1 = Twitter("","Renee Jacobs","r.riri","am a boy am a girl am female am male","","100","","","45","356","")
        var tweet2 = Twitter("","whitini wanji","mellon ","am a boy am a girl am female am male","","59","","","98","46","")
        var tweet3 = Twitter("","shosh wanji","shosh mollo","am a boy am a girl am female am male","","45","","","567","467","")
        var tweet4 = Twitter("","minajo re","sakinah minajo","am a boy am a girl am female am male","","45","","","76","345","")
        var tweet5 = Twitter("","joy wamaitha","j.wamaitha","am a boy am a girl am female am male","","87","","","7656","547","")






        var twitterlist = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)
        var twitor = TwitterRvAdapter(twitterlist)
        binding.rvrecycle.layoutManager=LinearLayoutManager(this)
        binding.rvrecycle.adapter=twitor
    }
}