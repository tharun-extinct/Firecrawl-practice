package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appground.blehid.BleHidService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g62 implements ServiceConnection {
    public final /* synthetic */ h62 g;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ rv y;

    public g62(h62 h62Var, rv rvVar, boolean z) {
        this.g = h62Var;
        this.y = rvVar;
        this.r = z;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.g.n();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        iBinder.getClass();
        h62 h62Var = this.g;
        e62 e62Var = ((a62) iBinder).r;
        rv rvVar = this.y;
        e62Var.a = rvVar;
        BluetoothDevice bluetoothDevice = e62Var.b;
        ((ew4) rvVar.j).a(bluetoothDevice != null ? e62Var.u(bluetoothDevice) : null);
        rv rvVar2 = e62Var.a;
        if (rvVar2 != null) {
            ConcurrentHashMap concurrentHashMap = e62Var.s;
            ArrayList arrayList = new ArrayList(concurrentHashMap.size());
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((g61) ((Map.Entry) it.next()).getValue());
            }
            ((co4) rvVar2.t).p(arrayList);
        }
        rv rvVar3 = e62Var.a;
        if (rvVar3 != null) {
            ex4 ex4Var = e62Var.p;
            ex4Var.getClass();
            ((ew4) rvVar3.m).m(null, ex4Var);
        }
        rv rvVar4 = e62Var.a;
        if (rvVar4 != null) {
            de4 de4Var = e62Var.u;
            de4Var.getClass();
            ((ew4) rvVar4.a).m(null, de4Var);
        }
        h62Var.y = e62Var.s();
        h62Var.r = e62Var;
        this.g.n = true;
        e62 e62Var2 = this.g.r;
        if (!yf2.p(e62Var2 != null ? Boolean.valueOf(e62Var2.F) : null, Boolean.valueOf(this.g.t))) {
            h62 h62Var2 = this.g;
            boolean z = h62Var2.t;
            e62 e62Var3 = h62Var2.r;
            if (z) {
                if (e62Var3 != null) {
                    e62Var3.F = true;
                    e62Var3.z.y("foreground", "app");
                    e62Var3.o();
                }
            } else if (e62Var3 != null) {
                e62Var3.F = false;
                e62Var3.z.y("background", "app");
                e62Var3.h();
            }
        }
        h62 h62Var3 = this.g;
        String str = h62Var3.x;
        if (str != null) {
            h62Var3.g(str);
        }
        h62 h62Var4 = this.g;
        h62Var4.x = null;
        e62 e62Var4 = h62Var4.r;
        BleHidService bleHidService = e62Var4 instanceof BleHidService ? (BleHidService) e62Var4 : null;
        if (bleHidService != null) {
            bleHidService.O(this.r);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h62 h62Var = this.g;
        h62Var.n = false;
        h62Var.r = null;
        h62Var.y = null;
    }
}
