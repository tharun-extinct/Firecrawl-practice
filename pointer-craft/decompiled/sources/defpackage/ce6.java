package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce6 extends y66 {
    private static final ce6 zzb;
    private int zzd;
    private fc6 zze;
    private long zzf;

    static {
        ce6 ce6Var = new ce6();
        zzb = ce6Var;
        y66.x(ce6.class, ce6Var);
    }

    public static zd6 s() {
        return (zd6) zzb.m();
    }

    public static /* synthetic */ void u(ce6 ce6Var, fc6 fc6Var) {
        ce6Var.zze = fc6Var;
        ce6Var.zzd |= 1;
    }

    public static /* synthetic */ void z(ce6 ce6Var, long j) {
        ce6Var.zzd |= 2;
        ce6Var.zzf = j;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ce6();
        }
        if (i2 == 4) {
            return new zd6();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
