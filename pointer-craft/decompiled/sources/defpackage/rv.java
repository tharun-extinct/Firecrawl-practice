package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rv implements jp3, wp2 {
    public Object a;
    public final Object j;
    public Object m;
    public Object q;
    public Object t;

    public rv(cj cjVar, j51 j51Var, ku1 ku1Var, k85 k85Var, List list, boolean z) {
        int i;
        cj cjVar2 = cjVar;
        k85 k85Var2 = k85Var;
        this.j = cjVar2;
        this.t = list;
        final byte b = 0;
        my1 my1Var = new my1(this) { // from class: i93
            public final /* synthetic */ rv t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                Object obj = null;
                int i2 = 1;
                rv rvVar = this.t;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) rvVar.q;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fG = ((ip3) obj2).g.g();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fG2 = ((ip3) obj3).g.g();
                                    if (Float.compare(fG, fG2) < 0) {
                                        obj2 = obj3;
                                        fG = fG2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        ip3 ip3Var = (ip3) obj;
                        return Float.valueOf(ip3Var != null ? ip3Var.g.g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) rvVar.q;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fR = ((ip3) obj4).g.b.r();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fR2 = ((ip3) obj5).g.b.r();
                                    if (Float.compare(fR, fR2) < 0) {
                                        obj4 = obj5;
                                        fR = fR2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        ip3 ip3Var2 = (ip3) obj;
                        return Float.valueOf(ip3Var2 != null ? ip3Var2.g.b.r() : 0.0f);
                }
            }
        };
        bt2 bt2Var = bt2.t;
        this.a = v13.u(bt2Var, my1Var);
        final byte b2 = 1;
        this.m = v13.u(bt2Var, new my1(this) { // from class: i93
            public final /* synthetic */ rv t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                Object obj = null;
                int i2 = 1;
                rv rvVar = this.t;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) rvVar.q;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fG = ((ip3) obj2).g.g();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i2);
                                    float fG2 = ((ip3) obj3).g.g();
                                    if (Float.compare(fG, fG2) < 0) {
                                        obj2 = obj3;
                                        fG = fG2;
                                    }
                                    if (i2 != size) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        ip3 ip3Var = (ip3) obj;
                        return Float.valueOf(ip3Var != null ? ip3Var.g.g() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) rvVar.q;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fR = ((ip3) obj4).g.b.r();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i2);
                                    float fR2 = ((ip3) obj5).g.b.r();
                                    if (Float.compare(fR, fR2) < 0) {
                                        obj4 = obj5;
                                        fR = fR2;
                                    }
                                    if (i2 != size2) {
                                        i2++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        ip3 ip3Var2 = (ip3) obj;
                        return Float.valueOf(ip3Var2 != null ? ip3Var2.g.b.r() : 0.0f);
                }
            }
        });
        lp3 lp3Var = k85Var2.y;
        cj cjVar3 = dj.g;
        ArrayList arrayList = cjVar2.m;
        String str = cjVar2.t;
        pi1 pi1Var = pi1.j;
        List listB0 = arrayList != null ? cj0.B0(arrayList, new fu1((byte) 5)) : pi1Var;
        ArrayList arrayList2 = new ArrayList();
        dr drVar = new dr();
        int size = listB0.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b3 = 14;
            if (i2 >= size) {
                pi1 pi1Var2 = pi1Var;
                while (i3 <= str.length() && !drVar.isEmpty()) {
                    bj bjVar = (bj) drVar.last();
                    Object obj = bjVar.g;
                    int i4 = bjVar.r;
                    arrayList2.add(new bj(i3, i4, obj));
                    while (!drVar.isEmpty() && i4 == ((bj) drVar.last()).r) {
                        drVar.removeLast();
                    }
                    i3 = i4;
                }
                if (i3 < str.length()) {
                    arrayList2.add(new bj(i3, str.length(), lp3Var));
                }
                if (arrayList2.isEmpty()) {
                    i = 0;
                    arrayList2.add(new bj(0, 0, lp3Var));
                } else {
                    i = 0;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                int i5 = i;
                while (i5 < size2) {
                    bj bjVar2 = (bj) arrayList2.get(i5);
                    int i6 = bjVar2.y;
                    int i7 = bjVar2.r;
                    String strSubstring = i6 != i7 ? str.substring(i6, i7) : "";
                    List listG = dj.g(cjVar2, i6, i7, new l1(b3));
                    cj cjVar4 = new cj(strSubstring, listG == null ? pi1Var2 : listG);
                    lp3 lp3Var2 = (lp3) bjVar2.g;
                    if (lp3Var2.y == 0) {
                        lp3Var2 = new lp3(lp3Var2.g, lp3Var.y, lp3Var2.r, lp3Var2.n, lp3Var2.v, lp3Var2.x, lp3Var2.l, lp3Var2.j, lp3Var2.t);
                    }
                    k85 k85Var3 = new k85(k85Var2.g, lp3Var.g(lp3Var2));
                    List list2 = cjVar4.j;
                    List list3 = list2 == null ? pi1Var2 : list2;
                    List list4 = (List) this.t;
                    ArrayList arrayList4 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        bj bjVar3 = (bj) list4.get(i8);
                        int i9 = bjVar3.y;
                        lp3 lp3Var3 = lp3Var;
                        int i10 = bjVar3.r;
                        if (dj.y(i6, i7, i9, i10)) {
                            if (i6 > i9 || i10 > i7) {
                                nc2.g("placeholder can not overlap with paragraph.");
                            }
                            arrayList4.add(new bj(i9 - i6, i10 - i6, bjVar3.g));
                        }
                        i8++;
                        list4 = list4;
                        lp3Var = lp3Var3;
                    }
                    arrayList3.add(new ip3(new kd(strSubstring, k85Var3, list3, arrayList4, ku1Var, j51Var, z), i6, i7));
                    i5++;
                    cjVar2 = cjVar;
                    k85Var2 = k85Var;
                    str = str;
                    size2 = size2;
                    b3 = 14;
                }
                this.q = arrayList3;
                return;
            }
            bj bjVar4 = (bj) listB0.get(i2);
            bj bjVarG = bj.g(bjVar4, lp3Var.g((lp3) bjVar4.g), b, 14);
            Object obj2 = bjVarG.g;
            int i11 = bjVarG.r;
            int i12 = bjVarG.y;
            while (i3 < i12 && !drVar.isEmpty()) {
                bj bjVar5 = (bj) drVar.last();
                listB0 = listB0;
                int i13 = bjVar5.r;
                pi1Var = pi1Var;
                Object obj3 = bjVar5.g;
                if (i12 < i13) {
                    arrayList2.add(new bj(i3, i12, obj3));
                    i3 = i12;
                } else {
                    int i14 = size;
                    arrayList2.add(new bj(i3, i13, obj3));
                    i3 = bjVar5.r;
                    while (!drVar.isEmpty() && i3 == ((bj) drVar.last()).r) {
                        drVar.removeLast();
                    }
                    size = i14;
                }
            }
            List list5 = listB0;
            pi1 pi1Var3 = pi1Var;
            int i15 = size;
            if (i3 < i12) {
                arrayList2.add(new bj(i3, i12, lp3Var));
                i3 = i12;
            }
            bj bjVar6 = (bj) drVar.j();
            if (bjVar6 != null) {
                int i16 = bjVar6.r;
                Object obj4 = bjVar6.g;
                int i17 = bjVar6.y;
                if (i17 == i12 && i16 == i11) {
                    drVar.removeLast();
                    drVar.addLast(new bj(i12, i11, ((lp3) obj4).g((lp3) obj2)));
                } else if (i17 == i16) {
                    arrayList2.add(new bj(i17, i16, obj4));
                    drVar.removeLast();
                    drVar.addLast(new bj(i12, i11, obj2));
                } else {
                    if (i16 < i11) {
                        t94.g();
                        throw null;
                    }
                    drVar.addLast(new bj(i12, i11, ((lp3) obj4).g((lp3) obj2)));
                }
            } else {
                drVar.addLast(new bj(i12, i11, obj2));
            }
            i2++;
            listB0 = list5;
            pi1Var = pi1Var3;
            size = i15;
            b = 0;
        }
    }

    public static int[] k(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            vp1 vp1Var = (vp1) obj;
            int i4 = vp1Var.j;
            iArr[i2] = i4;
            sparseIntArray.append(i4, vp1Var.t);
            i2++;
        }
        return iArr;
    }

    public static ArrayList t(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        tp1 tp1Var = new tp1();
        tp1Var.l = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(tp1Var);
            }
            arrayList.add((tp1) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(tp1Var);
            }
        }
        return arrayList;
    }

    public void A(int i) {
        View viewL;
        rp1 rp1Var = (rp1) this.j;
        if (i >= rp1Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = rp1Var.getFlexDirection();
        if (rp1Var.getAlignItems() != 4) {
            for (tp1 tp1Var : rp1Var.getFlexLinesInternal()) {
                ArrayList arrayList = tp1Var.c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Integer num = (Integer) obj;
                    View viewL2 = rp1Var.l(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        e(viewL2, tp1Var.l, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            l0.u(xi3.j("Invalid flex direction: ", flexDirection));
                            return;
                        }
                        d(viewL2, tp1Var.l, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.a;
        List flexLinesInternal = rp1Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i3 = iArr != null ? iArr[i] : 0; i3 < size2; i3++) {
            tp1 tp1Var2 = (tp1) flexLinesInternal.get(i3);
            int i4 = tp1Var2.j;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = tp1Var2.i + i5;
                if (i5 < rp1Var.getFlexItemCount() && (viewL = rp1Var.l(i6)) != null && viewL.getVisibility() != 8) {
                    sp1 sp1Var = (sp1) viewL.getLayoutParams();
                    if (sp1Var.a() == -1 || sp1Var.a() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            e(viewL, tp1Var2.l, i6);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                l0.u(xi3.j("Invalid flex direction: ", flexDirection));
                                return;
                            }
                            d(viewL, tp1Var2.l, i6);
                        }
                    }
                }
            }
        }
    }

    public void B(int i, int i2, int i3, View view) {
        long[] jArr = (long[]) this.m;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = (long[]) this.q;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    public ArrayList a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            sp1 sp1Var = (sp1) ((rp1) this.j).y(i2).getLayoutParams();
            vp1 vp1Var = new vp1();
            vp1Var.t = sp1Var.getOrder();
            vp1Var.j = i2;
            arrayList.add(vp1Var);
        }
        return arrayList;
    }

    public void b(int i, int i2, tp1 tp1Var, int i3, int i4, boolean z) {
        int i5;
        float f;
        int iMax;
        double d;
        double d2;
        rp1 rp1Var = (rp1) this.j;
        float f2 = tp1Var.a;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 < (i5 = tp1Var.v)) {
            return;
        }
        float f4 = (i3 - i5) / f2;
        tp1Var.v = i4 + tp1Var.x;
        if (!z) {
            tp1Var.l = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < tp1Var.j) {
            int i8 = tp1Var.i + i6;
            View viewL = rp1Var.l(i8);
            if (viewL == null || viewL.getVisibility() == 8) {
                f = f3;
                f4 = f4;
                z2 = z2;
            } else {
                sp1 sp1Var = (sp1) viewL.getLayoutParams();
                int flexDirection = rp1Var.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    boolean z3 = z2;
                    int measuredWidth = viewL.getMeasuredWidth();
                    long[] jArr = (long[]) this.q;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewL.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.q;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.t)[i8] || sp1Var.x() <= f) {
                        z2 = z3;
                    } else {
                        float fX = (sp1Var.x() * f4) + measuredWidth;
                        if (i6 == tp1Var.j - 1) {
                            fX += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fX);
                        if (iRound > sp1Var.o()) {
                            iRound = sp1Var.o();
                            ((boolean[]) this.t)[i8] = true;
                            tp1Var.a -= sp1Var.x();
                            z2 = true;
                        } else {
                            float f6 = (fX - iRound) + f5;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f5 = f6;
                                z2 = z3;
                            }
                            f6 = (float) d;
                            f5 = f6;
                            z2 = z3;
                        }
                        int iP = p(i2, sp1Var, tp1Var.w);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewL.measure(iMakeMeasureSpec, iP);
                        int measuredWidth2 = viewL.getMeasuredWidth();
                        int measuredHeight2 = viewL.getMeasuredHeight();
                        B(i8, iMakeMeasureSpec, iP, viewL);
                        rp1Var.j(viewL, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, rp1Var.m(viewL) + sp1Var.u() + sp1Var.f() + measuredHeight);
                    tp1Var.v = sp1Var.q() + sp1Var.h() + measuredWidth + tp1Var.v;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewL.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.q;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewL.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.q;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.t)[i8] || sp1Var.x() <= f) {
                        f4 = f4;
                        z2 = z2;
                    } else {
                        float fX2 = (sp1Var.x() * f4) + measuredHeight3;
                        if (i6 == tp1Var.j - 1) {
                            fX2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fX2);
                        if (iRound2 > sp1Var.s()) {
                            iRound2 = sp1Var.s();
                            ((boolean[]) this.t)[i8] = true;
                            tp1Var.a -= sp1Var.x();
                            z2 = true;
                        } else {
                            float f7 = (fX2 - iRound2) + f5;
                            boolean z4 = z2;
                            double d4 = f7;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f5 = f7;
                                z2 = z4;
                            }
                            f7 = (float) d2;
                            f5 = f7;
                            z2 = z4;
                        }
                        int iU = u(i, sp1Var, tp1Var.w);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewL.measure(iU, iMakeMeasureSpec2);
                        int measuredWidth4 = viewL.getMeasuredWidth();
                        int measuredHeight4 = viewL.getMeasuredHeight();
                        B(i8, iU, iMakeMeasureSpec2, viewL);
                        rp1Var.j(viewL, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, rp1Var.m(viewL) + sp1Var.q() + sp1Var.h() + measuredWidth3);
                    tp1Var.v = sp1Var.u() + sp1Var.f() + measuredHeight3 + tp1Var.v;
                }
                tp1Var.l = Math.max(tp1Var.l, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == tp1Var.v) {
            return;
        }
        b(i, i2, tp1Var, i3, i4, true);
    }

    public void c(int i) {
        long[] jArr = (long[]) this.m;
        if (jArr == null) {
            this.m = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.m = Arrays.copyOf((long[]) this.m, Math.max(jArr.length * 2, i));
        }
    }

    public void d(View view, int i, int i2) {
        sp1 sp1Var = (sp1) view.getLayoutParams();
        int iH = (i - sp1Var.h()) - sp1Var.q();
        rp1 rp1Var = (rp1) this.j;
        int iMin = Math.min(Math.max(iH - rp1Var.m(view), sp1Var.c()), sp1Var.o());
        long[] jArr = (long[]) this.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        B(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        rp1Var.j(view, i2);
    }

    public void e(View view, int i, int i2) {
        sp1 sp1Var = (sp1) view.getLayoutParams();
        int iF = (i - sp1Var.f()) - sp1Var.u();
        rp1 rp1Var = (rp1) this.j;
        int iMin = Math.min(Math.max(iF - rp1Var.m(view), sp1Var.w()), sp1Var.s());
        long[] jArr = (long[]) this.q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        B(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        rp1Var.j(view, i2);
    }

    public void f(int i, int i2, tp1 tp1Var, int i3, int i4, boolean z) {
        float f;
        boolean z2;
        int iMax;
        boolean z3;
        int iW;
        float f2;
        rp1 rp1Var = (rp1) this.j;
        int i5 = tp1Var.v;
        float f3 = tp1Var.m;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        tp1Var.v = i4 + tp1Var.x;
        if (!z) {
            tp1Var.l = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < tp1Var.j) {
            int i8 = tp1Var.i + i6;
            View viewL = rp1Var.l(i8);
            if (viewL == null || viewL.getVisibility() == 8) {
                f = f4;
                f5 = f5;
                z2 = z4;
                i6 = i6;
            } else {
                sp1 sp1Var = (sp1) viewL.getLayoutParams();
                int flexDirection = rp1Var.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f5 = f5;
                    z2 = z4;
                    int measuredWidth = viewL.getMeasuredWidth();
                    long[] jArr = (long[]) this.q;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewL.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.q;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (((boolean[]) this.t)[i8] || sp1Var.m() <= f) {
                        i6 = i6;
                    } else {
                        float fM = measuredWidth - (sp1Var.m() * f5);
                        if (i6 == tp1Var.j - 1) {
                            fM += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fM);
                        if (iRound < sp1Var.c()) {
                            iRound = sp1Var.c();
                            ((boolean[]) this.t)[i8] = true;
                            tp1Var.m -= sp1Var.m();
                            z2 = true;
                        } else {
                            float f7 = (fM - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                            f6 = f7;
                        }
                        int iP = p(i2, sp1Var, tp1Var.w);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewL.measure(iMakeMeasureSpec, iP);
                        int measuredWidth2 = viewL.getMeasuredWidth();
                        int measuredHeight2 = viewL.getMeasuredHeight();
                        B(i8, iMakeMeasureSpec, iP, viewL);
                        rp1Var.j(viewL, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, rp1Var.m(viewL) + sp1Var.u() + sp1Var.f() + measuredHeight);
                    tp1Var.v = sp1Var.q() + sp1Var.h() + measuredWidth + tp1Var.v;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewL.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.q;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewL.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.q;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (((boolean[]) this.t)[i8] || sp1Var.m() <= f) {
                        z3 = z4;
                    } else {
                        float fM2 = measuredHeight3 - (sp1Var.m() * f5);
                        if (i6 == tp1Var.j - 1) {
                            fM2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fM2);
                        if (iRound2 < sp1Var.w()) {
                            iW = sp1Var.w();
                            ((boolean[]) this.t)[i8] = true;
                            tp1Var.m -= sp1Var.m();
                            z3 = true;
                        } else {
                            float f8 = (fM2 - iRound2) + f6;
                            boolean z5 = z4;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iW = iRound2 + 1;
                                f2 = f8 - 1.0f;
                            } else if (d2 < -1.0d) {
                                iW = iRound2 - 1;
                                f2 = f8 + 1.0f;
                            } else {
                                iW = iRound2;
                                z3 = z5;
                                f6 = f8;
                            }
                            f6 = f2;
                            z3 = z5;
                        }
                        int iU = u(i, sp1Var, tp1Var.w);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iW, 1073741824);
                        viewL.measure(iU, iMakeMeasureSpec2);
                        int measuredWidth4 = viewL.getMeasuredWidth();
                        int measuredHeight4 = viewL.getMeasuredHeight();
                        B(i8, iU, iMakeMeasureSpec2, viewL);
                        rp1Var.j(viewL, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, rp1Var.m(viewL) + sp1Var.q() + sp1Var.h() + measuredWidth3);
                    tp1Var.v = sp1Var.u() + sp1Var.f() + measuredHeight3 + tp1Var.v;
                    z2 = z3;
                    i6 = i6;
                }
                tp1Var.l = Math.max(tp1Var.l, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            z4 = z2;
            f5 = f5;
        }
        if (!z4 || i5 == tp1Var.v) {
            return;
        }
        f(i, i2, tp1Var, i3, i4, true);
    }

    @Override // defpackage.jp3
    public float g() {
        return ((Number) ((wp2) this.a).getValue()).floatValue();
    }

    @Override // defpackage.wp2
    public Object getValue() {
        pl5 pl5Var = (pl5) this.q;
        if (pl5Var != null) {
            return pl5Var;
        }
        vl5 vl5Var = (vl5) ((my1) this.t).g();
        tl5 tl5Var = (tl5) ((my1) this.a).g();
        zx0 zx0Var = (zx0) ((my1) this.m).g();
        vl5Var.getClass();
        tl5Var.getClass();
        zx0Var.getClass();
        kb5 kb5Var = new kb5(vl5Var, tl5Var, zx0Var);
        tf0 tf0Var = (tf0) this.j;
        String strY = tf0Var.y();
        if (strY == null) {
            l0.u("Local and anonymous classes can not be ViewModels");
            return null;
        }
        pl5 pl5VarH = kb5Var.h(tf0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY));
        this.q = pl5VarH;
        return pl5VarH;
    }

    public void h(View view, tp1 tp1Var, boolean z, int i, int i2, int i3, int i4) {
        sp1 sp1Var = (sp1) view.getLayoutParams();
        int alignItems = ((rp1) this.j).getAlignItems();
        if (sp1Var.a() != -1) {
            alignItems = sp1Var.a();
        }
        int i5 = tp1Var.l;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - sp1Var.q(), i2, ((i3 + i5) - view.getMeasuredWidth()) - sp1Var.q(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(sp1Var.h() + measuredWidth + (i - i5), i2, sp1Var.h() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iY = ((sz5.y(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - sz5.g(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - iY, i2, i3 - iY, i4);
                    return;
                } else {
                    view.layout(i + iY, i2, i3 + iY, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - sp1Var.q(), i2, i3 - sp1Var.q(), i4);
        } else {
            view.layout(sp1Var.h() + i, i2, sp1Var.h() + i3, i4);
        }
    }

    public void i(int i) {
        long[] jArr = (long[]) this.q;
        if (jArr == null) {
            this.q = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.q = Arrays.copyOf((long[]) this.q, Math.max(jArr.length * 2, i));
        }
    }

    public void j(int i, List list) {
        int i2 = ((int[]) this.a)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.a;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.m;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public void l(View view, int i) {
        boolean z;
        sp1 sp1Var = (sp1) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= sp1Var.c()) {
            if (measuredWidth > sp1Var.o()) {
                measuredWidth = sp1Var.o();
            } else {
                z = false;
            }
            if (measuredHeight < sp1Var.w()) {
                measuredHeight = sp1Var.w();
            } else if (measuredHeight > sp1Var.s()) {
                measuredHeight = sp1Var.s();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                B(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                ((rp1) this.j).j(view, i);
            }
        }
        measuredWidth = sp1Var.c();
        z = true;
        if (measuredHeight < sp1Var.w()) {
            measuredHeight = sp1Var.w();
        } else if (measuredHeight > sp1Var.s()) {
            measuredHeight = sp1Var.s();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            B(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            ((rp1) this.j).j(view, i);
        }
    }

    public void m(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        rp1 rp1Var = (rp1) this.j;
        int flexDirection = rp1Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            l0.u(xi3.j("Invalid flex direction: ", flexDirection));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<tp1> flexLinesInternal = rp1Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = rp1Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((tp1) flexLinesInternal.get(0)).l = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = rp1Var.getAlignContent();
                if (alignContent == 1) {
                    tp1 tp1Var = new tp1();
                    tp1Var.l = size - sumOfCrossSize;
                    flexLinesInternal.add(0, tp1Var);
                    return;
                }
                if (alignContent == 2) {
                    rp1Var.setFlexLines(t(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((tp1) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            tp1 tp1Var2 = new tp1();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                tp1Var2.l = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                tp1Var2.l = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                tp1Var2.l = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                tp1Var2.l = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(tp1Var2);
                        }
                        i4++;
                    }
                    rp1Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        rp1Var.setFlexLines(t(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    tp1 tp1Var3 = new tp1();
                    tp1Var3.l = size5;
                    for (tp1 tp1Var4 : flexLinesInternal) {
                        arrayList2.add(tp1Var3);
                        arrayList2.add(tp1Var4);
                        arrayList2.add(tp1Var3);
                    }
                    rp1Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        tp1 tp1Var5 = (tp1) flexLinesInternal.get(i4);
                        float f4 = tp1Var5.l + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        tp1Var5.l = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public jb0 n(qv qvVar, my1 my1Var) {
        int i;
        int i2;
        int i3;
        s54 s54Var = new s54();
        s54Var.j = -1;
        synchronized (this.j) {
            Throwable th = (Throwable) this.t;
            if (th != null) {
                qvVar.y(th);
                return aj6.m;
            }
            bs bsVar = (bs) this.a;
            do {
                i = bsVar.get();
                i2 = i + 1;
            } while (!bsVar.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            s54Var.j = (i2 >>> 27) & 15;
            ((xa3) this.m).g(qvVar);
            if (z && my1Var != null) {
                try {
                    my1Var.g();
                } catch (Throwable th2) {
                    synchronized (this.j) {
                        try {
                            if (((Throwable) this.t) == null) {
                                this.t = th2;
                                xa3 xa3Var = (xa3) this.m;
                                Object[] objArr = xa3Var.g;
                                int i4 = xa3Var.y;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((qv) objArr[i5]).y(th2);
                                }
                                ((xa3) this.m).n();
                                bs bsVar2 = (bs) this.a;
                                do {
                                    i3 = bsVar2.get();
                                } while (!bsVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new ji(new un(qvVar, this, s54Var, (byte) 2));
        }
    }

    public void o(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.j).put(str, obj);
        ew4 ew4Var = (ew4) ((LinkedHashMap) this.a).get(str);
        if (ew4Var != null) {
            ew4Var.a(obj);
        }
        ew4 ew4Var2 = (ew4) ((LinkedHashMap) this.m).get(str);
        if (ew4Var2 != null) {
            ew4Var2.a(obj);
        }
    }

    public int p(int i, sp1 sp1Var, int i2) {
        rp1 rp1Var = (rp1) this.j;
        int iN = rp1Var.n(i, sp1Var.u() + sp1Var.f() + rp1Var.getPaddingBottom() + rp1Var.getPaddingTop() + i2, sp1Var.g());
        int size = View.MeasureSpec.getSize(iN);
        if (size > sp1Var.s()) {
            return View.MeasureSpec.makeMeasureSpec(sp1Var.s(), View.MeasureSpec.getMode(iN));
        }
        return size < sp1Var.w() ? View.MeasureSpec.makeMeasureSpec(sp1Var.w(), View.MeasureSpec.getMode(iN)) : iN;
    }

    public void q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        rv rvVar;
        int i4;
        int i5;
        rp1 rp1Var = (rp1) this.j;
        int flexItemCount = rp1Var.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.t;
        if (zArr == null) {
            this.t = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.t = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= rp1Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = rp1Var.getFlexDirection();
        int flexDirection2 = rp1Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = rp1Var.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = rp1Var.getPaddingLeft();
            paddingRight = rp1Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                l0.u(xi3.j("Invalid flex direction: ", flexDirection));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = rp1Var.getLargestMainSize();
            }
            paddingLeft = rp1Var.getPaddingTop();
            paddingRight = rp1Var.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = (int[]) this.a;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = rp1Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            tp1 tp1Var = (tp1) flexLinesInternal.get(i8);
            int i9 = tp1Var.v;
            if (i9 >= i7 || !tp1Var.s) {
                rvVar = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && tp1Var.p) {
                    rvVar.f(i4, i5, tp1Var, i7, i6, false);
                }
            } else {
                rvVar = this;
                i4 = i;
                i5 = i2;
                rvVar.b(i4, i5, tp1Var, i7, i6, false);
            }
            i8++;
            this = rvVar;
            i = i4;
            i2 = i5;
        }
    }

    @Override // defpackage.jp3
    public float r() {
        return ((Number) ((wp2) this.m).getValue()).floatValue();
    }

    public void s(xy1 xy1Var) {
        int i;
        synchronized (this.j) {
            try {
                xa3 xa3Var = (xa3) this.m;
                this.m = (xa3) this.q;
                this.q = xa3Var;
                bs bsVar = (bs) this.a;
                do {
                    i = bsVar.get();
                } while (!bsVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = xa3Var.y;
                for (int i3 = 0; i3 < i2; i3++) {
                    xy1Var.a(xa3Var.l(i3));
                }
                xa3Var.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int u(int i, sp1 sp1Var, int i2) {
        rp1 rp1Var = (rp1) this.j;
        int iT = rp1Var.t(i, sp1Var.q() + sp1Var.h() + rp1Var.getPaddingRight() + rp1Var.getPaddingLeft() + i2, sp1Var.y());
        int size = View.MeasureSpec.getSize(iT);
        if (size > sp1Var.o()) {
            return View.MeasureSpec.makeMeasureSpec(sp1Var.o(), View.MeasureSpec.getMode(iT));
        }
        return size < sp1Var.c() ? View.MeasureSpec.makeMeasureSpec(sp1Var.c(), View.MeasureSpec.getMode(iT)) : iT;
    }

    public void v(List list, tp1 tp1Var, int i, int i2) {
        tp1Var.w = i2;
        ((rp1) this.j).x(tp1Var);
        tp1Var.b = i;
        list.add(tp1Var);
    }

    public void w(int i) {
        int[] iArr = (int[]) this.a;
        if (iArr == null) {
            this.a = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.a = Arrays.copyOf((int[]) this.a, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    public void x(up1 up1Var, int i, int i2, int i3, int i4, int i5, List list) {
        int iN;
        sp1 sp1Var;
        int i6;
        boolean z;
        int i7 = i;
        rp1 rp1Var = (rp1) this.j;
        boolean zA = rp1Var.a();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        up1Var.g = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zA ? rp1Var.getPaddingStart() : rp1Var.getPaddingTop();
        int paddingEnd = zA ? rp1Var.getPaddingEnd() : rp1Var.getPaddingBottom();
        int paddingTop = zA ? rp1Var.getPaddingTop() : rp1Var.getPaddingStart();
        int paddingBottom = zA ? rp1Var.getPaddingBottom() : rp1Var.getPaddingEnd();
        tp1 tp1Var = new tp1();
        int i8 = i4;
        int i9 = 1;
        tp1Var.i = i8;
        int i10 = paddingStart + paddingEnd;
        tp1Var.v = i10;
        int flexItemCount = rp1Var.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewL = rp1Var.l(i8);
            if (viewL != null) {
                if (viewL.getVisibility() == 8) {
                    tp1Var.t++;
                    tp1Var.j++;
                    if (i8 == i14 - 1 && tp1Var.g() != 0) {
                        v(arrayList, tp1Var, i8, i12);
                    }
                } else {
                    if (viewL instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewL;
                        sp1 sp1Var2 = (sp1) compoundButton.getLayoutParams();
                        int iC = sp1Var2.c();
                        int iW = sp1Var2.w();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iC == -1) {
                            iC = minimumWidth;
                        }
                        sp1Var2.p(iC);
                        if (iW == -1) {
                            iW = minimumHeight;
                        }
                        sp1Var2.v(iW);
                    }
                    sp1 sp1Var3 = (sp1) viewL.getLayoutParams();
                    if (sp1Var3.a() == 4) {
                        tp1Var.c.add(Integer.valueOf(i8));
                    }
                    int iY = zA ? sp1Var3.y() : sp1Var3.g();
                    if (sp1Var3.j() != -1.0f && mode == 1073741824) {
                        iY = Math.round(sp1Var3.j() * size);
                    }
                    if (zA) {
                        iN = rp1Var.t(i7, sp1Var3.q() + sp1Var3.h() + i10, iY);
                        int iN2 = rp1Var.n(i2, sp1Var3.u() + sp1Var3.f() + paddingTop + paddingBottom + i12, sp1Var3.g());
                        viewL.measure(iN, iN2);
                        B(i8, iN, iN2, viewL);
                    } else {
                        int iT = rp1Var.t(i2, sp1Var3.q() + sp1Var3.h() + paddingTop + paddingBottom + i12, sp1Var3.y());
                        iN = rp1Var.n(i7, sp1Var3.u() + sp1Var3.f() + i10, iY);
                        viewL.measure(iT, iN);
                        B(i8, iT, iN, viewL);
                    }
                    rp1Var.j(viewL, i8);
                    l(viewL, i8);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewL.getMeasuredState());
                    int i15 = tp1Var.v;
                    int measuredWidth = (zA ? viewL.getMeasuredWidth() : viewL.getMeasuredHeight()) + (zA ? sp1Var3.h() : sp1Var3.f()) + (zA ? sp1Var3.q() : sp1Var3.u());
                    int size2 = arrayList.size();
                    if (rp1Var.getFlexWrap() != 0) {
                        if (sp1Var3.i()) {
                            sp1Var = sp1Var3;
                        } else {
                            if (mode == 0) {
                                sp1Var = sp1Var3;
                            } else {
                                sp1Var = sp1Var3;
                                int maxLine = rp1Var.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iR = rp1Var.r(viewL, i8, i13);
                                    if (iR > 0) {
                                        measuredWidth += iR;
                                    }
                                    if (size < i15 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            tp1Var.j += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (tp1Var.g() > 0) {
                            arrayList = arrayList;
                            v(arrayList, tp1Var, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += tp1Var.l;
                        }
                        if (zA) {
                            arrayList = arrayList;
                            if (sp1Var.g() == -1) {
                                viewL.measure(iN, rp1Var.n(i2, sp1Var.u() + sp1Var.f() + rp1Var.getPaddingBottom() + rp1Var.getPaddingTop() + i12, sp1Var.g()));
                                l(viewL, i8);
                            }
                        } else {
                            arrayList = arrayList;
                            if (sp1Var.y() == -1) {
                                viewL.measure(rp1Var.t(i2, sp1Var.q() + sp1Var.h() + rp1Var.getPaddingRight() + rp1Var.getPaddingLeft() + i12, sp1Var.y()), iN);
                                l(viewL, i8);
                            }
                        }
                        tp1Var = new tp1();
                        tp1Var.j = i9;
                        i10 = i10;
                        tp1Var.v = i10;
                        tp1Var.i = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        sp1Var = sp1Var3;
                        i10 = i10;
                        arrayList = arrayList;
                        tp1Var.j += i9;
                        i13++;
                        i6 = i11;
                    }
                    tp1Var.s |= sp1Var.x() != 0.0f;
                    tp1Var.p |= sp1Var.m() != 0.0f;
                    int[] iArr = (int[]) this.a;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    tp1Var.v = (zA ? viewL.getMeasuredWidth() : viewL.getMeasuredHeight()) + (zA ? sp1Var.h() : sp1Var.f()) + (zA ? sp1Var.q() : sp1Var.u()) + tp1Var.v;
                    tp1Var.a = sp1Var.x() + tp1Var.a;
                    tp1Var.m = sp1Var.m() + tp1Var.m;
                    rp1Var.g(viewL, i8, i13, tp1Var);
                    int iMax = Math.max(i6, rp1Var.m(viewL) + (zA ? viewL.getMeasuredHeight() : viewL.getMeasuredWidth()) + (zA ? sp1Var.f() : sp1Var.h()) + (zA ? sp1Var.u() : sp1Var.q()));
                    tp1Var.l = Math.max(tp1Var.l, iMax);
                    if (zA) {
                        int flexWrap = rp1Var.getFlexWrap();
                        int i16 = tp1Var.q;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            tp1Var.q = Math.max(i16, sp1Var.f() + viewL.getBaseline());
                        } else {
                            tp1Var.q = Math.max(i16, sp1Var.u() + (viewL.getMeasuredHeight() - viewL.getBaseline()));
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && tp1Var.g() != 0) {
                        v(arrayList, tp1Var, i8, i12);
                        i12 += tp1Var.l;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        i9 = 1;
                        if (((tp1) arrayList.get(arrayList.size() - 1)).b >= i5 && i8 >= i5 && !z3) {
                            i12 = -tp1Var.l;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    } else {
                        i9 = 1;
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
            } else if (i8 == i14 - 1 && tp1Var.g() != 0) {
                v(arrayList, tp1Var, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
        }
        up1Var.y = iCombineMeasuredStates;
    }

    @Override // defpackage.jp3
    public boolean y() {
        ArrayList arrayList = (ArrayList) this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ip3) arrayList.get(i)).g.y()) {
                return true;
            }
        }
        return false;
    }

    public void z(View view, tp1 tp1Var, int i, int i2, int i3, int i4) {
        sp1 sp1Var = (sp1) view.getLayoutParams();
        rp1 rp1Var = (rp1) this.j;
        int alignItems = rp1Var.getAlignItems();
        if (sp1Var.a() != -1) {
            alignItems = sp1Var.a();
        }
        int i5 = tp1Var.l;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (rp1Var.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - sp1Var.u(), i3, i6 - sp1Var.u());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int iF = sp1Var.f() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, iF, i3, sp1Var.f() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iF2 = ((sp1Var.f() + (i5 - view.getMeasuredHeight())) - sp1Var.u()) / 2;
                if (rp1Var.getFlexWrap() != 2) {
                    int i7 = i2 + iF2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iF2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = rp1Var.getFlexWrap();
                int i9 = tp1Var.q;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), sp1Var.f());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), sp1Var.u());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (rp1Var.getFlexWrap() != 2) {
            view.layout(i, sp1Var.f() + i2, i3, sp1Var.f() + i4);
        } else {
            view.layout(i, i2 - sp1Var.u(), i3, i4 - sp1Var.u());
        }
    }

    public rv(byte b) {
        switch (b) {
            case 1:
                this.j = y94.w(null);
                this.t = v70.x(0, 2, f70.t);
                this.a = y94.w(de4.j);
                this.m = y94.w(dx4.y);
                this.q = y94.w(null);
                break;
            default:
                this.j = new Object();
                this.a = new bs(0);
                this.m = new xa3();
                this.q = new xa3();
                break;
        }
    }

    public rv(tf0 tf0Var, my1 my1Var, my1 my1Var2, my1 my1Var3) {
        this.j = tf0Var;
        this.t = my1Var;
        this.a = my1Var2;
        this.m = my1Var3;
    }

    public rv(Map map) {
        map.getClass();
        this.j = new LinkedHashMap(map);
        this.t = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.q = new rl0(this, (byte) 4);
    }

    public rv(rp1 rp1Var) {
        this.j = rp1Var;
    }
}
