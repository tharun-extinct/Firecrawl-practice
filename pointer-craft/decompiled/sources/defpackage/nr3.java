package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class nr3 {
    public static final nr3 r = new nr3(xi1.a, new q21((byte) 9));
    public final q21 g;
    public final yy3 y;

    public nr3(xi1 xi1Var, q21 q21Var) {
        yy3 yy3Var;
        this.g = q21Var;
        if (xi1Var.t) {
            yy3Var = xi1.m;
        } else {
            int iMyPid = Process.myPid();
            String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : du4.w(iMyPid, "Process pid(", ")");
            synchronized (xi1Var.j) {
                if (!xi1Var.t) {
                    xi1.m = new yy3(xi1Var, iMyPid, processName);
                    xi1Var.t = true;
                }
            }
            yy3Var = xi1.m;
        }
        this.y = yy3Var;
    }
}
