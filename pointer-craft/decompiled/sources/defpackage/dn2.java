package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dn2 implements u33 {
    public final /* synthetic */ u33 g;
    public final /* synthetic */ u33 n;
    public final /* synthetic */ int r;
    public final /* synthetic */ in2 y;

    public dn2(u33 u33Var, in2 in2Var, int i, u33 u33Var2) {
        this.y = in2Var;
        this.r = i;
        this.n = u33Var2;
        this.g = u33Var;
    }

    @Override // defpackage.u33
    public final int g() {
        return this.g.g();
    }

    @Override // defpackage.u33
    public final xy1 l() {
        return this.g.l();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[LOOP:0: B:5:0x0019->B:27:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[EDGE_INSN: B:31:0x0084->B:28:0x0084 BREAK  A[LOOP:0: B:5:0x0019->B:27:0x0081], SYNTHETIC] */
    @Override // defpackage.u33
    public final void n() {
        int i = this.r;
        in2 in2Var = this.y;
        in2Var.q = i;
        this.n.n();
        rb3 rb3Var = in2Var.z;
        hb3 hb3Var = in2Var.u;
        long[] jArr = hb3Var.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = hb3Var.y[i6];
                            oy4 oy4Var = (oy4) hb3Var.r[i6];
                            int iM = rb3Var.m(obj);
                            if (iM < 0 || iM >= in2Var.q) {
                                if (iM >= 0) {
                                    Object obj2 = gp4.F;
                                    Object[] objArr = rb3Var.j;
                                    Object obj3 = objArr[iM];
                                    objArr[iM] = obj2;
                                }
                                if (in2Var.s.y(obj)) {
                                    oy4Var.g();
                                }
                                hb3Var.w(i6);
                            } else {
                                i3 = i3;
                            }
                        } else {
                            i3 = i3;
                        }
                        j >>= i3;
                        i5++;
                        i3 = i3;
                    }
                    if (i4 != i3) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        in2Var.l(in2Var.m);
    }

    @Override // defpackage.u33
    public final Map r() {
        return this.g.r();
    }

    @Override // defpackage.u33
    public final bz1 v() {
        return this.g.v();
    }

    @Override // defpackage.u33
    public final xy1 x() {
        return this.g.x();
    }

    @Override // defpackage.u33
    public final int y() {
        return this.g.y();
    }
}
