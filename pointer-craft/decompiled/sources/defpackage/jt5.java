package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jt5 {
    public final fu5 g;
    public final vg5 n;
    public final Context r;
    public final bt5 v;
    public final String y;

    public jt5(Context context, fu5 fu5Var, vg5 vg5Var) {
        this.y = context.getPackageName();
        this.g = fu5Var;
        this.n = vg5Var;
        this.r = context;
        fu5 fu5Var2 = et5.g;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (et5.g(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.v = new bt5(context, fu5Var, kt5.g, new vg5());
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    fu5Var2.y("Play Store package is not found.", new Object[0]);
                }
            } else {
                fu5Var2.y("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            fu5Var2.y("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        fu5Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", fu5.r(fu5Var.g, "Phonesky is not installed.", objArr));
        }
        this.v = null;
    }

    public static Bundle g(jt5 jt5Var, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", jt5Var.y);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        int i = 0;
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new tt5(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tt5 tt5Var = (tt5) obj;
            Bundle bundle2 = new Bundle();
            tt5Var.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", tt5Var.g);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
