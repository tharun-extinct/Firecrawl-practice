package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ui2 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ vi2 c;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui2(vi2 vi2Var, int i, int i2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = vi2Var;
        this.i = i;
        this.b = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new ui2(this.c, this.i, this.b, mu0Var, (byte) 0);
            default:
                return new ui2(this.c, this.i, this.b, mu0Var, (byte) 1);
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
        return ((ui2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        int i = this.b;
        int i2 = this.i;
        vi2 vi2Var = this.c;
        px0 px0Var = px0.j;
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
                k40 k40VarV = vi2Var.V();
                if (k40VarV == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarV.l(i2, i, this) == px0Var ? px0Var : og5Var;
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
                k40 k40VarV2 = vi2Var.V();
                if (k40VarV2 == null) {
                    return og5Var;
                }
                this.w = true;
                return k40VarV2.j(i2, i, this) == px0Var ? px0Var : og5Var;
        }
    }
}
