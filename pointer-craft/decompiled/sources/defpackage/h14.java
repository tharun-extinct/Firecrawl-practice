package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h14 implements ni5 {
    public final /* synthetic */ byte g;
    public un1 n;
    public final ki3 v;
    public boolean y = false;
    public boolean r = false;

    public /* synthetic */ h14(ki3 ki3Var, byte b) {
        this.g = b;
        this.v = ki3Var;
    }

    @Override // defpackage.ni5
    public final ni5 r(boolean z) {
        byte b = this.g;
        ki3 ki3Var = this.v;
        switch (b) {
            case 0:
                if (this.y) {
                    throw new ej1("Cannot encode a second value in the ValueEncoderContext");
                }
                this.y = true;
                ((f14) ki3Var).y(this.n, z ? 1 : 0, this.r);
                return this;
            default:
                if (this.y) {
                    throw new ej1("Cannot encode a second value in the ValueEncoderContext");
                }
                this.y = true;
                ((ex5) ki3Var).r(this.n, z ? 1 : 0, this.r);
                return this;
        }
    }

    @Override // defpackage.ni5
    public final ni5 y(String str) {
        byte b = this.g;
        ki3 ki3Var = this.v;
        switch (b) {
            case 0:
                if (this.y) {
                    throw new ej1("Cannot encode a second value in the ValueEncoderContext");
                }
                this.y = true;
                ((f14) ki3Var).v(this.n, str, this.r);
                return this;
            default:
                if (this.y) {
                    throw new ej1("Cannot encode a second value in the ValueEncoderContext");
                }
                this.y = true;
                ((ex5) ki3Var).y(this.n, str, this.r);
                return this;
        }
    }
}
