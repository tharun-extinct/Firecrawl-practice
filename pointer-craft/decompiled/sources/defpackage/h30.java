package defpackage;

import io.appground.blehid.BleHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class h30 extends ou0 {
    public /* synthetic */ Object m;
    public final /* synthetic */ BleHidService q;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(BleHidService bleHidService, ou0 ou0Var) {
        super(ou0Var);
        this.q = bleHidService;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.m = obj;
        this.w |= Integer.MIN_VALUE;
        return this.q.z(this);
    }
}
