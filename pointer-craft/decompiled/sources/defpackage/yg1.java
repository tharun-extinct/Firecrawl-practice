package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yg1 {
    public static final qe5 g;
    public static final qe5 r;
    public static final qe5 y;

    static {
        hy0 hy0Var = new hy0(0.4f, 0.0f, 0.6f, 1.0f);
        g = new qe5(120, dg1.g, 2);
        y = new qe5(150, hy0Var, 2);
        r = new qe5(120, hy0Var, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 qe5) = (r1v0 qe5), (r1v0 qe5), (r1v0 qe5), (r1v4 qe5), (r1v4 qe5), (r1v4 qe5), (r1v4 qe5) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object g(qg qgVar, float f, ue2 ue2Var, ue2 ue2Var2, ou0 ou0Var) {
        qe5 qe5Var;
        qe5 qe5Var2 = null;
        if (ue2Var2 != null) {
            boolean z = ue2Var2 instanceof mx3;
            qe5Var = g;
            if (z || (ue2Var2 instanceof ed1) || (ue2Var2 instanceof p72) || (ue2Var2 instanceof gt1)) {
                qe5Var2 = qe5Var;
            }
        } else if (ue2Var != null) {
            boolean z2 = ue2Var instanceof mx3;
            qe5Var = y;
            if (z2 || (ue2Var instanceof ed1)) {
                qe5Var2 = qe5Var;
            } else if (ue2Var instanceof p72) {
                qe5Var2 = r;
            } else if (ue2Var instanceof gt1) {
                qe5Var2 = qe5Var;
            }
        }
        qe5 qe5Var3 = qe5Var2;
        px0 px0Var = px0.j;
        if (qe5Var3 != null) {
            Object objG = qg.g(qgVar, new vb1(f), qe5Var3, null, ou0Var, 12);
            if (objG == px0Var) {
                return objG;
            }
        } else {
            Object objV = qgVar.v(ou0Var, new vb1(f));
            if (objV == px0Var) {
                return objV;
            }
        }
        return og5.g;
    }
}
