package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class xm4 extends CharacterStyle implements UpdateAppearance {
    public final a70 j;
    public final float t;
    public final tp3 a = kq2.M(new cq4(9205357640488583168L));
    public final z51 m = pt4.y(new m63(this, 3));

    public xm4(a70 a70Var, float f) {
        this.j = a70Var;
        this.t = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        ih6.r(textPaint, this.t);
        textPaint.setShader((Shader) this.m.getValue());
    }
}
