package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xf0 extends nz1 implements bz1 {
    public static final xf0 i = new xf0(2, og0.class, "registerAdapterStateFlow", "registerAdapterStateFlow(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)Lkotlinx/coroutines/flow/Flow;", 1);

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Context context = (Context) obj;
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) obj2;
        context.getClass();
        bluetoothAdapter.getClass();
        return a11.v(new c(bluetoothAdapter, context, null, (byte) 14));
    }
}
