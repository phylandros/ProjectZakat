package com.project.zakat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    EditText signupNoKK, signupNoKTP, signupNoTel, signupNama, signupAlamat, signupUsername, signupPassword, signupConpassword;
    Button btnSignup, btnBack;
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signupNoKK = findViewById(R.id.no_kk);
        signupNoKTP = findViewById(R.id.no_ktp);
        signupNoTel = findViewById(R.id.no_telp);
        signupNama = findViewById(R.id.nama);
        signupAlamat = findViewById(R.id.alamat);
        signupUsername = findViewById(R.id.usernamesignup);
        signupPassword = findViewById(R.id.passwordsignup);
        signupConpassword = findViewById(R.id.conpasswordsignup);

        btnBack = findViewById(R.id.btn_back);
        btnSignup = findViewById(R.id.btn_signup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance("https://zakat-a3efe-default-rtdb.asia-southeast1.firebasedatabase.app");
                reference = database.getReference("users");

                String noKK = signupNoKK.getText().toString();
                String noKTP = signupNoKTP.getText().toString();
                String noTel = signupNoTel.getText().toString();
                String nama = signupNama.getText().toString();
                String alamat = signupAlamat.getText().toString();
                String username = signupUsername.getText().toString();
                String password = signupPassword.getText().toString();
                String conpassword = signupConpassword.getText().toString();

                HelperClass helperClass = new HelperClass(noKK, noKTP, noTel, nama, alamat, username, password, conpassword);
                reference.child(noKK).setValue(helperClass);

                Toast.makeText(RegisterActivity.this, "Daftar Akun Berhasil.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}