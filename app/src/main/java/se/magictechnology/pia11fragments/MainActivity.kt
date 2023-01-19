package se.magictechnology.pia11fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startButton).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragCon, StartFragment()).commit()
        }

        findViewById<Button>(R.id.infoButton).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragCon, InfoFragment()).commit()
        }

    }
}

/*

                            - LoginFrag
MAINACTIVITY    FragCon
                            - StartFrag

 */