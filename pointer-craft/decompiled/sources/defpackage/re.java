package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class re implements cz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ re(my1 my1Var, boolean z, byte b) {
        this.j = b;
        this.t = my1Var;
        this.a = z;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        final boolean z = this.a;
        switch (b) {
            case 0:
                j73 j73Var = (j73) obj;
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                h02Var.X(-196777734);
                final long j = ((x75) h02Var.a(y75.g)).g;
                boolean zV = h02Var.v(j);
                final my1 my1Var = this.t;
                boolean zX = zV | h02Var.x(my1Var) | h02Var.l(z);
                Object objK = h02Var.K();
                if (zX || objK == oo0.g) {
                    objK = new xy1() { // from class: se
                        @Override // defpackage.xy1
                        public final Object a(Object obj4) {
                            ja0 ja0Var = (ja0) obj4;
                            return ja0Var.g(new ke(my1Var, z, gh6.n(ja0Var, Float.intBitsToFloat((int) (ja0Var.j.n() >> 32)) / 2.0f), new m30(5, j)));
                        }
                    };
                    h02Var.i0(objK);
                }
                j73 j73VarC = a11.c(j73Var, (xy1) objK);
                h02Var.b(false);
                return j73VarC;
            default:
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                byte b2 = 1;
                if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c93.x(this.t, null, !z, null, null, null, null, null, ue5.m0(-1602110037, new ct(b2, z), h02Var2), h02Var2, 805306368, 506);
                } else {
                    h02Var2.Q();
                }
                return og5.g;
        }
    }
}
