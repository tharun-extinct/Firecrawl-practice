package io.appground.blek;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import defpackage.d52;
import defpackage.ic2;
import defpackage.pi1;
import defpackage.x74;
import defpackage.y94;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class MainInitializer implements ic2 {
    @Override // defpackage.ic2
    public final List g() {
        return pi1.j;
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        context.getClass();
        d52 d52Var = new d52((byte) 8);
        SharedPreferences sharedPreferencesD = y94.d(context);
        if (sharedPreferencesD != null) {
            boolean z = false;
            try {
                long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                if (sharedPreferences.getLong("first_start_time", System.currentTimeMillis()) < j) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (!sharedPreferencesD.contains("first_start_time") || z) {
                SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                editorEdit.getClass();
                editorEdit.putLong("first_start_time", System.currentTimeMillis());
                editorEdit.putInt("first_start_version", 263);
                editorEdit.putString("instance_id", UUID.randomUUID().toString());
                editorEdit.commit();
            }
            if (!sharedPreferencesD.contains("instance_id")) {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesD.edit();
                editorEdit2.getClass();
                editorEdit2.putString("instance_id", UUID.randomUUID().toString());
                editorEdit2.commit();
            }
        }
        x74.g(context, R.font.montserrat);
        return d52Var;
    }
}
