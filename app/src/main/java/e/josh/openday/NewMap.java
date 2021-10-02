package e.josh.openday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class NewMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage_main);
        WebView infoWeb = (WebView) findViewById(R.id.webExtraInfo);

        infoWeb.loadUrl("https://www.wlv.ac.uk/about-us/contacts-and-maps/all-maps-and-directions/map-and-directions-for-city-campus-wolverhampton/");

    }
}
