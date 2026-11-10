package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class un5 extends pl5 {
    public final f34 n;
    public final Context r;
    public final BluetoothAdapter v;
    public final f34 x;
    public final tg1 y;

    public un5(AppDatabase appDatabase, tg1 tg1Var, Context context) {
        appDatabase.getClass();
        tg1Var.getClass();
        context.getClass();
        this.y = tg1Var;
        this.r = context;
        qs1 qs1VarS = ra.s(appDatabase.z().g, new String[]{"layout"}, new q21((byte) 21));
        ji0 ji0VarD = v70.d(this);
        sv4 sv4Var = new sv4(5000L, Long.MAX_VALUE);
        pi1 pi1Var = pi1.j;
        this.n = pw5.N(qs1VarS, ji0VarD, sv4Var, pi1Var);
        Object systemService = context.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        this.v = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        k61 k61VarU = appDatabase.u();
        this.x = pw5.N(new wv0(ra.s(k61VarU.g, new String[]{"DeviceConfig"}, new wm0(k61VarU, (byte) 18)), this, (byte) 3), v70.d(this), new sv4(5000L, Long.MAX_VALUE), pi1Var);
    }
}
