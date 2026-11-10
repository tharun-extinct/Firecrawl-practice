package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o34 {
    public final long g;
    public final ConcurrentLinkedQueue n;
    public final n34 r;
    public final a35 y;

    public o34(b35 b35Var) {
        TimeUnit.MINUTES.getClass();
        this.g = 300000000000L;
        this.y = b35Var.n();
        this.r = new n34(this, du4.b(new StringBuilder(), ws5.y, " ConnectionPool connection closer"));
        this.n = new ConcurrentLinkedQueue();
    }

    public final int g(m34 m34Var, long j) {
        TimeZone timeZone = ws5.g;
        ArrayList arrayList = m34Var.s;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + m34Var.r.g.t + " was leaked. Did you forget to close a response body?";
                ys3 ys3Var = ys3.g;
                ys3.g.m(((j34) reference).g, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    m34Var.p = j - this.g;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
