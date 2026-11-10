package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h91 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ h91(mc3 mc3Var, List list, boolean z) {
        this.a = mc3Var;
        this.t = z;
        this.m = list;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        byte b2 = 1;
        Object obj2 = this.m;
        Object obj3 = this.a;
        final boolean z = this.t;
        switch (b) {
            case 0:
                final mc3 mc3Var = (mc3) obj3;
                final List list = (List) obj2;
                du2 du2Var = new du2() { // from class: i91
                    @Override // defpackage.du2
                    public final void b(gu2 gu2Var, vt2 vt2Var) {
                        boolean z2 = z;
                        List list2 = list;
                        mc3 mc3Var2 = mc3Var;
                        if (z2 && !list2.contains(mc3Var2)) {
                            list2.add(mc3Var2);
                        }
                        if (vt2Var == vt2.ON_START && !list2.contains(mc3Var2)) {
                            list2.add(mc3Var2);
                        }
                        if (vt2Var == vt2.ON_STOP) {
                            list2.remove(mc3Var2);
                        }
                    }
                };
                mc3Var.p.g(du2Var);
                return new bw(mc3Var, du2Var, (byte) 1);
            default:
                u21 u21Var = (u21) obj3;
                ox0 ox0Var = (ox0) obj2;
                nj4 nj4Var = (nj4) obj;
                if (z) {
                    mk3 mk3Var = new mk3(u21Var, ox0Var, b2);
                    ci2[] ci2VarArr = lj4.g;
                    nj4Var.g(yi4.d, new p1(null, mk3Var));
                    nj4Var.g(yi4.A, new p1(null, new mk3(u21Var, ox0Var, (byte) 2)));
                } else {
                    mk3 mk3Var2 = new mk3(u21Var, ox0Var, (byte) 3);
                    ci2[] ci2VarArr2 = lj4.g;
                    nj4Var.g(yi4.e, new p1(null, mk3Var2));
                    nj4Var.g(yi4.B, new p1(null, new mk3(u21Var, ox0Var, (byte) 4)));
                }
                return og5.g;
        }
    }

    public /* synthetic */ h91(boolean z, u21 u21Var, ox0 ox0Var) {
        this.t = z;
        this.a = u21Var;
        this.m = ox0Var;
    }
}
