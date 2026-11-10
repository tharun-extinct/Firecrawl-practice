package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends zz4 implements bz1 {
    public final /* synthetic */ z c;
    public final /* synthetic */ mx3 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(z zVar, mx3 mx3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = zVar;
        this.i = mx3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        mx3 mx3Var = this.i;
        z zVar = this.c;
        switch (b) {
            case 0:
                return new p(zVar, mx3Var, mu0Var, (byte) 0);
            case 1:
                return new p(zVar, mx3Var, mu0Var, (byte) 1);
            case 2:
                return new p(zVar, mx3Var, mu0Var, (byte) 2);
            default:
                return new p(zVar, mx3Var, mu0Var, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((p) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        mx3 mx3Var = this.i;
        z zVar = this.c;
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
                ja3 ja3Var = zVar.k;
                if (ja3Var == null) {
                    return og5Var;
                }
                lx3 lx3Var = new lx3(mx3Var);
                this.w = true;
                return ja3Var.y(lx3Var, this) == px0Var ? px0Var : og5Var;
            case 1:
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
                ja3 ja3Var2 = zVar.k;
                if (ja3Var2 == null) {
                    return og5Var;
                }
                lx3 lx3Var2 = new lx3(mx3Var);
                this.w = true;
                return ja3Var2.y(lx3Var2, this) == px0Var ? px0Var : og5Var;
            case 2:
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ja3 ja3Var3 = zVar.k;
                if (ja3Var3 == null) {
                    return og5Var;
                }
                this.w = true;
                return ja3Var3.y(mx3Var, this) == px0Var ? px0Var : og5Var;
            default:
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ja3 ja3Var4 = zVar.k;
                if (ja3Var4 == null) {
                    return og5Var;
                }
                nx3 nx3Var = new nx3(mx3Var);
                this.w = true;
                return ja3Var4.y(nx3Var, this) == px0Var ? px0Var : og5Var;
        }
    }
}
