package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc2 implements bw4 {
    public final tp3 a;
    public long c;
    public final /* synthetic */ ec2 i;
    public Float j;
    public t25 m;
    public boolean q;
    public Float t;
    public boolean w;

    public bc2(ec2 ec2Var, Float f, Float f2, ac2 ac2Var) {
        te5 te5Var = m50.w;
        this.i = ec2Var;
        this.j = f;
        this.t = f2;
        this.a = kq2.M(f);
        this.m = new t25(ac2Var, te5Var, this.j, this.t, null);
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        return this.a.getValue();
    }
}
