package com.example.lumina.vi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lumina.R

class NotificationAdapterVi(private val notificationList: List<NotificationItemViewsVi>) :
    RecyclerView.Adapter<NotificationAdapterVi.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notification_item_views_vi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val notification = notificationList[position]
        holder.title.text = notification.getTitle()
        holder.body.text = notification.getBody()
        holder.time.text = notification.getTimestamp()
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.notification_title)
        val body: TextView = itemView.findViewById(R.id.notification_body)
        val time: TextView = itemView.findViewById(R.id.notification_timestamp)
    }
}