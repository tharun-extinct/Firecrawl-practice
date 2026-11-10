package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class xg5 implements Spannable {
    public boolean j = false;
    public Spannable t;

    public xg5(Spannable spannable) {
        this.t = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.t.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return qz5.y(this.t);
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return qz5.r(this.t);
    }

    public final void g() {
        Spannable spannable = this.t;
        if (!this.j) {
            if ((Build.VERSION.SDK_INT < 28 ? new vg5() : new wg5()).g(spannable)) {
                this.t = new SpannableString(spannable);
            }
        }
        this.j = true;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.t.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.t.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.t.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        g();
        this.t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        g();
        this.t.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.t.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.t.toString();
    }
}
