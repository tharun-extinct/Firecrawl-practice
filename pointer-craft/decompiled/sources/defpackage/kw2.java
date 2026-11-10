package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kw2 implements a93 {
    public static int l(rf2 rf2Var, ArrayList arrayList, int i, bz1 bz1Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        p33 p33Var = (p33) cj0.l0(list4);
        int iIntValue = p33Var != null ? ((Number) bz1Var.l(p33Var, Integer.valueOf(i))).intValue() : 0;
        p33 p33Var2 = (p33) cj0.l0(list5);
        int iIntValue2 = p33Var2 != null ? ((Number) bz1Var.l(p33Var2, Integer.valueOf(i))).intValue() : 0;
        p33 p33Var3 = (p33) cj0.l0(list);
        int iIntValue3 = p33Var3 != null ? ((Number) bz1Var.l(p33Var3, Integer.valueOf(i))).intValue() : 0;
        p33 p33Var4 = (p33) cj0.l0(list2);
        int iIntValue4 = p33Var4 != null ? ((Number) bz1Var.l(p33Var4, Integer.valueOf(i))).intValue() : 0;
        p33 p33Var5 = (p33) cj0.l0(list3);
        int iIntValue5 = p33Var5 != null ? ((Number) bz1Var.l(p33Var5, Integer.valueOf(i))).intValue() : 0;
        int iV = rf2Var.V(32.0f);
        long jY = zs0.y(0, 0, 0, 0, 15);
        if (ws0.v(jY)) {
            return ws0.t(jY);
        }
        return iV + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    public static int x(rf2 rf2Var, ArrayList arrayList, int i, bz1 bz1Var) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iO = pw5.O(i, rf2Var.V(32.0f));
        p33 p33Var = (p33) cj0.l0(list4);
        if (p33Var != null) {
            iIntValue = ((Number) bz1Var.l(p33Var, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var.Y(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        p33 p33Var2 = (p33) cj0.l0(list5);
        if (p33Var2 != null) {
            iIntValue2 = ((Number) bz1Var.l(p33Var2, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var2.Y(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (p33) cj0.l0(list2);
        int iIntValue3 = obj != null ? ((Number) bz1Var.l(obj, Integer.valueOf(iO))).intValue() : 0;
        Object obj2 = (p33) cj0.l0(list);
        int iIntValue4 = obj2 != null ? ((Number) bz1Var.l(obj2, Integer.valueOf(iO))).intValue() : 0;
        Object obj3 = (p33) cj0.l0(list3);
        int iIntValue5 = obj3 != null ? ((Number) bz1Var.l(obj3, Integer.valueOf(iO))).intValue() : 0;
        boolean z = iIntValue5 > rf2Var.K(kq2.G(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return lr2.i(rf2Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, rf2Var.V((i2 == 3 ? 12.0f : 8.0f) * 2.0f), zs0.y(0, 0, 0, 0, 15));
    }

    @Override // defpackage.a93
    public final int g(rf2 rf2Var, List list, int i) {
        return x(rf2Var, (ArrayList) list, i, gw2.i);
    }

    @Override // defpackage.a93
    public final int n(rf2 rf2Var, List list, int i) {
        return x(rf2Var, (ArrayList) list, i, iw2.i);
    }

    @Override // defpackage.a93
    public final u33 r(v33 v33Var, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jY = ws0.y(j, 0, 0, 0, 0, 10);
        int iV = v33Var.V(32.0f);
        p33 p33Var = (p33) cj0.l0(list5);
        int iP = p33Var != null ? p33Var.P(ws0.j(j)) : 0;
        p33 p33Var2 = (p33) cj0.l0(list6);
        int iO = pw5.O(ws0.t(jY), iP + (p33Var2 != null ? p33Var2.P(ws0.j(j)) : 0) + iV);
        p33 p33Var3 = (p33) cj0.l0(list4);
        long jT = zs0.t(-iV, -v33Var.V(((((cj0.l0(list3) != null) && (cj0.l0(list4) != null)) || ((p33Var3 != null ? p33Var3.Z(iO) : 0) > v33Var.K(kq2.G(30)))) ? 12.0f : 8.0f) * 2.0f), jY);
        p33 p33Var4 = (p33) cj0.l0(list5);
        us3 us3VarV = p33Var4 != null ? p33Var4.v(jT) : null;
        int i2 = us3VarV != null ? us3VarV.j : 0;
        p33 p33Var5 = (p33) cj0.l0(list6);
        us3 us3VarV2 = p33Var5 != null ? p33Var5.v(zs0.a(jT, -i2, 0, 2)) : null;
        int i3 = i2 + (us3VarV2 != null ? us3VarV2.j : 0);
        p33 p33Var6 = (p33) cj0.l0(list2);
        us3 us3VarV3 = p33Var6 != null ? p33Var6.v(zs0.a(jT, -i3, 0, 2)) : null;
        int i4 = us3VarV3 != null ? us3VarV3.t : 0;
        p33 p33Var7 = (p33) cj0.l0(list4);
        us3 us3VarV4 = p33Var7 != null ? p33Var7.v(zs0.t(-i3, -i4, jT)) : null;
        int i5 = i4 + (us3VarV4 != null ? us3VarV4.t : 0);
        boolean z = (us3VarV4 == null || us3VarV4.c0(y6.g) == us3VarV4.c0(y6.y)) ? false : true;
        p33 p33Var8 = (p33) cj0.l0(list3);
        us3 us3VarV5 = p33Var8 != null ? p33Var8.v(zs0.t(-i3, -i5, jT)) : null;
        boolean z2 = us3VarV5 != null;
        boolean z3 = us3VarV4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f = i == 3 ? 12.0f : 8.0f;
        float f2 = f * 2.0f;
        final int iT = ws0.v(j) ? ws0.t(j) : iV + (us3VarV != null ? us3VarV.j : 0) + Math.max(us3VarV3 != null ? us3VarV3.j : 0, Math.max(us3VarV5 != null ? us3VarV5.j : 0, us3VarV4 != null ? us3VarV4.j : 0)) + (us3VarV2 != null ? us3VarV2.j : 0);
        final us3 us3Var = us3VarV5;
        float f3 = f;
        final int i6 = lr2.i(v33Var, us3VarV != null ? us3VarV.t : 0, us3VarV2 != null ? us3VarV2.t : 0, us3VarV3 != null ? us3VarV3.t : 0, us3VarV5 != null ? us3VarV5.t : 0, us3VarV4 != null ? us3VarV4.t : 0, i, v33Var.V(f2), j);
        final boolean z4 = i == 3;
        final int iV2 = v33Var.V(16.0f);
        final int iV3 = v33Var.V(16.0f);
        final int iV4 = v33Var.V(f3);
        final us3 us3Var2 = us3VarV2;
        final us3 us3Var3 = us3VarV3;
        final us3 us3Var4 = us3VarV4;
        final us3 us3Var5 = us3VarV;
        return v33Var.k0(iT, i6, qi1.j, new xy1() { // from class: cw2
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                int iRound;
                ts3 ts3Var = (ts3) obj;
                us3 us3Var6 = us3Var5;
                int i7 = iV2;
                boolean z5 = z4;
                int iRound2 = iV4;
                int i8 = i6;
                if (us3Var6 != null) {
                    ts3.m(ts3Var, us3Var6, i7, z5 ? iRound2 : Math.round(((i8 - us3Var6.t) / 2.0f) * 1.0f));
                }
                int i9 = i7 + (us3Var6 != null ? us3Var6.j : 0);
                us3 us3Var7 = us3Var3;
                us3 us3Var8 = us3Var;
                us3 us3Var9 = us3Var4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i8 - (((us3Var7 != null ? us3Var7.t : 0) + (us3Var8 != null ? us3Var8.t : 0)) + (us3Var9 != null ? us3Var9.t : 0))) / 2.0f) * 1.0f);
                }
                if (us3Var8 != null) {
                    ts3.m(ts3Var, us3Var8, i9, iRound);
                }
                int i10 = iRound + (us3Var8 != null ? us3Var8.t : 0);
                if (us3Var7 != null) {
                    ts3.m(ts3Var, us3Var7, i9, i10);
                }
                int i11 = i10 + (us3Var7 != null ? us3Var7.t : 0);
                if (us3Var9 != null) {
                    ts3.m(ts3Var, us3Var9, i9, i11);
                }
                us3 us3Var10 = us3Var2;
                if (us3Var10 != null) {
                    int i12 = (iT - iV3) - us3Var10.j;
                    if (!z5) {
                        iRound2 = Math.round(((i8 - us3Var10.t) / 2.0f) * 1.0f);
                    }
                    ts3.m(ts3Var, us3Var10, i12, iRound2);
                }
                return og5.g;
            }
        });
    }

    @Override // defpackage.a93
    public final int v(rf2 rf2Var, List list, int i) {
        return l(rf2Var, (ArrayList) list, i, jw2.i);
    }

    @Override // defpackage.a93
    public final int y(rf2 rf2Var, List list, int i) {
        return l(rf2Var, (ArrayList) list, i, hw2.i);
    }
}
