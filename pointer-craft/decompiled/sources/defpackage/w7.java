package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w7 extends zz4 implements bz1 {
    public final /* synthetic */ bz1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my1 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(my1 my1Var, bz1 bz1Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = my1Var;
        this.b = bz1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                w7 w7Var = new w7(this.i, this.b, mu0Var, (byte) 0);
                w7Var.c = obj;
                return w7Var;
            default:
                w7 w7Var2 = new w7(this.i, this.b, mu0Var, (byte) 1);
                w7Var2.c = obj;
                return w7Var2;
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
        return ((w7) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        bz1 bz1Var = this.b;
        my1 my1Var = this.i;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
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
                ox0 ox0Var = (ox0) this.c;
                u54 u54Var = new u54();
                w00 w00VarG = v13.G(my1Var);
                v7 v7Var = new v7(u54Var, ox0Var, bz1Var, (byte) 0);
                this.w = true;
                return w00VarG.r(v7Var, this) == px0Var ? px0Var : og5Var;
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
                ox0 ox0Var2 = (ox0) this.c;
                u54 u54Var2 = new u54();
                w00 w00VarG2 = v13.G(my1Var);
                v7 v7Var2 = new v7(u54Var2, ox0Var2, bz1Var, b2);
                this.w = true;
                return w00VarG2.r(v7Var2, this) == px0Var ? px0Var : og5Var;
        }
    }
}
