package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* JADX INFO: loaded from: classes2.dex */
public final class ql extends BroadcastReceiver {
    public final /* synthetic */ byte g;
    public Object y;

    public /* synthetic */ ql(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    public void g() {
        wh4 wh4Var = FirebaseInstanceId.t;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        ((l05) this.y).g().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.g) {
            case 0:
                ((u1) this.y).a();
                break;
            case 1:
                intent.getClass();
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    ((ez3) this.y).z(Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)));
                    break;
                }
                break;
            case 2:
                intent.getClass();
                String action2 = intent.getAction();
                if (action2 != null && action2.hashCode() == 1260591598 && action2.equals("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED")) {
                    ((dz3) this.y).setValue(intent.getStringExtra("android.bluetooth.adapter.extra.LOCAL_NAME"));
                    break;
                }
                break;
            default:
                l05 l05Var = (l05) this.y;
                if (l05Var != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) l05Var.g().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                        }
                        l05 l05Var2 = (l05) this.y;
                        l05Var2.a.getClass();
                        FirebaseInstanceId.n(l05Var2, 0L);
                        ((l05) this.y).g().unregisterReceiver(this);
                        this.y = null;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ql() {
        this.g = (byte) 3;
    }
}
