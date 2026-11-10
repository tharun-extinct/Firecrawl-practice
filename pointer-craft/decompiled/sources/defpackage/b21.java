package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b21 implements p33 {
    public final Enum a;
    public final /* synthetic */ byte j;
    public final Enum m;
    public final p33 t;

    public /* synthetic */ b21(p33 p33Var, Enum r2, Enum r3, byte b) {
        this.j = b;
        this.t = p33Var;
        this.a = r2;
        this.m = r3;
    }

    @Override // defpackage.p33
    public final int P(int i) {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.P(i);
    }

    @Override // defpackage.p33
    public final int Y(int i) {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.Y(i);
    }

    @Override // defpackage.p33
    public final int Z(int i) {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.Z(i);
    }

    @Override // defpackage.p33
    public final Object a() {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.a();
    }

    @Override // defpackage.p33
    public final us3 v(long j) {
        byte b = this.j;
        Enum r1 = this.a;
        Enum r2 = this.m;
        p33 p33Var = this.t;
        switch (b) {
            case 0:
                wf2 wf2Var = (wf2) r2;
                sf2 sf2Var = (sf2) r1;
                sf2 sf2Var2 = sf2.t;
                if (wf2Var == wf2.j) {
                    return new pp1(sf2Var == sf2Var2 ? p33Var.Y(ws0.j(j)) : p33Var.P(ws0.j(j)), ws0.n(j) ? ws0.j(j) : 32767, (byte) 0);
                }
                return new pp1(ws0.v(j) ? ws0.t(j) : 32767, sf2Var == sf2Var2 ? p33Var.x(ws0.t(j)) : p33Var.Z(ws0.t(j)), (byte) 0);
            default:
                kh3 kh3Var = (kh3) r2;
                jh3 jh3Var = (jh3) r1;
                jh3 jh3Var2 = jh3.t;
                if (kh3Var == kh3.j) {
                    return new pp1(jh3Var == jh3Var2 ? p33Var.Y(ws0.j(j)) : p33Var.P(ws0.j(j)), ws0.n(j) ? ws0.j(j) : 32767, (byte) 1);
                }
                return new pp1(ws0.v(j) ? ws0.t(j) : 32767, jh3Var == jh3Var2 ? p33Var.x(ws0.t(j)) : p33Var.Z(ws0.t(j)), (byte) 1);
        }
    }

    @Override // defpackage.p33
    public final int x(int i) {
        switch (this.j) {
            case 0:
                break;
        }
        return this.t.x(i);
    }
}
