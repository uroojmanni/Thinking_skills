package com.example.thanking_skills.Adopter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thanking_skills.Activites.Html_Contents;
import com.example.thanking_skills.Activites.recycle_thinking;
import com.example.thanking_skills.Model.Thinking_model;
import com.example.thanking_skills.R;

import java.util.ArrayList;
import java.util.List;

public class Recycle_Adapter1 extends RecyclerView.Adapter<Recycle_Adapter1.ViewHolder> {


    Context context;

   List <Thinking_model> list;

    public Recycle_Adapter1(Context context, List<Thinking_model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_thinking, parent, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Thinking_model model = list.get(position);
        holder.textView.setText(model.getText1()); // Assuming there's a getText() method in Thinking_model
        holder.imageView.setImageResource(model.getImg());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Html_Contents.class);
                intent.putExtra("key",position);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView22);
            textView=itemView.findViewById(R.id.sample_text);
            cardView=itemView.findViewById(R.id.samplecard);




        }
    }
}
