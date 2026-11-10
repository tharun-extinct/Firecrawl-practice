package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class db1 implements gr1 {
    public final /* synthetic */ u54 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ gr1 t;

    public db1(eb1 eb1Var, u54 u54Var, gr1 gr1Var) {
        this.a = u54Var;
        this.t = gr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        cb1 cb1Var;
        yr1 yr1Var;
        byte b = this.j;
        u54 u54Var = this.a;
        Object obj2 = og5.g;
        gr1 gr1Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof cb1) {
                    cb1Var = (cb1) mu0Var;
                    int i = cb1Var.w;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cb1Var.w = i - Integer.MIN_VALUE;
                    } else {
                        cb1Var = new cb1(this, mu0Var);
                    }
                } else {
                    cb1Var = new cb1(this, mu0Var);
                }
                Object obj3 = cb1Var.m;
                int i2 = cb1Var.w;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj3);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj3);
                Object obj4 = u54Var.j;
                if (obj4 != a11.o && yf2.p(obj4, obj)) {
                    return obj2;
                }
                u54Var.j = obj;
                cb1Var.w = 1;
                return gr1Var.c(obj, cb1Var) == px0Var ? px0Var : obj2;
            default:
                if (mu0Var instanceof yr1) {
                    yr1Var = (yr1) mu0Var;
                    int i3 = yr1Var.w;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yr1Var.w = i3 - Integer.MIN_VALUE;
                    } else {
                        yr1Var = new yr1(this, mu0Var);
                    }
                } else {
                    yr1Var = new yr1(this, mu0Var);
                }
                Object obj5 = yr1Var.m;
                int i4 = yr1Var.w;
                try {
                    if (i4 == 0) {
                        js2.o(obj5);
                        yr1Var.w = 1;
                        if (gr1Var.c(obj, yr1Var) == px0Var) {
                            obj2 = px0Var;
                        }
                    } else {
                        if (i4 != 1) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj5);
                    }
                    return obj2;
                } catch (Throwable th) {
                    u54Var.j = th;
                    throw th;
                }
        }
    }

    public db1(gr1 gr1Var, u54 u54Var) {
        this.t = gr1Var;
        this.a = u54Var;
    }
}
