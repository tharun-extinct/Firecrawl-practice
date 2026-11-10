package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aj5 {
    public static final Matrix b = new Matrix();
    public float a;
    public Boolean c;
    public final Path g;
    public final mr i;
    public float j;
    public final xi5 l;
    public float m;
    public Paint n;
    public int q;
    public final Matrix r;
    public float t;
    public Paint v;
    public String w;
    public PathMeasure x;
    public final Path y;

    public aj5(aj5 aj5Var) {
        this.r = new Matrix();
        this.j = 0.0f;
        this.t = 0.0f;
        this.a = 0.0f;
        this.m = 0.0f;
        this.q = 255;
        this.w = null;
        this.c = null;
        mr mrVar = new mr(0);
        this.i = mrVar;
        this.l = new xi5(aj5Var.l, mrVar);
        this.g = new Path(aj5Var.g);
        this.y = new Path(aj5Var.y);
        this.j = aj5Var.j;
        this.t = aj5Var.t;
        this.a = aj5Var.a;
        this.m = aj5Var.m;
        this.q = aj5Var.q;
        this.w = aj5Var.w;
        String str = aj5Var.w;
        if (str != null) {
            mrVar.put(str, this);
        }
        this.c = aj5Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(xi5 xi5Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = xi5Var.g;
        ArrayList arrayList = xi5Var.y;
        matrix2.set(matrix);
        Matrix matrix3 = xi5Var.g;
        matrix3.preConcat(xi5Var.a);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            yi5 yi5Var = (yi5) arrayList.get(i5);
            if (yi5Var instanceof xi5) {
                g((xi5) yi5Var, matrix3, canvas, i, i2);
            } else {
                if (yi5Var instanceof zi5) {
                    zi5 zi5Var = (zi5) yi5Var;
                    float f2 = i / this.a;
                    float f3 = i2 / this.m;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.r;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.g;
                        zi5Var.n(path);
                        Path path2 = this.y;
                        path2.reset();
                        if (zi5Var.r()) {
                            path2.setFillType(zi5Var.r == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            wi5 wi5Var = (wi5) zi5Var;
                            float f5 = wi5Var.t;
                            if (f5 != 0.0f || wi5Var.a != 1.0f) {
                                float f6 = wi5Var.m;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (wi5Var.a + f6) % 1.0f;
                                PathMeasure pathMeasure = this.x;
                                PathMeasure pathMeasure2 = pathMeasure;
                                if (pathMeasure == null) {
                                    PathMeasure pathMeasure3 = new PathMeasure();
                                    this.x = pathMeasure3;
                                    pathMeasure2 = pathMeasure3;
                                }
                                pathMeasure2.setPath(path, z);
                                float length = this.x.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure4 = this.x;
                                if (f9 > f10) {
                                    pathMeasure4.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.x.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure4.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            bm bmVar = wi5Var.x;
                            float f11 = 255.0f;
                            if (((Shader) bmVar.y) == null && bmVar.g == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.v == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.v = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.v;
                                Shader shader = (Shader) bmVar.y;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(wi5Var.j * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = bmVar.g;
                                    float f12 = wi5Var.j;
                                    PorterDuff.Mode mode = dj5.s;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(wi5Var.r == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            bm bmVar2 = wi5Var.n;
                            if (((Shader) bmVar2.y) != null || bmVar2.g != 0) {
                                if (this.n == null) {
                                    Paint paint3 = new Paint(1);
                                    this.n = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.n;
                                Paint.Join join = wi5Var.w;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = wi5Var.q;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(wi5Var.c);
                                Shader shader2 = (Shader) bmVar2.y;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(wi5Var.l * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = bmVar2.g;
                                    float f13 = wi5Var.l;
                                    PorterDuff.Mode mode2 = dj5.s;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(wi5Var.v * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.q;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.q = i;
    }

    public aj5() {
        this.r = new Matrix();
        this.j = 0.0f;
        this.t = 0.0f;
        this.a = 0.0f;
        this.m = 0.0f;
        this.q = 255;
        this.w = null;
        this.c = null;
        this.i = new mr(0);
        this.l = new xi5();
        this.g = new Path();
        this.y = new Path();
    }
}
