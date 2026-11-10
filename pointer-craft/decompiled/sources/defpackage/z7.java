package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 implements pf4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ z7(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // defpackage.pf4
    public final float g(float f) {
        byte b = this.g;
        Object obj = this.r;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                c8 c8Var = (c8) obj2;
                float fN = c8Var.Q.n(f);
                float fD = fN - c8Var.Q.a.d();
                ((m8) obj).g(fN, 0.0f);
                return fD;
            default:
                ng4 ng4Var = (ng4) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) ng4Var.j.g()).booleanValue()) {
                    return ng4Var.v(ng4Var.j(((lg4) obj).g(2, ng4Var.x(ng4Var.t(f)))));
                }
                throw new eq1("The fling animation was cancelled", (byte) 0);
        }
    }
}
