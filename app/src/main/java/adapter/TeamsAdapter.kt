package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.copaamerica.R
import model.TeamsModel


class TeamsAdapter(private var lstteams: List<TeamsModel>): RecyclerView.Adapter<TeamsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val lblNombrePais: TextView = itemView.findViewById(R.id.lblNombrePais)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_teams,parent,false))
    }

    override fun getItemCount(): Int {
        return lstteams.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemTeams = lstteams[position]
        holder.lblNombrePais.text = itemTeams.nombre
    }
}