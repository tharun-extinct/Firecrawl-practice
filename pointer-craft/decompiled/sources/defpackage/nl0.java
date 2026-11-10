package defpackage;

import android.content.SharedPreferences;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl0 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ nl0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [e11] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4, types: [xp2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [xp2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:28:0x0085). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws ha1 {
        f41 f41Var;
        e11 e11VarY;
        e11 e11VarG;
        switch (this.j) {
            case 0:
                yl0 yl0Var = (yl0) this.t;
                yl0Var.j.g(new ol0((tj3) this.a, yl0Var, (byte) 0));
                return;
            case 1:
                rm3 rm3Var = (rm3) this.t;
                n14 n14Var = (n14) this.a;
                if (rm3Var.y != rm3.n) {
                    l0.z("provide() can be called only once.");
                    return;
                }
                synchronized (rm3Var) {
                    f41Var = rm3Var.g;
                    rm3Var.g = null;
                    rm3Var.y = n14Var;
                    break;
                }
                f41Var.r(n14Var);
                return;
            case 2:
                ys2 ys2Var = (ys2) this.t;
                n14 n14Var2 = (n14) this.a;
                synchronized (ys2Var) {
                    try {
                        if (ys2Var.y == null) {
                            ys2Var.g.add(n14Var2);
                        } else {
                            ys2Var.y.add(n14Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                py0 py0Var = (py0) this.t;
                Runnable runnable = (Runnable) this.a;
                Process.setThreadPriority(py0Var.r);
                StrictMode.ThreadPolicy threadPolicy = py0Var.n;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 4:
                r11 r11Var = (r11) this.t;
                x25 x25Var = (x25) this.a;
                lx4 lx4Var = r11Var.v;
                String str = lx4.y.t;
                ?? r2 = lx4Var.g;
                String string = ((SharedPreferences) r2.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) r2.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string == null || string2 == null) {
                    r2 = 0;
                } else {
                    try {
                        int iD = du4.D(ei3.y(string));
                        if (iD == 0) {
                            e11VarY = e11.y(string2);
                        } else if (iD != 1) {
                            Log.e(str, "Reached unreachable section in #retrieveAppCheckToken()", null);
                            r2 = 0;
                        } else {
                            e11VarG = e11.g(string2);
                        }
                    } catch (IllegalArgumentException e) {
                        string = "Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e.getMessage();
                        Log.e(str, string, null);
                        ((SharedPreferences) r2.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                }
                if (r2 != 0) {
                    r2 = e11VarY;
                    r2 = e11VarG;
                    r11Var.w = r2;
                }
                r2 = e11VarY;
                r2 = e11VarG;
                x25Var.y(null);
                return;
            case 5:
                ((ib0) this.t).E((t42) this.a);
                return;
            case 6:
                ((zh4) this.t).l((jk3) this.a, og5.g);
                return;
            case 7:
                Runnable runnable2 = (Runnable) this.t;
                jl jlVar = (jl) this.a;
                try {
                    runnable2.run();
                    return;
                } finally {
                    jlVar.g();
                }
            default:
                es5 es5Var = (es5) this.t;
                ju2 ju2Var = (ju2) this.a;
                if (es5Var.a) {
                    return;
                }
                es5Var.m = ju2Var;
                ju2Var.g(es5Var);
                return;
        }
    }
}
