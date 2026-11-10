package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.Log;
import android.widget.PopupWindow;
import androidx.work.CoroutineWorker;
import io.appground.blehid.ClassicHidService;
import io.appground.blek.utils.PointerPathView;

/* JADX INFO: loaded from: classes2.dex */
public final class dy extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(boolean z, ol1 ol1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 16;
        this.w = z;
        this.c = ol1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = 2;
        switch (this.q) {
            case 0:
                return new dy(this.c, mu0Var, (byte) 0);
            case 1:
                return new dy(this.c, mu0Var, (byte) 1);
            case 2:
                return new dy((yc0) this.c, mu0Var, b);
            case 3:
                return new dy(this.c, mu0Var, (byte) 3);
            case 4:
                return new dy(this.c, mu0Var, (byte) 4);
            case 5:
                return new dy(this.c, mu0Var, (byte) 5);
            case 6:
                return new dy(this.c, mu0Var, (byte) 6);
            case 7:
                return new dy(this.c, mu0Var, (byte) 7);
            case 8:
                return new dy(this.c, mu0Var, (byte) 8);
            case 9:
                return new dy(this.c, mu0Var, (byte) 9);
            case 10:
                return new dy(this.c, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new dy(this.c, mu0Var, (byte) 11);
            case 12:
                return new dy(this.c, mu0Var, (byte) 12);
            case 13:
                return new dy(this.c, mu0Var, (byte) 13);
            case 14:
                return new dy(this.c, mu0Var, (byte) 14);
            case kq2.x /* 15 */:
                return new dy(this.c, mu0Var, (byte) 15);
            case 16:
                return new dy(this.w, (ol1) this.c, mu0Var);
            case 17:
                return new dy(this.c, mu0Var, (byte) 17);
            case 18:
                return new dy(this.c, mu0Var, (byte) 18);
            case 19:
                return new dy(this.c, mu0Var, (byte) 19);
            case 20:
                return new dy(this.c, mu0Var, (byte) 20);
            case 21:
                return new dy(this.c, mu0Var, (byte) 21);
            case 22:
                return new dy(this.c, mu0Var, (byte) 22);
            case 23:
                return new dy(this.c, mu0Var, (byte) 23);
            case 24:
                dy dyVar = new dy(b, mu0Var);
                dyVar.c = obj;
                return dyVar;
            case 25:
                return new dy(this.c, mu0Var, (byte) 25);
            case 26:
                return new dy(this.c, mu0Var, (byte) 26);
            case 27:
                return new dy(this.c, mu0Var, (byte) 27);
            case 28:
                return new dy(this.c, mu0Var, (byte) 28);
            default:
                return new dy(this.c, mu0Var, (byte) 29);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 2:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 3:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 4:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 5:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 6:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 7:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 8:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 9:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 10:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 12:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 13:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 14:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case kq2.x /* 15 */:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 16:
                ((dy) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
            case 17:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 18:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 19:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 20:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 21:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 22:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 23:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 24:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 25:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 26:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 27:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            case 28:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
            default:
                return ((dy) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        Object objT;
        Object objP;
        dh2 dh2Var;
        ox0 ox0Var;
        byte b = this.q;
        byte b2 = 8;
        byte b3 = 2;
        byte b4 = 0;
        Object obj2 = og5.g;
        px0 px0Var = px0.j;
        byte b5 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                gy gyVar = (gy) this.c;
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ak4 ak4Var = gyVar.W().s;
                ak4Var.getClass();
                mu0 mu0Var2 = null;
                tr1 tr1Var = new tr1(a11.v(new s12(ak4Var, mu0Var2, (byte) 14)), new cy(gyVar, mu0Var2, b4), b5);
                xx1 xx1VarB = gyVar.b();
                xx1VarB.n();
                ju2 ju2Var = xx1VarB.q;
                ju2Var.getClass();
                wa0 wa0VarV = a11.v(new s3((Object) ju2Var, (Object) wt2.m, (Object) tr1Var, mu0Var2, (byte) 10));
                rc rcVar = new rc(gyVar, b3);
                this.w = true;
                return wa0VarV.r(rcVar, this) == px0Var ? px0Var : obj2;
            case 1:
                e40 e40Var = (e40) this.c;
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                while (!(e40Var.n.p() instanceof kd0)) {
                }
                e40Var.l = 0;
                e40Var.j = 0;
                e40Var.v.a(null);
                this.w = true;
                return e40Var.r(this) == px0Var ? px0Var : obj2;
            case 2:
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                yc0 yc0Var = (yc0) this.c;
                this.w = true;
                Object objL = yc0Var.l(this);
                return objL == px0Var ? px0Var : objL;
            case 3:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    cw4 cw4Var = (cw4) this.c;
                    vg0 vg0Var = new vg0(b3, mu0Var, b4);
                    this.w = true;
                    if (ue5.N(cw4Var, vg0Var, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return Boolean.TRUE;
            case 4:
                ClassicHidService classicHidService = (ClassicHidService) this.c;
                boolean z5 = this.w;
                try {
                    if (!z5) {
                        js2.o(obj);
                        ng0 ng0Var = classicHidService.H;
                        if (ng0Var != null) {
                            this.w = true;
                            ng0Var.n.y("pause", "hid");
                            Object objR = ng0Var.r(false, this);
                            if (objR != px0Var) {
                                objR = obj2;
                            }
                            if (objR == px0Var) {
                                return px0Var;
                            }
                        }
                        classicHidService.C(dx4.y);
                        return obj2;
                    }
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    break;
                } catch (SecurityException unused) {
                }
                classicHidService.C(dx4.y);
                return obj2;
            case 5:
                boolean z6 = this.w;
                if (z6 && !z6) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                while (((BluetoothAdapter) this.c).getScanMode() != 23) {
                    this.w = true;
                    if (yf2.e(250L, this) == px0Var) {
                        return px0Var;
                    }
                }
                return Boolean.TRUE;
            case 6:
                boolean z7 = this.w;
                if (!z7) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(100L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z7) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                rt1.g((rt1) this.c);
                return obj2;
            case 7:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.c;
                ol4 ol4Var = coroutineWorker.c;
                boolean z8 = this.w;
                try {
                    if (!z8) {
                        js2.o(obj);
                        this.w = true;
                        objT = coroutineWorker.t(this);
                        if (objT == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z8) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                        objT = obj;
                    }
                    ol4Var.a((zw2) objT);
                    return obj2;
                } catch (Throwable th) {
                    ol4Var.m(th);
                    return obj2;
                }
            case 8:
                j11 j11Var = (j11) this.c;
                boolean z9 = this.w;
                if (z9) {
                    if (z9) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                s54 s54Var = new s54();
                s54 s54Var2 = new s54();
                s54 s54Var3 = new s54();
                er1 er1VarG = j11Var.o.g();
                qw0 qw0Var = new qw0((Object) s54Var, (Object) s54Var2, (Object) s54Var3, (Object) j11Var, (byte) 2);
                this.w = true;
                return er1VarG.r(qw0Var, this) == px0Var ? px0Var : obj2;
            case 9:
                ce4 ce4Var = (ce4) this.c;
                boolean z10 = this.w;
                if (!z10) {
                    js2.o(obj);
                    float fD = ce4Var.g.d();
                    ed edVar = new ed(ce4Var, b2);
                    this.w = true;
                    if (kq2.m(fD, 0.0f, null, edVar, this, 12) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z10) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ce4Var.g.e(0.0f);
                return obj2;
            case 10:
                boolean z11 = this.w;
                if (!z11) {
                    js2.o(obj);
                    hu1 hu1Var = (hu1) this.c;
                    this.w = true;
                    return jz5.g(hu1Var, null, this) == px0Var ? px0Var : obj2;
                }
                if (z11) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                boolean z12 = this.w;
                if (!z12) {
                    js2.o(obj);
                    ur urVar = (ur) this.c;
                    this.w = true;
                    return urVar.g(this) == px0Var ? px0Var : obj2;
                }
                if (z12) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z13 = this.w;
                try {
                    if (!z13) {
                        js2.o(obj);
                        r22 r22Var = (r22) this.c;
                        tp tpVar = new tp(r22Var.y);
                        this.w = true;
                        if (r22Var.y(tpVar, this) == px0Var) {
                            obj2 = px0Var;
                        }
                    } else {
                        if (!z13) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return obj2;
                } catch (Throwable th2) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", th2));
                }
            case 13:
                boolean z14 = this.w;
                if (z14) {
                    if (z14) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ew4 ew4Var = ((s52) this.c).v;
                vg0 vg0Var2 = new vg0(b3, mu0Var, (byte) 3);
                this.w = true;
                Object objN = ue5.N(ew4Var, vg0Var2, this);
                return objN == px0Var ? px0Var : objN;
            case 14:
                boolean z15 = this.w;
                if (z15) {
                    if (z15) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                og ogVar = (og) this.c;
                this.w = true;
                ogVar.a(this);
                return obj2 == px0Var ? px0Var : obj2;
            case kq2.x /* 15 */:
                boolean z16 = this.w;
                if (!z16) {
                    js2.o(obj);
                    er1 er1VarY = ((ah2) this.c).r.y();
                    this.w = true;
                    objP = ue5.P(er1VarY, this);
                    if (objP == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z16) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    objP = obj;
                }
                db3 db3Var = (db3) objP;
                return db3Var != null ? db3Var.g() : qi1.j;
            case 16:
                js2.o(obj);
                if (!this.w && (dh2Var = (dh2) ((ol1) this.c).x.getValue()) != null) {
                    dh2Var.x(null);
                }
                return obj2;
            case 17:
                boolean z17 = this.w;
                if (!z17) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(200L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z17) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                yt4 yt4Var = (yt4) this.c;
                if (yt4Var == null) {
                    return obj2;
                }
                ((z41) yt4Var).g();
                return obj2;
            case 18:
                boolean z18 = this.w;
                if (z18) {
                    if (z18) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                pi piVar = (pi) ((ji) this.c).a;
                Float f = new Float(0.0f);
                zu4 zu4VarB0 = m50.b0(0.0f, 400.0f, new Float(0.5f), 1);
                this.w = true;
                return kq2.c(piVar, f, zu4VarB0, true, null, this, 8) == px0Var ? px0Var : obj2;
            case 19:
                boolean z19 = this.w;
                if (z19) {
                    if (z19) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar = ((o63) this.c).v;
                Float f2 = new Float(0.0f);
                this.w = true;
                return qg.g(qgVar, f2, null, null, this, 14) == px0Var ? px0Var : obj2;
            case 20:
                boolean z20 = this.w;
                if (z20) {
                    if (z20) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                qg qgVar2 = (qg) this.c;
                Float f3 = new Float(0.0f);
                this.w = true;
                return qg.g(qgVar2, f3, null, null, this, 14) == px0Var ? px0Var : obj2;
            case 21:
                boolean z21 = this.w;
                if (z21) {
                    if (z21) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                m70 m70Var = ((u83) this.c).l;
                this.w = true;
                Object objB = k33.B(new s12(m70Var, mu0Var, (byte) 9), this);
                return objB == px0Var ? px0Var : objB;
            case 22:
                boolean z22 = this.w;
                if (!z22) {
                    js2.o(obj);
                    f22 f22Var = new f22((Context) this.c);
                    this.w = true;
                    return f22Var.g(this) == px0Var ? px0Var : obj2;
                }
                if (z22) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                te1 te1Var = (te1) this.c;
                boolean z23 = this.w;
                if (!z23) {
                    js2.o(obj);
                    float fD2 = te1Var.y.d();
                    ed edVar2 = new ed(te1Var, (byte) 21);
                    this.w = true;
                    if (kq2.m(fD2, 0.0f, null, edVar2, this, 12) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z23) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                te1Var.g.setValue(Boolean.TRUE);
                te1Var.y.e(0.0f);
                te1Var.r.e(0.0f);
                return obj2;
            case 24:
                boolean z24 = this.w;
                if (!z24) {
                    js2.o(obj);
                    ox0Var = (ox0) this.c;
                } else {
                    if (!z24) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ox0Var = (ox0) this.c;
                    js2.o(obj);
                }
                while (v70.B(ox0Var.w())) {
                    m92 m92Var = new m92((byte) 26);
                    this.c = ox0Var;
                    this.w = true;
                    fx0 fx0Var = this.t;
                    fx0Var.getClass();
                    if (br2.u(fx0Var).I(this, m92Var) == px0Var) {
                        return px0Var;
                    }
                }
                return obj2;
            case 25:
                PointerPathView pointerPathView = (PointerPathView) this.c;
                boolean z25 = this.w;
                if (!z25) {
                    js2.o(obj);
                    long j = pointerPathView.D;
                    this.w = true;
                    if (yf2.e(j, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z25) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                pointerPathView.invalidate();
                return obj2;
            case 26:
                vl vlVar = (vl) this.c;
                boolean z26 = this.w;
                if (!z26) {
                    js2.o(obj);
                    this.w = true;
                    if (yf2.e(1000L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z26) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ((PopupWindow) vlVar.r).dismiss();
                StringBuffer stringBuffer = (StringBuffer) vlVar.n;
                stringBuffer.delete(0, stringBuffer.length());
                return obj2;
            case 27:
                boolean z27 = this.w;
                if (z27) {
                    if (z27) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                el0 el0Var = (el0) this.c;
                this.w = true;
                Object objR0 = el0Var.r0(this);
                return objR0 == px0Var ? px0Var : objR0;
            case 28:
                boolean z28 = this.w;
                if (!z28) {
                    js2.o(obj);
                    lh4 lh4Var = (lh4) this.c;
                    this.w = true;
                    return lh4Var.f(this) == px0Var ? px0Var : obj2;
                }
                if (z28) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z29 = this.w;
                if (z29) {
                    if (z29) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                jy0 jy0Var = (jy0) this.c;
                this.w = true;
                jy0Var.getClass();
                Object objB2 = k33.B(new mt(jy0Var, mu0Var, b2), this);
                if (objB2 != px0Var) {
                    objB2 = obj2;
                }
                return objB2 == px0Var ? px0Var : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy(int i, mu0 mu0Var) {
        super(i, mu0Var);
        this.q = (byte) 24;
    }
}
