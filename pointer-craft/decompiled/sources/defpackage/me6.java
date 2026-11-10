package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me6 extends y66 {
    private static final me6 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        me6 me6Var = new me6();
        zzb = me6Var;
        y66.x(me6.class, me6Var);
    }

    public static /* synthetic */ void h(me6 me6Var) {
        me6Var.zzd |= 32;
        me6Var.zzj = 0;
    }

    public static /* synthetic */ void o(me6 me6Var) {
        me6Var.zzd |= 2;
        me6Var.zzf = true;
    }

    public static /* synthetic */ void p(me6 me6Var, boolean z) {
        me6Var.zzd |= 8;
        me6Var.zzh = z;
    }

    public static je6 s() {
        return (je6) zzb.m();
    }

    public static /* synthetic */ void u(me6 me6Var, int i) {
        me6Var.zzd |= 16;
        me6Var.zzi = i;
    }

    public static /* synthetic */ void z(me6 me6Var, long j) {
        me6Var.zzd |= 4;
        me6Var.zzg = j;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new me6();
        }
        if (i2 == 4) {
            return new je6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
