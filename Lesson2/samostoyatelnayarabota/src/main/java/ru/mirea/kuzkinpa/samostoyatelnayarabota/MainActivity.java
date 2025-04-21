package ru.mirea.kuzkinpa.samostoyatelnayarabota;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_time).setOnClickListener(v ->
                new MyTimeDialogFragment().show(getSupportFragmentManager(), "timePicker"));

        findViewById(R.id.btn_date).setOnClickListener(v ->
                new MyDateDialogFragment().show(getSupportFragmentManager(), "datePicker"));

        findViewById(R.id.btn_progress).setOnClickListener(v ->
                new MyProgressDialogFragment().show(getSupportFragmentManager(), "progressDialog"));

        findViewById(R.id.btn_snackbar).setOnClickListener(v ->
                Snackbar.make(v, "Это - Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", view ->
                                Toast.makeText(this, "Action clicked", Toast.LENGTH_SHORT).show())
                        .show());
    }
}
