package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class el4 extends a0 implements ix0 {
    public final /* synthetic */ eq a;
    public final /* synthetic */ Context m;
    public final /* synthetic */ s95 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public el4(s95 s95Var, eq eqVar, Context context) {
        d93 d93Var = d93.t;
        this.t = s95Var;
        this.a = eqVar;
        this.m = context;
        super(d93Var);
    }

    @Override // defpackage.ix0
    public final void f(fx0 fx0Var, Throwable th) {
        Context context = this.m;
        eq eqVar = this.a;
        s95 s95Var = this.t;
        m50.T(s95Var, null, new s3(eqVar, context, th, s95Var, (mu0) null), 3);
    }
}
