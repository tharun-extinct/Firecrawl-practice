package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y33 implements p33 {
    public final b43 a;
    public final p33 j;
    public final a43 t;

    public y33(p33 p33Var, a43 a43Var, b43 b43Var) {
        this.j = p33Var;
        this.t = a43Var;
        this.a = b43Var;
    }

    @Override // defpackage.p33
    public final int P(int i) {
        return this.j.P(i);
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        return this.j.Y(i);
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        return this.j.Z(i);
    }

    @Override // defpackage.p33
    public final Object a() {
        return this.j.a();
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        a43 a43Var = a43.t;
        p33 p33Var = this.j;
        b43 b43Var = this.a;
        b43 b43Var2 = b43.j;
        a43 a43Var2 = this.t;
        if (b43Var == b43Var2) {
            return new z33(a43Var2 == a43Var ? p33Var.Y(ws0.j(j)) : p33Var.P(ws0.j(j)), ws0.n(j) ? ws0.j(j) : 32767);
        }
        return new z33(ws0.v(j) ? ws0.t(j) : 32767, a43Var2 == a43Var ? p33Var.x(ws0.t(j)) : p33Var.Z(ws0.t(j)));
    }

    @Override // defpackage.p33
    public final int x(int i) {
        return this.j.x(i);
    }
}
