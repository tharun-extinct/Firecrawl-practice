package defpackage;

import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jb6 {
    public static final float g = 1.0f;

    public static final gr1 g(gr1 gr1Var, fx0 fx0Var) {
        return ((gr1Var instanceof yj4) || (gr1Var instanceof rh3)) ? gr1Var : new u93(gr1Var, fx0Var);
    }

    public static void n(Window.Callback callback, List list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }

    public static float r() {
        return g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(fx0 fx0Var, Object obj, Object obj2, bz1 bz1Var, mu0 mu0Var) throws Throwable {
        cd0 cd0Var;
        Object objW;
        Object objL;
        if (mu0Var instanceof cd0) {
            cd0Var = (cd0) mu0Var;
            int i = cd0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd0Var.i = i - Integer.MIN_VALUE;
            } else {
                cd0Var = new cd0(mu0Var);
            }
        } else {
            cd0Var = new cd0(mu0Var);
        }
        Object obj3 = cd0Var.c;
        int i2 = cd0Var.i;
        if (i2 != 0) {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = cd0Var.w;
            fx0 fx0Var2 = cd0Var.q;
            try {
                js2.o(obj3);
                objW = obj4;
                fx0Var = fx0Var2;
                pw5.J(fx0Var, objW);
                return obj3;
            } catch (Throwable th) {
                objW = obj4;
                fx0Var = fx0Var2;
                th = th;
                pw5.J(fx0Var, objW);
                throw th;
            }
        }
        js2.o(obj3);
        objW = pw5.W(fx0Var, obj2);
        try {
            cd0Var.m = obj;
            cd0Var.q = fx0Var;
            cd0Var.w = objW;
            cd0Var.i = 1;
            av4 av4Var = new av4(cd0Var, fx0Var);
            if (bz1Var == null) {
                objL = pw5.X(bz1Var, obj, av4Var);
            } else {
                ue5.f(2, bz1Var);
                objL = bz1Var.l(obj, av4Var);
            }
            obj3 = objL;
            Object obj5 = px0.j;
            if (obj3 == obj5) {
                return obj5;
            }
            pw5.J(fx0Var, objW);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            pw5.J(fx0Var, objW);
            throw th;
        }
    }

    public static final int y(float f) {
        return k33.Z(f) * (-1);
    }
}
