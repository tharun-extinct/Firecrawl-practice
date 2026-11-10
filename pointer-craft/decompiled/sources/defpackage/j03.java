package defpackage;

import io.appground.blek.MainApp;

/* JADX INFO: loaded from: classes2.dex */
public final class j03 extends zz4 implements bz1 {
    public final /* synthetic */ MainApp c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j03(MainApp mainApp, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 2;
        this.c = mainApp;
        this.w = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        MainApp mainApp = this.c;
        switch (b) {
            case 0:
                return new j03(mainApp, mu0Var, (byte) 0);
            case 1:
                return new j03(mainApp, mu0Var, (byte) 1);
            default:
                return new j03(mainApp, this.w, mu0Var);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((j03) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                return ((j03) b(mu0Var, ox0Var)).u(og5Var);
            default:
                ((j03) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        MainApp mainApp = this.c;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(1000L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                mainApp.g().l.n();
                return og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(700L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                mainApp.g().r(false);
                return og5Var;
            default:
                js2.o(obj);
                l62 l62VarG = mainApp.g();
                boolean z3 = this.w;
                if (pw5.j(l62VarG.l.j).j.getValue() != dq0.a) {
                    l62VarG.n(z3);
                }
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j03(MainApp mainApp, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = mainApp;
    }
}
