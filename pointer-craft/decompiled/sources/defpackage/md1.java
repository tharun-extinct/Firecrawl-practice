package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class md1 extends zz4 implements cz1 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md1(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                js2.o(obj);
                break;
            case 1:
                js2.o(obj);
                break;
            default:
                js2.o(obj);
                break;
        }
        return og5Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.q;
        og5 og5Var = og5.g;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((wi3) obj2).g;
                new md1(i, (mu0) obj3, (byte) 0).u(og5Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new md1(i, (mu0) obj3, (byte) 1).u(og5Var);
                break;
            default:
                long j2 = ((wi3) obj2).g;
                new md1(i, (mu0) obj3, (byte) 2).u(og5Var);
                break;
        }
        return og5Var;
    }
}
