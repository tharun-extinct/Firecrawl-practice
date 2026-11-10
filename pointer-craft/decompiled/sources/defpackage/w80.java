package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w80 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ w80(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        int i = this.t;
        Object obj = this.a;
        switch (b) {
            case 0:
                ((xy1) obj).a(Integer.valueOf(i));
                return og5.g;
            default:
                return Integer.valueOf(((j75) ((si0) obj).v).y.n(i));
        }
    }
}
