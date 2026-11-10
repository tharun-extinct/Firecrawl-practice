package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class m45 extends CharacterStyle {
    public final boolean g;
    public final boolean y;

    public m45(boolean z, boolean z2) {
        this.g = z;
        this.y = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.g);
        textPaint.setStrikeThruText(this.y);
    }
}
