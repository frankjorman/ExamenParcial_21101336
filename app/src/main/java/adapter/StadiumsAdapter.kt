package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.copaamerica.R
import model.StadiumsModel
import model.TeamsModel

class StadiumsAdapter(private var lsStadiums: List<StadiumsModel>): RecyclerView.Adapter<StadiumsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val lblNombreStadium: TextView = itemView.findViewById(R.id.lblNombreStadium)
        val lblLocacionStadium: TextView = itemView.findViewById(R.id.lblLocacionStadium)
        val lblCapacidadStadium: TextView = itemView.findViewById(R.id.lblCapacidadStadium)
        val imgStadium: ImageView = itemView.findViewById(R.id.imgStadium)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_teams,parent,false))
    }

    override fun getItemCount(): Int {
        return lsStadiums.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemStadium = lsStadiums[position]
        holder.lblNombreStadium.text = itemStadium.nombre
        holder.lblLocacionStadium.text = itemStadium.locacion
        holder.lblCapacidadStadium.text = itemStadium.capacidad
        holder.imgStadium.setImageResource(itemStadium.imagen)
    }
}