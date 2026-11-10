package defpackage;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class cl4 extends ou0 {
    public final /* synthetic */ SessionWorker c;
    public int i;
    public int m;
    public Object q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl4(SessionWorker sessionWorker, ou0 ou0Var) {
        super(ou0Var);
        this.c = sessionWorker;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.t(this);
    }
}
