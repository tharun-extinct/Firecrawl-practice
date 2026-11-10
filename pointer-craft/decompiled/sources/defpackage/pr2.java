package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pr2 {
    public final xy1 g;
    public ok2 r;
    public int x;
    public final ro y = new ro((byte) 22);
    public int n = -1;
    public int v = -1;

    public pr2(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final or2 g(int i, long j, boolean z, xy1 xy1Var) {
        ok2 ok2Var = this.r;
        if (ok2Var == null) {
            return lf1.g;
        }
        ex3 ex3Var = (ex3) ok2Var.n;
        boolean z2 = ex3Var instanceof ge;
        dx3 dx3Var = new dx3(ok2Var, i, j, this.y, xy1Var);
        if (!z2) {
            ex3Var.g(dx3Var);
        } else if (z) {
            ge geVar = (ge) ex3Var;
            geVar.t.add(new ay3(1, dx3Var));
            if (!geVar.a) {
                geVar.a = true;
                geVar.j.post(geVar);
            }
        } else {
            ge geVar2 = (ge) ex3Var;
            geVar2.t.add(new ay3(0, dx3Var));
            if (!geVar2.a) {
                geVar2.a = true;
                geVar2.j.post(geVar2);
            }
        }
        pw5.V("compose:lazy:schedule_prefetch:index", i);
        return dx3Var;
    }
}
