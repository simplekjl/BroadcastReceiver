package company.example.broadcastreceiver.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by admin on 2/4/2016.
 */
public class DynamicBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

            CharSequence intentData = intent.getCharSequenceExtra("message");
            Toast.makeText(context, "Hello I'm a dynamic receiver: "+intentData.toString(), Toast.LENGTH_LONG).show();

    }
}
