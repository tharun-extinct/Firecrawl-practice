package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class u32 extends ig6 {
    public final TextPaint a;
    public final CharSequence t;

    public u32(CharSequence charSequence, TextPaint textPaint) {
        this.t = charSequence;
        this.a = textPaint;
    }

    @Override // defpackage.ig6
    public final int g(int i) {
        CharSequence charSequence = this.t;
        return this.a.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.ig6
    public final int r(int i) {
        CharSequence charSequence = this.t;
        return this.a.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
