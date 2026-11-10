package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah extends kk2 implements bz1 {
    public final /* synthetic */ dm1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(dm1 dm1Var) {
        super(2);
        this.t = dm1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        mj1 mj1Var = (mj1) obj;
        mj1 mj1Var2 = (mj1) obj2;
        mj1 mj1Var3 = mj1.a;
        return Boolean.valueOf(mj1Var == mj1Var3 && mj1Var2 == mj1Var3 && !this.t.g.v);
    }
}
