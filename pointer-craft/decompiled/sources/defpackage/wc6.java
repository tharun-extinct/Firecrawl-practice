package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class wc6 extends y66 {
    private static final wc6 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        wc6 wc6Var = new wc6();
        zzb = wc6Var;
        y66.x(wc6.class, wc6Var);
    }

    public static tc6 A() {
        return (tc6) zzb.m();
    }

    public static /* synthetic */ void B(wc6 wc6Var, int i) {
        wc6Var.zzd |= 128;
        wc6Var.zzl = i;
    }

    public static /* synthetic */ void C(wc6 wc6Var, int i) {
        wc6Var.zzd |= 256;
        wc6Var.zzm = i;
    }

    public static /* synthetic */ void D(wc6 wc6Var, int i) {
        wc6Var.zzd |= 8;
        wc6Var.zzh = i;
    }

    public static /* synthetic */ void E(wc6 wc6Var, long j) {
        wc6Var.zzd |= 16;
        wc6Var.zzi = j;
    }

    public static /* synthetic */ void F(wc6 wc6Var, long j) {
        wc6Var.zzd |= 32;
        wc6Var.zzj = j;
    }

    public static /* synthetic */ void d(wc6 wc6Var) {
        wc6Var.zzd |= 1;
        wc6Var.zze = "8.3.0";
    }

    public static /* synthetic */ void e(wc6 wc6Var, String str) {
        wc6Var.zzd |= 2;
        wc6Var.zzf = str;
    }

    public static /* synthetic */ void f(wc6 wc6Var, int i) {
        wc6Var.zzd |= 16384;
        wc6Var.zzs = i;
    }

    public static /* synthetic */ void h(wc6 wc6Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        wc6Var.zzd |= 4096;
        wc6Var.zzq = str;
    }

    public static /* synthetic */ void k(wc6 wc6Var, boolean z) {
        wc6Var.zzd |= 64;
        wc6Var.zzk = z;
    }

    public static /* synthetic */ void o(wc6 wc6Var) {
        String str = Build.MODEL;
        str.getClass();
        wc6Var.zzd |= 2048;
        wc6Var.zzp = str;
    }

    public static /* synthetic */ void p(wc6 wc6Var, String str) {
        str.getClass();
        wc6Var.zzd |= 4;
        wc6Var.zzg = str;
    }

    public static /* synthetic */ void s(wc6 wc6Var) {
        wc6Var.zzd |= 512;
        wc6Var.zzn = 846465066L;
    }

    public static /* synthetic */ void u(wc6 wc6Var) {
        String str = Build.BRAND;
        str.getClass();
        wc6Var.zzd |= 1024;
        wc6Var.zzo = str;
    }

    public static /* synthetic */ void z(wc6 wc6Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        wc6Var.zzd |= 8192;
        wc6Var.zzr = str;
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new wc6();
        }
        if (i2 == 4) {
            return new tc6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
