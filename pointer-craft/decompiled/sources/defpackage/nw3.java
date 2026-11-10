package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nw3 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ bz1 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw3(bz1 bz1Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = bz1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        bz1 bz1Var = this.i;
        switch (b) {
            case 0:
                nw3 nw3Var = new nw3(bz1Var, mu0Var, (byte) 0);
                nw3Var.c = obj;
                return nw3Var;
            case 1:
                nw3 nw3Var2 = new nw3(bz1Var, mu0Var, (byte) 1);
                nw3Var2.c = obj;
                return nw3Var2;
            default:
                nw3 nw3Var3 = new nw3(bz1Var, mu0Var, (byte) 2);
                nw3Var3.c = obj;
                return nw3Var3;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((nw3) b((mu0) obj2, (db3) obj)).u(og5Var);
            case 1:
                return ((nw3) b((mu0) obj2, (db3) obj)).u(og5Var);
            default:
                return ((nw3) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        bz1 bz1Var = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    db3 db3Var = (db3) this.c;
                    this.w = true;
                    obj = bz1Var.l(db3Var, this);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                db3 db3Var2 = (db3) obj;
                db3Var2.getClass();
                ((AtomicBoolean) db3Var2.y.t).set(true);
                return db3Var2;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    db3 db3VarL = ((db3) this.c).l();
                    this.c = db3VarL;
                    this.w = true;
                    return bz1Var.l(db3VarL, this) == px0Var ? px0Var : db3VarL;
                }
                if (!z2) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                db3 db3Var3 = (db3) this.c;
                js2.o(obj);
                return db3Var3;
            default:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    ox0 ox0Var = (ox0) this.c;
                    this.w = true;
                    if (bz1Var.l(ox0Var, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
        }
    }
}
