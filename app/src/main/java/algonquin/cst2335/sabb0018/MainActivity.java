package algonquin.cst2335.sabb0018;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override // this starts the application. this is the main function.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this loads buttons /text on screen
        // function name (parameters)
        setContentView(R.layout.activity_main);
                // R means res
                // layout means folder.
                // activity_main means the file
    }
}