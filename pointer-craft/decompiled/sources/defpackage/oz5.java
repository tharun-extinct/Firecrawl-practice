package defpackage;

import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oz5 {
    public static ha2 r;
    public static final nm0 g = new nm0(1717557181, false, new at(25));
    public static final nm0 y = new nm0(1742547675, false, new bn0(4));

    public static Typeface g(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static void y(String str) {
        Log.i("NavController", str);
    }
}
