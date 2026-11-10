package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements r02 {
    public volatile lz0 a;
    public final yl0 j;
    public final Object m = new Object();
    public final yl0 t;

    public k5(yl0 yl0Var) {
        this.j = yl0Var;
        this.t = yl0Var;
    }

    @Override // defpackage.r02
    public final Object n() {
        if (this.a == null) {
            synchronized (this.m) {
                try {
                    if (this.a == null) {
                        yl0 yl0Var = this.j;
                        g5 g5Var = new g5(this.t, (byte) 0);
                        vl5 vl5VarT = yl0Var.t();
                        zx0 zx0VarK = xs2.k(yl0Var);
                        zx0VarK.getClass();
                        kb5 kb5Var = new kb5(vl5VarT, g5Var, zx0VarK);
                        tf0 tf0VarG = v54.g(i5.class);
                        String strY = tf0VarG.y();
                        if (strY == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.a = ((i5) kb5Var.h(tf0VarG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY))).y;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
