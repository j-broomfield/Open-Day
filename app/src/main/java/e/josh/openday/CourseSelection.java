package e.josh.openday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CourseSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_selection_main);

        final Button buttonC1 = findViewById(R.id.buttonC1);
        final Button buttonC2 = findViewById(R.id.buttonC2);
        final Button buttonC3 = findViewById(R.id.buttonC3);
        final Button buttonC4 = findViewById(R.id.buttonC4);
        final Button buttonC5 = findViewById(R.id.buttonC5);

        buttonC1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseSelection.this, CourseOne.class);
                startActivity(intent);

            }
        });
        buttonC2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseSelection.this, CourseTwo.class);
                startActivity(intent);

            }
        });
        buttonC3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseSelection.this, CourseThree.class);
                startActivity(intent);

            }
        });
        buttonC4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseSelection.this, CourseFour.class);
                startActivity(intent);

            }
        });
        buttonC5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseSelection.this, CourseFive.class);
                startActivity(intent);

            }
        });


    }


}
