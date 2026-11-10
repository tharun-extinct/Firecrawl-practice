package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k73 {
    public final ba g;
    public xa3 n;
    public xa3 r;
    public xa3 v;
    public boolean x;
    public xa3 y;

    public k73(ba baVar) {
        this.g = baVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static void y(i73 i73Var, k14 k14Var) {
        if (!i73Var.j.h) {
            mc2.y("visitSubtreeIf called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var2 = i73Var.j;
        i73 i73Var3 = i73Var2.w;
        if (i73Var3 == null) {
            k33.o(rb3Var, i73Var2);
        } else {
            rb3Var.y(i73Var3);
        }
        while (true) {
            int i = rb3Var.a;
            if (i == 0) {
                return;
            }
            i73 i73Var4 = (i73) rb3Var.w(i - 1);
            if ((i73Var4.m & 32) != 0) {
                i73 i73Var5 = i73Var4;
                while (true) {
                    if (i73Var5 != null && i73Var5.h) {
                        if ((i73Var5.a & 32) != 0) {
                            ?? Q = i73Var5;
                            ?? rb3Var2 = 0;
                            while (Q != 0) {
                                if (Q instanceof l73) {
                                    if (((l73) Q).a().g(k14Var)) {
                                        break;
                                    }
                                } else if ((Q.a & 32) != 0 && (Q instanceof p41)) {
                                    i73 i73Var6 = ((p41) Q).f;
                                    int i2 = 0;
                                    Q = Q;
                                    rb3Var2 = rb3Var2;
                                    while (i73Var6 != null) {
                                        if ((i73Var6.a & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                rb3Var2 = rb3Var2;
                                                Q = i73Var6;
                                            } else {
                                                if (rb3Var2 == 0) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var2.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var2.y(i73Var6);
                                            }
                                        }
                                        i73Var6 = i73Var6.w;
                                        Q = Q;
                                        rb3Var2 = rb3Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Q = k33.Q(rb3Var2);
                            }
                        }
                        i73Var5 = i73Var5.w;
                    }
                }
            }
            k33.o(rb3Var, i73Var4);
        }
    }

    public final void g() {
        if (this.x) {
            return;
        }
        this.x = true;
        gf gfVar = new gf(this, (byte) 18);
        xa3 xa3Var = this.g.x0;
        if (xa3Var.v(gfVar)) {
            return;
        }
        xa3Var.g(gfVar);
    }
}
