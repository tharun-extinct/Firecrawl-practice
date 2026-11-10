package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg5 extends hx0 {
    public static final tg5 a = new tg5();

    @Override // defpackage.hx0
    public final void L(fx0 fx0Var, Runnable runnable) {
        x21.m.a.x(runnable, true, false);
    }

    @Override // defpackage.hx0
    public final void P(fx0 fx0Var, Runnable runnable) {
        x21.m.a.x(runnable, true, true);
    }

    @Override // defpackage.hx0
    public final hx0 R(int i) {
        xq2.l(i);
        return i >= d35.n ? this : super.R(i);
    }

    @Override // defpackage.hx0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
