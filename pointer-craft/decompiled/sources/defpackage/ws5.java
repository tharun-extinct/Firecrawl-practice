package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ws5 {
    public static final TimeZone g;
    public static final String y;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        g = timeZone;
        String strD0 = tx4.d0("okhttp3.", hj3.class.getName());
        if (tx4.S(strD0, "Client")) {
            strD0 = strD0.substring(0, strD0.length() - "Client".length());
        }
        y = strD0;
    }

    public static final c52 a(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b52 b52Var = (b52) it.next();
            fa0 fa0Var = b52Var.g;
            fa0 fa0Var2 = b52Var.y;
            String strQ = fa0Var.q();
            String strQ2 = fa0Var2.q();
            arrayList.add(strQ);
            arrayList.add(tx4.q0(strQ2).toString());
        }
        return new c52((String[]) arrayList.toArray(new String[0]));
    }

    public static final boolean g(a92 a92Var, a92 a92Var2) {
        a92Var.getClass();
        return yf2.p(a92Var.n, a92Var2.n) && a92Var.v == a92Var2.v && yf2.p(a92Var.g, a92Var2.g);
    }

    public static final boolean j(hu4 hu4Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jR = hu4Var.r().v() ? hu4Var.r().r() - jNanoTime : Long.MAX_VALUE;
        hu4Var.r().n(Math.min(jR, timeUnit.toNanos(i)) + jNanoTime);
        try {
            c70 c70Var = new c70();
            while (hu4Var.j(8192L, c70Var) != -1) {
                c70Var.k(c70Var.t);
            }
            if (jR == Long.MAX_VALUE) {
                hu4Var.r().g();
                return true;
            }
            hu4Var.r().n(jNanoTime + jR);
            return true;
        } catch (InterruptedIOException unused) {
            if (jR == Long.MAX_VALUE) {
                hu4Var.r().g();
                return false;
            }
            hu4Var.r().n(jNanoTime + jR);
            return false;
        } catch (Throwable th) {
            if (jR == Long.MAX_VALUE) {
                hu4Var.r().g();
            } else {
                hu4Var.r().n(jNanoTime + jR);
            }
            throw th;
        }
    }

    public static final Charset l(r70 r70Var, Charset charset) {
        r70Var.getClass();
        charset.getClass();
        int iB = r70Var.B(us5.y);
        if (iB == -1) {
            return charset;
        }
        if (iB == 0) {
            return od0.g;
        }
        if (iB == 1) {
            return od0.y;
        }
        if (iB == 2) {
            Charset charset2 = od0.g;
            Charset charset3 = od0.v;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            od0.v = charsetForName;
            return charsetForName;
        }
        if (iB == 3) {
            return od0.r;
        }
        if (iB != 4) {
            throw new AssertionError();
        }
        Charset charset4 = od0.g;
        Charset charset5 = od0.x;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        od0.x = charsetForName2;
        return charsetForName2;
    }

    public static final String m(a92 a92Var, boolean z) {
        int i;
        a92Var.getClass();
        int i2 = a92Var.v;
        String str = a92Var.n;
        if (tx4.Q(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = a92Var.g;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else {
                i = str2.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final String n(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final List q(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return pi1.j;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final void r(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!yf2.p(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final vs5 t(String str) {
        return new vs5(str, true);
    }

    public static final long v(z74 z74Var) {
        String strG = z74Var.w.g("Content-Length");
        if (strG == null) {
            return -1L;
        }
        byte[] bArr = us5.g;
        try {
            return Long.parseLong(strG);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List w(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return pi1.j;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List x(Object... objArr) {
        return w(objArr);
    }

    public static final int y() {
        TimeUnit.SECONDS.getClass();
        return 70000;
    }
}
