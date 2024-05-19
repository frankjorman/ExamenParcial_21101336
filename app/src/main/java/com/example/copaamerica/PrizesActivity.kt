package com.example.copaamerica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnStadiums: Button = findViewById(R.id.btnCalcularPrizes)
        val btnGoMenuPrizes: Button = findViewById(R.id.btnGoMenuPrizes)
        val etMontoDolares: EditText = findViewById(R.id.txtMontoDolares)

        val lblPrimerPuesto= findViewById<TextView>(R.id.lblPrimerPuesto)
        val lblSegundoPuesto= findViewById<TextView>(R.id.lblSegundoPuesto)
        val lblTercerPuesto= findViewById<TextView>(R.id.lblTercerPuesto)
        val lblCuartoPuesto= findViewById<TextView>(R.id.lblCuartoPuesto)

        btnStadiums.setOnClickListener{
            val totalAmountStr = etMontoDolares.text.toString()
            if (totalAmountStr.isNotEmpty()) {
                val totalAmount = totalAmountStr.toDouble()
                val firstPlace = 0.25 * totalAmount
                val secondPlace = 0.15 * totalAmount
                val thirdPlace = 0.10 * totalAmount
                val remainingAmount = totalAmount - (firstPlace + secondPlace + thirdPlace)
                val fourthToSixteenthPlace = remainingAmount / 13

                lblPrimerPuesto.text = "1° place 25% -> " + firstPlace.toString()
                lblSegundoPuesto.text = "2° place 15% -> " + secondPlace.toString()
                lblTercerPuesto.text = "3° place 10% ->" + thirdPlace.toString()
                lblCuartoPuesto.text = "4° - 16° place ->" + fourthToSixteenthPlace.toString()
            }
        }

        btnGoMenuPrizes.setOnClickListener{
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}