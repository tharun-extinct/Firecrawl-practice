package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a95 {
    public final fx0 g;
    public int n;
    public final u85[] r;
    public final Object[] y;

    public a95(int i, fx0 fx0Var) {
        this.g = fx0Var;
        this.y = new Object[i];
        this.r = new u85[i];
    }

    public final void g(u85 u85Var, Object obj) {
        int i = this.n;
        this.y[i] = obj;
        this.n = i + 1;
        this.r[i] = u85Var;
    }

    public final void y(fx0 fx0Var) {
        u85[] u85VarArr = this.r;
        int length = u85VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            u85 u85Var = u85VarArr[length];
            u85Var.getClass();
            u85Var.o(this.y[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
