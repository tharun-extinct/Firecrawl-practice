package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fe6 {
    public static final k44 g = new k44(0.0f, 0.0f, 10.0f, 10.0f);

    public static String g(fa0 fa0Var, fa0[] fa0VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int iY = fa0Var.y();
        int i5 = 0;
        while (i5 < iY) {
            int i6 = (i5 + iY) / 2;
            while (i6 > -1 && fa0Var.v(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (fa0Var.v(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bV = fa0VarArr[i10].v(i11);
                    byte[] bArr = us5.g;
                    int i13 = bV & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bV2 = fa0Var.v(i7 + i12);
                byte[] bArr2 = us5.g;
                i4 = i3 - (bV2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (fa0VarArr[i10].y() != i11) {
                    z2 = z;
                } else {
                    if (i10 == fa0VarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iY2 = fa0VarArr[i10].y() - i11;
                    int length = fa0VarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iY2 += fa0VarArr[i15].y();
                    }
                    if (iY2 >= i14) {
                        if (iY2 <= i14) {
                            return fa0Var.t(i7, i9 + i7).j(od0.g);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iY = i6;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean j(gj4 gj4Var) {
        if (!l(gj4Var)) {
            aj4 aj4Var = gj4Var.n;
            if (aj4Var.a) {
                return true;
            }
            hb3 hb3Var = aj4Var.j;
            Object[] objArr = hb3Var.y;
            Object[] objArr2 = hb3Var.r;
            long[] jArr = hb3Var.g;
            int length = jArr.length - 2;
            if (length >= 0) {
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
                                if (((mj4) obj).r) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean l(gj4 gj4Var) {
        gh3 gh3VarN = gj4Var.n();
        hb3 hb3Var = gj4Var.n.j;
        return (gh3VarN != null ? gh3VarN.h1() : false) || hb3Var.r(kj4.s) || hb3Var.r(kj4.b);
    }

    public static final void n(xy1 xy1Var, v92 v92Var, v92 v92Var2, ha3 ha3Var, gj4 gj4Var, gj4 gj4Var2) {
        v92 v92Var3 = v92Var;
        Region region = (Region) v92Var3.t;
        v92 v92Var4 = v92Var2;
        Region region2 = (Region) v92Var4.t;
        um2 um2Var = gj4Var2.r;
        um2 um2Var2 = gj4Var2.r;
        if (!um2Var.K() || !um2Var2.J() || region2.isEmpty()) {
            if (gj4Var2.c()) {
                v(ha3Var, gj4Var, gj4Var2);
                return;
            }
            return;
        }
        k44 k44VarW = gj4Var2.w();
        if (k44VarW.x()) {
            Object objX = gj4Var2.x();
            if (objX == null) {
                sc2 sc2Var = um2Var2.M.r;
                k44VarW = m50.K(sc2Var).H(sc2Var, false);
            } else {
                i73 i73Var = ((i73) objX).j;
                Object objL = gj4Var2.n.j.l(yi4.y);
                if (objL == null) {
                    objL = null;
                }
                k44VarW = br2.c(i73Var, objL != null, false);
            }
        }
        ne2 ne2VarE = c93.E(k44VarW);
        v92Var3.S(ne2VarE);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = gj4Var2.x;
            gj4 gj4Var3 = gj4Var;
            if (i == gj4Var3.x) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            ij4 ij4Var = new ij4(gj4Var2, new ne2(bounds.left, bounds.top, bounds.right, bounds.bottom));
            ha3 ha3Var2 = ha3Var;
            ha3Var2.t(i, ij4Var);
            List listT = gj4Var2.t((4 & 1) != 0 ? !gj4Var2.y : false, (4 & 2) == 0);
            int size = listT.size() - 1;
            while (-1 < size) {
                if (!((Boolean) xy1Var.a(listT.get(size))).booleanValue()) {
                    n(xy1Var, v92Var3, v92Var4, ha3Var2, gj4Var3, (gj4) listT.get(size));
                }
                size--;
                v92Var3 = v92Var;
                v92Var4 = v92Var2;
                ha3Var2 = ha3Var;
                gj4Var3 = gj4Var;
            }
            if (j(gj4Var2)) {
                region2.op(ne2VarE.g, ne2VarE.y, ne2VarE.r, ne2VarE.n, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final ha3 r(jj4 jj4Var, xy1 xy1Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            gj4 gj4VarG = jj4Var.g();
            um2 um2Var = gj4VarG.r;
            if (um2Var.K() && um2Var.J()) {
                k44 k44VarL = gj4VarG.l();
                ha3 ha3Var = new ha3(48);
                v92 v92Var = new v92((byte) 26);
                v92Var.S(c93.E(k44VarL));
                x(xy1Var, new v92((byte) 26), v92Var, ha3Var, gj4VarG, gj4VarG);
                return ha3Var;
            }
            ha3 ha3Var2 = ie2.g;
            ha3Var2.getClass();
            return ha3Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void v(ha3 ha3Var, gj4 gj4Var, gj4 gj4Var2) {
        um2 um2Var;
        gj4 gj4VarQ = gj4Var2.q();
        k44 k44VarL = (gj4VarQ == null || (um2Var = gj4VarQ.r) == null || !um2Var.K()) ? g : gj4VarQ.l();
        int i = gj4Var2.x;
        if (i == gj4Var.x) {
            i = -1;
        }
        ha3Var.t(i, new ij4(gj4Var2, c93.E(k44VarL)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    public static final void x(xy1 xy1Var, v92 v92Var, v92 v92Var2, ha3 ha3Var, gj4 gj4Var, gj4 gj4Var2) {
        int size;
        boolean z;
        k44 k44VarC;
        xy1 xy1Var2 = xy1Var;
        gj4 gj4Var3 = gj4Var;
        int i = gj4Var3.x;
        Region region = (Region) v92Var.t;
        v92 v92Var3 = v92Var2;
        Region region2 = (Region) v92Var3.t;
        um2 um2Var = gj4Var2.r;
        aj4 aj4Var = gj4Var2.n;
        um2 um2Var2 = gj4Var2.r;
        int i2 = gj4Var2.x;
        boolean z2 = (um2Var.K() && um2Var2.J()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || gj4Var2.c()) {
                ne2 ne2VarE = c93.E(gj4Var2.w());
                v92Var.S(ne2VarE);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (gj4Var2.c()) {
                        v(ha3Var, gj4Var, gj4Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            ha3Var.t(i2, new ij4(gj4Var2, new ne2(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                ha3Var.t(i2, new ij4(gj4Var2, new ne2(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listT = gj4Var2.t((4 & 1) != 0 ? !gj4Var2.y : false, (4 & 2) == 0);
                if (aj4Var.a) {
                    gj4 gj4VarQ = gj4Var2.q();
                    while (true) {
                        if (gj4VarQ == null) {
                            gj4VarQ = null;
                            break;
                        }
                        hb3 hb3Var = gj4VarQ.n.j;
                        if (hb3Var.r(kj4.f) || hb3Var.r(kj4.o)) {
                            break;
                        } else {
                            gj4VarQ = gj4VarQ.q();
                        }
                    }
                    if (gj4VarQ == null) {
                        z = false;
                    } else {
                        gh3 gh3VarN = gj4Var2.n();
                        if (gh3VarN == null) {
                            gh3VarN = null;
                        } else {
                            if (!gh3VarN.Y0().h) {
                                gh3VarN = null;
                            }
                            if (gh3VarN == null) {
                                gh3VarN = null;
                            }
                        }
                        gh3 gh3VarN2 = gj4VarQ.n();
                        if (gh3VarN2 == null) {
                            gh3VarN2 = null;
                        } else {
                            if (!gh3VarN2.Y0().h) {
                                gh3VarN2 = null;
                            }
                            if (gh3VarN2 == null) {
                                gh3VarN2 = null;
                            }
                        }
                        if (gh3VarN == null || gh3VarN2 == null) {
                            z = false;
                        } else {
                            k44 k44VarH = gh3VarN2.H(gh3VarN, false);
                            z = !k44VarH.equals(k44VarH.v(kq2.r(0L, y94.N(gh3VarN2.a))));
                        }
                    }
                    if (z) {
                        v92 v92Var4 = new v92((byte) 26);
                        Object objX = gj4Var2.x();
                        if (objX == null) {
                            sc2 sc2Var = um2Var2.M.r;
                            k44VarC = m50.K(sc2Var).H(sc2Var, false);
                        } else {
                            i73 i73Var = ((i73) objX).j;
                            Object objL = aj4Var.j.l(yi4.y);
                            k44VarC = br2.c(i73Var, (objL == null ? null : objL) != null, false);
                        }
                        v92Var4.S(c93.E(k44VarC));
                        int size2 = listT.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) xy1Var2.a(listT.get(size2))).booleanValue()) {
                                n(xy1Var2, new v92((byte) 26), v92Var4, ha3Var, gj4Var3, (gj4) listT.get(size2));
                            }
                            size2--;
                            gj4Var3 = gj4Var;
                        }
                    } else {
                        size = listT.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) xy1Var2.a(listT.get(size))).booleanValue()) {
                                x(xy1Var2, v92Var, v92Var3, ha3Var, gj4Var, (gj4) listT.get(size));
                            }
                            size--;
                            xy1Var2 = xy1Var;
                            v92Var3 = v92Var2;
                        }
                    }
                } else {
                    size = listT.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) xy1Var2.a(listT.get(size))).booleanValue()) {
                            x(xy1Var2, v92Var, v92Var3, ha3Var, gj4Var, (gj4) listT.get(size));
                        }
                        size--;
                        xy1Var2 = xy1Var;
                        v92Var3 = v92Var2;
                    }
                }
                if (j(gj4Var2)) {
                    region2.op(ne2VarE.g, ne2VarE.y, ne2VarE.r, ne2VarE.n, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static va5 y() {
        return new va5();
    }
}
