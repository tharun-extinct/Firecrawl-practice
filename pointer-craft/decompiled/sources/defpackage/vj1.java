package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 extends kk2 implements xy1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj1(boolean z, my1 my1Var) {
        super(1);
        this.t = z;
        this.a = my1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ((o84) obj).x(!this.t && ((Boolean) this.a.g()).booleanValue());
        return og5.g;
    }
}
