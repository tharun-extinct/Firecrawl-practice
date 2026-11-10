package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o46 extends y66 {
    private static final o46 zzb;
    private int zzd;
    private String zze = "";

    static {
        o46 o46Var = new o46();
        zzb = o46Var;
        y66.x(o46.class, o46Var);
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new o46();
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
