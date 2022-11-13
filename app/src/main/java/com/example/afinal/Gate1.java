package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;


public class Gate1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate1);

    }
    double answer1 = 0.0;
    double answer2 = 0.0;

    double openingwidth = 0.0;
    double openinglength = 0.0;
    double numberofopenings = 0.0;
    double depthGutterWater = 0.0;
    double recessedGrateDepth = 0.0;
    // var step = 0

    @Override
    public void onStart() {
        super.onStart();

        public void makeGroupVisible(TextView text, EditText input, Button button, Boolean shouldBeVisible) {
            var visibility = if (shouldBeVisible) View.VISIBLE else View.INVISIBLE
            text.visibility = visibility
            input.visibility = visibility
            button.visibility = visibility
        }
        lenghtInputText.visibility = View.INVISIBLE
        numberInputText.visibility = View.INVISIBLE
        depthInputText.visibility = View.INVISIBLE
        recessedInputText.visibility = View.INVISIBLE

        lengthInput.visibility = View.INVISIBLE
        numberInput.visibility = View.INVISIBLE
        depthInput.visibility = View.INVISIBLE
        recessedInput.visibility = View.INVISIBLE

        nextButton2.visibility = View.INVISIBLE
        nextButton3.visibility = View.INVISIBLE
        nextButton4.visibility = View.INVISIBLE
        nextButton5.visibility = View.INVISIBLE

        answerText.visibility = View.INVISIBLE
        answerM3S.visibility = View.INVISIBLE
        answerLS.visibility = View.INVISIBLE

        nextButton1.setOnClickListener {
            // For "Opening width:"
            makeGroupVisible(widthInputText, widthInput, nextButton1, false)
            makeGroupVisible(lenghtInputText, lengthInput, nextButton2, true)

            /*
                widthInputText.visibility = View.INVISIBLE
                widthInput.visibility = View.INVISIBLE
                nextButton1.visibility = View.INVISIBLE

                textView2.visibility = View.VISIBLE
                input2.visibility = View.VISIBLE
                nextButton2.visibility = View.VISIBLE
                */
            val a = widthInput.text.toString().toDouble()

            openingwidth = a
        }


        nextButton2.setOnClickListener {
            // For "Opening length:"
            makeGroupVisible(lenghtInputText, lengthInput, nextButton2, false)
            makeGroupVisible(numberInputText, numberInput, nextButton3, true)
            /*
                lenghtInputText.visibility = View.INVISIBLE
                lengthInput.visibility = View.INVISIBLE
                nextButton2.visibility = View.INVISIBLE

                numberInputText.visibility = View.VISIBLE
                numberInput.visibility = View.VISIBLE
                nextButton3.visibility = View.VISIBLE
                */
            val b = lengthInput.text.toString().toDouble()

            openinglength = b

        }


        nextButton3.setOnClickListener {
            // For "Input the number of openings"
            makeGroupVisible(numberInputText, numberInput, nextButton3, false)
            makeGroupVisible(depthInputText, depthInput, nextButton4, true)
            /*
                numberInputText.visibility = View.INVISIBLE
                numberInput.visibility = View.INVISIBLE
                nextButton3.visibility = View.INVISIBLE

                depthInputText.visibility = View.VISIBLE
                depthInput.visibility = View.VISIBLE
                nextButton4.visibility = View.VISIBLE
                */

            val c = numberInput.text.toString().toDouble()


            numberofopenings = c

        }

        nextButton4.setOnClickListener {

            // For "Input the depth of the gutter water:"
            makeGroupVisible(depthInputText, depthInput, nextButton4, false)
            makeGroupVisible(recessedInputText, recessedInput, nextButton5, true)
/*
                depthInputText.visibility = View.INVISIBLE
                depthInput.visibility = View.INVISIBLE
                nextButton4.visibility = View.INVISIBLE

                recessedInputText.visibility = View.VISIBLE
                recessedInput.visibility = View.VISIBLE
                nextButton5.visibility = View.VISIBLE

*/
            val d = depthInput.text.toString().toDouble()

            depthGutterWater = d


        }


        fun makeGroupVisible(text1: TextView, text2: TextView, text3: TextView, shouldBeVisible: Boolean) {
            var visibility2 = if (shouldBeVisible) View.VISIBLE else View.INVISIBLE
            text1.visibility = visibility2
            text2.visibility = visibility2
            text3.visibility = visibility2
        }
        nextButton5.setOnClickListener {

            // For "Input the recessed grate depth:"
            makeGroupVisible(recessedInputText, recessedInput, nextButton5, false)
            makeGroupVisible(answerText, answerM3S, answerLS, true)

/*
                recessedInputText.visibility = View.INVISIBLE
                recessedInput.visibility = View.INVISIBLE
                nextButton5.visibility = View.INVISIBLE

                answerText.visibility = View.VISIBLE
                answerM3S.visibility = View.VISIBLE
                answerLS.visibility = View.VISIBLE
*/
            val e = recessedInput.text.toString().toDouble()
            recessedGrateDepth = e

            val konst1 = 0.61
            val konst2 = 9.806

            answer1 = (konst1 * ((openingwidth * openinglength) * numberofopenings) * (Math.sqrt(2 * konst2 * (depthGutterWater + recessedGrateDepth))))
            answer2 = answer1 * 1000
            answerText.text = "The inlet capacity of an undepressed drainage grate:"
            answerM3S.text = "${String.format("%.2f", answer1)} m³/s"
            answerLS.text = "${String.format("%.2f", answer2)} L/s"
        }
    }

}