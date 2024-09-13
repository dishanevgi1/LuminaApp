package com.example.lumina.writer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lumina.R;

import java.util.List;

public class ExamScheduleAdapter extends RecyclerView.Adapter<ExamScheduleAdapter.ExamScheduleViewHolder> {

    private List<ExamSchedule> examScheduleList;

    public ExamScheduleAdapter(List<ExamSchedule> examScheduleList) {
        this.examScheduleList = examScheduleList;
    }

    @NonNull
    @Override
    public ExamScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_exam_schedule_writer, parent, false);
        return new ExamScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExamScheduleViewHolder holder, int position) {
        ExamSchedule examSchedule = examScheduleList.get(position);
        holder.subjectTextView.setText(examSchedule.getSubject());
        holder.dateTextView.setText(examSchedule.getDate());
        holder.timeTextView.setText(examSchedule.getTime());
    }

    @Override
    public int getItemCount() {
        return examScheduleList.size();
    }

    static class ExamScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView subjectTextView;
        TextView dateTextView;
        TextView timeTextView;

        public ExamScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectTextView = itemView.findViewById(R.id.subjectTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
        }
    }
}


