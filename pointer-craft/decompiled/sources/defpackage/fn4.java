package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class fn4 implements dn4 {
    public tg1 a;
    public tg1 m;
    public tg1 q;
    public tg1 t;
    public og0 g = new oa4();
    public og0 y = new oa4();
    public og0 r = new oa4();
    public og0 n = new oa4();
    public bx0 v = new l(0.0f);
    public bx0 x = new l(0.0f);
    public bx0 l = new l(0.0f);
    public bx0 j = new l(0.0f);

    public fn4() {
        byte b = 0;
        this.t = new tg1(b);
        this.a = new tg1(b);
        this.m = new tg1(b);
        this.q = new tg1(b);
    }

    public static en4 j(TypedArray typedArray, l lVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            bx0 bx0VarT = t(typedArray, 5, lVar);
            bx0 bx0VarT2 = t(typedArray, 8, bx0VarT);
            bx0 bx0VarT3 = t(typedArray, 9, bx0VarT);
            bx0 bx0VarT4 = t(typedArray, 7, bx0VarT);
            bx0 bx0VarT5 = t(typedArray, 6, bx0VarT);
            en4 en4Var = new en4();
            en4Var.g = br2.w(i2);
            en4Var.v = bx0VarT2;
            en4Var.y = br2.w(i3);
            en4Var.x = bx0VarT3;
            en4Var.r = br2.w(i4);
            en4Var.l = bx0VarT4;
            en4Var.n = br2.w(i5);
            en4Var.j = bx0VarT5;
            return en4Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static en4 l(Context context, AttributeSet attributeSet, int i, int i2) {
        l lVar = new l(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.k, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return j(contextThemeWrapper.obtainStyledAttributes(p24.E), lVar);
    }

    public static bx0 t(TypedArray typedArray, int i, bx0 bx0Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new l(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new e64(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bx0Var;
    }

    public final boolean a(RectF rectF) {
        boolean z = this.q.getClass().equals(tg1.class) && this.a.getClass().equals(tg1.class) && this.t.getClass().equals(tg1.class) && this.m.getClass().equals(tg1.class);
        float fG = this.v.g(rectF);
        return z && ((this.x.g(rectF) > fG ? 1 : (this.x.g(rectF) == fG ? 0 : -1)) == 0 && (this.j.g(rectF) > fG ? 1 : (this.j.g(rectF) == fG ? 0 : -1)) == 0 && (this.l.g(rectF) > fG ? 1 : (this.l.g(rectF) == fG ? 0 : -1)) == 0) && (this.y instanceof oa4) && (this.g instanceof oa4) && (this.r instanceof oa4) && (this.n instanceof oa4);
    }

    @Override // defpackage.dn4
    public final fn4 g(float f) {
        en4 en4VarM = m();
        en4VarM.y(f);
        return en4VarM.g();
    }

    public final en4 m() {
        en4 en4Var = new en4();
        en4Var.g = this.g;
        en4Var.y = this.y;
        en4Var.r = this.r;
        en4Var.n = this.n;
        en4Var.v = this.v;
        en4Var.x = this.x;
        en4Var.l = this.l;
        en4Var.j = this.j;
        en4Var.t = this.t;
        en4Var.a = this.a;
        en4Var.m = this.m;
        en4Var.q = this.q;
        return en4Var;
    }

    @Override // defpackage.dn4
    public final fn4[] r() {
        return new fn4[]{this};
    }

    public final String toString() {
        return "[" + this.v + ", " + this.x + ", " + this.l + ", " + this.j + "]";
    }

    @Override // defpackage.dn4
    public final fn4 v(e64 e64Var) {
        en4 en4VarM = m();
        en4VarM.v = e64Var;
        en4VarM.x = e64Var;
        en4VarM.l = e64Var;
        en4VarM.j = e64Var;
        return en4VarM.g();
    }

    @Override // defpackage.dn4
    public final boolean x() {
        return false;
    }

    @Override // defpackage.dn4
    public final fn4 n() {
        return this;
    }

    @Override // defpackage.dn4
    public final fn4 y(int[] iArr) {
        return this;
    }
}
