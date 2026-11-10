package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes2.dex */
public final class ot3 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long i;
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(long j, mu0 mu0Var, rt3 rt3Var, CharSequence charSequence) {
        super(2, mu0Var);
        this.b = rt3Var;
        this.s = charSequence;
        this.i = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ot3 ot3Var = new ot3(this.i, mu0Var, (rt3) obj3, (CharSequence) obj2);
                ot3Var.c = obj;
                return ot3Var;
            default:
                ot3 ot3Var2 = new ot3((ng4) obj3, this.i, (r54) obj2, mu0Var);
                ot3Var2.c = obj;
                return ot3Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((ot3) b((mu0) obj2, al0.v(obj))).u(og5Var);
            default:
                return ((ot3) b((mu0) obj2, (lg4) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.s;
        px0 px0Var = px0.j;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    TextClassifier textClassifierV = al0.v(this.c);
                    this.w = true;
                    return ((rt3) obj3).g((CharSequence) obj2, this.i, textClassifierV, this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ng4 ng4Var = (ng4) obj3;
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
                lg4 lg4Var = (lg4) this.c;
                float fJ = ng4Var.j(this.i);
                r2 r2Var = new r2(obj2, (Object) ng4Var, (Object) lg4Var, (byte) 23);
                this.w = true;
                return kq2.m(0.0f, fJ, null, r2Var, this, 12) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(ng4 ng4Var, long j, r54 r54Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = ng4Var;
        this.i = j;
        this.s = r54Var;
    }
}
