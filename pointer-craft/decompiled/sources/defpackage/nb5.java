package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nb5 extends ph3 {
    public iv4 l;
    public final m70 x;

    public nb5(ng4 ng4Var, cg4 cg4Var, j51 j51Var) {
        super(ng4Var, cg4Var, j51Var);
        this.x = v70.y(Integer.MAX_VALUE, 6, null);
    }

    public static lb5 j(m70 m70Var) {
        lb5 lb5Var = null;
        ck4 ck4VarD = lr2.d(new qh3(new p83(m70Var, (byte) 1), null));
        while (ck4VarD.hasNext()) {
            lb5 lb5VarG = (lb5) ck4VarD.next();
            if (lb5Var != null) {
                lb5VarG = lb5Var.g(lb5VarG);
            }
            lb5Var = lb5VarG;
        }
        return lb5Var;
    }

    public final void l(ox0 ox0Var) {
        if (this.l == null) {
            this.l = m50.T(ox0Var, null, new n10((Object) this, (mu0) null, (byte) 5), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if (r18.y.l(r4, r3) == r9) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.ng4 r19, defpackage.lb5 r20, defpackage.ou0 r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb5.n(ng4, lb5, ou0):java.lang.Object");
    }

    public final boolean v(ju3 ju3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        m70 m70Var;
        ng4 ng4Var;
        qu3 qu3Var = (qu3) cj0.l0(ju3Var.g);
        if (qu3Var != null) {
            List listR = qu3Var.r();
            int size = listR.size();
            int i = 0;
            z3 = false;
            while (true) {
                m70Var = this.x;
                ng4Var = this.g;
                if (i >= size) {
                    break;
                }
                y62 y62Var = (y62) listR.get(i);
                long j = y62Var.n ^ (-9223372034707292160L);
                if (!(ng4Var.a(ng4Var.x(j)) == 0.0f)) {
                    z3 = !(m70Var.z(new lb5(j, y62Var.g, false)) instanceof kd0) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = qu3Var.q ^ (-9223372034707292160L);
            boolean z4 = ju3Var.x == 12;
            if (!(ng4Var.a(ng4Var.x(j2)) == 0.0f) || z4) {
                if (!(m70Var.z(new lb5(j2, qu3Var.y, z4)) instanceof kd0) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.n) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    public final void x(ju3 ju3Var, ku3 ku3Var, long j) {
        int i = ju3Var.x;
        if (i == 10 || i == 11 || i == 12) {
            List list = ju3Var.g;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((qu3) list.get(i2)).q()) {
                    return;
                }
            }
            if (ku3Var == ku3.j && this.n) {
                v(ju3Var);
                ph3.g(ju3Var);
            }
            if (ku3Var == ku3.t && !this.n && v(ju3Var)) {
                ph3.g(ju3Var);
            }
        }
    }
}
