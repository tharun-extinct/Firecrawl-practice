package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class h34 implements r70 {
    public boolean a;
    public final hu4 j;
    public final c70 t;

    public h34(hu4 hu4Var) {
        hu4Var.getClass();
        this.j = hu4Var;
        this.t = new c70();
    }

    @Override // defpackage.r70
    public final int B(sm3 sm3Var) throws EOFException {
        c70 c70Var;
        sm3Var.getClass();
        if (this.a) {
            l0.z("closed");
            return 0;
        }
        do {
            c70Var = this.t;
            int iY = y.y(c70Var, sm3Var, true);
            if (iY != -2) {
                if (iY == -1) {
                    break;
                }
                c70Var.k(sm3Var.j[iY].y());
                return iY;
            }
        } while (this.j.j(8192L, c70Var) != -1);
        return -1;
    }

    @Override // defpackage.r70
    public final String N(Charset charset) {
        charset.getClass();
        hu4 hu4Var = this.j;
        c70 c70Var = this.t;
        c70Var.E(hu4Var);
        return c70Var.o(c70Var.t, charset);
    }

    public final fa0 a(long j) throws EOFException {
        o(j);
        return this.t.i(j);
    }

    public final short b() throws EOFException {
        o(2L);
        return this.t.h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.a) {
            return;
        }
        this.a = true;
        this.j.close();
        c70 c70Var = this.t;
        c70Var.k(c70Var.t);
    }

    public final void f(long j) throws EOFException {
        if (this.a) {
            l0.z("closed");
            return;
        }
        while (j > 0) {
            c70 c70Var = this.t;
            if (c70Var.t == 0 && this.j.j(8192L, c70Var) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c70Var.t);
            c70Var.k(jMin);
            j -= jMin;
        }
    }

    public final boolean h(long j) {
        c70 c70Var;
        if (j < 0) {
            up.t("byteCount < 0: ", j);
            return false;
        }
        if (this.a) {
            l0.z("closed");
            return false;
        }
        do {
            c70Var = this.t;
            if (c70Var.t >= j) {
                return true;
            }
        } while (this.j.j(8192L, c70Var) != -1);
        return false;
    }

    public final int i() throws EOFException {
        o(4L);
        int iU = this.t.u();
        return ((iU & 255) << 24) | (((-16777216) & iU) >>> 24) | ((16711680 & iU) >>> 8) | ((65280 & iU) << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.a;
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) {
        c70Var.getClass();
        if (j < 0) {
            up.t("byteCount < 0: ", j);
            return 0L;
        }
        if (this.a) {
            l0.z("closed");
            return 0L;
        }
        c70 c70Var2 = this.t;
        if (c70Var2.t == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.j.j(8192L, c70Var2) == -1) {
                return -1L;
            }
        }
        return c70Var2.j(Math.min(j, c70Var2.t), c70Var);
    }

    public final void o(long j) throws EOFException {
        if (!h(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.j.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        c70 c70Var = this.t;
        if (c70Var.t == 0 && this.j.j(8192L, c70Var) == -1) {
            return -1;
        }
        return c70Var.read(byteBuffer);
    }

    public final byte t() throws EOFException {
        o(1L);
        return this.t.t();
    }

    public final String toString() {
        return "buffer(" + this.j + ')';
    }

    public final String u(long j) {
        if (j < 0) {
            up.t("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jX = x((byte) 10, 0L, j2);
        c70 c70Var = this.t;
        if (jX != -1) {
            return y.g(jX, c70Var);
        }
        if (j2 < Long.MAX_VALUE && h(j2) && c70Var.x(j2 - 1) == 13 && h(j2 + 1) && c70Var.x(j2) == 10) {
            return y.g(j2, c70Var);
        }
        c70 c70Var2 = new c70();
        long jMin = Math.min(32L, c70Var.t);
        long j3 = 0;
        ui4.g(c70Var.t, 0L, jMin);
        if (jMin != 0) {
            c70Var2.t += jMin;
            mh4 mh4Var = c70Var.j;
            while (true) {
                mh4Var.getClass();
                long j4 = mh4Var.r - mh4Var.y;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                mh4Var = mh4Var.x;
            }
            long j5 = j3;
            long j6 = jMin;
            while (j6 > 0) {
                mh4Var.getClass();
                mh4 mh4VarR = mh4Var.r();
                int i = mh4VarR.y + ((int) j5);
                mh4VarR.y = i;
                mh4VarR.r = Math.min(i + ((int) j6), mh4VarR.r);
                mh4 mh4Var2 = c70Var2.j;
                if (mh4Var2 == null) {
                    mh4VarR.l = mh4VarR;
                    mh4VarR.x = mh4VarR;
                    c70Var2.j = mh4VarR;
                } else {
                    mh4 mh4Var3 = mh4Var2.l;
                    mh4Var3.getClass();
                    mh4Var3.y(mh4VarR);
                }
                j6 -= (long) (mh4VarR.r - mh4VarR.y);
                mh4Var = mh4Var.x;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c70Var.t, j) + " content=" + c70Var2.i(c70Var2.t).r() + (char) 8230);
    }

    public final int w() throws EOFException {
        o(4L);
        return this.t.u();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef A[SYNTHETIC] */
    public final long x(byte b, long j, long j2) {
        mh4 mh4Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7 = 0;
        if (this.a) {
            l0.z("closed");
            return 0L;
        }
        if (0 > j2) {
            up.t("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            c70 c70Var = this.t;
            if (j7 > jMax || jMax > j2) {
                throw new IllegalArgumentException(("size=" + c70Var.t + " fromIndex=" + jMax + " toIndex=" + j2).toString());
            }
            long j8 = c70Var.t;
            long j9 = j2 > j8 ? j8 : j2;
            if (jMax == j9 || (mh4Var = c70Var.j) == null) {
                j3 = j7;
            } else {
                if (j8 - jMax >= jMax) {
                    j3 = j7;
                    j4 = -1;
                    while (true) {
                        long j10 = ((long) (mh4Var.r - mh4Var.y)) + j7;
                        if (j10 > jMax) {
                            break;
                        }
                        mh4Var = mh4Var.x;
                        mh4Var.getClass();
                        j7 = j10;
                    }
                    long j11 = jMax;
                    while (true) {
                        if (j7 >= j9) {
                            j5 = j4;
                            break;
                        }
                        byte[] bArr = mh4Var.g;
                        long j12 = j7;
                        int iMin = (int) Math.min(mh4Var.r, (((long) mh4Var.y) + j9) - j12);
                        for (int i = (int) ((((long) mh4Var.y) + j11) - j12); i < iMin; i++) {
                            if (bArr[i] == b) {
                                j5 = ((long) (i - mh4Var.y)) + j12;
                                break;
                            }
                        }
                        j11 = j12 + ((long) (mh4Var.r - mh4Var.y));
                        mh4Var = mh4Var.x;
                        mh4Var.getClass();
                        j7 = j11;
                    }
                } else {
                    while (j8 > jMax) {
                        mh4Var = mh4Var.l;
                        mh4Var.getClass();
                        j8 -= (long) (mh4Var.r - mh4Var.y);
                        j7 = j7;
                    }
                    j3 = j7;
                    long j13 = jMax;
                    while (true) {
                        if (j8 < j9) {
                            j4 = -1;
                            byte[] bArr2 = mh4Var.g;
                            long j14 = j13;
                            int iMin2 = (int) Math.min(mh4Var.r, (((long) mh4Var.y) + j9) - j8);
                            int i2 = (int) ((((long) mh4Var.y) + j14) - j8);
                            while (true) {
                                if (i2 >= iMin2) {
                                    j13 = ((long) (mh4Var.r - mh4Var.y)) + j8;
                                    mh4Var = mh4Var.x;
                                    mh4Var.getClass();
                                    j8 = j13;
                                } else if (bArr2[i2] == b) {
                                    j5 = ((long) (i2 - mh4Var.y)) + j8;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (j5 != j4) {
                    return j5;
                }
                j6 = c70Var.t;
                if (j6 >= j2 && this.j.j(8192L, c70Var) != j4) {
                    jMax = Math.max(jMax, j6);
                    j7 = j3;
                }
            }
            j4 = -1;
            j5 = j4;
            if (j5 != j4) {
                return j5;
            }
            j6 = c70Var.t;
            return j6 >= j2 ? j4 : j4;
        }
        return -1L;
    }

    public final boolean y() {
        if (this.a) {
            l0.z("closed");
            return false;
        }
        c70 c70Var = this.t;
        return c70Var.y() && this.j.j(8192L, c70Var) == -1;
    }
}
