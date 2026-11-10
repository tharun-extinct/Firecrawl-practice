package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class iy2 {
    public static iy2 y;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public iy2(int i) {
        this.g = i;
    }

    public static synchronized iy2 r() {
        iy2 iy2Var;
        iy2Var = y;
        if (iy2Var == null) {
            iy2Var = new iy2(3);
            y = iy2Var;
        }
        return iy2Var;
    }

    public static String v(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void g(String str, String str2, Throwable... thArr) {
        if (this.g <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public final void n(String str, String str2, Throwable... thArr) {
        if (this.g <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public final void x(String str, String str2, Throwable... thArr) {
        if (this.g <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public final void y(String str, String str2, Throwable... thArr) {
        if (this.g <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }
}
