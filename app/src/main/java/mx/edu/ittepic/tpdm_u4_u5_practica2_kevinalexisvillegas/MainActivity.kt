package mx.edu.ittepic.tpdm_u4_u5_practica2_kevinalexisvillegas

import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    var locationManager : LocationManager?=null
    var longitud:Double = 0.0
    var latitud: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
        getSupportActionBar()?.hide()

        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager?
        var oyenteGPS = OyenteGPS(this)

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //permiso denegado
            Toast.makeText(this,"Active el GPS.", Toast.LENGTH_LONG).show()
            return
        }
        //permiso aprobado
        locationManager?.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0f,oyenteGPS)

    }

}


