package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d23 extends c6 {
    public final Rect n;
    public final g33 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public d23(Context context) {
        TypedValue typedValueU = mq2.u(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i = typedValueU == null ? 0 : typedValueU.data;
        Context contextW = gp4.W(R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, context, null, new int[0]);
        contextW = i != 0 ? new lu0(contextW, i) : contextW;
        TypedValue typedValueU2 = mq2.u(context.getTheme(), R.attr.materialAlertDialogTheme);
        super(contextW, typedValueU2 == null ? 0 : typedValueU2.data);
        ContextThemeWrapper contextThemeWrapper = ((y5) this.y).g;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        ue5.C(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = p24.q;
        ue5.E(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.n = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iB = xq2.B(contextThemeWrapper, mq2.o(R.attr.colorSurface, contextThemeWrapper, d23.class.getCanonicalName()));
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iB);
        typedArrayObtainStyledAttributes2.recycle();
        g33 g33Var = new g33(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        g33Var.c(contextThemeWrapper);
        g33Var.p(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((y5) this.y).g.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                g33Var.setShapeAppearanceModel(g33Var.t.g.g(dimension));
            }
        }
        this.r = g33Var;
    }

    public final void b() {
        ((y5) this.y).x = "This version of the app is not supported, please get the current version from the store.";
    }

    public final void i() {
        ((y5) this.y).t = false;
    }

    public final void p() {
        ((y5) this.y).n = "Unsupported version";
    }

    public final void s(String str, g91 g91Var) {
        y5 y5Var = (y5) this.y;
        y5Var.l = str;
        y5Var.j = g91Var;
    }

    @Override // defpackage.c6
    public final d6 v() {
        d6 d6VarV = super.v();
        Window window = d6VarV.getWindow();
        View decorView = window.getDecorView();
        float elevation = decorView.getElevation();
        g33 g33Var = this.r;
        g33Var.s(elevation);
        Rect rect = this.n;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) g33Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ld2(d6VarV, rect));
        return d6VarV;
    }
}
