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

public class CourseFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_four_main);
        WebView qrWeb = (WebView) findViewById(R.id.webCourse4);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode4.php");

        VideoView myVideoView = (VideoView)findViewById(R.id.videoView4);
        myVideoView.setVideoPath("https://mi-linux.wlv.ac.uk/~1602487/Gamedev.mp4");
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();

        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        Button buttonWeb1 = findViewById(R.id.buttonCourse4Info);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(CourseFour.this, CourseFourWeb.class);
                startActivity(intent);

            }
        });
    }

}
