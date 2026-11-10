package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p71 extends v71 {
    public final List g;

    public p71(List list) {
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p71) && this.g.equals(((p71) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "DeviceList(devices=" + this.g + ")";
    }
}
