package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr0 implements gr1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ cr0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        br0 br0Var;
        gs1 gs1Var;
        byte b = this.j;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                if (mu0Var instanceof br0) {
                    br0Var = (br0) mu0Var;
                    int i = br0Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        br0Var.q = i - Integer.MIN_VALUE;
                    } else {
                        br0Var = new br0(this, mu0Var);
                    }
                } else {
                    br0Var = new br0(this, mu0Var);
                }
                Object obj4 = br0Var.m;
                int i2 = br0Var.q;
                if (i2 == 0) {
                    js2.o(obj4);
                    String strG = vp2.g((db3) obj, ((qr0) obj2).y);
                    br0Var.q = 1;
                    if (((gr1) obj3).c(strG, br0Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj4);
                }
                return og5Var;
            case 1:
                if (mu0Var instanceof gs1) {
                    gs1Var = (gs1) mu0Var;
                    int i3 = gs1Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gs1Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        gs1Var = new gs1(this, mu0Var);
                    }
                } else {
                    gs1Var = new gs1(this, mu0Var);
                }
                Object objL = gs1Var.m;
                int i4 = gs1Var.q;
                if (i4 == 0) {
                    js2.o(objL);
                    gs1Var.c = obj;
                    gs1Var.q = 1;
                    objL = ((bz1) obj3).l(obj, gs1Var);
                    if (objL == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i4 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = gs1Var.c;
                    js2.o(objL);
                }
                if (!((Boolean) objL).booleanValue()) {
                    return og5Var;
                }
                ((u54) obj2).j = obj;
                throw new r(this);
            default:
                ue2 ue2Var = (ue2) obj;
                ie ieVar = (ie) obj3;
                if (!(ue2Var instanceof ox3)) {
                    ox0 ox0Var = (ox0) obj2;
                    gw4 gw4Var = ieVar.A;
                    if (gw4Var == null) {
                        gw4Var = new gw4(ieVar.f, ieVar.e);
                        c93.A(ieVar);
                        ieVar.A = gw4Var;
                    }
                    gw4Var.y(ue2Var, ox0Var);
                } else if (ieVar.D) {
                    ieVar.Q0((ox3) ue2Var);
                } else {
                    ieVar.E.g(ue2Var);
                }
                return og5Var;
        }
    }
}
