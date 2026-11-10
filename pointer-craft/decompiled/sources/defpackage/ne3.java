package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ne3 implements t33 {
    public final /* synthetic */ my1 g;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ bz1 y;

    public ne3(my1 my1Var, bz1 bz1Var, boolean z) {
        this.g = my1Var;
        this.y = bz1Var;
        this.r = z;
    }

    @Override // defpackage.t33
    public final u33 r(final v33 v33Var, List list, long j) {
        float f;
        Object obj;
        us3 us3VarV;
        us3 us3VarV2;
        float fFloatValue = ((Number) this.g.g()).floatValue();
        float f2 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jY = ws0.y(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p33 p33Var = (p33) list.get(i);
            if (yf2.p(ue5.S(p33Var), "icon")) {
                final us3 us3VarV3 = p33Var.v(jY);
                float f3 = 2.0f;
                int iV = v33Var.V(oe3.n * 2.0f) + us3VarV3.j;
                int iZ = k33.Z(iV * f2);
                int iV2 = v33Var.V(oe3.v * 2.0f) + us3VarV3.t;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    p33 p33Var2 = (p33) list.get(i2);
                    float f4 = f3;
                    if (yf2.p(ue5.S(p33Var2), "indicatorRipple")) {
                        if (!((iV >= 0) & (iV2 >= 0))) {
                            oc2.g("width and height must be >= 0");
                        }
                        final us3 us3VarV4 = p33Var2.v(zs0.j(iV, iV, iV2, iV2));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                f = f2;
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            f = f2;
                            if (yf2.p(ue5.S((p33) obj), "indicator")) {
                                break;
                            }
                            i3++;
                            f2 = f;
                        }
                        p33 p33Var3 = (p33) obj;
                        if (p33Var3 != null) {
                            if (!((iZ >= 0) & (iV2 >= 0))) {
                                oc2.g("width and height must be >= 0");
                            }
                            us3VarV = p33Var3.v(zs0.j(iZ, iZ, iV2, iV2));
                        } else {
                            us3VarV = null;
                        }
                        bz1 bz1Var = this.y;
                        if (bz1Var != null) {
                            int size4 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size4) {
                                    tw2.y("Collection contains no element matching the predicate.");
                                    up.q();
                                    return null;
                                }
                                p33 p33Var4 = (p33) list.get(i4);
                                if (yf2.p(ue5.S(p33Var4), "label")) {
                                    us3VarV2 = p33Var4.v(jY);
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            us3VarV2 = null;
                        }
                        qi1 qi1Var = qi1.j;
                        if (bz1Var == null) {
                            final int iV3 = ws0.t(j) == Integer.MAX_VALUE ? (v33Var.V(oe3.l) * 2) + us3VarV3.j : ws0.t(j);
                            final int iX = zs0.x(v33Var.V(oe3.g), j);
                            final int i5 = (iV3 - us3VarV3.j) / 2;
                            final int i6 = (iX - us3VarV3.t) / 2;
                            final int i7 = (iV3 - us3VarV4.j) / 2;
                            final int i8 = (iX - us3VarV4.t) / 2;
                            final us3 us3Var = us3VarV;
                            return v33Var.k0(iV3, iX, qi1Var, new xy1() { // from class: je3
                                @Override // defpackage.xy1
                                public final Object a(Object obj2) {
                                    ts3 ts3Var = (ts3) obj2;
                                    us3 us3Var2 = us3Var;
                                    if (us3Var2 != null) {
                                        ts3.m(ts3Var, us3Var2, (iV3 - us3Var2.j) / 2, (iX - us3Var2.t) / 2);
                                    }
                                    ts3.m(ts3Var, us3VarV3, i5, i6);
                                    ts3.m(ts3Var, us3VarV4, i7, i8);
                                    return og5.g;
                                }
                            });
                        }
                        final us3 us3Var2 = us3VarV;
                        us3VarV2.getClass();
                        float f5 = us3VarV3.t;
                        float f6 = oe3.v;
                        float fE = v33Var.e(f6) + f5;
                        float f7 = oe3.r;
                        float fE2 = v33Var.e(f7) + fE + us3VarV2.t;
                        float fA = (ws0.a(j) - fE2) / f4;
                        float fE3 = v33Var.e(f6);
                        if (fA < fE3) {
                            fA = fE3;
                        }
                        float f8 = (fA * f4) + fE2;
                        final boolean z = this.r;
                        final float f9 = (1.0f - f) * ((z ? fA : (f8 - us3VarV3.t) / f4) - fA);
                        final float fE4 = v33Var.e(f7) + v33Var.e(f6) + us3VarV3.t + fA;
                        final int iV4 = ws0.t(j) == Integer.MAX_VALUE ? (v33Var.V(oe3.l) * 2) + us3VarV3.j : ws0.t(j);
                        final int i9 = (iV4 - us3VarV2.j) / 2;
                        final int i10 = (iV4 - us3VarV3.j) / 2;
                        final int i11 = (iV4 - us3VarV4.j) / 2;
                        final float fE5 = fA - v33Var.e(f6);
                        final float f10 = fA;
                        final us3 us3Var3 = us3VarV2;
                        final float f11 = f;
                        return v33Var.k0(iV4, k33.Z(f8), qi1Var, new xy1() { // from class: ie3
                            @Override // defpackage.xy1
                            public final Object a(Object obj2) {
                                ts3 ts3Var = (ts3) obj2;
                                us3 us3Var4 = us3Var2;
                                float f12 = f9;
                                float f13 = f10;
                                if (us3Var4 != null) {
                                    ts3.m(ts3Var, us3Var4, (iV4 - us3Var4.j) / 2, k33.Z((f13 - v33Var.V(oe3.v)) + f12));
                                }
                                if (z || f11 != 0.0f) {
                                    ts3.m(ts3Var, us3Var3, i9, k33.Z(fE4 + f12));
                                }
                                ts3.m(ts3Var, us3VarV3, i10, k33.Z(f13 + f12));
                                ts3.m(ts3Var, us3VarV4, i11, k33.Z(fE5 + f12));
                                return og5.g;
                            }
                        });
                    }
                    i2++;
                    f3 = f4;
                }
                tw2.y("Collection contains no element matching the predicate.");
                up.q();
                return null;
            }
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return null;
    }
}
