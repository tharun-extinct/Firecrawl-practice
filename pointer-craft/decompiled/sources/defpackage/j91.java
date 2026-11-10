package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends zz4 implements bz1 {
    public final /* synthetic */ st4 c;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ n91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(ob3 ob3Var, n91 n91Var, st4 st4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = ob3Var;
        this.w = n91Var;
        this.c = st4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new j91(this.q, this.w, this.c, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        j91 j91Var = (j91) b((mu0) obj2, (ox0) obj);
        og5 og5Var = og5.g;
        j91Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        for (mc3 mc3Var : (Set) this.q.getValue()) {
            n91 n91Var = this.w;
            if (!((List) n91Var.y().v.j.getValue()).contains(mc3Var) && !this.c.contains(mc3Var)) {
                n91Var.y().r(mc3Var);
            }
        }
        return og5.g;
    }
}
