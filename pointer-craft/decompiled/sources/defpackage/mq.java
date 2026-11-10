package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mq {
    void a(int i, int i2);

    default void i(bz1 bz1Var, Object obj) {
        bz1Var.l(t(), obj);
    }

    void j(int i, int i2, int i3);

    default void n() {
        Object objT = t();
        wn0 wn0Var = objT instanceof wn0 ? (wn0) objT : null;
        if (wn0Var != null) {
            wn0Var.n();
        }
    }

    void p();

    void r(Object obj);

    Object t();

    void x(int i, Object obj);

    void y(int i, Object obj);

    default void l() {
    }
}
