package com.example.hostellife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStaff extends AppCompatActivity {

    EditText fullname,address,post,email,mobile;
    Button insertBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);

        //initializing variables
        fullname = findViewById(R.id.staff_fullName_ID);
        address = findViewById(R.id.staff_address_ID);
        post = findViewById(R.id.staff_collage_ID);
        email = findViewById(R.id.staff_email_ID);
        mobile = findViewById(R.id.staff_contact_ID);
        insertBtn = findViewById(R.id.insertstaff_BTN_ID);

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "hostelStaffDatabase").allowMainThreadQueries().build();
                studentDao studentDao = db.studentDao();
                studentDao.insertAll(new StudentModel(fullname.getText().toString(),address.getText().toString(),email.getText().toString(),mobile.getText().toString()));
                Toast.makeText(AddStaff.this, "Staff person inserted successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }
}