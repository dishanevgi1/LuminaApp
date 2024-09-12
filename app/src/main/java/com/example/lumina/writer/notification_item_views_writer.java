package com.example.lumina.writer;

import android.app.Activity;

public class notification_item_views_writer extends Activity {
    private String title;
    private String body;
    private String timestamp;

    public notification_item_views_writer(String title, String body, String timestamp) {
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


