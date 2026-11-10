package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aj4 implements nj4, Iterable, vh2 {
    public boolean a;
    public final hb3 j;
    public boolean m;
    public s13 t;

    public aj4() {
        long[] jArr = ee4.g;
        this.j = new hb3();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj4)) {
            return false;
        }
        aj4 aj4Var = (aj4) obj;
        return this.j.equals(aj4Var.j) && this.a == aj4Var.a && this.m == aj4Var.m;
    }

    @Override // defpackage.nj4
    public final void g(mj4 mj4Var, Object obj) {
        boolean z = obj instanceof p1;
        hb3 hb3Var = this.j;
        if (z && hb3Var.r(mj4Var)) {
            Object objL = hb3Var.l(mj4Var);
            objL.getClass();
            p1 p1Var = (p1) objL;
            p1 p1Var2 = (p1) obj;
            String str = p1Var2.g;
            if (str == null) {
                str = p1Var.g;
            }
            jz1 jz1Var = p1Var2.y;
            if (jz1Var == null) {
                jz1Var = p1Var.y;
            }
            hb3Var.c(mj4Var, new p1(str, jz1Var));
        } else {
            hb3Var.c(mj4Var, obj);
        }
        mj4Var.getClass();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + xi3.l(this.j.hashCode() * 31, 31, this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s13 s13Var = this.t;
        if (s13Var == null) {
            hb3 hb3Var = this.j;
            s13 s13Var2 = hb3Var.x;
            if (s13Var2 == null) {
                s13Var2 = new s13(hb3Var);
                hb3Var.x = s13Var2;
            }
            s13Var = s13Var2;
            this.t = s13Var;
        }
        return ((hk1) s13Var.entrySet()).iterator();
    }

    public final void n(aj4 aj4Var) {
        hb3 hb3Var = aj4Var.j;
        Object[] objArr = hb3Var.y;
        Object[] objArr2 = hb3Var.r;
        long[] jArr = hb3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        mj4 mj4Var = (mj4) obj;
                        hb3 hb3Var2 = this.j;
                        Object objL = hb3Var2.l(mj4Var);
                        mj4Var.getClass();
                        Object objL2 = mj4Var.y.l(objL, obj2);
                        if (objL2 != null) {
                            hb3Var2.c(mj4Var, objL2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.m) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        hb3 hb3Var = this.j;
        Object[] objArr = hb3Var.y;
        Object[] objArr2 = hb3Var.r;
        long[] jArr = hb3Var.g;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((mj4) obj).g);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return rs5.v(this) + "{ " + ((Object) sb) + " }";
    }

    public final Object y(mj4 mj4Var) {
        Object objL = this.j.l(mj4Var);
        if (objL != null) {
            return objL;
        }
        uo1.l(mj4Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }
}
