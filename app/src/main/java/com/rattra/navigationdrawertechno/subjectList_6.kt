package com.rattra.navigationdrawertechno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import com.rattra.navigationdrawertechno.class6_subjectList.*

class subjectList_6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list_6)

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.class_6_sub)

        setSingleEvent(mainGrid)

    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_6_assamese::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_6_hindi::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_6_english::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_6_science::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_6_maths::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_6_socialscience::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_6_advancedmaths::class.java)
                        startActivity(intent)
                    }

                }
            }
        }
    }
}