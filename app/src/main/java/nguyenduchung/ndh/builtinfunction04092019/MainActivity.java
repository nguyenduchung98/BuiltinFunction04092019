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
       int ketqua= tinhTong(3,4);
        Log.d("DDD",ketqua+"");
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
}
