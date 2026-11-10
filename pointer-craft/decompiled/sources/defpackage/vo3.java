package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vo3 extends zz4 implements bz1 {
    public final /* synthetic */ float b;
    public final /* synthetic */ xo3 c;
    public final /* synthetic */ int i;
    public boolean q;
    public final /* synthetic */ oi s;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(xo3 xo3Var, int i, float f, oi oiVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = xo3Var;
        this.i = i;
        this.b = f;
        this.s = oiVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        vo3 vo3Var = new vo3(this.c, this.i, this.b, this.s, mu0Var);
        vo3Var.w = obj;
        return vo3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((vo3) b((mu0) obj2, (pf4) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        int i;
        boolean z = this.q;
        og5 og5Var = og5.g;
        if (z) {
            if (z) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        pf4 pf4Var = (pf4) this.w;
        xo3 xo3Var = this.c;
        ns2 ns2Var = new ns2(pf4Var, xo3Var, (byte) 1);
        this.q = true;
        yo3 yo3Var = zo3.g;
        int i2 = this.i;
        xo3Var.s.e(xo3Var.a(new Integer(i2).intValue()));
        boolean z2 = i2 > xo3Var.v;
        int iV = (ns2Var.v() - xo3Var.v) + 1;
        if (((z2 && i2 > ns2Var.v()) || (!z2 && i2 < xo3Var.v)) && Math.abs(i2 - xo3Var.v) >= 3) {
            if (z2) {
                i = i2 - iV;
                int i3 = xo3Var.v;
                if (i < i3) {
                    i = i3;
                }
            } else {
                int i4 = iV + i2;
                i = xo3Var.v;
                if (i4 <= i) {
                    i = i4;
                }
            }
            ns2Var.x(i);
        }
        Object objM = kq2.m(0.0f, ns2Var.y(i2) + this.b, this.s, new ta(new r54(), ns2Var, (byte) 23), this, 4);
        px0 px0Var = px0.j;
        if (objM != px0Var) {
            objM = og5Var;
        }
        return objM == px0Var ? px0Var : og5Var;
    }
}
