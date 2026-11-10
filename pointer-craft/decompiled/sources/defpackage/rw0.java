package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rw0 implements t33 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt2 g;
    public final /* synthetic */ j51 j;
    public final /* synthetic */ aj3 l;
    public final /* synthetic */ ox0 n;
    public final /* synthetic */ oo5 r;
    public final /* synthetic */ l60 t;
    public final /* synthetic */ xy1 v;
    public final /* synthetic */ k65 x;
    public final /* synthetic */ b65 y;

    public rw0(mt2 mt2Var, b65 b65Var, oo5 oo5Var, ox0 ox0Var, xy1 xy1Var, k65 k65Var, aj3 aj3Var, j51 j51Var, l60 l60Var, int i) {
        this.g = mt2Var;
        this.y = b65Var;
        this.r = oo5Var;
        this.n = ox0Var;
        this.v = xy1Var;
        this.x = k65Var;
        this.l = aj3Var;
        this.j = j51Var;
        this.t = l60Var;
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x025e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x0225  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        j75 j75Var;
        fl2 fl2Var;
        j75 j75Var2;
        h93 h93Var;
        j75 j75Var3;
        rw0 rw0Var;
        int iN;
        bl2 bl2Var;
        b65 b65Var;
        cj cjVar;
        i75 i75Var;
        mt2 mt2Var = this.g;
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            k75 k75VarN = mt2Var.n();
            js2.z(at4VarM, at4VarB, xy1VarV);
            j75 j75Var4 = k75VarN != null ? k75VarN.g : null;
            o45 o45Var = mt2Var.g;
            fl2 layoutDirection = v33Var.getLayoutDirection();
            boolean z = o45Var.x;
            boolean z2 = o45Var.v;
            int i = o45Var.r;
            if (j75Var4 != null) {
                h93 h93Var2 = j75Var4.y;
                i75 i75Var2 = j75Var4.g;
                cj cjVar2 = o45Var.g;
                k85 k85Var = o45Var.y;
                List list2 = o45Var.t;
                j51 j51Var = o45Var.l;
                ku1 ku1Var = o45Var.j;
                j75 j75Var5 = j75Var4;
                if (!h93Var2.g.y()) {
                    cj cjVar3 = i75Var2.g;
                    long j2 = i75Var2.a;
                    if (yf2.p(cjVar3, cjVar2) && i75Var2.y.r(k85Var) && yf2.p(i75Var2.r, list2) && i75Var2.n == i && i75Var2.v == z2 && i75Var2.x == z && yf2.p(i75Var2.l, j51Var)) {
                        fl2Var = layoutDirection;
                        if (i75Var2.j == fl2Var && yf2.p(i75Var2.t, ku1Var) && ws0.m(j) == ws0.m(j2) && ((!z2 && z != 2) || (ws0.t(j) == ws0.t(j2) && ws0.j(j) == ws0.j(j2)))) {
                            j75Var = j75Var5;
                            j75Var2 = new j75(new i75(i75Var2.g, o45Var.y, i75Var2.r, i75Var2.n, i75Var2.v, i75Var2.x, i75Var2.l, i75Var2.j, i75Var2.t, j), h93Var2, zs0.n(j, (((long) js2.n(h93Var2.v)) & 4294967295L) | (((long) js2.n(h93Var2.n)) << 32)));
                        }
                    } else {
                        j = j;
                        j75Var = j75Var5;
                        fl2Var = layoutDirection;
                    }
                    long j3 = j75Var2.r;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    h93Var = j75Var2.y;
                    h93Var.g.y();
                    j75Var3 = j75Var;
                    if (yf2.p(j75Var3, j75Var2)) {
                        rw0Var = this;
                    } else {
                        if (k75VarN != null) {
                            bl2Var = k75VarN.r;
                        } else {
                            bl2Var = null;
                        }
                        mt2Var.t.setValue(new k75(j75Var2, bl2Var));
                        mt2Var.b = false;
                        rw0Var = this;
                        b65Var = rw0Var.y;
                        if (b65Var.t() && b65Var.j() && ((dt2) rw0Var.r).g() && u75.r(((u75) mt2Var.A.getValue()).g) && u75.r(((u75) mt2Var.B.getValue()).g) && mt2Var.y()) {
                            if (j75Var3 != null || (i75Var = j75Var3.g) == null) {
                                cjVar = null;
                            } else {
                                cjVar = i75Var.g;
                            }
                            if (!yf2.p(cjVar, j75Var2.g.g)) {
                                m50.T(rw0Var.n, null, new q(b65Var, rw0Var.t, null, (byte) 22), 3);
                            }
                        }
                        rw0Var.v.a(j75Var2);
                        vd6.x(mt2Var, rw0Var.x, rw0Var.l);
                    }
                    if (rw0Var.a == 1) {
                        iN = js2.n(h93Var.y(0));
                    } else {
                        iN = 0;
                    }
                    mt2Var.l.setValue(new vb1(rw0Var.j.y0(iN)));
                    return v33Var.k0(iIntValue, iIntValue2, v13.o(new fp3(y6.g, Integer.valueOf(Math.round(j75Var2.n))), new fp3(y6.y, Integer.valueOf(Math.round(j75Var2.v)))), new wm0((byte) 17));
                }
                fl2Var = layoutDirection;
                j75Var = j75Var5;
            } else {
                j = j;
                j75Var = j75Var4;
                fl2Var = layoutDirection;
            }
            o45Var.g(fl2Var);
            int iM = ws0.m(j);
            int iT = ((z2 || z == 2) && ws0.v(j)) ? ws0.t(j) : Integer.MAX_VALUE;
            int i2 = (z2 || z != 2) ? i : 1;
            if (iM != iT) {
                rv rvVar = o45Var.a;
                if (rvVar == null) {
                    l0.z("layoutIntrinsics must be called first");
                    return null;
                }
                iT = xs2.w(js2.n(rvVar.r()), iM, iT);
            }
            rv rvVar2 = o45Var.a;
            if (rvVar2 == null) {
                l0.z("layoutIntrinsics must be called first");
                return null;
            }
            h93 h93Var3 = new h93(rvVar2, y94.A(0, iT, 0, ws0.j(j)), i2, o45Var.x ? 1 : 0);
            j75Var2 = new j75(new i75(o45Var.g, o45Var.y, o45Var.t, o45Var.r, o45Var.v, o45Var.x ? 1 : 0, o45Var.l, fl2Var, o45Var.j, j), h93Var3, zs0.n(j, (((long) js2.n(h93Var3.n)) << 32) | (((long) js2.n(h93Var3.v)) & 4294967295L)));
            long j4 = j75Var2.r;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            h93Var = j75Var2.y;
            h93Var.g.y();
            j75Var3 = j75Var;
            if (yf2.p(j75Var3, j75Var2)) {
                if (k75VarN != null) {
                    bl2Var = k75VarN.r;
                } else {
                    bl2Var = null;
                }
                mt2Var.t.setValue(new k75(j75Var2, bl2Var));
                mt2Var.b = false;
                rw0Var = this;
                b65Var = rw0Var.y;
                if (b65Var.t()) {
                    if (j75Var3 != null) {
                        cjVar = null;
                    } else {
                        cjVar = null;
                    }
                    if (!yf2.p(cjVar, j75Var2.g.g)) {
                        m50.T(rw0Var.n, null, new q(b65Var, rw0Var.t, null, (byte) 22), 3);
                    }
                }
                rw0Var.v.a(j75Var2);
                vd6.x(mt2Var, rw0Var.x, rw0Var.l);
            } else {
                rw0Var = this;
            }
            if (rw0Var.a == 1) {
                iN = js2.n(h93Var.y(0));
            } else {
                iN = 0;
            }
            mt2Var.l.setValue(new vb1(rw0Var.j.y0(iN)));
            return v33Var.k0(iIntValue3, iIntValue4, v13.o(new fp3(y6.g, Integer.valueOf(Math.round(j75Var2.n))), new fp3(y6.y, Integer.valueOf(Math.round(j75Var2.v)))), new wm0((byte) 17));
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        mt2 mt2Var = this.g;
        mt2Var.g.g(rf2Var.getLayoutDirection());
        rv rvVar = mt2Var.g.a;
        if (rvVar != null) {
            return js2.n(rvVar.r());
        }
        l0.z("layoutIntrinsics must be called first");
        return 0;
    }
}
