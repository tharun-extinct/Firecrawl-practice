package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vu1 {
    public String g;
    public List r;
    public String y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu1)) {
            return false;
        }
        vu1 vu1Var = (vu1) obj;
        return Objects.equals(this.g, vu1Var.g) && Objects.equals(this.y, vu1Var.y) && Objects.equals(this.r, vu1Var.r);
    }

    public final int hashCode() {
        return Objects.hash(this.g, this.y, this.r);
    }
}
