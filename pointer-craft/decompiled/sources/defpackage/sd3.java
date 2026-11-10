package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sd3 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd3(Object obj, float f, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = f;
        this.b = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new sd3((lh4) obj3, this.c, (ob3) obj2, mu0Var, (byte) 0);
            default:
                return new sd3((gw4) obj3, this.c, (oi) obj2, mu0Var, (byte) 1);
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
        return ((sd3) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.b;
        float f = this.c;
        Object obj3 = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                ob3 ob3Var = (ob3) obj2;
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                if (((List) ob3Var.getValue()).size() <= 1) {
                    return og5Var;
                }
                mc3 mc3Var = (mc3) ((List) ob3Var.getValue()).get(((List) ob3Var.getValue()).size() - 2);
                this.w = true;
                return ((lh4) obj3).k(f, mc3Var, this) == px0Var ? px0Var : og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return qg.g((qg) ((gw4) obj3).r, new Float(f), (oi) obj2, null, this, 12) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
