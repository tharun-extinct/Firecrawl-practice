package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k25 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ kx3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k25(kx3 kx3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = kx3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        kx3 kx3Var = this.w;
        switch (b) {
            case 0:
                return new k25(kx3Var, mu0Var, (byte) 0);
            case 1:
                return new k25(kx3Var, mu0Var, (byte) 1);
            case 2:
                return new k25(kx3Var, mu0Var, (byte) 2);
            case 3:
                return new k25(kx3Var, mu0Var, (byte) 3);
            case 4:
                return new k25(kx3Var, mu0Var, (byte) 4);
            case 5:
                return new k25(kx3Var, mu0Var, (byte) 5);
            case 6:
                return new k25(kx3Var, mu0Var, (byte) 6);
            default:
                return new k25(kx3Var, mu0Var, (byte) 7);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 1:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 2:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 3:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 4:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 5:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 6:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((k25) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        kx3 kx3Var = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                kx3Var.g();
                break;
            case 1:
                js2.o(obj);
                kx3Var.r();
                break;
            case 2:
                js2.o(obj);
                kx3Var.r();
                break;
            case 3:
                js2.o(obj);
                kx3Var.g();
                break;
            case 4:
                js2.o(obj);
                kx3Var.r();
                break;
            case 5:
                js2.o(obj);
                kx3Var.r();
                break;
            case 6:
                js2.o(obj);
                kx3Var.g();
                break;
            default:
                js2.o(obj);
                kx3Var.r();
                break;
        }
        return og5Var;
    }
}
