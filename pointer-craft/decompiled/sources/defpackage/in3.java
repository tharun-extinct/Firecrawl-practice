package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class in3 implements t33 {
    public final xy1 g;
    public final c55 n;
    public final j55 r;
    public final zn3 v;
    public final float x;
    public final boolean y;

    public in3(xy1 xy1Var, boolean z, j55 j55Var, c55 c55Var, zn3 zn3Var, float f) {
        this.g = xy1Var;
        this.y = z;
        this.r = j55Var;
        this.n = c55Var;
        this.v = zn3Var;
        this.x = f;
    }

    public static final int a(int i, in3 in3Var, int i2, int i3, us3 us3Var, us3 us3Var2) {
        if (in3Var.y) {
            i3 = Math.round(((i2 - us3Var2.t) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (us3Var != null ? us3Var.t : 0) / 2);
    }

    @Override // defpackage.t33
    public final int g(rf2 rf2Var, List list, int i) {
        return j(rf2Var, list, i, new vq0((byte) 9));
    }

    public final int j(rf2 rf2Var, List list, int i, bz1 bz1Var) {
        Object obj;
        int iO;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        in3 in3Var = this;
        float fG = in3Var.n.g();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (yf2.p(pw5.z((p33) obj), "Leading")) {
                break;
            }
            i2++;
        }
        p33 p33Var = (p33) obj;
        if (p33Var != null) {
            iO = pw5.O(i, p33Var.Y(Integer.MAX_VALUE));
            iIntValue = ((Number) bz1Var.l(p33Var, Integer.valueOf(i))).intValue();
        } else {
            iO = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (yf2.p(pw5.z((p33) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        p33 p33Var2 = (p33) obj2;
        if (p33Var2 != null) {
            iO = pw5.O(iO, p33Var2.Y(Integer.MAX_VALUE));
            iIntValue2 = ((Number) bz1Var.l(p33Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (yf2.p(pw5.z((p33) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (p33) obj3;
        int iIntValue5 = obj8 != null ? ((Number) bz1Var.l(obj8, Integer.valueOf(lr2.A(fG, iO, i)))).intValue() : 0;
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
        if (p33Var3 != null) {
            iIntValue3 = ((Number) bz1Var.l(p33Var3, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var3.Y(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
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
        if (p33Var4 != null) {
            iIntValue4 = ((Number) bz1Var.l(p33Var4, Integer.valueOf(iO))).intValue();
            iO = pw5.O(iO, p33Var4.Y(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (yf2.p(pw5.z((p33) obj9), "TextField")) {
                int iIntValue6 = ((Number) bz1Var.l(obj9, Integer.valueOf(iO))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (yf2.p(pw5.z((p33) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (p33) obj6;
                int iIntValue7 = obj10 != null ? ((Number) bz1Var.l(obj10, Integer.valueOf(iO))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (yf2.p(pw5.z((p33) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (p33) obj7;
                return in3Var.x(rf2Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) bz1Var.l(obj11, Integer.valueOf(i))).intValue() : 0, zs0.y(0, 0, 0, 0, 15), fG);
            }
            i7++;
            iIntValue4 = iIntValue4;
            in3Var = this;
            iIntValue3 = iIntValue3;
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return 0;
    }

    public final int l(j51 j51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, lr2.A(f, i6, 0))) + i + i2;
        zn3 zn3Var = this.v;
        fl2 fl2Var = fl2.j;
        return zs0.l(Math.max(iMax, k33.Z((i6 + j51Var.e(zn3Var.y(fl2Var) + zn3Var.g(fl2Var))) * f)), j);
    }

    @Override // defpackage.t33
    public final int n(rf2 rf2Var, List list, int i) {
        return j(rf2Var, list, i, new vq0((byte) 7));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.t33
    public final defpackage.u33 r(defpackage.v33 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in3.r(v33, java.util.List, long):u33");
    }

    public final int t(rf2 rf2Var, List list, int i, bz1 bz1Var) {
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
                    if (yf2.p(pw5.z((p33) obj4), "Leading")) {
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
                    if (yf2.p(pw5.z((p33) obj5), "Prefix")) {
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
                    if (yf2.p(pw5.z((p33) obj6), "Suffix")) {
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
                return l(rf2Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, p33Var6 != null ? ((Number) bz1Var.l(p33Var6, Integer.valueOf(i))).intValue() : 0, zs0.y(0, 0, 0, 0, 15), this.n.g());
            }
        }
        tw2.y("Collection contains no element matching the predicate.");
        up.q();
        return 0;
    }

    @Override // defpackage.t33
    public final int v(rf2 rf2Var, List list, int i) {
        return t(rf2Var, list, i, new vq0((byte) 10));
    }

    public final int x(j51 j51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, lr2.A(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        zn3 zn3Var = this.v;
        float fE = j51Var.e(zn3Var.n());
        return zs0.x(Math.max(i, Math.max(i2, k33.Z(lr2.e(fE, Math.max(fE, i6 / 2.0f), f) + i5 + j51Var.e(zn3Var.r())))) + i8, j);
    }

    @Override // defpackage.t33
    public final int y(rf2 rf2Var, List list, int i) {
        return t(rf2Var, list, i, new vq0((byte) 8));
    }
}
