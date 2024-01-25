package edu.fvtc.controldemo;

// using = import
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        initTextChangeEvent();
    }

    private void initTextChangeEvent(){
        EditText etInfo = findViewById(R.id.etInput);

        etInfo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "beforeTextChanged: ");

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "onTextChanged: ");
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "afterTextChanged: ");
                TextView tvInfo = findViewById(R.id.tvText);
                tvInfo.setText(etInfo.getText());
            }
        });
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
                EditText etInfo = findViewById(R.id.etInput);
                String message = etInfo.getText().toString();

                TextView tvInfo = findViewById(R.id.tvText);
                tvInfo.setText(message);

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }
        });


    }


}