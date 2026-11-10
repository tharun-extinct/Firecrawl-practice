package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b62 extends ou0 {
    public final /* synthetic */ e62 c;
    public int i;
    public e40 m;
    public Iterator q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b62(e62 e62Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = e62Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
