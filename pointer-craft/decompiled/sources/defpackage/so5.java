package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class so5 implements View.OnApplyWindowInsetsListener {
    public final ri0 g;
    public tp5 y;

    public so5(View view, ri0 ri0Var) {
        tp5 tp5VarY;
        this.g = ri0Var;
        WeakHashMap weakHashMap = xk5.g;
        tp5 tp5VarG = qk5.g(view);
        if (tp5VarG != null) {
            int i = Build.VERSION.SDK_INT;
            tp5VarY = (i >= 36 ? new fp5(tp5VarG) : i >= 35 ? new ep5(tp5VarG) : i >= 34 ? new dp5(tp5VarG) : i >= 31 ? new cp5(tp5VarG) : i >= 30 ? new bp5(tp5VarG) : i >= 29 ? new ap5(tp5VarG) : new zo5(tp5VarG)).y();
        } else {
            tp5VarY = null;
        }
        this.y = tp5VarY;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.y = tp5.l(view, windowInsets);
            return to5.a(view, windowInsets);
        }
        tp5 tp5VarL = tp5.l(view, windowInsets);
        pp5 pp5Var = tp5VarL.g;
        tp5 tp5VarG = this.y;
        if (tp5VarG == null) {
            WeakHashMap weakHashMap = xk5.g;
            tp5VarG = qk5.g(view);
            this.y = tp5VarG;
        }
        if (tp5VarG == null) {
            this.y = tp5VarL;
            return to5.a(view, windowInsets);
        }
        ri0 ri0VarM = to5.m(view);
        if (ri0VarM != null && Objects.equals((tp5) ri0VarM.t, tp5VarL)) {
            return to5.a(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        tp5 tp5Var = this.y;
        int i = 1;
        while (i <= 512) {
            nd2 nd2VarT = pp5Var.t(i);
            nd2 nd2VarT2 = tp5Var.g.t(i);
            int i2 = nd2VarT.g;
            int i3 = nd2VarT.n;
            int i4 = nd2VarT.r;
            int i5 = nd2VarT.y;
            int i6 = nd2VarT2.g;
            int i7 = nd2VarT2.n;
            int i8 = nd2VarT2.r;
            int i9 = nd2VarT2.y;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.y = tp5VarL;
            return to5.a(view, windowInsets);
        }
        tp5 tp5Var2 = this.y;
        if ((i10 & 8) != 0) {
            interpolator = to5.v;
        } else if ((i11 & 8) != 0) {
            interpolator = to5.x;
        } else if ((i10 & 519) != 0) {
            interpolator = to5.l;
        } else {
            interpolator = (i11 & 519) != 0 ? to5.j : null;
        }
        yo5 yo5Var = new yo5(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        yo5Var.g.v(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(yo5Var.g.y());
        nd2 nd2VarT3 = pp5Var.t(i12);
        nd2 nd2VarT4 = tp5Var2.g.t(i12);
        int iMin = Math.min(nd2VarT3.g, nd2VarT4.g);
        int i13 = nd2VarT3.y;
        int i14 = nd2VarT4.y;
        int iMin2 = Math.min(i13, i14);
        int i15 = nd2VarT3.r;
        int i16 = nd2VarT4.r;
        int iMin3 = Math.min(i15, i16);
        int i17 = nd2VarT3.n;
        int i18 = nd2VarT4.n;
        cd2 cd2Var = new cd2((byte) 23, nd2.r(iMin, iMin2, iMin3, Math.min(i17, i18)), nd2.r(Math.max(nd2VarT3.g, nd2VarT4.g), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), false);
        to5.l(view, yo5Var, tp5VarL, false);
        duration.addUpdateListener(new ro5(yo5Var, tp5VarL, tp5Var2, i12, view));
        duration.addListener(new p62(yo5Var, view, (byte) 3));
        pk3.g(view, new dc0(view, yo5Var, cd2Var, duration));
        this.y = tp5VarL;
        return to5.a(view, windowInsets);
    }
}
