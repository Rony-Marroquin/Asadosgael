package sv.edu.udb.gasados

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import sv.edu.udb.gasados.databinding.ActivityMainBinding
import java.util.Objects
import java.util.TimerTask
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import sv.edu.udb.gasados.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

           //startActivity()


       val edt1 =findViewById<EditText>(R.id.edt1)
        val edt2 =findViewById<EditText>(R.id.edt2)
        val boton1=findViewById<Button>(R.id.agregar1)
        val boton2=findViewById<Button>(R.id.agregar2)





        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,R.id.navigation_historial
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

  /* fun starTimer(){
        object : CountDownTimer(2000,1000) {
            override fun onTick(p0: Long) {
                TODO("Not yet implemented")
            }

            override fun onFinish() {
                TODO("Not yet implemented")

                val intent= Intent(applicationContext,ActivityMainBinding::class.java).apply {  }
                startActivity(intent)}
                }



        }

*/



}
