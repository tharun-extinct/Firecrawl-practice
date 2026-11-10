package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ xe(my1 my1Var, byte b) {
        this.j = b;
        this.t = my1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                my1Var.g();
                break;
            case 1:
                my1Var.g();
                break;
            default:
                my1Var.g();
                break;
        }
    }
}
