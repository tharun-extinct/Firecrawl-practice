package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class h8 extends zz4 implements xy1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        Object obj3 = this.i;
        mu0 mu0Var = (mu0) obj;
        switch (b) {
            case 0:
                return new h8((p8) obj3, (cz1) obj2, mu0Var, (byte) 0).u(og5Var);
            case 1:
                return new h8((q8) obj3, (cz1) obj2, mu0Var, (byte) 1).u(og5Var);
            case 2:
                return new h8((cf) obj3, (w35) obj2, mu0Var, (byte) 2).u(og5Var);
            default:
                return new h8((yy) obj3, (xy) obj2, mu0Var, (byte) 3).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        ze zeVar;
        byte b = this.q;
        byte b2 = 0;
        px0 px0Var = px0.j;
        Object obj2 = this.i;
        Object obj3 = this.c;
        og5 og5Var = og5.g;
        byte b3 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    p8 p8Var = (p8) obj2;
                    d8 d8Var = new d8(p8Var, (byte) 3);
                    c cVar = new c((cz1) obj3, p8Var, mu0Var, b3);
                    this.w = true;
                    if (be2.v(d8Var, cVar, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 1:
                q8 q8Var = (q8) obj2;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    g8 g8Var = new g8(q8Var, b2);
                    c cVar2 = new c((cz1) obj3, q8Var, mu0Var, (byte) 2);
                    this.w = true;
                    if (og0.H(g8Var, cVar2, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                l11 l11VarY = q8Var.y();
                pp3 pp3Var = q8Var.a;
                Object objG = l11VarY.g(pp3Var.d());
                if (objG != null) {
                    if (Math.abs(pp3Var.d() - q8Var.y().r(objG)) < 0.5f && ((Boolean) q8Var.g.a(objG)).booleanValue()) {
                        q8Var.j.setValue(objG);
                        q8Var.l.setValue(objG);
                    }
                }
                return og5Var;
            case 2:
                cf cfVar = (cf) obj2;
                ut4 ut4Var = cfVar.v;
                View view = cfVar.g;
                boolean z3 = this.w;
                try {
                    if (!z3) {
                        js2.o(obj);
                        af afVar = new af();
                        w35 w35Var = (w35) obj3;
                        ze zeVar2 = new ze(afVar, new we(cfVar, w35Var, (byte) 0), new we(cfVar, w35Var, (byte) 1), view);
                        xy1 xy1Var = cfVar.y;
                        if (xy1Var != null && (zeVar = (ze) xy1Var.a(zeVar2)) != null) {
                            zeVar2 = zeVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new br1(zeVar2), 1);
                            if (actionModeStartActionMode != null) {
                                cfVar.j = actionModeStartActionMode;
                            }
                            return og5Var;
                        }
                        bf bfVar = cfVar.t;
                        if (bfVar == null) {
                            bfVar = new bf(cfVar, zeVar2, afVar, b2);
                            cfVar.t = bfVar;
                        }
                        view.post(bfVar);
                        this.w = true;
                        Object objL = afVar.g.l(this);
                        if (objL != px0Var) {
                            objL = og5Var;
                        }
                        if (objL == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z3) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    ut4Var.g();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable j4Var = cfVar.a;
                        if (j4Var == null) {
                            j4Var = new j4(cfVar, b3);
                            cfVar.a = j4Var;
                        }
                        view.post(j4Var);
                    } else {
                        ActionMode actionMode = cfVar.j;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    bf bfVar2 = cfVar.t;
                    if (bfVar2 != null) {
                        view.removeCallbacks(bfVar2);
                    }
                    cfVar.j = null;
                    return og5Var;
                } catch (Throwable th) {
                    ut4Var.g();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable j4Var2 = cfVar.a;
                        if (j4Var2 == null) {
                            j4Var2 = new j4(cfVar, b3);
                            cfVar.a = j4Var2;
                        }
                        view.post(j4Var2);
                    } else {
                        ActionMode actionMode2 = cfVar.j;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    bf bfVar3 = cfVar.t;
                    if (bfVar3 != null) {
                        view.removeCallbacks(bfVar3);
                    }
                    cfVar.j = null;
                    throw th;
                }
            default:
                xy xyVar = (xy) obj3;
                tp3 tp3Var = ((yy) obj2).r;
                boolean z4 = this.w;
                try {
                    if (!z4) {
                        js2.o(obj);
                        tp3Var.setValue(xyVar);
                        this.w = true;
                        Object objL2 = xyVar.y.l(this);
                        if (objL2 != px0Var) {
                            objL2 = og5Var;
                        }
                        if (objL2 == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z4) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    tp3Var.setValue(null);
                    return og5Var;
                } catch (Throwable th2) {
                    tp3Var.setValue(null);
                    throw th2;
                }
        }
    }
}
