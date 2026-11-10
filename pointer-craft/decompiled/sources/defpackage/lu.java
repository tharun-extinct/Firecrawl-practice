package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lu {
    public final String g;
    public final ArrayList y;

    public lu(String str, ArrayList arrayList) {
        if (str == null) {
            l0.q("Null userAgent");
            throw null;
        }
        this.g = str;
        this.y = arrayList;
    }

    public static lu g(String str, ArrayList arrayList) {
        return new lu(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lu)) {
            return false;
        }
        lu luVar = (lu) obj;
        return this.g.equals(luVar.g) && this.y.equals(luVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.g + ", usedDates=" + this.y + "}";
    }
}
