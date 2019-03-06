package com.example.flipclassroom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.flipclassroom.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DBHelper(this,"User.db",null,2);
        CircleImageView icon1= (CircleImageView) findViewById(R.id.circleImageViewTeacher);
        CircleImageView icon2= (CircleImageView) findViewById(R.id.circleImageViewStudent);

    }
}
