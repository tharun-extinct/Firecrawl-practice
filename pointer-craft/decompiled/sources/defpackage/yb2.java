package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 {
    public final p9 g;
    public final GestureDetector n;
    public boolean r;
    public int y = 0;

    public yb2(Context context, p9 p9Var) {
        this.g = p9Var;
        this.n = new GestureDetector(context, new xb2(this));
    }
}
