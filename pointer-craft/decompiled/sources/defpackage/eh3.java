package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh3 implements fh3 {
    @Override // defpackage.fh3
    public final boolean b(um2 um2Var) {
        return true;
    }

    @Override // defpackage.fh3
    public final void l(um2 um2Var, long j, c72 c72Var, int i, boolean z) {
        um2Var.C(j, c72Var, i, z);
    }

    @Override // defpackage.fh3
    public final int v() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [i73] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.fh3
    public final boolean w(c72 c72Var, um2 um2Var) {
        gh3 gh3Var = um2Var.M.n;
        gh3Var.getClass();
        i73 i73VarB1 = gh3Var.b1(hh3.l(16));
        if (i73VarB1 != null && i73VarB1.h) {
            if (!i73VarB1.j.h) {
                mc2.y("visitLocalDescendants called on an unattached node");
            }
            i73 i73Var = i73VarB1.j;
            if ((i73Var.m & 16) != 0) {
                while (i73Var != null) {
                    if ((i73Var.a & 16) != 0) {
                        ?? Q = i73Var;
                        ?? rb3Var = 0;
                        while (Q != 0) {
                            if (Q instanceof tu3) {
                                if (((tu3) Q).g0()) {
                                    c72Var.a = c72Var.j.y - 1;
                                    return true;
                                }
                            } else if ((Q.a & 16) != 0 && (Q instanceof p41)) {
                                i73 i73Var2 = ((p41) Q).f;
                                int i = 0;
                                while (i73Var2 != null) {
                                    if ((i73Var2.a & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                            rb3Var = rb3Var;
                                            Q = i73Var2;
                                        } else {
                                            if (rb3Var == 0) {
                                                rb3Var = new rb3(new i73[16]);
                                            }
                                            if (Q != 0) {
                                                rb3Var.y(Q);
                                                Q = 0;
                                            }
                                            rb3Var.y(i73Var2);
                                        }
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    i73Var2 = i73Var2.w;
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                                if (i == 1) {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                } else {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                            }
                            Q = k33.Q(rb3Var);
                        }
                    }
                    i73Var = i73Var.w;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.fh3
    public final boolean y(i73 i73Var) {
        ?? rb3Var = 0;
        while (true) {
            int i = 0;
            if (i73Var == 0) {
                return false;
            }
            if (i73Var instanceof tu3) {
                ((tu3) i73Var).v0();
            } else if ((i73Var.a & 16) != 0 && (i73Var instanceof p41)) {
                i73 i73Var2 = ((p41) i73Var).f;
                rb3Var = rb3Var;
                i73Var = i73Var;
                while (i73Var2 != null) {
                    if ((i73Var2.a & 16) != 0) {
                        i++;
                        if (i == 1) {
                            rb3Var = rb3Var;
                            i73Var = i73Var2;
                        } else {
                            if (rb3Var == 0) {
                                rb3Var = new rb3(new i73[16]);
                            }
                            if (i73Var != 0) {
                                rb3Var.y(i73Var);
                                i73Var = 0;
                            }
                            rb3Var.y(i73Var2);
                        }
                    }
                    i73Var2 = i73Var2.w;
                    rb3Var = rb3Var;
                    i73Var = i73Var;
                }
                if (i == 1) {
                }
            }
            i73Var = k33.Q(rb3Var);
        }
    }
}
