package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fd5 {
    public static volatile pz0 v;
    public final di0 g;
    public final uh5 n;
    public final y21 r;
    public final di0 y;

    public fd5(di0 di0Var, di0 di0Var2, y21 y21Var, uh5 uh5Var, kb5 kb5Var) {
        this.g = di0Var;
        this.y = di0Var2;
        this.r = y21Var;
        this.n = uh5Var;
        ((Executor) kb5Var.j).execute(new k(kb5Var, (byte) 7));
    }

    public static fd5 g() {
        pz0 pz0Var = v;
        if (pz0Var != null) {
            return (fd5) pz0Var.w.get();
        }
        l0.z("Not initialized!");
        return null;
    }

    public static void y(Context context) {
        if (v == null) {
            synchronized (fd5.class) {
                try {
                    if (v == null) {
                        jq jqVar = new jq();
                        context.getClass();
                        jqVar.j = context;
                        v = jqVar.y();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final ro r(ga0 ga0Var) {
        Set setUnmodifiableSet = ga0Var instanceof ga0 ? Collections.unmodifiableSet(ga0.n) : Collections.singleton(new dj1("proto"));
        ro roVarG = cv.g();
        ga0Var.getClass();
        roVarG.t = "cct";
        String str = ga0Var.g;
        String str2 = ga0Var.y;
        if (str2 == null) {
            str2 = "";
        }
        roVarG.a = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new ro((Object) setUnmodifiableSet, (Object) roVarG.j(), (Object) this, (byte) 28);
    }
}
