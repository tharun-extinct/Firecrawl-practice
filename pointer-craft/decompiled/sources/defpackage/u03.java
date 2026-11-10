package defpackage;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u03 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u03(boolean z, Context context, jd3 jd3Var, gp gpVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 0;
        this.w = z;
        this.c = context;
        this.i = jd3Var;
        this.b = gpVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new u03(this.w, (Context) this.c, (jd3) obj3, (gp) obj2, mu0Var);
            case 1:
                return new u03((u54) obj3, (fv3) obj2, mu0Var, (byte) 1);
            case 2:
                return new u03(this.c, obj3, obj2, mu0Var, (byte) 2);
            case 3:
                u03 u03Var = new u03((s3) obj3, (ng4) obj2, mu0Var, (byte) 3);
                u03Var.c = obj;
                return u03Var;
            case 4:
                u03 u03Var2 = new u03((ng4) obj3, (bz1) obj2, mu0Var, (byte) 4);
                u03Var2.c = obj;
                return u03Var2;
            case 5:
                u03 u03Var3 = new u03((bw4) obj3, (qg) obj2, mu0Var, (byte) 5);
                u03Var3.c = obj;
                return u03Var3;
            case 6:
                u03 u03Var4 = new u03((SessionWorker) obj3, (eq) obj2, mu0Var, (byte) 6);
                u03Var4.c = obj;
                return u03Var4;
            case 7:
                return new u03(this.c, obj3, this.b, mu0Var, (byte) 7);
            case 8:
                return new u03(this.c, obj3, obj2, mu0Var, (byte) 8);
            default:
                u03 u03Var5 = new u03((bz1) obj3, (up) obj2, mu0Var, (byte) 9);
                u03Var5.c = obj;
                return u03Var5;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((u03) b((mu0) obj2, (lg4) obj)).u(og5Var);
            case 4:
                return ((u03) b((mu0) obj2, (pf4) obj)).u(og5Var);
            case 5:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((u03) b((mu0) obj2, (s95) obj)).u(og5Var);
            case 7:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((u03) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        u54 u54Var;
        Object objG;
        AtomicReference atomicReference;
        Object objB;
        byte b = this.q;
        byte b2 = 0;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        Object obj2 = this.b;
        Object obj3 = this.i;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                js2.o(obj);
                if (this.w) {
                    kq2.W((Context) this.c);
                }
                jd3.v((jd3) obj3, "keyboard_layout");
                gp gpVar = (gp) obj2;
                gpVar.x(ip.g(gpVar.v(), null, false, false, 5));
                return og5Var;
            case 1:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    u54Var = (u54) obj3;
                    this.c = u54Var;
                    this.w = true;
                    objG = ((fv3) obj2).g(this);
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u54 u54Var2 = (u54) this.c;
                    js2.o(obj);
                    u54Var = u54Var2;
                    objG = obj;
                }
                u54Var.j = objG;
                return og5Var;
            case 2:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    xl2 xl2Var = (xl2) this.c;
                    this.w = true;
                    if (xl2Var.l(this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ((jd3) obj3).x();
                ((my1) obj2).g();
                return og5Var;
            case 3:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    kn2 kn2Var = new kn2((lg4) this.c, (ng4) obj2, (byte) 12);
                    this.w = true;
                    return ((s3) obj3).l(kn2Var, this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
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
                ng4 ng4Var = (ng4) obj3;
                ng4Var.m = (pf4) this.c;
                lg4 lg4Var = ng4Var.q;
                this.w = true;
                return ((bz1) obj2).l(lg4Var, this) == px0Var ? px0Var : og5Var;
            case 5:
                boolean z5 = this.w;
                if (z5) {
                    if (z5) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ox0 ox0Var = (ox0) this.c;
                w00 w00VarG = v13.G(new zs((bw4) obj3, (byte) 4));
                kr0 kr0Var = new kr0((qg) obj2, ox0Var, (byte) 10);
                this.w = true;
                return w00VarG.r(kr0Var, this) == px0Var ? px0Var : og5Var;
            case 6:
                SessionWorker sessionWorker = (SessionWorker) obj3;
                boolean z6 = this.w;
                if (z6) {
                    if (z6) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                s95 s95Var = (s95) this.c;
                Context context = sessionWorker.j;
                mu0 mu0Var2 = null;
                og ogVar = new og(s95Var, sessionWorker, mu0Var2, (byte) 2);
                k8 k8Var = new k8((Object) s95Var, (Object) sessionWorker, obj2, mu0Var2, (byte) 4);
                this.w = true;
                Object objB2 = k33.B(new s3(context, k8Var, ogVar, (mu0) null), this);
                return objB2 == px0Var ? px0Var : objB2;
            case 7:
                boolean z7 = this.w;
                if (z7) {
                    if (z7) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                vz0 vz0VarG = q03.g((Context) this.c);
                lm4 lm4Var = new lm4((rw3) obj3, obj2, mu0Var, b2);
                this.w = true;
                return kq2.k(vz0VarG, lm4Var, this) == px0Var ? px0Var : og5Var;
            case 8:
                boolean z8 = this.w;
                if (z8) {
                    if (z8) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                o55 o55Var = (o55) this.c;
                long j = ((qu3) obj2).r;
                this.w = true;
                o55 o55Var2 = new o55(o55Var.i, o55Var.b, o55Var.s, this);
                o55Var2.w = (kx3) obj3;
                o55Var2.c = j;
                return o55Var2.u(og5Var) == px0Var ? px0Var : og5Var;
            default:
                boolean z9 = this.w;
                if (!z9) {
                    js2.o(obj);
                    ox0 ox0Var2 = (ox0) this.c;
                    atomicReference = new AtomicReference(null);
                    tc tcVar = new tc((bz1) obj3, (up) obj2, ox0Var2, atomicReference, null, (byte) 6);
                    this.c = atomicReference;
                    this.w = true;
                    objB = k33.B(tcVar, this);
                    if (objB == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z9) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AtomicReference atomicReference2 = (AtomicReference) this.c;
                    js2.o(obj);
                    atomicReference = atomicReference2;
                    objB = obj;
                }
                dh2 dh2Var = (dh2) atomicReference.get();
                if (dh2Var != null) {
                    dh2Var.x(null);
                }
                return objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u03(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u03(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
    }
}
