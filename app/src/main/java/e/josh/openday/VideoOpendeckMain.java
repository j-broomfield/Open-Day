package e.josh.openday;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoOpendeckMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player_main);
        WebView qrWeb = (WebView) findViewById(R.id.VideoWeb);
        qrWeb.loadUrl("http://mi-linux.wlv.ac.uk/~1602487/qrCode8.php");

        VideoView myVideoView = (VideoView)findViewById(R.id.videoViewMain);
        myVideoView.setVideoPath("https://mi-linux.wlv.ac.uk/~1602487/OpenDeckVid.mp4");
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();

        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
