package e.josh.openday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MyEventsMain extends AppCompatActivity {


    public static Button cancel ;
    public static TextView txt1 ;
    public static TextView txt2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_event_main);

        cancel = (Button) findViewById(R.id.cancelEvent);
        txt1 = (TextView) findViewById(R.id.textmyevent1);
        txt2 = (TextView) findViewById(R.id.textmyeven2);

    }
}
