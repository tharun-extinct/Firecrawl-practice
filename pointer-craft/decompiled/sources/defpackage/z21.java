package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z21 implements p14 {
    public final p14 g;
    public final p14 n;
    public final ke4 r;
    public final p14 v;
    public final p14 y;

    public z21(p14 p14Var, p14 p14Var2, ke4 ke4Var, p14 p14Var3, p14 p14Var4) {
        this.g = p14Var;
        this.y = p14Var2;
        this.r = ke4Var;
        this.n = p14Var3;
        this.v = p14Var4;
    }

    @Override // defpackage.p14
    public final Object get() {
        return new y21((Executor) this.g.get(), (t53) this.y.get(), (ro) this.r.get(), (bc4) this.n.get(), (bc4) this.v.get());
    }
}
