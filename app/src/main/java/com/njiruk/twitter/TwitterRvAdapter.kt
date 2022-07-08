package com.njiruk.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList: List<Twitter>) :
    RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweets_items_list, parent, false)
        return TweetViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet=twitterList.get(position)
        holder.tvname.text=currentTweet.username
        holder.tvhandle.text=currentTweet.handle
        holder.tvtweet.text=currentTweet.tweet
        holder.tvcomments.text=currentTweet.comments
        holder.tvretweet.text=currentTweet.retweet
        holder.tvlike.text=currentTweet.like

    }

    override fun getItemCount(): Int {
        return twitterList.size

    }
}

class TweetViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    var imgperson = itemView.findViewById<ImageView>(R.id.imgperson)
    var tvname = itemView.findViewById<TextView>(R.id.tvname)
    var tvhandle = itemView.findViewById<TextView>(R.id.tvhandle)
    var tvtweet = itemView.findViewById<TextView>(R.id.tvtweet)
    var tvcomments = itemView.findViewById<TextView>(R.id.tvcomments)
    var imgcomments = itemView.findViewById<ImageView>(R.id.imgcomments)
    var tvretweet = itemView.findViewById<TextView>(R.id.tvretweet2)
    var imglike = itemView.findViewById<ImageView>(R.id.imglike)
    var tvlike = itemView.findViewById<TextView>(R.id.tvlike)
    var imgretweet = itemView.findViewById<ImageView>(R.id.imgretweet)
    var imgshare = itemView.findViewById<ImageView>(R.id.imgshare)

}