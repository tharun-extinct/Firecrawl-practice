package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class lh3 {
    public final rb3 g = new rb3(new xg3[16]);
    public final xa3 y = new xa3(10);

    public boolean g(uy2 uy2Var, bl2 bl2Var, mf2 mf2Var, boolean z) {
        rb3 rb3Var = this.g;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((xg3) objArr[i2]).g(uy2Var, bl2Var, mf2Var, z) || z2;
        }
        return z2;
    }

    public void y(mf2 mf2Var) {
        rb3 rb3Var = this.g;
        int i = rb3Var.a;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((xg3) rb3Var.j[i]).n.t()) {
                rb3Var.w(i);
            }
        }
    }
}
