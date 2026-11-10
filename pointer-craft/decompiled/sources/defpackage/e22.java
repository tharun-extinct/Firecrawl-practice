package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
public final class e22 extends ou0 {
    public int b;
    public int[] c;
    public final /* synthetic */ f22 f;
    public long h;
    public long[] i;
    public int k;
    public w12 m;
    public /* synthetic */ Object o;
    public int p;
    public ComponentName q;
    public int s;
    public int u;
    public AppWidgetProviderInfo w;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e22(f22 f22Var, ou0 ou0Var) {
        super(ou0Var);
        this.f = f22Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.o = obj;
        this.k |= Integer.MIN_VALUE;
        return this.f.n(null, null, this);
    }
}
