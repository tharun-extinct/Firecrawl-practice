package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w55 implements r45 {
    public final /* synthetic */ b65 g;

    public w55(b65 b65Var) {
        this.g = b65Var;
    }

    @Override // defpackage.r45
    public final void g() {
        b65 b65Var = this.g;
        b65Var.s(null);
        b65Var.b(null);
    }

    @Override // defpackage.r45
    public final void n(long j, up upVar) {
        k75 k75VarN;
        b65 b65Var = this.g;
        long jG = si4.g(b65Var.a(true));
        mt2 mt2Var = b65Var.n;
        if (mt2Var == null || (k75VarN = mt2Var.n()) == null) {
            return;
        }
        long jV = k75VarN.v(jG);
        b65Var.c = jV;
        b65Var.b(new wi3(jV));
        b65Var.b = 0L;
        b65Var.s(p42.j);
        b65Var.h(false);
    }

    @Override // defpackage.r45
    public final void v(long j) {
        k75 k75VarN;
        y42 y42Var;
        b65 b65Var = this.g;
        b65Var.b = wi3.v(b65Var.b, j);
        mt2 mt2Var = b65Var.n;
        if (mt2Var == null || (k75VarN = mt2Var.n()) == null) {
            return;
        }
        b65Var.b(new wi3(wi3.v(b65Var.c, b65Var.b)));
        aj3 aj3Var = b65Var.y;
        wi3 wi3VarL = b65Var.l();
        wi3VarL.getClass();
        int iN = aj3Var.n(k75VarN.y(wi3VarL.g, true));
        long jY = sp2.y(iN, iN);
        if (u75.y(jY, b65Var.q().y)) {
            return;
        }
        mt2 mt2Var2 = b65Var.n;
        if ((mt2Var2 == null || ((Boolean) mt2Var2.s.getValue()).booleanValue()) && (y42Var = b65Var.a) != null) {
            ((zs3) y42Var).g(9);
        }
        b65Var.r.a(b65.y(b65Var.q().g, jY));
        b65Var.o = new u75(jY);
    }

    @Override // defpackage.r45
    public final void y() {
        b65 b65Var = this.g;
        b65Var.s(null);
        b65Var.b(null);
    }

    @Override // defpackage.r45
    public final void onCancel() {
    }

    @Override // defpackage.r45
    public final void r() {
    }
}
