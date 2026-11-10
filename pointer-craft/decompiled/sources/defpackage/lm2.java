package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface lm2 extends o41 {
    default int D(zy2 zy2Var, p33 p33Var, int i) {
        byte b = 1;
        return new km2(this, b).g(new eg2(zy2Var, zy2Var.getLayoutDirection()), new b21(p33Var, jh3.j, kh3.t, b), zs0.y(0, i, 0, 0, 13)).g();
    }

    default int W(zy2 zy2Var, p33 p33Var, int i) {
        return v(new eg2(zy2Var, zy2Var.getLayoutDirection()), new b21(p33Var, jh3.j, kh3.j, (byte) 1), zs0.y(0, 0, 0, i, 7)).y();
    }

    default int i(zy2 zy2Var, p33 p33Var, int i) {
        return new km2(this, (byte) 0).g(new eg2(zy2Var, zy2Var.getLayoutDirection()), new b21(p33Var, jh3.t, kh3.t, (byte) 1), zs0.y(0, i, 0, 0, 13)).g();
    }

    u33 v(v33 v33Var, p33 p33Var, long j);

    default int x(zy2 zy2Var, p33 p33Var, int i) {
        return new fa4((Object) this, (byte) 18).G(new eg2(zy2Var, zy2Var.getLayoutDirection()), new b21(p33Var, jh3.t, kh3.j, (byte) 1), zs0.y(0, 0, 0, i, 7)).y();
    }
}
