package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class o42 implements hu4 {
    public final Inflater a;
    public byte j;
    public final gc2 m;
    public final CRC32 q;
    public final h34 t;

    public o42(r70 r70Var) {
        r70Var.getClass();
        h34 h34Var = new h34(r70Var);
        this.t = h34Var;
        Inflater inflater = new Inflater(true);
        this.a = inflater;
        this.m = new gc2(h34Var, inflater);
        this.q = new CRC32();
    }

    public static void y(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + tx4.b0(ui4.r(i2), 8) + " != expected 0x" + tx4.b0(ui4.r(i), 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        long j2;
        long j3;
        c70 c70Var2;
        o42 o42Var = this;
        h34 h34Var = o42Var.t;
        c70 c70Var3 = h34Var.t;
        byte b = o42Var.j;
        CRC32 crc32 = o42Var.q;
        if (b == 0) {
            h34Var.o(10L);
            byte bX = c70Var3.x(3L);
            boolean z = ((bX >> 1) & 1) == 1;
            if (z) {
                o42Var.x(c70Var3, 0L, 10L);
            }
            y(8075, h34Var.b(), "ID1ID2");
            h34Var.f(8L);
            if (((bX >> 2) & 1) == 1) {
                h34Var.o(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    x(c70Var3, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                short sH = c70Var3.h();
                long j4 = ((short) (((sH & 255) << 8) | ((sH & 65280) >>> 8))) & 65535;
                h34Var.o(j4);
                if (z) {
                    x(c70Var3, 0L, j4);
                }
                h34Var.f(j4);
            } else {
                j3 = 2;
                j2 = -1;
            }
            if (((bX >> 3) & 1) == 1) {
                long jX = h34Var.x((byte) 0, 0L, Long.MAX_VALUE);
                if (jX == j2) {
                    throw new EOFException();
                }
                if (z) {
                    x(c70Var3, 0L, jX + 1);
                }
                h34Var.f(jX + 1);
            }
            if (((bX >> 4) & 1) == 1) {
                long jX2 = h34Var.x((byte) 0, 0L, Long.MAX_VALUE);
                if (jX2 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    o42Var = this;
                    c70Var2 = c70Var3;
                    o42Var.x(c70Var2, 0L, jX2 + 1);
                } else {
                    o42Var = this;
                    c70Var2 = c70Var3;
                }
                h34Var.f(jX2 + 1);
            } else {
                o42Var = this;
            }
            if (z) {
                c70Var2 = c70Var3;
                h34Var.o(j3);
                short sH2 = c70Var2.h();
                y((short) (((sH2 & 255) << 8) | ((sH2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c70Var2 = c70Var3;
            o42Var.j = (byte) 1;
            b = 1;
        } else {
            j2 = -1;
        }
        if (b == 1) {
            long j5 = c70Var.t;
            long j6 = o42Var.m.j(8192L, c70Var);
            if (j6 != j2) {
                o42Var.x(c70Var, j5, j6);
                return j6;
            }
            o42Var.j = (byte) 2;
            b = 2;
        }
        if (b == 2) {
            y(h34Var.i(), (int) crc32.getValue(), "CRC");
            y(h34Var.i(), (int) o42Var.a.getBytesWritten(), "ISIZE");
            o42Var.j = (byte) 3;
            if (!h34Var.y()) {
                uo1.t("gzip finished without exhausting source");
                return 0L;
            }
        }
        return j2;
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.t.j.r();
    }

    public final void x(c70 c70Var, long j, long j2) {
        mh4 mh4Var = c70Var.j;
        mh4Var.getClass();
        while (true) {
            long j3 = mh4Var.r - mh4Var.y;
            if (j < j3) {
                break;
            }
            j -= j3;
            mh4Var = mh4Var.x;
            mh4Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) mh4Var.y) + j);
            int iMin = (int) Math.min(mh4Var.r - i, j2);
            this.q.update(mh4Var.g, i, iMin);
            j2 -= (long) iMin;
            mh4Var = mh4Var.x;
            mh4Var.getClass();
            j = 0;
        }
    }
}
