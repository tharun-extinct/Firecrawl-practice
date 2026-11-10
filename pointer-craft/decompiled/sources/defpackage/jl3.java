package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jl3 extends bm3 {
    public static final jl3 r = new jl3(1, 0, 2);

    @Override // defpackage.bm3
    public final void g(ti0 ti0Var, mq mqVar, pr4 pr4Var, i64 i64Var, cm3 cm3Var) {
        int[] iArr;
        c02 c02Var;
        int iR;
        int iY = ti0Var.y(0);
        if (pr4Var.c != 0) {
            qo0.g("Cannot move a group while inserting");
        }
        if (iY < 0) {
            qo0.g("Parameter offset is out of bounds");
        }
        if (iY == 0) {
            return;
        }
        int i = pr4Var.z;
        int i2 = pr4Var.o;
        int i3 = pr4Var.h;
        int i4 = i;
        while (true) {
            iArr = pr4Var.y;
            if (iY <= 0) {
                break;
            }
            i4 += iArr[(pr4Var.s(i4) * 5) + 3];
            if (i4 > i3) {
                qo0.g("Parameter offset is out of bounds");
            }
            iY--;
        }
        int i5 = iArr[(pr4Var.s(i4) * 5) + 3];
        int iX = pr4Var.x(pr4Var.y, pr4Var.s(pr4Var.z));
        int iX2 = pr4Var.x(pr4Var.y, pr4Var.s(i4));
        int i6 = i4 + i5;
        int iX3 = pr4Var.x(pr4Var.y, pr4Var.s(i6));
        int i7 = iX3 - iX2;
        pr4Var.f(i7, Math.max(pr4Var.z - 1, 0));
        pr4Var.o(i5);
        int[] iArr2 = pr4Var.y;
        int iS = pr4Var.s(i6) * 5;
        pr.M(pr4Var.s(i) * 5, iS, (i5 * 5) + iS, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = pr4Var.r;
            int iL = pr4Var.l(iX2 + i7);
            System.arraycopy(objArr, iL, objArr, iX, pr4Var.l(iX3 + i7) - iL);
        }
        int i8 = iX2 + i7;
        int i9 = i8 - iX;
        int i10 = pr4Var.m;
        int i11 = pr4Var.q;
        int length = pr4Var.r.length;
        int i12 = pr4Var.w;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iS2 = pr4Var.s(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iS2 * 5) + 4] = pr4.j(pr4.j(pr4Var.x(iArr2, iS2) - i15, i12 < iS2 ? 0 : i10, i11, length), pr4Var.m, pr4Var.q, pr4Var.r.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int i17 = pr4Var.i();
        int iY2 = or4.y(pr4Var.n, i6, i17);
        ArrayList arrayList = new ArrayList();
        if (iY2 >= 0) {
            while (iY2 < pr4Var.n.size() && (iR = pr4Var.r((c02Var = (c02) pr4Var.n.get(iY2)))) >= i6 && iR < i16) {
                arrayList.add(c02Var);
            }
        }
        int i18 = i - i6;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            c02 c02Var2 = (c02) arrayList.get(i19);
            int iR2 = pr4Var.r(c02Var2) + i18;
            if (iR2 >= pr4Var.l) {
                c02Var2.g = -(i17 - iR2);
            } else {
                c02Var2.g = iR2;
            }
            pr4Var.n.add(or4.y(pr4Var.n, iR2, i17), c02Var2);
        }
        if (pr4Var.H(i6, i5)) {
            qo0.g("Unexpectedly removed anchors");
        }
        pr4Var.q(i2, pr4Var.h, i);
        if (i7 > 0) {
            pr4Var.I(i8, i7, i6 - 1);
        }
    }
}
