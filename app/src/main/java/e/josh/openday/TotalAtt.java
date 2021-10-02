package e.josh.openday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

public class TotalAtt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_att_main);
        WebView qrWeb = (WebView) findViewById(R.id.webWelcome);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode6.php");

        Intent intent = new Intent(TotalAtt.this, MainActivity.class);
        startActivity(intent);


    }
}
