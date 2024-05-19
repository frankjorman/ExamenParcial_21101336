package com.example.copaamerica

import adapter.StadiumsAdapter
import adapter.TeamsAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.StadiumsModel
import model.TeamsModel

class StadiumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stadiums)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvStadiums: RecyclerView = findViewById(R.id.rvStadiums)

        rvStadiums.layoutManager = LinearLayoutManager(this)
        rvStadiums.adapter = StadiumsAdapter(StadiumList())

    }

    private fun StadiumList(): List<StadiumsModel>{
        val lstStadiums: ArrayList<StadiumsModel> = ArrayList()

        lstStadiums.add(
            StadiumsModel("Mercedez-Benz Stadium","Atlanta, GA","71,000",R.drawable.stadium1)
        )

        lstStadiums.add(
            StadiumsModel("Hard Rock Stadium","Miami Garden, FL","65,300",R.drawable.stadium2)
        )

        lstStadiums.add(
            StadiumsModel("GEHA Field at Arrowhead","Austin, TX","20,700",R.drawable.stadium3)
        )

        lstStadiums.add(
            StadiumsModel("AT&T Stadium","Arlington, TX","80,000",R.drawable.stadium4)
        )

        lstStadiums.add(
            StadiumsModel("Bank of Amerca Stadium","Charlotte, NC","71,000",R.drawable.stadium5)
        )

        lstStadiums.add(
            StadiumsModel("Metlife Stadium","east Rutherford, Nj","82,500",R.drawable.stadium6)
        )

        lstStadiums.add(
            StadiumsModel("State Farm Stadium","Gledale, AZ","63,400",R.drawable.stadium7)
        )

        lstStadiums.add(
            StadiumsModel("NGR Stadium","Atlanta, GA","63,400",R.drawable.stadium8)
        )

        lstStadiums.add(
            StadiumsModel("Mercedez-Benz Stadium","Houston, TX","72,220",R.drawable.stadium9)
        )

        return  lstStadiums;
    }
}