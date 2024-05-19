package com.example.copaamerica

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
import model.TeamsModel

class TeamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvContacto: RecyclerView = findViewById(R.id.rvTeams)
        val btnGoToMenuTeams: Button = findViewById(R.id.btnGoToMenuTeams)

        rvContacto.layoutManager = LinearLayoutManager(this)
        rvContacto.adapter = TeamsAdapter(TeamsList())

        btnGoToMenuTeams.setOnClickListener{
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
    }

    private fun TeamsList(): List<TeamsModel>{
        val lstTeams: ArrayList<TeamsModel> = ArrayList()

        lstTeams.add(
            TeamsModel("Argentina")
        )

        lstTeams.add(
            TeamsModel("Brasil")
        )

        lstTeams.add(
            TeamsModel("Uruguay")
        )

        lstTeams.add(
            TeamsModel("Colombia")
        )

        lstTeams.add(
            TeamsModel("Estados Unidos")
        )

        lstTeams.add(
            TeamsModel("Perú")
        )

        lstTeams.add(
            TeamsModel("Cánada")
        )

        lstTeams.add(
            TeamsModel("México")
        )

        lstTeams.add(
            TeamsModel("Trinidad y Tobago")
        )

        return  lstTeams;
    }
}