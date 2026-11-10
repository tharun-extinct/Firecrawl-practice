package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e5 implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ e5(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.va1
    public final void g() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                b5 b5Var = ((w4) obj).g;
                if (b5Var == null) {
                    l0.z("Launcher has not been initialized");
                } else {
                    b5Var.y();
                }
                break;
            case 1:
                ((vq2) obj).n = null;
                break;
            case 2:
                pr2 pr2Var = (pr2) obj;
                ok2 ok2Var = pr2Var.r;
                if (ok2Var != null) {
                    ok2Var.g = false;
                }
                pr2Var.r = null;
                break;
            case 3:
                kr2 kr2Var = (kr2) obj;
                kr2Var.x = true;
                kr2Var.n = 0;
                kr2Var.y.j.remove(kr2Var);
                kr2 kr2Var2 = kr2Var.v;
                if (kr2Var2 != null) {
                    kr2Var2.y();
                }
                kr2Var.v = null;
                break;
            case 4:
                ((qa3) obj).w = null;
                break;
            case 5:
                ((kd3) obj).v();
                break;
            default:
                ((lh4) ((g90) obj)).A(null);
                break;
        }
    }
}
