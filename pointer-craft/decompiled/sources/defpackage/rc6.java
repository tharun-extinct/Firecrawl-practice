package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc6 extends y66 {
    private static final rc6 zzb;
    private int zzd;
    private int zzf;
    private fc6 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private f76 zzg = a76.x();
    private h76 zzh = n96.v();

    static {
        rc6 rc6Var = new rc6();
        zzb = rc6Var;
        y66.x(rc6.class, rc6Var);
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", r46.r, "zzg", nb6.n, "zzh", xd6.class, "zzi", "zzj", "zzk"});
        }
        byte b = 3;
        if (i2 == 3) {
            return new rc6();
        }
        if (i2 == 4) {
            return new r36(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
