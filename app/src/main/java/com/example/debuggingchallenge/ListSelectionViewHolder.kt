import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.debuggingchallenge.R

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition: TextView = itemView.findViewById(R.id.itemNumber)
    val listCapital: TextView = itemView.findViewById(R.id.itemStringCapital)
    val listCountry: TextView = itemView.findViewById(R.id.itemStringCountry)

}