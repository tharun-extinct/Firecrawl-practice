package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class j22 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l22 i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ int s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j22(l22 l22Var, Context context, int i, Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = l22Var;
        this.b = context;
        this.s = i;
        this.p = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                j22 j22Var = new j22(this.i, this.b, this.s, (Bundle) obj2, mu0Var, (byte) 0);
                j22Var.c = obj;
                return j22Var;
            default:
                j22 j22Var2 = new j22(this.i, this.b, this.s, (String) obj2, mu0Var, (byte) 1);
                j22Var2.c = obj;
                return j22Var2;
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
        return ((j22) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.p;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    return this.i.r((ox0) this.c, this.b, this.s, (Bundle) obj2, this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return this.i.y((ox0) this.c, this.b, this.s, (String) obj2, this) == px0Var ? px0Var : og5Var;
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
