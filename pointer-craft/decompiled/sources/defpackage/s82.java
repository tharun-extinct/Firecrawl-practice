package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class s82 implements Closeable {
    public static final Logger m;
    public final w72 a;
    public final h34 j;
    public final r82 t;

    static {
        Logger logger = Logger.getLogger(g82.class.getName());
        logger.getClass();
        m = logger;
    }

    public s82(h34 h34Var) {
        this.j = h34Var;
        r82 r82Var = new r82(h34Var);
        this.t = r82Var;
        this.a = new w72(r82Var);
    }

    public final void a(b71 b71Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            uo1.t("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bT = this.j.t();
            byte[] bArr = us5.g;
            i4 = bT & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            h34 h34Var = this.j;
            h34Var.w();
            h34Var.t();
            byte[] bArr2 = us5.g;
            i -= 5;
        }
        List listT = t(eh6.j(i, i2, i4), i4, i2, i3);
        p82 p82Var = (p82) b71Var.a;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            a35.y(p82Var.b, p82Var.a + '[' + i3 + "] onHeaders", new k82(p82Var, i3, listT, z2));
            return;
        }
        synchronized (p82Var) {
            w82 w82VarX = p82Var.x(i3);
            if (w82VarX != null) {
                w82VarX.a(ws5.a(listT), z2);
                return;
            }
            if (p82Var.w) {
                return;
            }
            if (i3 <= p82Var.m) {
                return;
            }
            if (i3 % 2 == p82Var.q % 2) {
                return;
            }
            w82 w82Var = new w82(i3, p82Var, false, z2, ws5.a(listT));
            p82Var.m = i3;
            p82Var.t.put(Integer.valueOf(i3), w82Var);
            a35.y(p82Var.c.n(), p82Var.a + '[' + i3 + "] onStream", new p2(p82Var, w82Var, (byte) 28));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j.close();
    }

    public final List t(int i, int i2, int i3, int i4) throws IOException {
        r82 r82Var = this.t;
        r82Var.m = i;
        r82Var.q = i2;
        r82Var.t = i3;
        r82Var.a = i4;
        w72 w72Var = this.a;
        h34 h34Var = w72Var.n;
        while (!h34Var.y()) {
            byte bT = h34Var.t();
            byte[] bArr = us5.g;
            int i5 = bT & 255;
            if (i5 == 128) {
                uo1.t("index == 0");
                return null;
            }
            if ((bT & 128) == 128) {
                int iX = w72Var.x(i5, 127);
                int i6 = iX - 1;
                if (i6 >= 0) {
                    b52[] b52VarArr = y72.g;
                    if (i6 <= b52VarArr.length - 1) {
                        w72Var.g(b52VarArr[i6]);
                    }
                }
                int length = w72Var.x + 1 + (i6 - y72.g.length);
                if (length >= 0) {
                    b52[] b52VarArr2 = w72Var.v;
                    if (length < b52VarArr2.length) {
                        b52 b52Var = b52VarArr2[length];
                        b52Var.getClass();
                        w72Var.g(b52Var);
                    }
                }
                uo1.t(xi3.j("Header index too large ", iX));
                return null;
            }
            if (i5 == 64) {
                b52[] b52VarArr3 = y72.g;
                fa0 fa0VarV = w72Var.v();
                y72.g(fa0VarV);
                w72Var.n(new b52(fa0VarV, w72Var.v()));
            } else if ((bT & 64) == 64) {
                w72Var.n(new b52(w72Var.r(w72Var.x(i5, 63) - 1), w72Var.v()));
            } else if ((bT & 32) == 32) {
                int iX2 = w72Var.x(i5, 31);
                w72Var.g = iX2;
                if (iX2 < 0 || iX2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + w72Var.g);
                }
                int i7 = w72Var.j;
                if (iX2 < i7) {
                    if (iX2 == 0) {
                        b52[] b52VarArr4 = w72Var.v;
                        pr.T(0, b52VarArr4.length, null, b52VarArr4);
                        w72Var.x = w72Var.v.length - 1;
                        w72Var.l = 0;
                        w72Var.j = 0;
                    } else {
                        w72Var.y(i7 - iX2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                b52[] b52VarArr5 = y72.g;
                fa0 fa0VarV2 = w72Var.v();
                y72.g(fa0VarV2);
                w72Var.g(new b52(fa0VarV2, w72Var.v()));
            } else {
                w72Var.g(new b52(w72Var.r(w72Var.x(i5, 15) - 1), w72Var.v()));
            }
        }
        ArrayList arrayList = w72Var.y;
        List listF0 = cj0.F0(arrayList);
        arrayList.clear();
        w72Var.r = 0L;
        return listF0;
    }

    public final void w(b71 b71Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            uo1.t("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        byte b = 0;
        if ((i2 & 8) != 0) {
            byte bT = this.j.t();
            byte[] bArr = us5.g;
            i4 = bT & 255;
        } else {
            i4 = 0;
        }
        int iW = this.j.w() & Integer.MAX_VALUE;
        List listT = t(eh6.j(i - 4, i2, i4), i4, i2, i3);
        p82 p82Var = (p82) b71Var.a;
        synchronized (p82Var) {
            if (p82Var.G.contains(Integer.valueOf(iW))) {
                p82Var.b(iW, kk1.m);
                return;
            }
            p82Var.G.add(Integer.valueOf(iW));
            a35.y(p82Var.b, p82Var.a + '[' + iW + "] onRequest", new k82(p82Var, iW, listT, b));
        }
    }

    public final void x(b71 b71Var, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            uo1.t("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            uo1.t("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bT = this.j.t();
            byte[] bArr = us5.g;
            i4 = bT & 255;
        } else {
            i4 = 0;
        }
        final int iJ = eh6.j(i, i2, i4);
        h34 h34Var = this.j;
        final p82 p82Var = (p82) b71Var.a;
        if (i3 != 0 && (i3 & 1) == 0) {
            final c70 c70Var = new c70();
            long j = iJ;
            h34Var.o(j);
            h34Var.j(j, c70Var);
            a35.y(p82Var.b, p82Var.a + '[' + i3 + "] onData", new my1(i3, c70Var, iJ, z3) { // from class: j82
                public final /* synthetic */ c70 a;
                public final /* synthetic */ int m;
                public final /* synthetic */ int t;

                @Override // defpackage.my1
                public final Object g() {
                    p82 p82Var2 = this.j;
                    int i5 = this.t;
                    c70 c70Var2 = this.a;
                    int i6 = this.m;
                    try {
                        p82Var2.p.getClass();
                        c70Var2.k(i6);
                        p82Var2.E.b(i5, kk1.i);
                        synchronized (p82Var2) {
                            p82Var2.G.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return og5.g;
                }
            });
        } else {
            w82 w82VarX = p82Var.x(i3);
            if (w82VarX == null) {
                ((p82) b71Var.a).b(i3, kk1.m);
                long j2 = iJ;
                ((p82) b71Var.a).w(j2);
                h34Var.f(j2);
            } else {
                TimeZone timeZone = ws5.g;
                u82 u82Var = w82VarX.i;
                long j3 = iJ;
                u82Var.getClass();
                long j4 = j3;
                while (true) {
                    w82 w82Var = u82Var.w;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = ws5.g;
                        w82Var.t.w(j3);
                        u82Var.w.t.k.getClass();
                        break;
                    }
                    synchronized (w82Var) {
                        z = u82Var.t;
                        z2 = u82Var.m.t + j4 > u82Var.j;
                    }
                    if (z2) {
                        h34Var.f(j4);
                        u82Var.w.x(kk1.w);
                        break;
                    }
                    if (z) {
                        h34Var.f(j4);
                        break;
                    }
                    long j5 = h34Var.j(j4, u82Var.a);
                    if (j5 == -1) {
                        throw new EOFException();
                    }
                    j4 -= j5;
                    w82 w82Var2 = u82Var.w;
                    synchronized (w82Var2) {
                        try {
                            if (u82Var.q) {
                                c70 c70Var2 = u82Var.a;
                                c70Var2.k(c70Var2.t);
                            } else {
                                c70 c70Var3 = u82Var.m;
                                boolean z4 = c70Var3.t == 0;
                                c70Var3.E(u82Var.a);
                                if (z4) {
                                    w82Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    w82VarX.a(c52.t, true);
                }
            }
        }
        this.j.f(i4);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f4 A[Catch: all -> 0x02fa, TRY_LEAVE, TryCatch #4 {, blocks: (B:194:0x02ee, B:196:0x02f4), top: B:234:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0301  */
    /* JADX WARN: Code duplicated, block: B:230:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    public final boolean y(boolean z, b71 b71Var) throws Exception {
        p82 p82Var;
        w82 w82VarT;
        fa0 fa0VarA;
        p82 p82Var2;
        try {
            this.j.o(9L);
            int iW = us5.w(this.j);
            if (iW > 16384) {
                uo1.t(xi3.j("FRAME_SIZE_ERROR: ", iW));
                return false;
            }
            int iT = this.j.t() & 255;
            byte bT = this.j.t();
            int i = bT & 255;
            int iW2 = this.j.w();
            int i2 = Integer.MAX_VALUE & iW2;
            byte b = 1;
            if (iT != 8) {
                Logger logger = m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g82.y(true, i2, iW, iT, i));
                }
            }
            if (z && iT != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + g82.g(iT));
            }
            kk1 kk1Var = null;
            switch (iT) {
                case 0:
                    x(b71Var, iW, i, i2);
                    return true;
                case 1:
                    a(b71Var, iW, i, i2);
                    return true;
                case 2:
                    if (iW != 5) {
                        uo1.t(du4.w(iW, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i2 == 0) {
                        uo1.t("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    h34 h34Var = this.j;
                    h34Var.w();
                    h34Var.t();
                    return true;
                case 3:
                    if (iW != 4) {
                        uo1.t(du4.w(iW, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i2 == 0) {
                        uo1.t("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iW3 = this.j.w();
                    kk1.t.getClass();
                    for (kk1 kk1Var2 : kk1.values()) {
                        if (kk1Var2.j == iW3) {
                            kk1Var = kk1Var2;
                            if (kk1Var != null) {
                                uo1.t(xi3.j("TYPE_RST_STREAM unexpected error code: ", iW3));
                                return false;
                            }
                            p82Var = (p82) b71Var.a;
                            if (i2 == 0 && (iW2 & 1) == 0) {
                                a35.y(p82Var.b, p82Var.a + '[' + i2 + "] onReset", new k82(p82Var, i2, kk1Var, b));
                                return true;
                            }
                            w82VarT = p82Var.t(i2);
                            if (w82VarT != null) {
                                synchronized (w82VarT) {
                                    if (w82VarT.l() == null) {
                                        w82VarT.u = kk1Var;
                                        w82VarT.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (kk1Var != null) {
                        uo1.t(xi3.j("TYPE_RST_STREAM unexpected error code: ", iW3));
                        return false;
                    }
                    p82Var = (p82) b71Var.a;
                    if (i2 == 0) {
                    }
                    w82VarT = p82Var.t(i2);
                    if (w82VarT != null) {
                        synchronized (w82VarT) {
                            if (w82VarT.l() == null) {
                                w82VarT.u = kk1Var;
                                w82VarT.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    h34 h34Var2 = this.j;
                    if (i2 != 0) {
                        uo1.t("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bT & 1) != 0) {
                        if (iW != 0) {
                            uo1.t("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iW % 6 != 0) {
                        uo1.t(xi3.j("TYPE_SETTINGS length % 6 != 0: ", iW));
                        return false;
                    }
                    pl4 pl4Var = new pl4();
                    ke2 ke2VarG = xs2.G(xs2.K(0, iW), 6);
                    int i3 = ke2VarG.j;
                    int i4 = ke2VarG.t;
                    int i5 = ke2VarG.a;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            short sB = h34Var2.b();
                            byte[] bArr = us5.g;
                            int i6 = sB & 65535;
                            int iW4 = h34Var2.w();
                            if (i6 != 2) {
                                if (i6 != 4) {
                                    if (i6 == 5 && (iW4 < 16384 || iW4 > 16777215)) {
                                        uo1.t(xi3.j("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", iW4));
                                        return false;
                                    }
                                } else if (iW4 < 0) {
                                    uo1.t("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (iW4 != 0 && iW4 != 1) {
                                uo1.t("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            pl4Var.y(i6, iW4);
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                    p82 p82Var3 = (p82) b71Var.a;
                    a35.y(p82Var3.i, du4.b(new StringBuilder(), p82Var3.a, " applyAndAckSettings"), new p2(b71Var, pl4Var, (byte) 29));
                    return true;
                case 5:
                    w(b71Var, iW, i, i2);
                    return true;
                case 6:
                    if (iW != 8) {
                        uo1.t(xi3.j("TYPE_PING length != 8: ", iW));
                        return false;
                    }
                    if (i2 != 0) {
                        uo1.t("TYPE_PING streamId != 0");
                        return false;
                    }
                    final int iW5 = this.j.w();
                    final int iW6 = this.j.w();
                    i = (bT & 1) != 0 ? 1 : 0;
                    p82 p82Var4 = (p82) b71Var.a;
                    if (i == 0) {
                        a35 a35Var = p82Var4.i;
                        String strB = du4.b(new StringBuilder(), ((p82) b71Var.a).a, " ping");
                        final p82 p82Var5 = (p82) b71Var.a;
                        a35.y(a35Var, strB, new my1() { // from class: n82
                            @Override // defpackage.my1
                            public final Object g() {
                                p82 p82Var6 = p82Var5;
                                try {
                                    p82Var6.E.i(iW5, iW6, true);
                                } catch (IOException e) {
                                    kk1 kk1Var3 = kk1.m;
                                    p82Var6.y(kk1Var3, kk1Var3, e);
                                }
                                return og5.g;
                            }
                        });
                        return true;
                    }
                    synchronized (p82Var4) {
                        try {
                            if (iW5 == 1) {
                                p82Var4.z++;
                            } else if (iW5 == 2) {
                                p82Var4.o++;
                            } else if (iW5 == 3) {
                                p82Var4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iW < 8) {
                        uo1.t(xi3.j("TYPE_GOAWAY length < 8: ", iW));
                        return false;
                    }
                    if (i2 != 0) {
                        uo1.t("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iW7 = this.j.w();
                    int iW8 = this.j.w();
                    int i7 = iW - 8;
                    kk1.t.getClass();
                    for (kk1 kk1Var3 : kk1.values()) {
                        if (kk1Var3.j == iW8) {
                            kk1Var = kk1Var3;
                            if (kk1Var != null) {
                                uo1.t(xi3.j("TYPE_GOAWAY unexpected error code: ", iW8));
                                return false;
                            }
                            fa0VarA = fa0.m;
                            if (i7 > 0) {
                                fa0VarA = this.j.a(i7);
                            }
                            fa0VarA.getClass();
                            fa0VarA.y();
                            p82Var2 = (p82) b71Var.a;
                            synchronized (p82Var2) {
                                Object[] array = p82Var2.t.values().toArray(new w82[0]);
                                p82Var2.w = true;
                            }
                            for (w82 w82Var : (w82[]) array) {
                                if (w82Var.j <= iW7 && w82Var.j()) {
                                    kk1 kk1Var4 = kk1.c;
                                    synchronized (w82Var) {
                                        if (w82Var.l() == null) {
                                            w82Var.u = kk1Var4;
                                            w82Var.notifyAll();
                                        }
                                        break;
                                    }
                                    ((p82) b71Var.a).t(w82Var.j);
                                }
                            }
                            return true;
                        }
                    }
                    if (kk1Var != null) {
                        uo1.t(xi3.j("TYPE_GOAWAY unexpected error code: ", iW8));
                        return false;
                    }
                    fa0VarA = fa0.m;
                    if (i7 > 0) {
                        fa0VarA = this.j.a(i7);
                    }
                    fa0VarA.getClass();
                    fa0VarA.y();
                    p82Var2 = (p82) b71Var.a;
                    synchronized (p82Var2) {
                        Object[] array2 = p82Var2.t.values().toArray(new w82[0]);
                        p82Var2.w = true;
                        while (i < r13) {
                            if (w82Var.j <= iW7) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iW != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iW);
                        }
                        long jW = ((long) this.j.w()) & 2147483647L;
                        if (jW == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = m;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(g82.r(true, i2, iW, jW));
                        }
                        p82 p82Var6 = (p82) b71Var.a;
                        if (i2 == 0) {
                            synchronized (p82Var6) {
                                p82Var6.C += jW;
                                p82Var6.notifyAll();
                            }
                            return true;
                        }
                        w82 w82VarX = p82Var6.x(i2);
                        if (w82VarX != null) {
                            synchronized (w82VarX) {
                                w82VarX.q += jW;
                                if (jW > 0) {
                                    w82VarX.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        m.fine(g82.y(true, i2, iW, 8, i));
                        throw e;
                    }
                default:
                    this.j.f(iW);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }
}
