package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class x32 {
    public boolean A;
    public RectF B;
    public float a;
    public cd b;
    public boolean c;
    public int d;
    public long e;
    public int f;
    public final z32 g;
    public long h;
    public pb0 i;
    public int k;
    public br2 m;
    public int o;
    public ld q;
    public int s;
    public boolean u;
    public ld w;
    public Outline x;
    public long z;
    public j51 y = og0.u;
    public fl2 r = fl2.j;
    public xy1 n = vg.e;
    public final zg v = new zg(this, 7);
    public boolean l = true;
    public long j = 0;
    public long t = 9205357640488583168L;
    public final fe0 p = new fe0();

    static {
        yf2.p(Build.FINGERPRINT, "robolectric");
    }

    public x32(z32 z32Var) {
        this.g = z32Var;
        z32Var.z(false);
        this.z = 0L;
        this.h = 0L;
        this.e = 9205357640488583168L;
    }

    public final void g() {
        Outline outline;
        if (this.l) {
            boolean z = this.A;
            Outline outline2 = null;
            z32 z32Var = this.g;
            if (z || z32Var.G() > 0.0f) {
                ld ldVar = this.q;
                if (ldVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = ldVar instanceof ld;
                    if (!z2) {
                        uo1.u("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ldVar.g;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.x;
                        if (outline == null) {
                            outline = new Outline();
                            this.x = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                uo1.u("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                uo1.u("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.o, this.f);
                        this.c = !outline.canClip();
                    } else {
                        Outline outline3 = this.x;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.c = true;
                        outline = null;
                    }
                    this.q = ldVar;
                    if (outline != null) {
                        outline.setAlpha(z32Var.g());
                        outline2 = outline;
                    }
                    z32Var.q(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.c && this.A) {
                        z32Var.z(false);
                        z32Var.b();
                    } else {
                        z32Var.z(this.A);
                    }
                } else {
                    z32Var.z(this.A);
                    Outline outline4 = this.x;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.x = outline4;
                    }
                    Outline outline5 = outline4;
                    long jN = y94.N(this.h);
                    long j = this.j;
                    long j2 = this.t;
                    if (j2 != 9205357640488583168L) {
                        jN = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jN >> 32);
                    int i5 = (int) (jN & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.a);
                    outline5.setAlpha(z32Var.g());
                    z32Var.q(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                z32Var.z(false);
                z32Var.q(null, 0L);
            }
        }
        this.l = false;
    }

    public final br2 n() {
        br2 ym3Var;
        br2 br2Var = this.m;
        ld ldVar = this.q;
        if (br2Var != null) {
            return br2Var;
        }
        if (ldVar != null) {
            xm3 xm3Var = new xm3(ldVar);
            this.m = xm3Var;
            return xm3Var;
        }
        long jN = y94.N(this.h);
        long j = this.j;
        long j2 = this.t;
        if (j2 != 9205357640488583168L) {
            jN = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jN >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jN & 4294967295L)) + fIntBitsToFloat2;
        float f = this.a;
        if (f > 0.0f) {
            ym3Var = new zm3(v13.r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            ym3Var = new ym3(new k44(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.m = ym3Var;
        return ym3Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void r(xd1 xd1Var) {
        fe0 fe0Var = this.p;
        fe0Var.r = (x32) fe0Var.y;
        ib3 ib3Var = (ib3) fe0Var.n;
        if (ib3Var != null && ib3Var.j()) {
            ib3 ib3Var2 = (ib3) fe0Var.v;
            if (ib3Var2 == null) {
                ib3 ib3Var3 = fe4.g;
                ib3Var2 = new ib3();
                fe0Var.v = ib3Var2;
            }
            ib3Var2.a(ib3Var);
            ib3Var.y();
        }
        fe0Var.g = true;
        this.n.a(xd1Var);
        fe0Var.g = false;
        x32 x32Var = (x32) fe0Var.r;
        if (x32Var != null) {
            x32Var.s--;
            x32Var.y();
        }
        ib3 ib3Var4 = (ib3) fe0Var.v;
        if (ib3Var4 == null || !ib3Var4.j()) {
            return;
        }
        Object[] objArr = ib3Var4.y;
        long[] jArr = ib3Var4.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            x32 x32Var2 = (x32) objArr[(i << 3) + i3];
                            x32Var2.s--;
                            x32Var2.y();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ib3Var4.y();
    }

    public final void v(float f) {
        z32 z32Var = this.g;
        if (z32Var.g() == f) {
            return;
        }
        z32Var.r(f);
    }

    public final void x(long j, long j2, float f) {
        float f2 = this.o;
        long jV = wi3.v(j, (((long) Float.floatToRawIntBits(this.f)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (wi3.y(this.j, jV) && cq4.g(this.t, j2) && this.a == f && this.q == null) {
            return;
        }
        this.m = null;
        this.q = null;
        this.l = true;
        this.c = false;
        this.j = jV;
        this.t = j2;
        this.a = f;
        g();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void y() {
        if (this.u && this.s == 0) {
            fe0 fe0Var = this.p;
            x32 x32Var = (x32) fe0Var.y;
            if (x32Var != null) {
                x32Var.s--;
                x32Var.y();
                fe0Var.y = null;
            }
            ib3 ib3Var = (ib3) fe0Var.n;
            if (ib3Var != null) {
                Object[] objArr = ib3Var.y;
                long[] jArr = ib3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    x32 x32Var2 = (x32) objArr[(i << 3) + i3];
                                    x32Var2.s--;
                                    x32Var2.y();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                ib3Var.y();
            }
            this.g.b();
        }
    }
}
