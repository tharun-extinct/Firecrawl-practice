package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class zo5 extends gp5 {
    public static boolean a = false;
    public static boolean j = false;
    public static Field l;
    public static Constructor t;
    public WindowInsets v;
    public nd2 x;

    public zo5() {
        this.v = a();
    }

    private static WindowInsets a() {
        if (!j) {
            try {
                l = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            j = true;
        }
        Field field = l;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!a) {
            try {
                t = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            a = true;
        }
        Constructor constructor = t;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.gp5
    public void j(nd2 nd2Var) {
        WindowInsets windowInsets = this.v;
        if (windowInsets != null) {
            this.v = windowInsets.replaceSystemWindowInsets(nd2Var.g, nd2Var.y, nd2Var.r, nd2Var.n);
        }
    }

    @Override // defpackage.gp5
    public void x(nd2 nd2Var) {
        this.x = nd2Var;
    }

    @Override // defpackage.gp5
    public tp5 y() {
        g();
        tp5 tp5VarL = tp5.l(null, this.v);
        nd2[] nd2VarArr = this.y;
        pp5 pp5Var = tp5VarL.g;
        pp5Var.f(nd2VarArr);
        pp5Var.e(this.x);
        pp5Var.o(null);
        pp5Var.B(this.r);
        pp5Var.C(this.n);
        return tp5VarL;
    }

    public zo5(tp5 tp5Var) {
        super(tp5Var);
        this.v = tp5Var.x();
    }
}
