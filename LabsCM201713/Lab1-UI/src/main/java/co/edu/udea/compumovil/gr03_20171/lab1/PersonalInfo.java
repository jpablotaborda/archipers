package co.edu.udea.compumovil.gr03_20171.lab1;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class PersonalInfo extends AppCompatActivity {
    String nom;
    String ape;
    String sexo;
    SeleccionadorFechaNac fecha;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Spinner spiesco = (Spinner) findViewById(R.id.spinneresco);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.escolaridad, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiesco.setAdapter(adaptador);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void mostrarcal(View v) {
        fecha = new SeleccionadorFechaNac();
        if (fecha != null) {

            fecha.show(getSupportFragmentManager(), "datePicker");
        }


    }

    public void mostrarconinfo(View v) {
        Intent mosconifo = new Intent(this, ContactInfo.class);
        EditText camnom = (EditText) findViewById(R.id.camnom);
        EditText camape = (EditText) findViewById(R.id.camape);
        Spinner esco = (Spinner) findViewById(R.id.spinneresco);
        Bundle infoper = new Bundle();
        String fechanac = fecha.fechanac;


        infoper.putString("nombre", camnom.getText().toString());
        infoper.putString("apellido", camape.getText().toString());
        infoper.putString("sexo", sexo);
        infoper.putString("esco", esco.getSelectedItem().toString());
        infoper.putString("fechanac", fechanac);
        Bundle globalalm = new Bundle();
        globalalm.putBundle("infoper", infoper);
        mosconifo.putExtras(globalalm);
        startActivity(mosconifo);

    }

    public void selsexo(View v) {
        boolean seleccionado = ((RadioButton) v).isChecked();
        RadioButton radsel;
        if (seleccionado) {
            radsel = (RadioButton) findViewById(v.getId());
            sexo = radsel.getText().toString();

        }

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("PersonalInfo Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
