package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd6 extends y66 {
    private static final gd6 zzb;
    private int zzd;
    private int zze;

    static {
        gd6 gd6Var = new gd6();
        zzb = gd6Var;
        y66.x(gd6.class, gd6Var);
    }

    public static cd6 s() {
        return (cd6) zzb.m();
    }

    public static /* synthetic */ void u(gd6 gd6Var, int i) {
        gd6Var.zze = i - 1;
        gd6Var.zzd |= 1;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", r46.n});
        }
        if (i2 == 3) {
            return new gd6();
        }
        if (i2 == 4) {
            return new cd6();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
