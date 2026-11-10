package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class s45 {
    public float r;
    public final WeakReference v;
    public r35 x;
    public final TextPaint g = new TextPaint(1);
    public final je0 y = new je0(this, (byte) 1);
    public boolean n = true;

    public s45(oe0 oe0Var) {
        this.v = new WeakReference(null);
        this.v = new WeakReference(oe0Var);
    }

    public final float g(String str) {
        if (!this.n) {
            return this.r;
        }
        TextPaint textPaint = this.g;
        this.r = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.n = false;
        return this.r;
    }
}
