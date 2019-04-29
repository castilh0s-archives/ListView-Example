package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listViewMovies;
    private MoviesRepository moviesRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesRepository = new MoviesRepository();
        listViewMovies = findViewById(R.id.listViewMovies);

        ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                moviesRepository.getAll()
        );

        listViewMovies.setAdapter(arrayAdapter);
        listViewMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie movie = moviesRepository.get(position);

                Toast.makeText(
                        getApplicationContext(),
                        movie.toString(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
