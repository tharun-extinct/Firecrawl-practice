package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lo3 implements cr2 {
    public final /* synthetic */ u21 g;
    public final /* synthetic */ ox0 j;
    public final /* synthetic */ d52 l;
    public final /* synthetic */ my1 n;
    public final /* synthetic */ cm1 r;
    public final /* synthetic */ my1 v;
    public final /* synthetic */ j00 x;
    public final /* synthetic */ zn3 y;

    public lo3(u21 u21Var, zn3 zn3Var, cm1 cm1Var, ai2 ai2Var, my1 my1Var, j00 j00Var, d52 d52Var, ox0 ox0Var) {
        this.g = u21Var;
        this.y = zn3Var;
        this.r = cm1Var;
        this.n = ai2Var;
        this.v = my1Var;
        this.x = j00Var;
        this.l = d52Var;
        this.j = ox0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12, types: [java.util.List] */
    @Override // defpackage.cr2
    public final u33 g(dr2 dr2Var, long j) {
        j00 j00Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        dr drVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        w33 w33Var;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        List arrayList2;
        int i17;
        int i18;
        int i19;
        qy4 qy4Var;
        float f;
        dr drVar2;
        int i20;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? r0;
        int i21;
        boolean z;
        float fQ;
        mo3 mo3Var;
        int i22;
        qy4 qy4Var2;
        dr2 dr2Var2;
        long j2;
        ArrayList arrayList5;
        int i23;
        int i24;
        lo3 lo3Var = this;
        u21 u21Var = lo3Var.g;
        u21Var.A.getValue();
        um3 um3Var = um3.t;
        yf2.h(j, um3Var);
        qy4 qy4Var3 = dr2Var.t;
        fl2 layoutDirection = qy4Var3.getLayoutDirection();
        zn3 zn3Var = lo3Var.y;
        int iV = qy4Var3.V(ue5.A(zn3Var, layoutDirection));
        int iV2 = qy4Var3.V(ue5.e(zn3Var, qy4Var3.getLayoutDirection()));
        int iV3 = qy4Var3.V(zn3Var.n());
        int iV4 = qy4Var3.V(zn3Var.r()) + iV3;
        int i25 = iV2 + iV;
        int i26 = i25 - iV;
        long jT = zs0.t(-i25, -iV4, j);
        u21Var.c = dr2Var;
        int iV5 = qy4Var3.V(0.0f);
        int iT = ws0.t(j) - i25;
        int i27 = iV5;
        long j3 = (((long) iV) << 32) | (((long) iV3) & 4294967295L);
        lo3Var.r.getClass();
        int i28 = iT < 0 ? 0 : iT;
        zs0.y(0, i28, 0, ws0.j(jT), 5);
        jo3 jo3Var = (jo3) lo3Var.n.g();
        d52 d52Var = lo3Var.l;
        at4 at4VarM = js2.m();
        Object obj = null;
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        long j4 = j3;
        at4 at4VarB = js2.b(at4VarM);
        try {
            int iM = u21Var.m();
            oo3 oo3Var = u21Var.n;
            long j5 = jT;
            int iW = zq2.w(iM, jo3Var, oo3Var.v);
            if (iM != iW) {
                ((qp3) oo3Var.r).e(iW);
                ((er2) oo3Var.x).g(iM);
            }
            u21Var.m();
            float fD = ((pp3) oo3Var.n).d();
            u21Var.w();
            d52Var.getClass();
            int i29 = i28 + i27;
            int iZ = k33.Z(0.0f - (fD * i29));
            js2.z(at4VarM, at4VarB, xy1VarV);
            ga3 ga3VarS = kq2.s(jo3Var, u21Var.d, u21Var.h);
            ha3 ha3Var = ie2.g;
            ha3 ha3Var2 = new ha3();
            int iIntValue = ((Number) lo3Var.v.g()).intValue();
            ob3 ob3Var = u21Var.e;
            if (iV < 0) {
                pc2.g("negative beforeContentPadding");
            }
            if (i26 < 0) {
                pc2.g("negative afterContentPadding");
            }
            int i30 = i29 < 0 ? 0 : i29;
            int i31 = iZ;
            jo3 jo3Var2 = jo3Var;
            int i32 = iIntValue < 0 ? iIntValue : 0;
            long jY = zs0.y(0, i28, 0, ws0.j(j5), 5);
            qi1 qi1Var = qi1.j;
            int i33 = i29;
            d52 d52Var2 = lo3Var.l;
            ox0 ox0Var = lo3Var.j;
            if (iIntValue <= 0) {
                i22 = 1;
                mo3Var = new mo3(i28, i27, i26, -iV, iT + i26, i32, d52Var2, qy4Var3.k0(zs0.l(ws0.m(j5) + i25, j), zs0.x(ws0.a(j5) + iV4, j), qi1Var, new rn3((byte) 3)), ox0Var, dr2Var, jY);
                dr2Var2 = dr2Var;
                qy4Var2 = qy4Var3;
            } else {
                int i34 = i28;
                int i35 = iV4;
                long j6 = jY;
                while (iW > 0 && i31 > 0) {
                    iW--;
                    i31 -= i30;
                }
                int i36 = i31 * (-1);
                if (iW >= iIntValue) {
                    iW = iIntValue - 1;
                    i36 = 0;
                }
                dr drVar3 = new dr();
                int i37 = -iV;
                int i38 = i37 + (i27 < 0 ? i27 : 0);
                int i39 = i30;
                int i40 = i36 + i38;
                int i41 = iW;
                int iMax = 0;
                while (true) {
                    j00Var = lo3Var.x;
                    if (i40 >= 0 || i41 <= 0) {
                        break;
                    }
                    i41--;
                    int i42 = i35;
                    int i43 = i34;
                    int i44 = iV;
                    int i45 = iMax;
                    int i46 = i32;
                    int i47 = iIntValue;
                    long j7 = j6;
                    long j8 = j4;
                    jo3 jo3Var3 = jo3Var2;
                    w33 w33VarZ = xs2.z(dr2Var, i41, j7, jo3Var3, j8, j00Var, qy4Var3.getLayoutDirection(), i43, ha3Var2);
                    i34 = i43;
                    drVar3.add(0, w33VarZ);
                    iMax = Math.max(i45, w33VarZ.j);
                    i40 += i39;
                    lo3Var = this;
                    jo3Var2 = jo3Var3;
                    iT = iT;
                    qy4Var3 = qy4Var3;
                    i35 = i42;
                    iV = i44;
                    i27 = i27;
                    qi1Var = qi1Var;
                    j4 = j8;
                    iIntValue = i47;
                    j6 = j7;
                    j5 = j5;
                    i32 = i46;
                }
                qi1 qi1Var2 = qi1Var;
                int i48 = iV;
                int i49 = iMax;
                int i50 = i35;
                int i51 = i27;
                int i52 = i32;
                long j9 = j5;
                int i53 = iIntValue;
                long j10 = j6;
                int i54 = iT;
                long j11 = j4;
                qy4 qy4Var4 = qy4Var3;
                j00 j00Var2 = j00Var;
                jo3 jo3Var4 = jo3Var2;
                if (i40 < i38) {
                    i40 = i38;
                }
                int i55 = i40 - i38;
                int i56 = i54 + i26;
                int i57 = i56 < 0 ? 0 : i56;
                int i58 = -i55;
                int i59 = 0;
                boolean z2 = false;
                int i60 = i41;
                while (i59 < drVar3.a) {
                    if (i58 >= i57) {
                        drVar3.y(i59);
                        z2 = true;
                    } else {
                        i60++;
                        i58 += i39;
                        i59++;
                    }
                }
                int i61 = i55;
                int i62 = i58;
                int i63 = i53;
                float f2 = 0.0f;
                boolean z3 = z2;
                int i64 = i49;
                int i65 = i60;
                while (i65 < i63 && (i62 < i57 || i62 <= 0 || drVar3.isEmpty())) {
                    int i66 = i64;
                    int i67 = i56;
                    int i68 = i61;
                    int i69 = i63;
                    long j12 = j10;
                    int i70 = i57;
                    int i71 = i65;
                    w33 w33VarZ2 = xs2.z(dr2Var, i71, j12, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2);
                    int i72 = i69 - 1;
                    i62 += i71 == i72 ? i34 : i39;
                    if (i62 > i38 || i71 == i72) {
                        int iMax2 = Math.max(i66, w33VarZ2.j);
                        drVar3.addLast(w33VarZ2);
                        i64 = iMax2;
                    } else {
                        i41 = i71 + 1;
                        i68 -= i39;
                        i64 = i66;
                        z3 = true;
                    }
                    i65 = i71 + 1;
                    i56 = i67;
                    i57 = i70;
                    j10 = j12;
                    i63 = i69;
                    i61 = i68;
                }
                if (i62 < i54) {
                    int i73 = i54 - i62;
                    int i74 = i62 + i73;
                    int i75 = i61 - i73;
                    int iMax3 = i64;
                    while (true) {
                        i24 = i48;
                        if (i75 >= i24 || i41 <= 0) {
                            break;
                        }
                        i41--;
                        int i76 = iMax3;
                        i48 = i24;
                        w33 w33VarZ3 = xs2.z(dr2Var, i41, j10, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2);
                        drVar3.add(0, w33VarZ3);
                        iMax3 = Math.max(i76, w33VarZ3.j);
                        i75 += i39;
                        i65 = i65;
                        i74 = i74;
                    }
                    i48 = i24;
                    int i77 = i75;
                    i4 = i74;
                    i = i65;
                    i2 = iMax3;
                    if (i77 < 0) {
                        i4 += i77;
                        i3 = 0;
                    } else {
                        i3 = i77;
                    }
                } else {
                    i = i65;
                    int i78 = i62;
                    i2 = i64;
                    i3 = i61;
                    i4 = i78;
                }
                if (i3 < 0) {
                    pc2.g("invalid currentFirstPageScrollOffset");
                }
                int i79 = -i3;
                w33 w33Var2 = (w33) drVar3.first();
                int i80 = i2;
                int i81 = i51;
                if (i48 > 0 || i81 < 0) {
                    int i82 = i3;
                    int iG = drVar3.g();
                    w33 w33Var3 = w33Var2;
                    int i83 = i82;
                    int i84 = 0;
                    while (true) {
                        if (i84 >= iG || i83 == 0) {
                            i5 = i;
                            i6 = 1;
                            break;
                        }
                        i5 = i;
                        int i85 = i39;
                        if (i85 > i83) {
                            i39 = i85;
                            i6 = 1;
                            break;
                        }
                        i39 = i85;
                        i6 = 1;
                        if (i84 == drVar3.g() - 1) {
                            break;
                        }
                        i83 -= i39;
                        i84++;
                        w33Var3 = (w33) drVar3.get(i84);
                        i = i5;
                    }
                    i7 = i83;
                    w33Var2 = w33Var3;
                } else {
                    i5 = i;
                    i6 = 1;
                    i7 = i3;
                }
                int iMax4 = Math.max(0, i41 - i52);
                int i86 = i41 - 1;
                if (iMax4 <= i86) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        i8 = i7;
                        arrayList = arrayList6;
                        int i87 = i4;
                        i13 = i54;
                        w33Var = w33Var2;
                        i10 = i87;
                        drVar = drVar3;
                        i9 = i81;
                        i11 = i52;
                        i12 = iMax4;
                        arrayList.add(xs2.z(dr2Var, i86, j10, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2));
                        if (i86 == i12) {
                            break;
                        }
                        i86--;
                        iMax4 = i12;
                        w33Var2 = w33Var;
                        i52 = i11;
                        i54 = i13;
                        i4 = i10;
                        drVar3 = drVar;
                        i81 = i9;
                        arrayList6 = arrayList;
                        i7 = i8;
                    }
                } else {
                    i8 = i7;
                    drVar = drVar3;
                    i9 = i81;
                    i10 = i4;
                    i11 = i52;
                    i12 = iMax4;
                    i13 = i54;
                    w33Var = w33Var2;
                    arrayList = null;
                }
                ga3 ga3Var = ga3VarS;
                int[] iArr = ga3Var.g;
                int i88 = ga3Var.y;
                ArrayList arrayList7 = arrayList;
                int i89 = 0;
                while (i89 < i88) {
                    int[] iArr2 = iArr;
                    int i90 = iArr2[i89];
                    if (i90 < i12) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        ArrayList arrayList8 = arrayList7;
                        i23 = i88;
                        arrayList8.add(xs2.z(dr2Var, i90, j10, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2));
                        arrayList7 = arrayList8;
                    } else {
                        i23 = i88;
                    }
                    i89++;
                    ga3Var = ga3Var;
                    iArr = iArr2;
                    i12 = i12;
                    i88 = i23;
                }
                ga3 ga3Var2 = ga3Var;
                pi1 pi1Var = pi1.j;
                List list = arrayList7 == null ? pi1Var : arrayList7;
                int size = list.size();
                List list2 = pi1Var;
                int iMax5 = i80;
                int i91 = 0;
                while (i91 < size) {
                    iMax5 = Math.max(iMax5, ((w33) list.get(i91)).j);
                    i91++;
                    list = list;
                }
                List list3 = list;
                int i92 = ((w33) drVar.last()).g;
                int iMin = Math.min(i11, (i63 - i92) - 1) + i92;
                int i93 = i92 + 1;
                if (i93 <= iMin) {
                    ArrayList arrayList9 = null;
                    while (true) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        i14 = iMax5;
                        i15 = i11;
                        i16 = iMin;
                        arrayList5 = arrayList9;
                        int i94 = i93;
                        arrayList5.add(xs2.z(dr2Var, i94, j10, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2));
                        if (i94 == i16) {
                            break;
                        }
                        i93 = i94 + 1;
                        arrayList9 = arrayList5;
                        iMin = i16;
                        iMax5 = i14;
                        i11 = i15;
                    }
                    arrayList2 = arrayList5;
                } else {
                    i14 = iMax5;
                    i15 = i11;
                    i16 = iMin;
                    arrayList2 = null;
                }
                int[] iArr3 = ga3Var2.g;
                int i95 = ga3Var2.y;
                int i96 = 0;
                while (i96 < i95) {
                    int i97 = iArr3[i96];
                    int i98 = i96;
                    if (i16 + 1 > i97 || i97 >= i63) {
                        j2 = j10;
                    } else {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        List list4 = arrayList2;
                        j2 = j10;
                        list4.add(xs2.z(dr2Var, i97, j10, jo3Var4, j11, j00Var2, qy4Var4.getLayoutDirection(), i34, ha3Var2));
                        arrayList2 = list4;
                    }
                    j00Var2 = j00Var2;
                    j10 = j2;
                    f2 = f2;
                    i33 = i33;
                    i96 = i98 + 1;
                    iArr3 = iArr3;
                }
                float f3 = f2;
                int i99 = i33;
                long j13 = j10;
                if (arrayList2 == null) {
                    arrayList2 = list2;
                }
                int size2 = arrayList2.size();
                int iMax6 = i14;
                for (int i100 = 0; i100 < size2; i100++) {
                    iMax6 = Math.max(iMax6, ((w33) arrayList2.get(i100)).j);
                }
                int i101 = (yf2.p(w33Var, drVar.first()) && list3.isEmpty() && arrayList2.isEmpty()) ? i6 : 0;
                int i102 = i10;
                int iL = zs0.l(i102, j9);
                int iX = zs0.x(iMax6, j9);
                int i103 = i13;
                int i104 = i102 < Math.min(iL, i103) ? i6 : 0;
                if (i104 == 0 || i79 == 0) {
                    i17 = i79;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i17 = i79;
                    sb.append(i17);
                    pc2.r(sb.toString());
                }
                ArrayList arrayList10 = new ArrayList(arrayList2.size() + list3.size() + drVar.g());
                if (i104 != 0) {
                    if (!list3.isEmpty() || !arrayList2.isEmpty()) {
                        pc2.g("No extra pages");
                    }
                    int iG2 = drVar.g();
                    int[] iArr4 = new int[iG2];
                    for (int i105 = 0; i105 < iG2; i105++) {
                        iArr4[i105] = i34;
                    }
                    int[] iArr5 = new int[iG2];
                    i19 = i101;
                    qy4Var = qy4Var4;
                    ix5.v(qy4Var4.y0(i9)).j(dr2Var, iL, iArr4, fl2.j, iArr5);
                    i18 = iL;
                    me2 me2VarY = pr.Y(iArr5);
                    int i106 = me2VarY.t;
                    int i107 = me2VarY.a;
                    if ((i107 > 0 && i106 >= 0) || (i107 < 0 && i106 <= 0)) {
                        int i108 = 0;
                        while (true) {
                            int i109 = iArr5[i108];
                            f = f3;
                            drVar2 = drVar;
                            int i110 = i107;
                            w33 w33Var4 = (w33) drVar2.get(i108);
                            w33Var4.y(i109, i18, iX);
                            arrayList10.add(w33Var4);
                            if (i108 == i106) {
                                break;
                            }
                            i108 += i110;
                            drVar = drVar2;
                            f3 = f;
                            i107 = i110;
                        }
                    } else {
                        f = f3;
                        drVar2 = drVar;
                    }
                } else {
                    i18 = iL;
                    i19 = i101;
                    qy4Var = qy4Var4;
                    f = f3;
                    drVar2 = drVar;
                    int size3 = list3.size();
                    int i111 = i17;
                    int i112 = 0;
                    while (i112 < size3) {
                        int i113 = i99;
                        w33 w33Var5 = (w33) list3.get(i112);
                        i111 -= i113;
                        w33Var5.y(i111, i18, iX);
                        arrayList10.add(w33Var5);
                        i112++;
                        i99 = i113;
                    }
                    int i114 = i99;
                    int iG3 = drVar2.g();
                    for (int i115 = 0; i115 < iG3; i115++) {
                        w33 w33Var6 = (w33) drVar2.get(i115);
                        w33Var6.y(i17, i18, iX);
                        arrayList10.add(w33Var6);
                        i17 += i114;
                    }
                    int size4 = arrayList2.size();
                    for (int i116 = 0; i116 < size4; i116++) {
                        w33 w33Var7 = (w33) arrayList2.get(i116);
                        w33Var7.y(i17, i18, iX);
                        arrayList10.add(w33Var7);
                        i17 += i114;
                    }
                }
                if (i19 != 0) {
                    i20 = i18;
                    arrayList3 = arrayList10;
                } else {
                    ArrayList arrayList11 = new ArrayList(arrayList10.size());
                    int size5 = arrayList10.size();
                    int i117 = 0;
                    while (i117 < size5) {
                        Object obj2 = arrayList10.get(i117);
                        w33 w33Var8 = (w33) obj2;
                        int i118 = i18;
                        int i119 = size5;
                        if (w33Var8.g >= ((w33) drVar2.first()).g && w33Var8.g <= ((w33) drVar2.last()).g) {
                            arrayList11.add(obj2);
                        }
                        i117++;
                        i18 = i118;
                        size5 = i119;
                    }
                    i20 = i18;
                    arrayList3 = arrayList11;
                }
                if (list3.isEmpty()) {
                    arrayList4 = list2;
                } else {
                    arrayList4 = new ArrayList(arrayList10.size());
                    int size6 = arrayList10.size();
                    int i120 = 0;
                    while (i120 < size6) {
                        Object obj3 = arrayList10.get(i120);
                        int i121 = size6;
                        if (((w33) obj3).g < ((w33) drVar2.first()).g) {
                            arrayList4.add(obj3);
                        }
                        i120++;
                        size6 = i121;
                    }
                }
                ?? r1 = arrayList4;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList12 = new ArrayList(arrayList10.size());
                    int size7 = arrayList10.size();
                    int i122 = 0;
                    while (i122 < size7) {
                        Object obj4 = arrayList10.get(i122);
                        ?? r28 = r0;
                        if (((w33) obj4).g > ((w33) drVar2.last()).g) {
                            r0 = arrayList4;
                            arrayList12.add(obj4);
                        } else {
                            r0 = arrayList4;
                        }
                        i122++;
                        r0 = r28;
                    }
                    r0 = arrayList4;
                    list2 = arrayList12;
                    r1 = r0;
                }
                ?? r29 = r1;
                if (arrayList3.isEmpty()) {
                    i21 = i6;
                } else {
                    Object obj5 = arrayList3.get(0);
                    int i123 = ((w33) obj5).a;
                    d52Var2.getClass();
                    float f4 = -Math.abs(i123 - f);
                    int size8 = arrayList3.size() - 1;
                    i21 = i6;
                    if (i21 <= size8) {
                        int i124 = i21;
                        while (true) {
                            Object obj6 = arrayList3.get(i124);
                            float f5 = -Math.abs(((w33) obj6).a - f);
                            if (Float.compare(f4, f5) < 0) {
                                obj5 = obj6;
                                f4 = f5;
                            }
                            if (i124 == size8) {
                                break;
                            }
                            i124++;
                        }
                    }
                    obj = obj5;
                }
                w33 w33Var9 = (w33) obj;
                d52Var2.getClass();
                int i125 = w33Var9 != null ? w33Var9.a : 0;
                if (i39 == 0) {
                    fQ = f;
                    z = false;
                } else {
                    z = false;
                    fQ = xs2.q((0 - i125) / i39, -0.5f, 0.5f);
                }
                i22 = i21;
                qy4Var2 = qy4Var;
                mo3Var = new mo3(arrayList3, i34, i9, i26, um3Var, i37, i56, i15, w33Var, w33Var9, fQ, i8, (i5 < i63 || i102 > i103) ? i21 : z, d52Var2, qy4Var.k0(zs0.l(i20 + i25, j), zs0.x(iX + i50, j), qi1Var2, new xf(ob3Var, arrayList10, (byte) 20)), z3, r29, list2, ox0Var, dr2Var, j13);
                dr2Var2 = dr2Var;
            }
            u21Var.j(mo3Var, qy4Var2.u(), false);
            fo3 fo3Var = u21Var.z;
            List list5 = mo3Var.g;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (((fo3Var.j == Integer.MAX_VALUE || fo3Var.t == Integer.MIN_VALUE) ? 0 : i22) != 0 && !list5.isEmpty()) {
                    int i126 = ((w33) cj0.j0(list5)).g;
                    int i127 = ((w33) cj0.r0(list5)).g;
                    for (int i128 = fo3Var.j; i128 < i126; i128++) {
                        dr2Var2.g(i128);
                    }
                    int i129 = i127 + 1;
                    int i130 = fo3Var.t;
                    if (i129 <= i130) {
                        while (true) {
                            dr2Var2.g(i129);
                            if (i129 == i130) {
                                break;
                            }
                            i129++;
                        }
                    }
                }
                return mo3Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }
}
