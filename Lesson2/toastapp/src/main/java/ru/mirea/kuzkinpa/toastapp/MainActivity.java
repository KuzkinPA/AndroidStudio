package ru.mirea.kuzkinpa.toastapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edttxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edttxt = findViewById(R.id.editTextText);
    }
    public void onClickNewActivity(View view)
    {
        String text = edttxt.getText().toString();

        int charCount = text.length();
        int studentNumber = 16;
        String group = "БСБО-06-23";

        String message = "СТУДЕНТ № " + studentNumber + " ГРУППА " + group +
                " Количество символов - " + charCount;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}