package defpackage;

import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class ug0 extends ou0 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ClassicHidService q;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(ClassicHidService classicHidService, ou0 ou0Var) {
        super(ou0Var);
        this.q = classicHidService;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.m = obj;
        this.w |= Integer.MIN_VALUE;
        cm1 cm1Var = ClassicHidService.T;
        return this.q.H(this);
    }
}
