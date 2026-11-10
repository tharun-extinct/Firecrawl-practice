package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv1 implements Comparable {
    public static final qv1 a;
    public static final qv1 b;
    public static final qv1 c;
    public static final qv1 f;
    public static final qv1 h;
    public static final qv1 i;
    public static final qv1 k;
    public static final qv1 m;
    public static final qv1 o;
    public static final qv1 p;
    public static final qv1 q;
    public static final qv1 s;
    public static final qv1 t;
    public static final qv1 u;
    public static final qv1 w;
    public static final qv1 z;
    public final int j;

    static {
        qv1 qv1Var = new qv1(100);
        t = qv1Var;
        qv1 qv1Var2 = new qv1(200);
        a = qv1Var2;
        qv1 qv1Var3 = new qv1(300);
        m = qv1Var3;
        qv1 qv1Var4 = new qv1(400);
        q = qv1Var4;
        qv1 qv1Var5 = new qv1(500);
        w = qv1Var5;
        qv1 qv1Var6 = new qv1(600);
        c = qv1Var6;
        qv1 qv1Var7 = new qv1(700);
        i = qv1Var7;
        qv1 qv1Var8 = new qv1(800);
        b = qv1Var8;
        qv1 qv1Var9 = new qv1(900);
        s = qv1Var9;
        p = qv1Var;
        u = qv1Var3;
        z = qv1Var4;
        h = qv1Var5;
        o = qv1Var6;
        f = qv1Var7;
        k = qv1Var9;
        pw5.d(qv1Var, qv1Var2, qv1Var3, qv1Var4, qv1Var5, qv1Var6, qv1Var7, qv1Var8, qv1Var9);
    }

    public qv1(int i2) {
        this.j = i2;
        boolean z2 = false;
        if (1 <= i2 && i2 < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        nc2.g("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qv1) {
            return this.j == ((qv1) obj).j;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qv1 qv1Var) {
        return yf2.f(this.j, qv1Var.j);
    }

    public final int hashCode() {
        return this.j;
    }

    public final String toString() {
        return du4.w(this.j, "FontWeight(weight=", ")");
    }
}
