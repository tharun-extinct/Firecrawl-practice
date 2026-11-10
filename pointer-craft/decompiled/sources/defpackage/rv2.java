package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rv2 implements t33 {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ rv2(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.t33
    public final u33 r(final v33 v33Var, List list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iZ;
        final us3 us3VarV;
        byte b = this.g;
        Object obj = this.y;
        qi1 qi1Var = qi1.j;
        switch (b) {
            case 0:
                return v33Var.k0(ws0.t(j), ws0.j(j), qi1Var, new kn2(list, this, (byte) 2));
            case 1:
                kr4 kr4Var = (kr4) obj;
                float[] fArr = kr4Var.w;
                um3 um3Var = kr4Var.u;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    p33 p33Var = (p33) list.get(i3);
                    if (ue5.S(p33Var) == xq4.j) {
                        final us3 us3VarV2 = p33Var.v(j);
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            p33 p33Var2 = (p33) list.get(i4);
                            if (ue5.S(p33Var2) == xq4.t) {
                                um3 um3Var2 = um3.j;
                                us3 us3VarV3 = um3Var == um3Var2 ? p33Var2.v(ws0.y(zs0.a(j, 0, -us3VarV2.t, 1), 0, 0, 0, 0, 14)) : p33Var2.v(ws0.y(zs0.a(j, -us3VarV2.j, 0, 2), 0, 0, 0, 0, 11));
                                final s54 s54Var = new s54();
                                float fY = kr4Var.y();
                                fArr.getClass();
                                if (!yf2.s(fY, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
                                    yf2.s(fY, pr.f0(fArr));
                                }
                                us3VarV3.c0(jr4.x);
                                if (um3Var == um3Var2) {
                                    iMax = Math.max(us3VarV3.j, us3VarV2.j);
                                    int i5 = us3VarV2.t;
                                    int i6 = us3VarV3.t;
                                    iMax2 = i5 + i6;
                                    i = (iMax - us3VarV3.j) / 2;
                                    i2 = i5 / 2;
                                    iZ = (iMax - us3VarV2.j) / 2;
                                    s54Var.j = k33.Z(i6 * fY);
                                } else {
                                    iMax = us3VarV2.j + us3VarV3.j;
                                    iMax2 = Math.max(us3VarV3.t, us3VarV2.t);
                                    i = us3VarV2.j / 2;
                                    i2 = (iMax2 - us3VarV3.t) / 2;
                                    iZ = k33.Z(us3VarV3.j * fY);
                                    s54Var.j = (iMax2 - us3VarV2.t) / 2;
                                }
                                final int i7 = i2;
                                final int i8 = i;
                                final int i9 = iZ;
                                kr4Var.c.e(iMax);
                                kr4Var.i.e(iMax2);
                                final us3 us3Var = us3VarV3;
                                return v33Var.k0(iMax, iMax2, qi1Var, new xy1() { // from class: gr4
                                    @Override // defpackage.xy1
                                    public final Object a(Object obj2) {
                                        ts3 ts3Var = (ts3) obj2;
                                        ts3.m(ts3Var, us3Var, i8, i7);
                                        ts3.m(ts3Var, us3VarV2, i9, s54Var.j);
                                        return og5.g;
                                    }
                                });
                            }
                        }
                        tw2.y("Collection contains no element matching the predicate.");
                        up.q();
                        return null;
                    }
                }
                tw2.y("Collection contains no element matching the predicate.");
                up.q();
                return null;
            default:
                final us3 us3Var2 = null;
                if (((bz1) obj) != null) {
                    int size3 = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size3) {
                            tw2.y("Collection contains no element matching the predicate.");
                            up.q();
                            return null;
                        }
                        p33 p33Var3 = (p33) list.get(i10);
                        if (yf2.p(ue5.S(p33Var3), "text")) {
                            us3VarV = p33Var3.v(ws0.y(j, 0, 0, 0, 0, 11));
                        } else {
                            i10++;
                        }
                    }
                } else {
                    us3VarV = null;
                }
                final int iMax3 = Math.max(us3VarV != null ? us3VarV.j : 0, 0);
                final int iMax4 = Math.max(v33Var.V(p15.g), v33Var.K(p15.v) + 0 + (us3VarV != null ? us3VarV.t : 0));
                final Integer numValueOf = us3VarV != null ? Integer.valueOf(us3VarV.c0(y6.g)) : null;
                final Integer numValueOf2 = us3VarV != null ? Integer.valueOf(us3VarV.c0(y6.y)) : null;
                return v33Var.k0(iMax3, iMax4, qi1Var, new xy1() { // from class: o15
                    @Override // defpackage.xy1
                    public final Object a(Object obj2) {
                        ts3 ts3Var = (ts3) obj2;
                        us3 us3Var3 = us3VarV;
                        us3 us3Var4 = us3Var2;
                        int i11 = iMax4;
                        if (us3Var3 != null && us3Var4 != null) {
                            Integer num = numValueOf;
                            num.getClass();
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            num2.getClass();
                            int iIntValue2 = num2.intValue();
                            float f = iIntValue == iIntValue2 ? p15.r : p15.n;
                            v33 v33Var2 = v33Var;
                            int iV = v33Var2.V(qx3.y) + v33Var2.V(f);
                            int iK = (v33Var2.K(p15.v) + us3Var4.t) - iIntValue;
                            int i12 = us3Var3.j;
                            int i13 = iMax3;
                            int i14 = (i11 - iIntValue2) - iV;
                            ts3.m(ts3Var, us3Var3, (i13 - i12) / 2, i14);
                            ts3.m(ts3Var, us3Var4, (i13 - us3Var4.j) / 2, i14 - iK);
                        } else if (us3Var3 != null) {
                            float f2 = p15.g;
                            ts3.m(ts3Var, us3Var3, 0, (i11 - us3Var3.t) / 2);
                        } else if (us3Var4 != null) {
                            float f3 = p15.g;
                            ts3.m(ts3Var, us3Var4, 0, (i11 - us3Var4.t) / 2);
                        }
                        return og5.g;
                    }
                });
        }
    }
}
