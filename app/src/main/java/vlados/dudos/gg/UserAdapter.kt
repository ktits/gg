package vlados.dudos.gg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_view.view.*

class UserAdapter(private val list: List<UserModel>) : RecyclerView.Adapter< UserAdapter.UserView>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_view, parent, false)
        val userView = UserView(view)
        return userView

    }

    override fun getItemCount():Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserView, position: Int) {
        holder.itemView.txt_name.text = list[position].name
        holder.itemView. txt_surname.text = list[position].surname
    }

    class UserView(view: View) :RecyclerView.ViewHolder(view)
}