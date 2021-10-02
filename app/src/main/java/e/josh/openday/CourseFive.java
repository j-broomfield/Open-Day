package e.josh.openday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class CourseFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_five_main);
        WebView qrWeb = (WebView) findViewById(R.id.webCourse5);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode5.php");

        VideoView myVideoView = (VideoView)findViewById(R.id.videoView5);
        myVideoView.setVideoPath("https://mi-linux.wlv.ac.uk/~1602487/Datascience.mp4");
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();

        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        Button buttonWeb1 = findViewById(R.id.buttonCourse5Info);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseFive.this, CourseFiveWeb.class);
                startActivity(intent);

            }
        });
    }

}
