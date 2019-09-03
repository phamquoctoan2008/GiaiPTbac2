package com.example.giaiptbac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_a, edt_b, edt_c;
    TextView txtview_ketqua;
    Button btn_giai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_a = findViewById(R.id.editText_A);
        edt_b = findViewById(R.id.editText_B);
        edt_c = findViewById(R.id.editText_C);
        txtview_ketqua = findViewById(R.id.textView_ketqua);
        btn_giai = findViewById(R.id.button_Giai);

        btn_giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edt_a.getText().toString());
                double b = Double.parseDouble(edt_b.getText().toString());
                double c = Double.parseDouble(edt_c.getText().toString());

                XuLy tinh = new XuLy();
                if(tinh.Giaipt(a,b,c) == 0)
                    txtview_ketqua.setText("Phuong trinh vo so nghiem");
                if(tinh.Giaipt(a,b,c) == -1 )
                    txtview_ketqua.setText("Phuong trinh vo nghiem");
                if(tinh.Giaipt(a,b,c) == 1)
                    txtview_ketqua.setText("Phuong trinh co 1 nghiem la \n"+"X = " + tinh.getX1());
                if(tinh.Giaipt(a,b,c) == 2)
                    txtview_ketqua.setText("Phuong trinh co nghiem kep la \n"+"X1 = X2 = "+tinh.getX1());
                if(tinh.Giaipt(a,b,c) == 3)
                    txtview_ketqua.setText("Phuong trinh co 2 nghiem\n"+"X1 = "+tinh.getX1()+"\n"+"X2 = "+tinh.getX2());



            }
        });
    }
}
