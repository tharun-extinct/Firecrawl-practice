package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ScrollCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends zz4 implements bz1 {
    public /* synthetic */ Object b;
    public Object c;
    public Object i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(eq eqVar, Context context, Throwable th, s95 s95Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 18;
        this.i = eqVar;
        this.c = context;
        this.b = th;
        this.s = s95Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                return new s3((Context) this.c, (String) this.i, (tp) this.b, (ba3) obj2, mu0Var, (byte) 0);
            case 1:
                s3 s3Var = new s3(this.i, this.b, obj2, mu0Var, (byte) 1);
                s3Var.c = obj;
                return s3Var;
            case 2:
                return new s3((qk4) this.c, (es4) this.b, (String) this.i, (my1) obj2, mu0Var);
            case 3:
                s3 s3Var2 = new s3(this.b, (Context) this.c, obj2, mu0Var, (byte) 3);
                s3Var2.i = obj;
                return s3Var2;
            case 4:
                s3 s3Var3 = new s3((w12) obj2, (Context) this.c, (tp) this.b, mu0Var);
                s3Var3.i = obj;
                return s3Var3;
            case 5:
                s3 s3Var4 = new s3((zk0) obj2, mu0Var);
                s3Var4.b = obj;
                return s3Var4;
            case 6:
                return new s3((eo0) this.c, (ScrollCaptureSession) this.i, (Rect) this.b, (Consumer) obj2, mu0Var, (byte) 6);
            case 7:
                s3 s3Var5 = new s3((u54) this.b, (cd1) obj2, mu0Var);
                s3Var5.i = obj;
                return s3Var5;
            case 8:
                s3 s3Var6 = new s3(this.i, this.b, obj2, mu0Var, (byte) 8);
                s3Var6.c = obj;
                return s3Var6;
            case 9:
                s3 s3Var7 = new s3(this.i, this.b, obj2, mu0Var, (byte) 9);
                s3Var7.c = obj;
                return s3Var7;
            case 10:
                s3 s3Var8 = new s3(this.i, this.b, obj2, mu0Var, (byte) 10);
                s3Var8.c = obj;
                return s3Var8;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new s3((ArrayList) this.c, (ik1) this.i, (ss2) this.b, (ob3) obj2, mu0Var, (byte) 11);
            case 12:
                s3 s3Var9 = new s3(this.b, (Context) this.c, obj2, mu0Var, (byte) 12);
                s3Var9.i = obj;
                return s3Var9;
            case 13:
                s3 s3Var10 = new s3((Context) this.c, (k8) this.b, (og) obj2, mu0Var);
                s3Var10.i = obj;
                return s3Var10;
            case 14:
                return new s3((es4) this.c, (String) this.i, (ao2) this.b, (xh5) obj2, mu0Var, (byte) 14);
            case kq2.x /* 15 */:
                return new s3((es4) this.c, (String) this.i, (b30) this.b, (yh5) obj2, mu0Var, (byte) 15);
            case 16:
                s3 s3Var11 = new s3(this.i, this.b, obj2, mu0Var, (byte) 16);
                s3Var11.c = obj;
                return s3Var11;
            case 17:
                s3 s3Var12 = new s3(this.i, this.b, obj2, mu0Var, (byte) 17);
                s3Var12.c = obj;
                return s3Var12;
            case 18:
                return new s3((eq) this.i, (Context) this.c, (Throwable) this.b, (s95) obj2, mu0Var);
            case 19:
                s3 s3Var13 = new s3(this.i, this.b, obj2, mu0Var, (byte) 19);
                s3Var13.c = obj;
                return s3Var13;
            case 20:
                return new s3((s95) this.c, (up) this.i, (ox0) this.b, (bz1) obj2, mu0Var, (byte) 20);
            default:
                return new s3((Context) this.c, (String) this.i, (x03) this.b, (xy1) obj2, mu0Var, (byte) 21);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 1:
                ((s3) b((mu0) obj2, (yt3) obj)).u(og5Var);
                return px0.j;
            case 2:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((s3) b((mu0) obj2, (dz3) obj)).u(og5Var);
            case 4:
                return ((s3) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 5:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((s3) b((mu0) obj2, (xy1) obj)).u(og5Var);
            case 8:
                return ((s3) b((mu0) obj2, (o8) obj)).u(og5Var);
            case 9:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 10:
                return ((s3) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 12:
                return ((s3) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 13:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 14:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case kq2.x /* 15 */:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 16:
                return ((s3) b((mu0) obj2, (er1) obj)).u(og5Var);
            case 17:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 18:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 19:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 20:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((s3) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:203:0x045e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0521 A[Catch: Exception -> 0x0528, TryCatch #3 {Exception -> 0x0528, blocks: (B:244:0x0514, B:246:0x0521, B:250:0x052e, B:252:0x0532, B:255:0x0538, B:257:0x0540, B:259:0x0546, B:261:0x054e, B:263:0x0552, B:266:0x0558, B:267:0x0561, B:269:0x0567, B:271:0x056f, B:272:0x0573, B:274:0x057f), top: B:391:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x052d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0532 A[Catch: Exception -> 0x0528, TryCatch #3 {Exception -> 0x0528, blocks: (B:244:0x0514, B:246:0x0521, B:250:0x052e, B:252:0x0532, B:255:0x0538, B:257:0x0540, B:259:0x0546, B:261:0x054e, B:263:0x0552, B:266:0x0558, B:267:0x0561, B:269:0x0567, B:271:0x056f, B:272:0x0573, B:274:0x057f), top: B:391:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0535  */
    /* JADX WARN: Code duplicated, block: B:255:0x0538 A[Catch: Exception -> 0x0528, TryCatch #3 {Exception -> 0x0528, blocks: (B:244:0x0514, B:246:0x0521, B:250:0x052e, B:252:0x0532, B:255:0x0538, B:257:0x0540, B:259:0x0546, B:261:0x054e, B:263:0x0552, B:266:0x0558, B:267:0x0561, B:269:0x0567, B:271:0x056f, B:272:0x0573, B:274:0x057f), top: B:391:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x053f  */
    /* JADX WARN: Code duplicated, block: B:282:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:284:0x05b9 A[Catch: Exception -> 0x052a, TryCatch #2 {Exception -> 0x052a, blocks: (B:276:0x059b, B:278:0x05a8, B:284:0x05b9, B:286:0x05c1, B:288:0x05c6), top: B:389:0x059b }] */
    /* JADX WARN: Code duplicated, block: B:287:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:463:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v56, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.content.BroadcastReceiver, java.lang.Object, w92] */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x0484 -> B:217:0x0486). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x0489 -> B:219:0x048c). Please report as a decompilation issue!!! */
    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        dz3 dz3Var;
        Object objR;
        nb3 nb3VarC;
        tp3 tp3Var;
        Object objY;
        zk0 zk0Var;
        yk0 yk0Var;
        Map map;
        Object obj2;
        Map map2;
        Object obj3;
        ArrayList arrayList;
        List list;
        Object obj4;
        Object obj5;
        Object objG;
        xy1 xy1Var;
        Object obj6;
        xy1 xy1Var2;
        oc1 oc1Var;
        u54 u54Var;
        Object objL;
        ez3 ez3Var;
        Object objA;
        Object value;
        ArrayList arrayList2;
        mu0 mu0Var;
        Object objF0;
        Object objE;
        Object objH;
        byte b = this.q;
        ?? r2 = 28;
        char c = 28;
        og5 og5Var = og5.g;
        Object obj7 = this.s;
        px0 px0Var = px0.j;
        byte b2 = 1;
        mu0 mu0Var2 = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    String str = (String) this.i;
                    this.w = true;
                    Class<?> cls = Class.forName(str);
                    if (r3.class.isAssignableFrom(cls)) {
                        Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        fj.z(objNewInstance);
                        throw null;
                    }
                    l0.z("Provided class must implement ActionCallback.");
                } else {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                tc tcVar = new tc((yt3) this.c, (xy1) this.i, (uc) this.b, (gt2) obj7, null, (byte) 0);
                this.w = true;
                if (k33.B(tcVar, this) == px0Var) {
                    return px0Var;
                }
                up.q();
                return null;
            case 2:
                boolean z3 = this.w;
                if (z3) {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    ((my1) obj7).g();
                    return og5Var;
                }
                js2.o(obj);
                if (ep.g[((qk4) this.c).ordinal()] != 1) {
                    up.y();
                    return null;
                }
                es4 es4Var = (es4) this.b;
                String str2 = (String) this.i;
                this.w = true;
                if (es4.y(es4Var, str2, null, xr4.j, this, 6) == px0Var) {
                    return px0Var;
                }
                ((my1) obj7).g();
                return og5Var;
            case 3:
                Context context = (Context) this.c;
                eq eqVar = (eq) this.b;
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        dz3Var = (dz3) this.i;
                        js2.o(obj);
                        objR = obj;
                    } else {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                js2.o(obj);
                dz3Var = (dz3) this.i;
                if (eqVar.j.getValue() == null) {
                    w22 w22Var = w22.g;
                    String str3 = eqVar.g;
                    this.i = dz3Var;
                    this.w = true;
                    objR = w22Var.r(context, uw3.g, str3, this);
                    if (objR == px0Var) {
                        return px0Var;
                    }
                } else {
                    objR = null;
                }
                ob3 ob3Var = (ob3) obj7;
                at4 at4VarJ = it4.j();
                nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
                if (nb3Var == null || (nb3VarC = nb3Var.C(null, null)) == null) {
                    l0.z("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    at4 at4VarA = nb3VarC.a();
                    try {
                        tp tpVar = eqVar.x;
                        tp3 tp3Var2 = eqVar.t;
                        if (!ra.F(tpVar)) {
                            Object systemService = context.getSystemService("appwidget");
                            systemService.getClass();
                            AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(tpVar.g);
                            ob3Var.setValue(new yb1(appWidgetInfo == null ? 0L : ra.B(appWidgetInfo, displayMetrics)));
                            if (((Bundle) tp3Var2.getValue()) == null) {
                                tp3Var2.setValue(appWidgetManager.getAppWidgetOptions(tpVar.g));
                            }
                        }
                        if (objR != null) {
                            eqVar.j.setValue(objR);
                        }
                        dz3Var.setValue(Boolean.TRUE);
                        at4.s(at4VarA);
                        nb3VarC.f().v();
                        nb3VarC.r();
                        return og5Var;
                    } catch (Throwable th) {
                        at4.s(at4VarA);
                        throw th;
                    }
                } catch (Throwable th2) {
                    nb3VarC.r();
                    throw th2;
                }
            case 4:
                boolean z5 = this.w;
                if (z5) {
                    if (z5) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                gq gqVar = new gq(new AtomicReference(null), (ez3) this.i);
                c cVar = new c((w12) obj7, (Context) this.c, (tp) this.b, null, (byte) 5);
                this.w = true;
                return m50.f0(gqVar, cVar, this) == px0Var ? px0Var : og5Var;
            case 5:
                zk0 zk0Var2 = (zk0) obj7;
                tp3 tp3Var3 = zk0Var2.r;
                ox0 ox0Var = (ox0) this.b;
                boolean z6 = this.w;
                if (z6) {
                    if (!z6) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zk0Var2 = (zk0) this.i;
                    zk0 zk0Var3 = (zk0) this.c;
                    try {
                        js2.o(obj);
                        zk0Var = zk0Var3;
                        objY = obj;
                        try {
                            map = (Map) objY;
                            ox0Var.getClass();
                            yk0 yk0Var2 = (yk0) tp3Var3.getValue();
                            if (map != null) {
                                obj2 = map.get("message");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof Map) {
                                map2 = (Map) obj2;
                            } else {
                                map2 = null;
                            }
                            if (map2 != null) {
                                obj3 = map2.get("title");
                            } else {
                                obj3 = null;
                            }
                            String strValueOf = String.valueOf(obj3);
                            if (map != null || (obj5 = map.get("layouts")) == null) {
                                tp3Var = tp3Var3;
                                arrayList = null;
                            } else {
                                List list2 = obj5 instanceof List ? (List) obj5 : null;
                                if (list2 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj8 : list2) {
                                        if (obj8 instanceof Map) {
                                            arrayList3.add(obj8);
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    int size = arrayList3.size();
                                    int i = 0;
                                    while (i < size) {
                                        Object obj9 = arrayList3.get(i);
                                        i++;
                                        Map map3 = (Map) obj9;
                                        c04 c04Var = c04.y;
                                        t32 t32Var = c04Var.g;
                                        di2 di2VarSerializer = il2.Companion.serializer();
                                        di2VarSerializer.getClass();
                                        map3.getClass();
                                        tp3Var = tp3Var3;
                                        try {
                                            Object objN = new d04(c04Var, map3, di2VarSerializer.r()).n(di2VarSerializer);
                                            if (objN != null) {
                                                arrayList.add(objN);
                                            }
                                            tp3Var3 = tp3Var;
                                        } catch (Exception unused) {
                                            zk0Var2 = zk0Var;
                                            ox0Var.getClass();
                                            yk0 yk0Var3 = (yk0) tp3Var.getValue();
                                            yk0Var = new yk0(yk0Var3.g, yk0Var3.y, yk0Var3.r, false);
                                            zk0Var2.r.setValue(yk0Var);
                                            return og5Var;
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                tp3Var = tp3Var3;
                            }
                            if (map != null || (obj4 = map.get("elements")) == null) {
                                list = null;
                            } else {
                                list = (List) obj4;
                            }
                            yk0Var2.getClass();
                            yk0Var = new yk0(strValueOf, arrayList, list, false);
                        } catch (Exception unused2) {
                            tp3Var = tp3Var3;
                        }
                    } catch (Exception unused3) {
                        tp3Var = tp3Var3;
                        zk0Var2 = zk0Var3;
                        ox0Var.getClass();
                        yk0 yk0Var4 = (yk0) tp3Var.getValue();
                        yk0Var = new yk0(yk0Var4.g, yk0Var4.y, yk0Var4.r, false);
                        zk0Var2.r.setValue(yk0Var);
                        return og5Var;
                    }
                    break;
                } else {
                    js2.o(obj);
                    try {
                        gp2 gp2Var = zk0Var2.y;
                        this.b = ox0Var;
                        this.c = zk0Var2;
                        this.i = zk0Var2;
                        this.w = true;
                        objY = gp2Var.y(this);
                        if (objY == px0Var) {
                            return px0Var;
                        }
                        zk0Var = zk0Var2;
                        map = (Map) objY;
                        ox0Var.getClass();
                        yk0 yk0Var5 = (yk0) tp3Var3.getValue();
                        if (map != null) {
                            obj2 = map.get("message");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof Map) {
                            map2 = (Map) obj2;
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            obj3 = map2.get("title");
                        } else {
                            obj3 = null;
                        }
                        String strValueOf2 = String.valueOf(obj3);
                        if (map != null) {
                            tp3Var = tp3Var3;
                            arrayList = null;
                            if (map != null) {
                                list = null;
                            } else {
                                list = null;
                            }
                            yk0Var5.getClass();
                            yk0Var = new yk0(strValueOf2, arrayList, list, false);
                        } else {
                            tp3Var = tp3Var3;
                            arrayList = null;
                            if (map != null) {
                                list = null;
                            } else {
                                list = null;
                            }
                            yk0Var5.getClass();
                            yk0Var = new yk0(strValueOf2, arrayList, list, false);
                        }
                    } catch (Exception unused4) {
                        tp3Var = tp3Var3;
                        ox0Var.getClass();
                        yk0 yk0Var6 = (yk0) tp3Var.getValue();
                        yk0Var = new yk0(yk0Var6.g, yk0Var6.y, yk0Var6.r, false);
                        zk0Var2.r.setValue(yk0Var);
                        return og5Var;
                    }
                    break;
                }
                zk0Var2.r.setValue(yk0Var);
                return og5Var;
            case 6:
                boolean z7 = this.w;
                if (!z7) {
                    js2.o(obj);
                    eo0 eo0Var = (eo0) this.c;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.i;
                    Rect rect = (Rect) this.b;
                    ne2 ne2Var = new ne2(rect.left, rect.top, rect.right, rect.bottom);
                    this.w = true;
                    objG = eo0Var.g(scrollCaptureSession, ne2Var, this);
                    if (objG == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z7) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    objG = obj;
                }
                ((Consumer) obj7).accept(oe6.y((ne2) objG));
                return og5Var;
            case 7:
                u54 u54Var2 = (u54) this.b;
                boolean z8 = this.w;
                if (!z8) {
                    js2.o(obj);
                    xy1Var = (xy1) this.i;
                    obj6 = u54Var2.j;
                    if (!(obj6 instanceof nc1) || (obj6 instanceof kc1)) {
                        return og5Var;
                    }
                    lc1 lc1Var = obj6 instanceof lc1 ? (lc1) obj6 : null;
                    if (lc1Var != null) {
                        xy1Var.a(lc1Var);
                    }
                    m70 m70Var = ((cd1) obj7).B;
                    if (m70Var != null) {
                        this.i = xy1Var;
                        this.c = u54Var2;
                        this.w = true;
                        objL = m70Var.l(this);
                        if (objL == px0Var) {
                            return px0Var;
                        }
                        xy1Var2 = xy1Var;
                        u54Var = u54Var2;
                    } else {
                        xy1Var2 = xy1Var;
                        oc1Var = null;
                        u54Var = u54Var2;
                    }
                    u54Var.j = oc1Var;
                    xy1Var = xy1Var2;
                    obj6 = u54Var2.j;
                    if (obj6 instanceof nc1) {
                        return og5Var;
                    }
                    return og5Var;
                }
                if (!z8) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u54 u54Var3 = (u54) this.c;
                xy1 xy1Var3 = (xy1) this.i;
                js2.o(obj);
                xy1Var2 = xy1Var3;
                u54Var = u54Var3;
                objL = obj;
                oc1Var = (oc1) objL;
                u54Var.j = oc1Var;
                xy1Var = xy1Var2;
                obj6 = u54Var2.j;
                if (obj6 instanceof nc1) {
                    return og5Var;
                }
                return og5Var;
            case 8:
                boolean z9 = this.w;
                if (z9) {
                    if (z9) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                o8 o8Var = (o8) this.c;
                s3 s3Var = (s3) this.i;
                q2 q2Var = new q2((Object) o8Var, this.b, obj7, (byte) 12);
                this.w = true;
                return s3Var.l(q2Var, this) == px0Var ? px0Var : og5Var;
            case 9:
                boolean z10 = this.w;
                if (z10) {
                    if (z10) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ox0 ox0Var2 = (ox0) this.c;
                pd1 pd1Var = (pd1) this.i;
                cz1 cz1Var = pd1Var.T;
                long j = vj5.j(pd1Var.U ? -1.0f : 1.0f, ((nc1) this.b).g);
                um3 um3Var = (um3) obj7;
                md1 md1Var = nd1.g;
                Float f = new Float(um3Var == um3.j ? vj5.v(j) : vj5.n(j));
                this.w = true;
                return cz1Var.x(ox0Var2, f, this) == px0Var ? px0Var : og5Var;
            case 10:
                boolean z11 = this.w;
                if (!z11) {
                    js2.o(obj);
                    ez3Var = (ez3) this.c;
                    ju2 ju2Var = (ju2) this.i;
                    wt2 wt2Var = (wt2) this.b;
                    q qVar = new q((er1) obj7, ez3Var, mu0Var2, c);
                    this.c = ez3Var;
                    this.w = true;
                    if (br2.A(ju2Var, wt2Var, qVar, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z11) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ez3Var = (ez3) this.c;
                    js2.o(obj);
                }
                ez3Var.g(null);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ArrayList arrayList4 = (ArrayList) this.c;
                boolean z12 = this.w;
                if (z12) {
                    if (z12) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                int iIndexOf = arrayList4.size() == ((o) ((ik1) this.i)).g() ? arrayList4.indexOf((ft0) ((ob3) obj7).getValue()) : 0;
                ss2 ss2Var = (ss2) this.b;
                this.w = true;
                return zb6.x(ss2Var, iIndexOf, this) == px0Var ? px0Var : og5Var;
            case 12:
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.b;
                bz1 bz1Var = (bz1) obj7;
                ez3 ez3Var2 = (ez3) this.i;
                boolean z13 = this.w;
                if (z13) {
                    if (z13) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                if (Build.VERSION.SDK_INT < 28) {
                    ez3Var2.g(null);
                    return og5Var;
                }
                AtomicReference atomicReference = new AtomicReference(null);
                boolean profileProxy = bluetoothAdapter.getProfileProxy((Context) this.c, new w52(atomicReference, bz1Var, ez3Var2), 19);
                bz1Var.l("profile", "started(" + profileProxy + ")");
                if (!profileProxy) {
                    ez3Var2.g(null);
                }
                lt ltVar = new lt(atomicReference, bz1Var, ez3Var2, bluetoothAdapter);
                this.i = null;
                this.w = true;
                return xq2.x(ez3Var2, ltVar, this) == px0Var ? px0Var : og5Var;
            case 13:
                ?? r1 = (Context) this.c;
                boolean z14 = this.w;
                try {
                    if (!z14) {
                        js2.o(obj);
                        ?? w92Var = new w92(new o82((ox0) this.i, (og) obj7, b2));
                        r1.registerReceiver(w92Var, w92.r);
                        w92Var.g(r1);
                        k8 k8Var = (k8) this.b;
                        this.i = w92Var;
                        this.w = true;
                        objA = k8Var.a(this);
                        r2 = w92Var;
                        if (objA == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z14) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w92 w92Var2 = (w92) this.i;
                        js2.o(obj);
                        objA = obj;
                        r2 = w92Var2;
                    }
                    r1.unregisterReceiver(r2);
                    return objA;
                } catch (Throwable th3) {
                    r1.unregisterReceiver(r2);
                    throw th3;
                }
            case 14:
                boolean z15 = this.w;
                if (!z15) {
                    js2.o(obj);
                    es4 es4Var2 = (es4) this.c;
                    String str4 = (String) this.i;
                    this.w = true;
                    if (es4.y(es4Var2, str4, null, null, this, 14) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z15) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                ao2 ao2Var = (ao2) this.b;
                long j2 = ((xh5) obj7).g;
                List list3 = ao2Var.x().g;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj10 : list3) {
                    if (((xh5) obj10).g != j2) {
                        arrayList5.add(obj10);
                    }
                }
                ao2Var.l.setValue(xn2.g(ao2Var.x(), arrayList5, null, null, 6));
                return og5Var;
            case kq2.x /* 15 */:
                boolean z16 = this.w;
                if (!z16) {
                    js2.o(obj);
                    es4 es4Var3 = (es4) this.c;
                    String str5 = (String) this.i;
                    this.w = true;
                    if (es4.y(es4Var3, str5, null, xr4.t, this, 6) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z16) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                b30 b30Var = (b30) this.b;
                long j3 = ((yh5) obj7).g;
                ew4 ew4Var = b30Var.r.y;
                do {
                    value = ew4Var.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj11 : (List) value) {
                        if (((yh5) obj11).g != j3) {
                            arrayList2.add(obj11);
                        }
                    }
                } while (!ew4Var.t(value, arrayList2));
                return og5Var;
            case 16:
                kw3 kw3Var = (kw3) obj7;
                er1 er1Var = (er1) this.c;
                boolean z17 = this.w;
                try {
                    if (!z17) {
                        js2.o(obj);
                        rc rcVar = new rc(kw3Var, (byte) 8);
                        this.c = null;
                        this.w = true;
                        if (er1Var.r(rcVar, this) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z17) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    ((my1) this.i).g();
                    return og5Var;
                } catch (CancellationException unused5) {
                    m50.T((ox0) this.b, null, new mt(kw3Var, mu0Var2, (byte) 14), 3);
                    return og5Var;
                }
            case 17:
                boolean z18 = this.w;
                if (!z18) {
                    js2.o(obj);
                    dx0 dx0VarH = ((ox0) this.c).w().h(f73.t);
                    dx0VarH.getClass();
                    hx0 hx0Var = (hx0) dx0VarH;
                    x94 x94Var = (x94) this.i;
                    fx0 fx0VarK = a11.k(hx0Var, new qb5(hx0Var));
                    fx0 fx0VarB = fx0VarK.b(new v85(fx0VarK, x94Var.t));
                    mu0Var = (ib0) this.b;
                    this.c = mu0Var;
                    this.w = true;
                    objF0 = m50.f0(fx0VarB, (s12) obj7, this);
                    if (objF0 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z18) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0 mu0Var3 = (mu0) this.c;
                    js2.o(obj);
                    mu0Var = mu0Var3;
                    objF0 = obj;
                }
                mu0Var.j(objF0);
                return og5Var;
            case 18:
                Throwable th4 = (Throwable) this.b;
                boolean z19 = this.w;
                if (!z19) {
                    js2.o(obj);
                    eq eqVar2 = (eq) this.i;
                    Context context2 = (Context) this.c;
                    this.w = true;
                    eqVar2.r.set(true);
                    eqVar2.g(context2, th4);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z19) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                k33.d((s95) obj7, k33.v("Error in composition effect coroutine", th4));
                return og5Var;
            case 19:
                vu3 vu3Var = (vu3) this.i;
                boolean z20 = this.w;
                if (!z20) {
                    js2.o(obj);
                    m25 m25Var = new m25((ox0) this.c, new kx3(vu3Var), (cz1) this.b, (xy1) obj7, null);
                    this.w = true;
                    return bg6.r(vu3Var, m25Var, this) == px0Var ? px0Var : og5Var;
                }
                if (z20) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                s95 s95Var = (s95) this.c;
                boolean z21 = this.w;
                if (z21 && !z21) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                do {
                    Object obj12 = s95Var.t.get();
                    obj12.getClass();
                    long jLongValue = ((Number) obj12).longValue();
                    ((up) this.i).getClass();
                    if (jLongValue <= System.currentTimeMillis()) {
                        k33.d((ox0) this.b, new o95("Timed out of executing block.", ((bz1) obj7).hashCode()));
                        return og5Var;
                    }
                    long jG = s95Var.g();
                    this.w = true;
                    objE = yf2.e(yf2.a0(jG), this);
                    if (objE != px0Var) {
                        objE = og5Var;
                    }
                } while (objE != px0Var);
                return px0Var;
            default:
                boolean z22 = this.w;
                try {
                    if (!z22) {
                        js2.o(obj);
                        Context context3 = (Context) this.c;
                        String str6 = (String) this.i;
                        this.w = true;
                        objH = kq2.h(context3, str6, this);
                        if (objH == px0Var) {
                            return px0Var;
                        }
                    } else {
                        if (!z22) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                        objH = obj;
                    }
                    ((x03) this.b).g((Intent) objH);
                    return og5Var;
                } catch (Exception unused6) {
                    ((xy1) obj7).a(Boolean.FALSE);
                    return og5Var;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(zk0 zk0Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 5;
        this.s = zk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(w12 w12Var, Context context, tp tpVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 4;
        this.s = w12Var;
        this.c = context;
        this.b = tpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(u54 u54Var, cd1 cd1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 7;
        this.b = u54Var;
        this.s = cd1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(qk4 qk4Var, es4 es4Var, String str, my1 my1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 2;
        this.c = qk4Var;
        this.b = es4Var;
        this.i = str;
        this.s = my1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context, k8 k8Var, og ogVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 13;
        this.c = context;
        this.b = k8Var;
        this.s = ogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Context context, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
        this.c = context;
        this.s = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, Object obj4, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
        this.s = obj4;
    }
}
