package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nr2 {
    public final int g;
    public final /* synthetic */ pr2 r;
    public final ArrayList y = new ArrayList();

    public nr2(pr2 pr2Var, int i) {
        this.r = pr2Var;
        this.g = i;
    }

    public final int g() {
        return this.g;
    }

    public final void y(int i) {
        pr2 pr2Var = this.r;
        ok2 ok2Var = pr2Var.r;
        if (ok2Var == null) {
            return;
        }
        this.y.add(new dx3(ok2Var, i, pr2Var.y, null));
    }
}
