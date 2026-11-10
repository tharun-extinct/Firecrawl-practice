package defpackage;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class eo1 extends ou0 {
    public final /* synthetic */ fo1 c;
    public int i;
    public FileOutputStream m;
    public FileOutputStream q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(fo1 fo1Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = fo1Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.y(null, this);
    }
}
