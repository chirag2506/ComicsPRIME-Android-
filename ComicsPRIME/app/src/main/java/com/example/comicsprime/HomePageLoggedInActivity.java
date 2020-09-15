package com.example.comicsprime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomePageLoggedInActivity extends AppCompatActivity {

    private static final String TAG = "HomePageLoggedInActivity";

    FloatingActionButton addComicButton;
    androidx.appcompat.widget.Toolbar toolbar;
    EditText searchEditText;
    ImageButton searchButton;
    RecyclerView comicListView;



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeloggedin_page);

        searchEditText = (EditText) findViewById(R.id.search_bar);
        searchButton = (ImageButton) findViewById(R.id.search_btn);
        comicListView = (RecyclerView) findViewById(R.id.comic_recyclerView);




        //TOOLBAR
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("My Comics"); //SETTING OTHER TITLE
        setSupportActionBar(toolbar);

        //GET DATA
        Bundle bundle = getIntent().getExtras();
        final String username_1 = bundle.getString("username");

        //EDITS

        addComicButton = (FloatingActionButton) findViewById(R.id.addComic);

        addComicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(getApplicationContext(), AddComicsActivity.class);

                //PASS DATA
                s.putExtra("username_1", username_1);

                startActivity(s);
            }
        });

    }

}
