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

public class CourseOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_one_main);
        WebView qrWeb = (WebView) findViewById(R.id.webCourse1);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode1.php");

        VideoView myVideoView = (VideoView)findViewById(R.id.videoView1);
        myVideoView.setVideoPath("https://mi-linux.wlv.ac.uk/~1602487/Computer_science.mp4");
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();

        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


        Button buttonWeb1 = findViewById(R.id.buttonCourse1Info);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseOne.this, CourseOneWeb.class);
                startActivity(intent);

            }
        });

    }

}
