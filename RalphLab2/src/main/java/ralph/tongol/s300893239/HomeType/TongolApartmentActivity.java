package ralph.tongol.s300893239.HomeType;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import ralph.tongol.s300893239.R;
import ralph.tongol.s300893239.TongolCheckoutActivity;

import ralph.tongol.s300893239.R;
import ralph.tongol.s300893239.TongolCheckoutActivity;

public class TongolApartmentActivity extends AppCompatActivity {

    /*
    Ralph Lawrence G. Tongol
    300893239
    002
    */

    private CheckBox cb1, cb2, cb3;
    private TextView txt1, txt2, txt3;
    private SharedPreferences spApartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tongol_apartment);

        findAllViews();
        spApartment = PreferenceManager.getDefaultSharedPreferences(this);
    }

    private void findAllViews() {
        cb1 = findViewById(R.id.ralphCb1);
        cb2 = findViewById(R.id.ralphCb2);
        cb3 = findViewById(R.id.ralphCb3);

        txt1 = findViewById(R.id.ralphPrice1);
        txt2 = findViewById(R.id.ralphPrice2);
        txt3 = findViewById(R.id.ralphPrice3);

    }

    public void onCheckoutClick(View view){
        SharedPreferences.Editor editor = spApartment.edit();

        if (cb1.isChecked()){
            editor.putString("cb1", cb1.getText().toString());
            editor.putString("price1", txt1.getText().toString());
        }

        if (cb2.isChecked()){
            editor.putString("cb2", cb2.getText().toString());
            editor.putString("price2", txt2.getText().toString());
        }

        if (cb3.isChecked()){
            editor.putString("cb3", cb3.getText().toString());
            editor.putString("price3", txt3.getText().toString());
        }

        editor.apply();

        if ((cb1.isChecked()) || (cb2.isChecked()) || (cb3.isChecked())){
            startActivity(new Intent(getApplicationContext(), TongolCheckoutActivity.class));
        } else {
            Toast.makeText(this, "Please do appropriate selection.", Toast.LENGTH_SHORT).show();
        }
    }
}