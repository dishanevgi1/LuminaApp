package com.example.lumina.admin;

import android.app.Activity;

public class notification_item_views_admin extends Activity {
    private String title;
    private String body;
    private String timestamp;

    public notification_item_views_admin(String title, String body, String timestamp) {
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
    }

    public String get_Title() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getTimestamp() {
        return timestamp;
    }
}


