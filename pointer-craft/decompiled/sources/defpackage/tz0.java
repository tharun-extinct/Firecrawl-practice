package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tz0 extends ou0 {
    public final /* synthetic */ d93 c;
    public int i;
    public Serializable m;
    public Iterator q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(d93 d93Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = d93Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.z(null, null, this);
    }
}
