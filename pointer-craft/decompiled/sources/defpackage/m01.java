package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m01 extends zz4 implements xy1 {
    public final /* synthetic */ bz1 b;
    public final /* synthetic */ p01 c;
    public final /* synthetic */ fx0 i;
    public Object q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(p01 p01Var, fx0 fx0Var, bz1 bz1Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.c = p01Var;
        this.i = fx0Var;
        this.b = bz1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        fx0 fx0Var = this.i;
        bz1 bz1Var = this.b;
        return new m01(this.c, fx0Var, bz1Var, (mu0) obj).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        rz0 rz0Var;
        Object obj2;
        int iHashCode;
        byte b = this.w;
        mu0 mu0Var = null;
        p01 p01Var = this.c;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            this.w = (byte) 1;
            obj = p01Var.t(true, this);
            if (obj != px0Var) {
            }
            return px0Var;
        }
        if (b == 1) {
            js2.o(obj);
        } else {
            if (b != 2) {
                if (b != 3) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = this.q;
                js2.o(obj);
                return obj3;
            }
            rz0Var = (rz0) this.q;
            js2.o(obj);
        }
        obj2 = rz0Var.y;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == rz0Var.r) {
            l0.z("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!yf2.p(rz0Var.y, obj)) {
            this.q = obj;
            this.w = (byte) 3;
            if (p01Var.a(obj, true, this) == px0Var) {
                return px0Var;
            }
        }
        return obj;
        rz0Var = (rz0) obj;
        op opVar = new op(this.b, rz0Var, mu0Var, (byte) 6);
        this.q = rz0Var;
        this.w = (byte) 2;
        obj = m50.f0(this.i, opVar, this);
        if (obj != px0Var) {
            obj2 = rz0Var.y;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == rz0Var.r) {
                l0.z("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!yf2.p(rz0Var.y, obj)) {
                this.q = obj;
                this.w = (byte) 3;
                if (p01Var.a(obj, true, this) == px0Var) {
                }
            }
            return obj;
        }
        return px0Var;
    }
}
