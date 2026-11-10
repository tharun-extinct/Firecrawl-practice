package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes2.dex */
public final class zd1 extends CharacterStyle implements UpdateAppearance {
    public final yd1 j;

    public zd1(yd1 yd1Var) {
        this.j = yd1Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            go1 go1Var = go1.g;
            yd1 yd1Var = this.j;
            if (yf2.p(yd1Var, go1Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(yd1Var instanceof by4)) {
                up.y();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            by4 by4Var = (by4) yd1Var;
            textPaint.setStrokeWidth(by4Var.g);
            textPaint.setStrokeMiter(by4Var.y);
            int i = by4Var.n;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = by4Var.r;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
