package com.example.ltdd_recycleview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerView recyclerView;
        StudentAdapter adapter;
        ArrayList<Student> students;
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.studentList);

    students = new ArrayList<Student>();
    //Tự phát sinh 50 dữ liệu mẫu
    for (int i = 1; i <= 10; i++) {
        students.add(new Student("Student Name"+i , 1995 + (i % 2)));
    }

    adapter = new StudentAdapter(students, this);

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(linearLayoutManager);

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}