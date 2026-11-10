package defpackage;

import io.appground.blek.MainApp;
import io.appground.blek.widget.MultimediaWidgetReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class m03 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ MainApp i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m03(MainApp mainApp, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = mainApp;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        MainApp mainApp = this.i;
        switch (b) {
            case 0:
                m03 m03Var = new m03(mainApp, mu0Var, (byte) 0);
                m03Var.c = obj;
                return m03Var;
            default:
                m03 m03Var2 = new m03(mainApp, mu0Var, (byte) 1);
                m03Var2.c = obj;
                return m03Var2;
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
                break;
        }
        return ((m03) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        MainApp mainApp = this.i;
        switch (b) {
            case 0:
                boolean z = this.w;
                try {
                    if (!z) {
                        js2.o(obj);
                        f22 f22Var = new f22(mainApp);
                        int[] iArr = pe2.g;
                        ia3 ia3Var = new ia3(1);
                        ia3Var.y[ia3Var.n(7)] = 7;
                        tf0 tf0VarG = v54.g(MultimediaWidgetReceiver.class);
                        this.c = null;
                        this.w = true;
                        obj = f22Var.n(tf0VarG, ia3Var, this);
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
                    new Integer(((Number) obj).intValue());
                    return og5Var;
                } catch (Throwable unused) {
                    return og5Var;
                }
            default:
                ox0 ox0Var = (ox0) this.c;
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                v20 v20Var = mainApp.m;
                if (v20Var == null) {
                    yf2.Y("billingRepository");
                    throw null;
                }
                er1 er1VarZ = og0.z(v20Var.r());
                c90 c90Var = new c90(ox0Var, mainApp);
                this.c = null;
                this.w = true;
                return er1VarZ.r(c90Var, this) == px0Var ? px0Var : og5Var;
        }
    }
}
