package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class hu extends vx0 {
    public final Context g;
    public final String n;
    public final di0 r;
    public final di0 y;

    public hu(Context context, di0 di0Var, di0 di0Var2, String str) {
        if (context == null) {
            l0.q("Null applicationContext");
            throw null;
        }
        this.g = context;
        if (di0Var == null) {
            l0.q("Null wallClock");
            throw null;
        }
        this.y = di0Var;
        if (di0Var2 == null) {
            l0.q("Null monotonicClock");
            throw null;
        }
        this.r = di0Var2;
        if (str != null) {
            this.n = str;
        } else {
            l0.q("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vx0) {
            hu huVar = (hu) ((vx0) obj);
            if (this.g.equals(huVar.g) && this.y.equals(huVar.y) && this.r.equals(huVar.r) && this.n.equals(huVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() ^ ((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.g);
        sb.append(", wallClock=");
        sb.append(this.y);
        sb.append(", monotonicClock=");
        sb.append(this.r);
        sb.append(", backendName=");
        return du4.b(sb, this.n, "}");
    }
}
