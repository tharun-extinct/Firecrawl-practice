package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class td6 extends y66 {
    private static final td6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private wc6 zzg;
    private ad6 zzh;

    static {
        td6 td6Var = new td6();
        zzb = td6Var;
        y66.x(td6.class, td6Var);
    }

    public static /* synthetic */ void f(td6 td6Var, ce6 ce6Var) {
        td6Var.zzf = ce6Var;
        td6Var.zze = 8;
    }

    public static /* synthetic */ void h(td6 td6Var, jc6 jc6Var) {
        jc6Var.getClass();
        td6Var.zzf = jc6Var;
        td6Var.zze = 7;
    }

    public static /* synthetic */ void o(td6 td6Var, wc6 wc6Var) {
        wc6Var.getClass();
        td6Var.zzg = wc6Var;
        td6Var.zzd |= 1;
    }

    public static qd6 p() {
        return (qd6) zzb.m();
    }

    public static /* synthetic */ void s(td6 td6Var, he6 he6Var) {
        td6Var.zzf = he6Var;
        td6Var.zze = 4;
    }

    public static /* synthetic */ void u(td6 td6Var, mb6 mb6Var) {
        td6Var.zzf = mb6Var;
        td6Var.zze = 2;
    }

    public static /* synthetic */ void z(td6 td6Var, yb6 yb6Var) {
        td6Var.zzf = yb6Var;
        td6Var.zze = 3;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", mb6.class, yb6.class, he6.class, rc6.class, "zzh", jc6.class, ce6.class});
        }
        if (i2 == 3) {
            return new td6();
        }
        if (i2 == 4) {
            return new qd6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
