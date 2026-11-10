package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xy2 implements j51 {
    public boolean j;
    public final /* synthetic */ zy2 m;
    public long t = 9223372034707292159L;
    public long a = 0;

    public xy2(zy2 zy2Var) {
        this.m = zy2Var;
    }

    public final bl2 g() {
        this.j = true;
        zy2 zy2Var = this.m;
        bl2 bl2VarZ0 = zy2Var.z0();
        if (je2.y(this.t, 9223372034707292159L)) {
            this.t = k33.Y(bl2VarZ0.g(0L));
            this.a = bl2VarZ0.L();
        }
        zy2Var.E0().N.y();
        return bl2VarZ0;
    }

    public final void r(i72 i72Var, float f) {
        zy2 zy2Var = this.m;
        al alVar = zy2Var.k;
        if (alVar == null) {
            alVar = new al();
            zy2Var.k = alVar;
        }
        int iB0 = pr.b0((i72[]) alVar.y, i72Var);
        if (iB0 >= 0) {
            float[] fArr = (float[]) alVar.r;
            if (fArr[iB0] != f) {
                fArr[iB0] = f;
                ((byte[]) alVar.n)[iB0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) alVar.n;
                if (bArr[iB0] == 2) {
                    bArr[iB0] = 0;
                    return;
                }
                return;
            }
        }
        int i = alVar.g;
        i72[] i72VarArr = (i72[]) alVar.y;
        if (i == i72VarArr.length) {
            int i2 = i * 2;
            alVar.y = (i72[]) Arrays.copyOf(i72VarArr, i2);
            alVar.r = Arrays.copyOf((float[]) alVar.r, i2);
            alVar.n = Arrays.copyOf((byte[]) alVar.n, i2);
        }
        ((i72[]) alVar.y)[i] = i72Var;
        ((byte[]) alVar.n)[i] = 3;
        ((float[]) alVar.r)[i] = f;
        alVar.g++;
    }

    @Override // defpackage.j51
    public final float w() {
        return this.m.w();
    }

    @Override // defpackage.j51
    public final float y() {
        return this.m.y();
    }
}
