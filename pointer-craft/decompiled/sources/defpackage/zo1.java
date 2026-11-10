package defpackage;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zo1 {
    public static boolean a;
    public static final x25 t = new x25();
    public final Executor g;
    public final String j;
    public final String l;
    public final wo1 n;
    public final bi6 r;
    public final String v;
    public final String x;
    public final hj3 y;

    public zo1(Context context, String str, wo1 wo1Var, Executor executor, Executor executor2) {
        context.getClass();
        executor.getClass();
        executor2.getClass();
        this.g = executor;
        this.y = new hj3();
        this.r = new bi6();
        jr2.m(wo1Var);
        this.n = wo1Var;
        jr2.m(str);
        this.v = str;
        this.j = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL("us-central1");
            this.x = "us-central1";
            this.l = "us-central1";
        } catch (MalformedURLException unused) {
            this.x = "us-central1";
            this.l = null;
        }
        synchronized (t) {
            if (a) {
                return;
            }
            byte b = 1;
            a = true;
            executor2.execute(new il(context, b));
        }
    }
}
