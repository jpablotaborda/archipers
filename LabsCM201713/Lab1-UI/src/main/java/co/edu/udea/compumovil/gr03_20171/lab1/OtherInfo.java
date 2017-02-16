package co.edu.udea.compumovil.gr03_20171.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class OtherInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_info);
    }
    public void mostrarinfo(View v){

        Bundle globalalm= getIntent().getExtras();
        TextView texinfocom= (TextView) findViewById(R.id.textmosinfo);

        texinfocom.setMovementMethod(new ScrollingMovementMethod());
        texinfocom.setVisibility(View.VISIBLE);
        Bundle personalinfo= globalalm.getBundle("infoper");
        Bundle contactinfo= globalalm.getBundle("contactinfo");

        texinfocom.setText(getResources().getString(R.string.mosnombre)+": " + personalinfo.getString("nombre")+ "\n"+
                        getResources().getString(R.string.mosape)+": "+ personalinfo.getString("apellido")+ "\n"+
                        getResources().getString(R.string.mossexo)+": "+ personalinfo.getString("sexo")+ "\n"+
                        getResources().getString(R.string.mosfechanac)+": "+ personalinfo.getString("fechanac")+ "\n"+
                        getResources().getString(R.string.mosesco)+": "+ personalinfo.getString("esco")+ "\n"+
                        getResources().getString(R.string.mostel)+": "+ contactinfo.getString("tel")+ "\n"+
                        getResources().getString(R.string.mosemail)+": "+ contactinfo.getString("email")+ "\n"+
                        getResources().getString(R.string.mosdir)+": "+ contactinfo.getString("dir")+ "\n"+
                        getResources().getString(R.string.mospais)+": "+ contactinfo.getString("pais")+ "\n"+
                         getResources().getString(R.string.mosciu)+": "+ contactinfo.getString("ciudad")+"\n"


        );
        texinfocom.setText(texinfocom.getText()+"Favoritos: "+ "\n");

        CheckBox chleer= (CheckBox) findViewById(R.id.checkleer);
        if (chleer.isChecked()){
            texinfocom.setText(texinfocom.getText()+"- "+chleer.getText() + "\n");

        }
        CheckBox chvertv= (CheckBox) findViewById(R.id.checkvertv);
        if (chvertv.isChecked()){
            texinfocom.setText(texinfocom.getText()+"- "+chvertv.getText() + "\n");

        }
        CheckBox chbailar= (CheckBox) findViewById(R.id.checkbailar);
        if (chbailar.isChecked()){
            texinfocom.setText(texinfocom.getText()+"- "+chbailar.getText() + "\n");

        }
        CheckBox chcantar= (CheckBox) findViewById(R.id.checkcantar);
        if (chcantar.isChecked()){
            texinfocom.setText(texinfocom.getText()+"- "+chcantar.getText() + "\n");

        }
        CheckBox chnadar= (CheckBox) findViewById(R.id.checknadar);
        if (chnadar.isChecked()){
            texinfocom.setText(texinfocom.getText()+"- "+chnadar.getText() + "\n");

        }




    }

}
