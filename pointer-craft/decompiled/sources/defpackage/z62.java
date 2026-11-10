package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z62 {
    public final bl2 g;
    public boolean n;
    public boolean r;
    public boolean v;
    public boolean y;
    public final xa3 x = new xa3();
    public final lh3 l = new lh3();
    public final ma3 j = new ma3(10);

    public z62(bl2 bl2Var) {
        this.g = bl2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    public final void g(long j, List list, boolean z) {
        ma3 ma3Var;
        long[] jArr;
        xg3 xg3Var;
        Object objN;
        Object obj;
        int size = list.size();
        lh3 lh3Var = this.l;
        lh3 lh3Var2 = lh3Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            ma3Var = this.j;
            if (i >= size) {
                break;
            }
            i73 i73Var = (i73) list.get(i);
            if (i73Var.h) {
                i73Var.z = new p2(this, i73Var, (byte) 27);
                if (z2) {
                    rb3 rb3Var = lh3Var2.g;
                    Object[] objArr = rb3Var.j;
                    int i2 = rb3Var.a;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((xg3) obj).r.equals(i73Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    xg3Var = (xg3) obj;
                    if (xg3Var != null) {
                        xg3Var.t = true;
                        xg3Var.n.y(j);
                        if (z) {
                            Object objN2 = ma3Var.n(j);
                            if (objN2 == null) {
                                objN2 = new xa3();
                                ma3Var.l(j, objN2);
                            }
                            ((xa3) objN2).g(xg3Var);
                        }
                    } else {
                        z2 = false;
                        xg3Var = new xg3(i73Var);
                        xg3Var.n.y(j);
                        if (z) {
                            objN = ma3Var.n(j);
                            if (objN == null) {
                                objN = new xa3();
                                ma3Var.l(j, objN);
                            }
                            ((xa3) objN).g(xg3Var);
                        }
                        lh3Var2.g.y(xg3Var);
                    }
                } else {
                    xg3Var = new xg3(i73Var);
                    xg3Var.n.y(j);
                    if (z) {
                        objN = ma3Var.n(j);
                        if (objN == null) {
                            objN = new xa3();
                            ma3Var.l(j, objN);
                        }
                        ((xa3) objN).g(xg3Var);
                    }
                    lh3Var2.g.y(xg3Var);
                }
                lh3Var2 = xg3Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = ma3Var.y;
            Object[] objArr2 = ma3Var.r;
            long[] jArr3 = ma3Var.g;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                xa3 xa3Var = (xa3) objArr2[i8];
                                rb3 rb3Var2 = lh3Var.g;
                                Object[] objArr3 = rb3Var2.j;
                                int i9 = rb3Var2.a;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((xg3) objArr3[i10]).x(j3, xa3Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        ma3Var.g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(i73 i73Var) {
        if (this.y) {
            this.v = true;
            this.x.g(i73Var);
            return;
        }
        lh3 lh3Var = this.l;
        xa3 xa3Var = lh3Var.y;
        xa3Var.n();
        xa3Var.g(lh3Var);
        while (xa3Var.a()) {
            lh3 lh3Var2 = (lh3) xa3Var.q(xa3Var.y - 1);
            int i = 0;
            while (true) {
                rb3 rb3Var = lh3Var2.g;
                if (i < rb3Var.a) {
                    xg3 xg3Var = (xg3) rb3Var.j[i];
                    if (xg3Var.r.equals(i73Var)) {
                        lh3Var2.g.q(xg3Var);
                        xg3Var.r();
                    } else {
                        xa3Var.g(xg3Var);
                        i++;
                    }
                }
            }
        }
    }

    public final void r() {
        if (this.y) {
            this.r = true;
            return;
        }
        lh3 lh3Var = this.l;
        rb3 rb3Var = lh3Var.g;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            ((xg3) objArr[i2]).r();
        }
        if (this.n) {
            this.n = true;
        } else {
            lh3Var.g.j();
        }
    }

    public final boolean y(mf2 mf2Var, boolean z) {
        lh3 lh3Var = this.l;
        rb3 rb3Var = lh3Var.g;
        if (!lh3Var.g(mf2Var.y(), this.g, mf2Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.y = true;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((xg3) objArr[i2]).v(mf2Var, z) || z3;
        }
        Object[] objArr2 = rb3Var.j;
        int i3 = rb3Var.a;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((xg3) objArr2[i4]).n(mf2Var) || z4;
        }
        lh3Var.y(mf2Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.y = false;
        if (this.v) {
            this.v = false;
            xa3 xa3Var = this.x;
            int i5 = xa3Var.y;
            for (int i6 = 0; i6 < i5; i6++) {
                n((i73) xa3Var.l(i6));
            }
            xa3Var.n();
        }
        if (this.r) {
            this.r = false;
            r();
        }
        if (this.n) {
            this.n = false;
            lh3Var.g.j();
        }
        return z2;
    }
}
