package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements gr1 {
    public final /* synthetic */ u54 a;
    public final /* synthetic */ s54 j;
    public final /* synthetic */ el0 m;
    public final /* synthetic */ ox0 q;
    public final /* synthetic */ ng0 t;
    public final /* synthetic */ m70 w;

    public jg0(s54 s54Var, ng0 ng0Var, u54 u54Var, el0 el0Var, ox0 ox0Var, m70 m70Var) {
        this.j = s54Var;
        this.t = ng0Var;
        this.a = u54Var;
        this.m = el0Var;
        this.q = ox0Var;
        this.w = m70Var;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        Object value;
        yf0 yf0Var;
        int iIntValue = ((Number) obj).intValue();
        s54 s54Var = this.j;
        int i = s54Var.j;
        ng0 ng0Var = this.t;
        if (i == 0) {
            s54Var.j = iIntValue;
            if (iIntValue == 10) {
                ng0Var.l.g();
                ng0Var.z = true;
            }
        }
        og5 og5Var = og5.g;
        u54 u54Var = this.a;
        if (iIntValue == 10) {
            dh2 dh2Var = (dh2) u54Var.j;
            if (dh2Var != null) {
                dh2Var.x(null);
            }
            ew4 ew4Var = ng0Var.s;
            do {
                value = ew4Var.getValue();
                yf0Var = (yf0) value;
                yf0Var.getClass();
            } while (!ew4Var.t(value, new yf0(yf0Var.y, 0, yf0Var.g)));
        } else if (iIntValue == 12) {
            this.m.f0(og5Var);
            if (ng0Var.u == null) {
                ng0Var.u = ((yf0) ng0Var.p.j.getValue()).y;
            }
            dh2 dh2Var2 = (dh2) u54Var.j;
            if (dh2Var2 != null) {
                dh2Var2.x(null);
            }
            u54Var.j = m50.T(this.q, ng0Var.w, new op(ng0Var, this.w, null, (byte) 3), 2);
            return og5Var;
        }
        return og5Var;
    }
}
