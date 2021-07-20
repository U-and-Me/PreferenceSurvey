package com.cookandroid.and0720_08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAgree;
    RadioGroup rGroup;
    RadioButton rdoH, rdoC, rdoB, rdoN;
    Button btnReset;
    ImageView imgFood;
    TextView txtFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배달 음식 선호도 조사");

        chkAgree =findViewById(R.id.ChkAgree);
        rGroup = findViewById(R.id.rdoGroup);
        rdoH = findViewById(R.id.rdoH);
        rdoC = findViewById(R.id.rdoC);
        rdoB = findViewById(R.id.rdoB);
        rdoN = findViewById(R.id.rdoN);
        btnReset =findViewById(R.id.btnReset);
        imgFood = findViewById(R.id.imgFood);
        txtFood = findViewById(R.id.txtFood);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked() == true){
                    txtFood.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    rdoH.setVisibility(View.VISIBLE);
                    rdoC.setVisibility(View.VISIBLE);
                    rdoB.setVisibility(View.VISIBLE);
                    rdoN.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                    imgFood.setVisibility(View.VISIBLE);
                }else{
                    txtFood.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    rdoH.setVisibility(View.INVISIBLE);
                    rdoC.setVisibility(View.INVISIBLE);
                    rdoB.setVisibility(View.INVISIBLE);
                    rdoN.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                    imgFood.setVisibility(View.INVISIBLE);
                }
            }
        });
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.rdoH :
                        imgFood.setImageResource(R.drawable.korea_food); break;
                    case  R.id.rdoC :
                        imgFood.setImageResource(R.drawable.chinese_food); break;
                    case R.id.rdoB :
                        imgFood.setImageResource(R.drawable.flour_food); break;
                    case R.id.rdoN :
                        imgFood.setImageResource(R.drawable.midnight_food); break;
                }
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rGroup.clearCheck();
                imgFood.setImageDrawable(null);
            }
        });

    }
}
