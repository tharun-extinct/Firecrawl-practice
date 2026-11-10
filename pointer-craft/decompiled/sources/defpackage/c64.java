package defpackage;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes.dex */
public final class c64 {
    public final boolean g;
    public final int r;
    public final Object y;

    public c64(BluetoothDevice bluetoothDevice, int i, boolean z) {
        this.g = z;
        this.y = bluetoothDevice;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c64)) {
            return false;
        }
        c64 c64Var = (c64) obj;
        return this.g == c64Var.g && yf2.p(this.y, c64Var.y) && this.r == c64Var.r;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.g) * 31;
        Object obj = this.y;
        return Integer.hashCode(this.r) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationStatus(registered=");
        sb.append(this.g);
        sb.append(", plugged=");
        sb.append(this.y);
        sb.append(", state=");
        return xi3.m(sb, this.r, ")");
    }
}
