package defpackage;

import android.view.View;
import androidx.recyclerview.widget.g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kf6 {
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void g(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = xg2.g;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = at3.g;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static String l(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                c70 c70Var = new c70();
                c70Var.P(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = us5.q(str.charAt(iCharCount + 1));
                        int iQ2 = us5.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            c70Var.R(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c70Var.F((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c70Var.F(32);
                        iCharCount++;
                    } else {
                        c70Var.R(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c70Var.f();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static int n(j54 j54Var, vm3 vm3Var, View view, View view2, g gVar, boolean z, boolean z2) {
        if (gVar.G() == 0 || j54Var.y() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (j54Var.y() - Math.max(g.R(view), g.R(view2))) - 1) : Math.max(0, Math.min(g.R(view), g.R(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(vm3Var.y(view2) - vm3Var.v(view)) / (Math.abs(g.R(view) - g.R(view2)) + 1))) + (vm3Var.a() - vm3Var.v(view)));
        }
        return iMax;
    }

    public static int r(j54 j54Var, vm3 vm3Var, View view, View view2, g gVar, boolean z) {
        if (gVar.G() == 0 || j54Var.y() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(g.R(view) - g.R(view2)) + 1;
        }
        return Math.min(vm3Var.m(), vm3Var.y(view2) - vm3Var.v(view));
    }

    public static int v(j54 j54Var, vm3 vm3Var, View view, View view2, g gVar, boolean z) {
        if (gVar.G() == 0 || j54Var.y() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return j54Var.y();
        }
        return (int) (((vm3Var.y(view2) - vm3Var.v(view)) / (Math.abs(g.R(view) - g.R(view2)) + 1)) * j54Var.y());
    }

    public static final boolean x(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && us5.q(str.charAt(i + 1)) != -1 && us5.q(str.charAt(i3)) != -1;
    }

    public static String y(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || tx4.R(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !x(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                c70 c70Var = new c70();
                c70Var.P(i4, iCharCount, str);
                c70 c70Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i5 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c70Var.Q("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            c70Var.Q(z ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i5 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !tx4.R(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || x(iCharCount, length, str))))) {
                                    c70Var.R(iCodePointAt2);
                                }
                            }
                            if (c70Var2 == null) {
                                c70Var2 = new c70();
                            }
                            c70Var2.R(iCodePointAt2);
                            while (!c70Var2.y()) {
                                byte bT = c70Var2.t();
                                c70Var.F(37);
                                char[] cArr = g;
                                c70Var.F(cArr[((bT & 255) >> 4) & 15]);
                                c70Var.F(cArr[bT & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                }
                return c70Var.f();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }
}
