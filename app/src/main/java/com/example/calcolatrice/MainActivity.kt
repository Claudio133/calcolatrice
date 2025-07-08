package com.example.calcolatrice

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var expression: TextView
    private lateinit var result: TextView
    private lateinit var clear:Button
    private lateinit var backSpace:Button
    private lateinit var sqrt:Button
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
        sqrt = findViewById(R.id.sqrt)
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


        var str:String

        clear.setOnClickListener{
            str = "0"
            expressionText(str)
            expression.textSize=60F
            result.textSize=30F
            resultText()
        }
        backSpace.setOnClickListener{
            if(expression.text.toString().isNotEmpty()){
                val lastIndex=expression.text.toString().lastIndex
                str=expression.text.toString().substring(0,lastIndex)
                expressionText(str)
                resultText()
            }
        }
        val sqrt = findViewById<Button>(R.id.sqrt)


        sqrt.setOnClickListener {
            val current = expression.text.toString()


            val str = "sqrt($current)"
            expressionText(str)
            resultText()
        }

        divide.setOnClickListener{
            if(expression.text.toString().endsWith(suffix ="/")||expression.text.toString().endsWith(suffix = "*")||expression.text.toString().endsWith(suffix = "+")||expression.text.toString().endsWith(suffix = "-")||expression.text.toString().endsWith(suffix = ".")){
                str=expression.text.toString()
                expressionText(str)
            }else {
                str=expression.text.toString() + "/"
                expressionText(str)
            }
        }
        multiply.setOnClickListener{
            if(expression.text.toString().endsWith(suffix ="/")||expression.text.toString().endsWith(suffix = "*")||expression.text.toString().endsWith(suffix = "+")||expression.text.toString().endsWith(suffix = "-")||expression.text.toString().endsWith(suffix = ".")){
                str=expression.text.toString()
                expressionText(str)
            }else {
                str=expression.text.toString() + "*"
                expressionText(str)
            }
        }
        add.setOnClickListener{
            if(expression.text.toString().endsWith(suffix ="/")||expression.text.toString().endsWith(suffix = "*")||expression.text.toString().endsWith(suffix = "+")||expression.text.toString().endsWith(suffix = "-")||expression.text.toString().endsWith(suffix = ".")){
                str=expression.text.toString()
                expressionText(str)
            }else {
                str=expression.text.toString() + "+"
                expressionText(str)
            }
        }
        subtract.setOnClickListener{
            if(expression.text.toString().endsWith(suffix ="/")||expression.text.toString().endsWith(suffix = "*")||expression.text.toString().endsWith(suffix = "+")||expression.text.toString().endsWith(suffix = "-")||expression.text.toString().endsWith(suffix = ".")){
                str=expression.text.toString()
                expressionText(str)
            }else {
                str=expression.text.toString() + "-"
                expressionText(str)
            }
        }
        equal.setOnClickListener{
            expression.textSize=30F
            result.textSize=60F
        }
        dot.setOnClickListener{
            if(expression.text.toString().endsWith(suffix ="/")||expression.text.toString().endsWith(suffix = "*")||expression.text.toString().endsWith(suffix = "+")||expression.text.toString().endsWith(suffix = "-")||expression.text.toString().endsWith(suffix = ".")){
                str=expression.text.toString()
                expressionText(str)
            }else {
                str=expression.text.toString() + "."
                expressionText(str)
            }
        }
        zero.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "0"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"0"
                expressionText(str)
                resultText()
            }
        }

        doubleZero.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "00"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"00"
                expressionText(str)
                resultText()
            }
        }
        one.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "1"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"1"
                expressionText(str)
                resultText()
            }
        }
        two.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "2"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"2"
                expressionText(str)
                resultText()
            }
        }
        three.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "3"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"3"
                expressionText(str)
                resultText()
            }
        }
        four.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "4"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"4"
                expressionText(str)
                resultText()
            }
        }
        five.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "5"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"5"
                expressionText(str)
                resultText()
            }
        }
        six.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "6"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"6"
                expressionText(str)
                resultText()
            }
        }
        seven.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "7"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"7"
                expressionText(str)
                resultText()
            }
        }
        eight.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "8"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"8"
                expressionText(str)
                resultText()
            }
        }
        nine.setOnClickListener{
            if(expression.text.toString().startsWith(prefix = "0")) {
                str=expression.text.toString().replace(oldValue = "0", newValue = "") + "9"
                expressionText(str)
                resultText()
            }else{
                str=expression.text.toString()+"9"
                expressionText(str)
                resultText()
            }
        }
    }
    private fun expressionText(str:String){
        expression.text=str
    }
    private fun resultText() {
        val exp = expression.text.toString()

        try {
            val resultValue = ExpressionBuilder(exp).build().evaluate()
            val longResult = resultValue.toLong()

            if (resultValue == longResult.toDouble()) {
                result.text = "=$longResult"
            } else {
                result.text = "=$resultValue"
            }
        } catch (e: Exception) {
            result.text = "Errore"
        }
    }

}