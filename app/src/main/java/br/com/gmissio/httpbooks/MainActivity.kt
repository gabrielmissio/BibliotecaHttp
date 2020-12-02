package br.com.gmissio.httpbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.gmissio.httpbooks.R
import kotlinx.android.synthetic.main.fragment_books_list.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        listView.setOnItemClickListener { parent, view, position, id ->
            val book = parent.getItemAtPosition(position) as? Book
            if (book != null) {
                Toast.makeText(this, "${book.title}, \n ${book.author}, \n ${book.year} ", Toast.LENGTH_LONG).show()


        }
    }

        

}



}




