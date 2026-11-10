package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHidDevice$Callback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class lc extends BluetoothHidDevice$Callback {
    public final /* synthetic */ mc g;
    public final /* synthetic */ ji y;

    public lc(mc mcVar, ji jiVar) {
        this.g = mcVar;
        this.y = jiVar;
    }

    public final void onAppStatusChanged(BluetoothDevice bluetoothDevice, boolean z) {
        int connectionState;
        this.g.v.y(Boolean.valueOf(z), "registered");
        if (bluetoothDevice != null) {
            this.g.v.g(bluetoothDevice, "plugged");
            connectionState = this.g.g.getConnectionState(bluetoothDevice);
        } else {
            connectionState = 0;
        }
        ji jiVar = this.y;
        c64 c64Var = (c64) ((s52) jiVar.t).v.getValue();
        boolean z2 = c64Var != null && c64Var.g;
        if (z) {
            ((s52) jiVar.t).j = true;
        }
        c64 c64Var2 = new c64(bluetoothDevice, connectionState, z);
        ((s52) jiVar.t).v.m(null, c64Var2);
        ((s52) jiVar.t).r.a(c64Var2);
        if (!z) {
            AtomicReference atomicReference = (AtomicReference) ((t52) jiVar.a).n;
            s52 s52Var = (s52) jiVar.t;
            while (!atomicReference.compareAndSet(s52Var, null) && atomicReference.get() == s52Var) {
            }
        }
        if (!z2 || z) {
            return;
        }
        s52 s52Var2 = (s52) jiVar.t;
        t52 t52Var = s52Var2.a;
        if (s52Var2.x.compareAndSet(false, true)) {
            fj.c((AtomicReference) t52Var.r, s52Var2);
            fj.c((AtomicReference) t52Var.n, s52Var2);
            ((ng0) ((d5) t52Var.g).t).n.y(xi3.j("already-unregistered gen=", s52Var2.y), "unregister");
        }
        ((s52) jiVar.t).n.g();
    }

    public final void onConnectionStateChanged(BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice != null) {
            this.g.v.g(bluetoothDevice, "profileState(" + i + ")");
        }
        if (i != 3) {
            s52 s52Var = (s52) this.y.t;
            z6 z6Var = s52Var.r;
            c64 c64Var = (c64) s52Var.v.getValue();
            boolean z = false;
            if (c64Var != null && c64Var.g) {
                z = true;
            }
            ((ez3) z6Var.t).z(new yf0(bluetoothDevice, i, z));
        }
    }

    public final void onGetReport(BluetoothDevice bluetoothDevice, byte b, byte b2, int i) {
        this.g.g.replyReport(bluetoothDevice, b, b2, new byte[0]);
    }

    public final void onVirtualCableUnplug(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            this.g.v.g(bluetoothDevice, "unplug");
        }
    }

    public final void onSetProtocol(BluetoothDevice bluetoothDevice, byte b) {
    }

    public final void onInterruptData(BluetoothDevice bluetoothDevice, byte b, byte[] bArr) {
    }

    public final void onSetReport(BluetoothDevice bluetoothDevice, byte b, byte b2, byte[] bArr) {
    }
}
