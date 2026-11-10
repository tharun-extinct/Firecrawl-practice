package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView j;
    public final /* synthetic */ Typeface t;

    public vm(TextView textView, Typeface typeface, int i) {
        this.j = textView;
        this.t = typeface;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an.n(this.j, this.t, this.a);
    }
}
