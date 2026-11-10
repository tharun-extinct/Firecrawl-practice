package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class ld {
    public final Path g;
    public Matrix n;
    public float[] r;
    public RectF y;

    public ld(Path path) {
        this.g = path;
    }

    public static void g(ld ldVar, ld ldVar2) {
        Path path = ldVar.g;
        if (ldVar2 instanceof ld) {
            path.addPath(ldVar2.g, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            uo1.u("Unable to obtain android.graphics.Path");
        }
    }

    public static void r(ld ldVar, ha4 ha4Var) {
        RectF rectF = ldVar.y;
        if (rectF == null) {
            rectF = new RectF();
            ldVar.y = rectF;
        }
        float f = ha4Var.g;
        long j = ha4Var.j;
        long j2 = ha4Var.l;
        long j3 = ha4Var.x;
        long j4 = ha4Var.v;
        rectF.set(f, ha4Var.y, ha4Var.r, ha4Var.n);
        float[] fArr = ldVar.r;
        if (fArr == null) {
            fArr = new float[8];
            ldVar.r = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ldVar.g;
        RectF rectF2 = ldVar.y;
        rectF2.getClass();
        float[] fArr2 = ldVar.r;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static void y(ld ldVar, k44 k44Var) {
        float f = k44Var.g;
        float f2 = k44Var.n;
        float f3 = k44Var.r;
        float f4 = k44Var.y;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            nd.y("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = ldVar.y;
        if (rectF == null) {
            rectF = new RectF();
            ldVar.y = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = ldVar.g;
        RectF rectF2 = ldVar.y;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public final void j() {
        this.g.rewind();
    }

    public final void l() {
        this.g.reset();
    }

    public final k44 n() {
        RectF rectF = this.y;
        if (rectF == null) {
            rectF = new RectF();
            this.y = rectF;
        }
        this.g.computeBounds(rectF, true);
        return new k44(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void t(long j) {
        Matrix matrix = this.n;
        if (matrix == null) {
            this.n = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.n;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.n;
        matrix3.getClass();
        this.g.transform(matrix3);
    }

    public final void v(float f, float f2) {
        this.g.lineTo(f, f2);
    }

    public final boolean x(ld ldVar, ld ldVar2, int i) {
        Path.Op op;
        if (lc6.g(i, 0)) {
            op = Path.Op.DIFFERENCE;
        } else if (lc6.g(i, 1)) {
            op = Path.Op.INTERSECT;
        } else if (lc6.g(i, 4)) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = lc6.g(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(ldVar instanceof ld)) {
            uo1.u("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ldVar.g;
        if (ldVar2 instanceof ld) {
            return this.g.op(path, ldVar2.g, op);
        }
        uo1.u("Unable to obtain android.graphics.Path");
        return false;
    }
}
