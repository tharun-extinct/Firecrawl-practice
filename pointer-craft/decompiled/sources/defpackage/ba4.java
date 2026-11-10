package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ba4 implements kz4, jz4 {
    public static final TreeMap b = new TreeMap();
    public final long[] a;
    public final int[] c;
    public int i;
    public final int j;
    public final double[] m;
    public final String[] q;
    public volatile String t;
    public final byte[][] w;

    public ba4(int i) {
        this.j = i;
        int i2 = i + 1;
        this.c = new int[i2];
        this.a = new long[i2];
        this.m = new double[i2];
        this.q = new String[i2];
        this.w = new byte[i2][];
    }

    public static final ba4 x(String str, int i) {
        TreeMap treeMap = b;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                ba4 ba4Var = new ba4(i);
                ba4Var.t = str;
                ba4Var.i = i;
                return ba4Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            ba4 ba4Var2 = (ba4) entryCeilingEntry.getValue();
            ba4Var2.getClass();
            ba4Var2.t = str;
            ba4Var2.i = i;
            return ba4Var2;
        }
    }

    @Override // defpackage.jz4
    public final void G(String str, int i) {
        str.getClass();
        this.c[i] = 4;
        this.q[i] = str;
    }

    public final void a() {
        TreeMap treeMap = b;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.j), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.jz4
    public final void c(int i, double d) {
        this.c[i] = 3;
        this.m[i] = d;
    }

    @Override // defpackage.jz4
    public final void g(int i) {
        this.c[i] = 1;
    }

    @Override // defpackage.jz4
    public final void l(int i, byte[] bArr) {
        this.c[i] = 5;
        this.w[i] = bArr;
    }

    @Override // defpackage.jz4
    public final void n(int i, long j) {
        this.c[i] = 2;
        this.a[i] = j;
    }

    @Override // defpackage.kz4
    public final void t(jz4 jz4Var) {
        int i = this.i;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.c[i2];
            if (i3 == 1) {
                jz4Var.g(i2);
            } else if (i3 == 2) {
                jz4Var.n(i2, this.a[i2]);
            } else if (i3 == 3) {
                jz4Var.c(i2, this.m[i2]);
            } else if (i3 == 4) {
                String str = this.q[i2];
                if (str == null) {
                    l0.u("Required value was null.");
                    return;
                }
                jz4Var.G(str, i2);
            } else if (i3 == 5) {
                byte[] bArr = this.w[i2];
                if (bArr == null) {
                    l0.u("Required value was null.");
                    return;
                }
                jz4Var.l(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.kz4
    public final String y() {
        String str = this.t;
        if (str != null) {
            return str;
        }
        l0.z("Required value was null.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
