package com.example.lumina.vi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lumina.R;

import java.util.List;

    public class NotificationAdapter_vi extends RecyclerView.Adapter<NotificationAdapter_vi.ViewHolder> {
        private List<notification_item_views_vi> notificationList;

        public NotificationAdapter_vi(List<notification_item_views_vi> notificationList) {
            this.notificationList = notificationList;
        }

        @NonNull
        @Override
        public NotificationAdapter_vi.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item_views_vi, parent, false);
            return new NotificationAdapter_vi.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(NotificationAdapter_vi.ViewHolder holder, int position) {
            notification_item_views_vi notification = notificationList.get(position);
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


