package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ll1 implements xy1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ byte t;

    public /* synthetic */ ll1(byte b, boolean z, byte b2) {
        this.j = b2;
        this.t = b;
        this.a = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Long l = (Long) obj;
        switch (this.j) {
            case 0:
                return new nz2(this.t, this.a, l.longValue());
            default:
                return new oz2(this.t, this.a, l.longValue());
        }
    }
}
