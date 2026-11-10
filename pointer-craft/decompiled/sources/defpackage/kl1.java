package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kl1 implements xy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ kl1(int i, int i2, byte b) {
        this.j = b;
        this.t = i;
        this.a = i2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Long l = (Long) obj;
        switch (this.j) {
            case 0:
                return new qz2(this.t, this.a, l.longValue());
            default:
                return new pz2(this.t, this.a, l.longValue());
        }
    }
}
