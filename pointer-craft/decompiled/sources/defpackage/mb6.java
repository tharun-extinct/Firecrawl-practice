package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class mb6 extends y66 {
    private static final mb6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private fc6 zzh;
    private int zzi;

    static {
        mb6 mb6Var = new mb6();
        zzb = mb6Var;
        y66.x(mb6.class, mb6Var);
    }

    public static /* synthetic */ void d(mb6 mb6Var, gd6 gd6Var) {
        mb6Var.zzf = gd6Var;
        mb6Var.zze = 4;
    }

    public static void f(mb6 mb6Var, mc6 mc6Var) {
        mb6Var.zzi = mc6Var.j;
        mb6Var.zzd |= 4;
    }

    public static mb6 h(byte[] bArr) throws q76 {
        y66 y66Var = zzb;
        int length = bArr.length;
        h66 h66Var = h66.g;
        int i = z46.g;
        h66 h66Var2 = h66.g;
        if (length != 0) {
            y66 y66VarC = y66Var.c();
            try {
                r96 r96VarG = l96.r.g(y66VarC.getClass());
                r96VarG.t(y66VarC, bArr, 0, length, new cr(h66Var2));
                r96VarG.g(y66VarC);
                y66Var = y66VarC;
            } catch (ka6 e) {
                zm5.g(e.getMessage());
                return null;
            } catch (q76 e2) {
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof q76) {
                    throw ((q76) e3.getCause());
                }
                throw new q76(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                zm5.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (y66Var == null || y66.t(y66Var, true)) {
            return (mb6) y66Var;
        }
        zm5.g(new ka6().getMessage());
        return null;
    }

    public static /* synthetic */ void k(mb6 mb6Var, fc6 fc6Var) {
        mb6Var.zzh = fc6Var;
        mb6Var.zzd |= 2;
    }

    public static /* synthetic */ void p(mb6 mb6Var, me6 me6Var) {
        mb6Var.zzf = me6Var;
        mb6Var.zze = 6;
    }

    public static /* synthetic */ void s(mb6 mb6Var, od6 od6Var) {
        mb6Var.zzf = od6Var;
        mb6Var.zze = 7;
    }

    public static /* synthetic */ void u(mb6 mb6Var, int i) {
        mb6Var.zzg = i - 1;
        mb6Var.zzd |= 1;
    }

    public static kb6 z() {
        return (kb6) zzb.m();
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", nb6.y, "zzh", gd6.class, "zzi", nb6.n, me6.class, od6.class});
        }
        if (i2 == 3) {
            return new mb6();
        }
        if (i2 == 4) {
            return new kb6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final od6 o() {
        return this.zze == 7 ? (od6) this.zzf : od6.p();
    }
}
