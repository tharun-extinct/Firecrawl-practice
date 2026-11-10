package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qf implements s73 {
    public final Object a;
    public final /* synthetic */ byte j;
    public final Object t;

    public qf(my1 my1Var) {
        this.j = (byte) 1;
        this.t = my1Var;
        this.a = new rv((byte) 0);
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return a11.f(this, ex0Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.s73
    public final Object I(mu0 mu0Var, xy1 xy1Var) {
        hr3 hr3Var;
        boolean z;
        Object objZ;
        byte b = 0;
        byte b2 = 1;
        switch (this.j) {
            case 0:
                nf nfVar = (nf) this.a;
                ib0 ib0Var = new ib0(1, pw5.o(mu0Var));
                ib0Var.o();
                pf pfVar = new pf(ib0Var, this, xy1Var);
                if (yf2.p(nfVar.a, (Choreographer) this.t)) {
                    synchronized (nfVar.q) {
                        nfVar.c.add(pfVar);
                        if (!nfVar.s) {
                            nfVar.s = true;
                            nfVar.a.postFrameCallback(nfVar.p);
                        }
                        break;
                    }
                    ib0Var.k(new of(nfVar, pfVar, b));
                } else {
                    ((Choreographer) this.t).postFrameCallback(pfVar);
                    ib0Var.k(new sd(this, pfVar, b2));
                }
                return ib0Var.z();
            case 1:
                ib0 ib0Var2 = new ib0(1, pw5.o(mu0Var));
                ib0Var2.o();
                rv rvVar = (rv) this.a;
                w60 w60Var = new w60();
                w60Var.g = ib0Var2;
                w60Var.y = xy1Var;
                ib0Var2.k(new x60(rvVar.n(w60Var, (my1) this.t), b));
                return ib0Var2.z();
            default:
                if (mu0Var instanceof hr3) {
                    hr3Var = (hr3) mu0Var;
                    int i = hr3Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hr3Var.c = i - Integer.MIN_VALUE;
                    } else {
                        hr3Var = new hr3(this, mu0Var);
                    }
                } else {
                    hr3Var = new hr3(this, mu0Var);
                }
                Object obj = hr3Var.q;
                px0 px0Var = px0.j;
                int i2 = hr3Var.c;
                if (i2 == 0) {
                    js2.o(obj);
                    ok2 ok2Var = (ok2) this.a;
                    hr3Var.m = xy1Var;
                    hr3Var.c = 1;
                    synchronized (ok2Var.y) {
                        z = ok2Var.g;
                    }
                    if (z) {
                        objZ = og5.g;
                    } else {
                        ib0 ib0Var3 = new ib0(1, pw5.o(hr3Var));
                        ib0Var3.o();
                        synchronized (ok2Var.y) {
                            ((ArrayList) ok2Var.r).add(ib0Var3);
                        }
                        ib0Var3.k(new sd((Object) ok2Var, (Object) ib0Var3, (byte) 6));
                        objZ = ib0Var3.z();
                        if (objZ != px0Var) {
                            objZ = og5.g;
                        }
                    }
                    if (objZ != px0Var) {
                    }
                    return px0Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xy1Var = hr3Var.m;
                js2.o(obj);
                s73 s73Var = (s73) this.t;
                hr3Var.m = null;
                hr3Var.c = 2;
                Object objI = s73Var.I(hr3Var, xy1Var);
                if (objI != px0Var) {
                    return objI;
                }
                return px0Var;
        }
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return a11.k(this, fx0Var);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return bz1Var.l(obj, this);
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return a11.p(this, ex0Var);
    }

    public qf(s73 s73Var) {
        this.j = (byte) 2;
        this.t = s73Var;
        this.a = new ok2();
    }

    public qf(Choreographer choreographer, nf nfVar) {
        this.j = (byte) 0;
        this.t = choreographer;
        this.a = nfVar;
    }
}
