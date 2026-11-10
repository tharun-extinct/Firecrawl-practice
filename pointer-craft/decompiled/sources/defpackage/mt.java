package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.PopupWindow;
import androidx.glance.session.SessionWorker;
import io.appground.blehid.ClassicHidService;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mt extends zz4 implements bz1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = obj;
        this.c = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new mt(this.w, obj2, mu0Var, (byte) 0);
            case 1:
                return new mt(this.w, obj2, mu0Var, (byte) 1);
            case 2:
                mt mtVar = new mt((s30) obj2, mu0Var, (byte) 2);
                mtVar.w = obj;
                return mtVar;
            case 3:
                return new mt(this.w, obj2, mu0Var, (byte) 3);
            case 4:
                return new mt(obj2, (String) this.w, mu0Var, (byte) 4);
            case 5:
                return new mt(this.w, obj2, mu0Var, (byte) 5);
            case 6:
                return new mt(this.w, obj2, mu0Var, (byte) 6);
            case 7:
                return new mt(this.w, obj2, mu0Var, (byte) 7);
            case 8:
                mt mtVar2 = new mt((jy0) obj2, mu0Var, (byte) 8);
                mtVar2.w = obj;
                return mtVar2;
            case 9:
                return new mt(this.w, obj2, mu0Var, (byte) 9);
            case 10:
                mt mtVar3 = new mt((Set) obj2, mu0Var, (byte) 10);
                mtVar3.w = obj;
                return mtVar3;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                mt mtVar4 = new mt((al2) obj2, mu0Var, (byte) 11);
                mtVar4.w = obj;
                return mtVar4;
            case 12:
                return new mt(this.w, obj2, mu0Var, (byte) 12);
            case 13:
                return new mt(obj2, (String) this.w, mu0Var, (byte) 13);
            case 14:
                mt mtVar5 = new mt((kw3) obj2, mu0Var, (byte) 14);
                mtVar5.w = obj;
                return mtVar5;
            case kq2.x /* 15 */:
                return new mt(this.w, obj2, mu0Var, (byte) 15);
            case 16:
                mt mtVar6 = new mt((SessionWorker) obj2, mu0Var, (byte) 16);
                mtVar6.w = obj;
                return mtVar6;
            default:
                return new mt(this.w, obj2, mu0Var, (byte) 17);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 2:
                return ((mt) b((mu0) obj2, (s30) obj)).u(og5Var);
            case 3:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 4:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 5:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 6:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 7:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 8:
                return ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 10:
                return ((mt) b((mu0) obj2, (db3) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((mt) b((mu0) obj2, (vo2) obj)).u(og5Var);
            case 12:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 13:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 14:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case kq2.x /* 15 */:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 16:
                return ((mt) b((mu0) obj2, (yk4) obj)).u(og5Var);
            default:
                ((mt) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [uq0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v45, types: [db3] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Class cls;
        ?? linkedHashSet;
        mu0 mu0Var = null;
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        ?? r4 = 0;
        ?? r5 = 0;
        switch (this.q) {
            case 0:
                js2.o(obj);
                String str = (String) this.w;
                if (str != null) {
                    ((rt) this.c).g(str);
                }
                return og5.g;
            case 1:
                js2.o(obj);
                ((da3) this.w).v = ((Boolean) ((ob3) this.c).getValue()).booleanValue();
                return og5.g;
            case 2:
                s30 s30Var = (s30) this.w;
                js2.o(obj);
                return Boolean.valueOf(s30Var == ((s30) this.c));
            case 3:
                js2.o(obj);
                ClassicHidService classicHidService = (ClassicHidService) this.w;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.c;
                bluetoothDevice.getClass();
                classicHidService.e(bluetoothDevice);
                classicHidService.I(bluetoothDevice, true);
                return og5.g;
            case 4:
                js2.o(obj);
                h62 h62Var = ((qr0) this.c).j;
                String str2 = (String) this.w;
                h62Var.getClass();
                str2.getClass();
                if (h62Var.n) {
                    e62 e62Var = h62Var.r;
                    if (e62Var != null) {
                        e62Var.m(str2);
                    }
                } else if (e62.G && (cls = h62Var.l) != null) {
                    try {
                        Context context = h62Var.g;
                        Intent intent = new Intent(h62Var.g, (Class<?>) cls);
                        intent.setAction("io.appground.action.DISCONNECT");
                        intent.putExtra("disconnect_address", str2);
                        context.startService(intent);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return og5.g;
            case 5:
                js2.o(obj);
                qr0 qr0Var = (qr0) this.w;
                ?? uq0Var = new uq0(qr0Var, (Context) this.c, r4 == true ? 1 : 0);
                rw4 rw4Var = new rw4();
                uq0Var.a(rw4Var);
                Object obj2 = rw4Var.g;
                if (obj2 != null) {
                    qr0Var.f = new rk4(new pw4(obj2, v13.J(rw4Var.y), cj0.F0(rw4Var.r)));
                    return og5.g;
                }
                l0.u("Required value was null.");
                return null;
            case 6:
                js2.o(obj);
                sv0 sv0Var = (sv0) this.w;
                ql4 ql4Var = (ql4) ((ob3) this.c).getValue();
                if (ql4Var != null) {
                    o83 o83Var = sv0Var.l;
                    o83Var.m = ql4Var.c;
                    o83Var.q = ql4Var.i;
                    o83Var.t = ql4Var.v;
                    o83Var.a = ql4Var.x;
                    o83Var.y(ql4Var.b, ql4Var.s);
                }
                sv0Var.n = ql4Var;
                return og5.g;
            case 7:
                js2.o(obj);
                xy1 xy1Var = (xy1) ((ob3) this.c).getValue();
                if (xy1Var != null) {
                    xy1Var.a((q04) this.w);
                }
                return og5.g;
            case 8:
                js2.o(obj);
                ox0 ox0Var = (ox0) this.w;
                jy0 jy0Var = (jy0) this.c;
                dh2 dh2Var = (dh2) jy0Var.y.getAndSet(null);
                AtomicReference atomicReference = jy0Var.y;
                iv4 iv4VarT = m50.T(ox0Var, null, new b8(dh2Var, jy0Var, mu0Var, (byte) 7), 3);
                while (!atomicReference.compareAndSet(null, iv4VarT)) {
                    if (atomicReference.get() != null) {
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                js2.o(obj);
                ((qr0) this.w).j.g(((q71) ((v71) this.c)).g.t);
                return og5.g;
            case 10:
                js2.o(obj);
                db3 db3Var = (db3) this.w;
                Set set = (Set) db3Var.r(f22.l);
                if (set == null) {
                    return db3Var;
                }
                Set set2 = set;
                Set set3 = (Set) this.c;
                ?? arrayList = new ArrayList();
                for (Object obj3 : set2) {
                    if (!set3.contains((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return db3Var;
                }
                ?? L = db3Var.l();
                rw3 rw3Var = f22.l;
                if (arrayList.isEmpty()) {
                    linkedHashSet = cj0.J0(set2);
                } else if (arrayList instanceof Set) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object obj4 : set2) {
                        if (!((Set) arrayList).contains(obj4)) {
                            linkedHashSet.add(obj4);
                        }
                    }
                } else {
                    ?? linkedHashSet2 = new LinkedHashSet(set);
                    linkedHashSet2.removeAll(arrayList);
                    linkedHashSet = linkedHashSet2;
                }
                L.v(rw3Var, linkedHashSet);
                int size = arrayList.size();
                while (i < size) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    a22 a22Var = f22.n;
                    ci2[] ci2VarArr = a22.g;
                    a22Var.getClass();
                    L.n(a22.g((String) obj5));
                }
                return L.j();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                js2.o(obj);
                vo2 vo2Var = (vo2) this.w;
                x02 x02Var = (x02) vo2Var.r(5);
                if (!x02Var.j.equals(vo2Var)) {
                    x02Var.n();
                    x02.v(x02Var.t, vo2Var);
                }
                al2 al2Var = (al2) this.c;
                uo2 uo2Var = (uo2) x02Var;
                int iS = ((vo2) uo2Var.t).s();
                uo2Var.n();
                ((vo2) uo2Var.t).u(iS);
                uo2Var.n();
                ((vo2) uo2Var.t).c();
                for (Map.Entry entry : al2Var.y.entrySet()) {
                    zo2 zo2Var = (zo2) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (al2Var.v.contains(new Integer(iIntValue))) {
                        wo2 wo2VarI = xo2.i();
                        wo2VarI.n();
                        ((xo2) wo2VarI.t).b(zo2Var);
                        wo2VarI.n();
                        ((xo2) wo2VarI.t).s(iIntValue);
                        uo2Var.n();
                        ((vo2) uo2Var.t).w((xo2) wo2VarI.y());
                    }
                }
                return uo2Var.y();
            case 12:
                js2.o(obj);
                ((wm4) this.w).z.setValue(Boolean.FALSE);
                gp4.F((Context) this.c).recreate();
                return og5.g;
            case 13:
                js2.o(obj);
                vl vlVar = (vl) this.c;
                ((u65) vlVar.y).y.setText((String) this.w);
                PopupWindow popupWindow = (PopupWindow) vlVar.r;
                if (!popupWindow.isShowing()) {
                    View view = (View) vlVar.g;
                    popupWindow.showAtLocation(view, 49, 0, view.getHeight());
                }
                return og5.g;
            case 14:
                ox0 ox0Var2 = (ox0) this.w;
                js2.o(obj);
                kw3 kw3Var = (kw3) this.c;
                m50.T(ox0Var2, null, new gw3(kw3Var, mu0Var, r5 == true ? 1 : 0), 3);
                m50.T(ox0Var2, null, new gw3(kw3Var, mu0Var, z ? (byte) 1 : (byte) 0), 3);
                return og5.g;
            case kq2.x /* 15 */:
                js2.o(obj);
                jd3 jd3Var = (jd3) this.w;
                ob3 ob3Var = (ob3) this.c;
                List list = db4.g;
                jd3Var.n(ay4.N("custom?layoutId={layoutId}", "{layoutId}", String.valueOf(((tv0) ob3Var.getValue()).y)), new xa4(jd3Var, (byte) 4));
                return og5.g;
            case 16:
                js2.o(obj);
                return (eq) ((yk4) this.w).g.get(((SessionWorker) this.c).z);
            default:
                xy1 xy1Var2 = (xy1) this.c;
                js2.o(obj);
                try {
                    Uri uri = Uri.parse("https://discord.gg/cCtrsMJtet");
                    uri.getClass();
                    ((Context) this.w).startActivity(new Intent("android.intent.action.VIEW", uri));
                    xy1Var2.a(Boolean.TRUE);
                    break;
                } catch (Exception unused2) {
                    xy1Var2.a(Boolean.FALSE);
                }
                return og5.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt(Object obj, String str, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.w = str;
    }
}
