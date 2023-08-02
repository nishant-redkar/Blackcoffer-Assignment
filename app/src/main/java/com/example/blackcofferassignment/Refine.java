package com.example.blackcofferassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

public class Refine extends AppCompatActivity {

    private Slider seekBarRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        Spinner spinner = findViewById(R.id.spinnerAvailability);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.availability_items,
                R.layout.spinner_item_layout);

        adapter.setDropDownViewResource(R.layout.spinner_item_layout);
        spinner.setAdapter(adapter);

        seekBarRange = findViewById(R.id.seekBarRange);
        Button btnSave = findViewById(R.id.save);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCategoryButtonColor(button8);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Refine.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Refine");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void toggleCategoryButtonColor(Button button) {
        int[] stateSet = {android.R.attr.state_checked};
        ColorStateList colorStateList =
                ContextCompat.getColorStateList(this, R.color.button_selected_color);

        if (button.isSelected()) {
            button.setSelected(false);
            button.setTextColor(getResources().getColor(R.color.button_selected_color));
            ViewCompat.setBackgroundTintList(button, colorStateList);
        } else {
            button.setSelected(true);
            button.setTextColor(Color.WHITE);
            ViewCompat.setBackgroundTintList(button, colorStateList);
        }
    }


}
