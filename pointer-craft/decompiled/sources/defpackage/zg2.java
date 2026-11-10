package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ah2 t;

    public /* synthetic */ zg2(ah2 ah2Var, byte b) {
        this.j = b;
        this.t = ah2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        ah2 ah2Var = this.t;
        switch (b) {
            case 0:
                tx0 tx0Var = (tx0) obj;
                tx0Var.getClass();
                Log.w(v54.g(ah2.class).r(), "CorruptionException in " + ah2Var.g + " DataStore running in process " + Process.myPid(), tx0Var);
                return new db3(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = ah2Var.g;
                LinkedHashSet linkedHashSet = mo4.g;
                linkedHashSet.getClass();
                mu0 mu0Var = null;
                return pw5.k(new lo4(context, str, no4.g, new ko((Object) linkedHashSet, mu0Var, (byte) 16), new kg0(3, mu0Var, (byte) 2)));
        }
    }
}
