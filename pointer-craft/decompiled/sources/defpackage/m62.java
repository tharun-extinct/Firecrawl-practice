package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m62 extends m5 implements bz1 {
    public static final m62 i = new m62(2, sa0.j, x52.class, "hidDeviceProfileFlow", "hidDeviceProfileFlow(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", 1);

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        Context context = (Context) obj;
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) obj2;
        context.getClass();
        bluetoothAdapter.getClass();
        return x52.y(context, bluetoothAdapter, new vq0((byte) 3));
    }
}
