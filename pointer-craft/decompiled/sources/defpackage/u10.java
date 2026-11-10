package defpackage;

import com.android.billingclient.api.Purchase;

/* JADX INFO: loaded from: classes2.dex */
public final class u10 extends ou0 {
    public final /* synthetic */ w10 c;
    public int i;
    public Purchase m;
    public jz3 q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(w10 w10Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = w10Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.B(null, 0, this);
    }
}
