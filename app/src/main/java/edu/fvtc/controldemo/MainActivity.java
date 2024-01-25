package edu.fvtc.controldemo;

// using = import
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// In java, "extends" is used for inheritance
public class MainActivity extends AppCompatActivity {
    public static final String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // super class = base class
        super.onCreate(savedInstanceState);
        // Make an activity from the xml
        setContentView(R.layout.activity_main);
                    // R = res folder
        initButton();
    }

    private void initButton(){
        // Get the xml control.
        // View = xml file | Controller =
        Button btnShowMessage  = findViewById(R.id.btnShowMessage); // Go get "something" by id.
        // All objects like buttons, labels, forms, etc, are "views."

        // Write the clock handler
        btnShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: Carlos was here");

                /*
                * Logs are used to display messages when debugging.
                * Types of logs:
                * log d = debugging
                * log e = emergency
                * log i = information
                * log w = warning
                * */

                // Change the text of the texView
                TextView tvInfo = findViewById(R.id.tvText);
                tvInfo.setText("Hello");



            }
        });


    }


}