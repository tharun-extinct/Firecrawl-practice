package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jc6 extends y66 {
    private static final jc6 zzb;

    static {
        jc6 jc6Var = new jc6();
        zzb = jc6Var;
        y66.x(jc6.class, jc6Var);
    }

    public static jc6 p() {
        return zzb;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        byte b = 2;
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new jc6();
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
