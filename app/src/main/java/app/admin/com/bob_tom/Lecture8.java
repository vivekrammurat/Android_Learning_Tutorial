package app.admin.com.bob_tom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class Lecture8 extends AppCompatActivity {
    private TelephonyManager telephony;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture8);

        TextView tv = findViewById(R.id.devise_info);

        telephony = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        StringBuilder sb = new StringBuilder();

        sb.append("Device id :").append(telephony.getDeviceId()).append("\n");
        sb.append("Devise Network Operator :").append(telephony.getNetworkOperator()).append("\n");
        sb.append("Phone Number :").append(telephony.getLine1Number()).append("\n");
        sb.append("Country ISO :").append(telephony.getNetworkCountryIso()).append("\n");
        sb.append("Network Operator name :").append(telephony.getNetworkOperatorName()).append("\n");
        sb.append("Sim Serial Number :").append(telephony.getSimSerialNumber()).append("\n");
        sb.append("Number of Sim :").append(telephony.getPhoneType()).append("\n");
        sb.append("Current Location :").append(telephony.getCellLocation()).append("\n");

        tv.setText(sb.toString());








    }
}
