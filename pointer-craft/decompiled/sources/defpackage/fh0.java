package defpackage;

import android.bluetooth.BluetoothAdapter;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class fh0 extends ou0 {
    public int c;
    public BluetoothAdapter m;
    public /* synthetic */ Object q;
    public final /* synthetic */ ClassicHidService w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(ClassicHidService classicHidService, ou0 ou0Var) {
        super(ou0Var);
        this.w = classicHidService;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.N(this);
    }
}
