package com.example.convergecodelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout detailsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailsView = (RelativeLayout) findViewById(R.id.detailsView);

        detailsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewDetails();
            }
        });
    }

    /*Launch DetailActivity to view user profile*/
    public void viewDetails(){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

}
