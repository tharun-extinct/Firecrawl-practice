package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v21 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ v21(jq jqVar, ue5 ue5Var, ThreadPoolExecutor threadPoolExecutor) {
        this.t = jqVar;
        this.a = ue5Var;
        this.m = threadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.j) {
            case 0:
                y21 y21Var = (y21) this.t;
                cv cvVar = (cv) this.a;
                String str = cvVar.g;
                ju juVar = (ju) this.m;
                y21Var.getClass();
                Logger logger = y21.x;
                try {
                    dd5 dd5VarG = y21Var.r.g(str);
                    if (dd5VarG == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        y21Var.v.i(new w21((Object) y21Var, (Object) cvVar, (Object) ((ic0) dd5VarG).g(juVar), (byte) 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                jq jqVar = (jq) this.t;
                ue5 ue5Var = (ue5) this.a;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.m;
                try {
                    zu1 zu1VarA = a11.a(jqVar.j);
                    if (zu1VarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    yu1 yu1Var = (yu1) zu1VarA.g;
                    synchronized (yu1Var.a) {
                        yu1Var.q = threadPoolExecutor;
                        break;
                    }
                    zu1VarA.g.g(new rh1(ue5Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    ue5Var.Z(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                pw1 pw1Var = (pw1) this.t;
                pw1Var.O = pw1Var.B((LayoutInflater) this.a, (ViewGroup) this.m);
                return;
        }
    }

    public /* synthetic */ v21(y21 y21Var, cv cvVar, t94 t94Var, ju juVar) {
        this.t = y21Var;
        this.a = cvVar;
        this.m = juVar;
    }

    public /* synthetic */ v21(pw1 pw1Var, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t = pw1Var;
        this.a = layoutInflater;
        this.m = viewGroup;
    }
}
