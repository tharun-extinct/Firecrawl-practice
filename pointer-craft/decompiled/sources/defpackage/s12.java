package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.glance.session.SessionWorker;
import io.appground.blek.R;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class s12 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s12(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                s12 s12Var = new s12((tp) obj2, mu0Var, (byte) 0);
                s12Var.c = obj;
                return s12Var;
            case 1:
                return new s12((Context) this.c, (l22) obj2, mu0Var, (byte) 1);
            case 2:
                s12 s12Var2 = new s12((ya5) obj2, mu0Var, (byte) 2);
                s12Var2.c = obj;
                return s12Var2;
            case 3:
                return new s12((ja3) this.c, (ya5) obj2, mu0Var, (byte) 3);
            case 4:
                return new s12((ao2) this.c, (InputStream) obj2, mu0Var, (byte) 4);
            case 5:
                return new s12((vu3) this.c, (u21) obj2, mu0Var, (byte) 5);
            case 6:
                s12 s12Var3 = new s12((ss2) obj2, mu0Var, (byte) 6);
                s12Var3.c = obj;
                return s12Var3;
            case 7:
                return new s12((gt2) this.c, (s3) obj2, mu0Var, (byte) 7);
            case 8:
                return new s12((ph3) this.c, (bz1) obj2, mu0Var, (byte) 8);
            case 9:
                s12 s12Var4 = new s12((m70) obj2, mu0Var, (byte) 9);
                s12Var4.c = obj;
                return s12Var4;
            case 10:
                return new s12((TextClassifier) this.c, (bz1) obj2, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                s12 s12Var5 = new s12((xy1) obj2, mu0Var, (byte) 11);
                s12Var5.c = obj;
                return s12Var5;
            case 12:
                return new s12((nc1) this.c, (fg4) obj2, mu0Var, (byte) 12);
            case 13:
                return new s12((ve2) this.c, (qp3) obj2, mu0Var, (byte) 13);
            case 14:
                s12 s12Var6 = new s12((ak4) obj2, mu0Var, (byte) 14);
                s12Var6.c = obj;
                return s12Var6;
            case kq2.x /* 15 */:
                return new s12((SessionWorker) this.c, (eq) obj2, mu0Var, (byte) 15);
            case 16:
                return new s12((wm4) this.c, (h61) obj2, mu0Var, (byte) 16);
            case 17:
                return new s12((ja3) this.c, (st4) obj2, mu0Var, (byte) 17);
            case 18:
                return new s12((kr4) this.c, (s3) obj2, mu0Var, (byte) 18);
            case 19:
                return new s12((gw4) this.c, (oi) obj2, mu0Var, (byte) 19);
            default:
                s12 s12Var7 = new s12((gr1) obj2, mu0Var, (byte) 20);
                s12Var7.c = obj;
                return s12Var7;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((s12) b((mu0) obj2, (yk4) obj)).u(og5Var);
            case 1:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((s12) b((mu0) obj2, (ue2) obj)).u(og5Var);
            case 3:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((s12) b((mu0) obj2, (pf4) obj)).u(og5Var);
            case 7:
                ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return px0.j;
            case 8:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 10:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 12:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 13:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 14:
                return ((s12) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case kq2.x /* 15 */:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 16:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 17:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 18:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 19:
                return ((s12) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((s12) b((mu0) obj2, obj)).u(og5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [ng4] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ub3] */
    /* JADX WARN: Type inference failed for: r1v20, types: [dh2] */
    /* JADX WARN: Type inference failed for: r1v23, types: [dh2] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ya5] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        Object objL;
        byte b = this.q;
        ?? r1 = ub3.t;
        byte b2 = 2;
        byte b3 = 0;
        Object obj2 = og5.g;
        Object obj3 = this.i;
        px0 px0Var = px0.j;
        byte b4 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
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
                yk4 yk4Var = (yk4) this.c;
                String strU = ra.u(((tp) obj3).g());
                this.w = true;
                eq eqVar = (eq) yk4Var.g.remove(strU);
                if (eqVar != null) {
                    eqVar.n.g(null);
                    eqVar.y.set(false);
                    eqVar.m.x(null);
                }
                return obj2 == px0Var ? px0Var : obj2;
            case 1:
                boolean z2 = this.w;
                try {
                    if (!z2) {
                        js2.o(obj);
                        l22 l22Var = (l22) obj3;
                        f22 f22Var = new f22((Context) this.c);
                        w12 w12VarV = l22Var.v();
                        this.w = true;
                        if (f22Var.v(l22Var, w12VarV, this) == px0Var) {
                            obj2 = px0Var;
                        }
                    } else {
                        if (!z2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return obj2;
                } catch (CancellationException unused) {
                    return obj2;
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
                    return obj2;
                }
            case 2:
                ?? r5 = (ya5) obj3;
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ue2 ue2Var = (ue2) this.c;
                if ((ue2Var instanceof mx3) || (ue2Var instanceof ed1) || (ue2Var instanceof p72)) {
                    this.w = true;
                    return r5.y(r1, this) == px0Var ? px0Var : obj2;
                }
                if (!(ue2Var instanceof nx3) && !(ue2Var instanceof fd1) && !(ue2Var instanceof q72)) {
                    return obj2;
                }
                r5.dismiss();
                return obj2;
            case 3:
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                co4 co4Var = ((ja3) this.c).g;
                s12 s12Var = new s12((ya5) obj3, mu0Var, b2);
                this.w = true;
                return k33.A(co4Var, s12Var, this) == px0Var ? px0Var : obj2;
            case 4:
                ao2 ao2Var = (ao2) this.c;
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    ao2Var.r.getClass();
                    q04 q04VarK = ji.K((InputStream) obj3);
                    if (q04VarK == null) {
                        ao2Var.v(R.string.mesage_layout_restore_failed);
                        return obj2;
                    }
                    el2 el2VarZ = ao2Var.y.z();
                    sk2[] sk2VarArr = {a11.F(q04VarK, 7)};
                    this.w = true;
                    if (el2VarZ.g(sk2VarArr, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ao2Var.v(R.string.message_layout_restored);
                return obj2;
            case 5:
                boolean z6 = this.w;
                if (z6) {
                    if (z6) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                vu3 vu3Var = (vu3) this.c;
                hr2 hr2Var = new hr2((u21) obj3, mu0Var, b3);
                this.w = true;
                return bg6.r(vu3Var, hr2Var, this) == px0Var ? px0Var : obj2;
            case 6:
                boolean z7 = this.w;
                if (z7) {
                    if (z7) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ss2 ss2Var = (ss2) obj3;
                ns2 ns2Var = new ns2((pf4) this.c, ss2Var, b3);
                j51 j51Var = ((ls2) ss2Var.x.getValue()).t;
                this.w = true;
                return yy5.g(ns2Var, 100, j51Var, this) == px0Var ? px0Var : obj2;
            case 7:
                boolean z8 = this.w;
                if (!z8) {
                    js2.o(obj);
                    this.w = true;
                    wt3.y((gt2) this.c, (s3) obj3, this);
                    return px0Var;
                }
                if (!z8) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                } else {
                    js2.o(obj);
                    up.q();
                }
                return null;
            case 8:
                boolean z9 = this.w;
                if (!z9) {
                    js2.o(obj);
                    this.w = true;
                    return ((ph3) this.c).g.l(r1, (bz1) obj3, this) == px0Var ? px0Var : obj2;
                }
                if (z9) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.w;
                try {
                    if (!z10) {
                        js2.o(obj);
                        iv4 iv4VarT = m50.T((ox0) this.c, null, new dy(b2, mu0Var), 3);
                        this.c = iv4VarT;
                        this.w = true;
                        objL = ((m70) obj3).l(this);
                        r1 = iv4VarT;
                        if (objL == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z10) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dh2 dh2Var = (dh2) this.c;
                        js2.o(obj);
                        objL = obj;
                        r1 = dh2Var;
                    }
                    r1.x(null);
                    return objL;
                } catch (Throwable th2) {
                    r1.x(null);
                    throw th2;
                }
            case 10:
                boolean z11 = this.w;
                if (z11) {
                    if (z11) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                TextClassifier textClassifier = (TextClassifier) this.c;
                if (textClassifier == null) {
                    return null;
                }
                this.w = true;
                Object objL2 = ((bz1) obj3).l(textClassifier, this);
                return objL2 == px0Var ? px0Var : objL2;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                boolean z12 = this.w;
                if (z12) {
                    if (z12) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                if (((ox0) this.c).w().h(qb5.t) == null) {
                    l0.z("Expected a TransactionElement in the CoroutineContext but none was found.");
                    return null;
                }
                this.w = true;
                Object objA = ((xy1) obj3).a(this);
                return objA == px0Var ? px0Var : objA;
            case 12:
                boolean z13 = this.w;
                if (z13) {
                    if (z13) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                nc1 nc1Var = (nc1) this.c;
                float f = nc1Var.y ? -1.0f : 1.0f;
                ng4 ng4Var = ((fg4) obj3).Y;
                long j = vj5.j(f, nc1Var.g);
                this.w = true;
                return ng4Var.r(j, false, this) == px0Var ? px0Var : obj2;
            case 13:
                boolean z14 = this.w;
                if (z14) {
                    if (z14) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                er1 er1VarG = ((ve2) this.c).g();
                rc rcVar = new rc((qp3) obj3, (byte) 9);
                this.w = true;
                return er1VarG.r(rcVar, this) == px0Var ? px0Var : obj2;
            case 14:
                ak4 ak4Var = (ak4) obj3;
                ez3 ez3Var = (ez3) this.c;
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
                if (ak4Var.l == null) {
                    Object systemService = ak4Var.g.getSystemService("sensor");
                    systemService.getClass();
                    SensorManager sensorManager = (SensorManager) systemService;
                    ak4Var.l = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(15);
                    ak4Var.j = defaultSensor;
                    if (defaultSensor == null) {
                        SensorManager sensorManager2 = ak4Var.l;
                        ak4Var.j = sensorManager2 != null ? sensorManager2.getDefaultSensor(11) : null;
                    }
                }
                Sensor sensor = ak4Var.j;
                if (sensor == null) {
                    ez3Var.g(new IllegalStateException("Required sensor not found on this device"));
                    return obj2;
                }
                zj4 zj4Var = new zj4(new q54(), ak4Var, ez3Var);
                SensorManager sensorManager3 = ak4Var.l;
                if (sensorManager3 != null) {
                    sensorManager3.registerListener(zj4Var, sensor, 1);
                }
                o82 o82Var = new o82((Object) ak4Var, (Object) zj4Var, (byte) 13);
                this.c = null;
                this.w = true;
                return xq2.x(ez3Var, o82Var, this) == px0Var ? px0Var : obj2;
            case kq2.x /* 15 */:
                boolean z16 = this.w;
                if (z16) {
                    if (z16) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                tk4 tk4Var = ((SessionWorker) this.c).s;
                dl4 dl4Var = new dl4((eq) obj3, mu0Var, b4);
                this.w = true;
                zk4 zk4Var = (zk4) tk4Var;
                zk4Var.getClass();
                return zk4.y(zk4Var, dl4Var, this) == px0Var ? px0Var : obj2;
            case 16:
                boolean z17 = this.w;
                if (z17) {
                    if (z17) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                k61 k61VarU = ((wm4) this.c).n.u();
                this.w = true;
                Object objF = pw5.F(this, new m(k61VarU, (h61) obj3, (byte) 18), k61VarU.g, false, true);
                if (objF != px0Var) {
                    objF = obj2;
                }
                return objF == px0Var ? px0Var : obj2;
            case 17:
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
                co4 co4Var2 = ((ja3) this.c).g;
                pe0 pe0Var = new pe0((st4) obj3, b2);
                this.w = true;
                co4.m(co4Var2, pe0Var, this);
                return px0Var;
            case 18:
                kr4 kr4Var = (kr4) this.c;
                tp3 tp3Var = kr4Var.z;
                boolean z19 = this.w;
                if (!z19) {
                    js2.o(obj);
                    tp3Var.setValue(Boolean.TRUE);
                    ac3 ac3Var = kr4Var.d;
                    o8 o8Var = kr4Var.k;
                    this.w = true;
                    ac3Var.getClass();
                    if (k33.B(new zb3(ub3.t, ac3Var, (s3) obj3, o8Var, null), this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z19) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                tp3Var.setValue(Boolean.FALSE);
                return obj2;
            case 19:
                boolean z20 = this.w;
                if (!z20) {
                    js2.o(obj);
                    this.w = true;
                    return qg.g((qg) ((gw4) this.c).r, new Float(0.0f), (oi) obj3, null, this, 12) == px0Var ? px0Var : obj2;
                }
                if (z20) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Object obj4 = this.c;
                boolean z21 = this.w;
                if (!z21) {
                    js2.o(obj);
                    this.c = null;
                    this.w = true;
                    return ((gr1) obj3).c(obj4, this) == px0Var ? px0Var : obj2;
                }
                if (z21) {
                    js2.o(obj);
                    return obj2;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s12(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
    }
}
