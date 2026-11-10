package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jw0 implements bz1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object z;

    public /* synthetic */ jw0(z83 z83Var, boolean z, xy1 xy1Var, cn4 cn4Var, j73 j73Var, boolean z2, qh4 qh4Var, z40 z40Var, zn3 zn3Var, bz1 bz1Var, nm0 nm0Var, int i) {
        this.w = z83Var;
        this.t = z;
        this.a = xy1Var;
        this.c = cn4Var;
        this.i = j73Var;
        this.m = z2;
        this.b = qh4Var;
        this.s = z40Var;
        this.p = zn3Var;
        this.u = bz1Var;
        this.z = nm0Var;
        this.q = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0106  */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        boolean z;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.z;
        Object obj4 = this.u;
        Object obj5 = this.p;
        Object obj6 = this.s;
        Object obj7 = this.b;
        Object obj8 = this.i;
        Object obj9 = this.c;
        Object obj10 = this.w;
        switch (b) {
            case 0:
                b65 b65Var = (b65) obj10;
                mt2 mt2Var = (mt2) obj9;
                oo5 oo5Var = (oo5) obj8;
                ox0 ox0Var = (ox0) obj7;
                k65 k65Var = (k65) obj6;
                aj3 aj3Var = (aj3) obj5;
                j51 j51Var = (j51) obj4;
                l60 l60Var = (l60) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    rw0 rw0Var = new rw0(mt2Var, b65Var, oo5Var, ox0Var, this.a, k65Var, aj3Var, j51Var, l60Var, this.q);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, g73.g);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, rw0Var);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    h02Var.b(true);
                    r42 r42VarG = mt2Var.g();
                    r42 r42Var = r42.j;
                    boolean z2 = this.t;
                    if (r42VarG != r42Var && mt2Var.r() != null) {
                        bl2 bl2VarR = mt2Var.r();
                        bl2VarR.getClass();
                        z = bl2VarR.W() && z2;
                    }
                    vd6.r(b65Var, z, h02Var, 0);
                    if (mt2Var.g() == r42.a && !this.m && z2) {
                        h02Var.X(-713510518);
                        vd6.n(b65Var, h02Var, 0);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-713433638);
                        h02Var.b(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mf6.r((z83) obj10, this.t, this.a, (cn4) obj9, (j73) obj8, this.m, (qh4) obj7, (z40) obj6, (zn3) obj5, (bz1) obj4, (nm0) obj3, (h02) obj, aq2.J(this.q | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ jw0(b65 b65Var, mt2 mt2Var, boolean z, boolean z2, oo5 oo5Var, ox0 ox0Var, xy1 xy1Var, k65 k65Var, aj3 aj3Var, j51 j51Var, l60 l60Var, int i) {
        this.w = b65Var;
        this.c = mt2Var;
        this.t = z;
        this.m = z2;
        this.i = oo5Var;
        this.b = ox0Var;
        this.a = xy1Var;
        this.s = k65Var;
        this.p = aj3Var;
        this.u = j51Var;
        this.z = l60Var;
        this.q = i;
    }
}
