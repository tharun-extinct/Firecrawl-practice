package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends zz4 implements bz1 {
    public final /* synthetic */ gr1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ id0 i;
    public final /* synthetic */ byte q = 0;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(id0 id0Var, gr1 gr1Var, Object obj, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = id0Var;
        this.b = gr1Var;
        this.c = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        gr1 gr1Var = this.b;
        id0 id0Var = this.i;
        switch (b) {
            case 0:
                return new fd0(id0Var, gr1Var, this.c, mu0Var);
            default:
                fd0 fd0Var = new fd0(id0Var, gr1Var, mu0Var);
                fd0Var.c = obj;
                return fd0Var;
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
        return ((fd0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        gr1 gr1Var = this.b;
        id0 id0Var = this.i;
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
                cz1 cz1Var = id0Var.q;
                Object obj2 = this.c;
                this.w = true;
                return cz1Var.x(gr1Var, obj2, this) == px0Var ? px0Var : og5Var;
            default:
                ox0 ox0Var = (ox0) this.c;
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
                u54 u54Var = new u54();
                er1 er1Var = id0Var.m;
                hd0 hd0Var = new hd0(u54Var, ox0Var, id0Var, gr1Var);
                this.c = null;
                this.w = true;
                return er1Var.r(hd0Var, this) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(id0 id0Var, gr1 gr1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = id0Var;
        this.b = gr1Var;
    }
}
