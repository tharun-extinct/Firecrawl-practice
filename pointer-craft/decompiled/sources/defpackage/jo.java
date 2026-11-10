package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends zz4 implements bz1 {
    public boolean b;
    public g61 c;
    public boolean i;
    public final /* synthetic */ jd3 p;
    public jd3 q;
    public final /* synthetic */ ob3 s;
    public final /* synthetic */ boolean u;
    public wm4 w;
    public final /* synthetic */ wm4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(ob3 ob3Var, jd3 jd3Var, boolean z, wm4 wm4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.s = ob3Var;
        this.p = jd3Var;
        this.u = z;
        this.z = wm4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new jo(this.s, this.p, this.u, this.z, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((jo) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        g61 g61Var;
        wm4 wm4Var;
        boolean z;
        jd3 jd3Var;
        boolean z2 = this.b;
        if (!z2) {
            js2.o(obj);
            g61Var = (g61) this.s.getValue();
            if (g61Var != null) {
                jd3 jd3Var2 = this.p;
                this.q = jd3Var2;
                wm4Var = this.z;
                this.w = wm4Var;
                this.c = g61Var;
                z = this.u;
                this.i = z;
                this.b = true;
                Object objE = yf2.e(500L, this);
                px0 px0Var = px0.j;
                if (objE == px0Var) {
                    return px0Var;
                }
                jd3Var = jd3Var2;
            }
            return og5.g;
        }
        if (!z2) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = this.i;
        g61Var = this.c;
        wm4Var = this.w;
        jd3Var = this.q;
        js2.o(obj);
        ad3 ad3VarJ = jd3Var.y.j();
        String str = ad3VarJ != null ? (String) ad3VarJ.t.v : null;
        boolean z3 = jd3Var.y() == null;
        boolean z4 = yf2.p(str, "keyboard_auto_setup") || (str != null && ay4.P(str, "shared", false));
        if (!z3 || z4 || z) {
            String str2 = g61Var.t;
            wm4Var.getClass();
            str2.getClass();
            m50.T(v70.d(wm4Var), null, new sm4(wm4Var, str2, false, null), 3);
        } else {
            String str3 = g61Var.t;
            wm4Var.getClass();
            str3.getClass();
            m50.T(v70.d(wm4Var), null, new sm4(wm4Var, str3, true, null), 3);
        }
        return og5.g;
    }
}
