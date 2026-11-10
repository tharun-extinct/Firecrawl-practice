package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes.dex */
public final class dh0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BluetoothDevice c;
    public final /* synthetic */ int i;
    public boolean q;
    public final /* synthetic */ ClassicHidService w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(ClassicHidService classicHidService, BluetoothDevice bluetoothDevice, int i, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = classicHidService;
        this.c = bluetoothDevice;
        this.i = i;
        this.b = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new dh0(this.w, this.c, this.i, this.b, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((dh0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        og5 og5Var = og5.g;
        if (z) {
            if (z) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        final int i = this.i;
        final boolean z2 = this.b;
        xy1 xy1Var = new xy1() { // from class: ch0
            @Override // defpackage.xy1
            public final Object a(Object obj2) {
                g61 g61VarT = g61.t((g61) obj2, 0, i, 1);
                return z2 ? g61.r(g61VarT, null, 0, 0, 0, 0, false, 0, 0, 0L, 0L, true, false, false, 114687) : g61VarT;
            }
        };
        this.q = true;
        this.w.F(this.c, xy1Var);
        px0 px0Var = px0.j;
        return og5Var == px0Var ? px0Var : og5Var;
    }
}
