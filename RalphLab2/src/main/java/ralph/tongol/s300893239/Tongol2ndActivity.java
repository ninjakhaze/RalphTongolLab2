package ralph.tongol.s300893239;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ralph.tongol.s300893239.HomeType.TongolApartmentActivity;
import ralph.tongol.s300893239.HomeType.TongolCondominiumActivity;
import ralph.tongol.s300893239.HomeType.TongolDetachedHomeActivity;
import ralph.tongol.s300893239.HomeType.TongolSemiDetachedActivity;
import ralph.tongol.s300893239.HomeType.TongolTownHouseActivity;

public class Tongol2ndActivity extends AppCompatActivity {

    private TextView tvMenuText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tongol_2nd);

        tvMenuText = findViewById(R.id.RalphMenuText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tongol_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.ralphApartment:
                startActivity(new Intent(getApplicationContext(), TongolApartmentActivity.class));
                return true;
            case R.id.ralphDetached_home:
                startActivity(new Intent(getApplicationContext(), TongolDetachedHomeActivity.class));
                return true;
            case R.id.ralphSemi_detached_home:
                startActivity(new Intent(getApplicationContext(), TongolSemiDetachedActivity.class));
                return true;
            case R.id.ralphCondo_apartment:
                startActivity(new Intent(getApplicationContext(), TongolCondominiumActivity.class));
                return true;
            case R.id.ralphTown_house:
                startActivity(new Intent(getApplicationContext(), TongolTownHouseActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
