package com.example.calcolatrice

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var expression: TextView
    private lateinit var result: TextView
    private lateinit var clear:Button
    private lateinit var backSpace:Button
    private lateinit var percent:Button
    private lateinit var divide:Button
    private lateinit var multiply:Button
    private lateinit var add:Button
    private lateinit var subtract:Button
    private lateinit var equal:Button
    private lateinit var dot:Button
    private lateinit var zero:Button
    private lateinit var doubleZero:Button
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var five:Button
    private lateinit var six:Button
    private lateinit var seven:Button
    private lateinit var eight:Button
    private lateinit var nine:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       expression = findViewById(R.id.expression)
        result = findViewById(R.id.result)
        clear = findViewById(R.id.clear)
        backSpace = findViewById(R.id.backSpace)
        percent = findViewById(R.id.percent)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        add = findViewById(R.id.add)
        subtract = findViewById(R.id.subtract)
        equal = findViewById(R.id.equal)
        dot = findViewById(R.id.dot)
        zero = findViewById(R.id.zero)
        doubleZero = findViewById(R.id.Doublezero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true
        clear.setOnClickListener{

        }
        backSpace.setOnClickListener{

        }
        divide.setOnClickListener{

        }
        multiply.setOnClickListener{

        }
        subtract.setOnClickListener{

        }
        equal.setOnClickListener{

        }
        dot.setOnClickListener{

        }
        zero.setOnClickListener{

        }
        doubleZero.setOnClickListener{

        }
        one.setOnClickListener{

        }
        two.setOnClickListener{

        }
        three.setOnClickListener{

        }
        four.setOnClickListener{

        }
        five.setOnClickListener{

        }
        six.setOnClickListener{

        }
        seven.setOnClickListener{

        }
        eight.setOnClickListener{

        }
        nine.setOnClickListener{

        }
    }
}