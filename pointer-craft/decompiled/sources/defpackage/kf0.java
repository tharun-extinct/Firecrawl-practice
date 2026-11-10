package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 extends af1 {
    public float a;
    public final RectF b;
    public boolean c;
    public float i;
    public float j;
    public float l;
    public float m;
    public int q;
    public final Pair s;
    public float t;
    public float w;
    public float x;

    public kf0(qf0 qf0Var) {
        super(qf0Var);
        this.b = new RectF();
        this.s = new Pair(new ze1(), new ze1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af1
    public final void g() {
        int i;
        Path path = this.y;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.v;
        matrix.reset();
        float f = this.t;
        matrix.setScale(f, f);
        path.transform(matrix);
        qf0 qf0Var = this.g;
        boolean zG = qf0Var.g(this.c);
        PathMeasure pathMeasure = this.n;
        if (zG) {
            pathMeasure.setPath(path, false);
            float f2 = this.m;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.c ? qf0Var.a : qf0Var.m)) / 2.0f)) * 2;
            this.a = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < iMax; i4++) {
                ze1 ze1Var = new ze1();
                float f4 = i4;
                pathMeasure.getPosTan(this.a * f4, ze1Var.g, ze1Var.y);
                ze1 ze1Var2 = new ze1();
                float f5 = this.a;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), ze1Var2.g, ze1Var2.y);
                arrayList.add(ze1Var);
                ze1Var2.g(f2 * 2.0f);
                arrayList.add(ze1Var2);
            }
            arrayList.add((ze1) arrayList.get(0));
            ze1 ze1Var3 = (ze1) arrayList.get(0);
            float[] fArr = ze1Var3.g;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                ze1 ze1Var4 = (ze1) arrayList.get(i5);
                float f6 = (this.a / f3) * 0.48f;
                float[] fArr2 = ze1Var3.g;
                float[] fArr3 = ze1Var3.y;
                float[] fArr4 = new float[i];
                float[] fArr5 = new float[i];
                System.arraycopy(fArr2, i2, fArr4, i2, i);
                System.arraycopy(fArr3, i2, fArr5, i2, i);
                new Matrix();
                float[] fArr6 = ze1Var4.g;
                float[] fArr7 = ze1Var4.y;
                float[] fArr8 = new float[i];
                float[] fArr9 = new float[i];
                System.arraycopy(fArr6, i2, fArr8, i2, i);
                System.arraycopy(fArr7, i2, fArr9, i2, i);
                new Matrix();
                char c2 = c;
                float fAtan2 = (float) Math.atan2(fArr5[c], fArr5[i2]);
                double d = fArr4[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = fAtan2;
                fArr4[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr4[c2] = (float) ((Math.sin(d3) * d2) + ((double) fArr4[c2]));
                double d4 = -f6;
                double dAtan2 = (float) Math.atan2(fArr9[c2], fArr9[i6]);
                fArr8[i6] = (float) ((Math.cos(dAtan2) * d4) + ((double) fArr8[i6]));
                float fSin = (float) ((Math.sin(dAtan2) * d4) + ((double) fArr8[c2]));
                fArr8[c2] = fSin;
                float f7 = fArr4[i6];
                float f8 = fArr4[c2];
                float f9 = fArr8[i6];
                float[] fArr10 = ze1Var4.g;
                path.cubicTo(f7, f8, f9, fSin, fArr10[i6], fArr10[c2]);
                i5++;
                ze1Var3 = ze1Var4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final int l() {
        qf0 qf0Var = this.g;
        return (qf0Var.u * 2) + qf0Var.p;
    }

    public final void n(Canvas canvas, Paint paint, ze1 ze1Var, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.x);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.l * fMin) / this.x);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = ze1Var.g;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = ze1Var.y;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void r(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.i < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                r(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                r(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.l / this.t);
        float f9 = f6 - 0.99f;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float fC = xs2.C(1.0f - this.i, 1.0f, f7);
        float fC2 = xs2.C(0.0f, this.i, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.t);
        float degrees3 = ((fC2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.t));
        float f11 = (fC * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        qf0 qf0Var = this.g;
        boolean z2 = qf0Var.g(this.c) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.x);
        float f12 = this.l * 2.0f;
        float f13 = degrees * 2.0f;
        PathMeasure pathMeasure = this.n;
        if (degrees3 < f13) {
            float f14 = degrees3 / f13;
            float f15 = (degrees * f14) + f11;
            ze1 ze1Var = new ze1();
            if (z2) {
                float length = (pathMeasure.getLength() * (f15 / 360.0f)) / 2.0f;
                float f16 = this.j * f3;
                float f17 = this.t;
                if (f17 != this.w || f16 != this.m) {
                    this.m = f16;
                    this.w = f17;
                    g();
                }
                pathMeasure.getPosTan(length, ze1Var.g, ze1Var.y);
            } else {
                ze1Var.r(f15 + 90.0f);
                ze1Var.g(-this.t);
            }
            paint.setStyle(Paint.Style.FILL);
            n(canvas, paint, ze1Var, f12, this.x, f14);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((qf0Var.n && qf0Var.r == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f18 = f11 + degrees;
        float f19 = degrees3 - f13;
        Pair pair = this.s;
        ((ze1) pair.first).y();
        ((ze1) pair.second).y();
        if (z2) {
            float f20 = f18 / 360.0f;
            float f21 = f19 / 360.0f;
            float f22 = this.j * f3;
            int i4 = this.c ? qf0Var.a : qf0Var.m;
            float f23 = this.t;
            if (f23 != this.w || f22 != this.m || i4 != this.q) {
                this.m = f22;
                this.q = i4;
                this.w = f23;
                g();
            }
            Path path = this.r;
            path.rewind();
            float fX = js2.x(f21, 0.0f, 1.0f);
            if (qf0Var.g(this.c)) {
                float f24 = f4 / ((float) ((((double) this.t) * 6.283185307179586d) / ((double) this.a)));
                f20 += f24;
                f5 = 0.0f - (f24 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f25 = f20 % 1.0f;
            float length2 = (pathMeasure.getLength() * f25) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f25 + fX)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            ze1 ze1Var2 = (ze1) pair.first;
            ze1Var2.y();
            pathMeasure.getPosTan(length2, ze1Var2.g, ze1Var2.y);
            ze1 ze1Var3 = (ze1) pair.second;
            ze1Var3.y();
            pathMeasure.getPosTan(length3, ze1Var3.g, ze1Var3.y);
            Matrix matrix = this.v;
            matrix.reset();
            matrix.setRotate(f5);
            ze1Var2.r(f5);
            ze1Var3.r(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((ze1) pair.first).r(f18 + 90.0f);
            ((ze1) pair.first).g(-this.t);
            ((ze1) pair.second).r(f18 + f19 + 90.0f);
            ((ze1) pair.second).g(-this.t);
            float f26 = this.t;
            float f27 = -f26;
            RectF rectF = this.b;
            rectF.set(f27, f27, f26, f26);
            canvas.drawArc(rectF, f18, f19, false, paint);
            canvas2 = canvas;
        }
        if (!(qf0Var.n && qf0Var.r == 0.5f) && this.l > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            n(canvas2, paint, (ze1) pair.first, f12, this.x, 1.0f);
            n(canvas, paint, (ze1) pair.second, f12, this.x, 1.0f);
        }
    }

    public final void v(Canvas canvas, Paint paint, ye1 ye1Var, int i) {
        int iT = xq2.t(ye1Var.r, i);
        canvas.save();
        canvas.rotate(ye1Var.x);
        this.c = ye1Var.l;
        r(canvas, paint, ye1Var.g, ye1Var.y, iT, 0, 0, ye1Var.n, ye1Var.v, true);
        canvas.restore();
    }

    public final void x(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iT = xq2.t(i, i2);
        this.c = false;
        r(canvas, paint, f, f2, iT, i3, i3, 0.0f, 0.0f, false);
    }
}
