package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g33 extends Drawable implements sn4 {
    public static final Paint L;
    public static final f33[] M;
    public PorterDuffColorFilter A;
    public PorterDuffColorFilter B;
    public final RectF C;
    public boolean D;
    public boolean E;
    public fn4 F;
    public xu4 G;
    public final wu4[] H;
    public float[] I;
    public float[] J;
    public d5 K;
    public final pn4[] a;
    public final Path b;
    public boolean c;
    public final q64 d;
    public final i64 e;
    public final Paint f;
    public final Region h;
    public final Matrix i;
    public final y22 j;
    public final an4 k;
    public final pn4[] m;
    public final Paint o;
    public final RectF p;
    public final BitSet q;
    public final Path s;
    public e33 t;
    public final RectF u;
    public boolean w;
    public final Region z;

    static {
        Paint paint = new Paint(1);
        L = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        M = new f33[4];
        int i = 0;
        while (true) {
            f33[] f33VarArr = M;
            if (i >= f33VarArr.length) {
                return;
            }
            f33VarArr[i] = new f33(i);
            i++;
        }
    }

    public g33(e33 e33Var) {
        this.j = new y22((Object) this, (byte) 23);
        this.a = new pn4[4];
        this.m = new pn4[4];
        this.q = new BitSet(8);
        this.i = new Matrix();
        this.b = new Path();
        this.s = new Path();
        this.p = new RectF();
        this.u = new RectF();
        this.z = new Region();
        this.h = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.k = new an4();
        this.e = i64.j();
        this.C = new RectF();
        this.D = true;
        this.E = true;
        this.H = new wu4[4];
        this.t = e33Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        o(getState());
        this.d = new q64((Object) this, (byte) 25);
    }

    public final float a() {
        if (w()) {
            return this.f.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void b(xu4 xu4Var) {
        if (this.G == xu4Var) {
            return;
        }
        this.G = xu4Var;
        int i = 0;
        while (true) {
            wu4[] wu4VarArr = this.H;
            if (i >= wu4VarArr.length) {
                f(getState(), true);
                invalidateSelf();
                return;
            }
            if (wu4VarArr[i] == null) {
                wu4VarArr[i] = new wu4(this, M[i]);
            }
            wu4 wu4Var = wu4VarArr[i];
            xu4 xu4Var2 = new xu4();
            xu4Var2.g((float) xu4Var.y);
            double d = xu4Var.g;
            xu4Var2.y((float) (d * d));
            wu4Var.w = xu4Var2;
            i++;
        }
    }

    public final void c(Context context) {
        this.t.y = new zg1(context);
        d();
    }

    public final void d() {
        e33 e33Var = this.t;
        float f = e33Var.w + 0.0f;
        e33Var.c = (int) Math.ceil(0.75f * f);
        this.t.i = (int) Math.ceil(f * 0.25f);
        k();
        if (q() || !i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.A;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.t.m;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.B;
        Paint paint3 = this.f;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.t.a);
        int alpha2 = paint3.getAlpha();
        int i2 = this.t.m;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = q() || !i();
        Paint.Style style = this.t.b;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.w;
            paint = paint2;
            Path path = this.b;
            if (z2) {
                if (z) {
                    g(l(), path);
                }
                this.w = false;
            }
            if (q()) {
                canvas.save();
                canvas.translate((int) (((double) this.t.i) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.t.i)));
                if (this.D) {
                    Rect bounds = getBounds();
                    RectF rectF = this.C;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        uo1.i(du4.s(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "), rectF);
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.t.c * 2) + ((int) rectF.width()) + iWidth, (this.t.c * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.t.c;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    n(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    n(canvas);
                    canvas.restore();
                }
            }
            v(canvas, paint, path, this.t.g.n(), this.I, l());
        } else {
            paint = paint2;
        }
        if (w()) {
            if (this.c) {
                fn4 fn4VarT = t();
                en4 en4VarM = fn4VarT.m();
                bx0 bx0Var = fn4VarT.v;
                y22 y22Var = this.j;
                en4VarM.v = y22Var.v(bx0Var);
                en4VarM.x = y22Var.v(fn4VarT.x);
                en4VarM.j = y22Var.v(fn4VarT.j);
                en4VarM.l = y22Var.v(fn4VarT.l);
                this.F = en4VarM.g();
                float[] fArr = this.I;
                if (fArr != null) {
                    if (this.J == null) {
                        this.J = new float[fArr.length];
                    }
                    float fA = a();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.I;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.J[i5] = Math.max(0.0f, fArr2[i5] - fA);
                        i5++;
                    }
                } else {
                    this.J = null;
                }
                if (z) {
                    fn4 fn4Var = this.F;
                    float[] fArr3 = this.J;
                    float f3 = this.t.t;
                    RectF rectFL = l();
                    RectF rectF2 = this.u;
                    rectF2.set(rectFL);
                    float fA2 = a();
                    rectF2.inset(fA2, fA2);
                    this.e.g(fn4Var, fArr3, f3, rectF2, null, this.s);
                }
                this.c = false;
            }
            x(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void f(int[] iArr, boolean z) {
        boolean z2;
        bx0 bx0Var;
        RectF rectFL = l();
        if (!this.t.g.x() || rectFL.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.G == null);
        if (this.I == null) {
            this.I = new float[4];
        }
        fn4 fn4VarY = this.t.g.y(iArr);
        float[] fArr = this.I;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i2 = 1;
            while (true) {
                if (i2 < fArr.length) {
                    if (fArr[i2] == f) {
                        i2++;
                    }
                } else if (fn4VarY.a(l())) {
                    z2 = true;
                }
                z2 = false;
            }
        } else if (fn4VarY.a(l())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E = z2;
        if (!z2) {
            this.w = true;
            this.c = true;
        }
        while (i < 4) {
            this.e.getClass();
            if (i == 1) {
                bx0Var = fn4VarY.l;
            } else if (i != 2) {
                bx0Var = i != 3 ? fn4VarY.x : fn4VarY.v;
            } else {
                bx0Var = fn4VarY.j;
            }
            float fG = bx0Var.g(rectFL);
            if (z3) {
                this.I[i] = fG;
            }
            wu4[] wu4VarArr = this.H;
            wu4 wu4Var = wu4VarArr[i];
            if (wu4Var != null) {
                wu4Var.g(fG);
                if (z3) {
                    wu4VarArr[i].n();
                }
            }
            i++;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final void g(RectF rectF, Path path) {
        this.e.g(this.t.g.n(), this.I, this.t.t, rectF, this.d, path);
        if (this.t.j != 1.0f) {
            Matrix matrix = this.i;
            matrix.reset();
            float f = this.t.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.C, true);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.t.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.t.getClass();
        RectF rectFL = l();
        if (rectFL.isEmpty()) {
            return;
        }
        float fY = y(rectFL, this.t.g.n(), this.I);
        if (fY >= 0.0f) {
            outline.setRoundRect(getBounds(), fY * this.t.t);
            return;
        }
        boolean z = this.w;
        Path path = this.b;
        if (z) {
            g(rectFL, path);
            this.w = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ee1.g(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                de1.g(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            de1.g(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.t.l;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.z;
        region.set(bounds);
        RectF rectFL = l();
        Path path = this.b;
        g(rectFL, path);
        Region region2 = this.h;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(dn4 dn4Var) {
        if (dn4Var instanceof fn4) {
            setShapeAppearanceModel((fn4) dn4Var);
            return;
        }
        iw4 iw4Var = (iw4) dn4Var;
        e33 e33Var = this.t;
        if (e33Var.g != iw4Var) {
            e33Var.g = iw4Var;
            f(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean i() {
        if (this.t.g.y(getState()).a(l())) {
            return this.I == null || this.E;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.w = true;
        this.c = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.t.v;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.t.getClass();
        ColorStateList colorStateList2 = this.t.n;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.t.r;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.t.g.x();
    }

    public final float j() {
        float[] fArr = this.I;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFL = l();
        fn4 fn4VarT = t();
        i64 i64Var = this.e;
        i64Var.getClass();
        float fG = fn4VarT.v.g(rectFL);
        fn4 fn4VarT2 = t();
        i64Var.getClass();
        float fG2 = fn4VarT2.j.g(rectFL) + fG;
        fn4 fn4VarT3 = t();
        i64Var.getClass();
        float fG3 = fG2 - fn4VarT3.l.g(rectFL);
        fn4 fn4VarT4 = t();
        i64Var.getClass();
        return (fG3 - fn4VarT4.x.g(rectFL)) / 2.0f;
    }

    public final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        PorterDuffColorFilter porterDuffColorFilter3 = this.B;
        e33 e33Var = this.t;
        ColorStateList colorStateList = e33Var.v;
        PorterDuff.Mode mode = e33Var.x;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int iR = r(color);
            porterDuffColorFilter = iR != color ? new PorterDuffColorFilter(iR, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(r(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.A = porterDuffColorFilter;
        this.t.getClass();
        this.B = null;
        this.t.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.A) && Objects.equals(porterDuffColorFilter3, this.B)) ? false : true;
    }

    public final RectF l() {
        Rect bounds = getBounds();
        RectF rectF = this.p;
        rectF.set(bounds);
        return rectF;
    }

    public final float m() {
        float[] fArr = this.I;
        return fArr != null ? fArr[3] : this.t.g.n().v.g(l());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.t = new e33(this.t);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.q.cardinality() > 0) {
            Log.w("g33", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.t.i;
        Path path = this.b;
        an4 an4Var = this.k;
        if (i != 0) {
            canvas.drawPath(path, an4Var.g);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            pn4 pn4Var = this.a[i2];
            int i3 = this.t.c;
            Matrix matrix = pn4.y;
            pn4Var.g(matrix, an4Var, i3, canvas);
            this.m[i2].g(matrix, an4Var, this.t.c, canvas);
        }
        if (this.D) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.t.i));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.t.i));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, L);
            canvas.translate(iSin, iCos);
        }
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.t.r == null || color2 == (colorForState2 = this.t.r.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.t.n == null || color == (colorForState = this.t.n.getColorForState(iArr, (color = (paint = this.f).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.w = true;
        this.c = true;
        super.onBoundsChange(rect);
        if (!this.t.g.x() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (wu4 wu4Var : this.H) {
            if (wu4Var != null && wu4Var.x) {
                z = true;
                break;
            }
        }
        f(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.t.g.x()) {
            f(iArr, false);
        }
        boolean z = o(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(ColorStateList colorStateList) {
        e33 e33Var = this.t;
        if (e33Var.r != colorStateList) {
            e33Var.r = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean q() {
        e33 e33Var = this.t;
        e33Var.getClass();
        return e33Var.c > 0 && !i() && !this.b.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final int r(int i) {
        int i2;
        e33 e33Var = this.t;
        float f = e33Var.w + 0.0f + e33Var.q;
        zg1 zg1Var = e33Var.y;
        if (zg1Var == null || !zg1Var.g || zj0.n(i, 255) != zg1Var.n) {
            return i;
        }
        float f2 = zg1Var.v;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iH = xq2.h(fMin, zj0.n(i, 255), zg1Var.y);
        if (fMin > 0.0f && (i2 = zg1Var.r) != 0) {
            iH = zj0.y(zj0.n(i2, zg1.x), iH);
        }
        return zj0.n(iH, iAlpha);
    }

    public final void s(float f) {
        e33 e33Var = this.t;
        if (e33Var.w != f) {
            e33Var.w = f;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        e33 e33Var = this.t;
        if (e33Var.m != i) {
            e33Var.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.t.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.sn4
    public final void setShapeAppearanceModel(fn4 fn4Var) {
        this.t.g = fn4Var;
        this.I = null;
        this.J = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.t.v = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        e33 e33Var = this.t;
        if (e33Var.x != mode) {
            e33Var.x = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final fn4 t() {
        return this.t.g.n();
    }

    public final void u(float f) {
        e33 e33Var = this.t;
        if (e33Var.t != f) {
            e33Var.t = f;
            this.w = true;
            this.c = true;
            invalidateSelf();
        }
    }

    public final void v(Canvas canvas, Paint paint, Path path, fn4 fn4Var, float[] fArr, RectF rectF) {
        float fY = y(rectF, fn4Var, fArr);
        if (fY < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fY * this.t.t;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final boolean w() {
        Paint.Style style = this.t.b;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f.getStrokeWidth() > 0.0f;
    }

    public void x(Canvas canvas) {
        fn4 fn4Var = this.F;
        float[] fArr = this.J;
        RectF rectFL = l();
        RectF rectF = this.u;
        rectF.set(rectFL);
        float fA = a();
        rectF.inset(fA, fA);
        v(canvas, this.f, this.s, fn4Var, fArr, rectF);
    }

    public final float y(RectF rectF, fn4 fn4Var, float[] fArr) {
        if (fArr == null) {
            if (fn4Var.a(rectF)) {
                return fn4Var.v.g(rectF);
            }
            return -1.0f;
        }
        if (this.E) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void z() {
        this.k.g(-12303292);
        this.t.getClass();
        super.invalidateSelf();
    }

    public g33(Context context, AttributeSet attributeSet, int i, int i2) {
        this(fn4.l(context, attributeSet, i, i2).g());
    }

    public g33(fn4 fn4Var) {
        this(new e33(fn4Var));
    }

    public g33(dn4 dn4Var) {
        this(new e33(dn4Var));
    }

    public g33() {
        this(new fn4());
    }
}
