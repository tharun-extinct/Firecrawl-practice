package defpackage;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yn1 extends ou0 {
    public final /* synthetic */ zn1 c;
    public int i;
    public Object m;
    public FileInputStream q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(zn1 zn1Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = zn1Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return zn1.g(this.c, this);
    }
}
