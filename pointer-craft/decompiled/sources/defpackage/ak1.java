package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends kk2 implements xy1 {
    public final /* synthetic */ bw4 a;
    public final /* synthetic */ long c;
    public final /* synthetic */ sj1 i;
    public final /* synthetic */ long m;
    public final /* synthetic */ long q;
    public final /* synthetic */ dk1 t;
    public final /* synthetic */ us3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(dk1 dk1Var, bc5 bc5Var, long j, long j2, long j3, us3 us3Var, long j4, sj1 sj1Var) {
        super(1);
        this.t = dk1Var;
        this.a = bc5Var;
        this.m = j2;
        this.q = j3;
        this.w = us3Var;
        this.c = j4;
        this.i = sj1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ts3 ts3Var = (ts3) obj;
        dk1 dk1Var = this.t;
        ho4 ho4Var = dk1Var.B;
        long jG = 0;
        bw4 bw4Var = this.a;
        long j = bw4Var != null ? ((je2) bw4Var.getValue()).g : 0L;
        ho4Var.y();
        ho4Var.y();
        long jN = je2.n(j, 0L);
        if (ho4Var.y()) {
            ho4Var.t = jN;
        }
        u6 u6Var = dk1Var.F;
        if (u6Var != null) {
            jG = u6Var.g(this.m, this.q, fl2.j);
        }
        long jN2 = je2.n(jG, jN);
        long j2 = this.c;
        us3 us3Var = this.w;
        ts3Var.x(us3Var);
        us3Var.l0(je2.n((((long) (((int) (jN2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jN2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), us3Var.q), 0.0f, this.i);
        return og5.g;
    }
}
