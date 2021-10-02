package e.josh.openday;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProgramMain extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_main);

        Button button = (Button) findViewById(R.id.setEvent1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int time = 60;
                Toast.makeText(getApplicationContext(),"Reminder sent to 'My Events'",Toast.LENGTH_LONG).show();
                Intent i = new Intent(ProgramMain.this, Alarm.class);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                assert am != null;
                am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+time*1000,pi);

            }
        });

        Button button1 = (Button) findViewById(R.id.setEvent2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int time = 60;
                Toast.makeText(getApplicationContext(),"Reminder sent to 'My Events'",Toast.LENGTH_LONG).show();
                Intent i = new Intent(ProgramMain.this, Alarm.class);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                assert am != null;
                am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+time*1000,pi);
            }
        });

        Button button2 = (Button) findViewById(R.id.setEvent3);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int time = 60;
                Toast.makeText(getApplicationContext(),"Reminder sent to 'My Events'",Toast.LENGTH_LONG).show();
                Intent i = new Intent(ProgramMain.this, Alarm.class);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                assert am != null;
                am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+time*1000,pi);
            }
        });
        Button button3 = (Button) findViewById(R.id.setEvent4);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int time = 60;
                Toast.makeText(getApplicationContext(),"Reminder sent to 'My Events'",Toast.LENGTH_LONG).show();
                Intent i = new Intent(ProgramMain.this, Alarm.class);
                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                assert am != null;
                am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+time*1000,pi);
            }
        });

    }



}
