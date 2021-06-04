package com.example.uts_akb_myself
// Tanggal Pengerjaan   : Jumat, 04 juni 2021
// Nim                  : 10118904
// Nama                 : Firman Alfinas
// Kelas                : IF11K
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment = Fragment_Home()
    private val dailyFragment = Fragment_Daily()
    private val galleryFragment = Fragment_Gallery()
    private val favFragment = Fragment_Fav()
    private val profileFragment = Fragment_Profile()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(homeFragment)
                R.id.daily -> replaceFragment(dailyFragment)
                R.id.gallery -> replaceFragment(galleryFragment)
                R.id.fav -> replaceFragment(favFragment)
                R.id.profile -> replaceFragment(profileFragment)
            }
            true
        }
    }
    private fun replaceFragment(fragment : Fragment) {
        if(fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.flFragment, fragment)
            transaction.commit()
        }
    }
}