package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gm2 {
    public final /* synthetic */ vk2 g;

    public gm2(vk2 vk2Var) {
        this.g = vk2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gm2)) {
            return false;
        }
        gm2 gm2Var = (gm2) obj;
        return g().equals(gm2Var.g()) && this.g.r() == gm2Var.g.r();
    }

    public final Long g() {
        vk2 vk2Var = this.g;
        p44 p44Var = vk2Var.u;
        p44Var.getClass();
        return Long.valueOf(p44Var.y(vk2Var.r()));
    }

    public final int hashCode() {
        return this.g.r() >>> 8;
    }
}
