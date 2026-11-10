package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rz extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new rz((ew4) obj3, (ya5) obj2, mu0Var, (byte) 0);
            case 1:
                return new rz((qr0) obj3, (String) obj2, mu0Var, (byte) 1);
            case 2:
                return new rz((yv0) this.c, (String) obj3, (Integer) obj2, mu0Var, (byte) 2);
            case 3:
                return new rz((ss2) this.c, (ik1) obj3, (ft0) obj2, mu0Var, (byte) 3);
            case 4:
                rz rzVar = new rz((dh2) obj3, (bz1) obj2, mu0Var, (byte) 4);
                rzVar.c = obj;
                return rzVar;
            default:
                return new rz((k45) obj3, (e45) obj2, mu0Var, (byte) 5);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((rz) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0212  */
    /* JADX WARN: Code duplicated, block: B:123:0x021e  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        g61 g61Var;
        Object objE;
        g61 g61Var2;
        Object value;
        ox0 ox0Var;
        v55 v55Var;
        byte b = this.q;
        byte b2 = 3;
        Object obj2 = this.b;
        px0 px0Var = px0.j;
        Object obj3 = this.i;
        og5 og5Var = og5.g;
        byte b3 = 2;
        byte b4 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                ew4 ew4Var = (ew4) obj3;
                ya5 ya5Var = (ya5) obj2;
                byte b5 = this.w;
                try {
                    if (b5 != 0) {
                        if (b5 == 1) {
                            js2.o(obj);
                        } else {
                            if (b5 != 2) {
                                if (b5 != 3) {
                                    l0.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Throwable th = (Throwable) this.c;
                                js2.o(obj);
                                throw th;
                            }
                            js2.o(obj);
                        }
                        return og5Var;
                    }
                    js2.o(obj);
                    Boolean bool = Boolean.TRUE;
                    ew4Var.getClass();
                    ew4Var.m(null, bool);
                    ub3 ub3Var = ub3.a;
                    this.w = (byte) 1;
                    if (ya5Var.y(ub3Var, this) == px0Var) {
                        return px0Var;
                    }
                    if (ya5Var.isVisible()) {
                        pz pzVar = new pz(ya5Var, mu0Var, b4);
                        this.w = (byte) 2;
                        if (k33.A(ew4Var, pzVar, this) == px0Var) {
                            return px0Var;
                        }
                    }
                    return og5Var;
                } catch (Throwable th2) {
                    if (!ya5Var.isVisible()) {
                        throw th2;
                    }
                    pz pzVar2 = new pz(ya5Var, mu0Var, b4);
                    this.c = th2;
                    this.w = (byte) 3;
                    if (k33.A(ew4Var, pzVar2, this) == px0Var) {
                        return px0Var;
                    }
                    throw th2;
                }
            case 1:
                String str = (String) obj2;
                qr0 qr0Var = (qr0) obj3;
                ew4 ew4Var2 = qr0Var.e;
                byte b6 = 6;
                switch (this.w) {
                    case 0:
                        js2.o(obj);
                        this.w = (byte) 1;
                        if (yf2.e(200L, this) == px0Var) {
                            return px0Var;
                        }
                        g61Var = (g61) qr0Var.m.j.getValue();
                        if (g61Var == null && g61Var.l()) {
                            this.w = (byte) 2;
                            if (qr0Var.s(str, null, this) == px0Var) {
                                return px0Var;
                            }
                        } else {
                            ew4Var2.getClass();
                            ew4Var2.m(null, d85.g);
                            fr0 fr0Var = new fr0(qr0Var, mu0Var, b6);
                            this.w = (byte) 3;
                            objE = br2.E(10000L, fr0Var, this);
                            if (objE == px0Var) {
                                return px0Var;
                            }
                            g61Var2 = (g61) objE;
                            this.c = g61Var2;
                            this.w = (byte) 4;
                            if (yf2.e(500L, this) == px0Var) {
                                return px0Var;
                            }
                            ew4Var2.a(null);
                            if (g61Var2 != null) {
                                this.c = null;
                                this.w = (byte) 5;
                                if (qr0Var.s(str, null, this) == px0Var) {
                                    return px0Var;
                                }
                            } else {
                                String string = qr0Var.y.getString(R.string.message_connection_timeout);
                                string.getClass();
                                qr0Var.p(string, false);
                                this.c = null;
                                this.w = (byte) 6;
                                if (yf2.e(3000L, this) == px0Var) {
                                    return px0Var;
                                }
                                qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                            }
                        }
                        return og5Var;
                    case 1:
                        js2.o(obj);
                        g61Var = (g61) qr0Var.m.j.getValue();
                        if (g61Var == null) {
                            break;
                        }
                        ew4Var2.getClass();
                        ew4Var2.m(null, d85.g);
                        fr0 fr0Var2 = new fr0(qr0Var, mu0Var, b6);
                        this.w = (byte) 3;
                        objE = br2.E(10000L, fr0Var2, this);
                        if (objE == px0Var) {
                            return px0Var;
                        }
                        g61Var2 = (g61) objE;
                        this.c = g61Var2;
                        this.w = (byte) 4;
                        if (yf2.e(500L, this) == px0Var) {
                            return px0Var;
                        }
                        ew4Var2.a(null);
                        if (g61Var2 != null) {
                            this.c = null;
                            this.w = (byte) 5;
                            if (qr0Var.s(str, null, this) == px0Var) {
                                return px0Var;
                            }
                        } else {
                            String string2 = qr0Var.y.getString(R.string.message_connection_timeout);
                            string2.getClass();
                            qr0Var.p(string2, false);
                            this.c = null;
                            this.w = (byte) 6;
                            if (yf2.e(3000L, this) == px0Var) {
                                return px0Var;
                            }
                            qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                        }
                        return og5Var;
                    case 2:
                    case 5:
                        js2.o(obj);
                        return og5Var;
                    case 3:
                        js2.o(obj);
                        objE = obj;
                        g61Var2 = (g61) objE;
                        this.c = g61Var2;
                        this.w = (byte) 4;
                        if (yf2.e(500L, this) == px0Var) {
                            return px0Var;
                        }
                        ew4Var2.a(null);
                        if (g61Var2 != null) {
                            this.c = null;
                            this.w = (byte) 5;
                            if (qr0Var.s(str, null, this) == px0Var) {
                                return px0Var;
                            }
                        } else {
                            String string3 = qr0Var.y.getString(R.string.message_connection_timeout);
                            string3.getClass();
                            qr0Var.p(string3, false);
                            this.c = null;
                            this.w = (byte) 6;
                            if (yf2.e(3000L, this) == px0Var) {
                                return px0Var;
                            }
                            qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                        }
                        return og5Var;
                    case 4:
                        g61Var2 = (g61) this.c;
                        js2.o(obj);
                        ew4Var2.a(null);
                        if (g61Var2 != null) {
                            this.c = null;
                            this.w = (byte) 5;
                            if (qr0Var.s(str, null, this) == px0Var) {
                                return px0Var;
                            }
                        } else {
                            String string4 = qr0Var.y.getString(R.string.message_connection_timeout);
                            string4.getClass();
                            qr0Var.p(string4, false);
                            this.c = null;
                            this.w = (byte) 6;
                            if (yf2.e(3000L, this) == px0Var) {
                                return px0Var;
                            }
                            qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                        }
                        return og5Var;
                    case 6:
                        js2.o(obj);
                        qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                        return og5Var;
                    default:
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                String str2 = (String) obj3;
                yv0 yv0Var = (yv0) this.c;
                byte b7 = this.w;
                if (b7 == 0) {
                    js2.o(obj);
                    ew4 ew4Var3 = yv0Var.v;
                    do {
                        value = ew4Var3.getValue();
                    } while (!ew4Var3.t(value, tv0.g((tv0) value, null, null, null, null, null, true, 15)));
                    if (str2 == null || ((tv0) yv0Var.x.j.getValue()).g != null) {
                        Integer num = (Integer) obj2;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            this.w = (byte) 2;
                            Object objR = new tr1(new wv0(ra.s(yv0Var.y.z().g, new String[]{"layout"}, new i30(iIntValue, (byte) 8)), yv0Var, (byte) 0), new cy(yv0Var, mu0Var, b3), (byte) 1).r(new rc(yv0Var, b2), this);
                            if (objR != px0Var) {
                                objR = og5Var;
                            }
                            if (objR == px0Var) {
                                return px0Var;
                            }
                        }
                    } else {
                        this.w = (byte) 1;
                        if (yv0Var.l(str2, this) == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (b7 != 1 && b7 != 2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 3:
                byte b8 = this.w;
                if (b8 != 0) {
                    if (b8 == 1) {
                        js2.o(obj);
                    } else {
                        if (b8 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return og5Var;
                }
                js2.o(obj);
                this.w = (byte) 1;
                if (yf2.e(100L, this) == px0Var) {
                    return px0Var;
                }
                ss2 ss2Var = (ss2) this.c;
                int iIndexOf = ((jk1) ((ik1) obj3)).indexOf((ft0) obj2);
                this.w = (byte) 2;
                if (zb6.x(ss2Var, iIndexOf, this) == px0Var) {
                    return px0Var;
                }
                return og5Var;
            case 4:
                byte b9 = this.w;
                if (b9 != 0) {
                    if (b9 == 1) {
                        ox0Var = (ox0) this.c;
                        js2.o(obj);
                    } else {
                        if (b9 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return og5Var;
                }
                js2.o(obj);
                ox0Var = (ox0) this.c;
                this.c = ox0Var;
                this.w = (byte) 1;
                if (((dh2) obj3).M(this) == px0Var) {
                    return px0Var;
                }
                this.c = null;
                this.w = (byte) 2;
                if (((bz1) obj2).l(ox0Var, this) == px0Var) {
                    return px0Var;
                }
                return og5Var;
            default:
                k45 k45Var = (k45) obj3;
                byte b10 = this.w;
                try {
                    if (b10 != 0) {
                        if (b10 == 1) {
                            js2.o(obj);
                        } else if (b10 == 2) {
                            js2.o(obj);
                            v55Var = k45Var.e;
                            if (v55Var != null) {
                                this.w = (byte) 3;
                                v55Var.a(this);
                                if (og5Var == px0Var) {
                                    return px0Var;
                                }
                            }
                        } else {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    l0.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Throwable th3 = (Throwable) this.c;
                                js2.o(obj);
                                throw th3;
                            }
                            js2.o(obj);
                        }
                        return og5Var;
                    }
                    js2.o(obj);
                    u55 u55Var = k45Var.d;
                    if (u55Var != null) {
                        this.w = (byte) 1;
                        if (u55Var.a(this) == px0Var) {
                            return px0Var;
                        }
                    }
                    this.w = (byte) 2;
                    if (((e45) obj2).g(k45Var, this) == px0Var) {
                        return px0Var;
                    }
                    v55Var = k45Var.e;
                    if (v55Var != null) {
                        this.w = (byte) 3;
                        v55Var.a(this);
                        if (og5Var == px0Var) {
                            return px0Var;
                        }
                    }
                    return og5Var;
                } catch (Throwable th4) {
                    v55 v55Var2 = k45Var.e;
                    if (v55Var2 == null) {
                        throw th4;
                    }
                    this.c = th4;
                    this.w = (byte) 4;
                    v55Var2.a(this);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                    throw th4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
    }
}
