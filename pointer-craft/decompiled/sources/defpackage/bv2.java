package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class bv2 implements LineHeightSpan {
    public final boolean a;
    public final float j;
    public final boolean m;
    public int p;
    public final float q;
    public final int t;
    public int u;
    public final int w;
    public int c = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int b = Integer.MIN_VALUE;
    public int s = Integer.MIN_VALUE;

    public bv2(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.j = f;
        this.t = i;
        this.a = z;
        this.m = z2;
        this.q = f2;
        this.w = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            nc2.y("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.t;
        int i7 = this.w;
        boolean z3 = this.m;
        boolean z4 = this.a;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.c == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.j);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.q;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.b = i12;
                int i13 = i12 - iCeil;
                this.i = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.c = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.s = i12;
                    this.p = fontMetricsInt.ascent - i13;
                    this.u = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.c = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.b;
                    this.s = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.p = 0;
                    this.u = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.i = i17;
                int i18 = fontMetricsInt.descent;
                this.b = i18;
                this.c = i17;
                this.s = i18;
                this.p = 0;
                this.u = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.c : this.i;
        fontMetricsInt.descent = z2 ? this.s : this.b;
    }
}
