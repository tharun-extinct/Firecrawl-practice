package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fc6 extends y66 {
    private static final fc6 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        fc6 fc6Var = new fc6();
        zzb = fc6Var;
        y66.x(fc6.class, fc6Var);
    }

    public static void f(fc6 fc6Var, int i) {
        fc6Var.zzg = xi3.y(i);
        fc6Var.zzd |= 4;
    }

    public static /* synthetic */ void h(fc6 fc6Var) {
        fc6Var.zzd |= 32;
        fc6Var.zzj = 0;
    }

    public static /* synthetic */ void o(fc6 fc6Var, int i) {
        fc6Var.zzd |= 16;
        fc6Var.zzi = i;
    }

    public static ac6 p() {
        return (ac6) zzb.m();
    }

    public static /* synthetic */ void s(fc6 fc6Var, int i) {
        fc6Var.zzd |= 1;
        fc6Var.zze = i;
    }

    public static /* synthetic */ void u(fc6 fc6Var, String str) {
        fc6Var.zzd |= 8;
        fc6Var.zzh = str;
    }

    public static /* synthetic */ void z(fc6 fc6Var, String str) {
        str.getClass();
        fc6Var.zzd |= 2;
        fc6Var.zzf = str;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", nb6.r, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new fc6();
        }
        if (i2 == 4) {
            return new ac6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
