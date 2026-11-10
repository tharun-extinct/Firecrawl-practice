package defpackage;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes2.dex */
public final class ag0 extends ou0 {
    public final /* synthetic */ ng0 c;
    public int i;
    public BluetoothDevice m;
    public boolean q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(ng0 ng0Var, ou0 ou0Var) {
        super(ou0Var);
        this.c = ng0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.w = obj;
        this.i |= Integer.MIN_VALUE;
        return this.c.g(null, false, this);
    }
}
