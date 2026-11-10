package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gd {
    public final kd g;
    public final List l;
    public final h75 n;
    public final long r;
    public final CharSequence v;
    public final float x;
    public final int y;

    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:139:0x021b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0235  */
    /* JADX WARN: Code duplicated, block: B:143:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0253 A[LOOP:1: B:144:0x0251->B:145:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0280  */
    /* JADX WARN: Code duplicated, block: B:151:0x0298  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02db  */
    /* JADX WARN: Code duplicated, block: B:187:0x032d  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x024f, please report this as an issue */
    public gd(kd kdVar, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        h75 h75VarG;
        int i9;
        gd gdVar;
        int i10;
        Layout layout;
        Spanned spanned;
        xm4[] xm4VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i11;
        List list;
        int spanEnd;
        int iX;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        CharSequence charSequence2 = kdVar.i;
        this.g = kdVar;
        this.y = i;
        this.r = j;
        if (ws0.a(j) != 0 || ws0.m(j) != 0) {
            nc2.g("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            nc2.g("maxLines should be greater than 0");
        }
        k85 k85Var = kdVar.t;
        if (i2 == 2) {
            i3 = 0;
            if (!n85.g(k85Var.g.j, kq2.G(0)) && !n85.g(k85Var.g.j, n85.r) && (i13 = k85Var.y.g) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!zq2.z(spannableString, ya2.class)) {
                    spannableString.setSpan(new ya2(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.v = charSequence3;
        lp3 lp3Var = k85Var.y;
        ju4 ju4Var = k85Var.g;
        int i14 = lp3Var.g;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        Throwable th = null;
        int i17 = lp3Var.j == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = lp3Var.l;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                ju4Var = ju4Var;
                truncateAt = null;
                c = ' ';
            }
            h75VarG = g(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = h75VarG.x;
            if (Build.VERSION.SDK_INT < 35 || kdVar.c.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                gdVar = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                gdVar = this;
                i10 = i;
                h75VarG = gdVar.g(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = h75VarG.l;
            if (i2 == i9 || h75VarG.g() <= ws0.j(j) || i10 <= 1) {
                gdVar.n = h75VarG;
            } else {
                int iJ = ws0.j(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (h75VarG.n(i23) > iJ) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != gdVar.y) {
                    h75VarG = gdVar.g(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, gdVar.v);
                }
                gdVar.n = h75VarG;
            }
            gdVar.x = h75VarG.g();
            ju4 ju4Var2 = ju4Var;
            gdVar.g.c.r(ju4Var2.g.r(), (((long) Float.floatToRawIntBits(gdVar.x)) & 4294967295L) | (((long) Float.floatToRawIntBits(gdVar.r())) << c), ju4Var2.g.g());
            layout = h75VarG.x;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), xm4.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    xm4VarArr = (xm4[]) ((Spanned) text2).getSpans(0, layout.getText().length(), xm4.class);
                } else {
                    xm4VarArr = null;
                }
            } else {
                xm4VarArr = null;
            }
            if (xm4VarArr != null) {
                for (xm4 xm4Var : xm4VarArr) {
                    xm4Var.a.setValue(new cq4((((long) Float.floatToRawIntBits(gdVar.x)) & 4294967295L) | (((long) Float.floatToRawIntBits(gdVar.r())) << c)));
                }
            }
            charSequence = gdVar.v;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), xs3.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i11 = 0;
                while (i11 < length) {
                    xs3 xs3Var = (xs3) spans[i11];
                    int spanStart = spanned2.getSpanStart(xs3Var);
                    spanEnd = spanned2.getSpanEnd(xs3Var);
                    iX = gdVar.n.x(spanStart);
                    if (iX >= gdVar.y) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (gdVar.n.x.getEllipsisCount(iX) > 0 || spanEnd <= gdVar.n.x.getEllipsisStart(iX) + gdVar.n.x.getLineStart(iX)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > gdVar.n.v(iX)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = gdVar.n.x.getParagraphDirection(iX) == 1;
                            boolean zIsRtlCharAt = gdVar.n.x.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                gdVar.n.t(spanStart, false);
                                xs3Var.y();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                gdVar.n.a(spanStart, false);
                                xs3Var.y();
                                throw th;
                            }
                            h75 h75Var = gdVar.n;
                            if (zIsRtlCharAt) {
                                h75Var.t(spanStart, false);
                                xs3Var.y();
                                throw th;
                            }
                            h75Var.a(spanStart, false);
                            xs3Var.y();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i11++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = pi1.j;
            }
            gdVar.l = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        h75VarG = g(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = h75VarG.x;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            gdVar = this;
            i10 = i;
        } else {
            i9 = 2;
            gdVar = this;
            i10 = i;
        }
        int i24 = h75VarG.l;
        if (i2 == i9) {
            gdVar.n = h75VarG;
        } else {
            gdVar.n = h75VarG;
        }
        gdVar.x = h75VarG.g();
        ju4 ju4Var3 = ju4Var;
        gdVar.g.c.r(ju4Var3.g.r(), (((long) Float.floatToRawIntBits(gdVar.x)) & 4294967295L) | (((long) Float.floatToRawIntBits(gdVar.r())) << c), ju4Var3.g.g());
        layout = h75VarG.x;
        if (layout.getText() instanceof Spanned) {
            xm4VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), xm4.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                xm4VarArr = (xm4[]) ((Spanned) text4).getSpans(0, layout.getText().length(), xm4.class);
            } else {
                xm4VarArr = null;
            }
        }
        if (xm4VarArr != null) {
            while (i12 < r2) {
                xm4Var.a.setValue(new cq4((((long) Float.floatToRawIntBits(gdVar.x)) & 4294967295L) | (((long) Float.floatToRawIntBits(gdVar.r())) << c)));
            }
        }
        charSequence = gdVar.v;
        if (charSequence instanceof Spanned) {
            list = pi1.j;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), xs3.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i11 = 0;
            while (i11 < length) {
                xs3 xs3Var2 = (xs3) spans[i11];
                int spanStart2 = spanned2.getSpanStart(xs3Var2);
                spanEnd = spanned2.getSpanEnd(xs3Var2);
                iX = gdVar.n.x(spanStart2);
                if (iX >= gdVar.y) {
                    z = true;
                } else {
                    z = false;
                }
                if (gdVar.n.x.getEllipsisCount(iX) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > gdVar.n.v(iX)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i11++;
                th = th;
            }
            list = arrayList;
        }
        gdVar.l = list;
    }

    public final h75 g(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        jt3 jt3Var;
        float fR = r();
        kd kdVar = this.g;
        hf hfVar = kdVar.c;
        int i8 = kdVar.u;
        em2 em2Var = kdVar.b;
        k85 k85Var = kdVar.t;
        hd hdVar = id.g;
        zt3 zt3Var = k85Var.r;
        return new h75(charSequence, fR, hfVar, i, truncateAt, i8, (zt3Var == null || (jt3Var = zt3Var.y) == null) ? false : jt3Var.g, i3, i5, i6, i7, i4, i2, em2Var);
    }

    public final void n(nb0 nb0Var) {
        Canvas canvasG = d9.g(nb0Var);
        h75 h75Var = this.n;
        if (h75Var.n) {
            canvasG.save();
            canvasG.clipRect(0.0f, 0.0f, r(), this.x);
        }
        int i = h75Var.j;
        if (canvasG.getClipBounds(h75Var.i)) {
            if (i != 0) {
                canvasG.translate(0.0f, i);
            }
            ThreadLocal threadLocal = l75.g;
            Object i35Var = threadLocal.get();
            if (i35Var == null) {
                i35Var = new i35();
                threadLocal.set(i35Var);
            }
            i35 i35Var2 = (i35) i35Var;
            i35Var2.g = canvasG;
            try {
                h75Var.x.draw(i35Var2);
                i35Var2.g = null;
                if (i != 0) {
                    canvasG.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                i35Var2.g = null;
                throw th;
            }
        }
        if (h75Var.n) {
            canvasG.restore();
        }
    }

    public final float r() {
        return ws0.t(this.r);
    }

    public final void v(nb0 nb0Var, long j, ym4 ym4Var, l45 l45Var, yd1 yd1Var) {
        hf hfVar = this.g.c;
        byte b = hfVar.r;
        hfVar.n(j);
        hfVar.x(ym4Var);
        hfVar.l(l45Var);
        hfVar.v(yd1Var);
        hfVar.y(3);
        n(nb0Var);
        hfVar.y(b);
    }

    public final void x(nb0 nb0Var, z60 z60Var, float f, ym4 ym4Var, l45 l45Var, yd1 yd1Var) {
        hf hfVar = this.g.c;
        byte b = hfVar.r;
        hfVar.r(z60Var, (((long) Float.floatToRawIntBits(r())) << 32) | (((long) Float.floatToRawIntBits(this.x)) & 4294967295L), f);
        hfVar.x(ym4Var);
        hfVar.l(l45Var);
        hfVar.v(yd1Var);
        hfVar.y(3);
        new fd(this).a(nb0Var);
        hfVar.y(b);
    }

    public final long y(k44 k44Var, int i, up upVar) {
        int[] iArrN;
        RectF rectFN = oe6.n(k44Var);
        byte b = 0;
        int i2 = (!ix5.r(i, 0) && ix5.r(i, 1)) ? 1 : 0;
        ed edVar = new ed(upVar, b);
        int i3 = Build.VERSION.SDK_INT;
        h75 h75Var = this.n;
        if (i3 >= 34) {
            h75Var.getClass();
            iArrN = t1.v(h75Var, rectFN, i2, edVar);
        } else {
            iArrN = px5.n(h75Var, h75Var.x, h75Var.r(), rectFN, i2, edVar);
        }
        return iArrN == null ? u75.y : sp2.y(iArrN[0], iArrN[1]);
    }
}
