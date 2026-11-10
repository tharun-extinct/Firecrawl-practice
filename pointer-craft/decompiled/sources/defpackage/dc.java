package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dc implements va1 {
    public final /* synthetic */ kx1 g;
    public final /* synthetic */ q54 n;
    public final /* synthetic */ qx1 r;
    public final /* synthetic */ pw1 y;

    public dc(kx1 kx1Var, pw1 pw1Var, qx1 qx1Var, q54 q54Var) {
        this.g = kx1Var;
        this.y = pw1Var;
        this.r = qx1Var;
        this.n = q54Var;
    }

    @Override // defpackage.va1
    public final void g() {
        pw1 pw1Var;
        kx1 kx1Var = this.g;
        kb5 kb5Var = kx1Var.r;
        pw1 pw1Var2 = this.y;
        tx1 tx1Var = (tx1) ((HashMap) kb5Var.t).get(pw1Var2.q);
        if (tx1Var == null || (pw1Var = tx1Var.r) != pw1Var2) {
            kx1Var.k0(new IllegalStateException(du4.c("Fragment ", pw1Var2, " is not currently in the FragmentManager")));
            throw null;
        }
        this.r.g.setValue(pw1Var.j > -1 ? new ow1(tx1Var.i()) : null);
        if (this.n.j) {
            fw fwVar = new fw(kx1Var);
            fwVar.j(pw1Var2);
            if (fwVar.l) {
                l0.z("This transaction is already being added to the back stack");
                return;
            } else {
                fwVar.s.B(fwVar, true);
                return;
            }
        }
        if (kx1Var.S()) {
            return;
        }
        fw fwVar2 = new fw(kx1Var);
        fwVar2.j(pw1Var2);
        if (fwVar2.l) {
            l0.z("This transaction is already being added to the back stack");
        } else {
            fwVar2.s.B(fwVar2, false);
        }
    }
}
