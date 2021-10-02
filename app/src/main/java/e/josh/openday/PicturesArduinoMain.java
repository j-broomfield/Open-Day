package e.josh.openday;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class PicturesArduinoMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pictures_main);
        WebView qrWeb = (WebView) findViewById(R.id.arduinoWeb);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode9.php");

    }
}
