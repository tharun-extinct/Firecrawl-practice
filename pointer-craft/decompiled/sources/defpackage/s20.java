package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s20 extends ou0 {
    public int c;
    public Iterator m;
    public /* synthetic */ Object q;
    public final /* synthetic */ r20 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(r20 r20Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = r20Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.g(null, this);
    }
}
