package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ex2 {
    public final v92 g;
    public final /* synthetic */ ka3 n;
    public int r = -1;
    public boolean y;

    public ex2(ka3 ka3Var, v92 v92Var) {
        this.n = ka3Var;
        this.g = v92Var;
    }

    public final void g(boolean z) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        int i = z ? 1 : -1;
        ka3 ka3Var = this.n;
        int i2 = ka3Var.r;
        ka3Var.r = i + i2;
        if (!ka3Var.n) {
            ka3Var.n = true;
            while (true) {
                try {
                    int i3 = ka3Var.r;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    ka3Var.n = false;
                    throw th;
                }
            }
            ka3Var.n = false;
        }
        if (this.y) {
            ka3Var.y(this);
        }
    }
}
