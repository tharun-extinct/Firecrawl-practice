package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rb6 {
    public static ha2 g;

    public static final boolean a(cu1 cu1Var, bc bcVar) {
        Object[] objArr = new cu1[16];
        if (!cu1Var.j.h) {
            mc2.y("visitChildren called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var = cu1Var.j;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 == null) {
            k33.o(rb3Var, i73Var);
        } else {
            rb3Var.y(i73Var2);
        }
        int i = 0;
        while (true) {
            int i2 = rb3Var.a;
            if (i2 == 0) {
                break;
            }
            i73 i73VarQ = (i73) rb3Var.w(i2 - 1);
            if ((i73VarQ.m & 1024) == 0) {
                k33.o(rb3Var, i73VarQ);
            } else {
                while (i73VarQ != null) {
                    if ((i73VarQ.a & 1024) != 0) {
                        rb3 rb3Var2 = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = cu1Var2;
                                i = i3;
                            } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                int i4 = 0;
                                for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                    if ((i73Var3.a & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            i73VarQ = i73Var3;
                                        } else {
                                            if (rb3Var2 == null) {
                                                rb3Var2 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var2.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var2.y(i73Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var2);
                        }
                        break;
                    }
                    i73VarQ = i73VarQ.w;
                }
            }
        }
        Arrays.sort(objArr, 0, i, fu1.y);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                cu1 cu1Var3 = (cu1) objArr[i5];
                if (og0.C(cu1Var3) && g(cu1Var3, bcVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean g(cu1 cu1Var, bc bcVar) {
        int iOrdinal = cu1Var.V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (cu1VarK == null) {
                    l0.z("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = cu1VarK.V0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (g(cu1VarK, bcVar) || v(cu1Var, cu1VarK, 2, bcVar) || (cu1VarK.S0().g && ((Boolean) bcVar.a(cu1VarK)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            up.y();
                            return false;
                        }
                        l0.z("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return v(cu1Var, cu1VarK, 2, bcVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    up.y();
                    return false;
                }
                if (!a(cu1Var, bcVar)) {
                    if (!(cu1Var.S0().g ? ((Boolean) bcVar.a(cu1Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return a(cu1Var, bcVar);
    }

    public static int j(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int l(int i) {
        return i & 7;
    }

    public static final boolean m(cu1 cu1Var, bc bcVar) {
        Object[] objArr = new cu1[16];
        if (!cu1Var.j.h) {
            mc2.y("visitChildren called on an unattached node");
        }
        rb3 rb3Var = new rb3(new i73[16]);
        i73 i73Var = cu1Var.j;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 == null) {
            k33.o(rb3Var, i73Var);
        } else {
            rb3Var.y(i73Var2);
        }
        int i = 0;
        while (true) {
            int i2 = rb3Var.a;
            if (i2 == 0) {
                break;
            }
            i73 i73VarQ = (i73) rb3Var.w(i2 - 1);
            if ((i73VarQ.m & 1024) == 0) {
                k33.o(rb3Var, i73VarQ);
            } else {
                while (i73VarQ != null) {
                    if ((i73VarQ.a & 1024) != 0) {
                        rb3 rb3Var2 = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = cu1Var2;
                                i = i3;
                            } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                int i4 = 0;
                                for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                    if ((i73Var3.a & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            i73VarQ = i73Var3;
                                        } else {
                                            if (rb3Var2 == null) {
                                                rb3Var2 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var2.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var2.y(i73Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var2);
                        }
                        break;
                    }
                    i73VarQ = i73VarQ.w;
                }
            }
        }
        Arrays.sort(objArr, 0, i, fu1.y);
        for (int i5 = 0; i5 < i; i5++) {
            cu1 cu1Var3 = (cu1) objArr[i5];
            if (og0.C(cu1Var3) && n(cu1Var3, bcVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(cu1 cu1Var, bc bcVar) {
        int iOrdinal = cu1Var.V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (cu1VarK != null) {
                    return n(cu1VarK, bcVar) || v(cu1Var, cu1VarK, 1, bcVar);
                }
                l0.z("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return cu1Var.S0().g ? ((Boolean) bcVar.a(cu1Var)).booleanValue() : m(cu1Var, bcVar);
                }
                up.y();
                return false;
            }
        }
        return m(cu1Var, bcVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
  0x0138: PHI (r13v12 i73) = (r13v7 i73), (r13v13 i73) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean q(cu1 cu1Var, cu1 cu1Var2, int i, bc bcVar) {
        i73 i73Var;
        i73 i73Var2;
        um2 um2VarV;
        ah3 ah3Var;
        i73 i73VarQ;
        rb3 rb3Var;
        if (cu1Var.V0() != xt1.t) {
            l0.z("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new cu1[16];
        if (!cu1Var.j.h) {
            mc2.y("visitChildren called on an unattached node");
        }
        rb3 rb3Var2 = new rb3(new i73[16]);
        i73 i73Var3 = cu1Var.j;
        i73 i73Var4 = i73Var3.w;
        if (i73Var4 == null) {
            k33.o(rb3Var2, i73Var3);
        } else {
            rb3Var2.y(i73Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = rb3Var2.a;
            i73Var = null;
            if (i3 == 0) {
                break;
            }
            i73 i73VarQ2 = (i73) rb3Var2.w(i3 - 1);
            if ((i73VarQ2.m & 1024) == 0) {
                k33.o(rb3Var2, i73VarQ2);
            } else {
                while (i73VarQ2 != null) {
                    if ((i73VarQ2.a & 1024) != 0) {
                        rb3 rb3Var3 = null;
                        while (i73VarQ2 != null) {
                            if (i73VarQ2 instanceof cu1) {
                                cu1 cu1Var3 = (cu1) i73VarQ2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = cu1Var3;
                                i2 = i4;
                            } else if ((i73VarQ2.a & 1024) != 0 && (i73VarQ2 instanceof p41)) {
                                int i5 = 0;
                                for (i73 i73Var5 = ((p41) i73VarQ2).f; i73Var5 != null; i73Var5 = i73Var5.w) {
                                    if ((i73Var5.a & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i73VarQ2 = i73Var5;
                                        } else {
                                            if (rb3Var3 == null) {
                                                rb3Var3 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ2 != null) {
                                                rb3Var3.y(i73VarQ2);
                                                i73VarQ2 = null;
                                            }
                                            rb3Var3.y(i73Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i73VarQ2 = k33.Q(rb3Var3);
                        }
                        break;
                    }
                    i73VarQ2 = i73VarQ2.w;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, fu1.y);
        if (i != 1) {
            if (i != 2) {
                l0.z("This function should only be used for 1-D focus search");
                return false;
            }
            me2 me2VarK = xs2.K(0, i2);
            int i6 = me2VarK.j;
            int i7 = me2VarK.t;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        cu1 cu1Var4 = (cu1) objArr[i7];
                        if (og0.C(cu1Var4) && g(cu1Var4, bcVar)) {
                            return true;
                        }
                    }
                    if (yf2.p(objArr[i7], cu1Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!cu1Var.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73Var2 = cu1Var.j.q;
                um2VarV = k33.V(cu1Var);
                loop5: while (um2VarV != null) {
                    if ((um2VarV.M.x.m & 1024) != 0) {
                        while (i73Var2 != null) {
                            if ((i73Var2.a & 1024) != 0) {
                                i73VarQ = i73Var2;
                                rb3Var = null;
                                while (i73VarQ != null) {
                                    if (i73VarQ instanceof cu1) {
                                        i73Var = i73VarQ;
                                        break loop5;
                                    }
                                    if ((i73VarQ.a & 1024) == 0) {
                                    }
                                    i73VarQ = k33.Q(rb3Var);
                                }
                            }
                            i73Var2 = i73Var2.q;
                        }
                    }
                    um2VarV = um2VarV.o();
                    if (um2VarV != null) {
                    }
                }
                if (i73Var != null) {
                    return ((Boolean) bcVar.a(cu1Var)).booleanValue();
                }
            }
            return false;
        }
        me2 me2VarK2 = xs2.K(0, i2);
        int i8 = me2VarK2.j;
        int i9 = me2VarK2.t;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    cu1 cu1Var5 = (cu1) objArr[i8];
                    if (og0.C(cu1Var5) && n(cu1Var5, bcVar)) {
                        return true;
                    }
                }
                if (yf2.p(objArr[i8], cu1Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && cu1Var.S0().g) {
            if (!cu1Var.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73Var2 = cu1Var.j.q;
            um2VarV = k33.V(cu1Var);
            loop5: while (um2VarV != null) {
                if ((um2VarV.M.x.m & 1024) != 0) {
                    while (i73Var2 != null) {
                        if ((i73Var2.a & 1024) != 0) {
                            i73VarQ = i73Var2;
                            rb3Var = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof cu1) {
                                    i73Var = i73VarQ;
                                    break loop5;
                                }
                                if ((i73VarQ.a & 1024) == 0 && (i73VarQ instanceof p41)) {
                                    int i10 = 0;
                                    for (i73 i73Var6 = ((p41) i73VarQ).f; i73Var6 != null; i73Var6 = i73Var6.w) {
                                        if ((i73Var6.a & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                i73VarQ = i73Var6;
                                            } else {
                                                if (rb3Var == null) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var.y(i73Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var);
                            }
                        }
                        i73Var2 = i73Var2.q;
                    }
                }
                um2VarV = um2VarV.o();
                i73Var2 = (um2VarV != null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
            }
            if (i73Var != null) {
                return ((Boolean) bcVar.a(cu1Var)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean t(cu1 cu1Var, int i, bc bcVar) {
        if (i == 1) {
            return n(cu1Var, bcVar);
        }
        if (i == 2) {
            return g(cu1Var, bcVar);
        }
        l0.z("This function should only be used for 1-D focus search");
        return false;
    }

    public static final boolean v(final cu1 cu1Var, final cu1 cu1Var2, final int i, final bc bcVar) {
        if (q(cu1Var, cu1Var2, i, bcVar)) {
            return true;
        }
        final cu1 cu1VarX = ((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).x();
        Boolean bool = (Boolean) ra.O(cu1Var, i, new xy1() { // from class: ok3
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                f00 f00Var = (f00) obj;
                cu1 cu1Var3 = cu1Var;
                if (cu1VarX != ((nt1) ((ba) k33.W(cu1Var3)).getFocusOwner()).x()) {
                    return Boolean.TRUE;
                }
                boolean zQ = rb6.q(cu1Var3, cu1Var2, i, bcVar);
                Boolean boolValueOf = Boolean.valueOf(zQ);
                if (zQ || !f00Var.g()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int x(int i) {
        return i >>> 3;
    }

    public static final j73 y(j73 j73Var, boolean z, ja3 ja3Var) {
        return j73Var.n(z ? new gu1(ja3Var) : g73.g);
    }
}
