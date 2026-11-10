package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w15 implements a93 {
    public final /* synthetic */ float g;
    public final /* synthetic */ int n;
    public final /* synthetic */ x15 r;
    public final /* synthetic */ hg4 v;
    public final /* synthetic */ float y;

    public w15(float f, float f2, x15 x15Var, int i, hg4 hg4Var) {
        this.g = f;
        this.y = f2;
        this.r = x15Var;
        this.n = i;
        this.v = hg4Var;
    }

    @Override // defpackage.a93
    public final u33 r(final v33 v33Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f = this.g;
        int iV = v33Var.V(f);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((p33) list2.get(i)).x(Integer.MAX_VALUE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iV * 2;
        float f2 = this.y;
        long jY = ws0.y(j, v33Var.V(f2), 0, iIntValue, iIntValue, 2);
        final r54 r54Var = new r54();
        r54Var.j = f;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((p33) list2.get(i3)).v(jY));
        }
        int[] iArrCopyOf = new int[16];
        int size4 = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size4) {
            List list4 = list2;
            int iY = ((p33) list2.get(i4)).Y(Integer.MAX_VALUE);
            int i6 = i5 + 1;
            int i7 = iV;
            if (iArrCopyOf.length < i6) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i6, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i5] = iY;
            i4++;
            i5 = i6;
            list2 = list4;
            iV = i7;
        }
        final int i8 = iV;
        final ArrayList arrayList3 = new ArrayList(size);
        int iV2 = i2;
        int i9 = 0;
        while (i9 < size) {
            vb1 vb1Var = new vb1(f2);
            vb1 vb1Var2 = new vb1(v33Var.y0(((us3) arrayList2.get(i9)).j));
            if (vb1Var.compareTo(vb1Var2) < 0) {
                vb1Var = vb1Var2;
            }
            float f3 = vb1Var.j;
            iV2 += v33Var.V(f3);
            if (i9 < 0 || i9 >= i5) {
                l0.p("Index must be between 0 and size");
                return null;
            }
            vb1 vb1Var3 = new vb1(v33Var.y0(iArrCopyOf[i9]) - (p15.y * 2.0f));
            int[] iArr = iArrCopyOf;
            vb1 vb1Var4 = new vb1(24.0f);
            if (vb1Var3.compareTo(vb1Var4) < 0) {
                vb1Var3 = vb1Var4;
            }
            float f4 = r54Var.j;
            q15 q15Var = new q15(f4, f3, vb1Var3.j);
            r54Var.j = f4 + f3;
            arrayList3.add(q15Var);
            i9++;
            iArrCopyOf = iArr;
        }
        this.r.g.setValue(arrayList3);
        ArrayList arrayList4 = arrayList2;
        final ArrayList arrayList5 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i10 = 0;
        while (i10 < size5) {
            arrayList5.add(((p33) list3.get(i10)).v(ws0.g(0, v33Var.V(((q15) arrayList3.get(this.n)).r), 0, iIntValue)));
            i10++;
            list3 = list3;
            arrayList4 = arrayList4;
        }
        final ArrayList arrayList6 = arrayList4;
        final float f5 = this.g;
        final hg4 hg4Var = this.v;
        final int i11 = this.n;
        return v33Var.k0(iV2, iIntValue, qi1.j, new xy1() { // from class: v15
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                v33 v33Var2;
                ArrayList arrayList7;
                int i12;
                ts3 ts3Var = (ts3) obj;
                r54 r54Var2 = r54Var;
                r54Var2.j = f5;
                ArrayList arrayList8 = arrayList6;
                int size6 = arrayList8.size();
                int i13 = 0;
                while (true) {
                    v33Var2 = v33Var;
                    arrayList7 = arrayList3;
                    if (i13 >= size6) {
                        break;
                    }
                    ts3.m(ts3Var, (us3) arrayList8.get(i13), v33Var2.V(r54Var2.j), 0);
                    r54Var2.j += ((q15) arrayList7.get(i13)).y;
                    i13++;
                }
                ArrayList arrayList9 = arrayList5;
                int size7 = arrayList9.size();
                int i14 = 0;
                while (true) {
                    i12 = i11;
                    if (i14 >= size7) {
                        break;
                    }
                    us3 us3Var = (us3) arrayList9.get(i14);
                    ts3.m(ts3Var, us3Var, Math.max(0, (v33Var2.V(((q15) arrayList7.get(i12)).y) - us3Var.j) / 2), iIntValue - us3Var.t);
                    i14++;
                }
                hg4 hg4Var2 = hg4Var;
                rf4 rf4Var = hg4Var2.g;
                Integer num = hg4Var2.n;
                if (num == null || num.intValue() != i12) {
                    hg4Var2.n = Integer.valueOf(i12);
                    q15 q15Var2 = (q15) cj0.m0(i12, arrayList7);
                    if (q15Var2 != null) {
                        q15 q15Var3 = (q15) cj0.r0(arrayList7);
                        int iV3 = v33Var2.V(q15Var3.g + q15Var3.y) + i8;
                        int iD = iV3 - rf4Var.x.d();
                        int iV4 = v33Var2.V(q15Var2.g) - ((iD / 2) - (v33Var2.V(q15Var2.y) / 2));
                        int i15 = iV3 - iD;
                        if (i15 < 0) {
                            i15 = 0;
                        }
                        int iW = xs2.w(iV4, 0, i15);
                        if (rf4Var.g.d() != iW) {
                            m50.T(hg4Var2.y, null, new d40(hg4Var2, iW, (mu0) null, (byte) 6), 3);
                        }
                    }
                }
                return og5.g;
            }
        });
    }
}
