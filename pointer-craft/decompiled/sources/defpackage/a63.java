package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a63 {
    public static a63 j;
    public final fl2 g;
    public final ku1 n;
    public final m51 r;
    public final k85 v;
    public final k85 y;
    public float x = Float.NaN;
    public float l = Float.NaN;

    public a63(fl2 fl2Var, k85 k85Var, m51 m51Var, ku1 ku1Var) {
        this.g = fl2Var;
        this.y = k85Var;
        this.r = m51Var;
        this.n = ku1Var;
        this.v = v13.D(k85Var, fl2Var);
    }

    public final long g(int i, long j2) {
        int iA;
        float f = this.l;
        float f2 = this.x;
        int i2 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = b63.g;
            k85 k85Var = this.v;
            pi1 pi1Var = pi1.j;
            ku1 ku1Var = this.n;
            m51 m51Var = this.r;
            gd gdVar = new gd(new kd(str, k85Var, pi1Var, pi1Var, ku1Var, m51Var, false), 1, 1, zs0.y(0, 0, 0, 0, 15));
            i2 = 1;
            float f3 = new gd(new kd(b63.y, k85Var, pi1Var, pi1Var, this.n, m51Var, true), 2, 1, zs0.y(0, 0, 0, 0, 15)).x;
            float f4 = gdVar.x;
            float f5 = f3 - f4;
            this.l = f4;
            this.x = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i2) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iA = iRound >= 0 ? iRound : 0;
            int iJ = ws0.j(j2);
            if (iA > iJ) {
                iA = iJ;
            }
        } else {
            iA = ws0.a(j2);
        }
        return zs0.g(ws0.m(j2), ws0.t(j2), iA, ws0.j(j2));
    }
}
