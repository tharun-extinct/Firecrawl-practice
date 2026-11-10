package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tc5 extends sc5 {
    public final /* synthetic */ mr g;
    public final /* synthetic */ uc5 y;

    public tc5(uc5 uc5Var, mr mrVar) {
        this.y = uc5Var;
        this.g = mrVar;
    }

    @Override // defpackage.sc5, defpackage.ic5
    public final void g(lc5 lc5Var) {
        ((ArrayList) this.g.get(this.y.t)).remove(lc5Var);
        lc5Var.e(this);
    }
}
