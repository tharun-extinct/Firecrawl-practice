package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uj5 extends i73 implements wd1 {
    public ho4 d;
    public ek1 f;
    public dm1 k;
    public cc5 o;

    @Override // defpackage.wd1
    public final void R(wm2 wm2Var) {
        wm2Var.g();
        cc5 cc5Var = this.o;
        tj5 tj5Var = new tj5(this, (byte) 0);
        ho4 ho4Var = this.d;
        bc5 bc5VarG = cc5Var.g(tj5Var, ho4Var.g() ? new jj0(ho4Var.v) : null, null, new tj5(this, (byte) 1));
        ho4 ho4Var2 = this.d;
        long j = ((jj0) bc5VarG.getValue()).g;
        t52 t52Var = ho4Var2.r;
        if (ho4Var2.y() && ((Boolean) ((tp3) t52Var.l).getValue()).booleanValue()) {
            j = ((jj0) ((tp3) t52Var.j).getValue()).g;
        }
        long j2 = j;
        if (ho4Var2.y()) {
            ho4Var2.v = j2;
        }
        if (jj0.r(j2) == 0.0f) {
            return;
        }
        mc5 mc5Var = this.f.g;
        mc5 mc5Var2 = this.k.g;
        xd1.B(wm2Var, j2, 0L, 0L, 0.0f, 126);
    }
}
