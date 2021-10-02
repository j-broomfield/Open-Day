package e.josh.openday;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class FeedbackPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_main);
        WebView fbWeb = (WebView) findViewById(R.id.webFeedback);
        fbWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/Feedback.php");
        WebView qrWeb = (WebView) findViewById(R.id.fbWebCounter);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode7.php");


    }

}