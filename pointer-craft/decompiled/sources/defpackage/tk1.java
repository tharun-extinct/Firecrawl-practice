package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 extends uk1 {
    public final int y;

    public tk1(int i) {
        super(i == 9 ? R.string.error_hid_already_registered : R.string.error_bluetooth_server);
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk1) && this.y == ((tk1) obj).y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y);
    }

    public final String toString() {
        return du4.w(this.y, "ServiceFailed(error=", ")");
    }
}
