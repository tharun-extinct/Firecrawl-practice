package defpackage;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes2.dex */
public final class vp0 {
    public BluetoothGatt g;
    public boolean n;
    public boolean r;
    public boolean v = true;
    public long x;
    public boolean y;

    public final void g() {
        BluetoothGatt bluetoothGatt = this.g;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.g;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.g = null;
    }

    public final void j(boolean z) {
        this.y = z;
    }

    public final void l(long j) {
        this.x = j;
    }

    public final long n() {
        return this.x;
    }

    public final BluetoothGatt r() {
        return this.g;
    }

    public final boolean v() {
        return this.y;
    }

    public final void x(BluetoothGatt bluetoothGatt) {
        this.g = bluetoothGatt;
    }

    public final boolean y() {
        return this.n;
    }
}
