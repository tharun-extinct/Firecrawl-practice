package defpackage;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class kd implements jp3 {
    public final List a;
    public final em2 b;
    public final hf c;
    public final CharSequence i;
    public final String j;
    public final List m;
    public final boolean p;
    public final ku1 q;
    public q70 s;
    public final k85 t;
    public final int u;
    public final j51 w;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:224:0x041e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0462  */
    /* JADX WARN: Code duplicated, block: B:252:0x049f  */
    /* JADX WARN: Code duplicated, block: B:253:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:255:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:256:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:259:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:260:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:262:0x04db  */
    /* JADX WARN: Code duplicated, block: B:263:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:265:0x0501  */
    /* JADX WARN: Code duplicated, block: B:268:0x0513  */
    /* JADX WARN: Code duplicated, block: B:270:0x051f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0526  */
    /* JADX WARN: Code duplicated, block: B:279:0x0535  */
    /* JADX WARN: Code duplicated, block: B:283:0x053f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0550  */
    /* JADX WARN: Code duplicated, block: B:295:0x058a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0590  */
    /* JADX WARN: Code duplicated, block: B:300:0x059e  */
    /* JADX WARN: Code duplicated, block: B:302:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:304:0x05ce A[LOOP:7: B:303:0x05cc->B:304:0x05ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:311:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:313:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:314:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:316:0x0603  */
    /* JADX WARN: Code duplicated, block: B:318:0x0617  */
    /* JADX WARN: Code duplicated, block: B:327:0x063b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0657  */
    /* JADX WARN: Code duplicated, block: B:334:0x0663  */
    /* JADX WARN: Code duplicated, block: B:336:0x0669  */
    /* JADX WARN: Code duplicated, block: B:341:0x0677  */
    /* JADX WARN: Code duplicated, block: B:394:0x079a  */
    /* JADX WARN: Code duplicated, block: B:396:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:398:0x07af  */
    /* JADX WARN: Code duplicated, block: B:400:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:405:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:418:0x0809  */
    /* JADX WARN: Code duplicated, block: B:420:0x081a  */
    /* JADX WARN: Code duplicated, block: B:421:0x081e  */
    /* JADX WARN: Code duplicated, block: B:423:0x0829  */
    /* JADX WARN: Code duplicated, block: B:426:0x0833 A[LOOP:5: B:425:0x0831->B:426:0x0833, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:429:0x0844  */
    /* JADX WARN: Code duplicated, block: B:431:0x084f  */
    /* JADX WARN: Code duplicated, block: B:433:0x085d A[LOOP:6: B:432:0x085b->B:433:0x085d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:436:0x086a  */
    /* JADX WARN: Code duplicated, block: B:438:0x086e  */
    /* JADX WARN: Code duplicated, block: B:441:0x087e  */
    /* JADX WARN: Code duplicated, block: B:452:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x062a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:431:0x084f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kd] */
    public kd(String str, k85 k85Var, List list, List list2, ku1 ku1Var, j51 j51Var, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        jd jdVar;
        Typeface typefaceF;
        CharSequence charSequence;
        int length;
        int i2;
        o65 o65Var;
        jd jdVar2;
        ArrayList arrayList;
        int size;
        int i3;
        lu1 lu1Var;
        ju4 ju4Var;
        bb4 bb4Var;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size4;
        ju4 ju4VarR;
        int i9;
        ArrayList arrayList2;
        ju4 ju4Var2;
        int i10;
        int i11;
        int i12;
        int size5;
        int i13;
        boolean z2;
        o65 o65Var2;
        int size6;
        int i14;
        kd kdVar;
        bj bjVar;
        int i15;
        long j;
        long jY;
        int size7;
        int i16;
        bj bjVar2;
        yi yiVar;
        int i17;
        bj bjVar3;
        Object obj2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        bj bjVar4;
        Object obj3;
        ju4 ju4Var3;
        long j2;
        int i23;
        long j3;
        long jY2;
        float fR;
        long jY3;
        float fR2;
        jt3 jt3Var;
        CharSequence charSequence2;
        jt3 jt3Var2;
        ?? obj4 = new Object();
        obj4.j = str;
        obj4.t = k85Var;
        obj4.a = list;
        obj4.m = list2;
        obj4.q = ku1Var;
        obj4.w = j51Var;
        float fY = j51Var.y();
        hf hfVar = new hf(1);
        ((TextPaint) hfVar).density = fY;
        hfVar.y = l45.y;
        hfVar.r = (byte) 3;
        hfVar.n = ym4.n;
        obj4.c = hfVar;
        boolean zW = v13.w(k85Var);
        ju4 ju4Var4 = k85Var.g;
        lp3 lp3Var = k85Var.y;
        byte b = 0;
        if (zW) {
            y22 y22Var = th1.g;
            y22 y22Var2 = th1.g;
            bw4 bw4VarU = (bw4) y22Var2.t;
            if (bw4VarU == null) {
                if (ph1.n()) {
                    bw4VarU = y22Var2.u();
                    y22Var2.t = bw4VarU;
                } else {
                    bw4VarU = eb6.g;
                }
            }
            zBooleanValue = ((Boolean) bw4VarU.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj4.p = zBooleanValue;
        int i24 = lp3Var.y;
        tx2 tx2Var = ju4Var4.m;
        if (i24 == 4) {
            i = 2;
        } else if (i24 == 5) {
            i = 3;
        } else if (i24 == 1) {
            i = 0;
        } else if (i24 == 2) {
            i = 1;
        } else {
            if (i24 != 3 && i24 != 0) {
                l0.z("Invalid TextDirection.");
                throw null;
            }
            int iV = zx5.v((tx2Var == null || (locale = ((sx2) tx2Var.j.get(0)).g) == null) ? Locale.getDefault() : locale);
            if (iV == 0 || iV != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj4.u = i;
        obj4.z = -1;
        jd jdVar3 = new jd(obj4, b);
        s75 s75Var = lp3Var.t;
        s75Var = s75Var == null ? s75.r : s75Var;
        hfVar.setFlags(s75Var.y ? hfVar.getFlags() | 128 : hfVar.getFlags() & (-129));
        int i25 = s75Var.g;
        if (i25 == 1) {
            hfVar.setFlags(hfVar.getFlags() | 64);
            hfVar.setHinting(0);
        } else if (i25 == 2) {
            hfVar.getFlags();
            hfVar.setHinting(1);
        } else if (i25 == 3) {
            hfVar.getFlags();
            hfVar.setHinting(0);
        } else {
            hfVar.getFlags();
        }
        int size8 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i26);
            if (((bj) obj).g instanceof ju4) {
                break;
            } else {
                i26++;
            }
        }
        boolean z3 = obj != null;
        long j4 = ju4Var4.y;
        qv1 qv1Var = ju4Var4.r;
        lv1 lv1Var = ju4Var4.n;
        String str2 = ju4Var4.l;
        tx2 tx2Var2 = ju4Var4.m;
        m65 m65Var = ju4Var4.g;
        n65 n65Var = ju4Var4.a;
        long j5 = ju4Var4.j;
        long jY4 = n85.y(j4);
        boolean z4 = z3;
        if (o85.g(jY4, 4294967296L)) {
            hfVar.setTextSize(j51Var.j0(j4));
        } else if (o85.g(jY4, 8589934592L)) {
            hfVar.setTextSize(n85.r(j4) * hfVar.getTextSize());
        }
        lu1 lu1Var2 = ju4Var4.x;
        if (lu1Var2 == null && lv1Var == null && qv1Var == null) {
            jdVar = jdVar3;
        } else {
            qv1 qv1Var2 = qv1Var == null ? qv1.z : qv1Var;
            int i27 = lv1Var != null ? lv1Var.g : 0;
            mv1 mv1Var = ju4Var4.v;
            int i28 = mv1Var != null ? mv1Var.g : 65535;
            jdVar = jdVar3;
            kd kdVar2 = (kd) jdVar.t;
            kf5 kf5VarY = ((mu1) kdVar2.q).y(lu1Var2, qv1Var2, i27, i28);
            if (kf5VarY instanceof jf5) {
                Object obj5 = ((jf5) kf5VarY).j;
                obj5.getClass();
                typefaceF = (Typeface) obj5;
            } else {
                q70 q70Var = new q70(kf5VarY, kdVar2.s);
                kdVar2.s = q70Var;
                typefaceF = q70Var.f();
            }
            hfVar.setTypeface(typefaceF);
        }
        if (tx2Var2 != null) {
            tx2 tx2Var3 = tx2.a;
            if (!tx2Var2.equals(bt3.g.u())) {
                iz5.r(hfVar, tx2Var2);
            }
        }
        if (str2 != null && !str2.equals("")) {
            hfVar.setFontFeatureSettings(str2);
        }
        if (n65Var != null && !n65Var.equals(n65.r)) {
            hfVar.setTextScaleX(hfVar.getTextScaleX() * n65Var.g);
            hfVar.setTextSkewX(hfVar.getTextSkewX() + n65Var.y);
        }
        hfVar.n(m65Var.y());
        hfVar.r(m65Var.r(), 9205357640488583168L, m65Var.g());
        hfVar.x(ju4Var4.c);
        hfVar.l(ju4Var4.w);
        hfVar.v(ju4Var4.b);
        if (o85.g(n85.y(j5), 4294967296L) && n85.r(j5) != 0.0f) {
            float textScaleX = hfVar.getTextScaleX() * hfVar.getTextSize();
            float fJ0 = j51Var.j0(j5);
            if (textScaleX != 0.0f) {
                hfVar.setLetterSpacing(fJ0 / textScaleX);
            }
        } else if (o85.g(n85.y(j5), 8589934592L)) {
            hfVar.setLetterSpacing(n85.r(j5));
        }
        long j6 = ju4Var4.q;
        ry ryVar = ju4Var4.t;
        boolean z5 = z4 && o85.g(n85.y(j5), 4294967296L) && n85.r(j5) != 0.0f;
        long j7 = jj0.j;
        boolean z6 = (tf5.g(j6, j7) || tf5.g(j6, jj0.l)) ? false : true;
        boolean z7 = (ryVar == null || Float.compare(ryVar.g, 0.0f) == 0) ? false : true;
        ju4 ju4Var5 = (z5 || z6 || z7) ? new ju4(0L, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, z5 ? j5 : n85.r, z7 ? ryVar : null, (n65) null, (tx2) null, z6 ? j6 : j7, (l45) null, (ym4) null, 63103) : null;
        List list3 = obj4.a;
        if (ju4Var5 != null) {
            int size9 = list3.size() + 1;
            ArrayList arrayList3 = new ArrayList(size9);
            int i29 = 0;
            while (i29 < size9) {
                arrayList3.add(i29 == 0 ? new bj(0, obj4.j.length(), ju4Var5) : (bj) obj4.a.get(i29 - 1));
                i29++;
            }
            list3 = arrayList3;
        }
        String str3 = obj4.j;
        float textSize = obj4.c.getTextSize();
        k85 k85Var2 = obj4.t;
        List list4 = obj4.m;
        j51 j51Var2 = obj4.w;
        boolean z8 = obj4.p;
        String str4 = obj4.j;
        if (obj4.z == -1) {
            obj4.z = (str4.length() > 512 || tx4.R(str4, '\n')) ? 1 : 0;
        }
        hd hdVar = id.g;
        if (z8 && ph1.n()) {
            zt3 zt3Var = k85Var2.r;
            di1 di1Var = (zt3Var == null || (jt3Var2 = zt3Var.y) == null) ? null : new di1(jt3Var2.y);
            CharSequence charSequenceL = ph1.g().l(0, str3.length(), (di1Var != null && di1Var.g == 2) ? 1 : 0, str3);
            charSequenceL.getClass();
            charSequence = charSequenceL;
        } else {
            charSequence = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !yf2.p(k85Var2.y.n, o65.r) || (k85Var2.y.r & 1095216660480L) != 0) {
            kdVar = obj4;
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            ju4 ju4Var6 = k85Var2.g;
            lp3 lp3Var2 = k85Var2.y;
            if (yf2.p(ju4Var6.w, l45.r)) {
                spannableString.setSpan(id.g, 0, str3.length(), 33);
            }
            zt3 zt3Var2 = k85Var2.r;
            if (((zt3Var2 == null || (jt3Var = zt3Var2.y) == null) ? false : jt3Var.g) && lp3Var2.x == null) {
                float fC = xq2.C(lp3Var2.r, textSize, j51Var2);
                if (!Float.isNaN(fC)) {
                    spannableString.setSpan(new wu2(fC), 0, spannableString.length(), 33);
                }
            } else {
                av2 av2Var = lp3Var2.x;
                av2Var = av2Var == null ? av2.n : av2Var;
                float fC2 = xq2.C(lp3Var2.r, textSize, j51Var2);
                if (!Float.isNaN(fC2)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            l0.s("Char sequence is empty.");
                            throw null;
                        }
                        if (spannableString.charAt(spannableString.length() - 1) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i30 = length;
                    int i31 = av2Var.y;
                    i2 = 0;
                    spannableString.setSpan(new bv2(fC2, i30, (i31 & 1) > 0, (i31 & 16) > 0, av2Var.g, av2Var.r), 0, spannableString.length(), 33);
                }
                o65Var = lp3Var2.n;
                if (o65Var != null) {
                    j2 = o65Var.g;
                    i23 = i2;
                    j3 = o65Var.y;
                    jdVar2 = jdVar;
                    if ((n85.g(j2, kq2.G(i23)) || !n85.g(j3, kq2.G(i23))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jY2 = n85.y(j2);
                        if (o85.g(jY2, 4294967296L)) {
                            fR = j51Var2.j0(j2);
                        } else if (o85.g(jY2, 8589934592L)) {
                            fR = n85.r(j2) * textSize;
                        } else {
                            fR = 0.0f;
                        }
                        jY3 = n85.y(j3);
                        if (o85.g(jY3, 4294967296L)) {
                            fR2 = j51Var2.j0(j3);
                        } else if (o85.g(jY3, 8589934592L)) {
                            fR2 = n85.r(j3) * textSize;
                        } else {
                            fR2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fR), (int) Math.ceil(fR2)), 0, spannableString.length(), 33);
                    }
                    arrayList = new ArrayList(list3.size());
                    size = list3.size();
                    for (i3 = 0; i3 < size; i3++) {
                        bjVar4 = (bj) list3.get(i3);
                        obj3 = bjVar4.g;
                        if (obj3 instanceof ju4) {
                            ju4Var3 = (ju4) obj3;
                            if (ju4Var3.x == null || ju4Var3.n != null || ju4Var3.r != null || ((ju4) obj3).v != null) {
                                arrayList.add(bjVar4);
                            }
                        }
                    }
                    lu1Var = ju4Var6.x;
                    if (lu1Var != null && ju4Var6.n == null && ju4Var6.r == null && ju4Var6.v == null) {
                        ju4Var = null;
                    } else {
                        ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
                    }
                    bb4Var = new bb4(spannableString, jdVar2, (byte) 7);
                    if (arrayList.size() <= 1) {
                        size2 = arrayList.size();
                        i4 = size2 * 2;
                        iArr = new int[i4];
                        size3 = arrayList.size();
                        for (i5 = 0; i5 < size3; i5++) {
                            bj bjVar5 = (bj) arrayList.get(i5);
                            iArr[i5] = bjVar5.y;
                            iArr[i5 + size2] = bjVar5.r;
                        }
                        if (i4 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i4 != 0) {
                            l0.s("Array is empty.");
                            throw null;
                        }
                        i6 = iArr[0];
                        i7 = 0;
                        while (i7 < i4) {
                            i8 = iArr[i7];
                            if (i8 == i6) {
                                arrayList2 = arrayList;
                                ju4Var2 = ju4Var;
                                i10 = i7;
                            } else {
                                size4 = arrayList.size();
                                ju4VarR = ju4Var;
                                i9 = 0;
                                while (i9 < size4) {
                                    ArrayList arrayList4 = arrayList;
                                    bj bjVar6 = (bj) arrayList.get(i9);
                                    ju4 ju4Var7 = ju4Var;
                                    i11 = bjVar6.y;
                                    int i32 = i7;
                                    i12 = bjVar6.r;
                                    if (i11 == i12 && dj.y(i6, i8, i11, i12)) {
                                        ju4 ju4Var8 = (ju4) bjVar6.g;
                                        ju4VarR = ju4VarR != null ? ju4VarR.r(ju4Var8) : ju4Var8;
                                    }
                                    i9++;
                                    arrayList = arrayList4;
                                    ju4Var = ju4Var7;
                                    i7 = i32;
                                }
                                arrayList2 = arrayList;
                                ju4Var2 = ju4Var;
                                i10 = i7;
                                if (ju4VarR != null) {
                                    bb4Var.x(ju4VarR, Integer.valueOf(i6), Integer.valueOf(i8));
                                }
                                i6 = i8;
                            }
                            i7 = i10 + 1;
                            arrayList = arrayList2;
                            ju4Var = ju4Var2;
                        }
                    } else if (!arrayList.isEmpty()) {
                        ju4 ju4Var9 = (ju4) ((bj) arrayList.get(0)).g;
                        bb4Var.x(ju4Var != null ? ju4Var.r(ju4Var9) : ju4Var9, Integer.valueOf(((bj) arrayList.get(0)).y), Integer.valueOf(((bj) arrayList.get(0)).r));
                    }
                    size5 = list3.size();
                    i13 = 0;
                    z2 = false;
                    while (i13 < size5) {
                        bjVar3 = (bj) list3.get(i13);
                        obj2 = bjVar3.g;
                        if (obj2 instanceof ju4) {
                            i20 = bjVar3.y;
                            int i33 = bjVar3.r;
                            if (i20 >= 0 || i20 >= spannableString.length() || i33 <= i20 || i33 > spannableString.length()) {
                                i18 = size5;
                                i19 = i13;
                                lp3Var2 = lp3Var2;
                            } else {
                                ju4 ju4Var10 = (ju4) obj2;
                                long j8 = ju4Var10.j;
                                ry ryVar2 = ju4Var10.t;
                                m65 m65Var2 = ju4Var10.g;
                                if (ryVar2 != null) {
                                    spannableString.setSpan(new sy(ryVar2.g), i20, i33, 33);
                                }
                                i18 = size5;
                                i19 = i13;
                                xq2.F(spannableString, m65Var2.y(), i20, i33);
                                z60 z60VarR = m65Var2.r();
                                float fG = m65Var2.g();
                                if (z60VarR != null) {
                                    if (z60VarR instanceof cu4) {
                                        xq2.F(spannableString, ((cu4) z60VarR).g, i20, i33);
                                    } else {
                                        spannableString.setSpan(new xm4((a70) z60VarR, fG), i20, i33, 33);
                                    }
                                }
                                l45 l45Var = ju4Var10.w;
                                if (l45Var != null) {
                                    int i34 = l45Var.g;
                                    m45 m45Var = new m45((i34 | 1) == i34, (i34 | 2) == i34);
                                    i21 = 33;
                                    spannableString.setSpan(m45Var, i20, i33, 33);
                                } else {
                                    i21 = 33;
                                }
                                xq2.G(spannableString, ju4Var10.y, j51Var2, i20, i33);
                                String str5 = ju4Var10.l;
                                if (str5 != null) {
                                    spannableString.setSpan(new pu1(str5, (byte) 0), i20, i33, i21);
                                }
                                n65 n65Var2 = ju4Var10.a;
                                if (n65Var2 != null) {
                                    spannableString.setSpan(new ScaleXSpan(n65Var2.g), i20, i33, i21);
                                    spannableString.setSpan(new tq4(n65Var2.y), i20, i33, i21);
                                }
                                tx2 tx2Var4 = ju4Var10.m;
                                if (tx2Var4 != null) {
                                    spannableString.setSpan(iz5.y(tx2Var4), i20, i33, i21);
                                }
                                long j9 = ju4Var10.q;
                                if (j9 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(ra.U(j9)), i20, i33, i21);
                                }
                                ym4 ym4Var = ju4Var10.c;
                                if (ym4Var != null) {
                                    long j10 = ym4Var.y;
                                    int iU = ra.U(ym4Var.g);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                    float f = ym4Var.r;
                                    bn4 bn4Var = new bn4(iU, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                    i22 = 33;
                                    spannableString.setSpan(bn4Var, i20, i33, 33);
                                } else {
                                    i22 = 33;
                                }
                                yd1 yd1Var = ju4Var10.b;
                                if (yd1Var != null) {
                                    spannableString.setSpan(new zd1(yd1Var), i20, i33, i22);
                                }
                                if (o85.g(n85.y(j8), 4294967296L) || o85.g(n85.y(j8), 8589934592L)) {
                                    z2 = true;
                                }
                            }
                        } else {
                            i18 = size5;
                            i19 = i13;
                            lp3Var2 = lp3Var2;
                        }
                        i13 = i19 + 1;
                        size5 = i18;
                        lp3Var2 = lp3Var2;
                    }
                    lp3 lp3Var3 = lp3Var2;
                    if (z2) {
                        size7 = list3.size();
                        for (i16 = 0; i16 < size7; i16++) {
                            bjVar2 = (bj) list3.get(i16);
                            yiVar = (yi) bjVar2.g;
                            if (yiVar instanceof ju4) {
                                i17 = bjVar2.y;
                                int i35 = bjVar2.r;
                                if (i17 < 0 && i17 < spannableString.length() && i35 > i17 && i35 <= spannableString.length()) {
                                    long j11 = ((ju4) yiVar).j;
                                    long jY5 = n85.y(j11);
                                    Object qt2Var = o85.g(jY5, 4294967296L) ? new qt2(j51Var2.j0(j11)) : o85.g(jY5, 8589934592L) ? new pt2(n85.r(j11)) : null;
                                    if (qt2Var != null) {
                                        spannableString.setSpan(qt2Var, i17, i35, 33);
                                    }
                                }
                            }
                        }
                    }
                    o65Var2 = lp3Var3.n;
                    if (o65Var2 != null) {
                        j = o65Var2.g;
                        jY = n85.y(j);
                        if (o85.g(jY, 4294967296L)) {
                            j51Var2.j0(j);
                        } else if (o85.g(jY, 8589934592L)) {
                            n85.r(j);
                        }
                    }
                    size6 = list3.size();
                    for (i14 = 0; i14 < size6; i14++) {
                        Object obj6 = ((bj) list3.get(i14)).g;
                    }
                    if (list4.size() > 0) {
                        bjVar = (bj) list4.get(0);
                        if (bjVar.g == null) {
                            uo1.B();
                            throw null;
                        }
                        for (Object obj7 : spannableString.getSpans(bjVar.y, bjVar.r, gf5.class)) {
                            spannableString.removeSpan((gf5) obj7);
                        }
                        throw null;
                    }
                    kdVar = this;
                    charSequence2 = spannableString;
                } else {
                    jdVar2 = jdVar;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i3 < size) {
                    bjVar4 = (bj) list3.get(i3);
                    obj3 = bjVar4.g;
                    if (obj3 instanceof ju4) {
                        ju4Var3 = (ju4) obj3;
                        if (ju4Var3.x == null) {
                            arrayList.add(bjVar4);
                        } else {
                            arrayList.add(bjVar4);
                        }
                    }
                }
                lu1Var = ju4Var6.x;
                if (lu1Var != null) {
                    ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
                } else {
                    ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
                }
                bb4Var = new bb4(spannableString, jdVar2, (byte) 7);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    while (i5 < size3) {
                        bj bjVar7 = (bj) arrayList.get(i5);
                        iArr[i5] = bjVar7.y;
                        iArr[i5 + size2] = bjVar7.r;
                    }
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        l0.s("Array is empty.");
                        throw null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            ju4Var2 = ju4Var;
                            i10 = i7;
                        } else {
                            size4 = arrayList.size();
                            ju4VarR = ju4Var;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList5 = arrayList;
                                bj bjVar8 = (bj) arrayList.get(i9);
                                ju4 ju4Var11 = ju4Var;
                                i11 = bjVar8.y;
                                int i36 = i7;
                                i12 = bjVar8.r;
                                if (i11 == i12) {
                                }
                                i9++;
                                arrayList = arrayList5;
                                ju4Var = ju4Var11;
                                i7 = i36;
                            }
                            arrayList2 = arrayList;
                            ju4Var2 = ju4Var;
                            i10 = i7;
                            if (ju4VarR != null) {
                                bb4Var.x(ju4VarR, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7 = i10 + 1;
                        arrayList = arrayList2;
                        ju4Var = ju4Var2;
                    }
                } else if (!arrayList.isEmpty()) {
                    ju4 ju4Var12 = (ju4) ((bj) arrayList.get(0)).g;
                    bb4Var.x(ju4Var != null ? ju4Var.r(ju4Var12) : ju4Var12, Integer.valueOf(((bj) arrayList.get(0)).y), Integer.valueOf(((bj) arrayList.get(0)).r));
                }
                size5 = list3.size();
                i13 = 0;
                z2 = false;
                while (i13 < size5) {
                    bjVar3 = (bj) list3.get(i13);
                    obj2 = bjVar3.g;
                    if (obj2 instanceof ju4) {
                        i20 = bjVar3.y;
                        int i37 = bjVar3.r;
                        if (i20 >= 0) {
                            i18 = size5;
                            i19 = i13;
                            lp3Var2 = lp3Var2;
                        } else {
                            i18 = size5;
                            i19 = i13;
                            lp3Var2 = lp3Var2;
                        }
                    } else {
                        i18 = size5;
                        i19 = i13;
                        lp3Var2 = lp3Var2;
                    }
                    i13 = i19 + 1;
                    size5 = i18;
                    lp3Var2 = lp3Var2;
                }
                lp3 lp3Var4 = lp3Var2;
                if (z2) {
                    size7 = list3.size();
                    while (i16 < size7) {
                        bjVar2 = (bj) list3.get(i16);
                        yiVar = (yi) bjVar2.g;
                        if (yiVar instanceof ju4) {
                            i17 = bjVar2.y;
                            int i38 = bjVar2.r;
                            if (i17 < 0) {
                            }
                        }
                    }
                }
                o65Var2 = lp3Var4.n;
                if (o65Var2 != null) {
                    j = o65Var2.g;
                    jY = n85.y(j);
                    if (o85.g(jY, 4294967296L)) {
                        j51Var2.j0(j);
                    } else if (o85.g(jY, 8589934592L)) {
                        n85.r(j);
                    }
                }
                size6 = list3.size();
                while (i14 < size6) {
                    Object obj8 = ((bj) list3.get(i14)).g;
                }
                if (list4.size() > 0) {
                    bjVar = (bj) list4.get(0);
                    if (bjVar.g == null) {
                        uo1.B();
                        throw null;
                    }
                    while (i15 < r1) {
                        spannableString.removeSpan((gf5) obj7);
                    }
                    throw null;
                }
                kdVar = this;
                charSequence2 = spannableString;
            }
            i2 = 0;
            o65Var = lp3Var2.n;
            if (o65Var != null) {
                j2 = o65Var.g;
                i23 = i2;
                j3 = o65Var.y;
                jdVar2 = jdVar;
                if (n85.g(j2, kq2.G(i23))) {
                    jY2 = n85.y(j2);
                    if (o85.g(jY2, 4294967296L)) {
                        fR = j51Var2.j0(j2);
                    } else if (o85.g(jY2, 8589934592L)) {
                        fR = n85.r(j2) * textSize;
                    } else {
                        fR = 0.0f;
                    }
                    jY3 = n85.y(j3);
                    if (o85.g(jY3, 4294967296L)) {
                        fR2 = j51Var2.j0(j3);
                    } else if (o85.g(jY3, 8589934592L)) {
                        fR2 = n85.r(j3) * textSize;
                    } else {
                        fR2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fR), (int) Math.ceil(fR2)), 0, spannableString.length(), 33);
                } else {
                    jY2 = n85.y(j2);
                    if (o85.g(jY2, 4294967296L)) {
                        fR = j51Var2.j0(j2);
                    } else if (o85.g(jY2, 8589934592L)) {
                        fR = n85.r(j2) * textSize;
                    } else {
                        fR = 0.0f;
                    }
                    jY3 = n85.y(j3);
                    if (o85.g(jY3, 4294967296L)) {
                        fR2 = j51Var2.j0(j3);
                    } else if (o85.g(jY3, 8589934592L)) {
                        fR2 = n85.r(j3) * textSize;
                    } else {
                        fR2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fR), (int) Math.ceil(fR2)), 0, spannableString.length(), 33);
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i3 < size) {
                    bjVar4 = (bj) list3.get(i3);
                    obj3 = bjVar4.g;
                    if (obj3 instanceof ju4) {
                        ju4Var3 = (ju4) obj3;
                        if (ju4Var3.x == null) {
                            arrayList.add(bjVar4);
                        } else {
                            arrayList.add(bjVar4);
                        }
                    }
                }
                lu1Var = ju4Var6.x;
                if (lu1Var != null) {
                    ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
                } else {
                    ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
                }
                bb4Var = new bb4(spannableString, jdVar2, (byte) 7);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    while (i5 < size3) {
                        bj bjVar9 = (bj) arrayList.get(i5);
                        iArr[i5] = bjVar9.y;
                        iArr[i5 + size2] = bjVar9.r;
                    }
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        l0.s("Array is empty.");
                        throw null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            ju4Var2 = ju4Var;
                            i10 = i7;
                        } else {
                            size4 = arrayList.size();
                            ju4VarR = ju4Var;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList6 = arrayList;
                                bj bjVar10 = (bj) arrayList.get(i9);
                                ju4 ju4Var13 = ju4Var;
                                i11 = bjVar10.y;
                                int i39 = i7;
                                i12 = bjVar10.r;
                                if (i11 == i12) {
                                }
                                i9++;
                                arrayList = arrayList6;
                                ju4Var = ju4Var13;
                                i7 = i39;
                            }
                            arrayList2 = arrayList;
                            ju4Var2 = ju4Var;
                            i10 = i7;
                            if (ju4VarR != null) {
                                bb4Var.x(ju4VarR, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7 = i10 + 1;
                        arrayList = arrayList2;
                        ju4Var = ju4Var2;
                    }
                } else if (!arrayList.isEmpty()) {
                    ju4 ju4Var14 = (ju4) ((bj) arrayList.get(0)).g;
                    bb4Var.x(ju4Var != null ? ju4Var.r(ju4Var14) : ju4Var14, Integer.valueOf(((bj) arrayList.get(0)).y), Integer.valueOf(((bj) arrayList.get(0)).r));
                }
                size5 = list3.size();
                i13 = 0;
                z2 = false;
                while (i13 < size5) {
                    bjVar3 = (bj) list3.get(i13);
                    obj2 = bjVar3.g;
                    if (obj2 instanceof ju4) {
                        i20 = bjVar3.y;
                        int i310 = bjVar3.r;
                        if (i20 >= 0) {
                            i18 = size5;
                            i19 = i13;
                            lp3Var2 = lp3Var2;
                        } else {
                            i18 = size5;
                            i19 = i13;
                            lp3Var2 = lp3Var2;
                        }
                    } else {
                        i18 = size5;
                        i19 = i13;
                        lp3Var2 = lp3Var2;
                    }
                    i13 = i19 + 1;
                    size5 = i18;
                    lp3Var2 = lp3Var2;
                }
                lp3 lp3Var5 = lp3Var2;
                if (z2) {
                    size7 = list3.size();
                    while (i16 < size7) {
                        bjVar2 = (bj) list3.get(i16);
                        yiVar = (yi) bjVar2.g;
                        if (yiVar instanceof ju4) {
                            i17 = bjVar2.y;
                            int i311 = bjVar2.r;
                            if (i17 < 0) {
                            }
                        }
                    }
                }
                o65Var2 = lp3Var5.n;
                if (o65Var2 != null) {
                    j = o65Var2.g;
                    jY = n85.y(j);
                    if (o85.g(jY, 4294967296L)) {
                        j51Var2.j0(j);
                    } else if (o85.g(jY, 8589934592L)) {
                        n85.r(j);
                    }
                }
                size6 = list3.size();
                while (i14 < size6) {
                    Object obj9 = ((bj) list3.get(i14)).g;
                }
                if (list4.size() > 0) {
                    bjVar = (bj) list4.get(0);
                    if (bjVar.g == null) {
                        uo1.B();
                        throw null;
                    }
                    while (i15 < r1) {
                        spannableString.removeSpan((gf5) obj7);
                    }
                    throw null;
                }
                kdVar = this;
                charSequence2 = spannableString;
            } else {
                jdVar2 = jdVar;
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i3 < size) {
                bjVar4 = (bj) list3.get(i3);
                obj3 = bjVar4.g;
                if (obj3 instanceof ju4) {
                    ju4Var3 = (ju4) obj3;
                    if (ju4Var3.x == null) {
                        arrayList.add(bjVar4);
                    } else {
                        arrayList.add(bjVar4);
                    }
                }
            }
            lu1Var = ju4Var6.x;
            if (lu1Var != null) {
                ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
            } else {
                ju4Var = new ju4(0L, 0L, ju4Var6.r, ju4Var6.n, ju4Var6.v, lu1Var, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65475);
            }
            bb4Var = new bb4(spannableString, jdVar2, (byte) 7);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                while (i5 < size3) {
                    bj bjVar11 = (bj) arrayList.get(i5);
                    iArr[i5] = bjVar11.y;
                    iArr[i5 + size2] = bjVar11.r;
                }
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    l0.s("Array is empty.");
                    throw null;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        ju4Var2 = ju4Var;
                        i10 = i7;
                    } else {
                        size4 = arrayList.size();
                        ju4VarR = ju4Var;
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList7 = arrayList;
                            bj bjVar12 = (bj) arrayList.get(i9);
                            ju4 ju4Var15 = ju4Var;
                            i11 = bjVar12.y;
                            int i312 = i7;
                            i12 = bjVar12.r;
                            if (i11 == i12) {
                            }
                            i9++;
                            arrayList = arrayList7;
                            ju4Var = ju4Var15;
                            i7 = i312;
                        }
                        arrayList2 = arrayList;
                        ju4Var2 = ju4Var;
                        i10 = i7;
                        if (ju4VarR != null) {
                            bb4Var.x(ju4VarR, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7 = i10 + 1;
                    arrayList = arrayList2;
                    ju4Var = ju4Var2;
                }
            } else if (!arrayList.isEmpty()) {
                ju4 ju4Var16 = (ju4) ((bj) arrayList.get(0)).g;
                bb4Var.x(ju4Var != null ? ju4Var.r(ju4Var16) : ju4Var16, Integer.valueOf(((bj) arrayList.get(0)).y), Integer.valueOf(((bj) arrayList.get(0)).r));
            }
            size5 = list3.size();
            i13 = 0;
            z2 = false;
            while (i13 < size5) {
                bjVar3 = (bj) list3.get(i13);
                obj2 = bjVar3.g;
                if (obj2 instanceof ju4) {
                    i20 = bjVar3.y;
                    int i313 = bjVar3.r;
                    if (i20 >= 0) {
                        i18 = size5;
                        i19 = i13;
                        lp3Var2 = lp3Var2;
                    } else {
                        i18 = size5;
                        i19 = i13;
                        lp3Var2 = lp3Var2;
                    }
                } else {
                    i18 = size5;
                    i19 = i13;
                    lp3Var2 = lp3Var2;
                }
                i13 = i19 + 1;
                size5 = i18;
                lp3Var2 = lp3Var2;
            }
            lp3 lp3Var6 = lp3Var2;
            if (z2) {
                size7 = list3.size();
                while (i16 < size7) {
                    bjVar2 = (bj) list3.get(i16);
                    yiVar = (yi) bjVar2.g;
                    if (yiVar instanceof ju4) {
                        i17 = bjVar2.y;
                        int i314 = bjVar2.r;
                        if (i17 < 0) {
                        }
                    }
                }
            }
            o65Var2 = lp3Var6.n;
            if (o65Var2 != null) {
                j = o65Var2.g;
                jY = n85.y(j);
                if (o85.g(jY, 4294967296L)) {
                    j51Var2.j0(j);
                } else if (o85.g(jY, 8589934592L)) {
                    n85.r(j);
                }
            }
            size6 = list3.size();
            while (i14 < size6) {
                Object obj10 = ((bj) list3.get(i14)).g;
            }
            if (list4.size() > 0) {
                bjVar = (bj) list4.get(0);
                if (bjVar.g == null) {
                    uo1.B();
                    throw null;
                }
                while (i15 < r1) {
                    spannableString.removeSpan((gf5) obj7);
                }
                throw null;
            }
            kdVar = this;
            charSequence2 = spannableString;
        }
        kdVar = obj4;
        charSequence2 = charSequence;
        kdVar.i = charSequence2;
        kdVar.b = new em2(charSequence2, kdVar.c, kdVar.u);
    }

    @Override // defpackage.jp3
    public final float g() {
        em2 em2Var = this.b;
        float f = em2Var.v;
        TextPaint textPaint = em2Var.y;
        if (!Float.isNaN(f)) {
            return em2Var.v;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = em2Var.g;
        lineInstance.setText(new nd0(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, pw5.j);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new me2(i, next, 1));
            } else {
                me2 me2Var = (me2) priorityQueue.peek();
                if (me2Var != null && me2Var.t - me2Var.j < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new me2(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                uo1.b();
                return 0.0f;
            }
            me2 me2Var2 = (me2) it.next();
            desiredWidth = Layout.getDesiredWidth(em2Var.y(), me2Var2.j, me2Var2.t, textPaint);
            while (it.hasNext()) {
                me2 me2Var3 = (me2) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(em2Var.y(), me2Var3.j, me2Var3.t, textPaint));
            }
        }
        em2Var.v = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.jp3
    public final float r() {
        return this.b.r();
    }

    @Override // defpackage.jp3
    public final boolean y() {
        q70 q70Var = this.s;
        if (q70Var != null ? q70Var.k() : false) {
            return true;
        }
        if (!this.p && v13.w(this.t)) {
            y22 y22Var = th1.g;
            y22 y22Var2 = th1.g;
            bw4 bw4VarU = (bw4) y22Var2.t;
            if (bw4VarU == null) {
                if (ph1.n()) {
                    bw4VarU = y22Var2.u();
                    y22Var2.t = bw4VarU;
                } else {
                    bw4VarU = eb6.g;
                }
            }
            if (((Boolean) bw4VarU.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
