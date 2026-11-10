package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pe0 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ st4 t;

    public /* synthetic */ pe0(st4 st4Var, byte b) {
        this.j = b;
        this.t = st4Var;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        byte b = this.j;
        og5 og5Var = og5.g;
        st4 st4Var = this.t;
        switch (b) {
            case 0:
                ue2 ue2Var = (ue2) obj;
                if (ue2Var instanceof p72) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof q72) {
                    st4Var.remove(((q72) ue2Var).g);
                } else if (ue2Var instanceof gt1) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof ht1) {
                    st4Var.remove(((ht1) ue2Var).g);
                } else if (ue2Var instanceof mx3) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof nx3) {
                    st4Var.remove(((nx3) ue2Var).g);
                } else if (ue2Var instanceof lx3) {
                    st4Var.remove(((lx3) ue2Var).g);
                } else if (ue2Var instanceof ed1) {
                    st4Var.add(ue2Var);
                } else if (ue2Var instanceof fd1) {
                    st4Var.remove(((fd1) ue2Var).g);
                } else if (ue2Var instanceof dd1) {
                    st4Var.remove(((dd1) ue2Var).g);
                }
                break;
            case 1:
                ue2 ue2Var2 = (ue2) obj;
                if (ue2Var2 instanceof p72) {
                    st4Var.add(ue2Var2);
                } else if (ue2Var2 instanceof q72) {
                    st4Var.remove(((q72) ue2Var2).g);
                } else if (ue2Var2 instanceof gt1) {
                    st4Var.add(ue2Var2);
                } else if (ue2Var2 instanceof ht1) {
                    st4Var.remove(((ht1) ue2Var2).g);
                } else if (ue2Var2 instanceof mx3) {
                    st4Var.add(ue2Var2);
                } else if (ue2Var2 instanceof nx3) {
                    st4Var.remove(((nx3) ue2Var2).g);
                } else if (ue2Var2 instanceof lx3) {
                    st4Var.remove(((lx3) ue2Var2).g);
                } else if (ue2Var2 instanceof ed1) {
                    st4Var.add(ue2Var2);
                } else if (ue2Var2 instanceof fd1) {
                    st4Var.remove(((fd1) ue2Var2).g);
                } else if (ue2Var2 instanceof dd1) {
                    st4Var.remove(((dd1) ue2Var2).g);
                }
                break;
            default:
                ue2 ue2Var3 = (ue2) obj;
                if (ue2Var3 instanceof mx3) {
                    st4Var.add(ue2Var3);
                } else if (ue2Var3 instanceof nx3) {
                    st4Var.remove(((nx3) ue2Var3).g);
                } else if (ue2Var3 instanceof lx3) {
                    st4Var.remove(((lx3) ue2Var3).g);
                } else if (ue2Var3 instanceof ed1) {
                    st4Var.add(ue2Var3);
                } else if (ue2Var3 instanceof fd1) {
                    st4Var.remove(((fd1) ue2Var3).g);
                } else if (ue2Var3 instanceof dd1) {
                    st4Var.remove(((dd1) ue2Var3).g);
                }
                break;
        }
        return og5Var;
    }
}
