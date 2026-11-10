package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ey5 {
    public static final nm0 g = new nm0(1997540052, false, new os(9));

    public static wr g() throws InterruptedException {
        c6 c6Var = wr.j;
        wr wrVar = ((wr[]) c6Var.y)[1];
        if (wrVar == null) {
            long jNanoTime = System.nanoTime();
            wr.m.await(wr.q, TimeUnit.MILLISECONDS);
            if (((wr[]) c6Var.y)[1] != null || System.nanoTime() - jNanoTime < wr.w) {
                return null;
            }
            return wr.t;
        }
        long jNanoTime2 = wrVar.l - System.nanoTime();
        if (jNanoTime2 > 0) {
            wr.m.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c6Var.q(wrVar);
        wrVar.v = (byte) 2;
        return wrVar;
    }

    public static final zf5 n(ei2 ei2Var, int i) {
        String str = ei2Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = ei2Var.y;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = ei2Var.r;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = ei2Var.n;
        return new zf5(str, str2, str3, str4 != null ? str4 : "", 1.0f, null, i, ag5.j);
    }

    public static void r(wr wrVar) {
        if (wr.t == null) {
            wr.t = new wr();
            vr vrVar = new vr("Okio Watchdog");
            vrVar.setDaemon(true);
            vrVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = wrVar.r;
        boolean z = wrVar.g;
        if (j != 0 && z) {
            wrVar.l = Math.min(j, wrVar.r() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            wrVar.l = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            wrVar.l = wrVar.r();
        }
        c6 c6Var = wr.j;
        int i = c6Var.g + 1;
        c6Var.g = i;
        wr[] wrVarArr = (wr[]) c6Var.y;
        if (i == wrVarArr.length) {
            wr[] wrVarArr2 = new wr[i * 2];
            pr.Q(wrVarArr, wrVarArr2, 0, 0, 14);
            c6Var.y = wrVarArr2;
        }
        c6Var.j(i, wrVar);
        if (wrVar.x == 1) {
            wr.m.signal();
        }
    }

    public static zf5 v(String str, int i, float f, i63 i63Var, int i2) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            i63Var = null;
        }
        return new zf5(str, str, "", "", f2, i63Var, i, (i2 & 8) != 0 ? ag5.t : ag5.j);
    }

    public static final long y() {
        return Thread.currentThread().getId();
    }
}
