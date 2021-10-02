package e.josh.openday;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView textOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.putExtra("SCAN_MODE", "QR_CODE_MODE"); // "PRODUCT_MODE for bar codes

                    startActivityForResult(intent, 0);

                } catch (Exception e) {

                    Uri marketUri = Uri.parse("http://mi-linux.wlv.ac.uk/~1602487/DownloadPage.html");
                    Intent marketIntent = new Intent(Intent.ACTION_VIEW,marketUri);
                    startActivity(marketIntent);

                }

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    String qrResult = "j";
    String one = "one";
    String two = "two";
    String three = "three";
    String four = "four";
    String five = "five";
    String six = "6";
    String seven = "7";
    String eight = "8";
    String nine = "9";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Context context = getApplicationContext();
        CharSequence text = "QR code not recognized. Please try again ";
        int duration = Toast.LENGTH_LONG;


        if (requestCode == 0) {

            if (resultCode == RESULT_OK) {
                qrResult = data.getStringExtra("SCAN_RESULT");

            }
            if(resultCode == RESULT_CANCELED){
                //handle cancel
            }

        }
        //compare qrcode result and then take to designated class *Joshua Broomfield*
        if (qrResult.equals(one)){
            Intent intent = new Intent(MainActivity.this, CourseOne.class);
            startActivity(intent);

        }
        else if (qrResult.equals(two)){
            Intent intent = new Intent(MainActivity.this, CourseTwo.class);
            startActivity(intent);


        }
        else if (qrResult.equals(three)){
            Intent intent = new Intent(MainActivity.this, CourseThree.class);
            startActivity(intent);


        }
        else if (qrResult.equals(four)){
            Intent intent = new Intent(MainActivity.this, CourseFour.class);
            startActivity(intent);

        }
        else if (qrResult.equals(five)){
            Intent intent = new Intent(MainActivity.this, CourseFive.class);
            startActivity(intent);

        }
        else if (qrResult.equals(six)){
            Intent intent = new Intent(MainActivity.this, TotalAtt.class);
            startActivity(intent);



        }
        else if (qrResult.equals(seven)){
            Intent intent = new Intent(MainActivity.this, FeedbackPage.class);
            startActivity(intent);

        }
        else if (qrResult.equals(eight)){
            Intent intent = new Intent(MainActivity.this, VideoOpendeckMain.class);
            startActivity(intent);


        }
        else if (qrResult.equals(nine)){
            Intent intent = new Intent(MainActivity.this, PicturesArduinoMain.class);
            startActivity(intent);

        }
        else {
            Toast.makeText(context, text, duration).show();

        }
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_welcome) {


        } else if (id == R.id.nav_program) {
            Intent intent = new Intent(MainActivity.this, ProgramMain.class);
            startActivity(intent);

        } else if (id == R.id.nav_events) {
            Intent intent = new Intent(MainActivity.this, MyEventsMain.class);
            startActivity(intent);


        } else if (id == R.id.nav_map) {
            //Calls the MapsActivity on button press * Jordan Mahoney*
            Intent intent = new Intent(MainActivity.this, NewMap.class);
            startActivity(intent);

        } else if (id == R.id.nav_course) {
            Intent intent = new Intent(MainActivity.this, CourseSelection.class);
            startActivity(intent);

        } else if (id == R.id.nav_feedback) {
            Intent intent = new Intent(MainActivity.this, FeedbackPage.class);
            startActivity(intent);

        } else if (id == R.id.nav_faq) {
            Intent intent = new Intent(MainActivity.this, FAQ_activity.class);
            startActivity(intent);


        } else if (id == R.id.nav_quiz) {
            Intent intent = new Intent(MainActivity.this, Quiz1.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);


        return true;
    }
}
