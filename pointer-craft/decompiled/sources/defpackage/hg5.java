package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hg5 {
    public cd2 g;
    public Long n;
    public int r;
    public boolean v;
    public cd2 y;

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void g(k65 k65Var) {
        cd2 cd2Var;
        cj cjVar = k65Var.g;
        this.v = false;
        cd2 cd2Var2 = this.g;
        if (k65Var.equals(cd2Var2 != null ? (k65) cd2Var2.a : null)) {
            return;
        }
        String str = cjVar.t;
        cd2 cd2Var3 = this.g;
        boolean zP = yf2.p(str, cd2Var3 != null ? ((k65) cd2Var3.a).g.t : null);
        cd2 cd2Var4 = this.g;
        if (zP) {
            if (cd2Var4 != null) {
                cd2Var4.a = k65Var;
                return;
            }
            return;
        }
        this.g = new cd2((byte) 21, cd2Var4, k65Var, false);
        this.y = null;
        int length = cjVar.t.length() + this.r;
        this.r = length;
        if (length > 100000) {
            cd2 cd2Var5 = this.g;
            if ((cd2Var5 != null ? (cd2) cd2Var5.t : null) == null) {
                return;
            }
            while (true) {
                if (cd2Var5 == null) {
                    cd2Var = null;
                } else {
                    cd2 cd2Var6 = (cd2) cd2Var5.t;
                    if (cd2Var6 != null) {
                        cd2Var = (cd2) cd2Var6.t;
                    } else {
                        cd2Var = null;
                    }
                }
                if (cd2Var == null) {
                    break;
                } else {
                    cd2Var5 = (cd2) cd2Var5.t;
                }
            }
            if (cd2Var5 != null) {
                cd2Var5.t = null;
            }
        }
    }
}
