package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class bn4 extends CharacterStyle {
    public final int g;
    public final float n;
    public final float r;
    public final float y;

    public bn4(int i, float f, float f2, float f3) {
        this.g = i;
        this.y = f;
        this.r = f2;
        this.n = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.n, this.y, this.r, this.g);
    }
}
