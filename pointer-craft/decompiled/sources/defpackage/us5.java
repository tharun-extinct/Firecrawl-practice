package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class us5 {
    public static final byte[] g = new byte[0];
    public static final sm3 y;

    static {
        fa0 fa0Var = fa0.m;
        fa0[] fa0VarArr = {aj6.s("efbbbf"), aj6.s("feff"), aj6.s("fffe0000"), aj6.s("fffe"), aj6.s("0000feff")};
        ArrayList arrayListK0 = pr.k0(fa0VarArr);
        if (arrayListK0.size() > 1) {
            Collections.sort(arrayListK0);
        }
        int size = arrayListK0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList.set(pw5.t(arrayListK0, fa0VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((fa0) arrayListK0.get(0)).y() <= 0) {
            l0.u("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayListK0.size()) {
            fa0 fa0Var2 = (fa0) arrayListK0.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayListK0.size()) {
                fa0 fa0Var3 = (fa0) arrayListK0.get(i6);
                fa0Var3.getClass();
                fa0Var2.getClass();
                if (!fa0Var3.l(fa0Var2, fa0Var2.y())) {
                    break;
                }
                if (fa0Var3.y() == fa0Var2.y()) {
                    throw new IllegalArgumentException(("duplicate option: " + fa0Var3).toString());
                }
                if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                    arrayListK0.remove(i6);
                    ((Number) arrayList.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        c70 c70Var = new c70();
        cc6.v(0L, c70Var, 0, arrayListK0, 0, arrayListK0.size(), arrayList);
        int i7 = (int) (c70Var.t / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = c70Var.u();
        }
        y = new sm3((fa0[]) Arrays.copyOf(fa0VarArr, 5), iArr);
    }

    public static final String[] a(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int c(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final void g(ArrayList arrayList, a35 a35Var) {
        if (arrayList.contains(a35Var)) {
            return;
        }
        arrayList.add(a35Var);
    }

    public static final int j(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (yf2.f(cCharAt, 31) <= 0 || yf2.f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean m(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int n(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (tx4.R(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int q(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final void r(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int t(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int v(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int w(h34 h34Var) {
        return (h34Var.t() & 255) | ((h34Var.t() & 255) << 16) | ((h34Var.t() & 255) << 8);
    }

    public static final boolean x(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void y(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }
}
