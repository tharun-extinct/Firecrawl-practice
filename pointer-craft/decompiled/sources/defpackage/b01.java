package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b01 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b01(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                b01 b01Var = new b01(2, mu0Var, (byte) 0);
                b01Var.w = obj;
                return b01Var;
            case 1:
                b01 b01Var2 = new b01(2, mu0Var, (byte) 1);
                b01Var2.w = obj;
                return b01Var2;
            case 2:
                b01 b01Var3 = new b01(2, mu0Var, (byte) 2);
                b01Var3.w = obj;
                return b01Var3;
            default:
                b01 b01Var4 = new b01(2, mu0Var, (byte) 3);
                b01Var4.w = obj;
                return b01Var4;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((b01) b((mu0) obj2, (zv4) obj)).u(og5Var);
            case 1:
                return ((b01) b((mu0) obj2, (c64) obj)).u(og5Var);
            case 2:
                return ((b01) b((mu0) obj2, (x34) obj)).u(og5Var);
            default:
                return ((b01) b((mu0) obj2, (qo4) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        switch (this.q) {
            case 0:
                js2.o(obj);
                return Boolean.valueOf(!(((zv4) this.w) instanceof lo1));
            case 1:
                c64 c64Var = (c64) this.w;
                js2.o(obj);
                return Boolean.valueOf(c64Var.g);
            case 2:
                js2.o(obj);
                return Boolean.valueOf(((x34) this.w) == x34.j);
            default:
                qo4 qo4Var = (qo4) this.w;
                js2.o(obj);
                return Boolean.valueOf(qo4Var != qo4.j);
        }
    }
}
