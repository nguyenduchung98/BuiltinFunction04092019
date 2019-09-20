package nguyenduchung.ndh.builtinfunction04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // method == phương thức
        // Giả quyết vấn đè lặp code
        //in so chan
        //inSoChan();
        //in so le
        //inSoLe();
        //in so chia 3 du 1
        insoChi3du1();
    }
    // Thường đc tạo trong class
    // 1: Access modifier : phạm vi truy cập
        // public : ở đâu cung thấy đc
        //private :tạo ở đâu thì dùng ở đó
    // 2: Giá trị trả về
    // 3: Tên phương thức :
    private Integer tinhTong(int a,int b){
        int tong= a + b;
        return tong;
    }
    private void inSoChan(){
        for (int i=0;i<=100;i++){
            if(i==0){
                continue;
            }
            else if(i%2==0){
                Log.d("DDD",i+ " ");
            }
        }
    }
    private void inSoLe(){
        for (int i=0;i<=100;i++){
            if(i==0){
                continue;
            }
            else if(i%2!=0){
                Log.d("DDD",i+ " ");
            }
        }
    }
    private void insoChi3du1(){
        for (int i=0;i<=100;i++){
            if(i==0){
                continue;
            }
            else if(i%3==1){
                Log.d("DDD",i+ " ");
            }
        }
    }
}
