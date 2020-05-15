package com.ais.mimo.pocinsider

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.useinsider.insider.Insider


class InsiderFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        if (remoteMessage != null && remoteMessage.data
                .containsKey("source") && remoteMessage.data["source"] == "Insider"
        ) {
            Insider.Instance.handleNotification(applicationContext, remoteMessage)
            return
        }
    }
}