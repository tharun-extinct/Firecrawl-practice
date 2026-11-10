package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q34 extends b84 {
    public final long a;
    public final h34 m;
    public final String t;

    public q34(String str, long j, h34 h34Var) {
        this.t = str;
        this.a = j;
        this.m = h34Var;
    }

    @Override // defpackage.b84
    public final r70 t() {
        return this.m;
    }

    @Override // defpackage.b84
    public final e43 x() {
        String str = this.t;
        if (str != null) {
            y54 y54Var = e43.r;
            try {
                return xz5.g(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.b84
    public final long y() {
        return this.a;
    }
}
