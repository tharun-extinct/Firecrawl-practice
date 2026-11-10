package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lr extends bb2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(or orVar) {
        super(orVar.a);
        this.q = orVar;
    }

    @Override // defpackage.bb2
    public final Object g(int i) {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                return ((mr) obj).t(i);
            default:
                return ((or) obj).t[i];
        }
    }

    @Override // defpackage.bb2
    public final void y(int i) {
        byte b = this.m;
        Object obj = this.q;
        switch (b) {
            case 0:
                ((mr) obj).l(i);
                break;
            default:
                ((or) obj).g(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(mr mrVar) {
        super(mrVar.a);
        this.q = mrVar;
    }
}
