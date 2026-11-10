package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class t12 extends zz4 implements bz1 {
    public final /* synthetic */ tp b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Context i;
    public final /* synthetic */ Bundle p;
    public boolean q;
    public final /* synthetic */ w12 s;
    public final /* synthetic */ dz1 u;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(Context context, tp tpVar, w12 w12Var, Bundle bundle, dz1 dz1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = context;
        this.b = tpVar;
        this.s = w12Var;
        this.p = bundle;
        this.u = dz1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        t12 t12Var = new t12(this.i, this.b, this.s, this.p, this.u, mu0Var);
        t12Var.c = obj;
        return t12Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((t12) b((mu0) obj2, (yk4) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[RETURN] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        yk4 yk4Var;
        boolean zBooleanValue;
        yk4 yk4Var2;
        boolean z;
        Object objI;
        byte b = this.w;
        tp tpVar = this.b;
        Context context = this.i;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            yk4 yk4Var3 = (yk4) this.c;
            String strU = ra.u(tpVar.g());
            this.c = yk4Var3;
            this.w = (byte) 1;
            Object objG = yk4Var3.g(context, strU, this);
            if (objG != px0Var) {
                yk4Var = yk4Var3;
                obj = objG;
            }
            return px0Var;
        }
        if (b == 1) {
            yk4Var = (yk4) this.c;
            js2.o(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    js2.o(obj);
                    return obj;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.q;
            yk4Var2 = (yk4) this.c;
            js2.o(obj);
        }
        zBooleanValue = z;
        yk4Var = yk4Var2;
        eq eqVar = (eq) yk4Var.g.get(ra.u(tpVar.g()));
        eqVar.getClass();
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.c = null;
        this.w = (byte) 3;
        objI = this.u.i(yk4Var, eqVar, boolValueOf, this);
        if (objI == px0Var) {
            return px0Var;
        }
        return objI;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            eq eqVar2 = (eq) yk4Var.g.get(ra.u(tpVar.g()));
            eqVar2.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            this.c = null;
            this.w = (byte) 3;
            objI = this.u.i(yk4Var, eqVar2, boolValueOf2, this);
            if (objI == px0Var) {
                return objI;
            }
        } else {
            eq eqVar3 = new eq(this.s, tpVar, this.p);
            this.c = yk4Var;
            this.q = zBooleanValue;
            this.w = (byte) 2;
            if (yk4Var.r(context, eqVar3, this) != px0Var) {
                yk4Var2 = yk4Var;
                z = zBooleanValue;
                zBooleanValue = z;
                yk4Var = yk4Var2;
                eq eqVar4 = (eq) yk4Var.g.get(ra.u(tpVar.g()));
                eqVar4.getClass();
                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                this.c = null;
                this.w = (byte) 3;
                objI = this.u.i(yk4Var, eqVar4, boolValueOf3, this);
                if (objI == px0Var) {
                    return objI;
                }
            }
        }
        return px0Var;
    }
}
