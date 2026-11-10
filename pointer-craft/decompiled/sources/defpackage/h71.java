package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h71 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h71(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.m = obj;
        this.t = i;
        this.a = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Object obj = this.a;
        byte b2 = this.t;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ((i71) obj2).r.q(b2, obj);
                break;
            default:
                ((jy3) obj2).q(b2, obj);
                break;
        }
    }
}
