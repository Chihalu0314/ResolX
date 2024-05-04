package xyz.cotoha.program.qa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PrecautionAdapter extends RecyclerView.Adapter<PrecautionAdapter.ViewHolder> {
    private List<Precaution> precautionList;
    private Context context;
    private Class[] activityClasses = {Precaution1Activity.class};

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView questionView;
        public TextView answerView;

        public ViewHolder(View v) {
            super(v);
            questionView = v.findViewById(R.id.question);
            answerView = v.findViewById(R.id.answer);
        }
    }

    public PrecautionAdapter(List<Precaution> precautionList, Context context) {
        this.precautionList = precautionList;
        this.context = context;
    }

    @Override
    public PrecautionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.qanda_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Precaution precaution = precautionList.get(position);
        holder.questionView.setText(precaution.getQuestion());
        holder.answerView.setText(precaution.getAnswer());

        holder.questionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                int pos = holder.getAdapterPosition();
                if (pos != RecyclerView.NO_POSITION && pos < activityClasses.length) {
                    intent = new Intent(context, activityClasses[pos]);
                } else {
                    intent = new Intent(context, DefaultActivity.class);
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return precautionList.size();
    }
}