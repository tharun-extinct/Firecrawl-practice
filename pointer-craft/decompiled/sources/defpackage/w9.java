package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w9 extends nz1 implements my1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.i = b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[LOOP:0: B:23:0x006d->B:33:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0159 A[LOOP:4: B:73:0x012b->B:83:0x0159, LOOP_END] */
    @Override // defpackage.my1
    public final Object g() throws Exception {
        ContentCaptureSession contentCaptureSessionG;
        ib3 ib3Var;
        ah3 ah3Var;
        byte b = this.i;
        og5 og5Var = og5.g;
        Object obj = this.t;
        switch (b) {
            case 0:
                View view = (View) obj;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    t70.n(view);
                }
                if (i < 29 || (contentCaptureSessionG = hy3.g(view)) == null) {
                    return null;
                }
                return rk4.U(contentCaptureSessionG, view);
            case 1:
                jt1 jt1Var = (jt1) obj;
                ib3 ib3Var2 = jt1Var.r;
                ib3 ib3Var3 = jt1Var.n;
                nt1 nt1Var = jt1Var.g;
                cu1 cu1VarX = nt1Var.x();
                xt1 xt1Var = xt1.a;
                if (cu1VarX == null) {
                    Object[] objArr = ib3Var3.y;
                    long[] jArr = ib3Var3.g;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            ib3Var = ib3Var3;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        ((ct1) objArr[(i2 << 3) + i4]).c0(xt1Var);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                        ib3Var3 = ib3Var;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                                ib3Var3 = ib3Var;
                            }
                        }
                    } else {
                        ib3Var = ib3Var3;
                    }
                } else {
                    ib3Var = ib3Var3;
                    if (cu1VarX.h) {
                        if (ib3Var2.r(cu1VarX)) {
                            cu1VarX.W0();
                        }
                        xt1 xt1VarV0 = cu1VarX.V0();
                        if (!cu1VarX.j.h) {
                            mc2.y("visitAncestors called on an unattached node");
                        }
                        i73 i73Var = cu1VarX.j;
                        um2 um2VarV = k33.V(cu1VarX);
                        int i5 = 0;
                        while (um2VarV != null) {
                            if ((um2VarV.M.x.m & 5120) != 0) {
                                while (i73Var != null) {
                                    int i6 = i73Var.a;
                                    if ((i6 & 5120) != 0) {
                                        if ((i6 & 1024) != 0) {
                                            i5++;
                                        }
                                        if ((i73Var instanceof ct1) && ib3Var.r(i73Var)) {
                                            if (i5 <= 1) {
                                                ((ct1) i73Var).c0(xt1VarV0);
                                            } else {
                                                ((ct1) i73Var).c0(xt1.t);
                                            }
                                            ib3Var.q(i73Var);
                                        }
                                    }
                                    i73Var = i73Var.q;
                                }
                            }
                            um2VarV = um2VarV.o();
                            i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
                        }
                        Object[] objArr2 = ib3Var.y;
                        long[] jArr2 = ib3Var.g;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j2 = jArr2[i7];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((j2 & 255) < 128) {
                                            ((ct1) objArr2[(i7 << 3) + i9]).c0(xt1Var);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i8 == 8) {
                                        if (i7 != length2) {
                                            i7++;
                                        }
                                    }
                                } else if (i7 != length2) {
                                    i7++;
                                }
                            }
                        }
                    }
                }
                if (nt1Var.x() == null || nt1Var.r.V0() == xt1Var) {
                    nt1Var.r();
                }
                ib3Var2.y();
                ib3Var.y();
                jt1Var.v = false;
                return og5Var;
            case 2:
                return Boolean.valueOf(cu1.Z0(((hu1) obj).C));
            default:
                x94 x94Var = (x94) obj;
                ku0 ku0Var = x94Var.g;
                if (ku0Var == null) {
                    yf2.Y("coroutineScope");
                    throw null;
                }
                k33.d(ku0Var, null);
                x94Var.j();
                t51 t51Var = x94Var.v;
                if (t51Var == null) {
                    yf2.Y("connectionManager");
                    throw null;
                }
                ((fq0) t51Var.x).close();
                iz4 iz4Var = (iz4) t51Var.l;
                if (iz4Var != null) {
                    iz4Var.close();
                }
                return og5Var;
        }
    }
}
