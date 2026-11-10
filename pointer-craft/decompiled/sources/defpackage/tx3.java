package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tx3 {
    public final /* synthetic */ byte g = 3;

    public static v1 g() {
        v1 v1Var = v1.l;
        if (v1Var != null) {
            return v1Var;
        }
        v1 v1Var2 = new v1((byte) 2);
        v1.l = v1Var2;
        return v1Var2;
    }

    public static final void y(ct1 ct1Var) {
        jt1 jt1Var = ((nt1) ((ba) k33.W(ct1Var)).getFocusOwner()).n;
        if (jt1Var.n.g(ct1Var)) {
            jt1Var.g();
        }
    }

    public int hashCode() {
        switch (this.g) {
            case 3:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.g) {
            case 3:
                String strR = v54.g(getClass()).r();
                strR.getClass();
                return strR;
            default:
                return super.toString();
        }
    }
}
