package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w25 {
    public tn1[] g;
    public Object n;
    public short r;
    public boolean y;

    public static w25 y() {
        w25 w25Var = new w25();
        w25Var.y = true;
        w25Var.r = (short) 0;
        return w25Var;
    }

    public w25 g() {
        jr2.l("execute parameter required", ((n64) this.n) != null);
        tn1[] tn1VarArr = this.g;
        boolean z = this.y;
        short s = this.r;
        w25 w25Var = new w25();
        w25Var.n = this;
        w25Var.g = tn1VarArr;
        boolean z2 = false;
        if (tn1VarArr != null && z) {
            z2 = true;
        }
        w25Var.y = z2;
        w25Var.r = s;
        return w25Var;
    }
}
