package defpackage;

import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends ou0 {
    public /* synthetic */ Object m;
    public final /* synthetic */ ClassicHidService q;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(ClassicHidService classicHidService, ou0 ou0Var) {
        super(ou0Var);
        this.q = classicHidService;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.m = obj;
        this.w |= Integer.MIN_VALUE;
        return this.q.z(this);
    }
}
