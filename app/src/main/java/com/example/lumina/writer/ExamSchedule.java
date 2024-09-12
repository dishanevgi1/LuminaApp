package com.example.lumina.writer;

public class ExamSchedule {
    private String subject;
    private String date;
    private String time;


    public ExamSchedule(String subject, String date, String time) {
        this.subject = subject;
        this.date = date;
        this.time = time;

    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}



