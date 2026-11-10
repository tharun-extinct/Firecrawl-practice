package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v55 extends zz4 implements xy1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v55(Object obj, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.w = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        mu0 mu0Var = (mu0) obj;
        switch (b) {
            case 0:
                new v55((b65) obj2, mu0Var, (byte) 0).u(og5Var);
                break;
            case 1:
                new v55((b65) obj2, mu0Var, (byte) 1).u(og5Var);
                break;
            case 2:
                new v55((b65) obj2, mu0Var, (byte) 2).u(og5Var);
                break;
            case 3:
                new v55((b65) obj2, mu0Var, (byte) 3).u(og5Var);
                break;
            default:
                new v55((qg) obj2, mu0Var, (byte) 4).u(og5Var);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                ((b65) obj2).A = false;
                break;
            case 1:
                js2.o(obj);
                ((b65) obj2).r();
                break;
            case 2:
                js2.o(obj);
                b65 b65Var = (b65) obj2;
                b65Var.g(b65Var.A);
                break;
            case 3:
                js2.o(obj);
                ((b65) obj2).i();
                break;
            default:
                js2.o(obj);
                ((qg) obj2).r();
                break;
        }
        return og5Var;
    }
}
