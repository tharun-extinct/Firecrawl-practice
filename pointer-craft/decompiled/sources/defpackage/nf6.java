package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nf6 {
    public static final tn1 g;
    public static final tn1[] y;

    static {
        tn1 tn1Var = new tn1("moduleinstall", 7L);
        g = tn1Var;
        y = new tn1[]{tn1Var};
    }

    public static final ii4 g(mf2 mf2Var, o50 o50Var) {
        cy0 cy0VarR = mf2Var.r();
        si0 si0Var = (si0) mf2Var.n;
        boolean z = cy0VarR == cy0.j;
        return new ii4(y(si0Var, z, true, o50Var), y(si0Var, z, false, o50Var), z);
    }

    public static final x0 n(Iterable iterable) {
        iterable.getClass();
        x0 x0Var = iterable instanceof x0 ? (x0) iterable : null;
        if (x0Var != null) {
            return x0Var;
        }
        is3 is3Var = iterable instanceof is3 ? (is3) iterable : null;
        x0 x0VarN = is3Var != null ? is3Var.n() : null;
        if (x0VarN != null) {
            return x0VarN;
        }
        qr4 qr4Var = qr4.t;
        qr4Var.getClass();
        if (!(iterable instanceof Collection)) {
            is3 is3VarY = qr4Var.y();
            hj0.a0(is3VarY, iterable);
            return is3VarY.n();
        }
        Collection collection = (Collection) iterable;
        Object[] objArr = qr4Var.j;
        if (collection.isEmpty()) {
            return qr4Var;
        }
        if (collection.size() + objArr.length > 32) {
            is3 is3VarY2 = qr4Var.y();
            is3VarY2.addAll(collection);
            return is3VarY2.n();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new qr4(objArrCopyOf);
    }

    public static final gi4 r(gi4 gi4Var, si0 si0Var, int i) {
        return new gi4(((j75) si0Var.v).g(i), i, gi4Var.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gi4 v(final mf2 mf2Var, final si0 si0Var, gi4 gi4Var) {
        cy0 cy0Var;
        int i = si0Var.r;
        int i2 = si0Var.y;
        boolean z = mf2Var.y;
        final int i3 = z ? i2 : i;
        j75 j75Var = (j75) si0Var.v;
        int i4 = si0Var.n;
        w80 w80Var = new w80(si0Var, i3, (byte) 1);
        bt2 bt2Var = bt2.t;
        final wp2 wp2VarU = v13.u(bt2Var, w80Var);
        final int i5 = z ? i : i2;
        wp2 wp2VarU2 = v13.u(bt2Var, new my1() { // from class: ji4
            @Override // defpackage.my1
            public final Object g() {
                si0 si0Var2 = si0Var;
                j75 j75Var2 = (j75) si0Var2.v;
                int iIntValue = ((Number) wp2VarU.getValue()).intValue();
                mf2 mf2Var2 = mf2Var;
                boolean z2 = mf2Var2.y;
                boolean z3 = mf2Var2.r() == cy0.j;
                int i6 = i3;
                long jA = j75Var2.a(i6);
                h93 h93Var = j75Var2.y;
                int i7 = u75.r;
                int iL = (int) (jA >> 32);
                int i8 = h93Var.x;
                if (h93Var.n(iL) != iIntValue) {
                    iL = iIntValue >= i8 ? j75Var2.l(i8 - 1) : j75Var2.l(iIntValue);
                }
                int iR = (int) (jA & 4294967295L);
                if (h93Var.n(iR) != iIntValue) {
                    iR = iIntValue >= i8 ? h93Var.r(i8 - 1, false) : h93Var.r(iIntValue, false);
                }
                int i9 = i5;
                if (iL == i9) {
                    return si0Var2.y(iR);
                }
                if (iR == i9) {
                    return si0Var2.y(iL);
                }
                if (!(z2 ^ z3) ? i6 >= iL : i6 > iR) {
                    iL = iR;
                }
                return si0Var2.y(iL);
            }
        });
        if (1 != gi4Var.r) {
            return (gi4) wp2VarU2.getValue();
        }
        if (i3 == i4) {
            return gi4Var;
        }
        if (((Number) wp2VarU.getValue()).intValue() != j75Var.y.n(i4)) {
            return (gi4) wp2VarU2.getValue();
        }
        int i6 = gi4Var.y;
        long jA = j75Var.a(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                cy0 cy0Var2 = cy0.j;
                if (i2 < i) {
                    cy0Var = cy0.t;
                } else {
                    cy0Var = i2 > i ? cy0Var2 : cy0.a;
                }
                if (((z ? 1 : 0) ^ (cy0Var != cy0Var2 ? (byte) 0 : (byte) 1)) == 0) {
                }
            }
            return si0Var.y(i3);
        }
        int i7 = u75.r;
        return (i6 == ((int) (jA >> 32)) || i6 == ((int) (jA & 4294967295L))) ? (gi4) wp2VarU2.getValue() : si0Var.y(i3);
    }

    public static final gi4 y(si0 si0Var, boolean z, boolean z2, o50 o50Var) {
        long j;
        long jY = o50Var.y(z2 ? si0Var.y : si0Var.r, si0Var);
        if (z ^ z2) {
            int i = u75.r;
            j = jY >> 32;
        } else {
            int i2 = u75.r;
            j = 4294967295L & jY;
        }
        return si0Var.y((int) j);
    }
}
