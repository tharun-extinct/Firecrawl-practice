package defpackage;

import android.bluetooth.BluetoothDevice;
import androidx.glance.session.SessionWorker;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class k8 extends zz4 implements xy1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(ClassicHidService classicHidService, ox0 ox0Var, BluetoothDevice bluetoothDevice, boolean z, mu0 mu0Var) {
        super(1, mu0Var);
        this.q = (byte) 2;
        this.b = classicHidService;
        this.c = ox0Var;
        this.i = bluetoothDevice;
        this.w = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        Object obj2 = this.c;
        og5 og5Var = og5.g;
        Object obj3 = this.i;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new k8(obj4, this.c, (Object) ((dz1) obj3), (mu0) obj, (byte) 0).u(og5Var);
            case 1:
                return new k8(obj4, this.c, (Object) ((dz1) obj3), (mu0) obj, (byte) 1).u(og5Var);
            case 2:
                new k8((ClassicHidService) obj4, (ox0) obj2, (BluetoothDevice) obj3, this.w, (mu0) obj).u(og5Var);
                return og5Var;
            case 3:
                return new k8(obj4, this.c, (Object) ((nc5) obj3), (mu0) obj, (byte) 3).u(og5Var);
            default:
                return new k8(obj4, obj2, obj3, (mu0) obj, (byte) 4).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        float f;
        byte b = this.q;
        byte b2 = 4;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        px0 px0Var = px0.j;
        Object obj3 = this.i;
        Object obj4 = this.b;
        byte b3 = 1;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                p8 p8Var = (p8) obj4;
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                p8Var.j(obj2);
                d8 d8Var = new d8(p8Var, b2);
                c cVar = new c((dz1) obj3, p8Var, mu0Var, (byte) 3);
                this.w = true;
                return be2.v(d8Var, cVar, this) == px0Var ? px0Var : og5Var;
            case 1:
                q8 q8Var = (q8) obj4;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    q8Var.q.setValue(obj2);
                    g8 g8Var = new g8(q8Var, b3);
                    c cVar2 = new c((dz1) obj3, q8Var, mu0Var, b2);
                    this.w = true;
                    if (og0.H(g8Var, cVar2, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                if (!((Boolean) q8Var.g.a(obj2)).booleanValue()) {
                    return og5Var;
                }
                q8Var.c.g(q8Var.y().r(obj2), q8Var.m.d());
                q8Var.j.setValue(obj2);
                q8Var.l.setValue(obj2);
                return og5Var;
            case 2:
                js2.o(obj);
                ClassicHidService classicHidService = (ClassicHidService) obj4;
                classicHidService.K = System.currentTimeMillis();
                try {
                    classicHidService.I((BluetoothDevice) obj3, this.w);
                    break;
                } catch (SecurityException unused) {
                }
                return og5Var;
            case 3:
                nc5 nc5Var = (nc5) obj3;
                lh4 lh4Var = (lh4) obj4;
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    lh4Var.z();
                    tp3 tp3Var = lh4Var.y;
                    lh4Var.w = Long.MIN_VALUE;
                    lh4Var.e(0.0f);
                    if (obj2.equals(lh4Var.r.getValue())) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(tp3Var.getValue()) ? -5.0f : -3.0f;
                    }
                    nc5Var.s(obj2);
                    nc5Var.c(0L);
                    tp3Var.setValue(obj2);
                    lh4Var.e(0.0f);
                    lh4Var.i(obj2);
                    nc5Var.a(f);
                    if (f == -3.0f) {
                        this.w = true;
                        if (lh4Var.C(this) == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                nc5Var.t();
                return og5Var;
            default:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    SessionWorker sessionWorker = (SessionWorker) obj2;
                    r95 r95Var = sessionWorker.p;
                    yj2 yj2Var = new yj2(sessionWorker);
                    this.w = true;
                    if (xf6.r((s95) obj4, sessionWorker.j, (eq) obj3, r95Var, yj2Var, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return new yw2(qz0.r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.b = obj;
        this.c = obj2;
        this.i = obj3;
    }
}
