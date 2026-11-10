package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Trace;
import android.util.DisplayMetrics;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import io.appground.blek.R;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pw5 {
    public static final ky2 a;
    public static final ky2 c;
    public static final /* synthetic */ int f = 0;
    public static Method h;
    public static final ky2 i;
    public static final ky2 m;
    public static boolean o;
    public static final ky2 q;
    public static final ky2 t;
    public static ha2 u;
    public static final ky2 v;
    public static final ky2 w;
    public static final ky2 x;
    public static Method z;
    public static final nf5 g = nf5.i;
    public static final Object[] y = new Object[0];
    public static final nm0 r = new nm0(-852597675, false, new xm0(29));
    public static final nm0 n = new nm0(-44590733, false, new on0(0));
    public static final float l = 56.0f;
    public static final ee j = new ee(3);
    public static final od4 b = new od4(21);
    public static final od4 s = new od4(22);
    public static final od4 p = new od4(23);

    static {
        byte b2 = 2;
        v = new ky2("UNDEFINED", b2);
        x = new ky2("REUSABLE_CLAIMED", b2);
        t = new ky2("NO_OWNER", b2);
        a = new ky2("STATE_REG", b2);
        m = new ky2("STATE_COMPLETED", b2);
        q = new ky2("STATE_CANCELLED", b2);
        w = new ky2("NO_RESULT", b2);
        c = new ky2("PARAM_CLAUSE_0", b2);
        i = new ky2("NO_THREAD_ELEMENTS", b2);
    }

    public static ArrayList A(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new br(objArr, true));
    }

    public static ThreadPoolExecutor B() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new gc3("firebase-iid-executor"));
    }

    public static final List C(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : k(list.get(0));
        }
        return pi1.j;
    }

    public static j73 D(j73 j73Var, cp3 cp3Var, yt0 yt0Var, float f2, m30 m30Var, int i2) {
        k00 k00Var = hi0.w;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return j73Var.n(new dp3(cp3Var, k00Var, yt0Var, f2, m30Var));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object F(mu0 mu0Var, xy1 xy1Var, x94 x94Var, boolean z2, boolean z3) {
        gz0 gz0Var;
        boolean z4;
        xy1 xy1Var2;
        x94 x94Var2;
        boolean z5;
        if (mu0Var instanceof gz0) {
            gz0Var = (gz0) mu0Var;
            int i2 = gz0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gz0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                gz0Var = new gz0(mu0Var);
            }
        } else {
            gz0Var = new gz0(mu0Var);
        }
        gz0 gz0Var2 = gz0Var;
        Object obj = gz0Var2.i;
        int i3 = gz0Var2.b;
        px0 px0Var = px0.j;
        if (i3 == 0) {
            js2.o(obj);
            if (x94Var.q() && x94Var.b() && x94Var.w()) {
                iz0 iz0Var = new iz0(null, xy1Var, x94Var, z3, z2);
                gz0Var2.b = 1;
                Object objP = x94Var.p(z2, iz0Var, gz0Var2);
                if (objP != px0Var) {
                    return objP;
                }
            } else {
                z4 = z3;
                gz0Var2.m = x94Var;
                gz0Var2.q = xy1Var;
                gz0Var2.w = z2;
                gz0Var2.c = z4;
                gz0Var2.b = 2;
                fx0 fx0VarB = b(x94Var, z4, gz0Var2);
                if (fx0VarB != px0Var) {
                    xy1Var2 = xy1Var;
                    x94Var2 = x94Var;
                    obj = fx0VarB;
                    z5 = z2;
                }
            }
        }
        if (i3 == 1) {
            js2.o(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                js2.o(obj);
                return obj;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z4 = gz0Var2.c;
        boolean z6 = gz0Var2.w;
        xy1 xy1Var3 = gz0Var2.q;
        x94 x94Var3 = gz0Var2.m;
        js2.o(obj);
        z5 = z6;
        xy1Var2 = xy1Var3;
        x94Var2 = x94Var3;
        fz0 fz0Var = new fz0(null, xy1Var2, x94Var2, z5, z4);
        gz0Var2.m = null;
        gz0Var2.q = null;
        gz0Var2.b = 3;
        Object objF0 = m50.f0((fx0) obj, fz0Var, gz0Var2);
        return objF0 == px0Var ? px0Var : objF0;
    }

    public static final Cursor G(x94 x94Var, ba4 ba4Var, boolean z2) throws IOException {
        x94Var.getClass();
        x94Var.g();
        x94Var.y();
        Cursor cursorB = x94Var.t().K().b(ba4Var);
        if (z2 && (cursorB instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorB;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorB.getColumnNames(), cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Object[] objArr = new Object[cursorB.getColumnCount()];
                        int columnCount = cursorB.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = cursorB.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(cursorB.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(cursorB.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = cursorB.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = cursorB.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorB.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gp4.C(cursorB, th);
                        throw th2;
                    }
                }
            }
        }
        return cursorB;
    }

    public static final f02 H(h02 h02Var) {
        h02 h02Var2;
        h02Var.T(206, qo0.v);
        if (h02Var.S) {
            pr4.d(h02Var.I);
        }
        Object objC = h02Var.C();
        l02 n84Var = objC instanceof l02 ? (l02) objC : null;
        if (n84Var == null) {
            h02Var2 = h02Var;
            n84Var = new n84(new e02(new f02(h02Var2, h02Var.T, h02Var.s, h02Var.C, h02Var.j.A)), -1);
            h02Var2.j0(n84Var);
        } else {
            h02Var2 = h02Var;
        }
        f02 f02Var = ((e02) n84Var.g).j;
        f02Var.x.setValue(h02Var2.q());
        h02Var2.b(false);
        return f02Var;
    }

    public static final qx1 I(h02 h02Var) {
        byte b2 = 0;
        Object[] objArr = new Object[0];
        ji jiVar = new ji((Object) new on0((byte) 15), (Object) new q21((byte) 17), (byte) 29);
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new sx1(b2);
            h02Var.i0(objK);
        }
        return (qx1) xq2.d(objArr, jiVar, (my1) objK, h02Var, 384);
    }

    public static final void J(fx0 fx0Var, Object obj) {
        if (obj == i) {
            return;
        }
        if (obj instanceof a95) {
            ((a95) obj).y(fx0Var);
            return;
        }
        Object objD = fx0Var.d(s, null);
        objD.getClass();
        ((u85) objD).o(obj);
    }

    public static final void K(mu0 mu0Var, Object obj) throws ha1 {
        if (!(mu0Var instanceof ia1)) {
            mu0Var.j(obj);
            return;
        }
        ia1 ia1Var = (ia1) mu0Var;
        hx0 hx0Var = ia1Var.m;
        ou0 ou0Var = ia1Var.q;
        Throwable thG = h84.g(obj);
        Object hl0Var = thG == null ? obj : new hl0(thG, false);
        if (M(hx0Var, ou0Var.v())) {
            ia1Var.w = hl0Var;
            ia1Var.a = 1;
            L(hx0Var, ou0Var.v(), ia1Var);
            return;
        }
        el1 el1VarG = w85.g();
        if (el1VarG.a >= 4294967296L) {
            ia1Var.w = hl0Var;
            ia1Var.a = 1;
            el1VarG.T(ia1Var);
            return;
        }
        el1VarG.U(true);
        try {
            dh2 dh2Var = (dh2) ou0Var.v().h(d52.m);
            if (dh2Var == null || dh2Var.y()) {
                Object obj2 = ia1Var.c;
                fx0 fx0VarV = ou0Var.v();
                Object objW = W(fx0VarV, obj2);
                gg5 gg5VarB0 = objW != i ? yf2.b0(ou0Var, fx0VarV, objW) : null;
                try {
                    ou0Var.j(obj);
                    if (gg5VarB0 == null || gg5VarB0.v0()) {
                        J(fx0VarV, objW);
                    }
                } catch (Throwable th) {
                    if (gg5VarB0 == null || gg5VarB0.v0()) {
                        J(fx0VarV, objW);
                    }
                    throw th;
                }
            } else {
                ia1Var.j(js2.j(dh2Var.k()));
            }
            while (el1VarG.W()) {
            }
        } catch (Throwable th2) {
            try {
                ia1Var.t(th2);
            } finally {
                el1VarG.S(true);
            }
        }
    }

    public static final void L(hx0 hx0Var, fx0 fx0Var, Runnable runnable) throws ha1 {
        try {
            hx0Var.L(fx0Var, runnable);
        } catch (Throwable th) {
            throw new ha1(th, hx0Var, fx0Var);
        }
    }

    public static final boolean M(hx0 hx0Var, fx0 fx0Var) throws ha1 {
        try {
            return hx0Var.Q(fx0Var);
        } catch (Throwable th) {
            throw new ha1(th, hx0Var, fx0Var);
        }
    }

    public static final f34 N(er1 er1Var, ox0 ox0Var, so4 so4Var, Object obj) {
        wh4 wh4Var;
        ad0 ad0Var;
        er1 er1VarL;
        yc0.y.getClass();
        xc0 xc0Var = xc0.g;
        if (!(er1Var instanceof ad0) || (er1VarL = (ad0Var = (ad0) er1Var).l()) == null) {
            wh4Var = new wh4(er1Var, (fx0) ni1.j);
        } else {
            if (ad0Var.t != -3) {
            }
            wh4Var = new wh4(er1VarL, ad0Var.j);
        }
        ew4 ew4VarW = y94.w(obj);
        return new f34(ew4VarW, m50.S(ox0Var, (fx0) wh4Var.t, so4Var.equals(ro4.g) ? rx0.j : rx0.m, new fg0(so4Var, (er1) wh4Var.j, ew4VarW, obj, (mu0) null)));
    }

    public static final int O(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final j73 P(j73 j73Var, cj cjVar, k85 k85Var, xy1 xy1Var, int i2, boolean z2, int i3, int i4, ku1 ku1Var, List list, xy1 xy1Var2, xy1 xy1Var3) {
        return j73Var.n(g73.g).n(new j35(cjVar, k85Var, ku1Var, xy1Var, i2, z2, i3, i4, list, xy1Var2, xy1Var3));
    }

    public static final Object Q(fx0 fx0Var) {
        Object objD = fx0Var.d(b, 0);
        objD.getClass();
        return objD;
    }

    public static void R() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Object[] S(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = y;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] T(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static String U(int i2) {
        if (i2 == 0) {
            return "Unspecified";
        }
        if (i2 == 1) {
            return "Text";
        }
        if (i2 == 2) {
            return "Ascii";
        }
        if (i2 == 3) {
            return "Number";
        }
        if (i2 == 4) {
            return "Phone";
        }
        if (i2 == 5) {
            return "Uri";
        }
        if (i2 == 6) {
            return "Email";
        }
        if (i2 == 7) {
            return "Password";
        }
        if (i2 == 8) {
            return "NumberPassword";
        }
        if (i2 == 9) {
            return "Decimal";
        }
        if (i2 == 10) {
            return "PasswordVisible";
        }
        if (i2 == 11) {
            return "PostalAddress";
        }
        if (i2 == 12) {
            return "PersonName";
        }
        if (i2 == 13) {
            return "EmailSubject";
        }
        if (i2 == 14) {
            return "ShortMessage";
        }
        if (i2 == 15) {
            return "LongMessage";
        }
        if (i2 == 16) {
            return "Filter";
        }
        if (i2 == 17) {
            return "Phonetic";
        }
        if (i2 == 18) {
            return "DateTime";
        }
        if (i2 == 19) {
            return "Date";
        }
        if (i2 == 20) {
            return "Time";
        }
        if (i2 == 21) {
            return "NumberSigned";
        }
        if (i2 == 22) {
            return "DecimalSigned";
        }
        if (i2 == 23) {
            return "DecimalPassword";
        }
        if (i2 == 24) {
            return "NumberPasswordSigned";
        }
        return i2 == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public static final void V(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final Object W(fx0 fx0Var, Object obj) {
        if (obj == null) {
            obj = Q(fx0Var);
        }
        if (obj == 0) {
            return i;
        }
        if (!(obj instanceof Integer)) {
            return ((u85) obj).t();
        }
        return fx0Var.d(p, new a95(((Number) obj).intValue(), fx0Var));
    }

    public static Object X(bz1 bz1Var, Object obj, mu0 mu0Var) {
        bz1Var.getClass();
        fx0 fx0VarV = mu0Var.v();
        Object bg2Var = fx0VarV == ni1.j ? new bg2(mu0Var) : new cg2(mu0Var, fx0VarV);
        ue5.f(2, bz1Var);
        return bz1Var.l(obj, bg2Var);
    }

    public static uv2 a(uv2 uv2Var) {
        uv2Var.l();
        uv2Var.a = true;
        return uv2Var.t > 0 ? uv2Var : uv2.m;
    }

    public static final fx0 b(x94 x94Var, boolean z2, ou0 ou0Var) {
        qb5 qb5Var = (qb5) ou0Var.v().h(qb5.t);
        fx0 fx0Var = qb5Var != null ? qb5Var.j : null;
        if (!x94Var.q()) {
            ku0 ku0Var = x94Var.g;
            if (ku0Var == null) {
                yf2.Y("coroutineScope");
                throw null;
            }
            fx0 fx0Var2 = ku0Var.j;
            if (fx0Var == null) {
                fx0Var = ni1.j;
            }
            return fx0Var2.b(fx0Var);
        }
        if (fx0Var != null) {
            ku0 ku0Var2 = x94Var.g;
            if (ku0Var2 != null) {
                return ku0Var2.j.b(fx0Var);
            }
            yf2.Y("coroutineScope");
            throw null;
        }
        if (z2) {
            fx0 fx0Var3 = x94Var.y;
            if (fx0Var3 != null) {
                return fx0Var3;
            }
            yf2.Y("transactionContext");
            throw null;
        }
        ku0 ku0Var3 = x94Var.g;
        if (ku0Var3 != null) {
            return ku0Var3.j;
        }
        yf2.Y("coroutineScope");
        throw null;
    }

    public static uv2 c() {
        return new uv2(10);
    }

    public static List d(Object... objArr) {
        if (objArr.length <= 0) {
            return pi1.j;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final ArrayList e(List list, my1 my1Var) {
        if (!((Boolean) my1Var.g()).booleanValue()) {
            return null;
        }
        bi6 bi6Var = new bi6((byte) 29);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            p33 p33Var = (p33) list.get(i2);
            Object objA = p33Var.a();
            objA.getClass();
            hs0 hs0VarN = ((v75) objA).l().n(bi6Var);
            arrayList.add(new fp3(p33Var.v(y94.A(hs0VarN.q(), hs0VarN.q(), hs0VarN.v(), hs0VarN.v())), hs0VarN.m()));
        }
        return arrayList;
    }

    public static final void f() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final void g(final cj cjVar, final j73 j73Var, final k85 k85Var, final xy1 xy1Var, final int i2, final boolean z2, final int i3, final int i4, final Map map, h02 h02Var, final int i5, final int i6) {
        int i7;
        k85 k85Var2;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1343466571);
        if ((i5 & 6) == 0) {
            i7 = (h02Var2.x(cjVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= h02Var2.x(j73Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            k85Var2 = k85Var;
            i7 |= h02Var2.x(k85Var2) ? 256 : 128;
        } else {
            k85Var2 = k85Var;
        }
        if ((i5 & 3072) == 0) {
            i7 |= h02Var2.j(xy1Var) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= h02Var2.n(i2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            z3 = z2;
            i7 |= h02Var2.l(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((1572864 & i5) == 0) {
            i7 |= h02Var2.n(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= h02Var2.n(i4) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= h02Var2.j(map) ? 67108864 : 33554432;
        }
        int i10 = i7 | 805306368;
        if ((i6 & 6) == 0) {
            i8 = i6 | ((i6 & 8) == 0 ? h02Var2.x(null) : h02Var2.j(null) ? 4 : 2);
        } else {
            i8 = i6;
        }
        boolean z5 = false;
        if (h02Var2.N(i10 & 1, ((306783379 & i10) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            c93.H(i4, i3);
            if (h02Var2.a(vi4.g) != null) {
                uo1.B();
                return;
            }
            h02Var2.X(1588900273);
            h02Var2.b(false);
            fp3 fp3Var = gj.g;
            int length = cjVar.t.length();
            List list = cjVar.j;
            if (list == null) {
                i9 = i10;
                z4 = z5;
                break;
            }
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i9 = i10;
                    z4 = z5;
                    break;
                }
                bj bjVar = (bj) list.get(i11);
                i9 = i10;
                if ((bjVar.g instanceof qx4) && "androidx.compose.foundation.text.inlineContent".equals(bjVar.n)) {
                    int i12 = bjVar.y;
                    int i13 = bjVar.r;
                    z5 = false;
                    if (dj.y(0, length, i12, i13)) {
                        z4 = true;
                        break;
                    }
                } else {
                    z5 = false;
                }
                i11++;
                i10 = i9;
            }
            boolean zA = jr2.A(cjVar);
            ku1 ku1Var = (ku1) h02Var2.a(hp0.m);
            if (z4 || zA) {
                boolean z6 = z5;
                h02Var2.X(1590195670);
                boolean z7 = (i9 & 14) == 4 ? true : z6;
                Object objK = h02Var2.K();
                l76 l76Var = oo0.g;
                if (z7 || objK == l76Var) {
                    objK = kq2.M(cjVar);
                    h02Var2.i0(objK);
                }
                ob3 ob3Var = (ob3) objK;
                cj cjVar2 = (cj) ob3Var.getValue();
                boolean zX = h02Var2.x(ob3Var);
                Object objK2 = h02Var2.K();
                if (zX || objK2 == l76Var) {
                    objK2 = new z6(ob3Var, (byte) 4);
                    h02Var2.i0(objK2);
                }
                int i14 = i9 << 6;
                v(j73Var, cjVar2, xy1Var, z4, map, k85Var, i2, z2, i3, i4, ku1Var, (xy1) objK2, h02Var2, ((i9 >> 3) & 910) | ((i9 >> 12) & 57344) | ((i9 << 9) & 458752) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), ((i9 >> 21) & 896) | (57344 & (i8 << 12)));
                h02Var2 = h02Var2;
                h02Var2.b(z6);
            } else {
                h02Var2.X(1589148149);
                jz.g(cjVar, k85Var2, ku1Var, null, z3, h02Var2);
                boolean z8 = z5;
                j73 j73VarP = P(j73Var, cjVar, k85Var, xy1Var, i2, z2, i3, i4, ku1Var, null, null, null);
                y50 y50Var = y50.r;
                int iHashCode = Long.hashCode(h02Var2.T);
                j73 j73VarW = m50.W(h02Var2, j73VarP);
                tr3 tr3VarQ = h02Var2.q();
                jo0.n.getClass();
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(um2.Z);
                } else {
                    h02Var2.l0();
                }
                xs2.E(tg1.w, h02Var2, y50Var);
                xs2.E(tg1.q, h02Var2, tr3VarQ);
                xs2.D(h02Var2);
                xs2.E(tg1.m, h02Var2, j73VarW);
                xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                h02Var2.b(true);
                h02Var2.b(z8);
                h02Var2 = h02Var2;
            }
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: dz
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i5 | 1);
                    int iJ2 = aq2.J(i6);
                    cj cjVar3 = cjVar;
                    j73 j73Var2 = j73Var;
                    k85 k85Var3 = k85Var;
                    xy1 xy1Var2 = xy1Var;
                    boolean z9 = i2;
                    boolean z10 = z2;
                    int i15 = i3;
                    boolean z11 = i4;
                    Map map2 = map;
                    pw5.g(cjVar3, j73Var2, k85Var3, xy1Var2, z9 ? 1 : 0, z10, i15, z11 ? 1 : 0, map2, (h02) obj, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }

    public static void i(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!o) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    z = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    h = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    z = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    h = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = z;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = h;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            o = true;
        }
        if (z2) {
            try {
                Method method4 = z;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = h) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final f34 j(ew4 ew4Var) {
        return new f34(ew4Var, null);
    }

    public static List k(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static ArrayList l(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new br(objArr, true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object m(w12 w12Var, Context context, int i2, AppWidgetProviderInfo appWidgetProviderInfo, ou0 ou0Var) {
        mp mpVar;
        final w12 w12Var2;
        AppWidgetProviderInfo appWidgetProviderInfo2;
        u64 u64Var;
        Context context2;
        Context context3 = context;
        if (ou0Var instanceof mp) {
            mpVar = (mp) ou0Var;
            int i3 = mpVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mpVar.i = i3 - Integer.MIN_VALUE;
            } else {
                mpVar = new mp(ou0Var);
            }
        } else {
            mpVar = new mp(ou0Var);
        }
        Object objB = mpVar.c;
        int i4 = mpVar.i;
        mu0 mu0Var = null;
        px0 px0Var = px0.j;
        if (i4 == 0) {
            js2.o(objB);
            sp spVar = new sp(w12Var, context3, i2, null);
            mpVar.m = w12Var;
            mpVar.q = context3;
            mpVar.w = appWidgetProviderInfo;
            mpVar.i = 1;
            objB = k33.B(spVar, mpVar);
            if (objB != px0Var) {
                w12Var2 = w12Var;
                appWidgetProviderInfo2 = appWidgetProviderInfo;
            }
            return px0Var;
        }
        if (i4 == 1) {
            appWidgetProviderInfo2 = mpVar.w;
            context3 = (Context) mpVar.q;
            w12 w12Var3 = (w12) mpVar.m;
            js2.o(objB);
            w12Var2 = w12Var3;
        } else {
            if (i4 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u64Var = (u64) mpVar.q;
            Context context4 = (Context) mpVar.m;
            js2.o(objB);
            context2 = context4;
        }
        u64 u64Var2 = u64Var;
        v13.k(u64Var2, true);
        al2 al2Var = new al2(context2, new LinkedHashMap(), 0, -1, null, 48);
        return zq2.F(context2, -1, u64Var2, al2Var, al2Var.g(u64Var2), null, new y22(new ComponentName(context2, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context2, (Class<?>) GlanceRemoteViewsService.class)));
        final Context context5 = context3;
        final bz1 bz1Var = (bz1) objB;
        final long jB = appWidgetProviderInfo2 != null ? ra.B(appWidgetProviderInfo2, context5.getResources().getDisplayMetrics()) : 0L;
        u64Var = new u64();
        lq lqVar = new lq(u64Var);
        fx0 fx0Var = mpVar.t;
        fx0Var.getClass();
        a44 a44Var = new a44(fx0Var);
        new yo0(a44Var, lqVar).A(new nm0(265674463, true, new bz1() { // from class: kp
            @Override // defpackage.bz1
            public final Object l(Object obj, Object obj2) {
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    og0.y(ep0.y.g(context5), ue5.m0(-1363737697, new lp(w12Var2, jB, bz1Var), h02Var), h02Var, 56);
                }
                return og5.g;
            }
        }));
        qf qfVar = new qf((my1) null);
        op opVar = new op((Object) a44Var, mu0Var, (byte) 0);
        mpVar.m = context5;
        mpVar.q = u64Var;
        mpVar.w = null;
        mpVar.i = 2;
        if (m50.f0(qfVar, opVar, mpVar) != px0Var) {
            context2 = context5;
            u64 u64Var3 = u64Var;
            v13.k(u64Var3, true);
            al2 al2Var2 = new al2(context2, new LinkedHashMap(), 0, -1, null, 48);
            return zq2.F(context2, -1, u64Var3, al2Var2, al2Var2.g(u64Var3), null, new y22(new ComponentName(context2, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context2, (Class<?>) GlanceRemoteViewsService.class)));
        }
        return px0Var;
    }

    public static nc n(int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        c94 c94Var = wj0.v;
        Bitmap.Config configM = y94.M(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, y94.M(i4), true, rj.g(c94Var));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configM);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new nc(bitmapCreateBitmap);
    }

    public static mu0 o(mu0 mu0Var) {
        mu0Var.getClass();
        ou0 ou0Var = mu0Var instanceof ou0 ? (ou0) mu0Var : null;
        if (ou0Var == null || (mu0Var = ou0Var.a) != null) {
            return mu0Var;
        }
        hx0 hx0Var = (hx0) ou0Var.v().h(f73.t);
        mu0 ia1Var = hx0Var != null ? new ia1(hx0Var, ou0Var) : ou0Var;
        ou0Var.a = ia1Var;
        return ia1Var;
    }

    public static Set p() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mu0 q(mu0 mu0Var, mu0 mu0Var2, bz1 bz1Var) {
        bz1Var.getClass();
        if (bz1Var instanceof ix) {
            return ((ix) bz1Var).b(mu0Var2, mu0Var);
        }
        fx0 fx0VarV = mu0Var2.v();
        return fx0VarV == ni1.j ? new zf2(mu0Var2, mu0Var, bz1Var) : new ag2(mu0Var2, fx0VarV, bz1Var, mu0Var);
    }

    public static final void r(final g61 g61Var, final List list, final my1 my1Var, final xy1 xy1Var, h02 h02Var, int i2) {
        String str;
        final ob3 ob3Var;
        h02 h02Var2 = h02Var;
        list.getClass();
        my1Var.getClass();
        xy1Var.getClass();
        h02Var2.Z(2034828948);
        int i3 = i2 | (h02Var2.j(g61Var) ? 4 : 2) | (h02Var2.x(list) ? 32 : 16) | (h02Var2.j(my1Var) ? 256 : 128) | (h02Var2.j(xy1Var) ? 2048 : 1024);
        if (h02Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(Boolean.FALSE);
                h02Var2.i0(objK);
            }
            ob3 ob3Var2 = (ob3) objK;
            ql4 ql4Var = (ql4) h02Var2.a(gp0.g);
            String str2 = ql4Var != null ? ql4Var.p : null;
            k00 k00Var = hi0.w;
            g73 g73Var = g73.g;
            j73 j73VarI = mq4.i(g73Var, k00Var, 2);
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarI);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z2 = h02Var2.S;
            sx1 sx1Var = um2.Z;
            if (z2) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var2, t33VarR);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var2, tr3VarQ);
            Integer numValueOf = Integer.valueOf(iHashCode);
            on0 on0Var3 = tg1.c;
            xs2.E(on0Var3, h02Var2, numValueOf);
            xs2.D(h02Var2);
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var2, j73VarW);
            Object objK2 = h02Var2.K();
            byte b2 = 3;
            if (objK2 == l76Var) {
                objK2 = new ln(ob3Var2, b2);
                h02Var2.i0(objK2);
            }
            j73 j73VarI2 = ue5.I(g73Var, false, null, null, (my1) objK2, 15);
            kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var2, 48);
            int iHashCode2 = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ2 = h02Var2.q();
            j73 j73VarW2 = m50.W(h02Var2, j73VarI2);
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var, h02Var2, kb4VarG);
            xs2.E(on0Var2, h02Var2, tr3VarQ2);
            du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
            xs2.E(on0Var4, h02Var2, j73VarW2);
            boolean z3 = yf2.p(str2, "screen_on") || yf2.p(str2, "screen_off");
            nm0 nm0VarM0 = ue5.m0(895117458, new yp0(str2, (byte) 1), h02Var2);
            nb4 nb4Var = nb4.g;
            final String str3 = str2;
            gp4.r(nb4Var, z3, null, null, null, null, nm0VarM0, h02Var2, 1572870, 30);
            int i4 = R.string.actionbar_not_connected;
            if (g61Var != null) {
                int i5 = g61Var.m;
                if (i5 == 10) {
                    i4 = R.string.actionbar_not_paired;
                } else if (i5 == 11) {
                    i4 = R.string.actionbar_pairing;
                } else {
                    int i6 = g61Var.c;
                    if (i6 == 0) {
                        i4 = R.string.actionbar_disconnected;
                    } else if (i6 == 1) {
                        i4 = R.string.actionbar_connecting;
                    } else if (i6 == 2) {
                        i4 = R.string.actionbar_connected;
                    } else if (i6 == 3) {
                        i4 = R.string.actionbar_disconnecting;
                    }
                }
            }
            if (g61Var == null || (str = g61Var.j) == null) {
                str = "Unknown";
            }
            String strJ = xs2.J(i4, new Object[]{str}, h02Var2);
            j73 j73VarG = nb4Var.g(g73Var, 1.0f, false);
            vf1 vf1Var = tj0.g;
            g75.y(strJ, j73VarG, ((rj0) h02Var2.a(vf1Var)).u, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((mf5) h02Var2.a(of5.g)).t, h02Var, 0, 24960, 110584);
            h02Var2 = h02Var;
            t92.g(k33.H(), null, null, ((rj0) h02Var2.a(vf1Var)).u, h02Var2, 48, 4);
            h02Var2.b(true);
            boolean zBooleanValue = ((Boolean) ob3Var2.getValue()).booleanValue();
            Object objK3 = h02Var2.K();
            if (objK3 == l76Var) {
                ob3Var = ob3Var2;
                objK3 = new ln(ob3Var, (byte) 4);
                h02Var2.i0(objK3);
            } else {
                ob3Var = ob3Var2;
            }
            ad.g(zBooleanValue, (my1) objK3, null, 0L, null, null, null, 0L, 0.0f, ue5.m0(-2123838967, new cz1() { // from class: j71
                /* JADX WARN: Code duplicated, block: B:35:0x010c A[PHI: r7
  0x010c: PHI (r7v20 java.lang.Object) = (r7v19 java.lang.Object), (r7v21 java.lang.Object) binds: [B:39:0x0120, B:33:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    float f2;
                    l76 l76Var2;
                    float f3;
                    l76 l76Var3;
                    ob3 ob3Var3;
                    ob3 ob3Var4;
                    Set<String> set;
                    Object stringSet;
                    Object objValueOf;
                    h02 h02Var3 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((gk0) obj).getClass();
                    byte b3 = 1;
                    if (h02Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String str4 = "disabled";
                        boolean zP = yf2.p(str3, "disabled");
                        g73 g73Var2 = g73.g;
                        ob3 ob3Var5 = ob3Var;
                        l76 l76Var4 = oo0.g;
                        if (zP) {
                            f2 = 0.0f;
                            l76Var2 = l76Var4;
                            f3 = 8.0f;
                            h02Var3.X(-2122758919);
                            h02Var3.b(false);
                        } else {
                            h02Var3.X(-2123341285);
                            h02Var3.X(-805633028);
                            if (((Boolean) h02Var3.a(yd2.g)).booleanValue()) {
                                h02Var3.X(-336165237);
                                Object objK4 = h02Var3.K();
                                if (objK4 == l76Var4) {
                                    objK4 = kq2.M("disabled");
                                    h02Var3.i0(objK4);
                                }
                                ob3Var4 = (ob3) objK4;
                                h02Var3.b(false);
                                h02Var3.b(false);
                            } else {
                                h02Var3.X(-336108538);
                                h02Var3.b(false);
                                SharedPreferences sharedPreferences = d52.b;
                                sharedPreferences.getClass();
                                Object objK5 = h02Var3.K();
                                mu0 mu0Var = null;
                                if (objK5 == l76Var4) {
                                    tf0 tf0VarG = v54.g(String.class);
                                    if (tf0VarG.equals(v54.g(Float.TYPE))) {
                                        objValueOf = Float.valueOf(sharedPreferences.getFloat("mouse_jiggle_mode", ((Float) "disabled").floatValue()));
                                    } else if (tf0VarG.equals(v54.g(Integer.TYPE))) {
                                        objValueOf = Integer.valueOf(sharedPreferences.getInt("mouse_jiggle_mode", ((Integer) "disabled").intValue()));
                                    } else if (tf0VarG.equals(v54.g(Long.TYPE))) {
                                        objValueOf = Long.valueOf(sharedPreferences.getLong("mouse_jiggle_mode", ((Long) "disabled").longValue()));
                                    } else if (tf0VarG.equals(v54.g(Boolean.TYPE))) {
                                        objValueOf = Boolean.valueOf(sharedPreferences.getBoolean("mouse_jiggle_mode", ((Boolean) "disabled").booleanValue()));
                                    } else if (tf0VarG.equals(v54.g(String.class))) {
                                        stringSet = sharedPreferences.getString("mouse_jiggle_mode", "disabled");
                                        if (stringSet != null) {
                                            objValueOf = set;
                                            objValueOf = str4;
                                            objValueOf = stringSet;
                                        }
                                    } else {
                                        if (!tf0VarG.equals(v54.g(Set.class))) {
                                            l0.u("Unsupported type for SharedPreferences");
                                            return null;
                                        }
                                        set = (Set) "disabled";
                                        stringSet = sharedPreferences.getStringSet("mouse_jiggle_mode", set);
                                        if (stringSet != null) {
                                            objValueOf = set;
                                            objValueOf = str4;
                                            objValueOf = stringSet;
                                        }
                                    }
                                    objValueOf = set;
                                    objValueOf = str4;
                                    objK5 = (String) objValueOf;
                                    h02Var3.i0(objK5);
                                }
                                Object objK6 = h02Var3.K();
                                if (objK6 == l76Var4) {
                                    objK6 = kq2.M(objK5);
                                    h02Var3.i0(objK6);
                                }
                                ob3 ob3Var6 = (ob3) objK6;
                                boolean zX = h02Var3.x(ob3Var6) | h02Var3.j(sharedPreferences);
                                Object objK7 = h02Var3.K();
                                if (zX || objK7 == l76Var4) {
                                    objK7 = new q(ob3Var6, sharedPreferences, mu0Var, (byte) 26);
                                    h02Var3.i0(objK7);
                                }
                                k33.b((bz1) objK7, h02Var3, "mouse_jiggle_mode");
                                h02Var3.b(false);
                                ob3Var4 = ob3Var6;
                            }
                            boolean zX2 = h02Var3.x(ob3Var4);
                            Object objK8 = h02Var3.K();
                            if (zX2 || objK8 == l76Var4) {
                                objK8 = new p2(ob3Var4, ob3Var5, (byte) 22);
                                h02Var3.i0(objK8);
                            }
                            f3 = 8.0f;
                            f2 = 0.0f;
                            l76Var2 = l76Var4;
                            ad.y(dz5.g, (my1) objK8, null, null, dz5.y, false, null, null, h02Var3, 24582, 492);
                            m50.p(ue5.g0(g73Var2, 0.0f, 8.0f, 1), 0.0f, 0L, h02Var3, 6, 6);
                            h02Var3.b(false);
                        }
                        h02Var3.X(-899758695);
                        List<g61> list2 = list;
                        for (g61 g61Var2 : list2) {
                            nm0 nm0VarM1 = ue5.m0(-1461850418, new ft(g61Var2, g61Var, b3), h02Var3);
                            xy1 xy1Var2 = xy1Var;
                            boolean zX3 = h02Var3.x(xy1Var2) | h02Var3.j(g61Var2);
                            Object objK9 = h02Var3.K();
                            if (zX3) {
                                l76Var3 = l76Var2;
                            } else {
                                l76Var3 = l76Var2;
                                if (objK9 != l76Var3) {
                                    ob3Var3 = ob3Var5;
                                }
                                ob3Var5 = ob3Var3;
                                ad.y(nm0VarM1, (my1) objK9, null, dz5.r, null, false, null, null, h02Var3, 3078, 500);
                                list2 = list2;
                                l76Var2 = l76Var3;
                            }
                            ob3Var3 = ob3Var5;
                            objK9 = new gt(xy1Var2, g61Var2, ob3Var3, (byte) 1);
                            h02Var3.i0(objK9);
                            ob3Var5 = ob3Var3;
                            ad.y(nm0VarM1, (my1) objK9, null, dz5.r, null, false, null, null, h02Var3, 3078, 500);
                            list2 = list2;
                            l76Var2 = l76Var3;
                        }
                        ob3 ob3Var7 = ob3Var5;
                        l76 l76Var5 = l76Var2;
                        h02Var3.b(false);
                        if (list2.isEmpty()) {
                            h02Var3.X(-2121922663);
                        } else {
                            h02Var3.X(-899735064);
                            m50.p(ue5.g0(g73Var2, f2, f3, 1), 0.0f, 0L, h02Var3, 6, 6);
                        }
                        h02Var3.b(false);
                        my1 my1Var2 = my1Var;
                        boolean zX4 = h02Var3.x(my1Var2);
                        Object objK10 = h02Var3.K();
                        if (zX4 || objK10 == l76Var5) {
                            objK10 = new bm0(my1Var2, ob3Var7, (byte) 1);
                            h02Var3.i0(objK10);
                        }
                        ad.y(dz5.n, (my1) objK10, null, dz5.v, null, false, null, null, h02Var3, 3078, 500);
                    } else {
                        h02Var3.Q();
                    }
                    return og5.g;
                }
            }, h02Var2), h02Var2, 48, 2044);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new k71(g61Var, list, my1Var, xy1Var, i2, (byte) 0);
        }
    }

    public static final int s(h02 h02Var) {
        h02Var.getClass();
        return Long.hashCode(h02Var.T);
    }

    public static int t(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            l0.u(du4.w(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            l0.p(du4.q(size, size2, "toIndex (", ") is greater than size (", ")."));
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iF = c93.f((Comparable) arrayList.get(i4), comparable);
            if (iF < 0) {
                i2 = i4 + 1;
            } else {
                if (iF <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int u(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r2v16, types: [pi1] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r39v0, types: [h02] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v24 */
    public static final void v(final j73 j73Var, cj cjVar, final xy1 xy1Var, final boolean z2, final Map map, final k85 k85Var, final int i2, final boolean z3, final int i3, final int i4, final ku1 ku1Var, final xy1 xy1Var2, h02 h02Var, final int i5, final int i6) {
        int i7;
        int i8;
        o75 o75Var;
        my1 my1Var;
        fp3 fp3Var;
        ob3 ob3Var;
        ob3 ob3Var2;
        xy1 xy1Var3;
        Object obj;
        Object zdVar;
        boolean z4;
        ?? r4;
        Object obj2;
        Object obj3;
        Object obj4;
        ?? arrayList;
        int i9;
        final cj cjVar2 = cjVar;
        h02Var.Z(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (h02Var.x(j73Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= h02Var.x(cjVar2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= h02Var.j(xy1Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= h02Var.l(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= h02Var.j(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= h02Var.x(k85Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= h02Var.n(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= h02Var.l(z3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= h02Var.n(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= h02Var.n(i4) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (h02Var.j(ku1Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= h02Var.j(null) ? 32 : 16;
        }
        int i10 = i7;
        if ((i6 & 384) == 0) {
            i8 |= h02Var.j(null) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= h02Var.j(xy1Var2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? h02Var.x(null) : h02Var.j(null) ? 16384 : 8192;
        }
        if (h02Var.N(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zA = jr2.A(cjVar2);
            l76 l76Var = oo0.g;
            if (zA) {
                h02Var.X(145641571);
                boolean z5 = (i10 & 112) == 32;
                Object objK = h02Var.K();
                Object obj5 = objK;
                if (z5 || objK == l76Var) {
                    o75 o75Var2 = new o75(cjVar2);
                    h02Var.i0(o75Var2);
                    obj5 = o75Var2;
                }
                o75Var = (o75) obj5;
                h02Var.b(false);
            } else {
                h02Var.X(145707228);
                h02Var.b(false);
                o75Var = null;
            }
            if (jr2.A(cjVar2)) {
                h02Var.X(145905443);
                boolean zX = ((i10 & 112) == 32) | h02Var.x(o75Var);
                Object objK2 = h02Var.K();
                Object obj6 = objK2;
                if (zX || objK2 == l76Var) {
                    p2 p2Var = new p2(o75Var, cjVar2, (byte) 11);
                    h02Var.i0(p2Var);
                    obj6 = p2Var;
                }
                my1Var = (my1) obj6;
                h02Var.b(false);
            } else {
                h02Var.X(146002721);
                boolean z6 = (i10 & 112) == 32;
                Object objK3 = h02Var.K();
                Object obj7 = objK3;
                if (z6 || objK3 == l76Var) {
                    qd qdVar = new qd((Object) cjVar2, (byte) 8);
                    h02Var.i0(qdVar);
                    obj7 = qdVar;
                }
                my1Var = (my1) obj7;
                h02Var.b(false);
            }
            if (z2) {
                if (map != null) {
                    fp3 fp3Var2 = gj.g;
                    if (map.isEmpty()) {
                        fp3Var = gj.g;
                    } else {
                        int length = cjVar2.t.length();
                        List list = cjVar2.j;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                List list2 = list;
                                bj bjVar = (bj) list.get(i11);
                                int i12 = size;
                                if (bjVar.g instanceof qx4) {
                                    i9 = i11;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(bjVar.n) && dj.y(0, length, bjVar.y, bjVar.r)) {
                                        arrayList.add(pg6.n(bjVar));
                                    }
                                } else {
                                    i9 = i11;
                                }
                                i11 = i9 + 1;
                                size = i12;
                                list = list2;
                            }
                        } else {
                            arrayList = pi1.j;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        int i13 = 0;
                        ?? r2 = arrayList;
                        while (i13 < size2) {
                            fj.w(map.get(((bj) r2.get(i13)).g));
                            i13++;
                            r2 = r2;
                        }
                        fp3Var = new fp3(arrayList2, arrayList3);
                    }
                } else {
                    fp3Var = gj.g;
                }
                ob3Var = null;
            } else {
                o75Var = o75Var;
                ob3Var = null;
                fp3Var = new fp3(null, null);
            }
            List list3 = (List) fp3Var.j;
            List list4 = (List) fp3Var.t;
            if (z2) {
                h02Var.X(146318828);
                Object objK4 = h02Var.K();
                if (objK4 == l76Var) {
                    obj4 = objK4;
                    tp3 tp3VarM = kq2.M(ob3Var);
                    h02Var.i0(tp3VarM);
                    obj4 = tp3VarM;
                }
                obj4 = objK4;
                ob3Var2 = (ob3) obj4;
                h02Var.b(false);
            } else {
                h02Var.X(146406588);
                h02Var.b(false);
                ob3Var2 = ob3Var;
            }
            if (z2) {
                h02Var.X(146499837);
                boolean zX2 = h02Var.x(ob3Var2);
                Object objK5 = h02Var.K();
                if (zX2 || objK5 == l76Var) {
                    obj3 = objK5;
                    ff ffVar = new ff(ob3Var2, (byte) 5);
                    h02Var.i0(ffVar);
                    obj3 = ffVar;
                }
                h02Var.b(false);
                xy1Var3 = (xy1) obj3;
            } else {
                h02Var.X(146571260);
                h02Var.b(false);
                xy1Var3 = null;
            }
            int i14 = (i10 >> 3) & 14;
            ob3 ob3Var3 = ob3Var2;
            final o75 o75Var3 = o75Var;
            jz.g(cjVar, k85Var, ku1Var, list3, z3, h02Var);
            cjVar2 = cjVar;
            cj cjVar3 = (cj) my1Var.g();
            boolean zJ = h02Var.j(o75Var3) | ((i10 & 896) == 256);
            Object objK6 = h02Var.K();
            Object obj8 = objK6;
            if (zJ || objK6 == l76Var) {
                ez ezVar = new ez(o75Var3, xy1Var, (byte) 0);
                h02Var.i0(ezVar);
                obj8 = ezVar;
            }
            j73 j73VarP = P(j73Var, cjVar3, k85Var, (xy1) obj8, i2, z3, i3, i4, ku1Var, list3, xy1Var3, xy1Var2);
            if (z2) {
                h02Var.X(147956465);
                boolean zJ2 = h02Var.j(o75Var3);
                Object objK7 = h02Var.K();
                if (zJ2 || objK7 == l76Var) {
                    obj = objK7;
                    final byte b2 = 1;
                    my1 my1Var2 = new my1() { // from class: fz
                        @Override // defpackage.my1
                        public final Object g() {
                            i75 i75Var;
                            i75 i75Var2;
                            byte b3 = b2;
                            boolean zP = false;
                            cj cjVar4 = null;
                            o75 o75Var4 = o75Var3;
                            switch (b3) {
                                case 0:
                                    if (o75Var4 != null) {
                                        cj cjVar5 = o75Var4.y;
                                        j75 j75Var = (j75) o75Var4.g.getValue();
                                        if (j75Var != null && (i75Var = j75Var.g) != null) {
                                            cjVar4 = i75Var.g;
                                        }
                                        zP = yf2.p(cjVar5, cjVar4);
                                    }
                                    return Boolean.valueOf(zP);
                                default:
                                    if (o75Var4 != null) {
                                        cj cjVar6 = o75Var4.y;
                                        j75 j75Var2 = (j75) o75Var4.g.getValue();
                                        if (j75Var2 != null && (i75Var2 = j75Var2.g) != null) {
                                            cjVar4 = i75Var2.g;
                                        }
                                        zP = yf2.p(cjVar6, cjVar4);
                                    }
                                    return Boolean.valueOf(zP);
                            }
                        }
                    };
                    h02Var.i0(my1Var2);
                    obj = my1Var2;
                }
                my1 my1Var3 = (my1) obj;
                boolean zX3 = h02Var.x(ob3Var3);
                Object objK8 = h02Var.K();
                Object obj9 = objK8;
                if (zX3 || objK8 == l76Var) {
                    ef efVar = new ef(ob3Var3, (byte) 8);
                    h02Var.i0(efVar);
                    obj9 = efVar;
                }
                zdVar = new zd(my1Var3, (my1) obj9, (byte) 1);
                h02Var.b(false);
            } else {
                h02Var.X(147779703);
                boolean zJ3 = h02Var.j(o75Var3);
                Object objK9 = h02Var.K();
                if (zJ3 || objK9 == l76Var) {
                    r4 = 0;
                    final boolean z7 = false ? 1 : 0;
                    my1 my1Var4 = new my1() { // from class: fz
                        @Override // defpackage.my1
                        public final Object g() {
                            i75 i75Var;
                            i75 i75Var2;
                            byte b3 = z7;
                            boolean zP = false;
                            cj cjVar4 = null;
                            o75 o75Var4 = o75Var3;
                            switch (b3) {
                                case 0:
                                    if (o75Var4 != null) {
                                        cj cjVar5 = o75Var4.y;
                                        j75 j75Var = (j75) o75Var4.g.getValue();
                                        if (j75Var != null && (i75Var = j75Var.g) != null) {
                                            cjVar4 = i75Var.g;
                                        }
                                        zP = yf2.p(cjVar5, cjVar4);
                                    }
                                    return Boolean.valueOf(zP);
                                default:
                                    if (o75Var4 != null) {
                                        cj cjVar6 = o75Var4.y;
                                        j75 j75Var2 = (j75) o75Var4.g.getValue();
                                        if (j75Var2 != null && (i75Var2 = j75Var2.g) != null) {
                                            cjVar4 = i75Var2.g;
                                        }
                                        zP = yf2.p(cjVar6, cjVar4);
                                    }
                                    return Boolean.valueOf(zP);
                            }
                        }
                    };
                    h02Var.i0(my1Var4);
                    obj2 = my1Var4;
                } else {
                    r4 = 0;
                    obj2 = objK9;
                }
                zdVar = new rv2((my1) obj2, r4);
                h02Var.b(r4);
            }
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarP);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, zdVar);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            if (o75Var3 == null) {
                h02Var.X(-433557001);
                z4 = false;
            } else {
                z4 = false;
                h02Var.X(-291080374);
                o75Var3.g(0, h02Var);
            }
            h02Var.b(z4);
            if (list4 == null) {
                h02Var.X(-433506223);
            } else {
                h02Var.X(-433506222);
                gj.g(cjVar2, list4, h02Var, i14);
            }
            h02Var.b(z4);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: gz
                @Override // defpackage.bz1
                public final Object l(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int iJ = aq2.J(i5 | 1);
                    int iJ2 = aq2.J(i6);
                    j73 j73Var2 = j73Var;
                    cj cjVar4 = cjVar2;
                    xy1 xy1Var4 = xy1Var;
                    boolean z8 = z2;
                    Map map2 = map;
                    k85 k85Var2 = k85Var;
                    boolean z9 = i2;
                    boolean z10 = z3;
                    int i15 = i3;
                    boolean z11 = i4;
                    ku1 ku1Var2 = ku1Var;
                    xy1 xy1Var5 = xy1Var2;
                    pw5.v(j73Var2, cjVar4, xy1Var4, z8, map2, k85Var2, z9 ? 1 : 0, z10, i15, z11 ? 1 : 0, ku1Var2, xy1Var5, (h02) obj10, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }

    public static final void x(final j73 j73Var, long j2, float f2, final boolean z2, float f3, h02 h02Var, final int i2) {
        final float f4;
        final long j3;
        final float f5;
        h02Var.Z(-685508568);
        int i3 = i2 | 432 | (h02Var.l(z2) ? 2048 : 1024) | 24576;
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            long j4 = jj0.v;
            j73 j73VarJ = mq4.j(j73Var, 6.0f);
            g73 g73Var = g73.g;
            z50.g(j73VarJ.n(z2 ? y94.s(g73Var, 1.0f, j4, na4.g) : og0.a(g73Var, j4, na4.g)), h02Var, 0);
            f4 = 1.0f;
            f5 = 6.0f;
            j3 = j4;
        } else {
            h02Var.Q();
            f4 = f3;
            j3 = j2;
            f5 = f2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j3, f5, z2, f4, i2) { // from class: l71
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ float q;
                public final /* synthetic */ long t;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(7);
                    pw5.x(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0186  */
    /* JADX WARN: Code duplicated, block: B:123:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:128:0x0202  */
    /* JADX WARN: Code duplicated, block: B:130:0x0228  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0239  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void y(final String str, final j73 j73Var, final k85 k85Var, xy1 xy1Var, int i2, boolean z2, final int i3, int i4, h02 h02Var, final int i5, final int i6) {
        int i7;
        final xy1 xy1Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zJ;
        int i18;
        boolean z3;
        final int i19;
        final int i20;
        final boolean z4;
        u34 u34VarP;
        xy1 xy1Var3;
        int i21;
        boolean z5;
        final ku1 ku1Var;
        Executor executor;
        int i22;
        int i23;
        boolean z6;
        xy1 xy1Var4;
        j73 j73VarN;
        int i24;
        h02Var.Z(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (h02Var.x(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= h02Var.x(k85Var) ? 256 : 128;
        }
        int i25 = i6 & 8;
        if (i25 == 0) {
            if ((i5 & 3072) == 0) {
                xy1Var2 = xy1Var;
                i7 |= h02Var.j(xy1Var2) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 != 0) {
                if ((i5 & 24576) == 0) {
                    i9 = i2;
                    if (h02Var.n(i9)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i7 |= i10;
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    if ((196608 & i5) == 0) {
                        if (h02Var.l(z2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i7 |= i12;
                    }
                    if ((1572864 & i5) == 0) {
                        if (h02Var.n(i3)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i7 |= i24;
                    }
                    i13 = i6 & 128;
                    if (i13 != 0) {
                        if ((12582912 & i5) == 0) {
                            i14 = i4;
                            if (h02Var.n(i14)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i7 |= i15;
                        }
                        i16 = i7 | 100663296;
                        i17 = i7;
                        if ((i6 & 512) != 0) {
                            i16 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zJ = h02Var.x(null);
                            } else {
                                zJ = h02Var.j(null);
                            }
                            if (zJ) {
                                i18 = 536870912;
                            } else {
                                i18 = 268435456;
                            }
                            i16 |= i18;
                        }
                        if ((i16 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (h02Var.N(i16 & 1, z3)) {
                            if (i25 != 0) {
                                xy1Var3 = null;
                            } else {
                                xy1Var3 = xy1Var2;
                            }
                            if (i8 != 0) {
                                i21 = 1;
                            } else {
                                i21 = i9;
                            }
                            if (i11 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i13 != 0) {
                                i14 = 1;
                            }
                            c93.H(i14, i3);
                            if (h02Var.a(vi4.g) == null) {
                                uo1.B();
                                return;
                            }
                            h02Var.X(357055103);
                            h02Var.b(false);
                            ku1Var = (ku1) h02Var.a(hp0.m);
                            executor = (Executor) h02Var.a(jz.g);
                            if (executor == null && jz.y(str.length())) {
                                h02Var.X(-1250263182);
                                final fl2 fl2Var = (fl2) h02Var.a(hp0.c);
                                final j51 j51Var = (j51) h02Var.a(hp0.j);
                                try {
                                    final boolean z7 = z5;
                                    try {
                                        Runnable runnable = new Runnable() { // from class: iz
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                nb3 nb3VarC;
                                                k85 k85Var2 = k85Var;
                                                fl2 fl2Var2 = fl2Var;
                                                String str2 = str;
                                                j51 j51Var2 = j51Var;
                                                ku1 ku1Var2 = ku1Var;
                                                boolean z8 = z7;
                                                Trace.beginSection("BackgroundTextMeasurement");
                                                try {
                                                    at4 at4VarJ = it4.j();
                                                    nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
                                                    if (nb3Var == null || (nb3VarC = nb3Var.C(null, null)) == null) {
                                                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                    }
                                                    try {
                                                        at4 at4VarA = nb3VarC.a();
                                                        try {
                                                            k85 k85VarD = v13.D(k85Var2, fl2Var2);
                                                            pi1 pi1Var = pi1.j;
                                                            kd kdVar = new kd(str2, k85VarD, pi1Var, pi1Var, ku1Var2, j51Var2, z8);
                                                            kdVar.r();
                                                            kdVar.g();
                                                            at4.s(at4VarA);
                                                            nb3VarC.f().v();
                                                            nb3VarC.r();
                                                            Trace.endSection();
                                                        } catch (Throwable th) {
                                                            at4.s(at4VarA);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            nb3VarC.r();
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    Trace.endSection();
                                                    throw th4;
                                                }
                                            }
                                        };
                                        ku1Var = ku1Var;
                                        z5 = z7;
                                        executor.execute(runnable);
                                    } catch (RejectedExecutionException unused) {
                                        ku1Var = ku1Var;
                                        z5 = z7;
                                    }
                                } catch (RejectedExecutionException unused2) {
                                }
                                h02Var.b(false);
                            } else {
                                h02Var.X(-1248455541);
                                h02Var.b(false);
                            }
                            if (xy1Var3 == null) {
                                h02Var.X(358076243);
                                h02Var.b(false);
                                i22 = i14;
                                i23 = i21;
                                j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                                z6 = true;
                                xy1Var4 = xy1Var3;
                            } else {
                                i22 = i14;
                                i23 = i21;
                                h02Var.X(357432497);
                                z6 = true;
                                xy1Var4 = xy1Var3;
                                j73 j73VarP = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                                h02Var.b(false);
                                j73VarN = j73VarP;
                            }
                            y50 y50Var = y50.r;
                            int iHashCode = Long.hashCode(h02Var.T);
                            j73 j73VarW = m50.W(h02Var, j73VarN);
                            tr3 tr3VarQ = h02Var.q();
                            jo0.n.getClass();
                            h02Var.b0();
                            if (h02Var.S) {
                                h02Var.m(um2.Z);
                            } else {
                                h02Var.l0();
                            }
                            xs2.E(tg1.w, h02Var, y50Var);
                            xs2.E(tg1.q, h02Var, tr3VarQ);
                            xs2.D(h02Var);
                            xs2.E(tg1.m, h02Var, j73VarW);
                            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                            h02Var.b(z6);
                            z4 = z5;
                            i20 = i22;
                            i19 = i23;
                            xy1Var2 = xy1Var4;
                        } else {
                            h02Var.Q();
                            i19 = i9;
                            i20 = i14;
                            z4 = z2;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: cz
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iJ = aq2.J(i5 | 1);
                                    String str2 = str;
                                    j73 j73Var2 = j73Var;
                                    k85 k85Var2 = k85Var;
                                    xy1 xy1Var5 = xy1Var2;
                                    byte b2 = i19;
                                    boolean z8 = z4;
                                    int i26 = i3;
                                    boolean z9 = i20;
                                    pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i7 |= 12582912;
                    i14 = i4;
                    i16 = i7 | 100663296;
                    i17 = i7;
                    if ((i6 & 512) != 0) {
                        i16 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zJ = h02Var.x(null);
                        } else {
                            zJ = h02Var.j(null);
                        }
                        if (zJ) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i16 |= i18;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h02Var.N(i16 & 1, z3)) {
                        if (i25 != 0) {
                            xy1Var3 = null;
                        } else {
                            xy1Var3 = xy1Var2;
                        }
                        if (i8 != 0) {
                            i21 = 1;
                        } else {
                            i21 = i9;
                        }
                        if (i11 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        c93.H(i14, i3);
                        if (h02Var.a(vi4.g) == null) {
                            uo1.B();
                            return;
                        }
                        h02Var.X(357055103);
                        h02Var.b(false);
                        ku1Var = (ku1) h02Var.a(hp0.m);
                        executor = (Executor) h02Var.a(jz.g);
                        if (executor == null) {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        } else {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        }
                        if (xy1Var3 == null) {
                            h02Var.X(358076243);
                            h02Var.b(false);
                            i22 = i14;
                            i23 = i21;
                            j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                            z6 = true;
                            xy1Var4 = xy1Var3;
                        } else {
                            i22 = i14;
                            i23 = i21;
                            h02Var.X(357432497);
                            z6 = true;
                            xy1Var4 = xy1Var3;
                            j73 j73VarP2 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                            h02Var.b(false);
                            j73VarN = j73VarP2;
                        }
                        y50 y50Var2 = y50.r;
                        int iHashCode2 = Long.hashCode(h02Var.T);
                        j73 j73VarW2 = m50.W(h02Var, j73VarN);
                        tr3 tr3VarQ2 = h02Var.q();
                        jo0.n.getClass();
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(um2.Z);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(tg1.w, h02Var, y50Var2);
                        xs2.E(tg1.q, h02Var, tr3VarQ2);
                        xs2.D(h02Var);
                        xs2.E(tg1.m, h02Var, j73VarW2);
                        xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode2));
                        h02Var.b(z6);
                        z4 = z5;
                        i20 = i22;
                        i19 = i23;
                        xy1Var2 = xy1Var4;
                    } else {
                        h02Var.Q();
                        i19 = i9;
                        i20 = i14;
                        z4 = z2;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: cz
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iJ = aq2.J(i5 | 1);
                                String str2 = str;
                                j73 j73Var2 = j73Var;
                                k85 k85Var2 = k85Var;
                                xy1 xy1Var5 = xy1Var2;
                                byte b2 = i19;
                                boolean z8 = z4;
                                int i26 = i3;
                                boolean z9 = i20;
                                pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                                return og5.g;
                            }
                        };
                    }
                }
                i7 |= 196608;
                if ((1572864 & i5) == 0) {
                    if (h02Var.n(i3)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i7 |= i24;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    if ((12582912 & i5) == 0) {
                        i14 = i4;
                        if (h02Var.n(i14)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i7 |= i15;
                    }
                    i16 = i7 | 100663296;
                    i17 = i7;
                    if ((i6 & 512) != 0) {
                        i16 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zJ = h02Var.x(null);
                        } else {
                            zJ = h02Var.j(null);
                        }
                        if (zJ) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i16 |= i18;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h02Var.N(i16 & 1, z3)) {
                        if (i25 != 0) {
                            xy1Var3 = null;
                        } else {
                            xy1Var3 = xy1Var2;
                        }
                        if (i8 != 0) {
                            i21 = 1;
                        } else {
                            i21 = i9;
                        }
                        if (i11 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        c93.H(i14, i3);
                        if (h02Var.a(vi4.g) == null) {
                            uo1.B();
                            return;
                        }
                        h02Var.X(357055103);
                        h02Var.b(false);
                        ku1Var = (ku1) h02Var.a(hp0.m);
                        executor = (Executor) h02Var.a(jz.g);
                        if (executor == null) {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        } else {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        }
                        if (xy1Var3 == null) {
                            h02Var.X(358076243);
                            h02Var.b(false);
                            i22 = i14;
                            i23 = i21;
                            j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                            z6 = true;
                            xy1Var4 = xy1Var3;
                        } else {
                            i22 = i14;
                            i23 = i21;
                            h02Var.X(357432497);
                            z6 = true;
                            xy1Var4 = xy1Var3;
                            j73 j73VarP3 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                            h02Var.b(false);
                            j73VarN = j73VarP3;
                        }
                        y50 y50Var3 = y50.r;
                        int iHashCode3 = Long.hashCode(h02Var.T);
                        j73 j73VarW3 = m50.W(h02Var, j73VarN);
                        tr3 tr3VarQ3 = h02Var.q();
                        jo0.n.getClass();
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(um2.Z);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(tg1.w, h02Var, y50Var3);
                        xs2.E(tg1.q, h02Var, tr3VarQ3);
                        xs2.D(h02Var);
                        xs2.E(tg1.m, h02Var, j73VarW3);
                        xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode3));
                        h02Var.b(z6);
                        z4 = z5;
                        i20 = i22;
                        i19 = i23;
                        xy1Var2 = xy1Var4;
                    } else {
                        h02Var.Q();
                        i19 = i9;
                        i20 = i14;
                        z4 = z2;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: cz
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iJ = aq2.J(i5 | 1);
                                String str2 = str;
                                j73 j73Var2 = j73Var;
                                k85 k85Var2 = k85Var;
                                xy1 xy1Var5 = xy1Var2;
                                byte b2 = i19;
                                boolean z8 = z4;
                                int i26 = i3;
                                boolean z9 = i20;
                                pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                                return og5.g;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i14 = i4;
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP4 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP4;
                    }
                    y50 y50Var4 = y50.r;
                    int iHashCode4 = Long.hashCode(h02Var.T);
                    j73 j73VarW4 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ4 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var4);
                    xs2.E(tg1.q, h02Var, tr3VarQ4);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW4);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode4));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 24576;
            i9 = i2;
            i11 = i6 & 32;
            if (i11 != 0) {
                if ((196608 & i5) == 0) {
                    if (h02Var.l(z2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i7 |= i12;
                }
                if ((1572864 & i5) == 0) {
                    if (h02Var.n(i3)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i7 |= i24;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    if ((12582912 & i5) == 0) {
                        i14 = i4;
                        if (h02Var.n(i14)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i7 |= i15;
                    }
                    i16 = i7 | 100663296;
                    i17 = i7;
                    if ((i6 & 512) != 0) {
                        i16 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zJ = h02Var.x(null);
                        } else {
                            zJ = h02Var.j(null);
                        }
                        if (zJ) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i16 |= i18;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h02Var.N(i16 & 1, z3)) {
                        if (i25 != 0) {
                            xy1Var3 = null;
                        } else {
                            xy1Var3 = xy1Var2;
                        }
                        if (i8 != 0) {
                            i21 = 1;
                        } else {
                            i21 = i9;
                        }
                        if (i11 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        c93.H(i14, i3);
                        if (h02Var.a(vi4.g) == null) {
                            uo1.B();
                            return;
                        }
                        h02Var.X(357055103);
                        h02Var.b(false);
                        ku1Var = (ku1) h02Var.a(hp0.m);
                        executor = (Executor) h02Var.a(jz.g);
                        if (executor == null) {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        } else {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        }
                        if (xy1Var3 == null) {
                            h02Var.X(358076243);
                            h02Var.b(false);
                            i22 = i14;
                            i23 = i21;
                            j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                            z6 = true;
                            xy1Var4 = xy1Var3;
                        } else {
                            i22 = i14;
                            i23 = i21;
                            h02Var.X(357432497);
                            z6 = true;
                            xy1Var4 = xy1Var3;
                            j73 j73VarP5 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                            h02Var.b(false);
                            j73VarN = j73VarP5;
                        }
                        y50 y50Var5 = y50.r;
                        int iHashCode5 = Long.hashCode(h02Var.T);
                        j73 j73VarW5 = m50.W(h02Var, j73VarN);
                        tr3 tr3VarQ5 = h02Var.q();
                        jo0.n.getClass();
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(um2.Z);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(tg1.w, h02Var, y50Var5);
                        xs2.E(tg1.q, h02Var, tr3VarQ5);
                        xs2.D(h02Var);
                        xs2.E(tg1.m, h02Var, j73VarW5);
                        xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode5));
                        h02Var.b(z6);
                        z4 = z5;
                        i20 = i22;
                        i19 = i23;
                        xy1Var2 = xy1Var4;
                    } else {
                        h02Var.Q();
                        i19 = i9;
                        i20 = i14;
                        z4 = z2;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: cz
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iJ = aq2.J(i5 | 1);
                                String str2 = str;
                                j73 j73Var2 = j73Var;
                                k85 k85Var2 = k85Var;
                                xy1 xy1Var5 = xy1Var2;
                                byte b2 = i19;
                                boolean z8 = z4;
                                int i26 = i3;
                                boolean z9 = i20;
                                pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                                return og5.g;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i14 = i4;
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP6 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP6;
                    }
                    y50 y50Var6 = y50.r;
                    int iHashCode6 = Long.hashCode(h02Var.T);
                    j73 j73VarW6 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ6 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var6);
                    xs2.E(tg1.q, h02Var, tr3VarQ6);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW6);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode6));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 196608;
            if ((1572864 & i5) == 0) {
                if (h02Var.n(i3)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i7 |= i24;
            }
            i13 = i6 & 128;
            if (i13 != 0) {
                if ((12582912 & i5) == 0) {
                    i14 = i4;
                    if (h02Var.n(i14)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i7 |= i15;
                }
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP7 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP7;
                    }
                    y50 y50Var7 = y50.r;
                    int iHashCode7 = Long.hashCode(h02Var.T);
                    j73 j73VarW7 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ7 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var7);
                    xs2.E(tg1.q, h02Var, tr3VarQ7);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW7);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode7));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i14 = i4;
            i16 = i7 | 100663296;
            i17 = i7;
            if ((i6 & 512) != 0) {
                i16 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zJ = h02Var.x(null);
                } else {
                    zJ = h02Var.j(null);
                }
                if (zJ) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i16 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i16 & 1, z3)) {
                if (i25 != 0) {
                    xy1Var3 = null;
                } else {
                    xy1Var3 = xy1Var2;
                }
                if (i8 != 0) {
                    i21 = 1;
                } else {
                    i21 = i9;
                }
                if (i11 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                c93.H(i14, i3);
                if (h02Var.a(vi4.g) == null) {
                    uo1.B();
                    return;
                }
                h02Var.X(357055103);
                h02Var.b(false);
                ku1Var = (ku1) h02Var.a(hp0.m);
                executor = (Executor) h02Var.a(jz.g);
                if (executor == null) {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                }
                if (xy1Var3 == null) {
                    h02Var.X(358076243);
                    h02Var.b(false);
                    i22 = i14;
                    i23 = i21;
                    j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                    z6 = true;
                    xy1Var4 = xy1Var3;
                } else {
                    i22 = i14;
                    i23 = i21;
                    h02Var.X(357432497);
                    z6 = true;
                    xy1Var4 = xy1Var3;
                    j73 j73VarP8 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                    h02Var.b(false);
                    j73VarN = j73VarP8;
                }
                y50 y50Var8 = y50.r;
                int iHashCode8 = Long.hashCode(h02Var.T);
                j73 j73VarW8 = m50.W(h02Var, j73VarN);
                tr3 tr3VarQ8 = h02Var.q();
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, y50Var8);
                xs2.E(tg1.q, h02Var, tr3VarQ8);
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW8);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode8));
                h02Var.b(z6);
                z4 = z5;
                i20 = i22;
                i19 = i23;
                xy1Var2 = xy1Var4;
            } else {
                h02Var.Q();
                i19 = i9;
                i20 = i14;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: cz
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i5 | 1);
                        String str2 = str;
                        j73 j73Var2 = j73Var;
                        k85 k85Var2 = k85Var;
                        xy1 xy1Var5 = xy1Var2;
                        byte b2 = i19;
                        boolean z8 = z4;
                        int i26 = i3;
                        boolean z9 = i20;
                        pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                        return og5.g;
                    }
                };
            }
        }
        i7 |= 3072;
        xy1Var2 = xy1Var;
        i8 = i6 & 16;
        if (i8 != 0) {
            if ((i5 & 24576) == 0) {
                i9 = i2;
                if (h02Var.n(i9)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i7 |= i10;
            }
            i11 = i6 & 32;
            if (i11 != 0) {
                if ((196608 & i5) == 0) {
                    if (h02Var.l(z2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i7 |= i12;
                }
                if ((1572864 & i5) == 0) {
                    if (h02Var.n(i3)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i7 |= i24;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    if ((12582912 & i5) == 0) {
                        i14 = i4;
                        if (h02Var.n(i14)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i7 |= i15;
                    }
                    i16 = i7 | 100663296;
                    i17 = i7;
                    if ((i6 & 512) != 0) {
                        i16 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zJ = h02Var.x(null);
                        } else {
                            zJ = h02Var.j(null);
                        }
                        if (zJ) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i16 |= i18;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h02Var.N(i16 & 1, z3)) {
                        if (i25 != 0) {
                            xy1Var3 = null;
                        } else {
                            xy1Var3 = xy1Var2;
                        }
                        if (i8 != 0) {
                            i21 = 1;
                        } else {
                            i21 = i9;
                        }
                        if (i11 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        c93.H(i14, i3);
                        if (h02Var.a(vi4.g) == null) {
                            uo1.B();
                            return;
                        }
                        h02Var.X(357055103);
                        h02Var.b(false);
                        ku1Var = (ku1) h02Var.a(hp0.m);
                        executor = (Executor) h02Var.a(jz.g);
                        if (executor == null) {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        } else {
                            h02Var.X(-1248455541);
                            h02Var.b(false);
                        }
                        if (xy1Var3 == null) {
                            h02Var.X(358076243);
                            h02Var.b(false);
                            i22 = i14;
                            i23 = i21;
                            j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                            z6 = true;
                            xy1Var4 = xy1Var3;
                        } else {
                            i22 = i14;
                            i23 = i21;
                            h02Var.X(357432497);
                            z6 = true;
                            xy1Var4 = xy1Var3;
                            j73 j73VarP9 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                            h02Var.b(false);
                            j73VarN = j73VarP9;
                        }
                        y50 y50Var9 = y50.r;
                        int iHashCode9 = Long.hashCode(h02Var.T);
                        j73 j73VarW9 = m50.W(h02Var, j73VarN);
                        tr3 tr3VarQ9 = h02Var.q();
                        jo0.n.getClass();
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(um2.Z);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(tg1.w, h02Var, y50Var9);
                        xs2.E(tg1.q, h02Var, tr3VarQ9);
                        xs2.D(h02Var);
                        xs2.E(tg1.m, h02Var, j73VarW9);
                        xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode9));
                        h02Var.b(z6);
                        z4 = z5;
                        i20 = i22;
                        i19 = i23;
                        xy1Var2 = xy1Var4;
                    } else {
                        h02Var.Q();
                        i19 = i9;
                        i20 = i14;
                        z4 = z2;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: cz
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iJ = aq2.J(i5 | 1);
                                String str2 = str;
                                j73 j73Var2 = j73Var;
                                k85 k85Var2 = k85Var;
                                xy1 xy1Var5 = xy1Var2;
                                byte b2 = i19;
                                boolean z8 = z4;
                                int i26 = i3;
                                boolean z9 = i20;
                                pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                                return og5.g;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i14 = i4;
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP10 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP10;
                    }
                    y50 y50Var10 = y50.r;
                    int iHashCode10 = Long.hashCode(h02Var.T);
                    j73 j73VarW10 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ10 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var10);
                    xs2.E(tg1.q, h02Var, tr3VarQ10);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW10);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode10));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 196608;
            if ((1572864 & i5) == 0) {
                if (h02Var.n(i3)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i7 |= i24;
            }
            i13 = i6 & 128;
            if (i13 != 0) {
                if ((12582912 & i5) == 0) {
                    i14 = i4;
                    if (h02Var.n(i14)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i7 |= i15;
                }
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP11 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP11;
                    }
                    y50 y50Var11 = y50.r;
                    int iHashCode11 = Long.hashCode(h02Var.T);
                    j73 j73VarW11 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ11 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var11);
                    xs2.E(tg1.q, h02Var, tr3VarQ11);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW11);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode11));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i14 = i4;
            i16 = i7 | 100663296;
            i17 = i7;
            if ((i6 & 512) != 0) {
                i16 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zJ = h02Var.x(null);
                } else {
                    zJ = h02Var.j(null);
                }
                if (zJ) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i16 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i16 & 1, z3)) {
                if (i25 != 0) {
                    xy1Var3 = null;
                } else {
                    xy1Var3 = xy1Var2;
                }
                if (i8 != 0) {
                    i21 = 1;
                } else {
                    i21 = i9;
                }
                if (i11 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                c93.H(i14, i3);
                if (h02Var.a(vi4.g) == null) {
                    uo1.B();
                    return;
                }
                h02Var.X(357055103);
                h02Var.b(false);
                ku1Var = (ku1) h02Var.a(hp0.m);
                executor = (Executor) h02Var.a(jz.g);
                if (executor == null) {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                }
                if (xy1Var3 == null) {
                    h02Var.X(358076243);
                    h02Var.b(false);
                    i22 = i14;
                    i23 = i21;
                    j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                    z6 = true;
                    xy1Var4 = xy1Var3;
                } else {
                    i22 = i14;
                    i23 = i21;
                    h02Var.X(357432497);
                    z6 = true;
                    xy1Var4 = xy1Var3;
                    j73 j73VarP12 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                    h02Var.b(false);
                    j73VarN = j73VarP12;
                }
                y50 y50Var12 = y50.r;
                int iHashCode12 = Long.hashCode(h02Var.T);
                j73 j73VarW12 = m50.W(h02Var, j73VarN);
                tr3 tr3VarQ12 = h02Var.q();
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, y50Var12);
                xs2.E(tg1.q, h02Var, tr3VarQ12);
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW12);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode12));
                h02Var.b(z6);
                z4 = z5;
                i20 = i22;
                i19 = i23;
                xy1Var2 = xy1Var4;
            } else {
                h02Var.Q();
                i19 = i9;
                i20 = i14;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: cz
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i5 | 1);
                        String str2 = str;
                        j73 j73Var2 = j73Var;
                        k85 k85Var2 = k85Var;
                        xy1 xy1Var5 = xy1Var2;
                        byte b2 = i19;
                        boolean z8 = z4;
                        int i26 = i3;
                        boolean z9 = i20;
                        pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                        return og5.g;
                    }
                };
            }
        }
        i7 |= 24576;
        i9 = i2;
        i11 = i6 & 32;
        if (i11 != 0) {
            if ((196608 & i5) == 0) {
                if (h02Var.l(z2)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i7 |= i12;
            }
            if ((1572864 & i5) == 0) {
                if (h02Var.n(i3)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i7 |= i24;
            }
            i13 = i6 & 128;
            if (i13 != 0) {
                if ((12582912 & i5) == 0) {
                    i14 = i4;
                    if (h02Var.n(i14)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i7 |= i15;
                }
                i16 = i7 | 100663296;
                i17 = i7;
                if ((i6 & 512) != 0) {
                    i16 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zJ = h02Var.x(null);
                    } else {
                        zJ = h02Var.j(null);
                    }
                    if (zJ) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
                if ((i16 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i16 & 1, z3)) {
                    if (i25 != 0) {
                        xy1Var3 = null;
                    } else {
                        xy1Var3 = xy1Var2;
                    }
                    if (i8 != 0) {
                        i21 = 1;
                    } else {
                        i21 = i9;
                    }
                    if (i11 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    c93.H(i14, i3);
                    if (h02Var.a(vi4.g) == null) {
                        uo1.B();
                        return;
                    }
                    h02Var.X(357055103);
                    h02Var.b(false);
                    ku1Var = (ku1) h02Var.a(hp0.m);
                    executor = (Executor) h02Var.a(jz.g);
                    if (executor == null) {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1248455541);
                        h02Var.b(false);
                    }
                    if (xy1Var3 == null) {
                        h02Var.X(358076243);
                        h02Var.b(false);
                        i22 = i14;
                        i23 = i21;
                        j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                        z6 = true;
                        xy1Var4 = xy1Var3;
                    } else {
                        i22 = i14;
                        i23 = i21;
                        h02Var.X(357432497);
                        z6 = true;
                        xy1Var4 = xy1Var3;
                        j73 j73VarP13 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                        h02Var.b(false);
                        j73VarN = j73VarP13;
                    }
                    y50 y50Var13 = y50.r;
                    int iHashCode13 = Long.hashCode(h02Var.T);
                    j73 j73VarW13 = m50.W(h02Var, j73VarN);
                    tr3 tr3VarQ13 = h02Var.q();
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, y50Var13);
                    xs2.E(tg1.q, h02Var, tr3VarQ13);
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW13);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode13));
                    h02Var.b(z6);
                    z4 = z5;
                    i20 = i22;
                    i19 = i23;
                    xy1Var2 = xy1Var4;
                } else {
                    h02Var.Q();
                    i19 = i9;
                    i20 = i14;
                    z4 = z2;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: cz
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iJ = aq2.J(i5 | 1);
                            String str2 = str;
                            j73 j73Var2 = j73Var;
                            k85 k85Var2 = k85Var;
                            xy1 xy1Var5 = xy1Var2;
                            byte b2 = i19;
                            boolean z8 = z4;
                            int i26 = i3;
                            boolean z9 = i20;
                            pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                            return og5.g;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i14 = i4;
            i16 = i7 | 100663296;
            i17 = i7;
            if ((i6 & 512) != 0) {
                i16 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zJ = h02Var.x(null);
                } else {
                    zJ = h02Var.j(null);
                }
                if (zJ) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i16 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i16 & 1, z3)) {
                if (i25 != 0) {
                    xy1Var3 = null;
                } else {
                    xy1Var3 = xy1Var2;
                }
                if (i8 != 0) {
                    i21 = 1;
                } else {
                    i21 = i9;
                }
                if (i11 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                c93.H(i14, i3);
                if (h02Var.a(vi4.g) == null) {
                    uo1.B();
                    return;
                }
                h02Var.X(357055103);
                h02Var.b(false);
                ku1Var = (ku1) h02Var.a(hp0.m);
                executor = (Executor) h02Var.a(jz.g);
                if (executor == null) {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                }
                if (xy1Var3 == null) {
                    h02Var.X(358076243);
                    h02Var.b(false);
                    i22 = i14;
                    i23 = i21;
                    j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                    z6 = true;
                    xy1Var4 = xy1Var3;
                } else {
                    i22 = i14;
                    i23 = i21;
                    h02Var.X(357432497);
                    z6 = true;
                    xy1Var4 = xy1Var3;
                    j73 j73VarP14 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                    h02Var.b(false);
                    j73VarN = j73VarP14;
                }
                y50 y50Var14 = y50.r;
                int iHashCode14 = Long.hashCode(h02Var.T);
                j73 j73VarW14 = m50.W(h02Var, j73VarN);
                tr3 tr3VarQ14 = h02Var.q();
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, y50Var14);
                xs2.E(tg1.q, h02Var, tr3VarQ14);
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW14);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode14));
                h02Var.b(z6);
                z4 = z5;
                i20 = i22;
                i19 = i23;
                xy1Var2 = xy1Var4;
            } else {
                h02Var.Q();
                i19 = i9;
                i20 = i14;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: cz
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i5 | 1);
                        String str2 = str;
                        j73 j73Var2 = j73Var;
                        k85 k85Var2 = k85Var;
                        xy1 xy1Var5 = xy1Var2;
                        byte b2 = i19;
                        boolean z8 = z4;
                        int i26 = i3;
                        boolean z9 = i20;
                        pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                        return og5.g;
                    }
                };
            }
        }
        i7 |= 196608;
        if ((1572864 & i5) == 0) {
            if (h02Var.n(i3)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i7 |= i24;
        }
        i13 = i6 & 128;
        if (i13 != 0) {
            if ((12582912 & i5) == 0) {
                i14 = i4;
                if (h02Var.n(i14)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i7 |= i15;
            }
            i16 = i7 | 100663296;
            i17 = i7;
            if ((i6 & 512) != 0) {
                i16 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zJ = h02Var.x(null);
                } else {
                    zJ = h02Var.j(null);
                }
                if (zJ) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if ((i16 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i16 & 1, z3)) {
                if (i25 != 0) {
                    xy1Var3 = null;
                } else {
                    xy1Var3 = xy1Var2;
                }
                if (i8 != 0) {
                    i21 = 1;
                } else {
                    i21 = i9;
                }
                if (i11 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                c93.H(i14, i3);
                if (h02Var.a(vi4.g) == null) {
                    uo1.B();
                    return;
                }
                h02Var.X(357055103);
                h02Var.b(false);
                ku1Var = (ku1) h02Var.a(hp0.m);
                executor = (Executor) h02Var.a(jz.g);
                if (executor == null) {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1248455541);
                    h02Var.b(false);
                }
                if (xy1Var3 == null) {
                    h02Var.X(358076243);
                    h02Var.b(false);
                    i22 = i14;
                    i23 = i21;
                    j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                    z6 = true;
                    xy1Var4 = xy1Var3;
                } else {
                    i22 = i14;
                    i23 = i21;
                    h02Var.X(357432497);
                    z6 = true;
                    xy1Var4 = xy1Var3;
                    j73 j73VarP15 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                    h02Var.b(false);
                    j73VarN = j73VarP15;
                }
                y50 y50Var15 = y50.r;
                int iHashCode15 = Long.hashCode(h02Var.T);
                j73 j73VarW15 = m50.W(h02Var, j73VarN);
                tr3 tr3VarQ15 = h02Var.q();
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, y50Var15);
                xs2.E(tg1.q, h02Var, tr3VarQ15);
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW15);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode15));
                h02Var.b(z6);
                z4 = z5;
                i20 = i22;
                i19 = i23;
                xy1Var2 = xy1Var4;
            } else {
                h02Var.Q();
                i19 = i9;
                i20 = i14;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: cz
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(i5 | 1);
                        String str2 = str;
                        j73 j73Var2 = j73Var;
                        k85 k85Var2 = k85Var;
                        xy1 xy1Var5 = xy1Var2;
                        byte b2 = i19;
                        boolean z8 = z4;
                        int i26 = i3;
                        boolean z9 = i20;
                        pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                        return og5.g;
                    }
                };
            }
        }
        i7 |= 12582912;
        i14 = i4;
        i16 = i7 | 100663296;
        i17 = i7;
        if ((i6 & 512) != 0) {
            i16 = i17 | 905969664;
        } else if ((i5 & 805306368) == 0) {
            if ((i5 & 1073741824) == 0) {
                zJ = h02Var.x(null);
            } else {
                zJ = h02Var.j(null);
            }
            if (zJ) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i16 |= i18;
        }
        if ((i16 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i16 & 1, z3)) {
            if (i25 != 0) {
                xy1Var3 = null;
            } else {
                xy1Var3 = xy1Var2;
            }
            if (i8 != 0) {
                i21 = 1;
            } else {
                i21 = i9;
            }
            if (i11 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i13 != 0) {
                i14 = 1;
            }
            c93.H(i14, i3);
            if (h02Var.a(vi4.g) == null) {
                uo1.B();
                return;
            }
            h02Var.X(357055103);
            h02Var.b(false);
            ku1Var = (ku1) h02Var.a(hp0.m);
            executor = (Executor) h02Var.a(jz.g);
            if (executor == null) {
                h02Var.X(-1248455541);
                h02Var.b(false);
            } else {
                h02Var.X(-1248455541);
                h02Var.b(false);
            }
            if (xy1Var3 == null) {
                h02Var.X(358076243);
                h02Var.b(false);
                i22 = i14;
                i23 = i21;
                j73VarN = j73Var.n(new f85(str, k85Var, ku1Var, i23, z5, i3, i22));
                z6 = true;
                xy1Var4 = xy1Var3;
            } else {
                i22 = i14;
                i23 = i21;
                h02Var.X(357432497);
                z6 = true;
                xy1Var4 = xy1Var3;
                j73 j73VarP16 = P(j73Var, new cj(str), k85Var, xy1Var4, i23, z5, i3, i22, (ku1) h02Var.a(hp0.m), null, null, null);
                h02Var.b(false);
                j73VarN = j73VarP16;
            }
            y50 y50Var16 = y50.r;
            int iHashCode16 = Long.hashCode(h02Var.T);
            j73 j73VarW16 = m50.W(h02Var, j73VarN);
            tr3 tr3VarQ16 = h02Var.q();
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, y50Var16);
            xs2.E(tg1.q, h02Var, tr3VarQ16);
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW16);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode16));
            h02Var.b(z6);
            z4 = z5;
            i20 = i22;
            i19 = i23;
            xy1Var2 = xy1Var4;
        } else {
            h02Var.Q();
            i19 = i9;
            i20 = i14;
            z4 = z2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: cz
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i5 | 1);
                    String str2 = str;
                    j73 j73Var2 = j73Var;
                    k85 k85Var2 = k85Var;
                    xy1 xy1Var5 = xy1Var2;
                    byte b2 = i19;
                    boolean z8 = z4;
                    int i26 = i3;
                    boolean z9 = i20;
                    pw5.y(str2, j73Var2, k85Var2, xy1Var5, b2, z8, i26, z9 ? 1 : 0, (h02) obj, iJ, i6);
                    return og5.g;
                }
            };
        }
    }

    public static final Object z(p33 p33Var) {
        Object objA = p33Var.a();
        cm2 cm2Var = objA instanceof cm2 ? (cm2) objA : null;
        if (cm2Var != null) {
            return cm2Var.o;
        }
        return null;
    }

    public abstract Object E(Intent intent, int i2);

    public k2 h(Context context, Object obj) {
        return null;
    }

    public abstract Intent w(Context context, Object obj);
}
