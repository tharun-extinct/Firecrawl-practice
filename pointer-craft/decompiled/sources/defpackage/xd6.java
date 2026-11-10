package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xd6 extends y66 {
    private static final xd6 zzb;
    private int zzd;
    private int zzf;
    private h76 zze = n96.q;
    private String zzg = "";

    static {
        xd6 xd6Var = new xd6();
        zzb = xd6Var;
        y66.x(xd6.class, xd6Var);
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new xd6();
        }
        if (i2 == 4) {
            return new r36(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
