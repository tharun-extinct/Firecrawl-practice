package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ey3 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q = 1;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object u;
    public boolean w;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(b30 b30Var, yl0 yl0Var, String str, UUID uuid, String str2, my1 my1Var, ob3 ob3Var, ob3 ob3Var2, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = b30Var;
        this.i = yl0Var;
        this.b = str;
        this.p = uuid;
        this.s = str2;
        this.u = my1Var;
        this.z = ob3Var;
        this.h = ob3Var2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.h;
        Object obj3 = this.z;
        Object obj4 = this.u;
        Object obj5 = this.p;
        Object obj6 = this.s;
        Object obj7 = this.b;
        Object obj8 = this.i;
        switch (b) {
            case 0:
                return new ey3((b30) this.c, (yl0) obj8, (String) obj7, (UUID) obj5, (String) obj6, (my1) obj4, (ob3) obj3, (ob3) obj2, mu0Var);
            default:
                ey3 ey3Var = new ey3((a44) obj8, (eq) obj7, (ew4) obj6, (Context) obj5, (u64) obj4, (s95) obj3, (r95) obj2, mu0Var);
                ey3Var.c = obj;
                return ey3Var;
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
                break;
        }
        return ((ey3) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        Object objS;
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.h;
        Object obj3 = this.z;
        Object obj4 = this.u;
        Object obj5 = this.p;
        Object obj6 = this.s;
        Object obj7 = this.b;
        Object obj8 = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    b30 b30Var = (b30) this.c;
                    this.w = true;
                    objS = b30Var.r.g.s((yl0) obj8, (String) obj7, (UUID) obj5, (String) obj6, "dialog_v1", new String[0], this);
                    if (objS == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    objS = obj;
                }
                boolean zBooleanValue = ((Boolean) objS).booleanValue();
                o05 o05Var = gy3.g;
                ((ob3) obj3).setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    ((my1) obj4).g();
                    return og5Var;
                }
                ((ob3) obj2).setValue(Boolean.TRUE);
                return og5Var;
            default:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ox0 ox0Var = (ox0) this.c;
                t54 t54Var = new t54();
                a44 a44Var = (a44) obj8;
                t54Var.j = a44Var.g;
                ew4 ew4Var = a44Var.f;
                hl4 hl4Var = new hl4((eq) obj7, a44Var, t54Var, (ew4) obj6, (Context) obj5, (u64) obj4, (s95) obj3, (r95) obj2, ox0Var, null);
                this.w = true;
                return k33.A(ew4Var, hl4Var, this) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(a44 a44Var, eq eqVar, ew4 ew4Var, Context context, u64 u64Var, s95 s95Var, r95 r95Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = a44Var;
        this.b = eqVar;
        this.s = ew4Var;
        this.p = context;
        this.u = u64Var;
        this.z = s95Var;
        this.h = r95Var;
    }
}
