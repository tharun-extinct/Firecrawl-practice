package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 extends j14 {
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf1(my1 my1Var, byte b) {
        super(my1Var);
        this.y = b;
    }

    @Override // defpackage.j14
    public final m14 g(Object obj) {
        switch (this.y) {
            case 0:
                return new m14(this, obj, obj == null, f73.w, null, true);
            default:
                return new m14(this, obj, obj == null, null, null, false);
        }
    }
}
