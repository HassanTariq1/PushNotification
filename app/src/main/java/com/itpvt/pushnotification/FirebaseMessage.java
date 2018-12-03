package com.itpvt.pushnotification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



public class FirebaseMessage extends FirebaseMessagingService {


//    @Override
//    public void onMessageReceived(RemoteMessage remoteMessage) {
//        Intent i= new Intent(this, MainActivity.class);
//        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        PendingIntent pi= PendingIntent.getActivity(this, 0, i,PendingIntent.FLAG_ONE_SHOT);
//        NotificationCompat.Builder noti= new NotificationCompat.Builder(this);
//        noti.setContentTitle("Hala Madrid ");
//        noti.setContentText(remoteMessage.getNotification().getBody());
//        noti.setAutoCancel(true);
//        noti.setSmallIcon(R.mipmap.ic_launcher);
//
//        noti.setContentIntent(pi);
//
//        NotificationManager manager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//
//        manager.notify(0,noti.build());
//    }
}
