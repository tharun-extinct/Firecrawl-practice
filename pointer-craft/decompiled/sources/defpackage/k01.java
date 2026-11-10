package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class k01 extends ou0 {
    public int b;
    public u54 c;
    public boolean i;
    public Object m;
    public final /* synthetic */ p01 p;
    public Object q;
    public /* synthetic */ Object s;
    public int u;
    public Serializable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(p01 p01Var, ou0 ou0Var) {
        super(ou0Var);
        this.p = p01Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.p.t(false, this);
    }
}
