package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class v11 {
    public static final ThreadLocal y = new ThreadLocal();
    public final TextPaint g;

    public v11() {
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
