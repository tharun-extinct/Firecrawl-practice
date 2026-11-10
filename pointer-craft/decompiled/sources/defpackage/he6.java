package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he6 extends y66 {
    private static final he6 zzb;
    private int zzd;
    private int zze;

    static {
        he6 he6Var = new he6();
        zzb = he6Var;
        y66.x(he6.class, he6Var);
    }

    public static he6 p() {
        return zzb;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", r46.x});
        }
        if (i2 == 3) {
            return new he6();
        }
        if (i2 == 4) {
            return new r36((byte) 7);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
