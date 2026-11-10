package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class um extends jr2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int r;
    public final /* synthetic */ WeakReference v;
    public final /* synthetic */ an x;

    public um(an anVar, int i, int i2, WeakReference weakReference) {
        this.x = anVar;
        this.r = i;
        this.n = i2;
        this.v = weakReference;
    }

    @Override // defpackage.jr2
    public final void D(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.r) != -1) {
            typeface = ym.g(typeface, i, (this.n & 2) != 0);
        }
        an anVar = this.x;
        if (anVar.c) {
            anVar.q = typeface;
            TextView textView = (TextView) this.v.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = anVar.a;
                if (zIsAttachedToWindow) {
                    textView.post(new vm(textView, typeface, i2));
                } else {
                    an.n(textView, typeface, i2);
                }
            }
        }
    }
}
