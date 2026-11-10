package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class dd2 {
    public final nt2 g;
    public boolean v;
    public final qd y;
    public final Object r = new Object();
    public final rb3 n = new rb3(new dn5[16]);

    public dd2(nt2 nt2Var, qd qdVar) {
        this.g = nt2Var;
        this.y = qdVar;
    }

    public final ci3 g(EditorInfo editorInfo) {
        ci3 di3Var;
        synchronized (this.r) {
            if (this.v) {
                return null;
            }
            h44 h44VarG = this.g.g(editorInfo);
            h hVar = new h(this, (byte) 26);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                di3Var = new fi3(h44VarG, hVar);
            } else {
                di3Var = i >= 25 ? new di3(h44VarG, hVar) : new ci3(h44VarG, hVar);
            }
            this.n.y(new dn5(di3Var));
            return di3Var;
        }
    }

    public final boolean y() {
        return !this.v;
    }
}
