package com.phong.hocfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo đối tượng quản lý:
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Tạo đối tượng thực hiện phiên tương tác:
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //Thực hiện thêm Fragment vào Activity:
        fragmentTransaction.add(R.id.container, new MyFragment());
        //Xác nhận tương tác:
        fragmentTransaction.commit();
    }
}
