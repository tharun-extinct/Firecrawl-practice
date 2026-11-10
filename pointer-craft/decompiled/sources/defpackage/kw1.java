package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends nw1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ pw1 y;

    public /* synthetic */ kw1(pw1 pw1Var, byte b) {
        this.g = b;
        this.y = pw1Var;
    }

    @Override // defpackage.nw1
    public final void g() {
        switch (this.g) {
            case 0:
                pw1 pw1Var = this.y;
                pw1Var.c0.P();
                k33.G(pw1Var);
                Bundle bundle = pw1Var.t;
                pw1Var.c0.Q(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                pw1 pw1Var2 = this.y;
                eu0 eu0Var = pw1Var2.Y;
                yk ykVar = pw1Var2.B.k;
                eu0Var.y = ykVar;
                Iterator it = eu0Var.g.iterator();
                while (it.hasNext()) {
                    ((yj3) it.next()).g(ykVar);
                }
                break;
        }
    }
}
