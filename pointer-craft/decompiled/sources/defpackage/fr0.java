package defpackage;

import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class fr0 extends zz4 implements bz1 {
    public final /* synthetic */ qr0 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr0(qr0 qr0Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = qr0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        qr0 qr0Var = this.c;
        switch (b) {
            case 0:
                return new fr0(qr0Var, mu0Var, (byte) 0);
            case 1:
                return new fr0(qr0Var, mu0Var, (byte) 1);
            case 2:
                return new fr0(qr0Var, mu0Var, (byte) 2);
            case 3:
                return new fr0(qr0Var, mu0Var, (byte) 3);
            case 4:
                return new fr0(qr0Var, mu0Var, (byte) 4);
            case 5:
                return new fr0(qr0Var, mu0Var, (byte) 5);
            case 6:
                return new fr0(qr0Var, mu0Var, (byte) 6);
            default:
                return new fr0(qr0Var, mu0Var, (byte) 7);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            case 2:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            case 3:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            case 4:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            case 5:
                ((fr0) b(mu0Var, ox0Var)).u(og5Var);
                return px0.j;
            case 6:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
            default:
                return ((fr0) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        byte b = this.q;
        byte b2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        og5 og5Var = og5.g;
        qr0 qr0Var = this.c;
        px0 px0Var = px0.j;
        byte b3 = 1;
        mu0 mu0Var = null;
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
                e40 e40VarJ = qr0Var.j();
                if (e40VarJ == null) {
                    return og5Var;
                }
                this.w = true;
                Object objF0 = m50.f0(e40VarJ.g, new dy(e40VarJ, mu0Var, b3), this);
                if (objF0 != px0Var) {
                    objF0 = og5Var;
                }
                return objF0 == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    x21 x21Var = na1.g;
                    obj = m50.f0(c21.a, new hr0(qr0Var, mu0Var, objArr == true ? 1 : 0), this);
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
                er0 er0Var = (er0) obj;
                if (er0Var == null || !d52.s) {
                    return og5Var;
                }
                d52.s = false;
                String string = qr0Var.y.getString(er0Var.j);
                string.getClass();
                qr0Var.p(string, true);
                return og5Var;
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
                e40 e40VarJ2 = qr0Var.j();
                if (e40VarJ2 == null) {
                    return og5Var;
                }
                this.w = true;
                return e40VarJ2.r(this) == px0Var ? px0Var : og5Var;
            case 3:
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
                boolean z5 = qr0Var.t.j.getValue() == dq0.t;
                String str = "https://anleitung-backend.appspot.com/api/report?connection=false&ble=" + z5 + "&name=" + Uri.encode(Build.DEVICE) + qr0.x();
                this.w = true;
                x21 x21Var2 = na1.g;
                return m50.f0(c21.a, new o40(str, mu0Var, (byte) 3), this) == px0Var ? px0Var : og5Var;
            case 4:
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
                l62 l62Var = qr0Var.r;
                this.w = true;
                Object objY = l62Var.y(this);
                return objY == px0Var ? px0Var : objY;
            case 5:
                boolean z7 = this.w;
                if (z7) {
                    if (!z7) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                q54 q54Var = new q54();
                f34 f34Var = qr0Var.b;
                kr0 kr0Var = new kr0(q54Var, qr0Var, objArr2 == true ? 1 : 0);
                this.w = true;
                if (f34Var.j.r(kr0Var, this) == px0Var) {
                    return px0Var;
                }
                up.q();
                return null;
            case 6:
                boolean z8 = this.w;
                if (z8) {
                    if (z8) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                f34 f34Var2 = qr0Var.m;
                vg0 vg0Var = new vg0(b2, mu0Var, b2);
                this.w = true;
                Object objN = ue5.N(f34Var2, vg0Var, this);
                return objN == px0Var ? px0Var : objN;
            default:
                boolean z9 = this.w;
                if (!z9) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(5000L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z9) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                return og5Var;
        }
    }
}
