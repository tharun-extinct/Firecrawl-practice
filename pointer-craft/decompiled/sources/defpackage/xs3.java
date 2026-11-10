package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class xs3 extends ReplacementSpan {
    public Paint.FontMetricsInt j;
    public boolean t;

    public final Paint.FontMetricsInt g() {
        Paint.FontMetricsInt fontMetricsInt = this.j;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        yf2.Y("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.t = true;
        paint.getTextSize();
        this.j = paint.getFontMetricsInt();
        if (!(g().descent > g().ascent)) {
            nc2.g("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    public final int y() {
        if (this.t) {
            return 0;
        }
        nc2.y("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
