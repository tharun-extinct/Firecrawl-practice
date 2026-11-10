package defpackage;

import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class up implements zq, jb0, nu0, vy4, lp4 {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte j;
    public static final up t = new up(25);
    public static final up a = new up(26);
    public static final up m = new up(27);
    public static final up q = new up(28);
    public static final up w = new up(29);

    public /* synthetic */ up(byte b) {
        this.j = b;
    }

    public static /* synthetic */ void j(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void n(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void q() {
        throw new il0();
    }

    public static /* synthetic */ void r(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void t(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    public static /* synthetic */ void x(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void y() {
        throw new il0();
    }

    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        long jN;
        switch (this.j) {
            case 9:
                f11 f11Var = (f11) obj;
                f11Var.getClass();
                yo1 yo1Var = f11Var.y;
                if (yo1Var != null) {
                    Log.w("FirebaseContextProvider", "Error getting App Check token. Error: " + yo1Var);
                }
                return br2.s(f11Var.g);
            default:
                ok okVar = (ok) obj;
                jr2.m(okVar);
                String str = okVar.g;
                try {
                    jN = (long) (Double.parseDouble(okVar.y.replace("s", "")) * 1000.0d);
                } catch (NumberFormatException unused) {
                    Map mapN = yy5.n(str);
                    jN = (e11.n("exp", mapN) - e11.n("iat", mapN)) * 1000;
                }
                return br2.s(new e11(jN, System.currentTimeMillis(), str));
        }
    }

    @Override // defpackage.jb0
    public void cancel() {
    }

    @Override // defpackage.lp4
    public boolean g() {
        return false;
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        if (nj6Var.t()) {
            return br2.s(f11.g((e11) nj6Var.l()));
        }
        Exception excX = nj6Var.x();
        return br2.s(new f11("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new yo1(excX.getMessage() != null ? excX.getMessage() : "Unknown error generating App Check token", nj6Var.x())));
    }

    @Override // defpackage.zq
    public int v(int i, fl2 fl2Var) {
        return Math.round((1.0f + (fl2Var == fl2.j ? 1.0f : (-1.0f) * 1.0f)) * ((i + 0) / 2.0f));
    }

    public void w(ic5 ic5Var, lc5 lc5Var, boolean z) {
        switch (this.j) {
            case 25:
                ic5Var.x(lc5Var);
                break;
            case 26:
                ic5Var.g(lc5Var);
                break;
            case 27:
                ic5Var.v(lc5Var);
                break;
            case 28:
                ic5Var.y();
                break;
            default:
                ic5Var.r();
                break;
        }
    }

    public /* synthetic */ up(Object obj, byte b) {
        this.j = b;
    }
}
