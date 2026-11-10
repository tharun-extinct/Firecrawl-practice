package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh3 {
    public static final ta3 g;

    static {
        ta3 ta3Var = mi3.g;
        g = new ta3();
    }

    public static final void g(i73 i73Var, int i, int i2) {
        if (!(i73Var instanceof p41)) {
            y(i73Var, i & i73Var.a, i2);
            return;
        }
        p41 p41Var = (p41) i73Var;
        int i3 = p41Var.o;
        y(i73Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (i73 i73Var2 = p41Var.f; i73Var2 != null; i73Var2 = i73Var2.w) {
            g(i73Var2, i4, i2);
        }
    }

    public static final boolean l(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int n(h73 h73Var) {
        int i = h73Var instanceof im2 ? 3 : 1;
        if (h73Var instanceof vd1) {
            i |= 4;
        }
        if (h73Var instanceof cj4) {
            i |= 8;
        }
        if (h73Var instanceof yu3) {
            i |= 16;
        }
        if (h73Var instanceof m73) {
            i |= 32;
        }
        if (h73Var instanceof up3) {
            i |= 64;
        }
        return h73Var instanceof h60 ? 524288 | i : i;
    }

    public static final void r(i73 i73Var) {
        if (!i73Var.h) {
            mc2.y("autoInvalidateUpdatedNode called on unattached node");
        }
        g(i73Var, -1, 0);
    }

    public static final int v(i73 i73Var) {
        int i = i73Var.a;
        if (i != 0) {
            return i;
        }
        Class<?> cls = i73Var.getClass();
        ta3 ta3Var = g;
        int iN = ta3Var.n(cls);
        if (iN >= 0) {
            return ta3Var.r[iN];
        }
        int i2 = i73Var instanceof lm2 ? 3 : 1;
        if (i73Var instanceof wd1) {
            i2 |= 4;
        }
        if (i73Var instanceof ej4) {
            i2 |= 8;
        }
        if (i73Var instanceof tu3) {
            i2 |= 16;
        }
        if (i73Var instanceof l73) {
            i2 |= 32;
        }
        if (i73Var instanceof vp3) {
            i2 |= 64;
        }
        if (i73Var instanceof xk2) {
            i2 |= 4194432;
        } else if (i73Var instanceof x33) {
            i2 |= 128;
        }
        if (i73Var instanceof a32) {
            i2 |= 256;
        }
        if (i73Var instanceof cu1) {
            i2 |= 1024;
        }
        if (i73Var instanceof qt1) {
            i2 |= 2048;
        }
        if (i73Var instanceof ct1) {
            i2 |= 4096;
        }
        if (i73Var instanceof oi2) {
            i2 |= 8192;
        }
        if (i73Var instanceof u9) {
            i2 |= 16384;
        }
        if (i73Var instanceof zo0) {
            i2 |= 32768;
        }
        if (i73Var instanceof hd5) {
            i2 |= 262144;
        }
        if (i73Var instanceof h60) {
            i2 |= 524288;
        }
        if (i73Var instanceof cu1) {
            i2 |= 1048576;
        }
        if (i73Var instanceof wb2) {
            i2 |= 2097152;
        }
        if (i73Var instanceof iq2) {
            i2 |= 8388608;
        }
        ta3Var.l(i2, cls);
        return i2;
    }

    public static final int x(i73 i73Var) {
        if (!(i73Var instanceof p41)) {
            return v(i73Var);
        }
        p41 p41Var = (p41) i73Var;
        int iX = p41Var.o;
        for (i73 i73Var2 = p41Var.f; i73Var2 != null; i73Var2 = i73Var2.w) {
            iX |= x(i73Var2);
        }
        return iX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(i73 i73Var, int i, int i2) {
        if (i2 != 0 || i73Var.F0()) {
            if ((i & 2) != 0 && (i73Var instanceof lm2)) {
                c93.B((lm2) i73Var);
                if (i2 == 2) {
                    k33.T(i73Var, 2).l1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                k33.V(i73Var).G();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                k33.V(i73Var).W(false);
            }
            if ((i & 256) != 0 && (i73Var instanceof a32)) {
                if (i2 == 1) {
                    um2 um2VarV = k33.V(i73Var);
                    um2VarV.c0(um2VarV.W + 1);
                } else if (i2 == 2) {
                    um2 um2VarV2 = k33.V(i73Var);
                    um2VarV2.c0(um2VarV2.W - 1);
                }
                if (i2 != 2) {
                    um2 um2VarV3 = k33.V(i73Var);
                    if (um2VarV3.W != 0 && !um2VarV3.s() && !um2VarV3.p() && !um2VarV3.V) {
                        ba baVar = (ba) xm2.g(um2VarV3);
                        ji jiVar = (ji) baVar.a0.v;
                        if (um2VarV3.W > 0) {
                            ((rb3) jiVar.t).y(um2VarV3);
                            um2VarV3.V = true;
                        }
                        baVar.M(null);
                    }
                }
            }
            if ((i & 4) != 0 && (i73Var instanceof wd1)) {
                c93.A((wd1) i73Var);
            }
            if ((i & 8) != 0 && (i73Var instanceof ej4)) {
                k33.V(i73Var).d = true;
            }
            if ((i & 64) != 0 && (i73Var instanceof vp3)) {
                ym2 ym2Var = k33.V((vp3) i73Var).N;
                ym2Var.b.d = true;
                fz2 fz2Var = ym2Var.s;
                if (fz2Var != null) {
                    fz2Var.E0();
                }
            }
            if ((i & 2048) != 0 && (i73Var instanceof qt1)) {
                qt1 qt1Var = (qt1) i73Var;
                za0.y = null;
                qt1Var.Y(za0.g);
                if (za0.y != null) {
                    i73 i73Var2 = (i73) qt1Var;
                    if (!i73Var2.j.h) {
                        mc2.y("visitChildren called on an unattached node");
                    }
                    rb3 rb3Var = new rb3(new i73[16]);
                    i73 i73Var3 = i73Var2.j;
                    i73 i73Var4 = i73Var3.w;
                    if (i73Var4 == null) {
                        k33.o(rb3Var, i73Var3);
                    } else {
                        rb3Var.y(i73Var4);
                    }
                    while (true) {
                        int i3 = rb3Var.a;
                        if (i3 == 0) {
                            break;
                        }
                        i73 i73VarQ = (i73) rb3Var.w(i3 - 1);
                        if ((i73VarQ.m & 1024) == 0) {
                            k33.o(rb3Var, i73VarQ);
                        } else {
                            while (i73VarQ != null) {
                                if ((i73VarQ.a & 1024) != 0) {
                                    rb3 rb3Var2 = null;
                                    while (i73VarQ != null) {
                                        if (i73VarQ instanceof cu1) {
                                            cu1 cu1Var = (cu1) i73VarQ;
                                            jt1 jt1Var = ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).n;
                                            if (jt1Var.r.g(cu1Var)) {
                                                jt1Var.g();
                                            }
                                        } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                            int i4 = 0;
                                            for (i73 i73Var5 = ((p41) i73VarQ).f; i73Var5 != null; i73Var5 = i73Var5.w) {
                                                if ((i73Var5.a & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        i73VarQ = i73Var5;
                                                    } else {
                                                        if (rb3Var2 == null) {
                                                            rb3Var2 = new rb3(new i73[16]);
                                                        }
                                                        if (i73VarQ != null) {
                                                            rb3Var2.y(i73VarQ);
                                                            i73VarQ = null;
                                                        }
                                                        rb3Var2.y(i73Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        i73VarQ = k33.Q(rb3Var2);
                                    }
                                    break;
                                }
                                i73VarQ = i73VarQ.w;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (i73Var instanceof ct1)) {
                tx3.y((ct1) i73Var);
            }
            if ((i & 2097152) != 0 && (i73Var instanceof wb2) && i2 == 2) {
                ((wb2) i73Var).C();
            }
        }
    }
}
