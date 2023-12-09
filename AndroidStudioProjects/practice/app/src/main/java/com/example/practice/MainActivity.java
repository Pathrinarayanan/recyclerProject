package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button btn;
    public String PASSWORD1 = "1234567890", PASSWORD2 = "0987654321" , PASSWORD3="1234509876";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        btn = findViewById(R.id.login);
        Intent i = new Intent(this, Second.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean isCorrect = validate(user.getText().toString(),pass.getText().toString());
                if(isCorrect){
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Hey,Password does not match", Toast.LENGTH_SHORT).show();
                }


            }


        });

    }
    public Boolean validate(String user,String pass) {
        List<String> storedPasswords = Arrays.asList(PASSWORD1, PASSWORD2, PASSWORD3);
        if(user.length() !=10) {
            Toast.makeText(this, "username contains exactly 10 Numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        // validation
        try{
            long data = Long.parseLong(user);
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Username contains only Numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        //password
        if(user.length() !=10) {
            Toast.makeText(this, "Password contains exactly 10 Numbers", Toast.LENGTH_SHORT).show();
            return false;
        }

        try{
            long data = Long.parseLong(pass);
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Enter only numbers in password", Toast.LENGTH_SHORT).show();
            return false;
        }
        if( !user.equals(pass)) {Toast.makeText(this, "Username and password not match", Toast.LENGTH_SHORT).show();
            return false;}
        return storedPasswords.contains(pass);
    }
}