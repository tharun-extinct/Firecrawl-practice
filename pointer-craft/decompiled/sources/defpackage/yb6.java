package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb6 extends y66 {
    private static final yb6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        yb6 yb6Var = new yb6();
        zzb = yb6Var;
        y66.x(yb6.class, yb6Var);
    }

    public static /* synthetic */ void f(yb6 yb6Var, me6 me6Var) {
        yb6Var.zzf = me6Var;
        yb6Var.zze = 3;
    }

    public static /* synthetic */ void h(yb6 yb6Var, gd6 gd6Var) {
        yb6Var.zzf = gd6Var;
        yb6Var.zze = 2;
    }

    public static /* synthetic */ void o(yb6 yb6Var, od6 od6Var) {
        yb6Var.zzf = od6Var;
        yb6Var.zze = 4;
    }

    public static pb6 p() {
        return (pb6) zzb.m();
    }

    public static /* synthetic */ void s(yb6 yb6Var, int i) {
        yb6Var.zzg = i - 1;
        yb6Var.zzd |= 1;
    }

    public static void z(yb6 yb6Var, mc6 mc6Var) {
        yb6Var.zzh = mc6Var.j;
        yb6Var.zzd |= 2;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", nb6.y, gd6.class, me6.class, od6.class, "zzh", nb6.n});
        }
        if (i2 == 3) {
            return new yb6();
        }
        if (i2 == 4) {
            return new pb6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final od6 u() {
        return this.zze == 4 ? (od6) this.zzf : od6.p();
    }
}
