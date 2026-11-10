package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class if3 {
    public final lr2 g;
    public final int n;
    public final List r;
    public uv2 v;
    public final List y;

    public if3(lr2 lr2Var, List list, List list2, int i) {
        this.g = lr2Var;
        this.y = list;
        this.r = list2;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || if3.class != obj.getClass()) {
            return false;
        }
        if3 if3Var = (if3) obj;
        return this.n == if3Var.n && g().equals(if3Var.g());
    }

    public final List g() {
        uv2 uv2VarA = this.v;
        if (uv2VarA == null) {
            uv2 uv2VarC = pw5.c();
            uv2VarC.addAll(this.y);
            lr2 lr2Var = this.g;
            if (lr2Var != null) {
                uv2VarC.add(lr2Var);
            }
            uv2VarC.addAll(this.r);
            uv2VarA = pw5.a(uv2VarC);
            this.v = uv2VarA;
        }
        uv2VarA.getClass();
        return uv2VarA;
    }

    public final int hashCode() {
        return g().hashCode() + (this.n * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.n + ", mergedHistory=" + g() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public if3() {
        pi1 pi1Var = pi1.j;
        this(null, pi1Var, pi1Var, -1);
    }
}
