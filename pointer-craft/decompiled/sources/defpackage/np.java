package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class np extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = 2;
        switch (this.q) {
            case 0:
                return new np((a44) this.c, mu0Var, (byte) 0);
            case 1:
                return new np((w10) this.c, mu0Var, (byte) 1);
            case 2:
                return new np((el0) this.c, mu0Var, b);
            case 3:
                return new np((u54) this.c, mu0Var, (byte) 3);
            case 4:
                return new np((dh2) this.c, mu0Var, (byte) 4);
            case 5:
                return new np((p01) this.c, mu0Var, (byte) 5);
            case 6:
                return new np((s01) this.c, mu0Var, (byte) 6);
            case 7:
                return new np((vr1) this.c, mu0Var, (byte) 7);
            case 8:
                return new np((s52) this.c, mu0Var, (byte) 8);
            case 9:
                np npVar = new np(b, mu0Var);
                npVar.c = obj;
                return npVar;
            case 10:
                return new np((og2) this.c, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new np((ae5) this.c, mu0Var, (byte) 11);
            default:
                return new np((wn5) this.c, mu0Var, (byte) 12);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((np) b((mu0) obj2, (gr1) obj)).u(og5Var);
            case 6:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((np) b((mu0) obj2, (gr1) obj)).u(og5Var);
            case 10:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((np) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        byte b = this.q;
        byte b2 = 0;
        int i = 2;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        byte b3 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    a44 a44Var = (a44) this.c;
                    this.w = true;
                    return a44Var.M(this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                w10 w10Var = (w10) this.c;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    obj = w10Var.k(this);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                if (obj == null) {
                    return og5Var;
                }
                w10Var.e();
                return og5Var;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    el0 el0Var = (el0) this.c;
                    this.w = true;
                    return el0Var.r0(this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    dh2 dh2Var = (dh2) ((u54) this.c).j;
                    if (dh2Var != null) {
                        this.w = true;
                        return v70.m(dh2Var, this) == px0Var ? px0Var : og5Var;
                    }
                } else {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 4:
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    dh2 dh2Var2 = (dh2) this.c;
                    if (dh2Var2 != null) {
                        this.w = true;
                        return v70.m(dh2Var2, this) == px0Var ? px0Var : og5Var;
                    }
                } else {
                    if (z5) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    p01 p01Var = (p01) this.c;
                    this.w = true;
                    return p01Var.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z6) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
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
                s01 s01Var = (s01) this.c;
                File filesDir = s01Var.g.getFilesDir();
                filesDir.getClass();
                this.w = true;
                return s01Var.r(filesDir, this) == px0Var ? px0Var : og5Var;
            case 7:
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
                vr1 vr1Var = (vr1) this.c;
                this.w = true;
                Object objR = vr1Var.r(rh3.j, this);
                if (objR != px0Var) {
                    objR = og5Var;
                }
                return objR == px0Var ? px0Var : og5Var;
            case 8:
                boolean z9 = this.w;
                if (z9) {
                    if (z9) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                os1 os1Var = new os1(((s52) this.c).v, (byte) 0);
                b01 b01Var = new b01(i, mu0Var, b3);
                this.w = true;
                Object objN = ue5.N(os1Var, b01Var, this);
                return objN == px0Var ? px0Var : objN;
            case 9:
                gr1 gr1Var = (gr1) this.c;
                boolean z10 = this.w;
                if (!z10) {
                    js2.o(obj);
                    this.c = null;
                    this.w = true;
                    return gr1Var.c(pi1.j, this) == px0Var ? px0Var : og5Var;
                }
                if (z10) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.w;
                if (z11) {
                    if (z11) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                og2 og2Var = (og2) this.c;
                this.w = true;
                aq2.I(og2Var.g);
                Object objX = og2Var.y.x(this);
                if (objX != px0Var) {
                    objX = og5Var;
                }
                return objX == px0Var ? px0Var : og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                boolean z12 = this.w;
                if (!z12) {
                    js2.o(obj);
                    ae5 ae5Var = (ae5) this.c;
                    this.w = true;
                    return ae5Var.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z12) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                wn5 wn5Var = (wn5) this.c;
                boolean z13 = this.w;
                if (z13) {
                    if (z13) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                rv rvVar = wn5Var.y.x;
                er1 er1VarZ = og0.z(new w00(new qr1(new q21((byte) 13), new qs1(pw5.j((ew4) rvVar.j), new vr1(new np(i, mu0Var), new d34((co4) rvVar.t)), new kg0(3, mu0Var, b3), b2), null), (byte) 3));
                c90 c90Var = new c90((Object) wn5Var, (byte) 8);
                this.w = true;
                return er1VarZ.r(c90Var, this) == px0Var ? px0Var : og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np(int i, mu0 mu0Var) {
        super(i, mu0Var);
        this.q = (byte) 9;
    }
}
