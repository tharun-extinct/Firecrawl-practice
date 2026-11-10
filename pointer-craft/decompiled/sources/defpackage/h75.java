package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h75 {
    public final float a;
    public cp1 b;
    public final bv2[] c;
    public final TextPaint g;
    public final Rect i = new Rect();
    public final int j;
    public final int l;
    public final float m;
    public final boolean n;
    public final Paint.FontMetricsInt q;
    public final boolean r;
    public final int t;
    public aq3 v;
    public final int w;
    public final Layout x;
    public final TextUtils.TruncateAt y;

    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a A[PHI: r6 r22
  0x019a: PHI (r6v8 int) = (r6v7 int), (r6v10 int) binds: [B:94:0x01ae, B:87:0x0193] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r22v6 java.lang.Throwable) = (r22v5 java.lang.Throwable), (r22v8 java.lang.Throwable) binds: [B:94:0x01ae, B:87:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    public h75(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, em2 em2Var) throws Throwable {
        TextDirectionHeuristic textDirectionHeuristic;
        int i9;
        Layout layoutU;
        boolean z2;
        int i10;
        bv2[] bv2VarArr;
        int i11;
        int i12;
        long jG;
        Throwable th;
        int i13;
        long j;
        char c;
        int i14;
        long jG2;
        int i15;
        int i16;
        long jG3;
        ?? r9;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        int i17;
        ?? r6;
        boolean z3;
        ?? r12;
        bv2 bv2Var;
        bv2 bv2Var2;
        int i18;
        this.g = textPaint;
        this.y = truncateAt;
        this.r = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicY = l75.y(i2);
        Layout.Alignment alignment = h35.g;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : h35.y : h35.g : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, sy.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z5 = z4;
        try {
            BoringLayout.Metrics metricsG = em2Var.g();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsG == null || em2Var.r() > f || z5) {
                textDirectionHeuristic = textDirectionHeuristicY;
                i9 = i3;
                layoutU = lr2.u(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    nc2.g("negative width");
                }
                if (iCeil < 0) {
                    nc2.g("negative ellipsized width");
                }
                layoutU = Build.VERSION.SDK_INT >= 33 ? e2.r(charSequence, textPaint, iCeil, alignment2, metricsG, z, truncateAt, iCeil) : gz5.y(charSequence, textPaint, iCeil, alignment2, metricsG, z, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicY;
                i9 = i3;
                z2 = true;
            }
            this.x = layoutU;
            Trace.endSection();
            int iMin = Math.min(layoutU.getLineCount(), i9);
            this.l = iMin;
            int i19 = iMin - 1;
            this.n = iMin >= i9 && (layoutU.getEllipsisCount(i19) > 0 || layoutU.getLineEnd(i19) != charSequence.length());
            if (layoutU.getText() instanceof Spanned) {
                CharSequence text = layoutU.getText();
                text.getClass();
                if (zq2.z((Spanned) text, bv2.class) || layoutU.getText().length() <= 0) {
                    CharSequence text2 = layoutU.getText();
                    text2.getClass();
                    i10 = 0;
                    bv2VarArr = (bv2[]) ((Spanned) text2).getSpans(0, layoutU.getText().length(), bv2.class);
                } else {
                    bv2VarArr = null;
                    i10 = 0;
                }
            } else {
                bv2VarArr = null;
                i10 = 0;
            }
            this.c = bv2VarArr;
            if (bv2VarArr == null || (bv2Var2 = (bv2) pr.X(bv2VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (bv2Var2.a) {
                    i11 = 2;
                    i18 = bv2Var2.w == 2 ? 1 : i18;
                    i12 = i18;
                } else {
                    i11 = 2;
                }
                i18 = i10;
                i12 = i18;
            }
            int i20 = (bv2VarArr == null || (bv2Var = (bv2) pr.X(bv2VarArr)) == null || !bv2Var.m || bv2Var.w != i11) ? i10 : 1;
            if (i12 == 0 || i20 == 0) {
                jG = l75.y;
                if (z) {
                    th = null;
                    i13 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutU;
                        th = null;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r9 = i10;
                        }
                    } else {
                        th = null;
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutU;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i21 >= 28) {
                            r9 = 1;
                        } else {
                            r9 = i10;
                        }
                    }
                    if (r9 == 0) {
                        r9 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutU.getPaint();
                        CharSequence text3 = layoutU.getText();
                        c = ' ';
                        j = 4294967295L;
                        Rect rectY = kc6.y(paint, text3, layoutU.getLineStart(i10), layoutU.getLineEnd(i10));
                        int lineAscent = layoutU.getLineAscent(i10);
                        int i22 = rectY.top;
                        if (i22 < lineAscent) {
                            r9 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i22;
                        } else {
                            r9 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutU.getTopPadding();
                        }
                        i14 = 1;
                        rectY = iMin != 1 ? kc6.y(paint, text3, layoutU.getLineStart(i19), layoutU.getLineEnd(i19)) : rectY;
                        int lineDescent = layoutU.getLineDescent(i19);
                        int i23 = rectY.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutU.getBottomPadding();
                        jG2 = (topPadding == 0 && bottomPadding == 0) ? jG2 : l75.g(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i15 = i10;
                        } else {
                            i15 = (int) (jG2 >> c);
                        }
                        if (i20 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jG2 & j);
                        }
                        jG3 = l75.g(i15, i16);
                    }
                    jG2 = jG;
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (jG2 >> c);
                    }
                    if (i20 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jG2 & j);
                    }
                    jG3 = l75.g(i15, i16);
                }
                r9 = zIsFallbackLineSpacingEnabled;
                r9 = zIsFallbackLineSpacingEnabled2;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                jG2 = jG;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (jG2 >> c);
                }
                if (i20 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jG2 & j);
                }
                jG3 = l75.g(i15, i16);
            } else {
                jG3 = l75.y;
                jG = jG3;
                th = null;
                c = ' ';
                j = 4294967295L;
                i13 = 33;
                i14 = 1;
            }
            if (bv2VarArr != null) {
                int length2 = bv2VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    bv2 bv2Var3 = bv2VarArr[i24];
                    int i25 = bv2Var3.p;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = bv2Var3.u;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jG = (iMax == 0 && iMax2 == 0) ? l75.y : l75.g(iMax, iMax2);
            }
            this.j = Math.max((int) (jG3 >> c), (int) (jG >> c));
            this.t = Math.max((int) (jG3 & j), (int) (jG & j));
            TextPaint textPaint2 = this.g;
            bv2[] bv2VarArr2 = this.c;
            int i27 = this.l - i14;
            Layout layout = this.x;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || bv2VarArr2 == null || bv2VarArr2.length == 0) {
                i17 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (bv2VarArr2.length == 0) {
                    l0.s("Array is empty.");
                    throw th;
                }
                bv2 bv2Var4 = bv2VarArr2[i10];
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = bv2Var4.m)) {
                    boolean z6 = bv2Var4.m;
                    z3 = z6 ? 1 : 0;
                    r12 = z6;
                } else {
                    r12 = i10;
                }
                spannableString.setSpan(new bv2(bv2Var4.j, length3, r12, z3, bv2Var4.q, bv2Var4.w), i10, spannableString.length(), i13);
                i17 = i10;
                StaticLayout staticLayoutU = lr2.u(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, yk2.g(), Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.r, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutU.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutU.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutU.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutU.getLineBottom(i17);
                r6 = fontMetricsInt;
            }
            this.w = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) l(i19)) : i17;
            this.q = r6;
            Layout layout2 = this.x;
            this.a = v70.o(layout2, i19, layout2.getPaint());
            Layout layout3 = this.x;
            this.m = v70.f(layout3, i19, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final float a(int i, boolean z) {
        return y(x(i)) + r().n(i, false, z);
    }

    public final int g() {
        boolean z = this.n;
        Layout layout = this.x;
        return (z ? layout.getLineBottom(this.l - 1) : layout.getHeight()) + this.j + this.t + this.w;
    }

    public final float j(int i) {
        return this.x.getLineTop(i) + (i == 0 ? 0 : this.j);
    }

    public final float l(int i) {
        return n(i) - j(i);
    }

    public final aq3 m() {
        aq3 aq3Var = this.v;
        if (aq3Var != null) {
            return aq3Var;
        }
        Layout layout = this.x;
        aq3 aq3Var2 = new aq3(layout.getText(), layout.getText().length(), this.g.getTextLocale());
        this.v = aq3Var2;
        return aq3Var2;
    }

    public final float n(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.l;
        int i3 = i2 - 1;
        Layout layout = this.x;
        if (i != i3 || (fontMetricsInt = this.q) == null) {
            return this.j + layout.getLineBottom(i) + (i == i2 + (-1) ? this.t : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final cp1 r() {
        cp1 cp1Var = this.b;
        if (cp1Var != null) {
            return cp1Var;
        }
        cp1 cp1Var2 = new cp1(this.x);
        this.b = cp1Var2;
        return cp1Var2;
    }

    public final float t(int i, boolean z) {
        return y(x(i)) + r().n(i, true, z);
    }

    public final int v(int i) {
        ThreadLocal threadLocal = l75.g;
        Layout layout = this.x;
        return (layout.getEllipsisCount(i) <= 0 || this.y != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int x(int i) {
        int i2 = this.l;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.x.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float y(int i) {
        if (i == this.l - 1) {
            return this.a + this.m;
        }
        return 0.0f;
    }
}
