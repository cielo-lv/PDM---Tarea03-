package interfazusuarioandroid.example.computerscienceculture

import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.Toast
import android.view.MenuItem
import androidx.core.view.GravityCompat


class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Interface login:
        setContentView(R.layout.activity_main);

        // Interface dashboard inicial:
    //    setContentView(R.layout.start_dashboard);

        // Interface dashboard de ciberhistoria:
    //    setContentView(R.layout.history_dashboard)

        // enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawerLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext, "Click en Home", Toast.LENGTH_SHORT).show()
                R.id.nav_ciberhistoria -> Toast.makeText(applicationContext, "Click en Ciberhistoria", Toast.LENGTH_SHORT).show()
                R.id.nav_codigocreativo -> Toast.makeText(applicationContext, "Click en Código Creativo", Toast.LENGTH_SHORT).show()
                R.id.nav_etica -> Toast.makeText(applicationContext, "Click en Ética Tech", Toast.LENGTH_SHORT).show()
                R.id.nav_softninja -> Toast.makeText(applicationContext, "Click en Software Ninja", Toast.LENGTH_SHORT).show()
                R.id.nav_robots -> Toast.makeText(applicationContext, "Click en Robots y más", Toast.LENGTH_SHORT).show()
                R.id.nav_culturacoder -> Toast.makeText(applicationContext, "Click en Cultura Coder", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}




