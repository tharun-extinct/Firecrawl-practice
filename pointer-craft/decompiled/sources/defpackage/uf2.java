package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uf2 extends i73 implements lm2 {
    public int D(zy2 zy2Var, p33 p33Var, int i) {
        return p33Var.Z(i);
    }

    public abstract long Q0(p33 p33Var, long j);

    public abstract boolean R0();

    @Override // defpackage.lm2
    public int W(zy2 zy2Var, p33 p33Var, int i) {
        return p33Var.P(i);
    }

    public int i(zy2 zy2Var, p33 p33Var, int i) {
        return p33Var.x(i);
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        long jQ0 = Q0(p33Var, j);
        if (R0()) {
            jQ0 = zs0.v(j, jQ0);
        }
        us3 us3VarV = p33Var.v(jQ0);
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 3));
    }

    @Override // defpackage.lm2
    public int x(zy2 zy2Var, p33 p33Var, int i) {
        return p33Var.Y(i);
    }
}
