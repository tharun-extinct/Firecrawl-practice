package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eb implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ long t;

    public /* synthetic */ eb(long j, byte b) {
        this.j = b;
        this.t = j;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        long j = this.t;
        switch (b) {
            case 0:
                ja0 ja0Var = (ja0) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ja0Var.j.n() >> 32)) / 2.0f;
                return ja0Var.g(new fb(fIntBitsToFloat, (Object) gh6.n(ja0Var, fIntBitsToFloat), (Object) new m30(5, j), (byte) 0));
            case 1:
                ((nj4) obj).g(si4.g, new ri4(p42.j, this.t, qi4.t, true));
                return og5.g;
            default:
                ((db3) obj).v(g52.y, Long.valueOf(j));
                return null;
        }
    }
}
