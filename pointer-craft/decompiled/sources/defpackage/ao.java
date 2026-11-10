package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao implements bz1 {
    public final /* synthetic */ bw4 a;
    public final /* synthetic */ ga1 b;
    public final /* synthetic */ qr0 c;
    public final /* synthetic */ wm4 i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ jd3 m;
    public final /* synthetic */ ox0 q;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ we1 t;
    public final /* synthetic */ ob3 w;

    public /* synthetic */ ao(we1 we1Var, bw4 bw4Var, jd3 jd3Var, ox0 ox0Var, ob3 ob3Var, qr0 qr0Var, wm4 wm4Var, ga1 ga1Var, boolean z, byte b) {
        this.j = b;
        this.t = we1Var;
        this.a = bw4Var;
        this.m = jd3Var;
        this.q = ox0Var;
        this.w = ob3Var;
        this.c = qr0Var;
        this.i = wm4Var;
        this.b = ga1Var;
        this.s = z;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    vf1 vf1Var = gp0.n;
                    we1 we1Var = this.t;
                    og0.y(vf1Var.g(we1Var), ue5.m0(-683913816, new ao(we1Var, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, (byte) 1), h02Var), h02Var, 56);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    bw4 bw4Var = this.a;
                    List list = bw4Var != null ? (List) bw4Var.getValue() : null;
                    mc3 mc3Var = (mc3) this.w.getValue();
                    ox0 ox0Var = this.q;
                    boolean zJ = h02Var2.j(ox0Var);
                    we1 we1Var2 = this.t;
                    boolean zX = zJ | h02Var2.x(we1Var2);
                    Object objK = h02Var2.K();
                    if (zX || objK == oo0.g) {
                        objK = new co(ox0Var, we1Var2);
                        h02Var2.i0(objK);
                    }
                    jd3 jd3Var = this.m;
                    m50.t(we1Var2, list, mc3Var, jd3Var, (my1) objK, ue5.m0(-203635842, new eo(jd3Var, this.c, this.i, this.b, this.s), h02Var2), h02Var2, 196608);
                }
                break;
        }
        return og5Var;
    }
}
