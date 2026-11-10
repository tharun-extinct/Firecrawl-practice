package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends zz4 implements xy1 {
    public Iterator b;
    public Object c;
    public Object i;
    public byte p;
    public Object q;
    public int s;
    public final /* synthetic */ p01 u;
    public Serializable w;
    public final /* synthetic */ kb5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(p01 p01Var, kb5 kb5Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.u = p01Var;
        this.z = kb5Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        return new zz0(this.u, this.z, (mu0) obj).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009f->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        cc3 ec3Var;
        q54 q54Var;
        u54 u54Var;
        u54 u54Var2;
        cc3 cc3Var;
        Iterator it;
        cc3 cc3Var2;
        q54 q54Var2;
        u54 u54Var3;
        yz0 yz0Var;
        u54 u54Var4;
        q54 q54Var3;
        bz1 bz1Var;
        Object obj2;
        int iHashCode;
        Integer numG;
        Object obj3;
        byte b = this.p;
        kb5 kb5Var = this.z;
        p01 p01Var = this.u;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            ec3Var = new ec3();
            q54Var = new q54();
            u54Var = new u54();
            this.q = ec3Var;
            this.w = q54Var;
            this.c = u54Var;
            this.i = u54Var;
            this.p = (byte) 1;
            obj = p01Var.t(true, this);
            if (obj != px0Var) {
                u54Var2 = u54Var;
            }
            return px0Var;
        }
        if (b == 1) {
            u54Var = (u54) this.i;
            u54Var2 = (u54) this.c;
            q54Var = (q54) this.w;
            ec3Var = (cc3) this.q;
            js2.o(obj);
        } else {
            if (b == 2) {
                it = this.b;
                yz0Var = (yz0) this.i;
                u54Var3 = (u54) this.c;
                q54Var2 = (q54) this.w;
                cc3Var2 = (cc3) this.q;
                js2.o(obj);
                while (it.hasNext()) {
                    bz1Var = (bz1) it.next();
                    this.q = cc3Var2;
                    this.w = q54Var2;
                    this.c = u54Var3;
                    this.i = yz0Var;
                    this.b = it;
                    this.p = (byte) 2;
                    if (bz1Var.l(yz0Var, this) == px0Var) {
                        return px0Var;
                    }
                }
                u54Var2 = u54Var3;
                q54Var = q54Var2;
                cc3Var = cc3Var2;
                kb5Var.a = null;
                this.q = q54Var;
                this.w = u54Var2;
                this.c = cc3Var;
                this.i = null;
                this.b = null;
                this.p = (byte) 3;
                if (cc3Var.y(this) != px0Var) {
                    u54Var4 = u54Var2;
                    q54Var3 = q54Var;
                    q54Var3.j = true;
                    cc3Var.x(null);
                    obj2 = u54Var4.j;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    xp4 xp4VarN = p01Var.n();
                    this.q = obj2;
                    this.w = null;
                    this.c = null;
                    this.s = iHashCode;
                    this.p = (byte) 4;
                    numG = xp4VarN.g();
                    if (numG != px0Var) {
                        obj = numG;
                        obj3 = obj2;
                    }
                }
                return px0Var;
            }
            if (b == 3) {
                cc3Var = (cc3) this.c;
                u54Var4 = (u54) this.w;
                q54Var3 = (q54) this.q;
                js2.o(obj);
                try {
                    q54Var3.j = true;
                    cc3Var.x(null);
                    obj2 = u54Var4.j;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    xp4 xp4VarN2 = p01Var.n();
                    this.q = obj2;
                    this.w = null;
                    this.c = null;
                    this.s = iHashCode;
                    this.p = (byte) 4;
                    numG = xp4VarN2.g();
                    if (numG != px0Var) {
                        obj = numG;
                        obj3 = obj2;
                    }
                    return px0Var;
                } catch (Throwable th) {
                    cc3Var.x(null);
                    throw th;
                }
            }
            if (b != 4) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.s;
            obj3 = this.q;
            js2.o(obj);
        }
        return new rz0(iHashCode, ((Number) obj).intValue(), obj3);
        u54Var.j = ((rz0) obj).y;
        yz0 yz0Var2 = new yz0(ec3Var, q54Var, u54Var2, p01Var);
        List list = (List) kb5Var.a;
        if (list != null) {
            it = list.iterator();
            cc3Var2 = ec3Var;
            q54Var2 = q54Var;
            u54Var3 = u54Var2;
            yz0Var = yz0Var2;
            while (it.hasNext()) {
                bz1Var = (bz1) it.next();
                this.q = cc3Var2;
                this.w = q54Var2;
                this.c = u54Var3;
                this.i = yz0Var;
                this.b = it;
                this.p = (byte) 2;
                if (bz1Var.l(yz0Var, this) == px0Var) {
                    return px0Var;
                }
            }
            u54Var2 = u54Var3;
            q54Var = q54Var2;
            cc3Var = cc3Var2;
        } else {
            cc3Var = ec3Var;
        }
        kb5Var.a = null;
        this.q = q54Var;
        this.w = u54Var2;
        this.c = cc3Var;
        this.i = null;
        this.b = null;
        this.p = (byte) 3;
        if (cc3Var.y(this) != px0Var) {
            u54Var4 = u54Var2;
            q54Var3 = q54Var;
            q54Var3.j = true;
            cc3Var.x(null);
            obj2 = u54Var4.j;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            xp4 xp4VarN3 = p01Var.n();
            this.q = obj2;
            this.w = null;
            this.c = null;
            this.s = iHashCode;
            this.p = (byte) 4;
            numG = xp4VarN3.g();
            if (numG != px0Var) {
                obj = numG;
                obj3 = obj2;
                return new rz0(iHashCode, ((Number) obj).intValue(), obj3);
            }
        }
        return px0Var;
    }
}
