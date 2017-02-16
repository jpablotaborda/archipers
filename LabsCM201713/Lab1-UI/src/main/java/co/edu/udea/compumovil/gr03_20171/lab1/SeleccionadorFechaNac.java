package co.edu.udea.compumovil.gr03_20171.lab1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.icu.text.DateFormat;

import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by jpablo.taborda on 9/02/17.
 */

 public  class SeleccionadorFechaNac extends android.support.v4.app.DialogFragment implements DatePickerDialog.OnDateSetListener {
    public int año;
    public int mes;
    public int dia;
    String fechanac;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c=  Calendar.getInstance();

        año=c.YEAR;
        mes=  c.MONTH;
        dia= c.DAY_OF_MONTH;
        DatePickerDialog diafecha=new DatePickerDialog(getActivity(),this, año,mes,dia );

        return diafecha;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int yea, int mon, int day) {
        fechanac="";

        fechanac=day+"/"+(mon+1)+"/"+yea;

    }
}
