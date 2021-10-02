package e.josh.openday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Quiz2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_main2);

        Button buttonq2 = findViewById(R.id.true_button2);
        buttonq2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Quiz2.this, Quiz3.class);
                startActivity(intent);

            }
        });

        Button buttonSkip2 = findViewById(R.id.skip_button2);
        buttonSkip2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Quiz2.this, Quiz3.class);
                startActivity(intent);

            }
        });



    }
}
