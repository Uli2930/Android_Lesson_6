package com.geeks.android_lesson_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonOne = findViewById(R.id.button_one);
        CardView cardView = findViewById(R.id.card_view);


        buttonOne.setOnClickListener(view -> {
            if (cardView.getAlpha() == 1){
                cardView.animate().alpha(0);

            } else {
                cardView.animate().alpha(1);

            }

        });

        LinearLayout container = findViewById(R.id.container);

        findViewById(R.id.big_button).setOnClickListener(view -> {
            if (container.getVisibility() == View.GONE){
                container.setVisibility(View.VISIBLE);
            }else {
                container.setVisibility(View.GONE);
            }
        });
        EditText editText =findViewById(R.id.edit_text);
        findViewById(R.id.btn_circle).setOnClickListener(view -> {
            View parentLayout = findViewById(android.R.id.content);
            Snackbar.make(parentLayout, editText.getText(), Snackbar.LENGTH_LONG)
                    .setAction("Закрыть", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setActionTextColor(ContextCompat.getColor(this,
                            R.color.violet))
                    .show();

        });




    }
}