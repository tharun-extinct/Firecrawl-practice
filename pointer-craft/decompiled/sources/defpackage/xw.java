package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object w;

    public /* synthetic */ xw(ox0 ox0Var, da3 da3Var, boolean z, ob3 ob3Var, bz1 bz1Var, ob3 ob3Var2, ob3 ob3Var3) {
        this.a = ox0Var;
        this.m = da3Var;
        this.t = z;
        this.q = ob3Var;
        this.i = bz1Var;
        this.w = ob3Var2;
        this.c = ob3Var3;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.q;
        Object obj7 = this.m;
        Object obj8 = this.a;
        switch (b) {
            case 0:
                ox0 ox0Var = (ox0) obj8;
                da3 da3Var = (da3) obj7;
                final ob3 ob3Var = (ob3) obj6;
                final bz1 bz1Var = (bz1) obj3;
                final ob3 ob3Var2 = (ob3) obj5;
                final ob3 ob3Var3 = (ob3) obj4;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final byte b2 = 0;
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ho1 ho1Var = mq4.r;
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, ho1Var);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    Object objK = h02Var.K();
                    l76 l76Var = oo0.g;
                    if (objK == l76Var) {
                        objK = new ef(ob3Var, (byte) 4);
                        h02Var.i0(objK);
                    }
                    g73 g73Var = g73.g;
                    j73 j73VarI = ue5.I(g73Var, false, null, null, (my1) objK, 15);
                    nm0 nm0VarM0 = ue5.m0(1998294515, new bz1() { // from class: zw
                        @Override // defpackage.bz1
                        public final Object l(Object obj9, Object obj10) {
                            byte b3 = b2;
                            og5 og5Var2 = og5.g;
                            l76 l76Var2 = oo0.g;
                            final ob3 ob3Var4 = ob3Var;
                            final bz1 bz1Var2 = bz1Var;
                            boolean z = false;
                            final byte b4 = 2;
                            final byte b5 = 1;
                            switch (b3) {
                                case 0:
                                    h02 h02Var2 = (h02) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        h02Var2.Q();
                                    } else {
                                        boolean zBooleanValue = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX = h02Var2.x(bz1Var2);
                                        Object objK2 = h02Var2.K();
                                        if (zX || objK2 == l76Var2) {
                                            objK2 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b6 = b4;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b6) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var2.i0(objK2);
                                        }
                                        k05.g(zBooleanValue, (xy1) objK2, null, null, false, null, h02Var2, 0, 124);
                                    }
                                    break;
                                case 1:
                                    h02 h02Var3 = (h02) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        h02Var3.Q();
                                    } else {
                                        boolean zBooleanValue2 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX2 = h02Var3.x(bz1Var2);
                                        Object objK3 = h02Var3.K();
                                        if (zX2 || objK3 == l76Var2) {
                                            final byte b6 = z ? (byte) 1 : (byte) 0;
                                            objK3 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b7 = b6;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b7) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var3.i0(objK3);
                                        }
                                        k05.g(zBooleanValue2, (xy1) objK3, null, null, false, null, h02Var3, 0, 124);
                                    }
                                    break;
                                default:
                                    h02 h02Var4 = (h02) obj9;
                                    int iIntValue4 = ((Integer) obj10).intValue();
                                    if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        h02Var4.Q();
                                    } else {
                                        boolean zBooleanValue3 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX3 = h02Var4.x(bz1Var2);
                                        Object objK4 = h02Var4.K();
                                        if (zX3 || objK4 == l76Var2) {
                                            objK4 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b7 = b5;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b7) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var4.i0(objK4);
                                        }
                                        k05.g(zBooleanValue3, (xy1) objK4, null, null, false, null, h02Var4, 0, 124);
                                    }
                                    break;
                            }
                            return og5Var2;
                        }
                    }, h02Var);
                    vf1 vf1Var = tj0.g;
                    lr2.r(iy5.g, j73VarI, null, null, null, nm0VarM0, jr2.c(((rj0) h02Var.a(vf1Var)).c, h02Var), 0.0f, h02Var, 196614, 412);
                    Object objK2 = h02Var.K();
                    if (objK2 == l76Var) {
                        objK2 = new ef(ob3Var2, (byte) 5);
                        h02Var.i0(objK2);
                    }
                    final byte b3 = 1;
                    lr2.r(iy5.y, ue5.I(g73Var, false, null, null, (my1) objK2, 15), null, null, null, ue5.m0(1777065948, new bz1() { // from class: zw
                        @Override // defpackage.bz1
                        public final Object l(Object obj9, Object obj10) {
                            byte b4 = b3;
                            og5 og5Var2 = og5.g;
                            l76 l76Var2 = oo0.g;
                            final ob3 ob3Var4 = ob3Var2;
                            final bz1 bz1Var2 = bz1Var;
                            boolean z = false;
                            final byte b5 = 2;
                            final byte b6 = 1;
                            switch (b4) {
                                case 0:
                                    h02 h02Var2 = (h02) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        h02Var2.Q();
                                    } else {
                                        boolean zBooleanValue = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX = h02Var2.x(bz1Var2);
                                        Object objK3 = h02Var2.K();
                                        if (zX || objK3 == l76Var2) {
                                            objK3 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b7 = b5;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b7) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var2.i0(objK3);
                                        }
                                        k05.g(zBooleanValue, (xy1) objK3, null, null, false, null, h02Var2, 0, 124);
                                    }
                                    break;
                                case 1:
                                    h02 h02Var3 = (h02) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        h02Var3.Q();
                                    } else {
                                        boolean zBooleanValue2 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX2 = h02Var3.x(bz1Var2);
                                        Object objK4 = h02Var3.K();
                                        if (zX2 || objK4 == l76Var2) {
                                            final byte b7 = z ? (byte) 1 : (byte) 0;
                                            objK4 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b8 = b7;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b8) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var3.i0(objK4);
                                        }
                                        k05.g(zBooleanValue2, (xy1) objK4, null, null, false, null, h02Var3, 0, 124);
                                    }
                                    break;
                                default:
                                    h02 h02Var4 = (h02) obj9;
                                    int iIntValue4 = ((Integer) obj10).intValue();
                                    if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        h02Var4.Q();
                                    } else {
                                        boolean zBooleanValue3 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX3 = h02Var4.x(bz1Var2);
                                        Object objK5 = h02Var4.K();
                                        if (zX3 || objK5 == l76Var2) {
                                            objK5 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b8 = b6;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b8) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var4.i0(objK5);
                                        }
                                        k05.g(zBooleanValue3, (xy1) objK5, null, null, false, null, h02Var4, 0, 124);
                                    }
                                    break;
                            }
                            return og5Var2;
                        }
                    }, h02Var), jr2.c(((rj0) h02Var.a(vf1Var)).c, h02Var), 0.0f, h02Var, 196614, 412);
                    Object objK3 = h02Var.K();
                    if (objK3 == l76Var) {
                        objK3 = new ef(ob3Var3, (byte) 6);
                        h02Var.i0(objK3);
                    }
                    final byte b4 = 2;
                    lr2.r(iy5.r, ue5.I(g73Var, false, null, null, (my1) objK3, 15), null, null, null, ue5.m0(441692219, new bz1() { // from class: zw
                        @Override // defpackage.bz1
                        public final Object l(Object obj9, Object obj10) {
                            byte b5 = b4;
                            og5 og5Var2 = og5.g;
                            l76 l76Var2 = oo0.g;
                            final ob3 ob3Var4 = ob3Var3;
                            final bz1 bz1Var2 = bz1Var;
                            boolean z = false;
                            final byte b6 = 2;
                            final byte b7 = 1;
                            switch (b5) {
                                case 0:
                                    h02 h02Var2 = (h02) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        h02Var2.Q();
                                    } else {
                                        boolean zBooleanValue = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX = h02Var2.x(bz1Var2);
                                        Object objK4 = h02Var2.K();
                                        if (zX || objK4 == l76Var2) {
                                            objK4 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b8 = b6;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b8) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var2.i0(objK4);
                                        }
                                        k05.g(zBooleanValue, (xy1) objK4, null, null, false, null, h02Var2, 0, 124);
                                    }
                                    break;
                                case 1:
                                    h02 h02Var3 = (h02) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        h02Var3.Q();
                                    } else {
                                        boolean zBooleanValue2 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX2 = h02Var3.x(bz1Var2);
                                        Object objK5 = h02Var3.K();
                                        if (zX2 || objK5 == l76Var2) {
                                            final byte b8 = z ? (byte) 1 : (byte) 0;
                                            objK5 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b9 = b8;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b9) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var3.i0(objK5);
                                        }
                                        k05.g(zBooleanValue2, (xy1) objK5, null, null, false, null, h02Var3, 0, 124);
                                    }
                                    break;
                                default:
                                    h02 h02Var4 = (h02) obj9;
                                    int iIntValue4 = ((Integer) obj10).intValue();
                                    if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        h02Var4.Q();
                                    } else {
                                        boolean zBooleanValue3 = ((Boolean) ob3Var4.getValue()).booleanValue();
                                        boolean zX3 = h02Var4.x(bz1Var2);
                                        Object objK6 = h02Var4.K();
                                        if (zX3 || objK6 == l76Var2) {
                                            objK6 = new xy1() { // from class: ww
                                                @Override // defpackage.xy1
                                                public final Object a(Object obj11) {
                                                    byte b9 = b7;
                                                    og5 og5Var3 = og5.g;
                                                    ob3 ob3Var5 = ob3Var4;
                                                    bz1 bz1Var3 = bz1Var2;
                                                    Boolean bool = (Boolean) obj11;
                                                    bool.booleanValue();
                                                    switch (b9) {
                                                        case 0:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_continuous_mode", bool);
                                                            break;
                                                        case 1:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_skip_duplicate", bool);
                                                            break;
                                                        default:
                                                            ob3Var5.setValue(bool);
                                                            bz1Var3.l("scanner_send_enter", bool);
                                                            break;
                                                    }
                                                    return og5Var3;
                                                }
                                            };
                                            h02Var4.i0(objK6);
                                        }
                                        k05.g(zBooleanValue3, (xy1) objK6, null, null, false, null, h02Var4, 0, 124);
                                    }
                                    break;
                            }
                            return og5Var2;
                        }
                    }, h02Var), jr2.c(((rj0) h02Var.a(vf1Var)).c, h02Var), 0.0f, h02Var, 196614, 412);
                    mq2.y(h02Var, new tp2(1.0f, true));
                    boolean zJ = h02Var.j(ox0Var) | h02Var.x(da3Var);
                    Object objK4 = h02Var.K();
                    if (zJ || objK4 == l76Var) {
                        objK4 = new ns(ox0Var, da3Var, b4);
                        h02Var.i0(objK4);
                    }
                    c93.x((my1) objK4, mq4.r(mq4.n(ue5.e0(g73Var, 16.0f), 64.0f), 1.0f), this.t, null, null, null, null, null, iy5.n, h02Var, 805306416, 504);
                    h02Var.b(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ff0.n((my1) obj8, (nm0) obj7, (j73) obj6, this.t, (cn4) obj5, (me0) obj4, (se0) obj3, (h02) obj, aq2.J(49));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ xw(my1 my1Var, nm0 nm0Var, j73 j73Var, boolean z, cn4 cn4Var, me0 me0Var, se0 se0Var, int i) {
        this.a = my1Var;
        this.m = nm0Var;
        this.q = j73Var;
        this.t = z;
        this.w = cn4Var;
        this.c = me0Var;
        this.i = se0Var;
    }
}
