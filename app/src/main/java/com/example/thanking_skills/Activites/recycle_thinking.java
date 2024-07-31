package com.example.thanking_skills.Activites;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thanking_skills.Adopter.Recycle_Adapter1;
import com.example.thanking_skills.Model.Thinking_model;
import com.example.thanking_skills.R;

import java.util.ArrayList;
import java.util.List;

public class recycle_thinking extends AppCompatActivity {

    RecyclerView recyclerView;
    Recycle_Adapter1 recycle_adapter;

    List<Thinking_model> thinkingModelList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_thinking);

        recyclerView = findViewById(R.id.thinking_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initializeData();

        recycle_adapter = new Recycle_Adapter1(this, thinkingModelList);
        recyclerView.setAdapter(recycle_adapter);
    }

    private void initializeData() {
        thinkingModelList = new ArrayList<>();
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Content"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "What are Thinking Skills"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Positive Thinking"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Improve Your Memory"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Blocks of Thinking"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Logical Thinking"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Creative Thinking"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Brainstorming"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Decision Taking"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Problem Solving"));
        thinkingModelList.add(new Thinking_model(R.drawable.bulb, "Innovation"));
    }
}
