package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class gq5 implements fq5 {
    public final k51 y;

    public gq5() {
        this.y = Build.VERSION.SDK_INT >= 34 ? l51.j : t32.w;
        pw5.l(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
