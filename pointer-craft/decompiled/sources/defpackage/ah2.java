package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ah2 {
    public static final /* synthetic */ ci2[] n;
    public final String g;
    public final vz0 r;
    public final ThreadLocal y;

    static {
        g04 g04Var = new g04(ah2.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        v54.g.getClass();
        n = new ci2[]{g04Var};
    }

    public ah2(Context context, String str) {
        context.getClass();
        this.g = str;
        this.y = new ThreadLocal();
        this.r = aq2.d(str, new y22((Object) new zg2(this, (byte) 0), (byte) 28), new zg2(this, (byte) 1), 8).g(context, n[0]);
    }

    public final void g(xy1 xy1Var) {
    }

    public final Object y(rw3 rw3Var, Long l) {
        rw3Var.getClass();
        return v70.N(ni1.j, new c(this, rw3Var, l, null, (byte) 27));
    }
}
