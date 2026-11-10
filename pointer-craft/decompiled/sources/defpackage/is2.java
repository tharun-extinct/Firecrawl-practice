package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class is2 implements cr2 {
    public final /* synthetic */ r6 a;
    public final /* synthetic */ ss2 g;
    public final /* synthetic */ w32 j;
    public final /* synthetic */ ox0 l;
    public final /* synthetic */ j00 m;
    public final /* synthetic */ my1 n;
    public final /* synthetic */ zn3 r;
    public final /* synthetic */ tg1 t;
    public final /* synthetic */ ar v;
    public final /* synthetic */ xq x;
    public final /* synthetic */ boolean y;

    public is2(ss2 ss2Var, boolean z, zn3 zn3Var, ai2 ai2Var, ar arVar, xq xqVar, ox0 ox0Var, w32 w32Var, tg1 tg1Var, r6 r6Var, j00 j00Var) {
        this.g = ss2Var;
        this.y = z;
        this.r = zn3Var;
        this.n = ai2Var;
        this.v = arVar;
        this.x = xqVar;
        this.l = ox0Var;
        this.j = w32Var;
        this.t = tg1Var;
        this.a = r6Var;
        this.m = j00Var;
    }

    /* JADX WARN: Code duplicated, block: B:305:0x0703  */
    /* JADX WARN: Code duplicated, block: B:306:0x0706  */
    /* JADX WARN: Code duplicated, block: B:309:0x070f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0714  */
    /* JADX WARN: Code duplicated, block: B:315:0x071f  */
    /* JADX WARN: Code duplicated, block: B:394:0x088a  */
    /* JADX WARN: Code duplicated, block: B:396:0x0896  */
    /* JADX WARN: Code duplicated, block: B:398:0x089e  */
    /* JADX WARN: Code duplicated, block: B:399:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:400:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:402:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:404:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:408:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:410:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:416:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:419:0x0903  */
    /* JADX WARN: Code duplicated, block: B:420:0x0908  */
    /* JADX WARN: Code duplicated, block: B:422:0x090b  */
    /* JADX WARN: Code duplicated, block: B:423:0x0910  */
    /* JADX WARN: Code duplicated, block: B:426:0x0917  */
    /* JADX WARN: Code duplicated, block: B:427:0x091a  */
    /* JADX WARN: Code duplicated, block: B:429:0x0926  */
    /* JADX WARN: Code duplicated, block: B:436:0x0940  */
    /* JADX WARN: Code duplicated, block: B:437:0x0943  */
    /* JADX WARN: Code duplicated, block: B:440:0x094d A[LOOP:19: B:439:0x094b->B:440:0x094d, LOOP_END] */
    @Override // defpackage.cr2
    public final u33 g(dr2 dr2Var, long j) {
        float fG;
        long j2;
        int i;
        int i2;
        int iMax;
        int i3;
        int iY;
        int i4;
        int i5;
        float f;
        int i6;
        boolean z;
        ms2 ms2Var;
        int i7;
        ArrayList arrayList;
        int i8;
        float f2;
        ArrayList arrayList2;
        long j3;
        int i9;
        boolean z2;
        int i10;
        int i11;
        uq2 uq2Var;
        ms2 ms2Var2;
        int i12;
        int iX;
        ms2 ms2Var3;
        int i13;
        ms2 ms2Var4;
        int i14;
        ga3 ga3Var;
        dr drVar;
        boolean z3;
        int i15;
        boolean z4;
        final List list;
        ms2 ms2Var5;
        Integer numValueOf;
        ms2 ms2Var6;
        int i16;
        boolean z5;
        int iIntValue;
        int iIntValue2;
        int size;
        int i17;
        List list2;
        int i18;
        um3 um3Var;
        int size2;
        int i19;
        int i20;
        ls2 ls2Var;
        qy4 qy4Var;
        ms2 ms2Var7;
        ms2 ms2Var8;
        int i21;
        ga3 ga3Var2;
        int i22;
        long j4;
        ms2 ms2VarU;
        int i23;
        ArrayList arrayList3;
        Object obj;
        int i24;
        int i25;
        int iR;
        int[] iArr;
        int i26;
        qy4 qy4Var2 = dr2Var.t;
        ss2 ss2Var = this.g;
        ss2Var.z.getValue();
        boolean z6 = ss2Var.y || qy4Var2.u();
        um3 um3Var2 = um3.t;
        um3 um3Var3 = um3.j;
        boolean z7 = this.y;
        yf2.h(j, z7 ? um3Var3 : um3Var2);
        zn3 zn3Var = this.r;
        int iV = z7 ? qy4Var2.V(zn3Var.g(qy4Var2.getLayoutDirection())) : qy4Var2.V(ue5.A(zn3Var, qy4Var2.getLayoutDirection()));
        int iV2 = z7 ? qy4Var2.V(zn3Var.y(qy4Var2.getLayoutDirection())) : qy4Var2.V(ue5.e(zn3Var, qy4Var2.getLayoutDirection()));
        int iV3 = qy4Var2.V(zn3Var.n());
        int iV4 = qy4Var2.V(zn3Var.r()) + iV3;
        int i27 = iV + iV2;
        int i28 = z7 ? iV4 : i27;
        if (z7) {
            iV2 = iV3;
        } else if (!z7) {
            iV2 = iV;
        }
        int i29 = i28 - iV2;
        long jT = zs0.t(-i27, -iV4, j);
        fs2 fs2Var = (fs2) this.n.g();
        bq2 bq2Var = fs2Var.r;
        int iT = ws0.t(jT);
        int iJ = ws0.j(jT);
        bq2Var.g.e(iT);
        bq2Var.y.e(iJ);
        xq xqVar = this.x;
        ar arVar = this.v;
        Integer numValueOf2 = null;
        if (z7) {
            if (arVar == null) {
                pc2.y("null verticalArrangement when isVertical == true");
                l0.x();
                return null;
            }
            fG = arVar.g();
        } else {
            if (xqVar == null) {
                pc2.y("null horizontalAlignment when isVertical == false");
                l0.x();
                return null;
            }
            fG = xqVar.g();
        }
        int iV5 = qy4Var2.V(fG);
        int iG = fs2Var.g();
        int iJ2 = z7 ? ws0.j(j) - iV4 : ws0.t(j) - i27;
        hs2 hs2Var = new hs2(jT, this.y, fs2Var, dr2Var, iG, iV5, this.a, this.m, iV2, i29, (((long) iV) << 32) | (((long) iV3) & 4294967295L), this.g);
        int i30 = iV2;
        fs2 fs2Var2 = hs2Var.y;
        bm bmVar = fs2Var2.n;
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            int iJ3 = ss2Var.j();
            fe0 fe0Var = ss2Var.v;
            int iW = zq2.w(iJ3, fs2Var, fe0Var.n);
            if (iJ3 != iW) {
                ((qp3) fe0Var.y).e(iW);
                ((er2) fe0Var.v).g(iJ3);
            }
            int iT2 = ss2Var.t();
            js2.z(at4VarM, at4VarB, xy1VarV);
            ga3 ga3VarS = kq2.s(fs2Var, ss2Var.u, ss2Var.b);
            float fFloatValue = (qy4Var2.u() || !z6) ? ss2Var.j : ((Number) ((pi) ss2Var.k.a).t.getValue()).floatValue();
            uq2 uq2Var2 = ss2Var.i;
            boolean zU = qy4Var2.u();
            final ob3 ob3Var = ss2Var.f;
            boolean z8 = ss2Var.t;
            if (i30 < 0) {
                pc2.g("invalid beforeContentPadding");
            }
            if (i29 < 0) {
                pc2.g("invalid afterContentPadding");
            }
            float f3 = fFloatValue;
            qi1 qi1Var = qi1.j;
            boolean z9 = this.y;
            ox0 ox0Var = this.l;
            int i31 = iT2;
            w32 w32Var = this.j;
            pi1 pi1Var = pi1.j;
            if (iG <= 0) {
                int iM = ws0.m(jT);
                int iA = ws0.a(jT);
                uq2Var2.r(0, iM, iA, new ArrayList(), bmVar, hs2Var, z9, zU, z6, 0, 0, ox0Var, w32Var);
                if (!zU) {
                    long jG = uq2Var2.g();
                    if (!qe2.g(jG, 0L)) {
                        iM = zs0.l((int) (jG >> 32), jT);
                        iA = zs0.x((int) (jG & 4294967295L), jT);
                    }
                }
                qy4Var = qy4Var2;
                ls2Var = new ls2(null, 0, false, 0.0f, qy4Var2.k0(zs0.l(iM + i27, j), zs0.x(iA + iV4, j), qi1Var, new q21((byte) 23)), 0.0f, false, ox0Var, dr2Var, hs2Var.n, 0, pi1Var, -i30, iJ2 + i29, 0, z9 ? um3Var3 : um3Var2, i29, iV5);
            } else {
                if (iW >= iG) {
                    iW = iG - 1;
                    i31 = 0;
                }
                int iRound = Math.round(f3);
                int i32 = i31 - iRound;
                if (iW == 0 && i32 < 0) {
                    iRound += i32;
                    i32 = 0;
                }
                dr drVar2 = new dr();
                int i33 = -i30;
                int i34 = iW;
                int i35 = i33 + (iV5 < 0 ? iV5 : 0);
                int iY2 = i32 + i35;
                int iMax2 = 0;
                while (true) {
                    j2 = hs2Var.n;
                    if (iY2 >= 0 || i34 <= 0) {
                        break;
                    }
                    bm bmVar2 = bmVar;
                    int i36 = i34 - 1;
                    ms2 ms2VarU2 = hs2Var.u(i36, j2);
                    drVar2.add(0, ms2VarU2);
                    iMax2 = Math.max(iMax2, ms2VarU2.h);
                    iY2 += ms2VarU2.y();
                    i34 = i36;
                    bmVar = bmVar2;
                }
                bm bmVar3 = bmVar;
                if (iY2 < i35) {
                    iRound -= i35 - iY2;
                    iY2 = i35;
                }
                int i37 = iRound;
                int i38 = iY2 - i35;
                int i39 = iJ2 + i29;
                int i40 = i39 >= 0 ? i39 : 0;
                int i41 = iMax2;
                int iY3 = i38;
                int i42 = i34;
                boolean z10 = false;
                int iY4 = -i38;
                int i43 = 0;
                while (i43 < drVar2.a) {
                    if (iY4 >= i40) {
                        drVar2.y(i43);
                        z10 = true;
                    } else {
                        i42++;
                        int iY5 = ((ms2) drVar2.get(i43)).y() + iY4;
                        i43++;
                        iY4 = iY5;
                    }
                }
                int i44 = i41;
                int i45 = i42;
                while (i45 < iG && (iY4 < i40 || iY4 <= 0 || drVar2.isEmpty())) {
                    int i46 = i40;
                    ms2 ms2VarU3 = hs2Var.u(i45, j2);
                    iY4 = ms2VarU3.y() + iY4;
                    if (iY4 <= i35) {
                        i26 = i35;
                        if (i45 != iG - 1) {
                            iY3 -= ms2VarU3.y();
                            i34 = i45 + 1;
                            z10 = true;
                        }
                        i45++;
                        i40 = i46;
                        i35 = i26;
                    } else {
                        i26 = i35;
                    }
                    int iMax3 = Math.max(i44, ms2VarU3.h);
                    drVar2.addLast(ms2VarU3);
                    i44 = iMax3;
                    i45++;
                    i40 = i46;
                    i35 = i26;
                }
                if (iY4 < iJ2) {
                    int i47 = iJ2 - iY4;
                    iY4 += i47;
                    iMax = i44;
                    iY = iY3 - i47;
                    while (iY < i30 && i34 > 0) {
                        int i48 = i30;
                        int i49 = i34 - 1;
                        int i50 = i47;
                        ms2 ms2VarU4 = hs2Var.u(i49, j2);
                        i34 = i49;
                        drVar2.add(0, ms2VarU4);
                        iMax = Math.max(iMax, ms2VarU4.h);
                        iY += ms2VarU4.y();
                        i30 = i48;
                        i47 = i50;
                    }
                    i = i30;
                    i2 = i37;
                    int i51 = i2 + i47;
                    if (iY < 0) {
                        iY4 += iY;
                        i3 = i34;
                        i4 = i51 + iY;
                        iY = 0;
                    } else {
                        i3 = i34;
                        i4 = i51;
                    }
                } else {
                    i = i30;
                    i2 = i37;
                    iMax = i44;
                    i3 = i34;
                    iY = iY3;
                    i4 = i2;
                }
                int i52 = iMax;
                int i53 = i45;
                if (Integer.signum(Math.round(f3)) != Integer.signum(i4) || Math.abs(Math.round(f3)) < Math.abs(i4)) {
                    i5 = i4;
                    f = f3;
                } else {
                    i5 = i4;
                    f = i5;
                }
                float f4 = f3 - f;
                float f5 = 0.0f;
                if (zU && i5 > i2 && f4 <= 0.0f) {
                    f5 = (i5 - i2) + f4;
                }
                if (iY < 0) {
                    pc2.g("negative currentFirstItemScrollOffset");
                }
                int i54 = -iY;
                ms2 ms2Var9 = (ms2) drVar2.first();
                if (i > 0 || iV5 < 0) {
                    int iG2 = drVar2.g();
                    ms2 ms2Var10 = ms2Var9;
                    int i55 = iY;
                    int i56 = 0;
                    while (true) {
                        if (i56 < iG2) {
                            int i57 = iG2;
                            int iY6 = ((ms2) drVar2.get(i56)).y();
                            if (i55 != 0 && iY6 <= i55) {
                                i6 = iG;
                                z = true;
                                if (i56 == drVar2.g() - 1) {
                                    break;
                                }
                                i55 -= iY6;
                                i56++;
                                ms2Var10 = (ms2) drVar2.get(i56);
                                iG2 = i57;
                                iG = i6;
                            }
                        }
                        i6 = iG;
                        z = true;
                        break;
                    }
                    iY = i55;
                    ms2Var = ms2Var10;
                } else {
                    i6 = iG;
                    ms2Var = ms2Var9;
                    z = true;
                }
                int iMax4 = Math.max(0, i3);
                int i58 = i3 - 1;
                if (iMax4 <= i58) {
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList = arrayList4;
                        i7 = iY;
                        arrayList.add(hs2Var.u(i58, j2));
                        if (i58 == iMax4) {
                            break;
                        }
                        i58--;
                        iY = i7;
                        arrayList4 = arrayList;
                    }
                } else {
                    i7 = iY;
                    arrayList = null;
                }
                int[] iArr2 = ga3VarS.g;
                int i59 = ga3VarS.y - 1;
                ArrayList arrayList5 = arrayList;
                while (-1 < i59) {
                    int i60 = iArr2[i59];
                    if (i60 < iMax4) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add(hs2Var.u(i60, j2));
                        arrayList5 = arrayList6;
                    }
                    i59--;
                    iMax4 = iMax4;
                }
                List list3 = arrayList5 == null ? pi1Var : arrayList5;
                int iMax5 = i52;
                int i61 = 0;
                for (int size3 = list3.size(); i61 < size3; size3 = size3) {
                    iMax5 = Math.max(iMax5, ((ms2) list3.get(i61)).h);
                    i61++;
                }
                int iMin = Math.min(((ms2) cj0.r0(drVar2)).g, i6 - 1);
                int i62 = ((ms2) cj0.r0(drVar2)).g + 1;
                if (i62 <= iMin) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        i8 = iMax5;
                        arrayList2 = arrayList7;
                        f2 = f;
                        arrayList2.add(hs2Var.u(i62, j2));
                        if (i62 == iMin) {
                            break;
                        }
                        i62++;
                        f = f2;
                        arrayList7 = arrayList2;
                        iMax5 = i8;
                    }
                } else {
                    i8 = iMax5;
                    f2 = f;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((ms2) cj0.r0(arrayList2)).g > iMin) {
                    iMin = ((ms2) cj0.r0(arrayList2)).g;
                }
                int[] iArr3 = ga3VarS.g;
                int i63 = ga3VarS.y;
                List arrayList8 = arrayList2;
                int i64 = 0;
                while (i64 < i63) {
                    int i65 = i63;
                    int i66 = iArr3[i64];
                    if (i66 > iMin) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(hs2Var.u(i66, j2));
                    }
                    i64++;
                    i63 = i65;
                }
                if (arrayList8 == null) {
                    arrayList8 = pi1Var;
                }
                int size4 = arrayList8.size();
                int iMax6 = i8;
                for (int i67 = 0; i67 < size4; i67++) {
                    iMax6 = Math.max(iMax6, ((ms2) arrayList8.get(i67)).h);
                }
                boolean z11 = (yf2.p(ms2Var, drVar2.first()) && list3.isEmpty() && arrayList8.isEmpty()) ? z : false;
                int iL = zs0.l(z9 ? iMax6 : iY4, jT);
                if (z9) {
                    iMax6 = iY4;
                }
                int iX2 = zs0.x(iMax6, jT);
                int i68 = z9 ? iX2 : iL;
                boolean z12 = iY4 < Math.min(i68, iJ2) ? z : false;
                if (z12 && i54 != 0) {
                    pc2.r("non-zero itemsScrollOffset");
                }
                long j5 = j2;
                final ArrayList arrayList9 = new ArrayList(arrayList8.size() + list3.size() + drVar2.g());
                if (z12) {
                    if (!list3.isEmpty() || !arrayList8.isEmpty()) {
                        pc2.g("no extra items");
                    }
                    int iG3 = drVar2.g();
                    int[] iArr4 = new int[iG3];
                    for (int i69 = 0; i69 < iG3; i69++) {
                        iArr4[i69] = ((ms2) drVar2.get(i69)).b;
                    }
                    int[] iArr5 = new int[iG3];
                    if (z9) {
                        if (arVar == null) {
                            pc2.y("null verticalArrangement when isVertical == true");
                            l0.x();
                            return null;
                        }
                        arVar.m(dr2Var, i68, iArr4, iArr5);
                        j3 = jT;
                        iArr = iArr5;
                    } else {
                        if (xqVar == null) {
                            pc2.y("null horizontalArrangement when isVertical == false");
                            l0.x();
                            return null;
                        }
                        iArr = iArr5;
                        j3 = jT;
                        xqVar.j(dr2Var, i68, iArr4, fl2.j, iArr);
                    }
                    me2 me2VarY = pr.Y(iArr);
                    int i70 = me2VarY.j;
                    int i71 = me2VarY.t;
                    int i72 = me2VarY.a;
                    if ((i72 > 0 && i70 <= i71) || (i72 < 0 && i71 <= i70)) {
                        while (true) {
                            int i73 = iArr[i70];
                            ms2 ms2Var11 = (ms2) drVar2.get(i70);
                            ms2Var11.v(i73, iL, iX2);
                            arrayList9.add(ms2Var11);
                            if (i70 == i71) {
                                break;
                            }
                            i70 += i72;
                        }
                    }
                } else {
                    j3 = jT;
                    int size5 = list3.size();
                    int iY7 = i54;
                    for (int i74 = 0; i74 < size5; i74++) {
                        ms2 ms2Var12 = (ms2) list3.get(i74);
                        iY7 -= ms2Var12.y();
                        ms2Var12.v(iY7, iL, iX2);
                        arrayList9.add(ms2Var12);
                    }
                    int iG4 = drVar2.g();
                    int iY8 = i54;
                    for (int i75 = 0; i75 < iG4; i75++) {
                        ms2 ms2Var13 = (ms2) drVar2.get(i75);
                        ms2Var13.v(iY8, iL, iX2);
                        arrayList9.add(ms2Var13);
                        iY8 += ms2Var13.y();
                    }
                    int size6 = arrayList8.size();
                    for (int i76 = 0; i76 < size6; i76++) {
                        ms2 ms2Var14 = (ms2) arrayList8.get(i76);
                        ms2Var14.v(iY8, iL, iX2);
                        arrayList9.add(ms2Var14);
                        iY8 += ms2Var14.y();
                    }
                }
                if (z8) {
                    i9 = iX2;
                    z2 = z9;
                    i10 = iY4;
                    i11 = iL;
                    uq2Var = uq2Var2;
                } else {
                    int i77 = iY4;
                    i9 = iX2;
                    z2 = z9;
                    i11 = iL;
                    uq2Var = uq2Var2;
                    uq2Var.r((int) f2, i11, i9, arrayList9, bmVar3, hs2Var, z2, zU, z6, i7, i77, ox0Var, w32Var);
                    i10 = i77;
                }
                boolean z13 = zU;
                if (z13) {
                    ms2Var2 = ms2Var;
                } else {
                    long jG2 = uq2Var.g();
                    ms2Var2 = ms2Var;
                    if (!qe2.g(jG2, 0L)) {
                        int i78 = z2 ? i9 : i11;
                        long j6 = j3;
                        int iL2 = zs0.l(Math.max(i11, (int) (jG2 >> 32)), j6);
                        iX = zs0.x(Math.max(i9, (int) (jG2 & 4294967295L)), j6);
                        int i79 = z2 ? iX : iL2;
                        if (i79 != i78) {
                            int size7 = arrayList9.size();
                            for (int i80 = 0; i80 < size7; i80++) {
                                ms2 ms2Var15 = (ms2) arrayList9.get(i80);
                                ms2Var15.f = i79;
                                ms2Var15.d = ms2Var15.j + i79;
                            }
                        }
                        i12 = iL2;
                    }
                    ms2Var3 = (ms2) drVar2.x();
                    if (ms2Var3 != null) {
                        i13 = ms2Var3.g;
                    } else {
                        i13 = 0;
                    }
                    ms2Var4 = (ms2) drVar2.j();
                    if (ms2Var4 != null) {
                        i14 = ms2Var4.g;
                    } else {
                        i14 = 0;
                    }
                    ga3Var = fs2Var2.y.y;
                    if (ga3Var == null) {
                        ga3Var = ge2.g;
                    }
                    if (this.t != null || arrayList9.isEmpty() || (i21 = ga3Var.y) == 0) {
                        drVar = drVar2;
                        z3 = z13;
                        i15 = i10;
                        z4 = z;
                        list = pi1Var;
                    } else {
                        if (i14 - i13 < 0 || i21 == 0) {
                            drVar = drVar2;
                            ga3Var2 = ge2.g;
                        } else {
                            me2 me2VarK = xs2.K(0, i21);
                            int i81 = me2VarK.j;
                            int i82 = me2VarK.t;
                            drVar = drVar2;
                            if (i81 <= i82) {
                                iR = -1;
                                while (ga3Var.r(i81) <= i13) {
                                    iR = ga3Var.r(i81);
                                    if (i81 == i82) {
                                        break;
                                    }
                                    i81++;
                                }
                                i25 = -1;
                            } else {
                                i25 = -1;
                                iR = -1;
                            }
                            if (iR == i25) {
                                ga3Var2 = ge2.g;
                            } else {
                                ga3 ga3Var3 = ge2.g;
                                ga3Var2 = new ga3(z ? 1 : 0);
                                ga3Var2.g(iR);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList(arrayList9.size());
                        int size8 = arrayList9.size();
                        int i83 = 0;
                        while (i83 < size8) {
                            boolean z14 = z13;
                            Object obj2 = arrayList9.get(i83);
                            int i84 = size8;
                            int i85 = ((ms2) obj2).g;
                            int i86 = i83;
                            int[] iArr6 = ga3Var.g;
                            int i87 = ga3Var.y;
                            ga3 ga3Var4 = ga3Var;
                            int i88 = 0;
                            while (i88 < i87) {
                                int i89 = i88;
                                if (iArr6[i89] == i85) {
                                    arrayList11.add(obj2);
                                    break;
                                }
                                i88 = i89 + 1;
                            }
                            i83 = i86 + 1;
                            size8 = i84;
                            z13 = z14;
                            ga3Var = ga3Var4;
                        }
                        z3 = z13;
                        int[] iArr7 = ga3Var2.g;
                        int i90 = ga3Var2.y;
                        int i91 = 0;
                        while (i91 < i90) {
                            int i92 = iArr7[i91];
                            int size9 = arrayList9.size();
                            int i93 = i90;
                            int i94 = 0;
                            int i95 = 0;
                            while (true) {
                                if (i94 >= size9) {
                                    i22 = -1;
                                    break;
                                }
                                Object obj3 = arrayList9.get(i94);
                                int i96 = i94 + 1;
                                if (((ms2) obj3).g == i92) {
                                    i22 = i95;
                                    break;
                                }
                                i95++;
                                i94 = i96;
                            }
                            if (i22 == -1) {
                                j4 = j5;
                                ms2VarU = hs2Var.u(i92, j4);
                            } else {
                                j4 = j5;
                                ms2VarU = (ms2) arrayList9.remove(i22);
                            }
                            int[] iArr8 = iArr7;
                            ms2 ms2Var16 = ms2VarU;
                            int iO = a11.o(ms2Var16, z2);
                            int i97 = i91;
                            if (i22 == -1) {
                                i92 = i92;
                                i23 = Integer.MIN_VALUE;
                            } else {
                                long jR = ms2Var16.r(0);
                                i23 = (int) (z2 ? jR & 4294967295L : jR >> 32);
                            }
                            int size10 = arrayList11.size();
                            int i98 = 0;
                            while (true) {
                                if (i98 >= size10) {
                                    arrayList3 = arrayList11;
                                    obj = null;
                                    break;
                                }
                                obj = arrayList11.get(i98);
                                arrayList3 = arrayList11;
                                int i99 = size10;
                                int i100 = i92;
                                if (((ms2) obj).g != i100) {
                                    break;
                                }
                                i98++;
                                i92 = i100;
                                arrayList11 = arrayList3;
                                size10 = i99;
                            }
                            ms2 ms2Var17 = (ms2) obj;
                            if (ms2Var17 != null) {
                                long jR2 = ms2Var17.r(0);
                                i24 = (int) (z2 ? jR2 & 4294967295L : jR2 >> 32);
                            } else {
                                i24 = Integer.MIN_VALUE;
                            }
                            int iMax7 = i23 == Integer.MIN_VALUE ? i33 : Math.max((int) r34, i23);
                            if (i24 != Integer.MIN_VALUE) {
                                iMax7 = Math.min(iMax7, i24 - iO);
                            }
                            ms2Var16.o = true;
                            ms2Var16.v(iMax7, i12, iX);
                            arrayList10.add(ms2Var16);
                            i91 = i97 + 1;
                            j5 = j4;
                            i10 = i10;
                            i90 = i93;
                            iArr7 = iArr8;
                            arrayList11 = arrayList3;
                        }
                        i15 = i10;
                        z4 = true;
                        list = arrayList10;
                    }
                    if (z11) {
                        ms2Var8 = (ms2) cj0.l0(arrayList9);
                        if (ms2Var8 != null) {
                            numValueOf = Integer.valueOf(ms2Var8.g);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        ms2Var5 = (ms2) drVar.x();
                        if (ms2Var5 != null) {
                            numValueOf = Integer.valueOf(ms2Var5.g);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z11) {
                        ms2Var7 = (ms2) cj0.s0(arrayList9);
                        if (ms2Var7 != null) {
                            numValueOf2 = Integer.valueOf(ms2Var7.g);
                        }
                    } else {
                        ms2Var6 = (ms2) drVar.j();
                        if (ms2Var6 != null) {
                            numValueOf2 = Integer.valueOf(ms2Var6.g);
                        }
                    }
                    i16 = i6;
                    if (i53 >= i16 || i15 > iJ2) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    final boolean z15 = z3;
                    u33 u33VarK0 = qy4Var2.k0(zs0.l(i12 + i27, j), zs0.x(iX + iV4, j), qi1Var, new xy1() { // from class: ks2
                        @Override // defpackage.xy1
                        public final Object a(Object obj4) {
                            boolean z16;
                            ts3 ts3Var = (ts3) obj4;
                            ts3Var.j = true;
                            ArrayList arrayList12 = arrayList9;
                            int size11 = arrayList12.size();
                            int i101 = 0;
                            while (true) {
                                z16 = z15;
                                if (i101 >= size11) {
                                    break;
                                }
                                ((ms2) arrayList12.get(i101)).n(ts3Var, z16);
                                i101++;
                            }
                            List list4 = list;
                            int size12 = list4.size();
                            for (int i102 = 0; i102 < size12; i102++) {
                                ((ms2) list4.get(i102)).n(ts3Var, z16);
                            }
                            ts3Var.j = false;
                            ob3Var.getValue();
                            return og5.g;
                        }
                    });
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (arrayList9.isEmpty()) {
                        list2 = pi1Var;
                    } else {
                        ArrayList arrayList12 = new ArrayList(list);
                        size = arrayList9.size();
                        for (i17 = 0; i17 < size; i17++) {
                            ms2 ms2Var18 = (ms2) arrayList9.get(i17);
                            i18 = ms2Var18.g;
                            if (iIntValue > i18 && i18 <= iIntValue2) {
                                arrayList12.add(ms2Var18);
                            }
                        }
                        gj0.Z(arrayList12, a11.h);
                        list2 = arrayList12;
                    }
                    if (z2) {
                        um3Var = um3Var3;
                    } else {
                        um3Var = um3Var2;
                    }
                    size2 = list.size();
                    i20 = 0;
                    for (i19 = 0; i19 < size2; i19++) {
                        i20 += ((ms2) list.get(i19)).b;
                    }
                    qy4Var = qy4Var2;
                    ls2Var = new ls2(ms2Var2, i7, z5, f2, u33VarK0, f5, z10, ox0Var, dr2Var, hs2Var.n, i20, list2, r34, i39, i16, um3Var, i29, iV5);
                }
                i12 = i11;
                iX = i9;
                ms2Var3 = (ms2) drVar2.x();
                if (ms2Var3 != null) {
                    i13 = ms2Var3.g;
                } else {
                    i13 = 0;
                }
                ms2Var4 = (ms2) drVar2.j();
                if (ms2Var4 != null) {
                    i14 = ms2Var4.g;
                } else {
                    i14 = 0;
                }
                ga3Var = fs2Var2.y.y;
                if (ga3Var == null) {
                    ga3Var = ge2.g;
                }
                if (this.t != null) {
                    drVar = drVar2;
                    z3 = z13;
                    i15 = i10;
                    z4 = z;
                    list = pi1Var;
                } else {
                    drVar = drVar2;
                    z3 = z13;
                    i15 = i10;
                    z4 = z;
                    list = pi1Var;
                }
                if (z11) {
                    ms2Var8 = (ms2) cj0.l0(arrayList9);
                    if (ms2Var8 != null) {
                        numValueOf = Integer.valueOf(ms2Var8.g);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    ms2Var5 = (ms2) drVar.x();
                    if (ms2Var5 != null) {
                        numValueOf = Integer.valueOf(ms2Var5.g);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z11) {
                    ms2Var7 = (ms2) cj0.s0(arrayList9);
                    if (ms2Var7 != null) {
                        numValueOf2 = Integer.valueOf(ms2Var7.g);
                    }
                } else {
                    ms2Var6 = (ms2) drVar.j();
                    if (ms2Var6 != null) {
                        numValueOf2 = Integer.valueOf(ms2Var6.g);
                    }
                }
                i16 = i6;
                if (i53 >= i16) {
                    z5 = z4;
                } else {
                    z5 = z4;
                }
                final boolean z16 = z3;
                u33 u33VarK1 = qy4Var2.k0(zs0.l(i12 + i27, j), zs0.x(iX + iV4, j), qi1Var, new xy1() { // from class: ks2
                    @Override // defpackage.xy1
                    public final Object a(Object obj4) {
                        boolean z17;
                        ts3 ts3Var = (ts3) obj4;
                        ts3Var.j = true;
                        ArrayList arrayList13 = arrayList9;
                        int size11 = arrayList13.size();
                        int i101 = 0;
                        while (true) {
                            z17 = z16;
                            if (i101 >= size11) {
                                break;
                            }
                            ((ms2) arrayList13.get(i101)).n(ts3Var, z17);
                            i101++;
                        }
                        List list4 = list;
                        int size12 = list4.size();
                        for (int i102 = 0; i102 < size12; i102++) {
                            ((ms2) list4.get(i102)).n(ts3Var, z17);
                        }
                        ts3Var.j = false;
                        ob3Var.getValue();
                        return og5.g;
                    }
                });
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (arrayList9.isEmpty()) {
                    list2 = pi1Var;
                } else {
                    ArrayList arrayList13 = new ArrayList(list);
                    size = arrayList9.size();
                    while (i17 < size) {
                        ms2 ms2Var19 = (ms2) arrayList9.get(i17);
                        i18 = ms2Var19.g;
                        if (iIntValue > i18) {
                        }
                    }
                    gj0.Z(arrayList13, a11.h);
                    list2 = arrayList13;
                }
                if (z2) {
                    um3Var = um3Var3;
                } else {
                    um3Var = um3Var2;
                }
                size2 = list.size();
                i20 = 0;
                while (i19 < size2) {
                    i20 += ((ms2) list.get(i19)).b;
                }
                qy4Var = qy4Var2;
                ls2Var = new ls2(ms2Var2, i7, z5, f2, u33VarK1, f5, z10, ox0Var, dr2Var, hs2Var.n, i20, list2, r34, i39, i16, um3Var, i29, iV5);
            }
            ss2Var.l(ls2Var, qy4Var.u(), false);
            m21 m21Var = ss2Var.g;
            return ls2Var;
        } catch (Throwable th) {
            js2.z(at4VarM, at4VarB, xy1VarV);
            throw th;
        }
    }
}
