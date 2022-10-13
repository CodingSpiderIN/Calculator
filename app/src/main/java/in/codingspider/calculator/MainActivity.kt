package `in`.codingspider.calculator


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inputtext: TextView = findViewById(R.id.input_text)
        var outputtext: TextView = findViewById(R.id.output_text)
        var button9: ImageView = findViewById(R.id.btn_9)
        var button8: ImageView = findViewById(R.id.btn_8)
        var button7: ImageView = findViewById(R.id.btn_7)
        var button6: ImageView = findViewById(R.id.btn_6)
        var button5: ImageView = findViewById(R.id.btn_5)
        var button4: ImageView = findViewById(R.id.btn_4)
        var button3: ImageView = findViewById(R.id.btn_3)
        var button2: ImageView = findViewById(R.id.btn_2)
        var button1: ImageView = findViewById(R.id.btn_1)
        var button0: ImageView = findViewById(R.id.btn_0)
        var buttonDot: ImageView = findViewById(R.id.btn_dot)
        var buttonEq: ImageView = findViewById(R.id.btn_equal)
        var buttonMin: ImageView = findViewById(R.id.btn_minus)
        var buttonMul: ImageView = findViewById(R.id.btn_multiplication)
        var buttonPlus: ImageView = findViewById(R.id.btn_plus)

        var buttonAc: ImageView = findViewById(R.id.btn_ac)
        var buttonDev: ImageView = findViewById(R.id.btn_divide)
        var buttonSe: ImageView = findViewById(R.id.btn_end_bracket)
        var buttonSb: ImageView = findViewById(R.id.btn_start_bracket)

        buttonSb.setOnClickListener {
            inputtext.append('('.toString())
        }
        buttonSe.setOnClickListener {
            inputtext.append(')'.toString())
        }


        buttonAc.setOnClickListener {
            inputtext.text = ' '.toString()
            outputtext.text = ' '.toString()
        }
        buttonDev.setOnClickListener {
            inputtext.append('/'.toString())
        }




        buttonDot.setOnClickListener {
            inputtext.append('.'.toString())
        }
        buttonMin.setOnClickListener {
            inputtext.append('-'.toString())
        }
        buttonMul.setOnClickListener {
            inputtext.append('*'.toString())
        }
        buttonPlus.setOnClickListener {
            inputtext.append('+'.toString())
        }

        buttonEq.setOnClickListener {

            val text = inputtext.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()

            val longresult = result.toLong()
            if (result == longresult.toDouble()) {
                outputtext.text = longresult.toString()
            } else {
                outputtext.text = result.toString()
            }
        }










        button9.setOnClickListener {
            inputtext.append(9.toString())
        }
        button8.setOnClickListener {
            inputtext.append(8.toString())
        }

        button7.setOnClickListener {
            inputtext.append(7.toString())
        }
        button6.setOnClickListener {
            inputtext.append(6.toString())
        }
        button5.setOnClickListener {
            inputtext.append(5.toString())
        }
        button4.setOnClickListener {
            inputtext.append(4.toString())
        }
        button3.setOnClickListener {
            inputtext.append(3.toString())
        }
        button2.setOnClickListener {
            inputtext.append(2.toString())
        }
        button1.setOnClickListener {
            inputtext.append(1.toString())
        }
        button0.setOnClickListener {
            inputtext.append(0.toString())
        }
    }
}

