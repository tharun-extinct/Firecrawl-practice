package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class gx2 extends pl5 {
    public static final mx1 r = new mx1((byte) 1);
    public final nu4 y = new nu4(0);

    @Override // defpackage.pl5
    public final void n() {
        nu4 nu4Var = this.y;
        if (nu4Var.v() > 0) {
            nu4Var.x(0).getClass();
            uo1.B();
            return;
        }
        int i = nu4Var.m;
        Object[] objArr = nu4Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        nu4Var.m = 0;
        nu4Var.j = false;
    }
}
