package jp.mixi.practice.messagingandnotification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by suino on 2015/02/25.
 */
public class IntentActivity2 extends Activity {

    public static final String ACTION_FIRST = "jp.mixi.practice.messagingandnotification.intent.action.FIRST";
    public static final String ACTION_SECOND = "jp.mixi.practice.messagingandnotification.intent.action.SECOND";
    public static final String ACTION_THIRD = "jp.mixi.practice.messagingandnotification.intent.action.THIRD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_2);

        View button1 = findViewById(R.id.CallAction1);
        View button2 = findViewById(R.id.CallAction2);
        View button3 = findViewById(R.id.CallAction3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(ACTION_FIRST);
                sendBroadcast(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(ACTION_SECOND);
                sendBroadcast(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(ACTION_THIRD);
                sendBroadcast(intent);
            }
        });
    }
}
