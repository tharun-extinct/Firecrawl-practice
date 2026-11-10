package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wp3 extends i73 implements hd5, ej4 {
    public boolean f;
    public q2 o;

    public final void Q0(nj4 nj4Var) {
        this.f = true;
        this.o.a(nj4Var);
        br2.d(this);
    }

    public final void R0() {
        this.f = false;
        br2.d(this);
    }

    @Override // defpackage.ej4
    public final void l0(nj4 nj4Var) {
        if (this.f) {
            return;
        }
        this.o.a(nj4Var);
    }

    @Override // defpackage.ej4
    public final boolean p0() {
        return true;
    }

    @Override // defpackage.hd5
    public final Object s() {
        return d52.q;
    }
}
