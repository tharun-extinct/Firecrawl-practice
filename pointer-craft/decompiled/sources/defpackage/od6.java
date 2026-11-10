package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od6 extends y66 {
    private static final od6 zzb;
    private int zzd;
    private h76 zze = n96.v();
    private String zzf = "";
    private boolean zzg;

    static {
        od6 od6Var = new od6();
        zzb = od6Var;
        y66.x(od6.class, od6Var);
    }

    public static od6 p() {
        return zzb;
    }

    public static /* synthetic */ void u(od6 od6Var, boolean z) {
        od6Var.zzd |= 2;
        od6Var.zzg = z;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", nd6.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new od6();
        }
        if (i2 == 4) {
            return new id6();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
