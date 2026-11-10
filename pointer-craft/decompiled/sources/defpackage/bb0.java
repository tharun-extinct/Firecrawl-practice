package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 implements cb0 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ bb0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public final String toString() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((xy1) obj).getClass().getSimpleName() + '@' + a11.z(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ya1) obj) + ']';
        }
    }

    @Override // defpackage.cb0
    public final void y(Throwable th) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((xy1) obj).a(th);
                break;
            default:
                ((ya1) obj).g();
                break;
        }
    }
}
