package e.josh.openday;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    //sets map to wolverhampton on open
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng wlv = new LatLng(52.5878531852, -2.1272893411);
        mMap.addMarker(new MarkerOptions().position(wlv).title("Wolverhampton"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wlv, 17.0f));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Calls the Main on button press * Jordan Mahoney*
        Intent intent = new Intent(MapsActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
