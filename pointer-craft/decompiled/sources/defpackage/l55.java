package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l55 implements t33 {
    public final boolean g;
    public final zn3 n;
    public final c55 r;
    public final float v;
    public final j55 y;

    public l55(boolean z, j55 j55Var, c55 c55Var, zn3 zn3Var, float f) {
        this.g = z;
        this.y = j55Var;
        this.r = c55Var;
        this.n = zn3Var;
        this.v = f;
    }

    public static int j(List list, int i, bz1 bz1Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (yf2.p(pw5.z((p33) obj7), "TextField")) {
                int iIntValue = ((Number) bz1Var.l(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (yf2.p(pw5.z((p33) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                p33 p33Var = (p33) obj2;
                int iIntValue2 = p33Var != null ? ((Number) bz1Var.l(p33Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (yf2.p(pw5.z((p33) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                p33 p33Var2 = (p33) obj3;
                int iIntValue3 = p33Var2 != null ? ((Number) bz1Var.l(p33Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (yf2.p(pw5.z((p33) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                p33 p33Var3 = (p33) obj4;
                int iIntValue4 = p33Var3 != null ? ((Number) bz1Var.l(p33Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (yf2.p(pw5.z((p33) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                p33 p33Var4 = (p33) obj5;
                int iIntValue5 = p33Var4 != null ? ((Number) bz1Var.l(p33Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (yf2.p(pw5.z((p33) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                p33 p33Var5 = (p33) obj6;
                int iIntValue6 = p33Var5 != null ? ((Number) bz1Var.l(p33Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (yf2.p(pw5.z((p33) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                p33 p33Var6 = (p33) obj;
                int i9 = iIntValue4 + iIntValue5;
                return zs0.l(Math.max(iIntValue + i9, Math.max((p33Var6 != null ? ((Number) bz1Var.l(p33Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, zs0.y(0, 0, 0, 0, 15));
            }
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return 0;
    }

    public static final int t(l55 l55Var, int i, int i2, us3 us3Var) {
        return l55Var.g ? Math.round(((i - us3Var.t) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        return l(rf2Var, list, i, new vq0((byte) 25));
    }

    public final int l(rf2 rf2Var, List list, int i, bz1 bz1Var) {
        Object obj;
        int i2;
        int iIntValue;
        int iO;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (yf2.p(pw5.z((p33) obj), "Leading")) {
                break;
            }
            i5++;
        }
        p33 p33Var = (p33) obj;
        if (p33Var != null) {
            i2 = i;
            iO = pw5.O(i2, p33Var.Y(Integer.MAX_VALUE));
            iIntValue = ((Number) bz1Var.l(p33Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iO = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (yf2.p(pw5.z((p33) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        p33 p33Var2 = (p33) obj2;
        if (p33Var2 != null) {
            iO = pw5.O(iO, p33Var2.Y(Integer.MAX_VALUE));
            iIntValue2 = ((Number) bz1Var.l(p33Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (yf2.p(pw5.z((p33) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (p33) obj3;
        int iIntValue3 = obj8 != null ? ((Number) bz1Var.l(obj8, Integer.valueOf(iO))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (yf2.p(pw5.z((p33) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        p33 p33Var3 = (p33) obj4;
        if (p33Var3 != null) {
            int iIntValue4 = ((Number) bz1Var.l(p33Var3, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var3.Y(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (yf2.p(pw5.z((p33) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        p33 p33Var4 = (p33) obj5;
        if (p33Var4 != null) {
            int iIntValue5 = ((Number) bz1Var.l(p33Var4, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var4.Y(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (yf2.p(pw5.z((p33) obj9), "TextField")) {
                int iIntValue6 = ((Number) bz1Var.l(obj9, Integer.valueOf(iO))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (yf2.p(pw5.z((p33) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (p33) obj6;
                int iIntValue7 = obj10 != null ? ((Number) bz1Var.l(obj10, Integer.valueOf(iO))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (yf2.p(pw5.z((p33) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (p33) obj7;
                return x(rf2Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) bz1Var.l(obj11, Integer.valueOf(i2))).intValue() : 0, zs0.y(0, 0, 0, 0, 15), this.r.g());
            }
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return 0;
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        return l(rf2Var, list, i, new vq0((byte) 24));
    }

    @Override // defpackage.t33
    public final u33 r(final v33 v33Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        us3 us3Var;
        int i2;
        us3 us3Var2;
        int i3;
        float f;
        int i4;
        int i5;
        float fG = this.r.g();
        zn3 zn3Var = this.n;
        final int iV = v33Var.V(zn3Var.n());
        int iV2 = v33Var.V(zn3Var.r());
        long jY = ws0.y(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (yf2.p(ue5.S((p33) obj), "Leading")) {
                break;
            }
            i6++;
        }
        p33 p33Var = (p33) obj;
        us3 us3VarV = p33Var != null ? p33Var.v(jY) : null;
        int i7 = us3VarV != null ? us3VarV.j : 0;
        int iMax = Math.max(0, us3VarV != null ? us3VarV.t : 0);
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (yf2.p(ue5.S((p33) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        p33 p33Var2 = (p33) obj2;
        us3 us3VarV2 = p33Var2 != null ? p33Var2.v(zs0.a(jY, -i7, 0, 2)) : null;
        int i9 = i7 + (us3VarV2 != null ? us3VarV2.j : 0);
        int iMax2 = Math.max(iMax, us3VarV2 != null ? us3VarV2.t : 0);
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (yf2.p(ue5.S((p33) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        p33 p33Var3 = (p33) obj3;
        us3 us3VarV3 = p33Var3 != null ? p33Var3.v(zs0.a(jY, -i9, 0, 2)) : null;
        int i11 = (us3VarV3 != null ? us3VarV3.j : 0) + i9;
        int iMax3 = Math.max(iMax2, us3VarV3 != null ? us3VarV3.t : 0);
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (yf2.p(ue5.S((p33) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        p33 p33Var4 = (p33) obj4;
        us3 us3VarV4 = p33Var4 != null ? p33Var4.v(zs0.a(jY, -i11, 0, 2)) : null;
        int i13 = i11 + (us3VarV4 != null ? us3VarV4.j : 0);
        int iMax4 = Math.max(iMax3, us3VarV4 != null ? us3VarV4.t : 0);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = size5;
            if (yf2.p(ue5.S((p33) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
        }
        p33 p33Var5 = (p33) obj5;
        final u54 u54Var = new u54();
        int i16 = -i13;
        u54Var.j = p33Var5 != null ? p33Var5.v(zs0.t(i16, -iV2, jY)) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i = iV2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i = iV2;
            if (yf2.p(ue5.S((p33) obj6), "Supporting")) {
                break;
            }
            i17++;
            iV2 = i;
        }
        p33 p33Var6 = (p33) obj6;
        int iZ = p33Var6 != null ? p33Var6.Z(ws0.m(j)) : 0;
        us3 us3Var3 = (us3) u54Var.j;
        int i18 = iV + (us3Var3 != null ? us3Var3.t : 0);
        long jT = zs0.t(i16, ((-i18) - i) - iZ, ws0.y(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i18;
            p33 p33Var7 = (p33) list.get(i19);
            int i21 = size7;
            float f2 = fG;
            if (yf2.p(ue5.S(p33Var7), "TextField")) {
                final us3 us3VarV5 = p33Var7.v(jT);
                long jY2 = ws0.y(jT, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (yf2.p(ue5.S((p33) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                p33 p33Var8 = (p33) obj7;
                us3 us3VarV6 = p33Var8 != null ? p33Var8.v(jY2) : null;
                int iMax5 = Math.max(iMax4, Math.max(us3VarV5.t, us3VarV6 != null ? us3VarV6.t : 0) + i20 + i);
                int i25 = us3VarV != null ? us3VarV.j : 0;
                int i26 = us3VarV2 != null ? us3VarV2.j : 0;
                int i27 = us3VarV3 != null ? us3VarV3.j : 0;
                int i28 = us3VarV4 != null ? us3VarV4.j : 0;
                int i29 = i26;
                int i30 = us3VarV5.j;
                us3 us3Var4 = (us3) u54Var.j;
                int i31 = i27 + i28;
                final int iL = zs0.l(Math.max(i30 + i31, Math.max((us3VarV6 != null ? us3VarV6.j : 0) + i31, us3Var4 != null ? us3Var4.j : 0)) + i25 + i29, j);
                us3 us3VarV7 = p33Var6 != null ? p33Var6.v(ws0.y(zs0.a(jY, 0, -iMax5, 1), 0, iL, 0, 0, 9)) : null;
                int i32 = us3VarV7 != null ? us3VarV7.t : 0;
                int i33 = us3VarV5.t;
                us3 us3Var5 = (us3) u54Var.j;
                int i34 = us3Var5 != null ? us3Var5.t : 0;
                int i35 = us3VarV != null ? us3VarV.t : 0;
                int i36 = us3VarV2 != null ? us3VarV2.t : 0;
                int i37 = us3VarV3 != null ? us3VarV3.t : 0;
                final us3 us3Var6 = us3VarV2;
                if (us3VarV4 != null) {
                    us3 us3Var7 = us3VarV3;
                    i2 = us3VarV4.t;
                    us3Var = us3Var7;
                } else {
                    us3Var = us3VarV3;
                    i2 = 0;
                }
                final us3 us3Var8 = us3Var;
                if (us3VarV6 != null) {
                    i3 = us3VarV6.t;
                    us3Var2 = us3VarV;
                } else {
                    us3Var2 = us3VarV;
                    i3 = 0;
                }
                if (us3VarV7 != null) {
                    f = f2;
                    i4 = us3VarV7.t;
                    i5 = 0;
                } else {
                    f = f2;
                    i4 = 0;
                    i5 = 0;
                }
                final int iX = x(v33Var, i33, i34, i35, i36, i37, i2, i3, i4, j, f);
                final int i38 = iX - i32;
                int size9 = list.size();
                int i39 = i5;
                while (i39 < size9) {
                    p33 p33Var9 = (p33) list.get(i39);
                    if (yf2.p(ue5.S(p33Var9), "Container")) {
                        final us3 us3VarV8 = p33Var9.v(zs0.g(iL != 2147483647 ? iL : i5, iL, i38 != Integer.MAX_VALUE ? i38 : i5, i38));
                        final float f3 = f;
                        final us3 us3Var9 = us3VarV4;
                        final us3 us3Var10 = us3Var2;
                        final us3 us3Var11 = us3VarV6;
                        final us3 us3Var12 = us3VarV7;
                        return v33Var.k0(iL, iX, qi1.j, new xy1() { // from class: k55
                            /* JADX WARN: Code duplicated, block: B:20:0x0099  */
                            @Override // defpackage.xy1
                            public final Object a(Object obj8) {
                                int iV3;
                                int i40;
                                ts3 ts3Var = (ts3) obj8;
                                u54 u54Var2 = u54Var;
                                Object obj9 = u54Var2.j;
                                l55 l55Var = this;
                                v33 v33Var2 = v33Var;
                                int i41 = iL;
                                int i42 = iX;
                                us3 us3Var13 = us3VarV5;
                                us3 us3Var14 = us3Var11;
                                us3 us3Var15 = us3Var10;
                                us3 us3Var16 = us3Var6;
                                us3 us3Var17 = us3Var8;
                                us3 us3Var18 = us3Var9;
                                us3 us3Var19 = us3VarV8;
                                us3 us3Var20 = us3Var12;
                                if (obj9 != null) {
                                    boolean z = l55Var.g;
                                    int i43 = iV;
                                    if (z) {
                                        iV3 = Math.round(((i38 - ((us3) obj9).t) / 2.0f) * 1.0f);
                                    } else {
                                        iV3 = v33Var2.V(l55Var.v) + i43;
                                    }
                                    us3 us3Var21 = (us3) u54Var2.j;
                                    int i44 = us3Var21.t + i43;
                                    fl2 layoutDirection = v33Var2.getLayoutDirection();
                                    j55 j55Var = l55Var.y;
                                    ts3Var.j(us3Var19, 0, 0, 0.0f);
                                    int i45 = i42 - (us3Var20 != null ? us3Var20.t : 0);
                                    if (us3Var15 != null) {
                                        ts3.m(ts3Var, us3Var15, 0, Math.round(((i45 - us3Var15.t) / 2.0f) * 1.0f));
                                    }
                                    float f4 = f3;
                                    int iA = lr2.A(f4, iV3, i43);
                                    fl2 fl2Var = fl2.j;
                                    if (layoutDirection == fl2Var) {
                                        if (us3Var15 != null) {
                                            i40 = us3Var15.j;
                                        } else {
                                            i40 = 0;
                                        }
                                    } else if (us3Var16 != null) {
                                        i40 = us3Var16.j;
                                    } else {
                                        i40 = 0;
                                    }
                                    int i46 = i40;
                                    int iRound = Math.round((1.0f + (layoutDirection == fl2Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (us3Var15 != null ? us3Var15.j : 0)) - (us3Var16 != null ? us3Var16.j : 0)) - us3Var21.j) / 2.0f)) + i46;
                                    zi6.l(j55Var);
                                    ts3Var.j(us3Var21, lr2.A(f4, iRound, Math.round((1.0f + (layoutDirection == fl2Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (us3Var15 != null ? us3Var15.j : 0)) - (us3Var16 != null ? us3Var16.j : 0)) - us3Var21.j) / 2.0f)) + i46), iA, 0.0f);
                                    if (us3Var17 != null) {
                                        ts3.m(ts3Var, us3Var17, us3Var15 != null ? us3Var15.j : 0, i44);
                                    }
                                    int i47 = (us3Var15 != null ? us3Var15.j : 0) + (us3Var17 != null ? us3Var17.j : 0);
                                    ts3.m(ts3Var, us3Var13, i47, i44);
                                    if (us3Var14 != null) {
                                        ts3.m(ts3Var, us3Var14, i47, i44);
                                    }
                                    if (us3Var18 != null) {
                                        ts3.m(ts3Var, us3Var18, (i41 - (us3Var16 != null ? us3Var16.j : 0)) - us3Var18.j, i44);
                                    }
                                    if (us3Var16 != null) {
                                        ts3.m(ts3Var, us3Var16, i41 - us3Var16.j, Math.round(((i45 - us3Var16.t) / 2.0f) * 1.0f));
                                    }
                                    if (us3Var20 != null) {
                                        ts3.m(ts3Var, us3Var20, 0, i45);
                                    }
                                } else {
                                    float fY = v33Var2.y();
                                    ts3.a(ts3Var, us3Var19, 0L);
                                    int i48 = i42 - (us3Var20 != null ? us3Var20.t : 0);
                                    int iZ2 = k33.Z(l55Var.n.n() * fY);
                                    if (us3Var15 != null) {
                                        ts3.m(ts3Var, us3Var15, 0, Math.round(((i48 - us3Var15.t) / 2.0f) * 1.0f));
                                    }
                                    if (us3Var17 != null) {
                                        ts3.m(ts3Var, us3Var17, us3Var15 != null ? us3Var15.j : 0, l55.t(l55Var, i48, iZ2, us3Var17));
                                    }
                                    int i49 = (us3Var15 != null ? us3Var15.j : 0) + (us3Var17 != null ? us3Var17.j : 0);
                                    ts3.m(ts3Var, us3Var13, i49, l55.t(l55Var, i48, iZ2, us3Var13));
                                    if (us3Var14 != null) {
                                        ts3.m(ts3Var, us3Var14, i49, l55.t(l55Var, i48, iZ2, us3Var14));
                                    }
                                    if (us3Var18 != null) {
                                        ts3.m(ts3Var, us3Var18, (i41 - (us3Var16 != null ? us3Var16.j : 0)) - us3Var18.j, l55.t(l55Var, i48, iZ2, us3Var18));
                                    }
                                    if (us3Var16 != null) {
                                        ts3.m(ts3Var, us3Var16, i41 - us3Var16.j, Math.round(((i48 - us3Var16.t) / 2.0f) * 1.0f));
                                    }
                                    if (us3Var20 != null) {
                                        ts3.m(ts3Var, us3Var20, 0, i48);
                                    }
                                }
                                return og5.g;
                            }
                        });
                    }
                    i39++;
                    i38 = i38;
                }
                tw2.y("Collection contains no element matching the predicate.");
                up.q();
                return null;
            }
            fG = f2;
            i19++;
            size7 = i21;
            i18 = i20;
            us3VarV = us3VarV;
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return null;
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        return j(list, i, new vq0((byte) 22));
    }

    public final int x(j51 j51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        zn3 zn3Var = this.n;
        int iV = j51Var.V(zn3Var.r() + zn3Var.n());
        int[] iArr = {i7, i5, i6, lr2.A(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return zs0.x(Math.max(i3, Math.max(i4, iV + (i2 > 0 ? Math.max(j51Var.V(this.v * 2.0f), lr2.A(i83.g.g(f), 0, i2)) : 0) + i)) + i8, j);
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        return j(list, i, new vq0((byte) 23));
    }
}
