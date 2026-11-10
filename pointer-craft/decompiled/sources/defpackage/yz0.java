package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yz0 {
    public final /* synthetic */ cc3 g;
    public final /* synthetic */ p01 n;
    public final /* synthetic */ u54 r;
    public final /* synthetic */ q54 y;

    public yz0(cc3 cc3Var, q54 q54Var, u54 u54Var, p01 p01Var) {
        this.g = cc3Var;
        this.y = q54Var;
        this.r = u54Var;
        this.n = p01Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(io ioVar, ou0 ou0Var) throws Throwable {
        xz0 xz0Var;
        cc3 cc3Var;
        q54 q54Var;
        u54 u54Var;
        p01 p01Var;
        bz1 bz1Var;
        cc3 cc3Var2;
        cc3 cc3Var3;
        u54 u54Var2;
        Object obj;
        if (ou0Var instanceof xz0) {
            xz0Var = (xz0) ou0Var;
            int i = xz0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                xz0Var.p = i - Integer.MIN_VALUE;
            } else {
                xz0Var = new xz0(this, ou0Var);
            }
        } else {
            xz0Var = new xz0(this, ou0Var);
        }
        Object obj2 = xz0Var.b;
        int i2 = xz0Var.p;
        px0 px0Var = px0.j;
        try {
            if (i2 == 0) {
                js2.o(obj2);
                xz0Var.m = ioVar;
                cc3Var = this.g;
                xz0Var.q = cc3Var;
                q54Var = this.y;
                xz0Var.w = q54Var;
                u54Var = this.r;
                xz0Var.c = u54Var;
                p01Var = this.n;
                xz0Var.i = p01Var;
                xz0Var.p = 1;
                if (cc3Var.y(xz0Var) != px0Var) {
                }
                bz1Var = ioVar;
                return px0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = xz0Var.w;
                    u54Var2 = (u54) xz0Var.q;
                    cc3Var2 = (cc3) xz0Var.m;
                    try {
                        js2.o(obj2);
                        u54Var2.j = obj;
                        Object obj3 = u54Var2.j;
                        cc3Var2.x(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        cc3Var2.x(null);
                        throw th;
                    }
                }
                p01Var = (p01) xz0Var.w;
                u54Var2 = (u54) xz0Var.q;
                cc3Var3 = (cc3) xz0Var.m;
                try {
                    js2.o(obj2);
                    if (!yf2.p(obj2, u54Var2.j)) {
                        xz0Var.m = cc3Var3;
                        xz0Var.q = u54Var2;
                        xz0Var.w = obj2;
                        xz0Var.p = 3;
                        if (p01Var.a(obj2, false, xz0Var) != px0Var) {
                            obj = obj2;
                            cc3Var2 = cc3Var3;
                            u54Var2.j = obj;
                        }
                        bz1Var = ioVar;
                        return px0Var;
                    }
                    cc3Var2 = cc3Var3;
                    Object obj4 = u54Var2.j;
                    cc3Var2.x(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    cc3Var2 = cc3Var3;
                    cc3Var2.x(null);
                    throw th;
                }
            }
            p01Var = xz0Var.i;
            u54 u54Var3 = xz0Var.c;
            q54Var = (q54) xz0Var.w;
            cc3 cc3Var4 = (cc3) xz0Var.q;
            bz1 bz1Var2 = (bz1) xz0Var.m;
            js2.o(obj2);
            u54Var = u54Var3;
            bz1Var = bz1Var2;
            cc3Var = cc3Var4;
            bz1Var = ioVar;
            if (q54Var.j) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = u54Var.j;
            xz0Var.m = cc3Var;
            xz0Var.q = u54Var;
            xz0Var.w = p01Var;
            xz0Var.c = null;
            xz0Var.i = null;
            xz0Var.p = 2;
            Object objL = bz1Var.l(obj5, xz0Var);
            if (objL != px0Var) {
                cc3Var3 = cc3Var;
                obj2 = objL;
                u54Var2 = u54Var;
                if (!yf2.p(obj2, u54Var2.j)) {
                    xz0Var.m = cc3Var3;
                    xz0Var.q = u54Var2;
                    xz0Var.w = obj2;
                    xz0Var.p = 3;
                    if (p01Var.a(obj2, false, xz0Var) != px0Var) {
                        obj = obj2;
                        cc3Var2 = cc3Var3;
                        u54Var2.j = obj;
                    }
                } else {
                    cc3Var2 = cc3Var3;
                }
                Object obj6 = u54Var2.j;
                cc3Var2.x(null);
                return obj6;
            }
            bz1Var = ioVar;
            return px0Var;
        } catch (Throwable th3) {
            th = th3;
            cc3Var2 = cc3Var;
            cc3Var2.x(null);
            throw th;
        }
    }
}
