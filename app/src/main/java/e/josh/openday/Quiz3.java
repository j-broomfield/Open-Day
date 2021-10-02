package e.josh.openday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_main3);



        Button buttonq3 = findViewById(R.id.false_button3);
        buttonq3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you for completing the quiz",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Quiz3.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Button buttonSkip3 = findViewById(R.id.skip_button3);
        buttonSkip3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you for completing the quiz",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Quiz3.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }
}
