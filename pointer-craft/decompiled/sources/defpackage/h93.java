package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h93 {
    public final rv g;
    public final ArrayList j;
    public final ArrayList l;
    public final float n;
    public final boolean r;
    public final float v;
    public final int x;
    public final int y;

    public h93(rv rvVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iJ;
        int i5;
        this.g = rvVar;
        this.y = i;
        if (ws0.m(j) != 0 || ws0.a(j) != 0) {
            nc2.g("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) rvVar.q;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            ip3 ip3Var = (ip3) arrayList2.get(i6);
            kd kdVar = ip3Var.g;
            int iT = ws0.t(j);
            if (ws0.n(j)) {
                i4 = i6;
                iJ = ws0.j(j) - ((int) Math.ceil(f));
                if (iJ < 0) {
                    iJ = 0;
                }
            } else {
                i4 = i6;
                iJ = ws0.j(j);
            }
            i3 = 0;
            gd gdVar = new gd(kdVar, this.y - i7, i2, zs0.y(0, iT, 0, iJ, 5));
            float f2 = gdVar.x + f;
            h75 h75Var = gdVar.n;
            int i8 = i7 + h75Var.l;
            arrayList.add(new hp3(gdVar, ip3Var.y, ip3Var.r, i7, i8, f, f2));
            if (!h75Var.n) {
                if (i8 == this.y) {
                    i5 = i4;
                    if (i5 != pw5.u((ArrayList) this.g.q)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        this.v = f;
        this.x = i7;
        this.r = z;
        this.j = arrayList;
        this.n = ws0.t(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            hp3 hp3Var = (hp3) arrayList.get(i9);
            List list = hp3Var.g.l;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                k44 k44Var = (k44) list.get(i10);
                arrayList4.add(k44Var != null ? hp3Var.g(k44Var) : null);
            }
            hj0.a0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.g.t).size()) {
            int size4 = ((List) this.g.t).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = cj0.w0(arrayList3, arrayList5);
        }
        this.l = arrayList3;
    }

    public final void a(int i) {
        cj cjVar = (cj) this.g.j;
        if (i < 0 || i >= cjVar.t.length()) {
            nc2.g("offset(" + i + ") is out of bounds [0, " + cjVar.t.length() + ")");
        }
    }

    public final void g(long j, float[] fArr) {
        a(u75.x(j));
        m(u75.v(j));
        s54 s54Var = new s54();
        s54Var.j = 0;
        xs2.u(this.j, j, new w40(j, fArr, s54Var, new r54()));
    }

    public final long j(k44 k44Var, int i, up upVar) {
        long jY;
        long j;
        float f = k44Var.y;
        ArrayList arrayList = this.j;
        int iP = xs2.p(arrayList, f);
        float f2 = ((hp3) arrayList.get(iP)).l;
        float f3 = k44Var.n;
        if (f2 >= f3 || iP == arrayList.size() - 1) {
            hp3 hp3Var = (hp3) arrayList.get(iP);
            return hp3Var.y(hp3Var.g.y(hp3Var.r(k44Var), i, upVar), true);
        }
        int iP2 = xs2.p(arrayList, f3);
        long jY2 = u75.y;
        while (true) {
            jY = u75.y;
            if (!u75.y(jY2, jY) || iP > iP2) {
                break;
            }
            hp3 hp3Var2 = (hp3) arrayList.get(iP);
            jY2 = hp3Var2.y(hp3Var2.g.y(hp3Var2.r(k44Var), i, upVar), true);
            iP++;
        }
        if (u75.y(jY2, jY)) {
            return jY;
        }
        while (true) {
            j = u75.y;
            if (!u75.y(jY, j) || iP > iP2) {
                break;
            }
            hp3 hp3Var3 = (hp3) arrayList.get(iP2);
            jY = hp3Var3.y(hp3Var3.g.y(hp3Var3.r(k44Var), i, upVar), true);
            iP2--;
        }
        return u75.y(jY, j) ? jY2 : sp2.y((int) (jY2 >> 32), (int) (4294967295L & jY));
    }

    public final int l(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.j;
        hp3 hp3Var = (hp3) arrayList.get(xs2.p(arrayList, fIntBitsToFloat));
        int i2 = hp3Var.r;
        int i3 = hp3Var.y;
        if (i2 - i3 == 0) {
            return i3;
        }
        gd gdVar = hp3Var.g;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - hp3Var.x;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        h75 h75Var = gdVar.n;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = h75Var.x;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - h75Var.j);
        if (lineForVertical >= h75Var.l) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (h75Var.y(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final void m(int i) {
        cj cjVar = (cj) this.g.j;
        if (i < 0 || i > cjVar.t.length()) {
            nc2.g("offset(" + i + ") is out of bounds [0, " + cjVar.t.length() + "]");
        }
    }

    public final int n(int i) {
        int iB;
        int length = ((cj) this.g.j).t.length();
        ArrayList arrayList = this.j;
        if (i >= length) {
            iB = arrayList.size() - 1;
        } else {
            iB = i < 0 ? 0 : xs2.b(i, arrayList);
        }
        hp3 hp3Var = (hp3) arrayList.get(iB);
        return hp3Var.g.n.x(hp3Var.n(i)) + hp3Var.n;
    }

    public final void q(int i) {
        boolean z = false;
        int i2 = this.x;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        nc2.g("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }

    public final int r(int i, boolean z) {
        int iV;
        q(i);
        ArrayList arrayList = this.j;
        hp3 hp3Var = (hp3) arrayList.get(xs2.s(i, arrayList));
        gd gdVar = hp3Var.g;
        int i2 = i - hp3Var.n;
        h75 h75Var = gdVar.n;
        if (z) {
            Layout layout = h75Var.x;
            ThreadLocal threadLocal = l75.g;
            if (layout.getEllipsisCount(i2) <= 0 || h75Var.y != TextUtils.TruncateAt.END) {
                iV = h75Var.r().v(i2);
            } else {
                iV = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iV = h75Var.v(i2);
        }
        return iV + hp3Var.y;
    }

    public final void t(nb0 nb0Var, long j, ym4 ym4Var, l45 l45Var, yd1 yd1Var) {
        nb0Var.q();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hp3 hp3Var = (hp3) arrayList.get(i);
            hp3Var.g.v(nb0Var, j, ym4Var, l45Var, yd1Var);
            nb0Var.l(0.0f, hp3Var.g.x);
        }
        nb0Var.t();
    }

    public final int v(float f) {
        int lineForVertical;
        ArrayList arrayList = this.j;
        hp3 hp3Var = (hp3) arrayList.get(xs2.p(arrayList, f));
        int i = hp3Var.r - hp3Var.y;
        int i2 = hp3Var.n;
        if (i == 0) {
            return i2;
        }
        gd gdVar = hp3Var.g;
        float f2 = f - hp3Var.x;
        h75 h75Var = gdVar.n;
        int i3 = (int) (f2 - 0.0f);
        int i4 = h75Var.l;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = h75Var.x.getLineForVertical(i3 - h75Var.j);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float x(int i) {
        q(i);
        ArrayList arrayList = this.j;
        hp3 hp3Var = (hp3) arrayList.get(xs2.s(i, arrayList));
        gd gdVar = hp3Var.g;
        return gdVar.n.j(i - hp3Var.n) + hp3Var.x;
    }

    public final float y(int i) {
        q(i);
        ArrayList arrayList = this.j;
        hp3 hp3Var = (hp3) arrayList.get(xs2.s(i, arrayList));
        gd gdVar = hp3Var.g;
        return gdVar.n.n(i - hp3Var.n) + hp3Var.x;
    }
}
