package in.galgotias.bloodbank;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;



public class ShowBank extends Activity {
    public static final String Blood_Type = "BloodType";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showbank);

        Intent i = getIntent();
        String messageText = i.getStringExtra(Blood_Type);
        TextView Blood_Bank = (TextView)findViewById(R.id.BBank);
        TextView Address = (TextView)findViewById(R.id.Address);
        TextView Phone = (TextView)findViewById(R.id.phone);


        TextView Blood_Bank2 = (TextView)findViewById(R.id.BBank2);
        TextView Address2 = (TextView)findViewById(R.id.Address2);
        TextView Phone2 = (TextView)findViewById(R.id.phone2);


                String BloodB = "1.All India Institute of Medical Sciences (AIIMS)";
                String address = "AIIMS, Main Blood Bank, Ansari Nagar, Ring Road";
                String phone = "011 26594438, 011 26594400";

        String BloodB2 = "2.Dr. Ram Manohar Lohia Hospital";
        String address2 = "Baba Kharak Singh Marg, near Gurudwara Bangla Sahib, Connaught Place";
        String phone2 = "011 26594438, 011 26594400";

        Blood_Bank.setText(BloodB);
        Address.setText(address);
        Phone.setText(phone);

        Blood_Bank2.setText(BloodB2);
        Address2.setText(address2);
        Phone2.setText(phone2);





        }




    }

