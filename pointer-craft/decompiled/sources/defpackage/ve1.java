package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ve1 extends zz4 implements dz1 {
    public /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q;
    public /* synthetic */ Enum s;
    public final /* synthetic */ oi u;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve1(Object obj, float f, oi oiVar, mu0 mu0Var, byte b) {
        super(4, mu0Var);
        this.q = b;
        this.p = obj;
        this.c = f;
        this.u = oiVar;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                oi oiVar = this.u;
                ve1 ve1Var = new ve1((we1) obj5, this.c, oiVar, (mu0) obj4, (byte) 0);
                ve1Var.i = (m8) obj;
                ve1Var.b = (l11) obj2;
                ve1Var.s = (xe1) obj3;
                return ve1Var.u(og5Var);
            default:
                float f = this.c;
                ve1 ve1Var2 = new ve1((xo4) obj5, f, (no1) this.u, (mu0) obj4, (byte) 1);
                ve1Var2.i = (l8) obj;
                ve1Var2.b = (i13) obj2;
                ve1Var2.s = (yo4) obj3;
                return ve1Var2.u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        Object obj2 = this.p;
        byte b2 = 1;
        switch (b) {
            case 0:
                q8 q8Var = ((we1) obj2).y;
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
                m8 m8Var = (m8) this.i;
                float fR = ((l11) this.b).r((xe1) this.s);
                if (Float.isNaN(fR)) {
                    return og5Var;
                }
                r54 r54Var = new r54();
                float fD = Float.isNaN(q8Var.a.d()) ? 0.0f : q8Var.a.d();
                r54Var.j = fD;
                k7 k7Var = new k7(m8Var, r54Var, (byte) 1);
                this.i = null;
                this.b = null;
                this.w = true;
                return kq2.t(fD, fR, this.c, this.u, k7Var, this) == px0Var ? px0Var : og5Var;
            default:
                xo4 xo4Var = (xo4) obj2;
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
                l8 l8Var = (l8) this.i;
                float fN = ((i13) this.b).n((yo4) this.s);
                if (Float.isNaN(fN)) {
                    return og5Var;
                }
                r54 r54Var2 = new r54();
                float fD2 = Float.isNaN(((pp3) xo4Var.n.q).d()) ? 0.0f : ((pp3) xo4Var.n.q).d();
                r54Var2.j = fD2;
                no1 no1Var = (no1) this.u;
                l7 l7Var = new l7(l8Var, r54Var2, b2);
                this.i = null;
                this.b = null;
                this.w = true;
                return kq2.t(fD2, fN, this.c, no1Var, l7Var, this) == px0Var ? px0Var : og5Var;
        }
    }
}
