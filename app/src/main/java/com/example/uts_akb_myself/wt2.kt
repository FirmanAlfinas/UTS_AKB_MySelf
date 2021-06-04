package com.example.uts_akb_myself
// Tanggal Pengerjaan   : Jumat, 04 juni 2021
// Nim                  : 10118904
// Nama                 : Firman Alfinas
// Kelas                : IF11K
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class wt2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.walkthrought2)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        Handler().postDelayed({

            val intent = Intent(this, wt3::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}