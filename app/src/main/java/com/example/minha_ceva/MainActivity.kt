package com.example.minha_ceva

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calc.setOnClickListener(View.OnClickListener {
            val d1 = d1.text.toString()
            val m1 = m1.text.toString().toDouble()
            val p1 = p1.text.toString().toDouble()

            val d2 = d2.text.toString()
            val m2 = m2.text.toString().toDouble()
            val p2 = p2.text.toString().toDouble()
            var r1 = (p1/m1 *1000).toString().toDouble()
            var r2 = (p2/m2 *1000).toString().toDouble()
            val df = DecimalFormat("#.00")
            if(r1 > r2) {
                txtResult.text = "Preço mais baixo: " + d1 + ", R$" + df.format(r1) + " por litro"
            } else if(r2 > r1) {
                txtResult.text = "Preço mais baixo: " + d2 + ", R$" + df.format(r2) + " por litro"
            } else {
                txtResult.text = "Valores iguais por litro."
            }
        })
    }
}
