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

       // Toast.makeText(this,"Bienvenido a Asados gael",Toast.LENGTH_LONG).show()




     /*  val edt1 = findViewById<EditText>(R.id.edt1)
        val edt2 = findViewById<EditText>(R.id.edt2)
        val edt3 = findViewById<EditText>(R.id.edt3)
        val edt4 = findViewById<EditText>(R.id.edt4)
        val edt5 = findViewById<EditText>(R.id.edt5)
        val edt6 = findViewById<EditText>(R.id.edt6)
        val edt7 = findViewById<EditText>(R.id.edt7)
        val edt8 = findViewById<EditText>(R.id.edt8)
        val edt9 = findViewById<EditText>(R.id.edt9)
        val edt10 = findViewById<EditText>(R.id.edt10)
        val agregar1 = findViewById<Button>(R.id.agregar1)
        val agregar2 = findViewById<Button>(R.id.agregar2)
        val agregar3 = findViewById<Button>(R.id.agregar3)
        val agregar4 = findViewById<Button>(R.id.agregar4)
        val agregar5 = findViewById<Button>(R.id.agregar5)
        val agregar6 = findViewById<Button>(R.id.agregar6)
        val agregar7 = findViewById<Button>(R.id.agregar7)
        val agregar8 = findViewById<Button>(R.id.agregar8)
        val agregar9 = findViewById<Button>(R.id.agregar9)
        val agregar10 = findViewById<Button>(R.id.agregar10)
        val cancelar1 = findViewById<Button>(R.id.cancelar1)
        val cancelar2 = findViewById<Button>(R.id.cancelar2)
        val cancelar3 = findViewById<Button>(R.id.cancelar3)
        val cancelar4 = findViewById<Button>(R.id.cancelar4)
        val cancelar5 = findViewById<Button>(R.id.cancelar5)
        val cancelar6 = findViewById<Button>(R.id.cancelar6)
        val cancelar7 = findViewById<Button>(R.id.cancelar7)
        val cancelar8 = findViewById<Button>(R.id.cancelar8)
        val cancelar9 = findViewById<Button>(R.id.cancelar9)
        val cancelar10 = findViewById<Button>(R.id.cancelar10)
        */






        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications,
                R.id.navigation_historial
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

       /* agregar1.setOnClickListener {
            val edt1 = findViewById<EditText>(R.id.edt1)
            val cantidad = edt1.text.toString().toInt()
            val total = cantidad * 5.80


        }*/

     /*   fun starTimer() {
            object : CountDownTimer(2000, 1000) {
                override fun onTick(p0: Long) {
                    TODO("Not yet implemented")
                }

                override fun onFinish() {
                    TODO("Not yet implemented")

                    val intent =
                        Intent(applicationContext, ActivityMainBinding::class.java).apply { }
                    startActivity(intent)

                    startActivity(intent)
                }
                */

            }


        }




