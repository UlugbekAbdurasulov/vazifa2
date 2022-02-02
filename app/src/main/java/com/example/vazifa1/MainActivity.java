package com.example.vazifa1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        List<Member> members = prepareMemerList();
        refreshAdaper(members);
    }
    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }
    private void refreshAdaper(List<Member> members) {
        CustomAdapter adaper = new CustomAdapter(context, members);
        recyclerView.setAdapter(adaper);
    }
    private List<Member> prepareMemerList() {
        List<Member> members = new ArrayList<>();

        for (int i = 0; i<10; i++){
            members.add(new Member("Abdurasulov" + i, "Ulugbek" + i, getDrawable(R.drawable.car1) ));
            if (i == 9){
                for (int y = 0; y<10; y++) {
                    members.add(new Member("Abdurasulov" + y, "Abdurasulov" + y, getDrawable(R.drawable.car1)));
                }
            }

        }


        return members;
    }


}