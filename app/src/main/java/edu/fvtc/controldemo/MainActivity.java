
package edu.fvtc.controldemo;

// using = import
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


// In java, "extends" is used for inheritance
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // super class = base class
        super.onCreate(savedInstanceState);
        // Make an activity from the xml
        setContentView(R.layout.activity_main);
                    // R = res folder
    }
}