package defpackage;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z11 implements e52, f52 {
    public final xp2 g;
    public final Set n;
    public final n14 r;
    public final Executor v;
    public final Context y;

    public z11(Context context, String str, Set set, n14 n14Var, Executor executor) {
        this.g = new xp2(new w11(context, str, (byte) 0));
        this.n = set;
        this.v = executor;
        this.r = n14Var;
        this.y = context;
    }

    public final void g() {
        if (this.n.size() <= 0) {
            br2.s(null);
        } else if (!((UserManager) this.y.getSystemService(UserManager.class)).isUserUnlocked()) {
            br2.s(null);
        } else {
            br2.x(this.v, new Callable() { // from class: x11
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    z11 z11Var = this.g;
                    synchronized (z11Var) {
                        g52 g52Var = (g52) z11Var.g.get();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strG = ((b41) z11Var.r.get()).g();
                        synchronized (g52Var) {
                            g52Var.g.g(new bc(g52Var, g52.y(jCurrentTimeMillis), strG, new rw3(strG)));
                        }
                    }
                    return null;
                }
            });
        }
    }
}
