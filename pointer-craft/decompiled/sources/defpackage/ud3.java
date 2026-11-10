package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ud3 extends zz4 implements bz1 {
    public final /* synthetic */ bw4 b;
    public final /* synthetic */ mc3 c;
    public final /* synthetic */ sa3 i;
    public final /* synthetic */ nc5 q;
    public final /* synthetic */ un0 s;
    public final /* synthetic */ jd3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud3(nc5 nc5Var, jd3 jd3Var, mc3 mc3Var, sa3 sa3Var, bw4 bw4Var, un0 un0Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = nc5Var;
        this.w = jd3Var;
        this.c = mc3Var;
        this.i = sa3Var;
        this.b = bw4Var;
        this.s = un0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new ud3(this.q, this.w, this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ud3 ud3Var = (ud3) b((mu0) obj2, (ox0) obj);
        og5 og5Var = og5.g;
        ud3Var.u(og5Var);
        return og5Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3 A[LOOP:1: B:15:0x005b->B:27:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6 A[EDGE_INSN: B:32:0x00d6->B:28:0x00d6 BREAK  A[LOOP:1: B:15:0x005b->B:27:0x00d3], SYNTHETIC] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        nc5 nc5Var = this.q;
        Object objN = nc5Var.g.n();
        tp3 tp3Var = nc5Var.n;
        if (yf2.p(objN, tp3Var.getValue()) && (this.w.y.l() == null || yf2.p(tp3Var.getValue(), this.c))) {
            Iterator it = ((List) this.b.getValue()).iterator();
            while (it.hasNext()) {
                this.s.y().r((mc3) it.next());
            }
            sa3 sa3Var = this.i;
            long[] jArr = sa3Var.g;
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
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = sa3Var.y[i4];
                                float f = sa3Var.r[i4];
                                if (!yf2.p((String) obj2, ((mc3) tp3Var.getValue()).w)) {
                                    sa3Var.v--;
                                    long[] jArr2 = sa3Var.g;
                                    int i5 = sa3Var.n;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    sa3Var.y[i4] = null;
                                }
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
        }
        return og5.g;
    }
}
