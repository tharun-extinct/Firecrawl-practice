package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class d93 implements ex0, gm0, nk4, xq, ar, im0, fh3, mz3 {
    public static d93 b;
    public final /* synthetic */ byte j;
    public static final /* synthetic */ d93 t = new d93((byte) 1);
    public static final d93 a = new d93((byte) 2);
    public static final /* synthetic */ d93 m = new d93((byte) 3);
    public static final d93 q = new d93((byte) 4);
    public static final d93 w = new d93((byte) 5);
    public static final /* synthetic */ d93 c = new d93((byte) 6);
    public static final /* synthetic */ d93 i = new d93((byte) 7);

    public d93(Set set) {
        this.j = (byte) 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            fj.w(it.next());
            throw null;
        }
    }

    public static su4 p(int i2) {
        if (i2 == 0) {
            return su4.a;
        }
        if (i2 == 4) {
            return su4.q;
        }
        if (i2 == 8) {
            return su4.m;
        }
        l0.u(xi3.j("Unknown visibility ", i2));
        return null;
    }

    public static su4 s(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? su4.q : p(view.getVisibility());
    }

    @Override // defpackage.mz3
    public void a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.fh3
    public boolean b(um2 um2Var) {
        aj4 aj4VarK = um2Var.k();
        boolean z = false;
        if (aj4VarK != null && aj4VarK.m) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 2:
                Object objJ = vlVar.j(new e24(cg5.class, Executor.class));
                objJ.getClass();
                return c93.d((Executor) objJ);
            case 6:
                return new q64(vlVar.n(e24.g(p64.class)));
            default:
                return new p64(vlVar.v(l76.class));
        }
    }

    @Override // defpackage.xq, defpackage.ar
    public float g() {
        return 0.0f;
    }

    @Override // defpackage.nk4
    public Object i(FileInputStream fileInputStream) throws tx0 {
        byte[] bArr;
        try {
            xw3 xw3VarI = xw3.i(fileInputStream);
            db3 db3Var = new db3(false);
            sw3[] sw3VarArr = (sw3[]) Arrays.copyOf(new sw3[0], 0);
            db3Var.y();
            if (sw3VarArr.length > 0) {
                sw3 sw3Var = sw3VarArr[0];
                throw null;
            }
            Map mapQ = xw3VarI.q();
            mapQ.getClass();
            for (Map.Entry entry : mapQ.entrySet()) {
                String str = (String) entry.getKey();
                bx3 bx3Var = (bx3) entry.getValue();
                str.getClass();
                bx3Var.getClass();
                int iH = bx3Var.h();
                switch (iH == 0 ? -1 : tw3.g[du4.D(iH)]) {
                    case -1:
                        throw new tx0("Value case is null.", null);
                    case 0:
                    default:
                        uo1.g();
                        return null;
                    case 1:
                        db3Var.x(new rw3(str), Boolean.valueOf(bx3Var.q()));
                        break;
                    case 2:
                        db3Var.x(new rw3(str), Float.valueOf(bx3Var.b()));
                        break;
                    case 3:
                        db3Var.x(new rw3(str), Double.valueOf(bx3Var.i()));
                        break;
                    case 4:
                        db3Var.x(new rw3(str), Integer.valueOf(bx3Var.s()));
                        break;
                    case 5:
                        db3Var.x(new rw3(str), Long.valueOf(bx3Var.p()));
                        break;
                    case 6:
                        rw3 rw3Var = new rw3(str);
                        String strU = bx3Var.u();
                        strU.getClass();
                        db3Var.x(rw3Var, strU);
                        break;
                    case 7:
                        rw3 rw3Var2 = new rw3(str);
                        ef2 ef2VarC = bx3Var.z().c();
                        ef2VarC.getClass();
                        db3Var.x(rw3Var2, cj0.J0(ef2VarC));
                        break;
                    case 8:
                        rw3 rw3Var3 = new rw3(str);
                        da0 da0VarW = bx3Var.w();
                        int size = da0VarW.size();
                        if (size == 0) {
                            bArr = gf2.y;
                        } else {
                            byte[] bArr2 = new byte[size];
                            da0VarW.v(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        db3Var.x(rw3Var3, bArr);
                        break;
                    case 9:
                        throw new tx0("Value not set.", null);
                }
            }
            return db3Var.j();
        } catch (ig2 e) {
            throw new tx0("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.xq
    public void j(j51 j51Var, int i2, int[] iArr, fl2 fl2Var, int[] iArr2) {
        if (fl2Var == fl2.j) {
            v70.L(i2, iArr, iArr2, false);
        } else {
            v70.L(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.fh3
    public void l(um2 um2Var, long j, c72 c72Var, int i2, boolean z) {
        ah3 ah3Var = um2Var.M;
        gh3 gh3Var = ah3Var.n;
        pc3 pc3Var = gh3.c0;
        ah3Var.n.e1(gh3.i0, gh3Var.V0(j), c72Var, 1, z);
    }

    @Override // defpackage.ar
    public void m(j51 j51Var, int i2, int[] iArr, int[] iArr2) {
        v70.L(i2, iArr, iArr2, false);
    }

    @Override // defpackage.nk4
    public Object n() {
        return new db3(true);
    }

    @Override // defpackage.mz3
    public void q(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.im0
    public List r(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ll0 ll0Var : componentRegistrar.getComponents()) {
            String str = ll0Var.g;
            if (str != null) {
                hm0 hm0Var = new hm0(str, ll0Var, (byte) 0);
                Set set = ll0Var.y;
                Set set2 = ll0Var.r;
                boolean z = ll0Var.n;
                boolean z2 = ll0Var.v;
                ll0Var = new ll0(str, set, set2, z ? 1 : 0, z2 ? 1 : 0, hm0Var, ll0Var.l);
            }
            arrayList.add(ll0Var);
        }
        return arrayList;
    }

    @Override // defpackage.nk4
    public void t(Object obj, eg5 eg5Var) {
        c12 c12VarG;
        Map mapG = ((db3) obj).g();
        vw3 vw3VarC = xw3.c();
        for (Map.Entry entry : mapG.entrySet()) {
            rw3 rw3Var = (rw3) entry.getKey();
            Object value = entry.getValue();
            String str = rw3Var.g;
            if (value instanceof Boolean) {
                ax3 ax3VarO = bx3.o();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                ax3VarO.r();
                ((bx3) ax3VarO.t).f(zBooleanValue);
                c12VarG = ax3VarO.g();
            } else if (value instanceof Float) {
                ax3 ax3VarO2 = bx3.o();
                float fFloatValue = ((Number) value).floatValue();
                ax3VarO2.r();
                ((bx3) ax3VarO2.t).e(fFloatValue);
                c12VarG = ax3VarO2.g();
            } else if (value instanceof Double) {
                ax3 ax3VarO3 = bx3.o();
                double dDoubleValue = ((Number) value).doubleValue();
                ax3VarO3.r();
                ((bx3) ax3VarO3.t).d(dDoubleValue);
                c12VarG = ax3VarO3.g();
            } else if (value instanceof Integer) {
                ax3 ax3VarO4 = bx3.o();
                int iIntValue = ((Number) value).intValue();
                ax3VarO4.r();
                ((bx3) ax3VarO4.t).A(iIntValue);
                c12VarG = ax3VarO4.g();
            } else if (value instanceof Long) {
                ax3 ax3VarO5 = bx3.o();
                long jLongValue = ((Number) value).longValue();
                ax3VarO5.r();
                ((bx3) ax3VarO5.t).B(jLongValue);
                c12VarG = ax3VarO5.g();
            } else if (value instanceof String) {
                ax3 ax3VarO6 = bx3.o();
                ax3VarO6.r();
                ((bx3) ax3VarO6.t).C((String) value);
                c12VarG = ax3VarO6.g();
            } else if (value instanceof Set) {
                ax3 ax3VarO7 = bx3.o();
                yw3 yw3VarI = zw3.i();
                yw3VarI.r();
                ((zw3) yw3VarI.t).q((Set) value);
                ax3VarO7.r();
                ((bx3) ax3VarO7.t).D((zw3) yw3VarI.g());
                c12VarG = ax3VarO7.g();
            } else {
                if (!(value instanceof byte[])) {
                    l0.z("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                ax3 ax3VarO8 = bx3.o();
                byte[] bArr = (byte[]) value;
                da0 da0VarN = da0.n(bArr, 0, bArr.length);
                ax3VarO8.r();
                ((bx3) ax3VarO8.t).k(da0VarN);
                c12VarG = ax3VarO8.g();
            }
            vw3VarC.getClass();
            str.getClass();
            vw3VarC.r();
            ((xw3) vw3VarC.t).w().put(str, (bx3) c12VarG);
        }
        xw3 xw3Var = (xw3) vw3VarC.g();
        int iG = xw3Var.g(null);
        Logger logger = xi0.x;
        if (iG > 4096) {
            iG = 4096;
        }
        xi0 xi0Var = new xi0(eg5Var, iG);
        xw3Var.y(xi0Var);
        if (xi0Var.n > 0) {
            xi0Var.m();
        }
    }

    public String toString() {
        switch (this.j) {
            case 8:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(Context context, int i2, ou0 ou0Var) {
        zk2 zk2Var;
        vo2 vo2VarI;
        if (ou0Var instanceof zk2) {
            zk2Var = (zk2) ou0Var;
            int i3 = zk2Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zk2Var.i = i3 - Integer.MIN_VALUE;
            } else {
                zk2Var = new zk2(this, ou0Var);
            }
        } else {
            zk2Var = new zk2(this, ou0Var);
        }
        Object objR = zk2Var.w;
        int i4 = zk2Var.i;
        try {
            if (i4 == 0) {
                js2.o(objR);
                w22 w22Var = w22.g;
                mp2 mp2Var = mp2.g;
                String strC = js2.c(i2);
                zk2Var.m = context;
                zk2Var.q = i2;
                zk2Var.i = 1;
                objR = w22Var.r(context, mp2Var, strC, zk2Var);
                px0 px0Var = px0.j;
                if (objR == px0Var) {
                    return px0Var;
                }
            } else {
                if (i4 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = zk2Var.q;
                context = zk2Var.m;
                js2.o(objR);
            }
            vo2VarI = (vo2) objR;
        } catch (tx0 e) {
            Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + i2 + " is corrupted", e);
            vo2VarI = vo2.i();
        } catch (IOException e2) {
            Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i2, e2);
            vo2VarI = vo2.i();
        }
        Context context2 = context;
        int i5 = i2;
        df2<xo2> df2VarB = vo2VarI.b();
        int iH = v13.h(dj0.Y(df2VarB, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (xo2 xo2Var : df2VarB) {
            linkedHashMap.put(xo2Var.w(), new Integer(xo2Var.c()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        return new al2(context2, linkedHashMap2, vo2VarI.s(), i5, cj0.I0(linkedHashMap2.values()), 16);
    }

    @Override // defpackage.fh3
    public int v() {
        return 8;
    }

    @Override // defpackage.fh3
    public boolean w(c72 c72Var, um2 um2Var) {
        return false;
    }

    @Override // defpackage.fh3
    public boolean x(i73 i73Var) {
        return fe6.j(jr2.n(k33.V(i73Var), false));
    }

    @Override // defpackage.fh3
    public boolean y(i73 i73Var) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0064->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    public Object z(List list, yz0 yz0Var, ou0 ou0Var) throws Throwable {
        tz0 tz0Var;
        List list2;
        Iterator it;
        u54 u54Var;
        Throwable th;
        xy1 xy1Var;
        if (ou0Var instanceof tz0) {
            tz0Var = (tz0) ou0Var;
            int i2 = tz0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tz0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                tz0Var = new tz0(this, ou0Var);
            }
        } else {
            tz0Var = new tz0(this, ou0Var);
        }
        Object obj = tz0Var.w;
        int i3 = tz0Var.i;
        mu0 mu0Var = null;
        byte b2 = 1;
        Object obj2 = px0.j;
        if (i3 == 0) {
            js2.o(obj);
            ArrayList arrayList = new ArrayList();
            io ioVar = new io(list, arrayList, mu0Var, b2);
            tz0Var.m = arrayList;
            tz0Var.i = 1;
            if (yz0Var.g(ioVar, tz0Var) != obj2) {
                list2 = arrayList;
            }
            return obj2;
        }
        if (i3 == 1) {
            list2 = (List) tz0Var.m;
            js2.o(obj);
        } else {
            if (i3 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = tz0Var.q;
            u54Var = (u54) tz0Var.m;
            try {
                js2.o(obj);
            } catch (Throwable th2) {
                Object obj3 = u54Var.j;
                if (obj3 == null) {
                    u54Var.j = th2;
                } else {
                    kf6.g((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            xy1Var = (xy1) it.next();
            tz0Var.m = u54Var;
            tz0Var.q = it;
            tz0Var.i = 2;
            if (xy1Var.a(tz0Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) u54Var.j;
        if (th == null) {
            return og5.g;
        }
        throw th;
        u54 u54Var2 = new u54();
        it = list2.iterator();
        u54Var = u54Var2;
        while (it.hasNext()) {
            xy1Var = (xy1) it.next();
            tz0Var.m = u54Var;
            tz0Var.q = it;
            tz0Var.i = 2;
            if (xy1Var.a(tz0Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) u54Var.j;
        if (th == null) {
            return og5.g;
        }
        throw th;
    }

    public /* synthetic */ d93(byte b2) {
        this.j = b2;
    }
}
