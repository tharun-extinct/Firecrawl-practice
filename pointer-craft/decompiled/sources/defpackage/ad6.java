package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad6 extends y66 {
    private static final ad6 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        ad6 ad6Var = new ad6();
        zzb = ad6Var;
        y66.x(ad6.class, ad6Var);
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ad6();
        }
        byte b = 4;
        if (i2 == 4) {
            return new r36(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
