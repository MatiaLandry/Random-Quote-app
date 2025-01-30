package com.example.randomquoteapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textViewQuote;
    private Button buttonGenerate;
    private ArrayList<String> quotes;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        textViewQuote = findViewById(R.id.quote_txt);
        buttonGenerate = findViewById(R.id.gen_button);

        // Initialize quotes list
        quotes = new ArrayList<>();
        quotes.add("The best way to predict the future is to invent it. – Alan Kay");
        quotes.add("Code is like humor. When you have to explain it, it’s bad. – Cory House");
        quotes.add("Simplicity is the soul of efficiency. – Austin Freeman");
        quotes.add("First, solve the problem. Then, write the code. – John Johnson");
        quotes.add("Experience is the name everyone gives to their mistakes. – Oscar Wilde");

        random = new Random();

        // Set button click listener
        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRandomQuote();
            }
        });
    }

    public void generateRandomQuote(){
        int index = random.nextInt(quotes.size());
        String randomQuote = quotes.get(index);
        textViewQuote.setText(randomQuote);

    }

}
