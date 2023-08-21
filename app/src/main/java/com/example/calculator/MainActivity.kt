package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.txt_txt)
        val res = findViewById<TextView>(R.id.txt_x)
        val zero = findViewById<ImageView>(R.id.img_zero);
        val one = findViewById<ImageView>(R.id.img_one);
        val two = findViewById<ImageView>(R.id.img_two);
        val three = findViewById<ImageView>(R.id.img_three);
        val four = findViewById<ImageView>(R.id.img_four);
        val five = findViewById<ImageView>(R.id.img_five);
        val six = findViewById<ImageView>(R.id.img_six);
        val seven = findViewById<ImageView>(R.id.img_seven);
        val eight = findViewById<ImageView>(R.id.img_eight);
        val nine = findViewById<ImageView>(R.id.img_nine);
        val addition = findViewById<ImageView>(R.id.img_add);
        val subtraction = findViewById<ImageView>(R.id.img_sub);
        val multiplication = findViewById<ImageView>(R.id.img_mul);
        val division = findViewById<ImageView>(R.id.img_divi);
        val equal = findViewById<ImageView>(R.id.img_equal);
        val dot = findViewById<ImageView>(R.id.img_dot);
        val ac = findViewById<ImageView>(R.id.img_c);
        val comma = findViewById<ImageView>(R.id.img_comma);
        val back = findViewById<ImageView>(R.id.img_back);
        val logout = findViewById<ImageView>(R.id.img_log);



        zero.setOnClickListener {
            txt.text = (txt.text.toString() + "0")
        }

        one.setOnClickListener {
            txt.text = (txt.text.toString() + "1")
        }

        two.setOnClickListener {
            txt.text = (txt.text.toString() + "2")
        }

        three.setOnClickListener {
            txt.text = (txt.text.toString() + "3")
        }

        four.setOnClickListener {
            txt.text = (txt.text.toString() + "4")
        }

        five.setOnClickListener {
            txt.text = (txt.text.toString() + "5")
        }

        six.setOnClickListener {
            txt.text = (txt.text.toString() + "6")
        }

        seven.setOnClickListener {
            txt.text = (txt.text.toString() + "7")
        }

        eight.setOnClickListener {
            txt.text = (txt.text.toString() + "8")
        }

        nine.setOnClickListener {
            txt.text = (txt.text.toString() + "9")
        }

        addition.setOnClickListener {
            txt.text = (txt.text.toString() + "+")
        }

        subtraction.setOnClickListener {
            txt.text = (txt.text.toString() + "-")
        }

        multiplication.setOnClickListener {
            txt.text = (txt.text.toString() + "*")
        }

        division.setOnClickListener {
            txt.text = (txt.text.toString() + "/")
        }

        dot.setOnClickListener {
            txt.text = (txt.text.toString() + ".")
        }

        back.setOnClickListener {
            var str: String = txt.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                txt.text = str
            }
        }

        ac.setOnClickListener {
            txt.text = ""
            res.text = ""
        }

        comma.setOnClickListener {
            txt.text = (txt.text.toString() + ",")
        }

        logout.setOnClickListener {
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }
    }

    fun equalClicked(view: View) {
        val txt = findViewById<TextView>(R.id.txt_txt)
        val res = findViewById<TextView>(R.id.txt_x)

        val expression = ExpressionBuilder(txt.text.toString()).build()
        val result = expression.evaluate()
        val logResult = result.toLong()

        if (result == logResult.toDouble()) {
            res.text = logResult.toString()

        } else {
            res.text = result.toString()
        }
    }

}