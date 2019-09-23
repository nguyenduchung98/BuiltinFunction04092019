package nguyenduchung.ndh.builtinfunction04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//    double value =Math.random() * 5;
//    Log.d("DDD",value +"");
        //lam tron giá tri
       // Math.floor(): làm tròn xuong
        //Math.ceil() : làm tron lên
        //Math.round(): <5 làm ròn xuống,>5 làm tròn len

        //double number =Math.floor(4.9999);
//        double value =Math.floor(Math.random() * 5 + 1);
//        double number1 =Math.floor(4.9999);
//        double number2 =Math.ceil(4.9999);
//        double number3 =Math.round(4.6);
//        Log.d("DDD",value +"");
        //so chính phương

        double number4= Math.sqrt(5);
    ktSochinhphuong(6);

    }
    private void ktSochinhphuong(double value){
        if(Math.sqrt(value) %  1 == 0){
            Log.d("DDD","day la so chinh phuong");
        }
        else {
            Log.d("DDD","day la ko phai so chinh phuong")
        }
    }
}
