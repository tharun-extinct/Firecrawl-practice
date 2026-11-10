package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vh5 implements p14 {
    public final p14 g;
    public final p14 l;
    public final ke4 n;
    public final p14 r;
    public final p14 v;
    public final p14 x;
    public final p14 y;

    public vh5(p14 p14Var, p14 p14Var2, p14 p14Var3, ke4 ke4Var, p14 p14Var4, p14 p14Var5, p14 p14Var6) {
        this.g = p14Var;
        this.y = p14Var2;
        this.r = p14Var3;
        this.n = ke4Var;
        this.v = p14Var4;
        this.x = p14Var5;
        this.l = p14Var6;
    }

    @Override // defpackage.p14
    public final Object get() {
        return new uh5((Context) this.g.get(), (t53) this.y.get(), (bc4) this.r.get(), (ro) this.n.get(), (Executor) this.v.get(), (bc4) this.x.get(), new tg1((byte) 18), new f73((byte) 17), (bc4) this.l.get());
    }
}
