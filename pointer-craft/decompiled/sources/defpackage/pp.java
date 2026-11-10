package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pp extends zz4 implements bz1 {
    public final /* synthetic */ co4 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int i;
    public byte q;
    public final /* synthetic */ w12 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(w12 w12Var, Context context, int i, co4 co4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = w12Var;
        this.c = context;
        this.i = i;
        this.b = co4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new pp(this.w, this.c, this.i, this.b, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((pp) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        w12 w12Var = this.w;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            this.q = (byte) 1;
            w12Var.n(this.c, this.i, this);
            return px0Var;
        }
        if (b == 1) {
            js2.o(obj);
            co4 co4Var = this.b;
            if (co4Var.g().isEmpty()) {
                Log.w("GlanceAppWidget", v54.g(w12Var.getClass()) + " did not call provideContent in providePreview");
                this.q = (byte) 2;
                if (co4Var.c(ey5.g, this) == px0Var) {
                    return px0Var;
                }
            }
        } else {
            if (b != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }
}
