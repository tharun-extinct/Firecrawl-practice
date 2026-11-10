package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v00 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gr1 t;

    public /* synthetic */ v00(gr1 gr1Var, byte b) {
        this.j = b;
        this.t = gr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) throws Throwable {
        u00 u00Var;
        i10 i10Var;
        l10 l10Var;
        a30 a30Var;
        c01 c01Var;
        ns1 ns1Var;
        rm4 rm4Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        gr1 gr1Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof u00) {
                    u00Var = (u00) mu0Var;
                    int i = u00Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u00Var.q = i - Integer.MIN_VALUE;
                    } else {
                        u00Var = new u00(this, mu0Var);
                    }
                } else {
                    u00Var = new u00(this, mu0Var);
                }
                Object obj2 = u00Var.m;
                int i2 = u00Var.q;
                if (i2 == 0) {
                    js2.o(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    u00Var.q = 1;
                    return gr1Var.c(boolValueOf, u00Var) == px0Var ? px0Var : og5Var;
                }
                if (i2 == 1) {
                    js2.o(obj2);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (mu0Var instanceof i10) {
                    i10Var = (i10) mu0Var;
                    int i3 = i10Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        i10Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        i10Var = new i10(this, mu0Var);
                    }
                } else {
                    i10Var = new i10(this, mu0Var);
                }
                Object obj3 = i10Var.m;
                int i4 = i10Var.q;
                if (i4 == 0) {
                    js2.o(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(((s00) obj) == s00.t);
                    i10Var.q = 1;
                    return gr1Var.c(boolValueOf2, i10Var) == px0Var ? px0Var : og5Var;
                }
                if (i4 == 1) {
                    js2.o(obj3);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (mu0Var instanceof l10) {
                    l10Var = (l10) mu0Var;
                    int i5 = l10Var.q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        l10Var.q = i5 - Integer.MIN_VALUE;
                    } else {
                        l10Var = new l10(this, mu0Var);
                    }
                } else {
                    l10Var = new l10(this, mu0Var);
                }
                Object obj4 = l10Var.m;
                int i6 = l10Var.q;
                if (i6 == 0) {
                    js2.o(obj4);
                    Boolean boolValueOf3 = Boolean.valueOf(((s00) obj) == s00.m);
                    l10Var.q = 1;
                    return gr1Var.c(boolValueOf3, l10Var) == px0Var ? px0Var : og5Var;
                }
                if (i6 == 1) {
                    js2.o(obj4);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (mu0Var instanceof a30) {
                    a30Var = (a30) mu0Var;
                    int i7 = a30Var.q;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        a30Var.q = i7 - Integer.MIN_VALUE;
                    } else {
                        a30Var = new a30(this, mu0Var);
                    }
                } else {
                    a30Var = new a30(this, mu0Var);
                }
                Object obj5 = a30Var.m;
                int i8 = a30Var.q;
                if (i8 == 0) {
                    js2.o(obj5);
                    String str = ((Boolean) obj).booleanValue() ? "premium_yearly" : null;
                    a30Var.q = 1;
                    return gr1Var.c(str, a30Var) == px0Var ? px0Var : og5Var;
                }
                if (i8 == 1) {
                    js2.o(obj5);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (mu0Var instanceof c01) {
                    c01Var = (c01) mu0Var;
                    int i9 = c01Var.q;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c01Var.q = i9 - Integer.MIN_VALUE;
                    } else {
                        c01Var = new c01(this, mu0Var);
                    }
                } else {
                    c01Var = new c01(this, mu0Var);
                }
                Object obj6 = c01Var.m;
                int i10 = c01Var.q;
                if (i10 == 0) {
                    js2.o(obj6);
                    zv4 zv4Var = (zv4) obj;
                    if (zv4Var instanceof b34) {
                        throw ((b34) zv4Var).y;
                    }
                    if (zv4Var instanceof rz0) {
                        Object obj7 = ((rz0) zv4Var).y;
                        c01Var.q = 1;
                        return gr1Var.c(obj7, c01Var) == px0Var ? px0Var : og5Var;
                    }
                    if (zv4Var instanceof lo1 ? true : zv4Var instanceof dg5) {
                        l0.z("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        uo1.g();
                    }
                } else {
                    if (i10 == 1) {
                        js2.o(obj6);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                if (mu0Var instanceof ns1) {
                    ns1Var = (ns1) mu0Var;
                    int i11 = ns1Var.q;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ns1Var.q = i11 - Integer.MIN_VALUE;
                    } else {
                        ns1Var = new ns1(this, mu0Var);
                    }
                } else {
                    ns1Var = new ns1(this, mu0Var);
                }
                Object obj8 = ns1Var.m;
                int i12 = ns1Var.q;
                if (i12 != 0) {
                    if (i12 == 1) {
                        js2.o(obj8);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj8);
                if (obj == null) {
                    return og5Var;
                }
                ns1Var.q = 1;
                return gr1Var.c(obj, ns1Var) == px0Var ? px0Var : og5Var;
            default:
                if (mu0Var instanceof rm4) {
                    rm4Var = (rm4) mu0Var;
                    int i13 = rm4Var.q;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        rm4Var.q = i13 - Integer.MIN_VALUE;
                    } else {
                        rm4Var = new rm4(this, mu0Var);
                    }
                } else {
                    rm4Var = new rm4(this, mu0Var);
                }
                Object obj9 = rm4Var.m;
                int i14 = rm4Var.q;
                if (i14 == 0) {
                    js2.o(obj9);
                    Object objR = ((db3) obj).r(yl4.y);
                    rm4Var.q = 1;
                    return gr1Var.c(objR, rm4Var) == px0Var ? px0Var : og5Var;
                }
                if (i14 == 1) {
                    js2.o(obj9);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
