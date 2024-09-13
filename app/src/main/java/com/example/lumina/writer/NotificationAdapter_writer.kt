package com.example.lumina.writer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lumina.R;

import java.util.List;

public class NotificationAdapter_writer extends RecyclerView.Adapter<NotificationAdapter_writer.ViewHolder> {
    private List<notification_item_views_writer> notificationList;

    public NotificationAdapter_writer(List<notification_item_views_writer> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item_views_writer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        notification_item_views_writer notification = notificationList.get(position);
        holder.title.setText(notification.getTitle());
        holder.body.setText(notification.getBody());
        holder.time.setText(notification.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView body;
        public TextView time;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.notification_title);
            body = itemView.findViewById(R.id.notification_body);
            time = itemView.findViewById(R.id.notification_timestamp);
        }
    }
}
