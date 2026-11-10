package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class xo1 implements en1 {
    public final q14 g;
    public final pz1 n;
    public final q14 r;
    public final q14 y;

    public xo1(q14 q14Var, q14 q14Var2, q14 q14Var3, pz1 pz1Var) {
        this.g = q14Var;
        this.y = q14Var2;
        this.r = q14Var3;
        this.n = pz1Var;
    }

    @Override // defpackage.p14
    public final Object get() {
        return new wo1((n14) this.g.get(), (n14) this.y.get(), (rm3) this.r.get(), (Executor) this.n.y);
    }
}
