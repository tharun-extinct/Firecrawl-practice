package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fu extends b00 {
    public final ArrayList g;

    public fu(ArrayList arrayList) {
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b00)) {
            return false;
        }
        return this.g.equals(((fu) ((b00) obj)).g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.g + "}";
    }
}
