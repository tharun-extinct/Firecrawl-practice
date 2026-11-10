package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class k22 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l22 i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ int[] s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k22(l22 l22Var, Context context, int[] iArr, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = l22Var;
        this.b = context;
        this.s = iArr;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                k22 k22Var = new k22(this.i, this.b, this.s, mu0Var, (byte) 0);
                k22Var.c = obj;
                return k22Var;
            default:
                k22 k22Var2 = new k22(this.i, this.b, this.s, mu0Var, (byte) 1);
                k22Var2.c = obj;
                return k22Var2;
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
        return ((k22) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        int[] iArr = this.s;
        Context context = this.b;
        l22 l22Var = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    ox0 ox0Var = (ox0) this.c;
                    this.w = true;
                    return l22Var.g(ox0Var, context, iArr, this) == px0Var ? px0Var : og5Var;
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
                    ox0 ox0Var2 = (ox0) this.c;
                    this.w = true;
                    return l22Var.n(ox0Var2, context, iArr, this) == px0Var ? px0Var : og5Var;
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
