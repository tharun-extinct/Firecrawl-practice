package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj6 {
    public final Context g;
    public byte r = 0;
    public int y;

    public cj6(Context context) {
        this.g = context;
    }

    public final synchronized int g() {
        byte b = this.r;
        if (b != 0) {
            return b;
        }
        PackageManager packageManager = this.g.getPackageManager();
        if (is5.g(this.g).i() == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i = 1;
        if (!zc6.y()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.r = (byte) 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.r = (byte) 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (zc6.y()) {
            this.r = (byte) 2;
            i = 2;
        } else {
            this.r = (byte) 1;
        }
        return i;
    }
}
