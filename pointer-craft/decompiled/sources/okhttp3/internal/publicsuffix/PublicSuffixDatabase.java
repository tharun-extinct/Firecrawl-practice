package okhttp3.internal.publicsuffix;

import defpackage.aj6;
import defpackage.bk4;
import defpackage.cj0;
import defpackage.dk4;
import defpackage.du4;
import defpackage.fa0;
import defpackage.fe6;
import defpackage.ff1;
import defpackage.gf1;
import defpackage.ij0;
import defpackage.l0;
import defpackage.pi1;
import defpackage.pw5;
import defpackage.rr;
import defpackage.tx4;
import defpackage.yf2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    public final rr g;
    public static final fa0 y = new fa0(Arrays.copyOf(new byte[]{42}, 1));
    public static final List r = pw5.k("*");
    public static final PublicSuffixDatabase n = new PublicSuffixDatabase(new rr());

    public PublicSuffixDatabase(rr rrVar) {
        this.g = rrVar;
    }

    public static List y(String str) {
        List listI0 = tx4.i0(str, new char[]{'.'});
        return yf2.p(cj0.r0(listI0), "") ? cj0.h0(listI0) : listI0;
    }

    public final String g(String str) {
        String strG;
        String strG2;
        String strG3;
        List listI0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listY = y(unicode);
        rr rrVar = this.g;
        AtomicBoolean atomicBoolean = (AtomicBoolean) rrVar.r;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) rrVar.n).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        rrVar.r();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        rrVar.l = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((fa0) rrVar.v) == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) rrVar.y) + " resource.");
            illegalStateException.initCause((IOException) rrVar.l);
            throw illegalStateException;
        }
        int size3 = listY.size();
        fa0[] fa0VarArr = new fa0[size3];
        for (int i = 0; i < size3; i++) {
            fa0 fa0Var = fa0.m;
            fa0VarArr[i] = aj6.p((String) listY.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strG = null;
                break;
            }
            fa0 fa0Var2 = (fa0) rrVar.v;
            if (fa0Var2 == null) {
                yf2.Y("bytes");
                throw null;
            }
            strG = fe6.g(fa0Var2, fa0VarArr, i2);
            if (strG != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strG2 = null;
            break;
        }
        fa0[] fa0VarArr2 = (fa0[]) fa0VarArr.clone();
        int length = fa0VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strG2 = null;
                break;
            }
            fa0VarArr2[i3] = y;
            fa0 fa0Var3 = (fa0) rrVar.v;
            if (fa0Var3 == null) {
                yf2.Y("bytes");
                throw null;
            }
            strG2 = fe6.g(fa0Var3, fa0VarArr2, i3);
            if (strG2 != null) {
                break;
            }
            i3++;
        }
        if (strG2 == null) {
            strG3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strG3 = null;
                break;
            }
            fa0 fa0Var4 = (fa0) rrVar.x;
            if (fa0Var4 == null) {
                yf2.Y("exceptionBytes");
                throw null;
            }
            strG3 = fe6.g(fa0Var4, fa0VarArr, i5);
            if (strG3 != null) {
                break;
            }
            i5++;
        }
        if (strG3 != null) {
            listI0 = tx4.i0("!".concat(strG3), new char[]{'.'});
        } else if (strG == null && strG2 == null) {
            listI0 = r;
        } else {
            List listI1 = pi1.j;
            List listI2 = strG != null ? tx4.i0(strG, new char[]{'.'}) : listI1;
            if (strG2 != null) {
                listI1 = tx4.i0(strG2, new char[]{'.'});
            }
            listI0 = listI2.size() > listI1.size() ? listI2 : listI1;
        }
        if (listY.size() == listI0.size() && ((String) listI0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listI0.get(0)).charAt(0) == '!') {
            size = listY.size();
            size2 = listI0.size();
        } else {
            size = listY.size();
            size2 = listI0.size() + 1;
        }
        int i6 = size - size2;
        bk4 ij0Var = new ij0(y(str), (byte) 0);
        if (i6 < 0) {
            l0.t(du4.w(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            ij0Var = ij0Var instanceof gf1 ? ((gf1) ij0Var).g(i6) : new ff1(ij0Var, i6);
        }
        return dk4.M(ij0Var, ".");
    }
}
