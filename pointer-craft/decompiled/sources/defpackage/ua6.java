package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ua6 {
    public static final void g(qr0 qr0Var, wm4 wm4Var, p04 p04Var, h02 h02Var, int i) {
        qr0Var.getClass();
        wm4Var.getClass();
        h02Var.Z(-647069197);
        int i2 = i | (h02Var.j(qr0Var) ? 4 : 2) | (h02Var.j(wm4Var) ? 32 : 16) | (h02Var.j(p04Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = k33.E(h02Var);
                h02Var.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            int i3 = i2 & 14;
            boolean zX = h02Var.x(ox0Var) | (i3 == 4 || h02Var.x(qr0Var));
            Object objK2 = h02Var.K();
            if (zX || objK2 == obj) {
                objK2 = new sv0(ox0Var, qr0Var, new h((Object) wm4Var, (byte) 15));
                h02Var.i0(objK2);
            }
            sv0 sv0Var = (sv0) objK2;
            ob3 ob3VarJ = v13.j(wm4Var.l, h02Var);
            ql4 ql4Var = (ql4) ob3VarJ.getValue();
            boolean zJ = h02Var.j(sv0Var) | h02Var.x(ob3VarJ);
            Object objK3 = h02Var.K();
            mu0 mu0Var = null;
            if (zJ || objK3 == obj) {
                objK3 = new mt((Object) sv0Var, (Object) ob3VarJ, mu0Var, (byte) 6);
                h02Var.i0(objK3);
            }
            k33.b((bz1) objK3, h02Var, ql4Var);
            ob3 ob3VarJ2 = v13.j(wm4Var.b, h02Var);
            if (((Boolean) ob3VarJ2.getValue()).booleanValue()) {
                h02Var.X(-1024522746);
                Object obj2 = (gu2) h02Var.a(ix2.g);
                boolean zJ2 = ((i2 & 112) == 32 || h02Var.j(wm4Var)) | h02Var.j(obj2) | (i3 == 4 || h02Var.j(qr0Var));
                Object objK4 = h02Var.K();
                if (zJ2 || objK4 == obj) {
                    Object cVar = new c(wm4Var, obj2, qr0Var, mu0Var, (byte) 19);
                    h02Var.i0(cVar);
                    objK4 = cVar;
                }
                k33.b((bz1) objK4, h02Var, og5.g);
                h02Var.b(false);
            } else {
                h02Var.X(-1024175825);
                h02Var.b(false);
            }
            y(mq4.r, sv0Var, ue5.m0(2143224780, new cv0(ob3VarJ, p04Var, sv0Var, ob3VarJ2), h02Var), h02Var, 454);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) qr0Var, (Object) wm4Var, (Object) p04Var, i, (byte) 10);
        }
    }

    public static final void j(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            mc2.g("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fX = x(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fX);
                }
            }
            float fSqrt = (float) Math.sqrt(x(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : x(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fX2 = x(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fX2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fX2 / fArr11[i14];
        }
    }

    public static a63 l(a63 a63Var, fl2 fl2Var, k85 k85Var, j51 j51Var, ku1 ku1Var) {
        if (a63Var != null && fl2Var == a63Var.g && v13.D(k85Var, fl2Var).equals(a63Var.y) && j51Var.y() == a63Var.r.j && ku1Var == a63Var.n) {
            return a63Var;
        }
        a63 a63Var2 = a63.j;
        if (a63Var2 != null && fl2Var == a63Var2.g && v13.D(k85Var, fl2Var).equals(a63Var2.y) && j51Var.y() == a63Var2.r.j && ku1Var == a63Var2.n) {
            return a63Var2;
        }
        a63 a63Var3 = new a63(fl2Var, v13.D(k85Var, fl2Var), new m51(j51Var.y(), j51Var.w()), ku1Var);
        a63.j = a63Var3;
        return a63Var3;
    }

    public static final mz1 n(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("milliseconds", j);
        return new mz1(oz1.m, bundle);
    }

    public static final void r(s25 s25Var, qu3 qu3Var) {
        lz2 lz2Var = (lz2) s25Var.j;
        xj5 xj5Var = (xj5) lz2Var.r;
        xj5 xj5Var2 = (xj5) lz2Var.y;
        boolean zY = fd6.y(qu3Var);
        long j = qu3Var.y;
        if (zY) {
            xj5Var2.n();
            xj5Var.n();
            lz2Var.g = 0L;
        }
        if (!fd6.n(qu3Var)) {
            List listR = qu3Var.r();
            int size = listR.size();
            for (int i = 0; i < size; i++) {
                y62 y62Var = (y62) listR.get(i);
                lz2Var.g(y62Var.g, wi3.v(y62Var.v, 0L));
            }
            lz2Var.g(j, wi3.v(qu3Var.c, 0L));
        }
        if (fd6.n(qu3Var) && j - lz2Var.g > 40) {
            xj5Var2.n();
            xj5Var.n();
            lz2Var.g = 0L;
        }
        lz2Var.g = j;
    }

    public static final Bundle v(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("functionCalls", new ArrayList<>(arrayList));
        return bundle;
    }

    public static final float x(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void y(j73 j73Var, sv0 sv0Var, nm0 nm0Var, h02 h02Var, int i) {
        sv0Var.getClass();
        h02Var.Z(52816259);
        byte b = 16;
        int i2 = (h02Var.j(sv0Var) ? 32 : 16) | i;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new rt1();
                h02Var.i0(objK);
            }
            rt1 rt1Var = (rt1) objK;
            Object objK2 = h02Var.K();
            mu0 mu0Var = null;
            if (objK2 == l76Var) {
                objK2 = new dy((Object) rt1Var, mu0Var, (byte) 6);
                h02Var.i0(objK2);
            }
            k33.b((bz1) objK2, h02Var, rt1Var);
            j73 j73VarG = qb6.g(g73.g, rt1Var);
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new wm0(b);
                h02Var.i0(objK3);
            }
            j73 j73VarY = rb6.y(lb6.y(j73VarG, (xy1) objK3), true, null);
            int i3 = (i2 & 112) | 64;
            boolean z = (((i3 & 112) ^ 48) > 32 && h02Var.j(sv0Var)) || (i3 & 48) == 32;
            Object objK4 = h02Var.K();
            if (z || objK4 == l76Var) {
                objK4 = new ce(sv0Var, (byte) 3);
                h02Var.i0(objK4);
            }
            j73 j73VarN = ic6.r(j73VarY, (xy1) objK4).n(j73Var);
            t33 t33VarR = z50.r(hi0.w, false);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarN);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            nm0Var.x(e60.g, h02Var, 54);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) j73Var, (Object) sv0Var, (Object) nm0Var, i, (byte) 11);
        }
    }
}
