package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jz {
    public static final vf1 g = new vf1(new y4((byte) 15), (byte) 1);
    public static Boolean y;

    public static final void g(final cj cjVar, final k85 k85Var, final ku1 ku1Var, final List list, final boolean z, h02 h02Var) {
        Executor executor = (Executor) h02Var.a(g);
        if (executor == null || !y(cjVar.t.length())) {
            h02Var.X(317137883);
            h02Var.b(false);
            return;
        }
        h02Var.X(315439796);
        final fl2 fl2Var = (fl2) h02Var.a(hp0.c);
        final j51 j51Var = (j51) h02Var.a(hp0.j);
        try {
            executor.execute(new Runnable() { // from class: hz
                @Override // java.lang.Runnable
                public final void run() {
                    nb3 nb3VarC;
                    k85 k85Var2 = k85Var;
                    fl2 fl2Var2 = fl2Var;
                    cj cjVar2 = cjVar;
                    j51 j51Var2 = j51Var;
                    ku1 ku1Var2 = ku1Var;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        at4 at4VarJ = it4.j();
                        nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
                        if (nb3Var == null || (nb3VarC = nb3Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            at4 at4VarA = nb3VarC.a();
                            try {
                                k85 k85VarD = v13.D(k85Var2, fl2Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = pi1.j;
                                }
                                rv rvVar = new rv(cjVar2, j51Var2, ku1Var2, k85VarD, list2, z2);
                                rvVar.r();
                                rvVar.g();
                                at4.s(at4VarA);
                                nb3VarC.f().v();
                                nb3VarC.r();
                                Trace.endSection();
                            } catch (Throwable th) {
                                at4.s(at4VarA);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                nb3VarC.r();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        h02Var.b(false);
    }

    public static final boolean y(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = y;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                y = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
