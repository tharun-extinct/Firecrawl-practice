package defpackage;

import android.bluetooth.BluetoothHidDevice;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class op extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(a44 a44Var, View view, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 17;
        this.i = a44Var;
        this.c = view;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                op opVar = new op(obj2, mu0Var, (byte) 0);
                opVar.c = obj;
                return opVar;
            case 1:
                return new op((ve2) this.c, (st4) obj2, mu0Var, (byte) 1);
            case 2:
                op opVar2 = new op(obj2, mu0Var, (byte) 2);
                opVar2.c = obj;
                return opVar2;
            case 3:
                return new op((ng0) this.c, (m70) obj2, mu0Var, (byte) 3);
            case 4:
                return new op((ng0) this.c, (BluetoothHidDevice) obj2, mu0Var, (byte) 4);
            case 5:
                op opVar3 = new op(obj2, mu0Var, (byte) 5);
                opVar3.c = obj;
                return opVar3;
            case 6:
                return new op((bz1) this.c, (rz0) obj2, mu0Var, (byte) 6);
            case 7:
                op opVar4 = new op(obj2, mu0Var, (byte) 7);
                opVar4.c = obj;
                return opVar4;
            case 8:
                return new op((qq1) this.c, (nq1) obj2, mu0Var, (byte) 8);
            case 9:
                op opVar5 = new op(obj2, mu0Var, (byte) 9);
                opVar5.c = obj;
                return opVar5;
            case 10:
                return new op((ah2) this.c, (xy1) obj2, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new op((cw4) this.c, (x73) obj2, mu0Var, (byte) 11);
            case 12:
                return new op((bz1) this.c, (gq3) obj2, mu0Var, (byte) 12);
            case 13:
                op opVar6 = new op(obj2, mu0Var, (byte) 13);
                opVar6.c = obj;
                return opVar6;
            case 14:
                return new op((wr4) this.c, (y1) obj2, mu0Var, (byte) 14);
            case kq2.x /* 15 */:
                op opVar7 = new op(obj2, mu0Var, (byte) 15);
                opVar7.c = obj;
                return opVar7;
            case 16:
                return new op((ae5) this.c, (my1) obj2, mu0Var, (byte) 16);
            default:
                return new op((a44) obj2, (View) this.c, mu0Var);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((op) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 3:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((op) b((mu0) obj2, (yz0) obj)).u(og5Var);
            case 6:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((op) b((mu0) obj2, (j53) obj)).u(og5Var);
            case 8:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((op) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 10:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return px0.j;
            case 12:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 13:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 14:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case kq2.x /* 15 */:
                return ((op) b((mu0) obj2, (rb5) obj)).u(og5Var);
            case 16:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((op) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        long j;
        byte b = 3;
        byte b2 = 0;
        byte b3 = 2;
        byte b4 = 1;
        mu0 mu0Var = null;
        switch (this.q) {
            case 0:
                px0 px0Var = px0.j;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    m50.T((ox0) this.c, null, new np((a44) this.i, mu0Var, b2), 3);
                    a44 a44Var = (a44) this.i;
                    fh2 fh2Var = a44Var.d;
                    Object obj2 = og5.g;
                    if (fh2Var.f0(obj2)) {
                        synchronized (a44Var.n) {
                            a44Var.z = true;
                        }
                    }
                    a44 a44Var2 = (a44) this.i;
                    this.w = true;
                    Object objN = ue5.N(a44Var2.f, new b01(b3, mu0Var, b3), this);
                    if (objN == px0Var) {
                        obj2 = objN;
                    }
                    if (obj2 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 1:
                px0 px0Var2 = px0.j;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    er1 er1VarG = ((ve2) this.c).g();
                    c90 c90Var = new c90((st4) this.i, b2);
                    this.w = true;
                    if (er1VarG.r(c90Var, this) == px0Var2) {
                        return px0Var2;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 2:
                ez3 ez3Var = (ez3) this.c;
                px0 px0Var3 = px0.j;
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    ad0 ad0Var = (ad0) this.i;
                    this.c = null;
                    this.w = true;
                    if (ad0Var.v(ez3Var, this) == px0Var3) {
                        return px0Var3;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 3:
                og5 og5Var = og5.g;
                px0 px0Var4 = px0.j;
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    ng0 ng0Var = (ng0) this.c;
                    m70 m70Var = (m70) this.i;
                    this.w = true;
                    Object objB = k33.B(new zh(ng0Var, m70Var, mu0Var, (byte) 5), this);
                    if (objB != px0Var4) {
                        objB = og5Var;
                    }
                    if (objB == px0Var4) {
                        return px0Var4;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 4:
                og5 og5Var2 = og5.g;
                px0 px0Var5 = px0.j;
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    ng0 ng0Var2 = (ng0) this.c;
                    BluetoothHidDevice bluetoothHidDevice = (BluetoothHidDevice) this.i;
                    this.w = true;
                    Object objR = new tr1(a11.v(new fg0(ng0Var2, bluetoothHidDevice, mu0Var, b2)), new kg0(ng0Var2, null), (byte) 1).r(new c90(ng0Var2, b4), this);
                    if (objR != px0Var5) {
                        objR = og5Var2;
                    }
                    if (objR == px0Var5) {
                        return px0Var5;
                    }
                } else {
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var2;
            case 5:
                px0 px0Var6 = px0.j;
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    yz0 yz0Var = (yz0) this.c;
                    d93 d93Var = a11.u;
                    List list = (List) this.i;
                    this.w = true;
                    if (d93Var.z(list, yz0Var, this) == px0Var6) {
                        return px0Var6;
                    }
                } else {
                    if (!z6) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 6:
                px0 px0Var7 = px0.j;
                boolean z7 = this.w;
                if (z7) {
                    if (z7) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                bz1 bz1Var = (bz1) this.c;
                Object obj3 = ((rz0) this.i).y;
                this.w = true;
                Object objL = bz1Var.l(obj3, this);
                return objL == px0Var7 ? px0Var7 : objL;
            case 7:
                px0 px0Var8 = px0.j;
                boolean z8 = this.w;
                if (!z8) {
                    js2.o(obj);
                    j53 j53Var = (j53) this.c;
                    p01 p01Var = (p01) this.i;
                    this.w = true;
                    if (p01Var.v(j53Var, this) == px0Var8) {
                        return px0Var8;
                    }
                } else {
                    if (!z8) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 8:
                og5 og5Var3 = og5.g;
                px0 px0Var9 = px0.j;
                boolean z9 = this.w;
                if (!z9) {
                    js2.o(obj);
                    qq1 qq1Var = (qq1) this.c;
                    nq1 nq1Var = (nq1) this.i;
                    float f = nq1Var.g;
                    float f2 = nq1Var.y;
                    float f3 = nq1Var.n;
                    float f4 = nq1Var.r;
                    this.w = true;
                    qq1Var.g = f;
                    qq1Var.y = f2;
                    qq1Var.r = f3;
                    qq1Var.n = f4;
                    Object objY = qq1Var.y(this);
                    if (objY != px0Var9) {
                        objY = og5Var3;
                    }
                    if (objY == px0Var9) {
                        return px0Var9;
                    }
                } else {
                    if (!z9) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var3;
            case 9:
                ez3 ez3Var2 = (ez3) this.c;
                px0 px0Var10 = px0.j;
                boolean z10 = this.w;
                if (!z10) {
                    js2.o(obj);
                    qs1 qs1Var = (qs1) this.i;
                    c90 c90Var2 = new c90(ez3Var2, b);
                    this.c = null;
                    this.w = true;
                    if (qs1Var.r(c90Var2, this) == px0Var10) {
                        return px0Var10;
                    }
                } else {
                    if (!z10) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 10:
                ah2 ah2Var = (ah2) this.c;
                ThreadLocal threadLocal = ah2Var.y;
                px0 px0Var11 = px0.j;
                boolean z11 = this.w;
                try {
                    if (!z11) {
                        js2.o(obj);
                        Object obj4 = threadLocal.get();
                        Boolean bool = Boolean.TRUE;
                        if (yf2.p(obj4, bool)) {
                            l0.z("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool);
                        vz0 vz0Var = ah2Var.r;
                        hz0 hz0Var = new hz0((xy1) this.i, (mu0) null);
                        this.w = true;
                        obj = kq2.k(vz0Var, hz0Var, this);
                        if (obj == px0Var11) {
                            return px0Var11;
                        }
                    } else {
                        if (!z11) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    db3 db3Var = (db3) obj;
                    threadLocal.set(Boolean.FALSE);
                    return db3Var;
                } catch (Throwable th) {
                    threadLocal.set(Boolean.FALSE);
                    throw th;
                }
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                px0 px0Var12 = px0.j;
                boolean z12 = this.w;
                if (!z12) {
                    js2.o(obj);
                    cw4 cw4Var = (cw4) this.c;
                    c90 c90Var3 = new c90(this.i, (byte) 6);
                    this.w = true;
                    if (cw4Var.r(c90Var3, this) == px0Var12) {
                        return px0Var12;
                    }
                } else {
                    if (!z12) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                l0.x();
                return null;
            case 12:
                px0 px0Var13 = px0.j;
                boolean z13 = this.w;
                if (z13) {
                    if (z13) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                bz1 bz1Var2 = (bz1) this.c;
                gq3 gq3Var = (gq3) this.i;
                this.w = true;
                Object objL2 = bz1Var2.l(gq3Var, this);
                return objL2 == px0Var13 ? px0Var13 : objL2;
            case 13:
                ie ieVar = (ie) this.i;
                px0 px0Var14 = px0.j;
                boolean z14 = this.w;
                if (!z14) {
                    js2.o(obj);
                    ox0 ox0Var = (ox0) this.c;
                    er1 er1VarG2 = ieVar.o.g();
                    cr0 cr0Var = new cr0(ieVar, ox0Var, (byte) 2);
                    this.w = true;
                    if (er1VarG2.r(cr0Var, this) == px0Var14) {
                        return px0Var14;
                    }
                } else {
                    if (!z14) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            case 14:
                wr4 wr4Var = (wr4) this.c;
                px0 px0Var15 = px0.j;
                boolean z15 = this.w;
                if (!z15) {
                    js2.o(obj);
                    if (wr4Var != null) {
                        bs4 bs4Var = (bs4) wr4Var;
                        xr4 xr4VarY = bs4Var.y().y();
                        b2 = bs4Var.y().g() != null ? (byte) 1 : (byte) 0;
                        y1 y1Var = (y1) this.i;
                        int iOrdinal = xr4VarY.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (iOrdinal == 0) {
                            j = 4000;
                        } else if (iOrdinal == 1) {
                            j = 10000;
                        } else {
                            if (iOrdinal != 2) {
                                uo1.g();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (y1Var == null) {
                            j2 = j;
                        } else {
                            AccessibilityManager accessibilityManager = ((x8) y1Var).g;
                            if (j < 2147483647L) {
                                b = b2 != 0 ? (byte) 7 : (byte) 3;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    int iV = sj.v(accessibilityManager, (int) j, b);
                                    if (iV != Integer.MAX_VALUE) {
                                        j2 = iV;
                                    }
                                } else if (b2 == 0 || !accessibilityManager.isTouchExplorationEnabled()) {
                                    j2 = j;
                                }
                            } else {
                                j2 = j;
                            }
                        }
                        this.w = true;
                        if (yf2.e(j2, this) == px0Var15) {
                            return px0Var15;
                        }
                    }
                    return og5.g;
                }
                if (!z15) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ((bs4) wr4Var).g();
                return og5.g;
            case kq2.x /* 15 */:
                px0 px0Var16 = px0.j;
                boolean z16 = this.w;
                if (z16) {
                    if (z16) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                rb5 rb5Var = (rb5) this.c;
                ae5 ae5Var = (ae5) this.i;
                this.w = true;
                Object objG = ae5Var.g(rb5Var, this);
                return objG == px0Var16 ? px0Var16 : objG;
            case 16:
                my1 my1Var = (my1) this.i;
                px0 px0Var17 = px0.j;
                boolean z17 = this.w;
                try {
                    if (!z17) {
                        js2.o(obj);
                        ae5 ae5Var2 = (ae5) this.c;
                        this.w = true;
                        obj = ae5Var2.y(this);
                        if (obj == px0Var17) {
                            return px0Var17;
                        }
                    } else {
                        if (!z17) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    my1Var.g();
                    return og5.g;
                } catch (Throwable th2) {
                    my1Var.g();
                    throw th2;
                }
            default:
                og5 og5Var4 = og5.g;
                a44 a44Var3 = (a44) this.i;
                View view = (View) this.c;
                px0 px0Var18 = px0.j;
                boolean z18 = this.w;
                try {
                    if (!z18) {
                        js2.o(obj);
                        this.w = true;
                        Object objN2 = ue5.N(a44Var3.f, new b01(b3, mu0Var, b3), this);
                        if (objN2 != px0Var18) {
                            objN2 = og5Var4;
                        }
                        if (objN2 == px0Var18) {
                            return px0Var18;
                        }
                    } else {
                        if (!z18) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    if (pq5.g(view) == a44Var3) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return og5Var4;
                } catch (Throwable th3) {
                    if (pq5.g(view) == a44Var3) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
    }
}
