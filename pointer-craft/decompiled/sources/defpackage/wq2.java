package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq2 {
    public final qc4 g;
    public final hb3 r;
    public final ln y;

    public wq2(qc4 qc4Var, ln lnVar) {
        this.g = qc4Var;
        this.y = lnVar;
        long[] jArr = ee4.g;
        this.r = new hb3();
    }

    public final bz1 g(int i, Object obj, Object obj2) {
        hb3 hb3Var = this.r;
        vq2 vq2Var = (vq2) hb3Var.l(obj);
        byte b = 12;
        if (vq2Var != null && vq2Var.r == i && yf2.p(vq2Var.y, obj2)) {
            nm0 nm0Var = vq2Var.n;
            if (nm0Var != null) {
                return nm0Var;
            }
            nm0 nm0Var2 = new nm0(818252804, true, new vn(vq2Var.v, vq2Var, b));
            vq2Var.n = nm0Var2;
            return nm0Var2;
        }
        vq2 vq2Var2 = new vq2(this, i, obj, obj2);
        hb3Var.c(obj, vq2Var2);
        nm0 nm0Var3 = vq2Var2.n;
        if (nm0Var3 != null) {
            return nm0Var3;
        }
        nm0 nm0Var4 = new nm0(818252804, true, new vn(this, vq2Var2, b));
        vq2Var2.n = nm0Var4;
        return nm0Var4;
    }

    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        vq2 vq2Var = (vq2) this.r.l(obj);
        if (vq2Var != null) {
            return vq2Var.y;
        }
        yq2 yq2Var = (yq2) this.y.g();
        int iV = yq2Var.v(obj);
        if (iV != -1) {
            return yq2Var.r(iV);
        }
        return null;
    }
}
