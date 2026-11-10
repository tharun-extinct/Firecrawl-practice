package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hi2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ long t;

    public /* synthetic */ hi2(long j, bw4 bw4Var) {
        this.j = (byte) 2;
        this.t = j;
        this.a = bw4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                xd1 xd1Var = (xd1) obj;
                xd1Var.getClass();
                j75 j75Var = (j75) ((ob3) obj2).getValue();
                if (j75Var != null) {
                    long j = j75Var.r;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xd1Var.n() >> 32)) - (((int) (j >> 32)) / 2);
                    vx5.N(xd1Var, j75Var, this.t, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) - (((int) (j & 4294967295L)) / 2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 248);
                }
                break;
            case 1:
                qq2 qq2Var = (qq2) obj2;
                qq2Var.n(je2.r(((je2) ((qg) obj).n()).g, this.t));
                qq2Var.r.g();
                break;
            default:
                xd1.B((xd1) obj, this.t, 0L, 0L, xs2.q(((Number) ((bw4) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ hi2(Object obj, long j, byte b) {
        this.j = b;
        this.a = obj;
        this.t = j;
    }
}
