package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p15 {
    public static final float g;
    public static final float n;
    public static final float r;
    public static final long v;
    public static final float y;

    static {
        sj0 sj0Var = qx3.g;
        g = qx3.r;
        y = 16.0f;
        r = 14.0f;
        n = 6.0f;
        v = kq2.G(20);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:103:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    public static final void g(final boolean z, final my1 my1Var, j73 j73Var, boolean z2, long j, long j2, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        j73 j73Var2;
        int i4;
        boolean z3;
        int i5;
        long j3;
        long j4;
        int i6;
        nm0 nm0Var2;
        int i7;
        boolean z4;
        final j73 j73Var3;
        final boolean z5;
        final long j5;
        final long j6;
        u34 u34VarP;
        int i8;
        int i9;
        int i10;
        int i11;
        h02Var.Z(-1573136853);
        if ((i & 6) == 0) {
            i3 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.j(my1Var) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                j73Var2 = j73Var;
                i3 |= h02Var.x(j73Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (h02Var.l(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    j3 = j;
                    if ((i2 & 16) == 0 || !h02Var.v(j3)) {
                        i11 = 8192;
                    } else {
                        i11 = 16384;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    j4 = j2;
                    if ((i2 & 32) == 0 || !h02Var.v(j4)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i3 |= i10;
                } else {
                    j4 = j2;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (h02Var.x(null)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((12582912 & i) == 0) {
                    nm0Var2 = nm0Var;
                    if (h02Var.j(nm0Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                } else {
                    nm0Var2 = nm0Var;
                }
                i7 = i3;
                if ((4793491 & i3) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (h02Var.N(i7 & 1, z4)) {
                    h02Var.S();
                    if ((i & 1) != 0 || h02Var.k()) {
                        if (i12 != 0) {
                            j73Var2 = g73.g;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            j3 = ((jj0) h02Var.a(mt0.g)).g;
                            i8 = i7 & (-57345);
                        } else {
                            i8 = i7;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            j4 = j3;
                        }
                    } else {
                        h02Var.Q();
                        i8 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                        }
                    }
                    boolean z6 = z3;
                    long j7 = j3;
                    long j8 = j4;
                    j73 j73Var4 = j73Var2;
                    h02Var.s();
                    int i13 = i8 >> 12;
                    n(j7, j8, z, ue5.m0(1128552423, new n15(j73Var4, z, k94.g(0.0f, 2, j7, true), z6, my1Var, nm0Var2), h02Var), h02Var, (i13 & 112) | (i13 & 14) | 3072 | ((i8 << 6) & 896));
                    j5 = j7;
                    j6 = j8;
                    j73Var3 = j73Var4;
                    z5 = z6;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    z5 = z3;
                    j5 = j3;
                    j6 = j4;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: l15
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p15.g(z, my1Var, j73Var3, z5, j5, j6, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                j3 = j;
                if ((i2 & 16) == 0) {
                    i11 = 8192;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (h02Var.x(null)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((12582912 & i) == 0) {
                nm0Var2 = nm0Var;
                if (h02Var.j(nm0Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            } else {
                nm0Var2 = nm0Var;
            }
            i7 = i3;
            if ((4793491 & i3) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i7 & 1, z4)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((jj0) h02Var.a(mt0.g)).g;
                        i8 = i7 & (-57345);
                    } else {
                        i8 = i7;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        j4 = j3;
                    }
                } else {
                    if (i12 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((jj0) h02Var.a(mt0.g)).g;
                        i8 = i7 & (-57345);
                    } else {
                        i8 = i7;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        j4 = j3;
                    }
                }
                boolean z7 = z3;
                long j9 = j3;
                long j10 = j4;
                j73 j73Var5 = j73Var2;
                h02Var.s();
                int i14 = i8 >> 12;
                n(j9, j10, z, ue5.m0(1128552423, new n15(j73Var5, z, k94.g(0.0f, 2, j9, true), z7, my1Var, nm0Var2), h02Var), h02Var, (i14 & 112) | (i14 & 14) | 3072 | ((i8 << 6) & 896));
                j5 = j9;
                j6 = j10;
                j73Var3 = j73Var5;
                z5 = z7;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                z5 = z3;
                j5 = j3;
                j6 = j4;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: l15
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p15.g(z, my1Var, j73Var3, z5, j5, j6, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 384;
        j73Var2 = j73Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (h02Var.l(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                j3 = j;
                if ((i2 & 16) == 0) {
                    i11 = 8192;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                j4 = j2;
                if ((i2 & 32) == 0) {
                    i10 = 65536;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (h02Var.x(null)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((12582912 & i) == 0) {
                nm0Var2 = nm0Var;
                if (h02Var.j(nm0Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            } else {
                nm0Var2 = nm0Var;
            }
            i7 = i3;
            if ((4793491 & i3) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i7 & 1, z4)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((jj0) h02Var.a(mt0.g)).g;
                        i8 = i7 & (-57345);
                    } else {
                        i8 = i7;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        j4 = j3;
                    }
                } else {
                    if (i12 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((jj0) h02Var.a(mt0.g)).g;
                        i8 = i7 & (-57345);
                    } else {
                        i8 = i7;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        j4 = j3;
                    }
                }
                boolean z8 = z3;
                long j11 = j3;
                long j12 = j4;
                j73 j73Var6 = j73Var2;
                h02Var.s();
                int i15 = i8 >> 12;
                n(j11, j12, z, ue5.m0(1128552423, new n15(j73Var6, z, k94.g(0.0f, 2, j11, true), z8, my1Var, nm0Var2), h02Var), h02Var, (i15 & 112) | (i15 & 14) | 3072 | ((i8 << 6) & 896));
                j5 = j11;
                j6 = j12;
                j73Var3 = j73Var6;
                z5 = z8;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                z5 = z3;
                j5 = j3;
                j6 = j4;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: l15
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p15.g(z, my1Var, j73Var3, z5, j5, j6, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            j3 = j;
            if ((i2 & 16) == 0) {
                i11 = 8192;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            j4 = j2;
            if ((i2 & 32) == 0) {
                i10 = 65536;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        } else {
            j4 = j2;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (h02Var.x(null)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            nm0Var2 = nm0Var;
            if (h02Var.j(nm0Var2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        } else {
            nm0Var2 = nm0Var;
        }
        i7 = i3;
        if ((4793491 & i3) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (h02Var.N(i7 & 1, z4)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    j73Var2 = g73.g;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    j3 = ((jj0) h02Var.a(mt0.g)).g;
                    i8 = i7 & (-57345);
                } else {
                    i8 = i7;
                }
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                    j4 = j3;
                }
            } else {
                if (i12 != 0) {
                    j73Var2 = g73.g;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    j3 = ((jj0) h02Var.a(mt0.g)).g;
                    i8 = i7 & (-57345);
                } else {
                    i8 = i7;
                }
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                    j4 = j3;
                }
            }
            boolean z9 = z3;
            long j13 = j3;
            long j14 = j4;
            j73 j73Var7 = j73Var2;
            h02Var.s();
            int i16 = i8 >> 12;
            n(j13, j14, z, ue5.m0(1128552423, new n15(j73Var7, z, k94.g(0.0f, 2, j13, true), z9, my1Var, nm0Var2), h02Var), h02Var, (i16 & 112) | (i16 & 14) | 3072 | ((i8 << 6) & 896));
            j5 = j13;
            j6 = j14;
            j73Var3 = j73Var7;
            z5 = z9;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            z5 = z3;
            j5 = j3;
            j6 = j4;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: l15
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p15.g(z, my1Var, j73Var3, z5, j5, j6, nm0Var, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(final long j, final long j2, boolean z, final nm0 nm0Var, h02 h02Var, final int i) {
        int i2;
        final boolean z2;
        boolean z3;
        zu4 zu4VarF;
        h02Var.Z(-833145221);
        if ((i & 6) == 0) {
            i2 = (h02Var.v(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.v(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= h02Var.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            nc5 nc5VarV = ra.V(Boolean.valueOf(z2), null, h02Var, i3 & 14, 2);
            tp3 tp3Var = nc5VarV.n;
            boolean zBooleanValue = ((Boolean) tp3Var.getValue()).booleanValue();
            h02Var.X(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            h02Var.b(false);
            uj0 uj0VarV = jj0.v(j3);
            boolean zX = h02Var.x(uj0VarV);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                te5 te5Var = new te5(vg.b, new zg(uj0VarV, (byte) 3));
                h02Var.i0(te5Var);
                objK = te5Var;
            }
            te5 te5Var2 = (te5) objK;
            boolean zBooleanValue2 = ((Boolean) nc5VarV.g.n()).booleanValue();
            h02Var.X(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            h02Var.b(false);
            jj0 jj0Var = new jj0(j4);
            boolean zBooleanValue3 = ((Boolean) tp3Var.getValue()).booleanValue();
            h02Var.X(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            h02Var.b(false);
            jj0 jj0Var2 = new jj0(j5);
            fc5 fc5VarX = nc5VarV.x();
            h02Var.X(1058649156);
            if (fc5VarX.y(Boolean.FALSE, Boolean.TRUE)) {
                h02Var.X(272207019);
                zu4VarF = jr2.F(f83.a, h02Var);
                z3 = false;
                h02Var.b(false);
            } else {
                z3 = false;
                h02Var.X(272326989);
                zu4VarF = jr2.F(f83.m, h02Var);
                h02Var.b(false);
            }
            zu4 zu4Var = zu4VarF;
            h02Var.b(z3);
            hc5 hc5VarP = ra.p(nc5VarV, jj0Var, jj0Var2, zu4Var, te5Var2, h02Var, 0);
            vf1 vf1Var = mt0.g;
            jj0 jj0Var3 = (jj0) hc5VarP.s.getValue();
            long j6 = jj0Var3.g;
            og0.y(vf1Var.g(jj0Var3), nm0Var, h02Var, (i3 & 112) | 8);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: m15
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p15.n(j, j2, z2, nm0Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void r(bz1 bz1Var, h02 h02Var, int i) {
        boolean z;
        k00 k00Var = hi0.t;
        h02Var.Z(-1349901398);
        byte b = 2;
        int i2 = (h02Var.j(bz1Var) ? 4 : 2) | i | (h02Var.j(null) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object objK = h02Var.K();
            if (z2 || objK == oo0.g) {
                objK = new rv2(bz1Var, b);
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            g73 g73Var = g73.g;
            j73 j73VarW = m50.W(h02Var, g73Var);
            jo0.n.getClass();
            h02Var.b0();
            boolean z3 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z3) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            if (bz1Var != null) {
                h02Var.X(870361332);
                j73 j73VarG0 = ue5.g0(ue5.X(g73Var, "text"), y, 0.0f, 2);
                t33 t33VarR = z50.r(k00Var, false);
                int iS2 = pw5.s(h02Var);
                tr3 tr3VarQ2 = h02Var.q();
                j73 j73VarW2 = m50.W(h02Var, j73VarG0);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33VarR);
                xs2.E(on0Var2, h02Var, tr3VarQ2);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                    du4.f(iS2, h02Var, iS2, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW2);
                bz1Var.l(h02Var, Integer.valueOf(i3));
                z = true;
                h02Var.b(true);
                h02Var.b(false);
            } else {
                z = true;
                h02Var.X(870466081);
                h02Var.b(false);
            }
            h02Var.X(870557345);
            h02Var.b(false);
            h02Var.b(z);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new qw4(i, bz1Var);
        }
    }

    public static final void y(final boolean z, final my1 my1Var, j73 j73Var, boolean z2, final bz1 bz1Var, long j, long j2, h02 h02Var, final int i) {
        final j73 j73Var2;
        final boolean z3;
        final long j3;
        final long j4;
        int i2;
        j73 j73Var3;
        long j5;
        boolean z4;
        long j6;
        nm0 nm0VarM0;
        h02Var.Z(1015017965);
        byte b = 2;
        int i3 = i | (h02Var.l(z) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16) | 105581952;
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                long j7 = ((jj0) h02Var.a(mt0.g)).g;
                i2 = i3 & (-33030145);
                j73Var3 = g73.g;
                j5 = j7;
                z4 = true;
                j6 = j5;
            } else {
                h02Var.Q();
                i2 = i3 & (-33030145);
                j73Var3 = j73Var;
                z4 = z2;
                j6 = j;
                j5 = j2;
            }
            h02Var.s();
            if (bz1Var == null) {
                h02Var.X(1830899669);
                h02Var.b(false);
                nm0VarM0 = null;
            } else {
                h02Var.X(1830899670);
                nm0VarM0 = ue5.m0(-1745256900, new j6(bz1Var, (byte) 6), h02Var);
                h02Var.b(false);
            }
            g(z, my1Var, ra.G(j73Var3, new at(b2)), z4, j6, j5, ue5.m0(-906085472, new ye0((bz1) nm0VarM0, b), h02Var), h02Var, (i2 & 112) | (i2 & 14) | 12582912 | 1575936, 0);
            j73Var2 = j73Var3;
            z3 = z4;
            j3 = j6;
            j4 = j5;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z3 = z2;
            j3 = j;
            j4 = j2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z, my1Var, j73Var2, z3, bz1Var, j3, j4, i) { // from class: k15
                public final /* synthetic */ j73 a;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ bz1 q;
                public final /* synthetic */ my1 t;
                public final /* synthetic */ long w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(24577);
                    p15.y(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
