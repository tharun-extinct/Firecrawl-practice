package defpackage;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes.dex */
public final class yf0 {
    public final boolean g;
    public final int r;
    public final BluetoothDevice y;

    public yf0(BluetoothDevice bluetoothDevice, int i, boolean z) {
        this.g = z;
        this.y = bluetoothDevice;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return false;
        }
        yf0 yf0Var = (yf0) obj;
        return this.g == yf0Var.g && yf2.p(this.y, yf0Var.y) && this.r == yf0Var.r;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.g) * 31;
        BluetoothDevice bluetoothDevice = this.y;
        return Integer.hashCode(this.r) + ((iHashCode + (bluetoothDevice == null ? 0 : bluetoothDevice.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionStatus(registered=");
        sb.append(this.g);
        sb.append(", pluggedDevice=");
        sb.append(this.y);
        sb.append(", state=");
        return xi3.m(sb, this.r, ")");
    }
}
