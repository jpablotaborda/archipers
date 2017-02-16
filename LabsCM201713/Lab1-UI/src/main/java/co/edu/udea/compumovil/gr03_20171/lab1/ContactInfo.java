package co.edu.udea.compumovil.gr03_20171.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class ContactInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        AutoCompleteTextView autocompais= (AutoCompleteTextView)findViewById(R.id.autocompais);
        String[] paises= getResources().getStringArray(R.array.paiseslatinoame);
        ArrayAdapter<String> arreglopa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);
        autocompais.setAdapter(arreglopa);
        AutoCompleteTextView autocomciu= (AutoCompleteTextView) findViewById(R.id.autocomciu);
        String[] ciudades= getResources().getStringArray(R.array.ciudadescol);
        ArrayAdapter<String> arreglociu= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ciudades);
        autocomciu.setAdapter(arreglociu);

    }
    public void mosotherinfo(View v){
        Intent mosotherinfo= new Intent(this,OtherInfo.class);

        Bundle globalalm= getIntent().getExtras();


        EditText camtel= (EditText) findViewById(R.id.camtel);
        EditText camemail= (EditText)findViewById(R.id.camemail);
        EditText camdir= (EditText) findViewById(R.id.camdir);
        AutoCompleteTextView autopais= (AutoCompleteTextView) findViewById(R.id.autocompais);
        AutoCompleteTextView autociu= (AutoCompleteTextView) findViewById(R.id.autocomciu);


        Bundle contacinfo= new Bundle();
        contacinfo.putString("tel",camtel.getText().toString());
        contacinfo.putString("email",camemail.getText().toString());
        contacinfo.putString("dir",camdir.getText().toString());
        contacinfo.putString("pais",autopais.getText().toString());
        contacinfo.putString("ciudad",autociu.getText().toString());
         globalalm.putBundle("contactinfo",contacinfo);
        mosotherinfo.putExtras(globalalm);


        startActivity(mosotherinfo);

    }
}
