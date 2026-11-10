package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ka3 {
    public static final Object m = new Object();
    public final y9 a;
    public boolean j;
    public int l;
    public boolean n;
    public boolean t;
    public volatile Object v;
    public volatile Object x;
    public final Object g = new Object();
    public final lc4 y = new lc4();
    public int r = 0;

    public ka3() {
        Object obj = m;
        this.x = obj;
        this.a = new y9(this, (byte) 4);
        this.v = obj;
        this.l = -1;
    }

    public static void g(String str) {
        tq.K().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        l0.z(du4.i("Cannot invoke ", str, " on a background thread"));
    }

    public final void r(Object obj) {
        g("setValue");
        this.l++;
        this.v = obj;
        y(null);
    }

    public final void y(ex2 ex2Var) {
        if (this.j) {
            this.t = true;
            return;
        }
        this.j = true;
        do {
            this.t = false;
            if (ex2Var != null) {
                if (ex2Var.y) {
                    int i = ex2Var.r;
                    int i2 = this.l;
                    if (i < i2) {
                        ex2Var.r = i2;
                        ex2Var.g.N(this.v);
                    }
                }
                ex2Var = null;
            } else {
                lc4 lc4Var = this.y;
                lc4Var.getClass();
                jc4 jc4Var = new jc4(lc4Var);
                lc4Var.a.put(jc4Var, Boolean.FALSE);
                while (jc4Var.hasNext()) {
                    ex2 ex2Var2 = (ex2) ((Map.Entry) jc4Var.next()).getValue();
                    if (ex2Var2.y) {
                        int i3 = ex2Var2.r;
                        int i4 = this.l;
                        if (i3 < i4) {
                            ex2Var2.r = i4;
                            ex2Var2.g.N(this.v);
                        }
                    }
                    if (this.t) {
                        break;
                    }
                }
            }
        } while (this.t);
        this.j = false;
    }
}
