package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zc4 implements du2, AutoCloseable {
    public boolean a;
    public final String j;
    public final yc4 t;

    public zc4(String str, yc4 yc4Var) {
        this.j = str;
        this.t = yc4Var;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        if (vt2Var == vt2.ON_DESTROY) {
            this.a = false;
            gu2Var.a().x(this);
        }
    }

    public final yc4 u() {
        return this.t;
    }

    public final void w(ji jiVar, ju2 ju2Var) {
        jiVar.getClass();
        ju2Var.getClass();
        if (this.a) {
            l0.z("Already attached to lifecycleOwner");
            return;
        }
        this.a = true;
        ju2Var.g(this);
        jiVar.T(this.j, (rl0) this.t.y.q);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
