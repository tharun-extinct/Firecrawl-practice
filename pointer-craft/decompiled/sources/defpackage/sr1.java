package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends ou0 {
    public int b;
    public gr1 c;
    public Serializable i;
    public /* synthetic */ Object m;
    public int q;
    public final /* synthetic */ tr1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr1(tr1 tr1Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = tr1Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.m = obj;
        this.q |= Integer.MIN_VALUE;
        return this.w.r(null, this);
    }
}
