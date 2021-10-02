package e.josh.openday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Quiz1 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_main1);

        Button buttonq1 = findViewById(R.id.false_button1);
            buttonq1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent = new Intent(Quiz1.this, Quiz2.class);
                    startActivity(intent);

                }
            });

            Button buttonSkip1 = findViewById(R.id.skip_button1);
            buttonSkip1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent = new Intent(Quiz1.this, Quiz2.class);
                    startActivity(intent);

                }
            });

        }
}
