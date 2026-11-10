package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class u12 extends zz4 implements dz1 {
    public /* synthetic */ eq c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(Object obj, mu0 mu0Var, byte b) {
        super(4, mu0Var);
        this.q = b;
        this.i = obj;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj5 = this.i;
        eq eqVar = (eq) obj2;
        ((Boolean) obj3).getClass();
        mu0 mu0Var = (mu0) obj4;
        switch (b) {
            case 0:
                u12 u12Var = new u12((Bundle) obj5, mu0Var, (byte) 0);
                u12Var.c = eqVar;
                return u12Var.u(og5Var);
            default:
                u12 u12Var2 = new u12((String) obj5, mu0Var, (byte) 1);
                u12Var2.c = eqVar;
                return u12Var2.u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    eq eqVar = this.c;
                    this.w = true;
                    eqVar.getClass();
                    Object objX = eqVar.x(new xp((Bundle) obj2), this);
                    if (objX != px0Var) {
                        objX = og5Var;
                    }
                    if (objX == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    eq eqVar2 = this.c;
                    this.w = true;
                    eqVar2.getClass();
                    Object objX2 = eqVar2.x(new wp((String) obj2), this);
                    if (objX2 != px0Var) {
                        objX2 = og5Var;
                    }
                    if (objX2 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
