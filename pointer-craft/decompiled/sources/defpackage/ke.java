package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ke implements xy1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;

    public /* synthetic */ ke(my1 my1Var, boolean z, nc ncVar, m30 m30Var) {
        this.a = my1Var;
        this.t = z;
        this.m = ncVar;
        this.q = m30Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        Object obj2 = this.q;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                nc ncVar = (nc) obj3;
                m30 m30Var = (m30) obj2;
                wm2 wm2Var = (wm2) obj;
                wm2Var.g();
                pb0 pb0Var = wm2Var.j;
                if (((Boolean) this.a.g()).booleanValue()) {
                    if (this.t) {
                        long jE0 = pb0Var.e0();
                        ro roVar = pb0Var.t;
                        long jG = roVar.G();
                        roVar.b().q();
                        try {
                            ((y22) roVar.t).A(-1.0f, 1.0f, jE0);
                            xd1.O(wm2Var, ncVar, m30Var);
                        } finally {
                            du4.d(roVar, jG);
                        }
                    } else {
                        xd1.O(wm2Var, ncVar, m30Var);
                    }
                }
                return og5.g;
            default:
                yo4 yo4Var = (yo4) obj;
                return new xo4(this.t, this.a, (my1) obj3, yo4Var, (xy1) obj2);
        }
    }

    public /* synthetic */ ke(boolean z, my1 my1Var, my1 my1Var2, xy1 xy1Var) {
        this.t = z;
        this.a = my1Var;
        this.m = my1Var2;
        this.q = xy1Var;
    }
}
