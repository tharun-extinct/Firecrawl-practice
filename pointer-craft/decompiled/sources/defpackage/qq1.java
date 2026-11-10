package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq1 {
    public float g;
    public ue2 l;
    public float n;
    public float r;
    public final qg v;
    public ue2 x;
    public float y;

    public qq1(float f, float f2, float f3, float f4) {
        this.g = f;
        this.y = f2;
        this.r = f3;
        this.n = f4;
        this.v = new qg(new vb1(f), m50.i, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, og5] */
    public final Object g(ue2 ue2Var, ou0 ou0Var) {
        oq1 oq1Var;
        float f;
        qg qgVar = this.v;
        if (ou0Var instanceof oq1) {
            oq1Var = (oq1) ou0Var;
            int i = oq1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oq1Var.c = i - Integer.MIN_VALUE;
            } else {
                oq1Var = new oq1(this, ou0Var);
            }
        } else {
            oq1Var = new oq1(this, ou0Var);
        }
        Object obj = oq1Var.q;
        int i2 = oq1Var.c;
        try {
            if (i2 == 0) {
                js2.o(obj);
                if (ue2Var instanceof mx3) {
                    f = this.y;
                } else if (ue2Var instanceof p72) {
                    f = this.r;
                } else {
                    f = ue2Var instanceof gt1 ? this.n : this.g;
                }
                this.l = ue2Var;
                if (!vb1.y(((vb1) qgVar.v.getValue()).j, f)) {
                    ue2 ue2Var2 = this.x;
                    oq1Var.m = ue2Var;
                    oq1Var.c = 1;
                    Object objG = yg1.g(qgVar, f, ue2Var2, ue2Var, oq1Var);
                    px0 px0Var = px0.j;
                    if (objG == px0Var) {
                        return px0Var;
                    }
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ue2Var = oq1Var.m;
                js2.o(obj);
            }
            this.x = ue2Var;
            this = og5.g;
            return this;
        } catch (Throwable th) {
            this.x = ue2Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(ou0 ou0Var) {
        pq1 pq1Var;
        float f;
        if (ou0Var instanceof pq1) {
            pq1Var = (pq1) ou0Var;
            int i = pq1Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq1Var.w = i - Integer.MIN_VALUE;
            } else {
                pq1Var = new pq1(this, ou0Var);
            }
        } else {
            pq1Var = new pq1(this, ou0Var);
        }
        Object obj = pq1Var.m;
        int i2 = pq1Var.w;
        try {
            if (i2 == 0) {
                js2.o(obj);
                ue2 ue2Var = this.l;
                if (ue2Var instanceof mx3) {
                    f = this.y;
                } else if (ue2Var instanceof p72) {
                    f = this.r;
                } else {
                    f = ue2Var instanceof gt1 ? this.n : this.g;
                }
                qg qgVar = this.v;
                if (!vb1.y(((vb1) qgVar.v.getValue()).j, f)) {
                    vb1 vb1Var = new vb1(f);
                    pq1Var.w = 1;
                    Object objV = qgVar.v(pq1Var, vb1Var);
                    px0 px0Var = px0.j;
                    if (objV == px0Var) {
                        return px0Var;
                    }
                }
                return og5.g;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
            this.x = this.l;
            return og5.g;
        } catch (Throwable th) {
            this.x = this.l;
            throw th;
        }
    }
}
