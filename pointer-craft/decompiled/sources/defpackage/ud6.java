package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ud6 implements cj1 {
    public static final e14 g = new e14((byte) 1);

    /* JADX WARN: Code duplicated, block: B:117:0x02bf A[PHI: r14 r15
  0x02bf: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:103:0x0273, B:116:0x02bd] A[DONT_GENERATE, DONT_INLINE]
  0x02bf: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:103:0x0273, B:116:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x02c3 A[LOOP:3: B:102:0x0265->B:119:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:182:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:187:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f4 A[LOOP:5: B:195:0x03f2->B:196:0x03f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0436  */
    /* JADX WARN: Code duplicated, block: B:210:0x044c  */
    /* JADX WARN: Code duplicated, block: B:236:0x02cb A[EDGE_INSN: B:236:0x02cb->B:121:0x02cb BREAK  A[LOOP:3: B:102:0x0265->B:119:0x02c3], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x03f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    public static final void n(ViewStructure viewStructure, um2 um2Var, AutofillId autofillId, String str, m44 m44Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        za zaVar;
        cj cjVar;
        wb wbVar;
        ca5 ca5Var;
        o94 o94Var;
        boolean z;
        bu0 bu0Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String strV;
        int size;
        String str2;
        int i;
        String[] strArrY;
        String[] strArrY2;
        int i2;
        int i3;
        int i4;
        boolean z6;
        za zaVar2;
        ca5 ca5Var2;
        cj cjVar2;
        wb wbVar2;
        o94 o94Var2;
        boolean z7;
        mj4 mj4Var = kj4.g;
        mj4 mj4Var2 = yi4.g;
        aj4 aj4VarK = um2Var.k();
        boolean z8 = true;
        if (aj4VarK != null) {
            hb3 hb3Var = aj4VarK.j;
            j = 128;
            Object[] objArr = hb3Var.y;
            Object[] objArr2 = hb3Var.r;
            long[] jArr = hb3Var.g;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                zaVar2 = null;
                z = false;
                ca5Var2 = null;
                cjVar2 = null;
                wbVar2 = null;
                bu0Var = null;
                bool = null;
                o94Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr[i8];
                                Object obj3 = objArr2[i8];
                                mj4 mj4Var3 = (mj4) obj2;
                                if (yf2.p(mj4Var3, kj4.u)) {
                                    obj3.getClass();
                                    zaVar2 = (za) obj3;
                                } else if (yf2.p(mj4Var3, kj4.g)) {
                                    obj3.getClass();
                                    String str3 = (String) cj0.l0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (yf2.p(mj4Var3, kj4.p)) {
                                    obj3.getClass();
                                    bu0Var = (bu0) obj3;
                                } else if (yf2.p(mj4Var3, kj4.z)) {
                                    obj3.getClass();
                                    wbVar2 = (wb) obj3;
                                } else if (yf2.p(mj4Var3, kj4.G)) {
                                    obj3.getClass();
                                    cjVar2 = (cj) obj3;
                                } else if (yf2.p(mj4Var3, kj4.q)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (yf2.p(mj4Var3, kj4.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (yf2.p(mj4Var3, kj4.N)) {
                                    z2 = z8;
                                } else if (yf2.p(mj4Var3, kj4.i)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (yf2.p(mj4Var3, kj4.e)) {
                                    obj3.getClass();
                                    o94Var2 = (o94) obj3;
                                } else if (yf2.p(mj4Var3, kj4.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (yf2.p(mj4Var3, kj4.L)) {
                                    obj3.getClass();
                                    ca5Var2 = (ca5) obj3;
                                } else if (yf2.p(mj4Var3, yi4.y)) {
                                    viewStructure.setClickable(z8);
                                } else if (yf2.p(mj4Var3, yi4.r)) {
                                    viewStructure.setLongClickable(z8);
                                } else if (yf2.p(mj4Var3, yi4.f)) {
                                    viewStructure.setFocusable(z8);
                                } else if (yf2.p(mj4Var3, yi4.m)) {
                                    z = z8;
                                }
                                z7 = z8;
                                if (Build.VERSION.SDK_INT >= 34 && yf2.p(mj4Var3, ge6.r)) {
                                    obj = obj3;
                                }
                            } else {
                                z7 = z8;
                            }
                            j4 >>= 8;
                            i7++;
                            z8 = z7;
                        }
                        z6 = z8;
                        z6 = z6;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        z6 = z8 ? 1 : 0;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z8 = z6 ? 1 : 0;
                }
            } else {
                z6 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                zaVar2 = null;
                z = false;
                ca5Var2 = null;
                cjVar2 = null;
                wbVar2 = null;
                bu0Var = null;
                bool = null;
                o94Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            zaVar = zaVar2;
            ca5Var = ca5Var2;
            cjVar = cjVar2;
            wbVar = wbVar2;
            o94Var = o94Var2;
            r38 = z6;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            zaVar = null;
            cjVar = null;
            wbVar = null;
            ca5Var = null;
            o94Var = null;
            z = false;
            bu0Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        aj4 aj4VarK2 = um2Var.k();
        if (aj4VarK2 != null && aj4VarK2.a && !aj4VarK2.m) {
            aj4 aj4Var = new aj4();
            aj4Var.a = aj4VarK2.a;
            aj4Var.m = aj4VarK2.m;
            aj4Var.j.m(aj4VarK2.j);
            xa3 xa3Var = new xa3(((qb3) um2Var.i()).j.a);
            xa3Var.r(um2Var.i());
            while (xa3Var.a()) {
                um2 um2Var2 = (um2) xa3Var.q(xa3Var.y - 1);
                aj4 aj4VarK3 = um2Var2.k();
                if (aj4VarK3 != null && !aj4VarK3.a) {
                    aj4Var.n(aj4VarK3);
                    if (!aj4VarK3.m) {
                        xa3Var.r(um2Var2.i());
                    }
                }
            }
            aj4VarK2 = aj4Var;
        }
        if (aj4VarK2 != null) {
            hb3 hb3Var2 = aj4VarK2.j;
            Object[] objArr3 = hb3Var2.y;
            Object[] objArr4 = hb3Var2.r;
            long[] jArr2 = hb3Var2.g;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 8;
                list = null;
                int i10 = 0;
                while (true) {
                    long j5 = jArr2[i10];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i2 = i10;
                        if (i2 != length2) {
                            break;
                            break;
                        } else {
                            i10 = i2 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i10 << 3) + i12;
                                Object obj4 = objArr5[i13];
                                Object obj5 = objArr4[i13];
                                i4 = i9;
                                mj4 mj4Var4 = (mj4) obj4;
                                i3 = i12;
                                if (yf2.p(mj4Var4, kj4.a)) {
                                    viewStructure.setEnabled(false);
                                } else if (yf2.p(mj4Var4, kj4.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i3 = i12;
                                i4 = i9;
                            }
                            j5 >>= i4;
                            i12 = i3 + 1;
                            i9 = i4;
                        }
                        if (i11 != i9) {
                            break;
                        }
                        i2 = i10;
                        if (i2 != length2) {
                            break;
                        }
                        i10 = i2 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(um2Var.t);
        if (um2Var.o() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (zaVar != null) {
            numValueOf = Integer.valueOf(zaVar.g);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = ca5Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (cjVar != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(py5.y(cjVar.t)));
        }
        if (wbVar != null) {
            viewStructure.setAutofillValue(wbVar.g);
        }
        if (bu0Var != null && (strArrY2 = hd6.y(bu0Var)) != null) {
            viewStructure.setAutofillHints(strArrY2);
        }
        um2 um2Var3 = (um2) m44Var.g.y(um2Var.t);
        if (um2Var3 != null && um2Var3.c != -4) {
            bm bmVar = m44Var.r;
            int iN = m44Var.n(um2Var3);
            long[] jArr4 = (long[]) bmVar.y;
            long j6 = jArr4[iN];
            long j7 = jArr4[iN + 1];
            int i14 = (int) (j6 >> 32);
            int i15 = (int) j6;
            viewStructure.setDimens(i14, i15, 0, 0, ((int) (j7 >> 32)) - i14, ((int) j7) - i15);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (ca5Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(ca5Var == ca5.j);
        } else if (bool != null && (o94Var == null || o94Var.g != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        bu0.g.getClass();
        String[] strArrY3 = hd6.y(au0.y);
        strArrY3.getClass();
        if (strArrY3.length == 0) {
            l0.s("Array is empty.");
            return;
        }
        String str4 = strArrY3[0];
        if (bu0Var != null && (strArrY = hd6.y(bu0Var)) != null) {
            boolean zJ = pr.J(strArrY, str4);
            z3 = true;
            boolean z9 = zJ;
            if (!z2 || z9) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            viewStructure.setDataIsSensitive(z5);
            viewStructure.setVisibility(um2Var.M.n.h1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i = 0; i < size; i++) {
                    str2 = ((Object) str2) + ((cj) list.get(i)).t + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((qb3) um2Var.i()).isEmpty() && o94Var != null && (strV = sf6.v(o94Var.g)) != null) {
                viewStructure.setClassName(strV);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z4) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            uo1.B();
            return;
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        viewStructure.setDataIsSensitive(z5);
        viewStructure.setVisibility(um2Var.M.n.h1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i < size) {
                str2 = ((Object) str2) + ((cj) list.get(i)).t + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((qb3) um2Var.i()).isEmpty()) {
            viewStructure.setClassName(strV);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z4) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long r(String str, int i) {
        int iY = y(0, i, str, false);
        Matcher matcher = aw0.c.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iW = -1;
        int i5 = -1;
        int i6 = -1;
        while (iY < i) {
            int iY2 = y(iY + 1, i, str, true);
            matcher.region(iY, iY2);
            if (i3 == -1 && matcher.usePattern(aw0.c).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(aw0.w).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iW == -1) {
                Pattern pattern = aw0.q;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iW = tx4.W(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(aw0.m).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iY = y(iY2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            l0.u("Failed requirement.");
            return 0L;
        }
        if (iW == -1) {
            l0.u("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            l0.u("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            l0.u("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            l0.u("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            l0.u("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(ws5.g);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iW - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static int y(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
