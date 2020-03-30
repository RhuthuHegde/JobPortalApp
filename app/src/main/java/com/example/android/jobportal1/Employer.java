package com.example.android.jobportal1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Employer extends AppCompatActivity {
    private  Button Button_to_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);


        Button_to_login=(Button) findViewById(R.id.buttonforhaveacc) ;
        Button_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHaveAcc();
            }
        });

        Spinner mySpinner=(Spinner)findViewById(R.id.spinnercompany);

        //Container to hold the values
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.companytype));
        // To make it a drop down list
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

//If we forget this line then the data in drop down will not be shown in the spinner*/




    }
    public void  openActivityHaveAcc()
    {
        Intent intentacc=new Intent(this,HaveAnAccount.class);
        startActivity(intentacc);
    }
}