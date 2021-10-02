package e.josh.openday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class CourseFiveWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage_main);
        WebView infoWeb = (WebView) findViewById(R.id.webExtraInfo);

        infoWeb.loadUrl("https://courses.wlv.ac.uk/course.asp?code=CS016H31UVD");

    }
}
