package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p60 extends i73 implements h60, xk2 {
    public boolean f;
    public qt0 o;

    public static final k44 Q0(p60 p60Var, gh3 gh3Var, p2 p2Var) {
        k44 k44Var;
        if (p60Var.h && p60Var.f) {
            gh3 gh3VarU = k33.U(p60Var);
            if (!gh3Var.Y0().h) {
                gh3Var = null;
            }
            if (gh3Var != null && (k44Var = (k44) p2Var.g()) != null) {
                return lz5.g(gh3VarU, gh3Var, k44Var);
            }
        }
        return null;
    }

    @Override // defpackage.i73
    public final boolean F0() {
        return false;
    }

    @Override // defpackage.xk2
    public final void b(bl2 bl2Var) {
        this.f = true;
    }

    @Override // defpackage.h60
    public final Object w0(gh3 gh3Var, p2 p2Var, ou0 ou0Var) {
        Object objB = k33.B(new o60(this, gh3Var, p2Var, new lt((Object) this, (Object) gh3Var, (Object) p2Var, (byte) 1), null), ou0Var);
        return objB == px0.j ? objB : og5.g;
    }
}
