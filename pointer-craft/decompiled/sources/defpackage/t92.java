package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t92 {
    public static final j73 g = mq4.j(g73.g, a11.C);

    public static final void g(final ha2 ha2Var, String str, j73 j73Var, long j, h02 h02Var, final int i, final int i2) {
        String str2;
        h02 h02Var2;
        final long j2;
        final j73 j73Var2;
        h02Var.Z(-126890956);
        int i3 = (h02Var.x(ha2Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= h02Var.x(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && h02Var.v(j)) ? 2048 : 1024;
        }
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                if (i4 != 0) {
                    j73Var = g73.g;
                }
                if ((i2 & 8) != 0) {
                    j = ((jj0) h02Var.a(mt0.g)).g;
                    i3 &= -7169;
                }
            } else {
                h02Var.Q();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            j73 j73Var3 = j73Var;
            long j3 = j;
            h02Var.s();
            str2 = str;
            h02Var2 = h02Var;
            y(zq2.k(ha2Var, h02Var), str2, j73Var3, j3, h02Var2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
            j73Var2 = j73Var3;
            j2 = j3;
        } else {
            str2 = str;
            h02Var2 = h02Var;
            h02Var2.Q();
            j2 = j;
            j73Var2 = j73Var;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            final String str3 = str2;
            u34VarP.n = new bz1() { // from class: q92
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t92.g(ha2Var, str3, j73Var2, j2, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    public static final void y(final cp3 cp3Var, final String str, final j73 j73Var, final long j, h02 h02Var, final int i) {
        cp3 cp3Var2;
        int i2;
        j73 j73Var2;
        h02Var.Z(-2142239481);
        if ((i & 6) == 0) {
            cp3Var2 = cp3Var;
            i2 = (h02Var.j(cp3Var2) ? 4 : 2) | i;
        } else {
            cp3Var2 = cp3Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.v(j) ? 2048 : 1024;
        }
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && h02Var.v(j)) || (i2 & 3072) == 2048;
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z || objK == l76Var) {
                objK = tf5.g(j, jj0.j) ? null : new m30(5, j);
                h02Var.i0(objK);
            }
            m30 m30Var = (m30) objK;
            j73 j73Var3 = g73.g;
            if (str != null) {
                h02Var.X(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objK2 = h02Var.K();
                if (z2 || objK2 == l76Var) {
                    objK2 = new r92(str, b);
                    h02Var.i0(objK2);
                }
                j73 j73VarG = dj4.g(j73Var3, false, (xy1) objK2);
                h02Var.b(false);
                j73Var2 = j73VarG;
            } else {
                h02Var.X(-536832197);
                h02Var.b(false);
                j73Var2 = j73Var3;
            }
            if (cq4.g(cp3Var2.n(), 9205357640488583168L)) {
                j73Var3 = g;
            } else {
                long jN = cp3Var2.n();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jN >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jN & 4294967295L)))) {
                    j73Var3 = g;
                }
            }
            z50.g(pw5.D(j73Var.n(j73Var3), cp3Var2, wt0.g, 0.0f, m30Var, 22).n(j73Var2), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: s92
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t92.y(cp3Var, str, j73Var, j, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
