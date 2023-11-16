package layout

import Animal
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication113.AnimalActivity
import com.example.myapplication113.R

class AnimalAdapter(private val animals: List<Animal>) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        return AnimalViewHolder(view)
    }
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals[position]
        holder.bind(animal)
    }
    override fun getItemCount() = animals.size
    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.animalName)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.animalDescription)
        private val imageView: ImageView = itemView.findViewById(R.id.animalImage)
        private val btnDetails: Button = itemView.findViewById(R.id.btnDetails)

        fun bind(animal: Animal) {
            nameTextView.text = animal.name
            descriptionTextView.text = animal.shortDescription
            imageView.setImageResource(animal.image)
            btnDetails.setOnClickListener {
                val context = itemView.context
                val intent = Intent(context, AnimalActivity::class.java)
                intent.putExtra("name", animal.name)
                intent.putExtra("fullDescription", animal.fullDescription)
                intent.putExtra("image", animal.image)
                context.startActivity(intent)
            }
        }
    }
}
