package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tu5 {
    public final ck g;
    public final tn1 y;

    public /* synthetic */ tu5(ck ckVar, tn1 tn1Var) {
        this.g = ckVar;
        this.y = tn1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tu5)) {
            return false;
        }
        tu5 tu5Var = (tu5) obj;
        return lb6.g(this.g, tu5Var.g) && lb6.g(this.y, tu5Var.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.y});
    }

    public final String toString() {
        rk4 rk4Var = new rk4(this);
        rk4Var.q(this.g, "key");
        rk4Var.q(this.y, "feature");
        return rk4Var.toString();
    }
}
