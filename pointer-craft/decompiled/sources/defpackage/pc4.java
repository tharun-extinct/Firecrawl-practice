package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pc4 implements j64 {
    public String a;
    public final gf c = new gf((Object) this, (byte) 27);
    public md4 j;
    public Object m;
    public Object[] q;
    public uc4 t;
    public tc4 w;

    public pc4(md4 md4Var, uc4 uc4Var, String str, Object obj, Object[] objArr) {
        this.j = md4Var;
        this.t = uc4Var;
        this.a = str;
        this.m = obj;
        this.q = objArr;
    }

    @Override // defpackage.j64
    public final void g() {
        y();
    }

    @Override // defpackage.j64
    public final void n() {
        tc4 tc4Var = this.w;
        if (tc4Var != null) {
            ((ro) tc4Var).f0();
        }
    }

    @Override // defpackage.j64
    public final void r() {
        tc4 tc4Var = this.w;
        if (tc4Var != null) {
            ((ro) tc4Var).f0();
        }
    }

    public final void y() {
        String strC;
        uc4 uc4Var = this.t;
        tc4 tc4Var = this.w;
        if (tc4Var != null) {
            uo1.C(tc4Var, ") is not null", "entry(");
            return;
        }
        if (uc4Var != null) {
            gf gfVar = this.c;
            Object objG = gfVar.g();
            if (objG == null || uc4Var.n(objG)) {
                this.w = uc4Var.g(this.a, gfVar);
                return;
            }
            if (objG instanceof mt4) {
                mt4 mt4Var = (mt4) objG;
                if (mt4Var.t() == hi0.B || mt4Var.t() == f73.w || mt4Var.t() == l76.q) {
                    strC = "MutableState containing " + mt4Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strC = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strC = xq2.c(objG);
            }
            throw new IllegalArgumentException(strC);
        }
    }
}
