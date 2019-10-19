package vlados.dudos.gg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list: ArrayList<UserModel> = ArrayList()


        val user1 = UserModel("User1", "User1")
        val user2 = UserModel("User2","User2")
        val user3 = UserModel("User3","User3")
        val user4 = UserModel("User4","User4")

        list.add (user1)
        list.add(user2)
        list.add(user3)
        list.add(user4)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = UserAdapter(list)

    }





}
