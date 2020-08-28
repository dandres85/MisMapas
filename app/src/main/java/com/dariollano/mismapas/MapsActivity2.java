package com.dariollano.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng chorro = new LatLng(4.597227828107672,-74.06973152368562);
        mMap.addMarker(new MarkerOptions().position(chorro).title("Marker in chorro"));

        LatLng maloka = new LatLng(4.664029784827444,-74.09593121664997);
        mMap.addMarker(new MarkerOptions().position(maloka).title("Marker in maloka"));

        LatLng plaza = new LatLng(4.59798498559017,-74.07607493111068);
        mMap.addMarker(new MarkerOptions().position(plaza).title("Marker in plaza de bolivar"));

        LatLng monserrate = new LatLng(4.6055650702991775,-74.05554203483109);
        mMap.addMarker(new MarkerOptions().position(monserrate).title("Marker in monserrate"));

        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(maloka, 16));
    }
}