package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd4 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ bz1 c;
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ bz1 t;
    public final /* synthetic */ tb3 w;

    /* JADX WARN: Multi-variable type inference failed */
    public wd4(int i, bz1 bz1Var, nm0 nm0Var, bz1 bz1Var2, bz1 bz1Var3, tb3 tb3Var, bz1 bz1Var4) {
        this.j = i;
        this.t = bz1Var;
        this.a = nm0Var;
        this.m = bz1Var2;
        this.q = bz1Var3;
        this.w = tb3Var;
        this.c = bz1Var4;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            kq2.x(this.j, this.t, this.a, this.m, this.q, this.w, this.c, h02Var, 0);
        } else {
            h02Var.Q();
        }
        return og5.g;
    }
}
