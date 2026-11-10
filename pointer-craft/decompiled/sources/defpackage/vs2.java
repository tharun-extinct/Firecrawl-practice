package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vs2 implements uc4, qc4 {
    public final ib3 a;
    public final vc4 j;
    public final qc4 t;

    public vs2(uc4 uc4Var, Map map, qc4 qc4Var) {
        z6 z6Var = new z6(uc4Var, (byte) 22);
        vf1 vf1Var = wc4.g;
        this.j = new vc4(map, z6Var);
        this.t = qc4Var;
        ib3 ib3Var = fe4.g;
        this.a = new ib3();
    }

    @Override // defpackage.uc4
    public final tc4 g(String str, my1 my1Var) {
        return this.j.g(str, my1Var);
    }

    @Override // defpackage.uc4
    public final boolean n(Object obj) {
        return this.j.n(obj);
    }

    @Override // defpackage.qc4
    public final void r(Object obj) {
        this.t.r(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.uc4
    public final Map v() {
        ib3 ib3Var = this.a;
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
                            this.t.r(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.j.v();
    }

    @Override // defpackage.uc4
    public final Object x(String str) {
        return this.j.x(str);
    }

    @Override // defpackage.qc4
    public final void y(Object obj, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-858296452);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(this) ? 256 : 128;
        }
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            this.t.y(obj, nm0Var, h02Var, i2 & 126);
            boolean zJ = h02Var.j(this) | h02Var.j(obj);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new xf(this, obj, (byte) 9);
                h02Var.i0(objK);
            }
            k33.j(obj, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) this, obj, (Object) nm0Var, i, (byte) 5);
        }
    }
}
