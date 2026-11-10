package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nd6 extends y66 {
    private static final nd6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        nd6 nd6Var = new nd6();
        zzb = nd6Var;
        y66.x(nd6.class, nd6Var);
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", r46.v, "zzf"});
        }
        if (i2 == 3) {
            return new nd6();
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
