package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v7 implements gr1 {
    public final /* synthetic */ ox0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 m;
    public final /* synthetic */ u54 t;

    public /* synthetic */ v7(u54 u54Var, ox0 ox0Var, bz1 bz1Var, byte b) {
        this.j = b;
        this.t = u54Var;
        this.a = ox0Var;
        this.m = bz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        t7 t7Var;
        u7 u7Var;
        Object obj2 = obj;
        byte b = this.j;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        u54 u54Var = this.t;
        switch (b) {
            case 0:
                if (mu0Var instanceof t7) {
                    t7Var = (t7) mu0Var;
                    int i = t7Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t7Var.c = i - Integer.MIN_VALUE;
                    } else {
                        t7Var = new t7(this, mu0Var);
                    }
                } else {
                    t7Var = new t7(this, mu0Var);
                }
                Object obj3 = t7Var.q;
                int i2 = t7Var.c;
                if (i2 == 0) {
                    js2.o(obj3);
                    dh2 dh2Var = (dh2) u54Var.j;
                    if (dh2Var != null) {
                        dh2Var.x(new f7());
                        t7Var.m = obj2;
                        t7Var.c = 1;
                        if (dh2Var.M(t7Var) == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = t7Var.m;
                    js2.o(obj3);
                }
                bz1 bz1Var = this.m;
                ox0 ox0Var = this.a;
                u54Var.j = m50.T(ox0Var, null, new s7(bz1Var, obj2, ox0Var, null, (byte) 0), 1);
                return og5Var;
            default:
                if (mu0Var instanceof u7) {
                    u7Var = (u7) mu0Var;
                    int i3 = u7Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u7Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        u7Var = new u7(this, mu0Var);
                    }
                } else {
                    u7Var = new u7(this, mu0Var);
                }
                Object obj4 = u7Var.q;
                int i4 = u7Var.c;
                if (i4 == 0) {
                    js2.o(obj4);
                    dh2 dh2Var2 = (dh2) u54Var.j;
                    if (dh2Var2 != null) {
                        dh2Var2.x(new g7());
                        u7Var.m = obj2;
                        u7Var.c = 1;
                        if (dh2Var2.M(u7Var) == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = u7Var.m;
                    js2.o(obj4);
                }
                bz1 bz1Var2 = this.m;
                ox0 ox0Var2 = this.a;
                u54Var.j = m50.T(ox0Var2, null, new s7(bz1Var2, obj2, ox0Var2, null, (byte) 1), 1);
                return og5Var;
        }
    }
}
