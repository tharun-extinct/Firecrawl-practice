package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yi0 {
    public fa4 g;
    public static final Logger y = Logger.getLogger(yi0.class.getName());
    public static final boolean r = ih5.v;

    public static int A(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int B(int i, long j) {
        return C(j) + d(i);
    }

    public static int C(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int a(int i, s0 s0Var, le4 le4Var) {
        return s0Var.g(le4Var) + (d(i) * 2);
    }

    public static int b(s0 s0Var, le4 le4Var) {
        int iG = s0Var.g(le4Var);
        return A(iG) + iG;
    }

    public static int c(long j) {
        return C(j);
    }

    public static int d(int i) {
        return A(i << 3);
    }

    public static int e(int i, int i2) {
        return A(i2) + d(i);
    }

    public static int f(String str, int i) {
        return k(str) + d(i);
    }

    public static int g(int i) {
        return d(i) + 1;
    }

    public static int h(int i, long j) {
        return o(j) + d(i);
    }

    public static int i(int i, s0 s0Var, le4 le4Var) {
        return b(s0Var, le4Var) + d(i);
    }

    public static int j(int i) {
        return d(i) + 8;
    }

    public static int k(String str) {
        int length;
        try {
            length = ei5.g(str);
        } catch (ci5 unused) {
            length = str.getBytes(ff2.g).length;
        }
        return A(length) + length;
    }

    public static int l(int i) {
        return d(i) + 4;
    }

    public static int m(int i, int i2) {
        return C(i2) + d(i);
    }

    public static int n(int i) {
        return d(i) + 8;
    }

    public static int o(long j) {
        return C((j >> 63) ^ (j << 1));
    }

    public static int p(int i) {
        return d(i) + 8;
    }

    public static int q(int i) {
        return C(i);
    }

    public static int r(ea0 ea0Var) {
        int size = ea0Var.size();
        return A(size) + size;
    }

    public static int s(int i) {
        return d(i) + 4;
    }

    public static int t(int i) {
        return d(i) + 4;
    }

    public static int u(int i, int i2) {
        return z(i2) + d(i);
    }

    public static int v(int i, int i2) {
        return C(i2) + d(i);
    }

    public static int w(int i, long j) {
        return C(j) + d(i);
    }

    public static int x(int i) {
        return C(i);
    }

    public static int y(int i, ea0 ea0Var) {
        return r(ea0Var) + d(i);
    }

    public static int z(int i) {
        return A((i >> 31) ^ (i << 1));
    }

    public final void D(String str, ci5 ci5Var) throws ui0 {
        y.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ci5Var);
        byte[] bytes = str.getBytes(ff2.g);
        try {
            S(bytes.length);
            N(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(e);
        }
    }

    public abstract void E(byte b);

    public abstract void F(int i, boolean z);

    public abstract void G(int i, ea0 ea0Var);

    public abstract void H(int i, int i2);

    public abstract void I(int i);

    public abstract void J(int i, long j);

    public abstract void K(long j);

    public abstract void L(int i, int i2);

    public abstract void M(int i);

    public abstract void N(byte[] bArr, int i, int i2);

    public abstract void O(int i, s0 s0Var, le4 le4Var);

    public abstract void P(String str, int i);

    public abstract void Q(int i, int i2);

    public abstract void R(int i, int i2);

    public abstract void S(int i);

    public abstract void T(int i, long j);

    public abstract void U(long j);
}
