package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mo extends zz4 implements bz1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = obj;
        this.c = obj2;
        this.i = obj3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.c;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new mo((jd3) this.w, (String) obj2, (ob3) obj3, mu0Var, (byte) 0);
            case 1:
                return new mo((g71) this.w, (Context) obj2, (cl0) obj3, mu0Var, (byte) 1);
            case 2:
                return new mo((s30) this.w, (ob3) obj3, (ob3) obj2, mu0Var, (byte) 2, false);
            case 3:
                mo moVar = new mo((String) obj2, (String) obj3, mu0Var, (byte) 3);
                moVar.w = obj;
                return moVar;
            case 4:
                mo moVar2 = new mo((rw3) obj2, (Long) obj3, mu0Var, (byte) 4);
                moVar2.w = obj;
                return moVar2;
            case 5:
                return new mo((xn2) this.w, (ao2) obj2, (ob3) obj3, mu0Var, (byte) 5);
            case 6:
                mo moVar3 = new mo((vu3) obj2, (r45) obj3, mu0Var, (byte) 6);
                moVar3.w = obj;
                return moVar3;
            case 7:
                return new mo((xl2) this.w, (int[]) obj2, (b90) obj3, mu0Var, (byte) 7);
            default:
                return new mo((mc3) this.w, (q81) obj3, (String) obj2, mu0Var, (byte) 8, false);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 2:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 3:
                return ((mo) b((mu0) obj2, (db3) obj)).u(og5Var);
            case 4:
                ((mo) b((mu0) obj2, (db3) obj)).u(og5Var);
                return og5Var;
            case 5:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 6:
                return ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            default:
                ((mo) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Toast toast;
        Toast toast2;
        o04 o04VarZ;
        uz5 o90Var;
        uz5 q90Var;
        ?? arrayList;
        p04 p04VarZ;
        byte b = this.q;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 1;
        ?? r6 = 0;
        ?? r7 = 0;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                js2.o(obj);
                jd3 jd3Var = (jd3) this.w;
                ad3 ad3VarJ = jd3Var.y.j();
                String str = ad3VarJ != null ? (String) ad3VarJ.t.v : null;
                if ((str == null || !ay4.P(str, "shared", false)) && !yf2.p(str, "keyboard_auto_setup")) {
                    m50.Y(jd3Var, (String) obj2);
                }
                ((ob3) obj3).setValue(null);
                return og5Var;
            case 1:
                js2.o(obj);
                g71 g71Var = (g71) this.w;
                if (g71Var instanceof d71) {
                    String str2 = ((d71) g71Var).g;
                    Context context = (Context) obj2;
                    if (tx4.Y(str2)) {
                        context.getClass();
                        if (Build.VERSION.SDK_INT != 25) {
                            WeakReference weakReference = bi6.z;
                            if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                                toast.cancel();
                            }
                            Toast toastMakeText = Toast.makeText(context.getApplicationContext(), R.string.message_error, 0);
                            toastMakeText.show();
                            bi6.z = new WeakReference(toastMakeText);
                        }
                    } else {
                        context.getClass();
                        if (Build.VERSION.SDK_INT != 25) {
                            WeakReference weakReference2 = bi6.z;
                            if (weakReference2 != null && (toast2 = (Toast) weakReference2.get()) != null) {
                                toast2.cancel();
                            }
                            Toast toastMakeText2 = Toast.makeText(context.getApplicationContext(), str2, 0);
                            toastMakeText2.show();
                            bi6.z = new WeakReference(toastMakeText2);
                        }
                    }
                    ((cl0) obj3).g.setValue(e71.g);
                }
                return og5Var;
            case 2:
                js2.o(obj);
                ob3 ob3Var = (ob3) obj3;
                ih0 ih0VarG = dc6.g((ih0) ob3Var.getValue(), (s30) this.w, 12);
                if (ih0VarG != ((ih0) ob3Var.getValue())) {
                    ob3Var.setValue(ih0VarG);
                    if (ih0VarG == ih0.j) {
                        ((ob3) obj2).setValue(Boolean.FALSE);
                    }
                }
                return og5Var;
            case 3:
                js2.o(obj);
                db3 db3Var = (db3) this.w;
                db3 db3VarL = db3Var.l();
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                rw3 rw3Var = f22.l;
                Set set = (Set) db3Var.r(rw3Var);
                if (set == null) {
                    set = vi1.j;
                }
                db3VarL.x(rw3Var, nl4.D(set, str3));
                a22 a22Var = f22.n;
                ci2[] ci2VarArr = a22.g;
                a22Var.getClass();
                db3VarL.x(a22.g(str3), str4);
                return db3VarL.j();
            case 4:
                js2.o(obj);
                db3 db3Var2 = (db3) this.w;
                db3Var2.getClass();
                db3Var2.x((rw3) obj2, (Long) obj3);
                return og5Var;
            case 5:
                js2.o(obj);
                String str5 = ((xn2) this.w).r.y;
                if (str5 != null) {
                    ((xy1) ((ob3) obj3).getValue()).a(str5);
                }
                ao2 ao2Var = (ao2) obj2;
                ao2Var.l.setValue(xn2.g(ao2Var.x(), null, null, null, 3));
                return og5Var;
            case 6:
                js2.o(obj);
                ox0 ox0Var = (ox0) this.w;
                vu3 vu3Var = (vu3) obj2;
                r45 r45Var = (r45) obj3;
                m50.T(ox0Var, null, new tw0(vu3Var, r45Var, r7 == true ? 1 : 0, b4), 1);
                return m50.T(ox0Var, null, new tw0(vu3Var, r45Var, r6 == true ? 1 : 0, (byte) 2), 1);
            case 7:
                js2.o(obj);
                xl2 xl2Var = (xl2) this.w;
                int[] iArr = (int[]) obj2;
                r04 r04Var = new r04();
                q04 q04Var = ((vl2) xl2Var.v.getValue()).g;
                if (q04Var == null || (p04VarZ = q04Var.z()) == null) {
                    r04Var = null;
                } else {
                    r04Var.t = (byte) 1;
                    r04Var.a = p04VarZ;
                    for (int i : iArr) {
                        r04[] r04VarArr = r04Var.k().a;
                        r04VarArr.getClass();
                        r04Var = (r04) pr.a0(i, r04VarArr);
                        if (r04Var == null) {
                            r04Var = null;
                        }
                    }
                }
                if (r04Var != null && (o04VarZ = r04Var.z()) != null) {
                    b90 b90Var = (b90) obj3;
                    b90Var.getClass();
                    b90Var.n = o04VarZ;
                    n04[] n04VarArr = o04VarZ.t;
                    n04VarArr.getClass();
                    ArrayList arrayList2 = new ArrayList(n04VarArr.length);
                    int length = n04VarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        n04 n04Var = n04VarArr[i2];
                        byte b5 = n04Var.t;
                        if (b5 != 1) {
                            if (b5 == b2) {
                                l04 l04Var = b5 == b2 ? (l04) n04Var.a : null;
                                boolean z = l04Var.a;
                                int[] iArr2 = l04Var.t;
                                if (z) {
                                    arrayList = pr.i0(iArr2);
                                } else {
                                    ArrayList arrayList3 = new ArrayList(iArr2.length);
                                    for (int i3 : iArr2) {
                                        arrayList3.add(b90Var.y.n(i3));
                                    }
                                    arrayList = new ArrayList();
                                    int size = arrayList3.size();
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj4 = arrayList3.get(i4);
                                        i4++;
                                        if (obj4 != null) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                }
                                o90Var = new p90(arrayList);
                            } else if (b5 != b3) {
                                q90Var = new p90(pi1.j);
                            } else {
                                q90Var = new q90((b5 == b3 ? (m04) n04Var.a : null).t);
                            }
                            arrayList2.add(new gx4(n04Var.m, q90Var, n04Var.q));
                            i2++;
                            b2 = 2;
                            b3 = 3;
                        } else {
                            o90Var = new o90((b5 == 1 ? (k04) n04Var.a : null).t);
                        }
                        q90Var = o90Var;
                        arrayList2.add(new gx4(n04Var.m, q90Var, n04Var.q));
                        i2++;
                        b2 = 2;
                        b3 = 3;
                    }
                    bg5 bg5VarV = b90Var.v();
                    String str6 = b90Var.n.m;
                    str6.getClass();
                    b90Var.x(bg5.g(bg5VarV, str6, arrayList2, 0, 4));
                }
                return og5Var;
            default:
                js2.o(obj);
                Bundle bundleG = ((mc3) this.w).g();
                q81 q81Var = (q81) obj3;
                g61 g61Var = new g61(bundleG != null ? bundleG.getString("fixDeviceName") : null, (String) obj2, 0, false, 131068);
                q81Var.getClass();
                q81Var.x(new p81(new u71(g61Var)));
                return og5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b, boolean z) {
        super(2, mu0Var);
        this.q = b;
        this.w = obj;
        this.i = obj2;
        this.c = obj3;
    }
}
