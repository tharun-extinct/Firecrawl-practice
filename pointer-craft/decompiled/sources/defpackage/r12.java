package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class r12 extends ou0 {
    public final /* synthetic */ w12 b;
    public int c;
    public /* synthetic */ Object i;
    public Context m;
    public tp q;
    public int s;
    public Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r12(w12 w12Var, ou0 ou0Var) {
        super(ou0Var);
        this.b = w12Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.i = obj;
        this.s |= Integer.MIN_VALUE;
        return this.b.g(null, 0, this);
    }
}
