package in.galgotias.bloodbank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;



public class BloodSelector extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.content_blood_selector);

        TextView bloodselection = (TextView) findViewById(R.id.btnClicked);


        bloodselection.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Spinner Blood = (Spinner) findViewById(R.id.Blood);
                String BType = String.valueOf(Blood.getSelectedItem());

                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), ShowBank.class);
                i.putExtra("BloodType", BType);
                startActivity(i);
            }

        });


            }

    }