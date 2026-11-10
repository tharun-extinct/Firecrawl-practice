package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import io.appground.blek.MainApp;

/* JADX INFO: loaded from: classes.dex */
public class Application extends MainApp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.appground.blek.MainApp, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
