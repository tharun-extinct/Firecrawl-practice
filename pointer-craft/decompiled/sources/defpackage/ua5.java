package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ua5 {
    public static final bo3 g = new bo3(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void g(final xa5 xa5Var, j73 j73Var, float f, cn4 cn4Var, long j, long j2, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        j73 j73Var2;
        int i4;
        cn4 cn4VarY;
        int i5;
        boolean z;
        final float f2;
        long jV;
        final cn4 cn4Var2;
        long jV2;
        u34 u34VarP;
        j73 j73Var3;
        float f3;
        int i6;
        cn4 cn4Var3;
        int i7;
        h02Var.Z(-343758958);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? h02Var.x(xa5Var) : h02Var.j(xa5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 1;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                j73Var2 = j73Var;
                i3 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            i4 = i3 | 3456;
            if ((i & 24576) == 0) {
                if ((i2 & 8) == 0) {
                    cn4VarY = cn4Var;
                    int i9 = h02Var.x(cn4VarY) ? 16384 : 8192;
                    i4 |= i9;
                } else {
                    cn4VarY = cn4Var;
                }
                i4 |= i9;
            } else {
                cn4VarY = cn4Var;
            }
            if ((196608 & i) == 0) {
                i4 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i5 = i4 | 113246208;
            if ((805306368 & i) == 0) {
                if (h02Var.j(nm0Var)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
            if ((306783379 & i5) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i5 & 1, z)) {
                h02Var.S();
                if ((i & 1) != 0 || h02Var.k()) {
                    if (i8 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    f3 = ra5.g;
                    if ((i2 & 8) != 0) {
                        cn4VarY = vn4.y(zc6.y, h02Var);
                        i5 &= -57345;
                    }
                    i6 = i5 & (-4128769);
                    cn4Var3 = cn4VarY;
                    jV2 = tj0.v(zc6.r, h02Var);
                    jV = tj0.v(zc6.g, h02Var);
                } else {
                    h02Var.Q();
                    if ((i2 & 8) != 0) {
                        i5 &= -57345;
                    }
                    i6 = i5 & (-4128769);
                    jV = j2;
                    j73Var3 = j73Var2;
                    cn4Var3 = cn4VarY;
                    f3 = f;
                    jV2 = j;
                }
                h02Var.s();
                h02Var.X(-1719831991);
                h02Var.b(false);
                int i10 = i6 >> 9;
                j73 j73Var4 = j73Var3;
                uz4.g(j73Var4, cn4Var3, jV, 0L, 0.0f, 0.0f, null, ue5.m0(-1573998995, new ta5(f3, jV2, nm0Var), h02Var), h02Var, (57344 & i10) | 12582912 | (i10 & 458752), 72);
                f2 = f3;
                j73Var2 = j73Var4;
                cn4Var2 = cn4Var3;
            } else {
                h02Var.Q();
                f2 = f;
                jV = j2;
                cn4Var2 = cn4VarY;
                jV2 = j;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                final j73 j73Var5 = j73Var2;
                final long j3 = jV2;
                final long j4 = jV;
                u34VarP.n = new bz1() { // from class: sa5
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ua5.g(xa5Var, j73Var5, f2, cn4Var2, j3, j4, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 48;
        j73Var2 = j73Var;
        i4 = i3 | 3456;
        if ((i & 24576) == 0) {
            if ((i2 & 8) == 0) {
                cn4VarY = cn4Var;
                if (h02Var.x(cn4VarY)) {
                }
                i4 |= i9;
            } else {
                cn4VarY = cn4Var;
            }
            i4 |= i9;
        } else {
            cn4VarY = cn4Var;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            if (h02Var.j(nm0Var)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i5 |= i7;
        }
        if ((306783379 & i5) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i5 & 1, z)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                f3 = ra5.g;
                if ((i2 & 8) != 0) {
                    cn4VarY = vn4.y(zc6.y, h02Var);
                    i5 &= -57345;
                }
                i6 = i5 & (-4128769);
                cn4Var3 = cn4VarY;
                jV2 = tj0.v(zc6.r, h02Var);
                jV = tj0.v(zc6.g, h02Var);
            } else {
                if (i8 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                f3 = ra5.g;
                if ((i2 & 8) != 0) {
                    cn4VarY = vn4.y(zc6.y, h02Var);
                    i5 &= -57345;
                }
                i6 = i5 & (-4128769);
                cn4Var3 = cn4VarY;
                jV2 = tj0.v(zc6.r, h02Var);
                jV = tj0.v(zc6.g, h02Var);
            }
            h02Var.s();
            h02Var.X(-1719831991);
            h02Var.b(false);
            int i11 = i6 >> 9;
            j73 j73Var6 = j73Var3;
            uz4.g(j73Var6, cn4Var3, jV, 0L, 0.0f, 0.0f, null, ue5.m0(-1573998995, new ta5(f3, jV2, nm0Var), h02Var), h02Var, (57344 & i11) | 12582912 | (i11 & 458752), 72);
            f2 = f3;
            j73Var2 = j73Var6;
            cn4Var2 = cn4Var3;
        } else {
            h02Var.Q();
            f2 = f;
            jV = j2;
            cn4Var2 = cn4VarY;
            jV2 = j;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            final j73 j73Var7 = j73Var2;
            final long j5 = jV2;
            final long j6 = jV;
            u34VarP.n = new bz1() { // from class: sa5
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ua5.g(xa5Var, j73Var7, f2, cn4Var2, j5, j6, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final ab5 r(h02 h02Var) {
        ac3 ac3Var = kz.g;
        boolean zL = h02Var.l(false) | h02Var.x(ac3Var);
        Object objK = h02Var.K();
        if (zL || objK == oo0.g) {
            objK = new ab5(ac3Var);
            h02Var.i0(objK);
        }
        return (ab5) objK;
    }

    public static final void y(vv3 vv3Var, nm0 nm0Var, ya5 ya5Var, j73 j73Var, boolean z, nm0 nm0Var2, h02 h02Var, int i) {
        int i2;
        j73 j73Var2;
        boolean z2;
        h02Var.Z(-293753984);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(vv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? h02Var.x(ya5Var) : h02Var.j(ya5Var) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= h02Var.j(nm0Var2) ? 67108864 : 33554432;
        }
        if (h02Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            nc5 nc5VarM = ra.M(ya5Var.r(), "tooltip transition", h02Var, 48);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(null);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new xa5(new za4(ob3Var, (byte) 10), vv3Var);
                h02Var.i0(objK2);
            }
            cz5.g(vv3Var, ue5.m0(-527401546, new u43((Object) nc5VarM, nm0Var, objK2, (byte) 5), h02Var), ya5Var, true, ue5.m0(-23901870, new k6(ob3Var, nm0Var2, (byte) 11), h02Var), h02Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
            j73Var2 = g73.g;
            z2 = true;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z2 = z;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xd0(vv3Var, nm0Var, ya5Var, j73Var2, z2, nm0Var2, i);
        }
    }
}
