package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg3 {
    public i73 g;
    public xa3 n;
    public xa3 r;
    public boolean v;
    public final /* synthetic */ ah3 x;
    public int y;

    public yg3(ah3 ah3Var, i73 i73Var, int i, xa3 xa3Var, xa3 xa3Var2, boolean z) {
        this.x = ah3Var;
        this.g = i73Var;
        this.y = i;
        this.r = xa3Var;
        this.n = xa3Var2;
        this.v = z;
    }

    public final boolean g(int i, int i2) {
        h73 h73Var = (h73) this.r.l(this.y + i);
        h73 h73Var2 = (h73) this.n.l(this.y + i2);
        return yf2.p(h73Var, h73Var2) || h73Var.getClass() == h73Var2.getClass();
    }
}
