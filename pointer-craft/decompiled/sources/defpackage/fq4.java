package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fq4 extends kk2 implements xy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int m;
    public final /* synthetic */ v33 q;
    public final /* synthetic */ long t;
    public final /* synthetic */ us3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq4(gq4 gq4Var, long j, int i, int i2, v33 v33Var, us3 us3Var) {
        super(1);
        this.t = j;
        this.a = i;
        this.m = i2;
        this.q = v33Var;
        this.w = us3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ts3 ts3Var = (ts3) obj;
        long j = (((long) this.a) << 32) | (((long) this.m) & 4294967295L);
        fl2 layoutDirection = this.q.getLayoutDirection();
        long j2 = this.t;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == fl2.j ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        ts3.a(ts3Var, this.w, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return og5.g;
    }
}
