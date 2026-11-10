package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class gf5 extends ReplacementSpan {
    public TextPaint q;
    public final ff5 t;
    public final Paint.FontMetricsInt j = new Paint.FontMetricsInt();
    public short a = -1;
    public float m = 1.0f;

    public gf5(ff5 ff5Var) {
        xs2.t(ff5Var, "rasterizer cannot be null");
        this.t = ff5Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.q;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.q = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.a, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        ph1.g().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        ff5 ff5Var = this.t;
        kb5 kb5Var = ff5Var.y;
        Typeface typeface = (Typeface) kb5Var.m;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) kb5Var.t, ff5Var.g * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.j;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        ff5 ff5Var = this.t;
        v53 v53VarY = ff5Var.y();
        int iG = v53VarY.g(14);
        this.m = fAbs / (iG != 0 ? ((ByteBuffer) v53VarY.m).getShort(iG + v53VarY.j) : (short) 0);
        v53 v53VarY2 = ff5Var.y();
        int iG2 = v53VarY2.g(14);
        if (iG2 != 0) {
            ((ByteBuffer) v53VarY2.m).getShort(iG2 + v53VarY2.j);
        }
        v53 v53VarY3 = ff5Var.y();
        int iG3 = v53VarY3.g(12);
        short s = (short) ((iG3 != 0 ? ((ByteBuffer) v53VarY3.m).getShort(iG3 + v53VarY3.j) : (short) 0) * this.m);
        this.a = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
