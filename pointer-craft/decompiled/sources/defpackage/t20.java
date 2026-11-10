package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t20 extends zz4 implements cz1 {
    public /* synthetic */ boolean c;
    public final /* synthetic */ byte q;
    public /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = true;
        switch (this.q) {
            case 0:
                boolean z2 = this.w;
                boolean z3 = this.c;
                js2.o(obj);
                if (!z2 && !z3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                boolean z4 = this.w;
                boolean z5 = this.c;
                js2.o(obj);
                if (!z4 && !z5) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.q;
        og5 og5Var = og5.g;
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                t20 t20Var = new t20(i, (mu0) obj3, (byte) 0);
                t20Var.w = zBooleanValue;
                t20Var.c = zBooleanValue2;
                return t20Var.u(og5Var);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                t20 t20Var2 = new t20(i, (mu0) obj3, (byte) 1);
                t20Var2.w = zBooleanValue3;
                t20Var2.c = zBooleanValue4;
                return t20Var2.u(og5Var);
        }
    }
}
