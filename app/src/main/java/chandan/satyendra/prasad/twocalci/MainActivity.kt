package chandan.satyendra.prasad.twocalci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myString: String

    var number1 : Int? =null
    var number2 : Int? =null
    var number3 : Int? =null
    lateinit var editText:EditText
    lateinit var editText2:EditText
    lateinit var restext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myString = ""
        editText=findViewById(R.id.editText)
        editText2=findViewById(R.id.editText2)
        restext=findViewById(R.id.resultText)



    }

    fun mySub(view: View) {
        number1=editText.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null ) {

            restext.text = "Error!"

        } else {
            number3 = number1!! - number2!!
            restext.setText("Result: $number3")
        }

    }
    fun myDiv(view: View) {
        number1=editText.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null ) {

            restext.text = "Error!"

        } else if(number2==0){
            restext.text = "Divide By Zero Error!"
        }else
        {
            number3 = number1!! / number2!!
            restext.setText("Result: $number3")
        }
    }
    fun myMultiply(view: View) {
        number1=editText.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null ) {

            restext.text = "Error!"

        } else {
            number3 = number1!! * number2!!
            restext.setText("Result: $number3")
        }
    }
    fun mySum(view: View) {
        number1=editText.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if (number1 == null || number2 == null ) {

            restext.text = "Error!"

        } else {
            number3 = number1!! + number2!!
            restext.setText("Result: $number3")
        }
    }
}