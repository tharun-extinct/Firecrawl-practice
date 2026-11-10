package defpackage;

import android.content.Context;
import io.appground.blek.data.room.AppDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 extends pl5 {
    public boolean j;
    public final tp3 l;
    public final wh4 n;
    public final ji r;
    public final f34 t;
    public final qb1 v;
    public final Context x;
    public final AppDatabase y;

    public ao2(AppDatabase appDatabase, ji jiVar, wh4 wh4Var, qb1 qb1Var, Context context) {
        appDatabase.getClass();
        jiVar.getClass();
        wh4Var.getClass();
        context.getClass();
        this.y = appDatabase;
        this.r = jiVar;
        this.n = wh4Var;
        this.v = qb1Var;
        this.x = context;
        pi1 pi1Var = pi1.j;
        this.l = kq2.M(new xn2(pi1Var, null, null));
        this.t = pw5.N(ra.s(appDatabase.z().g, new String[]{"layout"}, new q21((byte) 21)), v70.d(this), new sv4(5000L, Long.MAX_VALUE), pi1Var);
    }

    public final void v(int i) {
        this.l.setValue(xn2.g(x(), cj0.x0(x().g, new xh5(i, UUID.randomUUID().getMostSignificantBits())), null, null, 6));
    }

    public final xn2 x() {
        return (xn2) this.l.getValue();
    }
}
