package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z72 implements hu4 {
    public boolean a;
    public final a92 j;
    public final /* synthetic */ f82 m;
    public final ew1 t;

    public z72(f82 f82Var, a92 a92Var) {
        a92Var.getClass();
        this.m = f82Var;
        this.j = a92Var;
        this.t = new ew1(((h34) f82Var.r.a).j.r());
    }

    @Override // defpackage.hu4
    public long j(long j, c70 c70Var) throws IOException {
        f82 f82Var = this.m;
        c70Var.getClass();
        try {
            return ((h34) f82Var.r.a).j(j, c70Var);
        } catch (IOException e) {
            f82Var.y.j();
            y(f82.x);
            throw e;
        }
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.t;
    }

    public final void y(c52 c52Var) {
        hj3 hj3Var;
        bi6 bi6Var;
        c52Var.getClass();
        f82 f82Var = this.m;
        byte b = f82Var.n;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            uo1.z("state: ", f82Var.n);
            return;
        }
        ew1 ew1Var = this.t;
        m95 m95Var = ew1Var.v;
        ew1Var.v = m95.n;
        m95Var.g();
        m95Var.y();
        f82Var.n = (byte) 6;
        if (c52Var.size() <= 0 || (hj3Var = f82Var.g) == null || (bi6Var = hj3Var.a) == null) {
            return;
        }
        y82.y(bi6Var, this.j, c52Var);
    }
}
