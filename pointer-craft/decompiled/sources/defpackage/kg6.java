package defpackage;

import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kg6 {
    public static zn5 g(ts0 ts0Var, int i, ArrayList arrayList, zn5 zn5Var) {
        int i2;
        int i3 = i == 0 ? ts0Var.n0 : ts0Var.o0;
        if (i3 != -1 && (zn5Var == null || i3 != zn5Var.y)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                zn5 zn5Var2 = (zn5) arrayList.get(i4);
                if (zn5Var2.y == i3) {
                    if (zn5Var != null) {
                        zn5Var.n(i, zn5Var2);
                        arrayList.remove(zn5Var);
                    }
                    zn5Var = zn5Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return zn5Var;
        }
        if (zn5Var == null) {
            if (ts0Var instanceof n52) {
                n52 n52Var = (n52) ts0Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= n52Var.r0) {
                        i2 = -1;
                        break;
                    }
                    ts0 ts0Var2 = n52Var.q0[i5];
                    if ((i == 0 && (i2 = ts0Var2.n0) != -1) || (i == 1 && (i2 = ts0Var2.o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        zn5 zn5Var3 = (zn5) arrayList.get(i6);
                        if (zn5Var3.y == i2) {
                            zn5Var = zn5Var3;
                            break;
                        }
                    }
                }
            }
            if (zn5Var == null) {
                zn5Var = new zn5();
                zn5Var.g = new ArrayList();
                zn5Var.n = null;
                zn5Var.v = -1;
                int i7 = zn5.x;
                zn5.x = i7 + 1;
                zn5Var.y = i7;
                zn5Var.r = i;
            }
            arrayList.add(zn5Var);
        }
        if (zn5Var.g(ts0Var)) {
            if (ts0Var instanceof m42) {
                m42 m42Var = (m42) ts0Var;
                m42Var.t0.r(m42Var.u0 == 0 ? 1 : 0, zn5Var, arrayList);
            }
            int i8 = zn5Var.y;
            if (i == 0) {
                ts0Var.n0 = i8;
                ts0Var.I.r(i, zn5Var, arrayList);
                ts0Var.K.r(i, zn5Var, arrayList);
            } else {
                ts0Var.o0 = i8;
                ts0Var.J.r(i, zn5Var, arrayList);
                ts0Var.M.r(i, zn5Var, arrayList);
                ts0Var.L.r(i, zn5Var, arrayList);
            }
            ts0Var.P.r(i, zn5Var, arrayList);
        }
        return zn5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [pi1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static final SpannableString n(cj cjVar, j51 j51Var, ro roVar) {
        ?? arrayList;
        int i;
        String str = cjVar.t;
        List list = cjVar.j;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = cjVar.a;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                bj bjVar = (bj) arrayList2.get(i2);
                ju4 ju4Var = (ju4) bjVar.g;
                int i3 = bjVar.y;
                int i4 = bjVar.r;
                int i5 = size;
                long jY = ju4Var.g.y();
                long j = ju4Var.y;
                qv1 qv1Var = ju4Var.r;
                lv1 lv1Var = ju4Var.n;
                n65 n65Var = ju4Var.a;
                tx2 tx2Var = ju4Var.m;
                ArrayList arrayList3 = arrayList2;
                long j2 = ju4Var.q;
                l45 l45Var = ju4Var.w;
                m65 m65Var = ju4Var.g;
                long jY2 = m65Var.y();
                int i6 = jj0.t;
                xq2.F(spannableString, (tf5.g(jY, jY2) ? m65Var : jY != 16 ? new yj0(jY) : l65.g).y(), i3, i4);
                xq2.G(spannableString, j, j51Var, i3, i4);
                if (qv1Var == null && lv1Var == null) {
                    i = 33;
                } else {
                    if (qv1Var == null) {
                        qv1Var = qv1.z;
                    }
                    StyleSpan styleSpan = new StyleSpan(ah6.v(qv1Var, lv1Var != null ? lv1Var.g : 0));
                    i = 33;
                    spannableString.setSpan(styleSpan, i3, i4, 33);
                }
                if (l45Var != null) {
                    int i7 = l45Var.g;
                    if ((i7 | 1) == i7) {
                        spannableString.setSpan(new UnderlineSpan(), i3, i4, i);
                    }
                    if ((i7 | 2) == i7) {
                        spannableString.setSpan(new StrikethroughSpan(), i3, i4, i);
                    }
                }
                if (n65Var != null) {
                    spannableString.setSpan(new ScaleXSpan(n65Var.g), i3, i4, i);
                }
                if (tx2Var != null) {
                    spannableString.setSpan(iz5.y(tx2Var), i3, i4, i);
                }
                if (j2 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(ra.U(j2)), i3, i4, i);
                }
                i2++;
                size = i5;
                arrayList2 = arrayList3;
            }
        }
        int length = str.length();
        ?? arrayList4 = pi1.j;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Object obj = list.get(i8);
                bj bjVar2 = (bj) obj;
                if ((bjVar2.g instanceof ak5) && dj.y(0, length, bjVar2.y, bjVar2.r)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = arrayList4;
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            bj bjVar3 = (bj) arrayList.get(i9);
            ak5 ak5Var = (ak5) bjVar3.g;
            int i10 = bjVar3.y;
            int i11 = bjVar3.r;
            if (!(ak5Var instanceof ak5)) {
                up.y();
                return null;
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(ak5Var.g).build(), i10, i11, 33);
        }
        int length2 = str.length();
        if (list != null) {
            arrayList4 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Object obj2 = list.get(i12);
                bj bjVar4 = (bj) obj2;
                if ((bjVar4.g instanceof wh5) && dj.y(0, length2, bjVar4.y, bjVar4.r)) {
                    arrayList4.add(obj2);
                }
            }
        }
        int size5 = arrayList4.size();
        for (int i13 = 0; i13 < size5; i13++) {
            bj bjVar5 = (bj) arrayList4.get(i13);
            wh5 wh5Var = (wh5) bjVar5.g;
            int i14 = bjVar5.y;
            int i15 = bjVar5.r;
            WeakHashMap weakHashMap = (WeakHashMap) roVar.t;
            Object uRLSpan = weakHashMap.get(wh5Var);
            if (uRLSpan == null) {
                uRLSpan = new URLSpan(wh5Var.g);
                weakHashMap.put(wh5Var, uRLSpan);
            }
            spannableString.setSpan((URLSpan) uRLSpan, i14, i15, 33);
        }
        List listG = cjVar.g(str.length());
        int size6 = listG.size();
        for (int i16 = 0; i16 < size6; i16++) {
            bj bjVar6 = (bj) listG.get(i16);
            int i17 = bjVar6.y;
            Object obj3 = bjVar6.g;
            int i18 = bjVar6.r;
            if (i17 != i18) {
                ov2 ov2Var = (ov2) obj3;
                if (ov2Var instanceof nv2) {
                    obj3.getClass();
                    nv2 nv2Var = (nv2) obj3;
                    bj bjVar7 = new bj(i17, i18, nv2Var);
                    WeakHashMap weakHashMap2 = (WeakHashMap) roVar.a;
                    Object uRLSpan2 = weakHashMap2.get(bjVar7);
                    if (uRLSpan2 == null) {
                        uRLSpan2 = new URLSpan(nv2Var.g);
                        weakHashMap2.put(bjVar7, uRLSpan2);
                    }
                    spannableString.setSpan((URLSpan) uRLSpan2, i17, i18, 33);
                } else {
                    WeakHashMap weakHashMap3 = (WeakHashMap) roVar.m;
                    Object qn0Var = weakHashMap3.get(bjVar6);
                    if (qn0Var == null) {
                        qn0Var = new qn0(ov2Var);
                        weakHashMap3.put(bjVar6, qn0Var);
                    }
                    spannableString.setSpan((ClickableSpan) qn0Var, i17, i18, 33);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0343  */
    /* JADX WARN: Code duplicated, block: B:188:0x034c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0366  */
    /* JADX WARN: Code duplicated, block: B:197:0x036e  */
    public static boolean r(us0 us0Var, gs0 gs0Var) {
        char c;
        zn5 zn5Var;
        zn5 zn5Var2;
        int size;
        zn5 zn5Var3;
        int i;
        int i2;
        zn5 zn5Var4;
        int iR;
        int iR2;
        zn5 zn5Var5;
        zn5 zn5Var6;
        boolean z;
        ArrayList arrayList = us0Var.q0;
        kv2 kv2Var = us0Var.w0;
        int[] iArr = us0Var.p0;
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= size2) {
                int i6 = 0;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (i6 < size2) {
                    ts0 ts0Var = (ts0) arrayList.get(i6);
                    int i7 = i3;
                    int i8 = iArr[i7];
                    int i9 = iArr[i5];
                    int i10 = i5;
                    int[] iArr2 = ts0Var.p0;
                    int[] iArr3 = iArr;
                    if (!v(i8, i9, iArr2[i7], iArr2[i10])) {
                        us0.V(ts0Var, gs0Var, us0Var.L0);
                    }
                    boolean z2 = ts0Var instanceof m42;
                    if (z2) {
                        m42 m42Var = (m42) ts0Var;
                        if (m42Var.u0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(m42Var);
                        }
                        z = z2;
                        if (m42Var.u0 == i10) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(m42Var);
                        }
                    } else {
                        z = z2;
                    }
                    if (ts0Var instanceof n52) {
                        if (ts0Var instanceof bx) {
                            bx bxVar = (bx) ts0Var;
                            if (bxVar.U() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bxVar);
                            }
                            if (bxVar.U() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(bxVar);
                            }
                        } else {
                            n52 n52Var = (n52) ts0Var;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(n52Var);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(n52Var);
                        }
                    }
                    if (ts0Var.I.x == null && ts0Var.K.x == null && !z && !(ts0Var instanceof bx)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(ts0Var);
                    }
                    if (ts0Var.J.x == null && ts0Var.L.x == null && ts0Var.M.x == null && !z && !(ts0Var instanceof bx)) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(ts0Var);
                    }
                    i6++;
                    i3 = i7;
                    iArr = iArr3;
                    i5 = 1;
                }
                int[] iArr4 = iArr;
                int i11 = i3;
                ArrayList arrayList8 = new ArrayList();
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i12 = i11;
                    while (i12 < size3) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        g((m42) obj, i11, arrayList8, null);
                    }
                }
                if (arrayList3 != null) {
                    int size4 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        Object obj2 = arrayList3.get(i13);
                        i13++;
                        n52 n52Var2 = (n52) obj2;
                        zn5 zn5VarG = g(n52Var2, 0, arrayList8, null);
                        n52Var2.R(0, zn5VarG, arrayList8);
                        zn5VarG.y(arrayList8);
                    }
                }
                HashSet hashSet = us0Var.t(2).g;
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        g(((as0) it.next()).n, 0, arrayList8, null);
                    }
                }
                HashSet hashSet2 = us0Var.t(4).g;
                if (hashSet2 != null) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        g(((as0) it2.next()).n, 0, arrayList8, null);
                    }
                }
                HashSet hashSet3 = us0Var.t(7).g;
                if (hashSet3 != null) {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        g(((as0) it3.next()).n, 0, arrayList8, null);
                    }
                }
                if (arrayList6 != null) {
                    int size5 = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        Object obj3 = arrayList6.get(i14);
                        i14++;
                        g((ts0) obj3, 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size6) {
                        Object obj4 = arrayList4.get(i15);
                        i15++;
                        g((m42) obj4, 1, arrayList8, null);
                    }
                }
                if (arrayList5 != null) {
                    int size7 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        Object obj5 = arrayList5.get(i16);
                        i16++;
                        n52 n52Var3 = (n52) obj5;
                        zn5 zn5VarG2 = g(n52Var3, 1, arrayList8, null);
                        n52Var3.R(1, zn5VarG2, arrayList8);
                        zn5VarG2.y(arrayList8);
                    }
                }
                HashSet hashSet4 = us0Var.t(3).g;
                if (hashSet4 != null) {
                    Iterator it4 = hashSet4.iterator();
                    while (it4.hasNext()) {
                        g(((as0) it4.next()).n, 1, arrayList8, null);
                    }
                }
                HashSet hashSet5 = us0Var.t(6).g;
                if (hashSet5 != null) {
                    Iterator it5 = hashSet5.iterator();
                    while (it5.hasNext()) {
                        g(((as0) it5.next()).n, 1, arrayList8, null);
                    }
                }
                HashSet hashSet6 = us0Var.t(5).g;
                if (hashSet6 != null) {
                    Iterator it6 = hashSet6.iterator();
                    while (it6.hasNext()) {
                        g(((as0) it6.next()).n, 1, arrayList8, null);
                    }
                }
                HashSet hashSet7 = us0Var.t(7).g;
                if (hashSet7 != null) {
                    Iterator it7 = hashSet7.iterator();
                    while (it7.hasNext()) {
                        g(((as0) it7.next()).n, 1, arrayList8, null);
                    }
                }
                if (arrayList7 != null) {
                    int size8 = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size8) {
                        Object obj6 = arrayList7.get(i17);
                        i17++;
                        g((ts0) obj6, 1, arrayList8, null);
                    }
                }
                char c2 = 1;
                int i18 = 0;
                while (i18 < size2) {
                    ts0 ts0Var2 = (ts0) arrayList.get(i18);
                    int[] iArr5 = ts0Var2.p0;
                    if (iArr5[0] == 3 && iArr5[c2] == 3) {
                        int i19 = ts0Var2.n0;
                        int size9 = arrayList8.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size9) {
                                zn5Var5 = null;
                                break;
                            }
                            zn5Var5 = (zn5) arrayList8.get(i20);
                            if (i19 == zn5Var5.y) {
                                break;
                            }
                            i20++;
                        }
                        int i21 = ts0Var2.o0;
                        int size10 = arrayList8.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size10) {
                                zn5Var6 = null;
                                break;
                            }
                            zn5 zn5Var7 = (zn5) arrayList8.get(i22);
                            if (i21 == zn5Var7.y) {
                                zn5Var6 = zn5Var7;
                                break;
                            }
                            i22++;
                        }
                        if (zn5Var5 != null && zn5Var6 != null) {
                            zn5Var5.n(0, zn5Var6);
                            zn5Var6.r = 2;
                            arrayList8.remove(zn5Var5);
                        }
                    }
                    i18++;
                    c2 = 1;
                }
                if (arrayList8.size() > 1) {
                    if (iArr4[0] == 2) {
                        int size11 = arrayList8.size();
                        zn5Var = null;
                        int i23 = 0;
                        int i24 = 0;
                        while (i23 < size11) {
                            Object obj7 = arrayList8.get(i23);
                            i23++;
                            zn5 zn5Var8 = (zn5) obj7;
                            if (zn5Var8.r != 1 && (iR2 = zn5Var8.r(kv2Var, 0)) > i24) {
                                zn5Var = zn5Var8;
                                i24 = iR2;
                            }
                        }
                        c = 1;
                        if (zn5Var != null) {
                            us0Var.M(1);
                            us0Var.O(i24);
                        }
                        if (iArr4[c] == 2) {
                            size = arrayList8.size();
                            zn5Var3 = null;
                            i = 0;
                            i2 = 0;
                            while (i < size) {
                                Object obj8 = arrayList8.get(i);
                                i++;
                                zn5Var4 = (zn5) obj8;
                                if (zn5Var4.r != 0 && (iR = zn5Var4.r(kv2Var, 1)) > i2) {
                                    zn5Var3 = zn5Var4;
                                    i2 = iR;
                                }
                            }
                            if (zn5Var3 != null) {
                                us0Var.N(1);
                                us0Var.L(i2);
                                zn5Var2 = zn5Var3;
                            } else {
                                zn5Var2 = null;
                            }
                        } else {
                            zn5Var2 = null;
                        }
                        if (zn5Var == null || zn5Var2 != null) {
                        }
                    } else {
                        c = 1;
                    }
                    zn5Var = null;
                    if (iArr4[c] == 2) {
                        size = arrayList8.size();
                        zn5Var3 = null;
                        i = 0;
                        i2 = 0;
                        while (i < size) {
                            Object obj9 = arrayList8.get(i);
                            i++;
                            zn5Var4 = (zn5) obj9;
                            if (zn5Var4.r != 0) {
                                zn5Var3 = zn5Var4;
                                i2 = iR;
                            }
                        }
                        if (zn5Var3 != null) {
                            us0Var.N(1);
                            us0Var.L(i2);
                            zn5Var2 = zn5Var3;
                        } else {
                            zn5Var2 = null;
                        }
                    } else {
                        zn5Var2 = null;
                    }
                    return zn5Var == null ? true : true;
                }
                return false;
            }
            ts0 ts0Var3 = (ts0) arrayList.get(i4);
            int i25 = iArr[0];
            int i26 = iArr[1];
            int[] iArr6 = ts0Var3.p0;
            if (!v(i25, i26, iArr6[0], iArr6[1]) || (ts0Var3 instanceof fr1)) {
                return false;
            }
            i4++;
        }
    }

    public static boolean v(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bf A[EDGE_INSN: B:57:0x00bf->B:59:0x00c9 BREAK  A[LOOP:0: B:42:0x0095->B:54:0x00b5]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4 A[EDGE_INSN: B:58:0x00c4->B:59:0x00c9 BREAK  A[LOOP:0: B:42:0x0095->B:54:0x00b5]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00bb A[SYNTHETIC] */
    public static ld1 y(String str) throws ProtocolException {
        int i;
        int i2;
        Integer numValueOf;
        int iDigit;
        int i3;
        String strSubstring;
        int i4 = 0;
        boolean zP = ay4.P(str, "HTTP/1.", false);
        int i5 = 1;
        i14 i14Var = i14.a;
        i14 i14Var2 = i14.m;
        if (zP) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                i14Var = i14Var2;
            }
        } else if (ay4.P(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!ay4.P(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            i14Var = i14Var2;
        }
        int i6 = i + 3;
        if (str.length() < i6) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i, i6);
        int i7 = 10;
        a11.x(10);
        int length = strSubstring2.length();
        if (length != 0) {
            char cCharAt = strSubstring2.charAt(0);
            int i8 = -2147483647;
            if (cCharAt < '0') {
                if (length != 1) {
                    if (cCharAt != '+') {
                        if (cCharAt == '-') {
                            i8 = Integer.MIN_VALUE;
                        }
                        numValueOf = null;
                        break;
                    }
                    i2 = 0;
                    int i9 = -59652323;
                    while (true) {
                        if (i5 < length) {
                            if (i2 != 0) {
                                numValueOf = Integer.valueOf(-i4);
                                break;
                            }
                            numValueOf = Integer.valueOf(i4);
                            break;
                        }
                        iDigit = Character.digit((int) strSubstring2.charAt(i5), i7);
                        if (iDigit < 0 || ((i4 < i9 && (i9 != -59652323 || i4 < (i9 = i8 / 10))) || (i3 = i4 * 10) < i8 + iDigit)) {
                            numValueOf = null;
                            break;
                        }
                        i4 = i3 - iDigit;
                        i5++;
                        i7 = 10;
                    }
                }
                numValueOf = null;
                break;
            } else {
                i5 = 0;
            }
            i2 = i5;
            int i10 = -59652323;
            while (true) {
                if (i5 < length) {
                    if (i2 != 0) {
                        numValueOf = Integer.valueOf(-i4);
                        break;
                    }
                    numValueOf = Integer.valueOf(i4);
                    break;
                }
                iDigit = Character.digit((int) strSubstring2.charAt(i5), i7);
                if (iDigit < 0) {
                    i4 = i3 - iDigit;
                    i5++;
                    i7 = 10;
                }
                numValueOf = null;
                break;
            }
        }
        numValueOf = null;
        break;
        if (numValueOf == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numValueOf.intValue();
        if (str.length() <= i6) {
            strSubstring = "";
        } else {
            if (str.charAt(i6) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new ld1(i14Var, iIntValue, strSubstring);
    }
}
