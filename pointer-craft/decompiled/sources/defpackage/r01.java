package defpackage;

import java.io.File;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class r01 extends ou0 {
    public int b;
    public String[] c;
    public int i;
    public File m;
    public final /* synthetic */ s01 p;
    public tg1 q;
    public /* synthetic */ Object s;
    public int u;
    public Collection w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(s01 s01Var, ou0 ou0Var) {
        super(ou0Var);
        this.p = s01Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.p.r(null, this);
    }
}
