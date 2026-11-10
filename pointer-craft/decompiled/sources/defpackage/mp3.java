package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mp3 {
    public static final long g;
    public static final /* synthetic */ int y = 0;

    static {
        o85[] o85VarArr = n85.y;
        g = n85.r;
    }

    public static final lp3 g(lp3 lp3Var, int i, int i2, long j, o65 o65Var, jt3 jt3Var, av2 av2Var, int i3, int i4, s75 s75Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        o65 o65Var2 = o65Var;
        jt3 jt3Var2 = jt3Var;
        av2 av2Var2 = av2Var;
        int i7 = i3;
        int i8 = i4;
        s75 s75Var2 = s75Var;
        if (i5 == 0 || i5 == lp3Var.g) {
            o85[] o85VarArr = n85.y;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (n85.g(j3, lp3Var.r)) {
                }
            }
            if ((o65Var2 == null || o65Var2.equals(lp3Var.n)) && ((i6 == 0 || i6 == lp3Var.y) && ((jt3Var2 == null || jt3Var2.equals(lp3Var.v)) && ((av2Var2 == null || av2Var2.equals(lp3Var.x)) && ((i7 == 0 || i7 == lp3Var.l) && ((i8 == 0 || i8 == lp3Var.j) && (s75Var2 == null || s75Var2.equals(lp3Var.t)))))))) {
                return lp3Var;
            }
        } else {
            j2 = 0;
        }
        o85[] o85VarArr2 = n85.y;
        if ((j3 & 1095216660480L) == j2) {
            j3 = lp3Var.r;
        }
        if (o65Var2 == null) {
            o65Var2 = lp3Var.n;
        }
        if (i5 == 0) {
            i5 = lp3Var.g;
        }
        if (i6 == 0) {
            i6 = lp3Var.y;
        }
        jt3 jt3Var3 = lp3Var.v;
        if (jt3Var3 != null && jt3Var2 == null) {
            jt3Var2 = jt3Var3;
        }
        if (av2Var2 == null) {
            av2Var2 = lp3Var.x;
        }
        if (i7 == 0) {
            i7 = lp3Var.l;
        }
        if (i8 == 0) {
            i8 = lp3Var.j;
        }
        if (s75Var2 == null) {
            s75Var2 = lp3Var.t;
        }
        return new lp3(i5, i6, j3, o65Var2, jt3Var2, av2Var2, i7, i8, s75Var2);
    }
}
