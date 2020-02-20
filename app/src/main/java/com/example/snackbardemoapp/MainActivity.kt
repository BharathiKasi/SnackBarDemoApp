package com.example.snackbardemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

lateinit var mSnackbar: Snackbar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
           mSnackbar = Snackbar.make(parentView,"this is snackbar demo",Snackbar.LENGTH_LONG)
            mSnackbar.show()
        }

        button2.setOnClickListener {
            mSnackbar = Snackbar.make(parentView,"are you sleeping ?",Snackbar.LENGTH_LONG).setAction("No"
            ) { mSnackbar = Snackbar.make(parentView," Ok Then continue ",Snackbar.LENGTH_LONG)
                mSnackbar.show()
            }
            mSnackbar.show()
        }
    }
}
