package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ws1 implements a93, fb4 {
    public final xq g;
    public final by0 n;
    public final float r;
    public final float v;
    public final us1 x;
    public final ar y;

    public ws1(xq xqVar, ar arVar, float f, by0 by0Var, float f2, us1 us1Var) {
        this.g = xqVar;
        this.y = arVar;
        this.r = f;
        this.n = by0Var;
        this.v = f2;
        this.x = us1Var;
    }

    public static int m(List list, int i, int i2, int i3, us1 us1Var) {
        long jG = ee2.g(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            cr crVar = new cr(us1Var, zs0.g(0, i, 0, Integer.MAX_VALUE), i2, i3);
            p33 p33Var = (p33) cj0.m0(0, list);
            int iZ = p33Var != null ? p33Var.Z(i) : 0;
            int iP = p33Var != null ? p33Var.P(iZ) : 0;
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            int i5 = 0;
            if (crVar.y(z, 0, ee2.g(i, Integer.MAX_VALUE), p33Var == null ? null : new ee2(ee2.g(iP, iZ)), 0, 0, 0, false, false).y) {
                us1Var.getClass();
                jG = jG;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < size) {
                    int i12 = i6 - iP;
                    i9++;
                    int iMax = Math.max(i8, iZ);
                    p33 p33Var2 = (p33) cj0.m0(i9, list);
                    iZ = p33Var2 != null ? p33Var2.Z(i) : 0;
                    int iP2 = p33Var2 != null ? p33Var2.P(iZ) + i2 : 0;
                    int i13 = i9 - i11;
                    int i14 = i7;
                    int i15 = iP2;
                    rs1 rs1VarY = crVar.y(i9 + 2 < list.size() ? z : false, i13, ee2.g(i12, i4), p33Var2 == null ? null : new ee2(ee2.g(iP2, iZ)), i14, i5, iMax, false, false);
                    if (rs1VarY.g) {
                        int i16 = iMax + i3 + i5;
                        crVar.g(rs1VarY, p33Var2 != null, i14, i16, i12, i13);
                        int i17 = i15 - i2;
                        i7 = i14 + 1;
                        if (rs1VarY.y) {
                            i10 = i9;
                            i5 = i16;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iP = i17;
                        i5 = i16;
                        i8 = 0;
                    } else {
                        iP = i15;
                        i6 = i12;
                        i7 = i14;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jG = ee2.g(i5 - i3, i10);
            }
        }
        return (int) (jG >> 32);
    }

    @Override // defpackage.fb4
    public final u33 a(final us3[] us3VarArr, v33 v33Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final fl2 fl2Var = fl2.j;
        return v33Var.k0(i, i2, qi1.j, new xy1() { // from class: vs1
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                c93 c93Var;
                ts3 ts3Var = (ts3) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    us3 us3Var = us3VarArr[i8];
                    us3Var.getClass();
                    Object objA = us3Var.a();
                    gb4 gb4Var = objA instanceof gb4 ? (gb4) objA : null;
                    if (gb4Var == null || (c93Var = gb4Var.r) == null) {
                        c93Var = this.n;
                    }
                    ts3Var.j(us3Var, iArr[i8 - i7], c93Var.p(i2, us3Var.d0(), fl2Var) + i6, 0.0f);
                }
                return og5.g;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws1)) {
            return false;
        }
        ws1 ws1Var = (ws1) obj;
        return this.g.equals(ws1Var.g) && this.y.equals(ws1Var.y) && vb1.y(this.r, ws1Var.r) && this.n.equals(ws1Var.n) && vb1.y(this.v, ws1Var.v) && yf2.p(this.x, ws1Var.x);
    }

    @Override // defpackage.a93
    public final int g(rf2 rf2Var, List list, int i) {
        List list2 = (List) cj0.m0(1, list);
        p33 p33Var = list2 != null ? (p33) cj0.l0(list2) : null;
        List list3 = (List) cj0.m0(2, list);
        p33 p33Var2 = list3 != null ? (p33) cj0.l0(list3) : null;
        long jY = zs0.y(0, i, 0, 0, 13);
        us1 us1Var = this.x;
        us1Var.g(p33Var, p33Var2, jY);
        List list4 = (List) cj0.l0(list);
        if (list4 == null) {
            list4 = pi1.j;
        }
        return m(list4, i, rf2Var.V(this.r), rf2Var.V(this.v), us1Var);
    }

    public final int hashCode() {
        return this.x.hashCode() + du4.r(Integer.MAX_VALUE, du4.r(Integer.MAX_VALUE, fj.y(this.v, fj.y(-1.0f, fj.y(this.r, (this.y.hashCode() + ((this.g.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // defpackage.fb4
    public final int j(us3 us3Var) {
        return us3Var.d0();
    }

    @Override // defpackage.fb4
    public final long l(int i, int i2, int i3, boolean z) {
        kb4 kb4Var = jb4.g;
        return !z ? zs0.g(i, i2, 0, i3) : y94.A(i, i2, 0, i3);
    }

    @Override // defpackage.a93
    public final int n(rf2 rf2Var, List list, int i) {
        List list2 = (List) cj0.m0(1, list);
        p33 p33Var = list2 != null ? (p33) cj0.l0(list2) : null;
        List list3 = (List) cj0.m0(2, list);
        p33 p33Var2 = list3 != null ? (p33) cj0.l0(list3) : null;
        long jY = zs0.y(0, i, 0, 0, 13);
        us1 us1Var = this.x;
        us1Var.g(p33Var, p33Var2, jY);
        List list4 = (List) cj0.l0(list);
        if (list4 == null) {
            list4 = pi1.j;
        }
        return m(list4, i, rf2Var.V(this.r), rf2Var.V(this.v), us1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a93
    public final u33 r(v33 v33Var, List list, long j) {
        p33 p33Var;
        ee2 ee2Var;
        us3 us3Var;
        rs1 rs1Var;
        int i;
        int i2;
        char c;
        us3 us3VarV;
        ee2 ee2Var2;
        ee2 ee2Var3;
        rs1 rs1Var2;
        int i3;
        long jG;
        long jG2;
        us3 us3VarV2;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        qi1 qi1Var = qi1.j;
        if (!zIsEmpty) {
            int iJ = ws0.j(j);
            us1 us1Var = this.x;
            if (iJ != 0) {
                List list2 = (List) cj0.j0(list);
                if (list2.isEmpty()) {
                    return v33Var.k0(0, 0, qi1Var, new wm0((byte) 23));
                }
                List list3 = (List) cj0.m0(1, list);
                p33 p33Var2 = list3 != null ? (p33) cj0.l0(list3) : null;
                List list4 = (List) cj0.m0(2, list);
                p33 p33Var3 = list4 != null ? (p33) cj0.l0(list4) : null;
                list2.size();
                us1Var.getClass();
                jn2 jn2Var = jn2.j;
                long jA = dc6.a(dc6.l(10, dc6.x(j, jn2Var)));
                if (p33Var2 != null) {
                    if (kq2.H(kq2.E(p33Var2)) == 0.0f) {
                        kq2.E(p33Var2);
                        us3 us3VarV3 = p33Var2.v(jA);
                        new ee2(ee2.g(us3VarV3.g0(), us3VarV3.d0()));
                        us3VarV3.g0();
                        us3VarV3.d0();
                    } else {
                        p33Var2.Z(p33Var2.P(Integer.MAX_VALUE));
                    }
                }
                if (p33Var3 != null) {
                    if (kq2.H(kq2.E(p33Var3)) == 0.0f) {
                        kq2.E(p33Var3);
                        us3 us3VarV4 = p33Var3.v(jA);
                        new ee2(ee2.g(us3VarV4.g0(), us3VarV4.d0()));
                        us3VarV4.g0();
                        us3VarV4.d0();
                    } else {
                        p33Var3.Z(p33Var3.P(Integer.MAX_VALUE));
                    }
                }
                Iterator it = list2.iterator();
                long jX = dc6.x(j, jn2Var);
                rb3 rb3Var = new rb3(new u33[16]);
                int iT = ws0.t(jX);
                int iM = ws0.m(jX);
                int iJ2 = ws0.j(jX);
                ha3 ha3Var = ie2.g;
                ha3 ha3Var2 = new ha3();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(v33Var.e(this.r));
                int iCeil2 = (int) Math.ceil(v33Var.e(this.v));
                long jG3 = zs0.g(0, iT, 0, iJ2);
                long jA2 = dc6.a(dc6.l(14, jG3));
                if (it.hasNext()) {
                    try {
                        p33Var = (p33) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        p33Var = null;
                    }
                } else {
                    p33Var = null;
                }
                if (p33Var != null) {
                    if (kq2.H(kq2.E(p33Var)) == 0.0f) {
                        kq2.E(p33Var);
                        us3VarV2 = p33Var.v(jA2);
                        jG2 = ee2.g(us3VarV2.g0(), us3VarV2.d0());
                    } else {
                        int iP = p33Var.P(Integer.MAX_VALUE);
                        jG2 = ee2.g(iP, p33Var.Z(iP));
                        us3VarV2 = null;
                    }
                    ee2Var = new ee2(jG2);
                    us3Var = us3VarV2;
                } else {
                    it = it;
                    iM = iM;
                    ee2Var = null;
                    us3Var = null;
                }
                Integer numValueOf = ee2Var != null ? Integer.valueOf((int) (ee2Var.g >> 32)) : null;
                Integer numValueOf2 = ee2Var != null ? Integer.valueOf((int) (ee2Var.g & 4294967295L)) : null;
                ee2 ee2Var4 = ee2Var;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                ia3 ia3Var = new ia3();
                us1 us1Var2 = this.x;
                cr crVar = new cr(us1Var2, jX, iCeil, iCeil2);
                rs1 rs1VarY = crVar.y(it.hasNext(), 0, ee2.g(iT, iJ2), ee2Var4, 0, 0, 0, false, false);
                if (rs1VarY.y) {
                    rs1Var = rs1VarY;
                    crVar.g(rs1Var, ee2Var4 != null, -1, 0, iT, 0);
                } else {
                    rs1Var = rs1VarY;
                }
                int i4 = iT;
                Integer num = numValueOf2;
                int i5 = iCeil;
                ia3 ia3Var2 = ia3Var;
                rs1 rs1Var3 = rs1Var;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = iJ2;
                int[] iArrCopyOf = iArr2;
                int i15 = iM;
                p33 p33Var4 = p33Var;
                us3 us3Var2 = us3Var;
                int[] iArrCopyOf2 = iArr;
                while (!rs1Var3.y && p33Var4 != null) {
                    numValueOf.getClass();
                    int iIntValue = numValueOf.intValue();
                    num.getClass();
                    int iIntValue2 = num.intValue();
                    int i16 = i8;
                    int i17 = i10 + iIntValue;
                    int iMax = Math.max(i6, iIntValue2);
                    int i18 = i4 - iIntValue;
                    int i19 = i7 + 1;
                    us1Var2.getClass();
                    arrayList.add(p33Var4);
                    ha3Var2.t(i7, us3Var2);
                    p33Var4.a();
                    int i20 = i19 - i11;
                    if (it.hasNext()) {
                        try {
                            p33Var4 = (p33) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            p33Var4 = null;
                        }
                    } else {
                        p33Var4 = null;
                    }
                    if (p33Var4 != null) {
                        if (kq2.H(kq2.E(p33Var4)) == 0.0f) {
                            kq2.E(p33Var4);
                            us3VarV = p33Var4.v(jA2);
                            jG = ee2.g(us3VarV.g0(), us3VarV.d0());
                        } else {
                            int iP2 = p33Var4.P(Integer.MAX_VALUE);
                            jG = ee2.g(iP2, p33Var4.Z(iP2));
                            us3VarV = null;
                        }
                        ee2Var2 = new ee2(jG);
                    } else {
                        jA2 = jA2;
                        us3VarV = null;
                        ee2Var2 = null;
                    }
                    Integer numValueOf3 = ee2Var2 != null ? Integer.valueOf(((int) (ee2Var2.g >> 32)) + i5) : null;
                    Integer numValueOf4 = ee2Var2 != null ? Integer.valueOf((int) (ee2Var2.g & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i21 = i12;
                    long jG4 = ee2.g(i18, i14);
                    if (ee2Var2 == null) {
                        ee2Var3 = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue3 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        ee2Var3 = new ee2(ee2.g(iIntValue3, numValueOf4.intValue()));
                    }
                    rs1 rs1VarY2 = crVar.y(zHasNext, i20, jG4, ee2Var3, i21, i13, iMax, false, false);
                    if (rs1VarY2.g) {
                        int iMin = Math.min(Math.max(i15, i17), iT);
                        int i22 = i13 + iMax;
                        rs1Var2 = rs1VarY2;
                        crVar.g(rs1Var2, ee2Var2 != null, i21, i22, i18, i20);
                        int i23 = i16 + 1;
                        if (iArrCopyOf.length < i23) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i23, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i16] = iMax;
                        i8 = i16 + 1;
                        i14 = (i14 - i22) - iCeil2;
                        int i24 = i9 + 1;
                        if (iArrCopyOf2.length < i24) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i24, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i9] = i19;
                        i9++;
                        i12 = i21 + 1;
                        int i25 = i22 + iCeil2;
                        i18 = iT;
                        numValueOf = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i5) : null;
                        i15 = iMin;
                        i11 = i19;
                        i13 = i25;
                        i3 = 0;
                        iMax = 0;
                    } else {
                        rs1Var2 = rs1VarY2;
                        i3 = i17;
                        i8 = i16;
                        numValueOf = numValueOf3;
                        i12 = i21;
                    }
                    us3Var2 = us3VarV;
                    jA2 = jA2;
                    i4 = i18;
                    num = numValueOf4;
                    i10 = i3;
                    i7 = i19;
                    rs1Var3 = rs1Var2;
                    i6 = iMax;
                }
                int i26 = i8;
                int size = arrayList.size();
                ArrayList arrayList2 = arrayList;
                us3[] us3VarArr = new us3[size];
                for (int i27 = 0; i27 < size; i27++) {
                    us3VarArr[i27] = ha3Var2.y(i27);
                }
                int[] iArr3 = new int[i9];
                int[] iArr4 = new int[i9];
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (i29 < i9) {
                    ArrayList arrayList3 = arrayList2;
                    int i31 = i15;
                    int i32 = iArrCopyOf2[i29];
                    if (i29 < 0 || i29 >= (i2 = i26)) {
                        cf6.t("Index must be between 0 and size");
                        throw null;
                    }
                    int iJ3 = iArrCopyOf[i29];
                    ia3 ia3Var3 = ia3Var2;
                    if (ia3Var3.r(i29)) {
                        c = 65535;
                    } else {
                        c = 65535;
                        iJ3 = ws0.j(jG3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : ws0.j(jG3) - i30;
                    }
                    ia3Var2 = ia3Var3;
                    i26 = i2;
                    int[] iArr5 = iArrCopyOf2;
                    int i33 = i5;
                    u33 u33VarI = mq2.i(this, i31, ws0.a(jG3), ws0.t(jG3), iJ3, i33, v33Var, arrayList3, us3VarArr, i28, i32, iArr3, i29);
                    int i34 = i29;
                    int iY = u33VarI.y();
                    int iG = u33VarI.g();
                    iArr4[i34] = iG;
                    i30 += iG;
                    int iMax2 = Math.max(i31, iY);
                    rb3Var.y(u33VarI);
                    i28 = i32;
                    i5 = i33;
                    iArrCopyOf2 = iArr5;
                    i29 = i34 + 1;
                    i15 = iMax2;
                    arrayList2 = arrayList3;
                }
                int i35 = i15;
                if (rb3Var.a == 0) {
                    i = 0;
                    i30 = 0;
                } else {
                    i = i35;
                }
                ar arVar = this.y;
                int iV = ((rb3Var.a - 1) * v33Var.V(arVar.g())) + i30;
                int iA = ws0.a(jX);
                int iJ4 = ws0.j(jX);
                if (iV < iA) {
                    iV = iA;
                }
                if (iV <= iJ4) {
                    iJ4 = iV;
                }
                arVar.m(v33Var, iJ4, iArr4, iArr3);
                int iM2 = ws0.m(jX);
                int iT2 = ws0.t(jX);
                if (i < iM2) {
                    i = iM2;
                }
                if (i <= iT2) {
                    iT2 = i;
                }
                return v33Var.k0(iT2, iJ4, qi1Var, new h(rb3Var, (byte) 23));
            }
            us1Var.getClass();
        }
        return v33Var.k0(0, 0, qi1Var, new wm0((byte) 22));
    }

    @Override // defpackage.fb4
    public final int t(us3 us3Var) {
        return us3Var.g0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.g + ", verticalArrangement=" + this.y + ", mainAxisSpacing=" + vb1.r(this.r) + ", crossAxisAlignment=" + this.n + ", crossAxisArrangementSpacing=" + vb1.r(this.v) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.x + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a93
    public final int v(rf2 rf2Var, List list, int i) {
        int[] iArr;
        us1 us1Var;
        List list2;
        long jG;
        int i2;
        int i3 = i;
        int i4 = 1;
        List list3 = (List) cj0.m0(1, list);
        p33 p33Var = list3 != null ? (p33) cj0.l0(list3) : null;
        char c = 2;
        List list4 = (List) cj0.m0(2, list);
        int i5 = 0;
        this.x.g(p33Var, list4 != null ? (p33) cj0.l0(list4) : null, zs0.y(0, 0, 0, i3, 7));
        List list5 = (List) cj0.l0(list);
        if (list5 == null) {
            list5 = pi1.j;
        }
        int iV = rf2Var.V(this.r);
        int iV2 = rf2Var.V(this.v);
        long jG2 = ee2.g(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i6 = 0;
        while (i6 < size3) {
            p33 p33Var2 = (p33) list5.get(i6);
            char c2 = c;
            int iP = p33Var2.P(i3);
            iArr2[i6] = iP;
            iArr3[i6] = p33Var2.Z(iP);
            i6++;
            c = c2;
        }
        int size4 = list5.size();
        us1 us1Var2 = this.x;
        if (Integer.MAX_VALUE < size4) {
            us1Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            us1Var2.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr2[i8];
        }
        int size5 = ((list5.size() - 1) * iV) + i7;
        if (size2 == 0) {
            uo1.b();
            return 0;
        }
        int i9 = iArr3[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr3[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            uo1.b();
            return 0;
        }
        int i13 = iArr2[i5];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i9 != i3) {
            int i18 = (i13 + i17) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr2;
                jG = jG2;
                iArr = iArr3;
                us1Var = us1Var2;
            } else {
                int i19 = i5;
                iArr = iArr3;
                us1Var = us1Var2;
                cr crVar = new cr(us1Var, zs0.g(i19, i18, i19, Integer.MAX_VALUE), iV, iV2);
                p33 p33Var3 = (p33) cj0.m0(i19, list5);
                int i20 = p33Var3 != null ? iArr[i19] : i19;
                int i21 = p33Var3 != null ? iArr2[i19] : 0;
                int i22 = 0;
                if (crVar.y(list5.size() > i4 ? i4 : 0, 0, ee2.g(i18, Integer.MAX_VALUE), p33Var3 == null ? null : new ee2(ee2.g(i21, i20)), 0, 0, 0, false, false).y) {
                    us1Var.getClass();
                    list2 = list5;
                    jG = jG2;
                } else {
                    int size6 = list5.size();
                    int i23 = i18;
                    int i24 = i21;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = i20;
                    int i30 = 0;
                    while (true) {
                        if (i28 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i31 = i23 - i24;
                        int i32 = size6;
                        int i33 = i28 + 1;
                        int iMax = Math.max(i26, i29);
                        p33 p33Var4 = (p33) cj0.m0(i33, list5);
                        i29 = p33Var4 != null ? iArr[i33] : 0;
                        int i34 = p33Var4 != null ? iArr2[i33] + iV : 0;
                        list2 = list5;
                        int i35 = i33 - i27;
                        int i36 = i25;
                        rs1 rs1VarY = crVar.y(i28 + 2 < list2.size(), i35, ee2.g(i31, Integer.MAX_VALUE), p33Var4 == null ? null : new ee2(ee2.g(i34, i29)), i36, i22, iMax, false, false);
                        if (rs1VarY.g) {
                            int i37 = iMax + iV2 + i22;
                            crVar.g(rs1VarY, p33Var4 != null, i36, i37, i31, i35);
                            int i38 = i34 - iV;
                            i25 = i36 + 1;
                            if (rs1VarY.y) {
                                i22 = i37;
                                i30 = i33;
                                break;
                            }
                            i24 = i38;
                            i23 = i18;
                            i22 = i37;
                            i2 = i33;
                            i26 = 0;
                        } else {
                            i24 = i34;
                            i23 = i31;
                            i25 = i36;
                            i26 = iMax;
                            i2 = i27;
                        }
                        i27 = i2;
                        size6 = i32;
                        i28 = i33;
                        i30 = i28;
                        list5 = list2;
                    }
                    jG = ee2.g(i22 - iV2, i30);
                }
            }
            i9 = (int) (jG >> 32);
            int i39 = (int) (jG & 4294967295L);
            i3 = i;
            if (i9 > i3 || i39 < iMin) {
                i13 = i18 + 1;
                if (i13 > i17) {
                    return i13;
                }
            } else {
                if (i9 >= i3) {
                    return i18;
                }
                i17 = i18 - 1;
            }
            size5 = i18;
            iArr2 = iArr2;
            us1Var2 = us1Var;
            iArr3 = iArr;
            list5 = list2;
            i4 = 1;
            i5 = 0;
        }
        return size5;
    }

    @Override // defpackage.fb4
    public final void x(int i, int[] iArr, int[] iArr2, v33 v33Var) {
        this.g.j(v33Var, i, iArr, v33Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.a93
    public final int y(rf2 rf2Var, List list, int i) {
        List list2 = (List) cj0.m0(1, list);
        p33 p33Var = list2 != null ? (p33) cj0.l0(list2) : null;
        List list3 = (List) cj0.m0(2, list);
        this.x.g(p33Var, list3 != null ? (p33) cj0.l0(list3) : null, zs0.y(0, 0, 0, i, 7));
        List list4 = (List) cj0.l0(list);
        if (list4 == null) {
            list4 = pi1.j;
        }
        int iV = rf2Var.V(this.r);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iY = ((p33) list4.get(i2)).Y(i) + iV;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iY) - iV);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iY;
            }
            i2 = i5;
        }
        return iMax;
    }
}
