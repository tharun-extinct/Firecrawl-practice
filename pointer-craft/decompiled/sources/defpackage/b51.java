package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b51 implements oj0 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ b51(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.oj0
    public final long g() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                c51 c51Var = (c51) obj;
                long j = ((m94) c51Var.A.y).r;
                if (j != 16) {
                    return j;
                }
                h94 h94Var = (h94) v70.b(c51Var, k94.g);
                if (h94Var != null) {
                    long j2 = h94Var.g;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((jj0) v70.b(c51Var, mt0.g)).g;
            default:
                return ((m94) obj).r;
        }
    }
}
