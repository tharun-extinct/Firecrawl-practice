package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qd2 extends i73 implements hd5 {
    public qo5 f;
    public qo5 o;

    public qd2() {
        op1 op1Var = a11.D;
        this.o = op1Var;
        this.f = op1Var;
    }

    @Override // defpackage.i73
    public void I0() {
        sp2.k(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new pd2(this, (byte) 1));
        R0();
    }

    @Override // defpackage.i73
    public void J0() {
        this.f = this.o;
        sp2.e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new pd2(this, (byte) 0));
    }

    @Override // defpackage.i73
    public final void K0() {
        this.o = a11.D;
    }

    public abstract qo5 Q0(qo5 qo5Var);

    public void R0() {
        this.f = Q0(this.o);
        sp2.e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new pd2(this, (byte) 0));
    }

    @Override // defpackage.hd5
    public final Object s() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
