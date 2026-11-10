package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.dz5;
import defpackage.h71;
import defpackage.jy3;
import defpackage.og0;
import defpackage.sq;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            og0.L(context, new sq((byte) 1), new jy3(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        jy3 jy3Var = new jy3(this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new h71((byte) 1, 11, jy3Var, null).run();
                        return;
                    }
                    return;
                }
                jy3 jy3Var2 = new jy3(this);
                try {
                    og0.E(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new h71((byte) 1, 10, jy3Var2, null).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new h71((byte) 1, 7, jy3Var2, e).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            jy3 jy3Var3 = new jy3(this);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                dz5.n(context, jy3Var3);
            } else if (!"SAVE_PROFILE".equals(string2)) {
                jy3Var3.q(16, null);
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                jy3Var3.q(12, null);
            }
        }
    }
}
