package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c60 implements t33 {
    public final k00 g;
    public final boolean y;

    public c60(k00 k00Var, boolean z) {
        this.g = k00Var;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c60)) {
            return false;
        }
        c60 c60Var = (c60) obj;
        return this.g.equals(c60Var.g) && this.y == c60Var.y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + (this.g.hashCode() * 31);
    }

    @Override // defpackage.t33
    public final u33 r(final v33 v33Var, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        qi1 qi1Var = qi1.j;
        if (zIsEmpty) {
            return v33Var.k0(ws0.m(j), ws0.a(j), qi1Var, new l1((byte) 21));
        }
        long j2 = this.y ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final p33 p33Var = (p33) list.get(0);
            p33Var.a();
            final us3 us3VarV = p33Var.v(j2);
            final int iMax = Math.max(ws0.m(j), us3VarV.j);
            final int iMax2 = Math.max(ws0.a(j), us3VarV.t);
            return v33Var.k0(iMax, iMax2, qi1Var, new xy1() { // from class: a60
                @Override // defpackage.xy1
                public final Object a(Object obj) {
                    z50.n((ts3) obj, us3VarV, p33Var, v33Var.getLayoutDirection(), iMax, iMax2, this.g);
                    return og5.g;
                }
            });
        }
        final us3[] us3VarArr = new us3[list.size()];
        final s54 s54Var = new s54();
        s54Var.j = ws0.m(j);
        final s54 s54Var2 = new s54();
        s54Var2.j = ws0.a(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p33 p33Var2 = (p33) list.get(i);
            p33Var2.a();
            us3 us3VarV2 = p33Var2.v(j2);
            us3VarArr[i] = us3VarV2;
            s54Var.j = Math.max(s54Var.j, us3VarV2.j);
            s54Var2.j = Math.max(s54Var2.j, us3VarV2.t);
        }
        return v33Var.k0(s54Var.j, s54Var2.j, qi1Var, new xy1() { // from class: b60
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                ts3 ts3Var = (ts3) obj;
                us3[] us3VarArr2 = us3VarArr;
                int length = us3VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    us3 us3Var = us3VarArr2[i3];
                    us3Var.getClass();
                    z50.n(ts3Var, us3Var, (p33) list.get(i4), v33Var.getLayoutDirection(), s54Var.j, s54Var2.j, this.g);
                    i3++;
                    i2 = i4 + 1;
                }
                return og5.g;
            }
        });
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.g + ", propagateMinConstraints=" + this.y + ")";
    }
}
