package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mb implements t33 {
    public final /* synthetic */ byte g;
    public static final mb y = new mb(0);
    public static final mb r = new mb(1);
    public static final mb n = new mb(2);
    public static final mb v = new mb(3);

    public /* synthetic */ mb(byte b) {
        this.g = b;
    }

    public static final void x(ArrayList arrayList, s54 s54Var, v33 v33Var, ArrayList arrayList2, ArrayList arrayList3, s54 s54Var2, ArrayList arrayList4, s54 s54Var3, s54 s54Var4) {
        if (!arrayList.isEmpty()) {
            s54Var.j = v33Var.V(12.0f) + s54Var.j;
        }
        arrayList.add(0, cj0.F0(arrayList2));
        arrayList3.add(Integer.valueOf(s54Var2.j));
        arrayList4.add(Integer.valueOf(s54Var.j));
        s54Var.j += s54Var2.j;
        s54Var3.j = Math.max(s54Var3.j, s54Var4.j);
        arrayList2.clear();
        s54Var4.j = 0;
        s54Var2.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x011a A[PHI: r1 r8
  0x011a: PHI (r1v34 int) = (r1v33 int), (r1v37 int), (r1v37 int) binds: [B:68:0x0135, B:61:0x010e, B:63:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r8v15 int) = (r8v14 int), (r8v21 int), (r8v21 int) binds: [B:68:0x0135, B:61:0x010e, B:63:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.t33
    public final u33 r(v33 v33Var, List list, long j) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        int iV;
        int iMax;
        int i;
        int iC0;
        long j2 = j;
        byte b = this.g;
        qi1 qi1Var = qi1.j;
        switch (b) {
            case 0:
                final ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                int iM = 0;
                int iA = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    us3 us3VarV = ((p33) list.get(i2)).v(j2);
                    iM = Math.max(iM, us3VarV.j);
                    iA = Math.max(iA, us3VarV.t);
                    arrayList2.add(us3VarV);
                }
                if (list.isEmpty()) {
                    iM = ws0.m(j2);
                    iA = ws0.a(j2);
                }
                final byte b2 = 0;
                return v33Var.k0(iM, iA, qi1Var, new xy1() { // from class: lb
                    @Override // defpackage.xy1
                    public final Object a(Object obj3) {
                        byte b3 = b2;
                        og5 og5Var = og5.g;
                        ArrayList arrayList3 = arrayList2;
                        ts3 ts3Var = (ts3) obj3;
                        switch (b3) {
                            case 0:
                                int size2 = arrayList3.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    ts3.m(ts3Var, (us3) arrayList3.get(i3), 0, 0);
                                }
                                break;
                            case 1:
                                int size3 = arrayList3.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    ts3.m(ts3Var, (us3) arrayList3.get(i4), 0, 0);
                                }
                                break;
                            default:
                                int size4 = arrayList3.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    ts3Var.j((us3) arrayList3.get(i5), 0, 0, 0.0f);
                                }
                                break;
                        }
                        return og5Var;
                    }
                });
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return v33Var.k0(0, 0, qi1Var, be.t);
                }
                if (size2 == 1) {
                    us3 us3VarV2 = ((p33) list.get(0)).v(j2);
                    return v33Var.k0(us3VarV2.j, us3VarV2.t, qi1Var, new ce(us3VarV2, (byte) 0));
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i3 = 0; i3 < size3; i3++) {
                    us3 us3VarV3 = ((p33) list.get(i3)).v(j2);
                    iMax2 = Math.max(iMax2, us3VarV3.j);
                    iMax3 = Math.max(iMax3, us3VarV3.t);
                    arrayList3.add(us3VarV3);
                }
                return v33Var.k0(iMax2, iMax3, qi1Var, new ce(arrayList3, (byte) 1));
            case 2:
                final ArrayList arrayList4 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    arrayList4.add(((p33) list.get(i4)).v(j2));
                }
                final byte b3 = 1;
                return v33Var.k0(ws0.t(j2), ws0.j(j2), qi1Var, new xy1() { // from class: lb
                    @Override // defpackage.xy1
                    public final Object a(Object obj3) {
                        byte b4 = b3;
                        og5 og5Var = og5.g;
                        ArrayList arrayList5 = arrayList4;
                        ts3 ts3Var = (ts3) obj3;
                        switch (b4) {
                            case 0:
                                int size5 = arrayList5.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    ts3.m(ts3Var, (us3) arrayList5.get(i5), 0, 0);
                                }
                                break;
                            case 1:
                                int size6 = arrayList5.size();
                                for (int i6 = 0; i6 < size6; i6++) {
                                    ts3.m(ts3Var, (us3) arrayList5.get(i6), 0, 0);
                                }
                                break;
                            default:
                                int size7 = arrayList5.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    ts3Var.j((us3) arrayList5.get(i7), 0, 0, 0.0f);
                                }
                                break;
                        }
                        return og5Var;
                    }
                });
            case 3:
                final byte b4 = 2;
                final ArrayList arrayList5 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                for (int i5 = 0; i5 < size5; i5++) {
                    us3 us3VarV4 = ((p33) list.get(i5)).v(j2);
                    iMax4 = Math.max(iMax4, us3VarV4.j);
                    iMax5 = Math.max(iMax5, us3VarV4.t);
                    arrayList5.add(us3VarV4);
                }
                return v33Var.k0(iMax4, iMax5, qi1Var, new xy1() { // from class: lb
                    @Override // defpackage.xy1
                    public final Object a(Object obj3) {
                        byte b5 = b4;
                        og5 og5Var = og5.g;
                        ArrayList arrayList6 = arrayList5;
                        ts3 ts3Var = (ts3) obj3;
                        switch (b5) {
                            case 0:
                                int size6 = arrayList6.size();
                                for (int i6 = 0; i6 < size6; i6++) {
                                    ts3.m(ts3Var, (us3) arrayList6.get(i6), 0, 0);
                                }
                                break;
                            case 1:
                                int size7 = arrayList6.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    ts3.m(ts3Var, (us3) arrayList6.get(i7), 0, 0);
                                }
                                break;
                            default:
                                int size8 = arrayList6.size();
                                for (int i8 = 0; i8 < size8; i8++) {
                                    ts3Var.j((us3) arrayList6.get(i8), 0, 0, 0.0f);
                                }
                                break;
                        }
                        return og5Var;
                    }
                });
            case 4:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                s54 s54Var = new s54();
                s54 s54Var2 = new s54();
                ArrayList arrayList9 = new ArrayList();
                s54 s54Var3 = new s54();
                s54 s54Var4 = new s54();
                int size6 = list.size();
                int i6 = 0;
                while (i6 < size6) {
                    us3 us3VarV5 = ((p33) list.get(i6)).v(j2);
                    if (!arrayList9.isEmpty()) {
                        ArrayList arrayList10 = arrayList6;
                        s54 s54Var5 = s54Var2;
                        if (v33Var.V(8.0f) + s54Var3.j + us3VarV5.j <= ws0.t(j2)) {
                            arrayList6 = arrayList10;
                            s54Var2 = s54Var5;
                        } else {
                            arrayList6 = arrayList10;
                            s54Var2 = s54Var5;
                            x(arrayList6, s54Var2, v33Var, arrayList9, arrayList7, s54Var4, arrayList8, s54Var, s54Var3);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        s54Var3.j = v33Var.V(8.0f) + s54Var3.j;
                    }
                    arrayList9.add(us3VarV5);
                    s54Var3.j += us3VarV5.j;
                    s54Var4.j = Math.max(s54Var4.j, us3VarV5.t);
                    i6++;
                    arrayList6 = arrayList6;
                }
                ArrayList arrayList11 = arrayList6;
                if (arrayList9.isEmpty()) {
                    arrayList = arrayList11;
                } else {
                    arrayList = arrayList11;
                    x(arrayList, s54Var2, v33Var, arrayList9, arrayList7, s54Var4, arrayList8, s54Var, s54Var3);
                }
                int iMax6 = Math.max(s54Var.j, ws0.m(j2));
                return v33Var.k0(iMax6, Math.max(s54Var2.j, ws0.a(j2)), qi1Var, new m6(arrayList, v33Var, iMax6, arrayList8));
            default:
                int iMin = Math.min(ws0.t(j2), v33Var.V(600.0f));
                int size7 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size7) {
                        obj = list.get(i7);
                        if (!yf2.p(ue5.S((p33) obj), "action")) {
                            i7++;
                        }
                    } else {
                        obj = null;
                    }
                }
                p33 p33Var = (p33) obj;
                us3 us3VarV6 = p33Var != null ? p33Var.v(j2) : null;
                int size8 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size8) {
                        obj2 = list.get(i8);
                        if (!yf2.p(ue5.S((p33) obj2), "dismissAction")) {
                            i8++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                p33 p33Var2 = (p33) obj2;
                us3 us3VarV7 = p33Var2 != null ? p33Var2.v(j2) : null;
                int i9 = us3VarV6 != null ? us3VarV6.j : 0;
                int i10 = us3VarV6 != null ? us3VarV6.t : 0;
                int i11 = us3VarV7 != null ? us3VarV7.j : 0;
                int i12 = us3VarV7 != null ? us3VarV7.t : 0;
                int iV2 = ((iMin - i9) - i11) - (i11 == 0 ? v33Var.V(8.0f) : 0);
                int iM2 = ws0.m(j2);
                if (iV2 < iM2) {
                    iV2 = iM2;
                }
                int size9 = list.size();
                int i13 = 0;
                while (i13 < size9) {
                    p33 p33Var3 = (p33) list.get(i13);
                    if (yf2.p(ue5.S(p33Var3), "text")) {
                        int i14 = i12;
                        int i15 = i10;
                        final us3 us3VarV8 = p33Var3.v(ws0.y(j2, 0, iV2, 0, 0, 9));
                        f72 f72Var = y6.g;
                        int iC1 = us3VarV8.c0(f72Var);
                        int iC2 = us3VarV8.c0(y6.y);
                        boolean z = iC1 == iC2 || !(iC1 != Integer.MIN_VALUE && iC2 != Integer.MIN_VALUE);
                        final int i16 = iMin - i11;
                        final int i17 = i16 - i9;
                        if (z) {
                            iMax = Math.max(v33Var.V(pe6.t), Math.max(i15, i14));
                            iV = (iMax - us3VarV8.t) / 2;
                            if (us3VarV6 == null || (iC0 = us3VarV6.c0(f72Var)) == Integer.MIN_VALUE) {
                                i = 0;
                            } else {
                                i = (iC1 + iV) - iC0;
                            }
                        } else {
                            iV = v33Var.V(30.0f) - iC1;
                            iMax = Math.max(v33Var.V(pe6.a), us3VarV8.t + iV);
                            if (us3VarV6 != null) {
                                i = (iMax - us3VarV6.t) / 2;
                            } else {
                                i = 0;
                            }
                        }
                        final int i18 = i;
                        final int i19 = iV;
                        final int i20 = us3VarV7 != null ? (iMax - us3VarV7.t) / 2 : 0;
                        final us3 us3Var = us3VarV6;
                        final us3 us3Var2 = us3VarV7;
                        return v33Var.k0(iMin, iMax, qi1Var, new xy1() { // from class: is4
                            @Override // defpackage.xy1
                            public final Object a(Object obj3) {
                                ts3 ts3Var = (ts3) obj3;
                                ts3.m(ts3Var, us3VarV8, 0, i19);
                                us3 us3Var3 = us3Var2;
                                if (us3Var3 != null) {
                                    ts3.m(ts3Var, us3Var3, i16, i20);
                                }
                                us3 us3Var4 = us3Var;
                                if (us3Var4 != null) {
                                    ts3.m(ts3Var, us3Var4, i17, i18);
                                }
                                return og5.g;
                            }
                        });
                    }
                    i13++;
                    us3VarV7 = us3VarV7;
                    j2 = j2;
                    us3VarV6 = us3VarV6;
                    i12 = i12;
                    i10 = i10;
                }
                tw2.y("Collection contains no element matching the predicate.");
                up.q();
                return null;
        }
    }
}
