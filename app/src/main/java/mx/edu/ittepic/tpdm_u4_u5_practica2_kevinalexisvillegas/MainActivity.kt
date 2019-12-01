package mx.edu.ittepic.tpdm_u4_u5_practica2_kevinalexisvillegas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))
        getSupportActionBar()?.hide()
    }
}
