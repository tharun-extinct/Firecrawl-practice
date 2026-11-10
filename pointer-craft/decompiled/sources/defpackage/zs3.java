package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zs3 implements y42 {
    public final View g;

    public zs3(View view) {
        this.g = view;
    }

    public final void g(int i) {
        int i2 = 16;
        if (!z42.g(i, 16)) {
            i2 = 6;
            if (!z42.g(i, 6)) {
                i2 = 13;
                if (!z42.g(i, 13)) {
                    i2 = 23;
                    if (!z42.g(i, 23)) {
                        i2 = 3;
                        if (!z42.g(i, 3)) {
                            i2 = 0;
                            if (!z42.g(i, 0)) {
                                i2 = 17;
                                if (!z42.g(i, 17)) {
                                    i2 = 27;
                                    if (!z42.g(i, 27)) {
                                        i2 = 26;
                                        if (!z42.g(i, 26)) {
                                            i2 = 9;
                                            if (!z42.g(i, 9)) {
                                                i2 = 22;
                                                if (!z42.g(i, 22)) {
                                                    i2 = 21;
                                                    if (!z42.g(i, 21)) {
                                                        i2 = 1;
                                                        if (!z42.g(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = xk5.g;
        int iV = rg6.v(i2);
        if (iV == -1) {
            return;
        }
        this.g.performHapticFeedback(iV);
    }
}
