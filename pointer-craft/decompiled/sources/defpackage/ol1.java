package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ol1 {
    public final tp3 a;
    public final ox0 g;
    public final tp3 j;
    public final pp3 l;
    public final rp3 n;
    public final st4 r;
    public final rp3 t;
    public iv4 v;
    public final tp3 x;
    public final xy1 y;

    public ol1(ox0 ox0Var, xy1 xy1Var) {
        ox0Var.getClass();
        this.g = ox0Var;
        this.y = xy1Var;
        this.r = new st4();
        this.n = new rp3(0L);
        this.x = kq2.M(null);
        this.l = new pp3(0.0f);
        this.j = kq2.M(Boolean.FALSE);
        this.t = new rp3(0L);
        this.a = kq2.M(f44.j);
    }

    public final void g(xy1 xy1Var) {
        if (y() == f44.a) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            st4 st4Var = this.r;
            boolean zIsEmpty = st4Var.isEmpty();
            rp3 rp3Var = this.t;
            st4Var.add(xy1Var.a(Long.valueOf(zIsEmpty ? 0L : jCurrentTimeMillis - rp3Var.d())));
            if (st4Var.size() == 1) {
                this.v = m50.T(this.g, null, new cg(this, jCurrentTimeMillis, null, (byte) 1), 3);
            }
            rp3Var.e(jCurrentTimeMillis);
        }
    }

    public final f44 y() {
        return (f44) this.a.getValue();
    }
}
