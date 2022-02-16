package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_cat1 -> {
                textView.text = "Ви вибрали кота!"
                return true
            }
            R.id.action_cat2 -> {
                textView.text = "Ви вибрали кішку!"
                return true
            }
            R.id.action_cat3 -> {
                textView.text = "Ви вибрали кошеня!"
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }
}
