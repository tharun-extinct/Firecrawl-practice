package defpackage;

import android.content.Context;
import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class bo2 implements o14 {
    public final o14 g;
    public final o14 n;
    public final e20 r;
    public final o14 v;
    public final hp y;

    public bo2(e20 e20Var, hp hpVar, e20 e20Var2, o14 o14Var, kq kqVar) {
        this.g = e20Var;
        this.y = hpVar;
        this.r = e20Var2;
        this.n = o14Var;
        this.v = kqVar;
    }

    @Override // defpackage.p14
    public final Object get() {
        qb1 qb1Var;
        AppDatabase appDatabase = (AppDatabase) this.g.get();
        ji jiVar = (ji) this.y.get();
        wh4 wh4Var = (wh4) this.r.get();
        o14 o14Var = this.n;
        if (o14Var instanceof qb1) {
            qb1Var = (qb1) o14Var;
        } else {
            o14Var.getClass();
            qb1Var = new qb1(o14Var);
        }
        return new ao2(appDatabase, jiVar, wh4Var, qb1Var, (Context) this.v.get());
    }
}
