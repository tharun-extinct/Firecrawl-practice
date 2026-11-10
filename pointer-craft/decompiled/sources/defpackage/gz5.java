package defpackage;

import android.content.Context;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gz5 {
    public static final nm0 g = new nm0(-89012890, false, new sm0(21));
    public static final nm0 y = new nm0(241552563, false, new sm0(22));
    public static final nm0 r = new nm0(-1942723374, false, new sm0(23));
    public static final nm0 n = new nm0(-110201542, false, new sm0(24));
    public static final nm0 v = new nm0(-35052282, false, new at(12));

    public static final Object g(ol4 ol4Var, ou0 ou0Var) {
        try {
            if (ol4Var.isDone()) {
                return h1.j(ol4Var);
            }
            ib0 ib0Var = new ib0(1, pw5.o(ou0Var));
            ol4Var.g(new i26((Object) ol4Var, (Object) ib0Var, (byte) 14), ba1.j);
            ib0Var.k(new gh2(ol4Var, (byte) 1));
            return ib0Var.z();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            fk2 fk2Var = new fk2();
            yf2.X(fk2Var, yf2.class.getName());
            throw fk2Var;
        }
    }

    public static final ne5 n(xy1 xy1Var, h02 h02Var) {
        xy1Var.getClass();
        Context context = (Context) h02Var.a(sa.y);
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new ne5(xy1Var, new jt(context, (byte) 3));
            h02Var.i0(objK);
        }
        return (ne5) objK;
    }

    public static final BoringLayout.Metrics r(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    public static final BoringLayout y(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }
}
