package defpackage;

import android.R;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Matrix;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.AttributeSet;
import android.util.Log;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp4 {
    public static final sj0 A;
    public static final float B;
    public static final sj0 C;
    public static final sj0 D;
    public static final cm1 E;
    public static final Object F;
    public static final /* synthetic */ int G = 0;
    public static ha2 H;
    public static final /* synthetic */ int I = 0;
    public static final /* synthetic */ int J = 0;
    public static final nm0 b;
    public static volatile bp4 g;
    public static final nm0 i;
    public static final nm0 l;
    public static final nm0 m;
    public static final ql1 s;
    public static final nm0 v;
    public static volatile ArrayList y;
    public static final ky2 r = new ky2("RESUME_TOKEN", (byte) 2);
    public static final nm0 n = new nm0(2116252012, false, new hn0(0));
    public static final nm0 x = new nm0(-807698119, false, new hn0(2));
    public static final nm0 j = new nm0(670458629, false, new zm0(5));
    public static final nm0 t = new nm0(-15308989, false, new zm0(6));
    public static final nm0 a = new nm0(-850029218, false, new xm0(27));
    public static final nm0 q = new nm0(-102585985, false, new xm0(24));
    public static final nm0 w = new nm0(1214179773, false, new xm0(25));
    public static final nm0 c = new nm0(1678807860, false, new xm0(26));
    public static final ky2 p = new ky2("COMPLETING_ALREADY", (byte) 2);
    public static final ky2 u = new ky2("COMPLETING_WAITING_CHILDREN", (byte) 2);
    public static final ky2 z = new ky2("COMPLETING_RETRY", (byte) 2);
    public static final ky2 h = new ky2("TOO_LATE_TO_CANCEL", (byte) 2);
    public static final ky2 o = new ky2("SEALED", (byte) 2);
    public static final ji1 f = new ji1(false);
    public static final ji1 k = new ji1(true);
    public static final int[] d = {R.attr.theme, io.appground.blek.R.attr.theme};
    public static final int[] e = {io.appground.blek.R.attr.materialThemeOverlay};

    static {
        byte b2 = 1;
        v = new nm0(-1140115529, false, new hn0(b2));
        byte b3 = 3;
        l = new nm0(337161832, false, new hn0(b3));
        m = new nm0(1548207429, false, new zm0(b3));
        byte b4 = 4;
        i = new nm0(674473485, false, new zm0(b4));
        b = new nm0(411830949, false, new rm0(b4));
        s = new ql1(b2);
        sj0 sj0Var = sj0.b;
        A = sj0Var;
        B = 0.38f;
        C = sj0Var;
        D = sj0.p;
        E = new cm1((byte) 16);
        F = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable B(er1 er1Var, gr1 gr1Var, ou0 ou0Var) throws Throwable {
        xr1 xr1Var;
        u54 u54Var;
        CancellationException cancellationExceptionK;
        if (ou0Var instanceof xr1) {
            xr1Var = (xr1) ou0Var;
            int i2 = xr1Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xr1Var.w = i2 - Integer.MIN_VALUE;
            } else {
                xr1Var = new xr1(ou0Var);
            }
        } else {
            xr1Var = new xr1(ou0Var);
        }
        Object obj = xr1Var.q;
        int i3 = xr1Var.w;
        if (i3 == 0) {
            js2.o(obj);
            u54 u54Var2 = new u54();
            try {
                gr1 db1Var = new db1(gr1Var, u54Var2);
                xr1Var.m = u54Var2;
                xr1Var.w = 1;
                Object objR = er1Var.r(db1Var, xr1Var);
                px0 px0Var = px0.j;
                if (objR == px0Var) {
                    return px0Var;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                u54Var = u54Var2;
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u54Var = xr1Var.m;
            try {
                js2.o(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) u54Var.j;
        if (th3 == null || !th3.equals(th)) {
            fx0 fx0Var = xr1Var.t;
            fx0Var.getClass();
            dh2 dh2Var = (dh2) fx0Var.h(d52.m);
            if (dh2Var == null || !dh2Var.isCancelled() || (cancellationExceptionK = dh2Var.k()) == null || !cancellationExceptionK.equals(th)) {
                if (th3 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    kf6.g(th3, th);
                    throw th3;
                }
                kf6.g(th, th3);
                throw th;
            }
        }
        throw th;
    }

    public static final void C(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kf6.g(th, th2);
            }
        }
    }

    public static final float D(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final String E(BluetoothDevice bluetoothDevice, String str) {
        String name;
        bluetoothDevice.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            name = bluetoothDevice.getAlias();
        } else {
            try {
                Object objInvoke = bluetoothDevice.getClass().getMethod("getAliasName", null).invoke(bluetoothDevice, null);
                name = objInvoke instanceof String ? (String) objInvoke : null;
                if (name == null) {
                    name = bluetoothDevice.getName();
                }
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
                name = bluetoothDevice.getName();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                name = bluetoothDevice.getName();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
                name = bluetoothDevice.getName();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
                name = bluetoothDevice.getName();
            }
        }
        if (name != null && (!tx4.Y(name))) {
            return name;
        }
        if (str != null && (!tx4.Y(str))) {
            return str;
        }
        String address = bluetoothDevice.getAddress();
        address.getClass();
        return du4.i("Unnamed device (", address.substring(bluetoothDevice.getAddress().length() - 2), ")");
    }

    public static final yl0 F(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof yl0) {
                return (yl0) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        l0.z("Not a context of an Activity");
        return null;
    }

    public static final int G(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        columnNames.getClass();
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        int length = columnNames.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = columnNames[i2];
            int i4 = i3 + 1;
            if (str3.length() >= str.length() + 2 && (str3.endsWith(strConcat) || (str3.charAt(0) == '`' && str3.endsWith(str2)))) {
                return i3;
            }
            i2++;
            i3 = i4;
        }
        return -1;
    }

    public static final int H(Cursor cursor, String str) {
        String strD0;
        cursor.getClass();
        int iG = G(cursor, str);
        if (iG >= 0) {
            return iG;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strD0 = pr.d0(columnNames, null, 63);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            strD0 = "unknown";
        }
        l0.w("column '", str, "' does not exist. Available columns: ", strD0);
        return 0;
    }

    public static final ib0 I(mu0 mu0Var) {
        Unsafe unsafe;
        ib0 ib0Var;
        ib0 ib0Var2;
        if (!(mu0Var instanceof ia1)) {
            return new ib0(1, mu0Var);
        }
        ia1 ia1Var = (ia1) mu0Var;
        ky2 ky2Var = pw5.x;
        long j2 = ia1.i;
        loop0: while (true) {
            unsafe = qr.g;
            Object objectVolatile = unsafe.getObjectVolatile(ia1Var, j2);
            ib0Var = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(ia1Var, j2, ky2Var);
                ib0Var2 = null;
                break;
            }
            if (objectVolatile instanceof ib0) {
                do {
                    unsafe = qr.g;
                    if (unsafe.compareAndSwapObject(ia1Var, ia1.i, objectVolatile, ky2Var)) {
                        ib0Var2 = (ib0) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(ia1Var, j2) == objectVolatile);
            } else if (objectVolatile != ky2Var && !(objectVolatile instanceof Throwable)) {
                l0.b(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (ib0Var2 != null) {
            long j3 = ib0.i;
            Object objectVolatile2 = unsafe.getObjectVolatile(ib0Var2, j3);
            if (!(objectVolatile2 instanceof fl0) || ((fl0) objectVolatile2).n == null) {
                unsafe.putIntVolatile(ib0Var2, ib0.w, 536870911);
                unsafe.putObjectVolatile(ib0Var2, j3, i4.j);
                ib0Var = ib0Var2;
            } else {
                ib0Var2.b();
            }
            if (ib0Var != null) {
                return ib0Var;
            }
        }
        return new ib0(2, mu0Var);
    }

    public static bp4 J(Context context) {
        if (g == null) {
            try {
                g = (bp4) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, gp4.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (g == null) {
                g = new ap4();
            }
        }
        return g;
    }

    public static final Object M(Object obj) {
        return obj instanceof hl0 ? js2.j(((hl0) obj).g) : obj;
    }

    public static final tl5 N(tl5 tl5Var, h02 h02Var) {
        Context baseContext = (Context) h02Var.a(sa.y);
        boolean zX = h02Var.x(baseContext) | h02Var.x(tl5Var);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            baseContext.getClass();
            tl5Var.getClass();
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof yl0) {
                    kz0 kz0Var = (kz0) ((s62) a11.u(s62.class, (yl0) baseContext));
                    objK = new u62(kz0Var.g(), tl5Var, new q64(kz0Var.g, kz0Var.y));
                    h02Var.i0(objK);
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            }
            uo1.j(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
            return null;
        }
        return (tl5) objK;
    }

    public static final rf4 O(h02 h02Var) {
        Object[] objArr = new Object[0];
        boolean zN = h02Var.n(0);
        Object objK = h02Var.K();
        if (zN || objK == oo0.g) {
            objK = new lc3((byte) 9);
            h02Var.i0(objK);
        }
        return (rf4) xq2.d(objArr, rf4.m, (my1) objK, h02Var, 0);
    }

    public static j73 P(j73 j73Var, rf4 rf4Var, boolean z2) {
        um3 um3Var = um3.j;
        um3 um3Var2 = z2 ? um3Var : um3.t;
        ja3 ja3Var = rf4Var.v;
        g73 g73Var = g73.g;
        return j73Var.n(um3Var2 == um3Var ? y94.h(g73Var, k72.r) : y94.h(g73Var, k72.y)).n(new sf4(null, null, null, ja3Var, um3Var2, rf4Var, true, true)).n(new ig4(rf4Var, z2));
    }

    public static final void Q(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void R(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final mj1 S(nc5 nc5Var, xy1 xy1Var, Object obj, h02 h02Var) {
        h02Var.U(-422486566, nc5Var);
        boolean zL = nc5Var.l();
        g90 g90Var = nc5Var.g;
        mj1 mj1Var = mj1.a;
        mj1 mj1Var2 = mj1.t;
        mj1 mj1Var3 = mj1.j;
        if (zL) {
            h02Var.X(-212166497);
            h02Var.b(false);
            if (((Boolean) xy1Var.a(obj)).booleanValue()) {
                mj1Var = mj1Var2;
            } else if (!((Boolean) xy1Var.a(g90Var.n())).booleanValue()) {
                mj1Var = mj1Var3;
            }
        } else {
            h02Var.X(-211886815);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = kq2.M(Boolean.FALSE);
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object value = nc5Var.v.getValue();
            if (((Boolean) xy1Var.a(g90Var.n())).booleanValue() || (value != null && ((Boolean) xy1Var.a(value)).booleanValue())) {
                ob3Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) xy1Var.a(obj)).booleanValue()) {
                mj1Var = mj1Var2;
            } else if ((value != null && ((Boolean) xy1Var.a(value)).booleanValue()) || !((Boolean) ob3Var.getValue()).booleanValue()) {
                mj1Var = mj1Var3;
            }
            h02Var.b(false);
        }
        h02Var.b(false);
        return mj1Var;
    }

    public static int T(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final g61 U(BluetoothDevice bluetoothDevice) {
        boolean z2;
        bluetoothDevice.getClass();
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Integer numValueOf = bluetoothClass != null ? Integer.valueOf(bluetoothClass.getMajorDeviceClass()) : null;
        boolean z3 = true;
        if ((numValueOf != null && numValueOf.intValue() == 512) || (numValueOf != null && numValueOf.intValue() == 256)) {
            z2 = z3;
        } else {
            ParcelUuid[] uuids = bluetoothDevice.getUuids();
            if (uuids != null) {
                int length = uuids.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z3 = false;
                        break;
                    }
                    String string = uuids[i2].toString();
                    string.getClass();
                    if (string.equals("00001112-0000-1000-8000-00805f9b34fb") || string.equals("0000111f-0000-1000-8000-00805f9b34fb")) {
                        break;
                    }
                    i2++;
                }
                z2 = z3;
            } else {
                z2 = false;
            }
        }
        String strE = E(bluetoothDevice, null);
        String address = bluetoothDevice.getAddress();
        address.getClass();
        BluetoothClass bluetoothClass2 = bluetoothDevice.getBluetoothClass();
        return new g61(strE, address, bluetoothClass2 != null ? bluetoothClass2.getMajorDeviceClass() : 0, z2, 130040);
    }

    public static final Object V(Object obj) {
        xa2 xa2Var = obj instanceof xa2 ? (xa2) obj : null;
        return xa2Var != null ? xa2Var.g : obj;
    }

    public static Context W(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z2 = (context instanceof lu0) && ((lu0) context).g == i4;
        if (i4 == 0 || z2) {
            return context;
        }
        lu0 lu0Var = new lu0(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                lu0Var.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, d);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            lu0Var.getTheme().applyStyle(resourceId, true);
        }
        return lu0Var;
    }

    public static Context X(Context context, AttributeSet attributeSet, int i2, int i3) {
        return W(i2, i3, context, attributeSet, new int[0]);
    }

    public static final void a(final boolean z2, final String str, final boolean z3, final boolean z4, final s30 s30Var, final de4 de4Var, final xy1 xy1Var, final my1 my1Var, final my1 my1Var2, h02 h02Var, final int i2) {
        boolean z5;
        ob3 ob3Var;
        str.getClass();
        s30Var.getClass();
        de4Var.getClass();
        xy1Var.getClass();
        my1Var.getClass();
        my1Var2.getClass();
        h02Var.Z(706793394);
        int i3 = i2 | (h02Var.l(z2) ? 4 : 2) | (h02Var.x(str) ? 32 : 16) | (h02Var.l(z3) ? 256 : 128) | (h02Var.l(z4) ? 2048 : 1024) | (h02Var.n(s30Var.ordinal()) ? 16384 : 8192) | (h02Var.n(de4Var.ordinal()) ? 131072 : 65536) | (h02Var.j(xy1Var) ? 1048576 : 524288) | (h02Var.j(my1Var) ? 8388608 : 4194304) | (h02Var.j(my1Var2) ? 67108864 : 33554432);
        if (h02Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = (i3 >> 18) & 14;
            cl0 cl0VarG = sc6.g(xy1Var, h02Var, i4);
            Context context = (Context) h02Var.a(sa.y);
            Object objY = cl0VarG.y();
            boolean zX = h02Var.x(objY) | h02Var.j(context) | h02Var.j(cl0VarG);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            mu0 mu0Var = null;
            if (zX || objK == obj) {
                objK = new mo(objY, context, cl0VarG, mu0Var, (byte) 1);
                h02Var.i0(objK);
            }
            k33.b((bz1) objK, h02Var, objY);
            boolean z6 = (z2 || z3 || Build.VERSION.SDK_INT < 26) ? false : true;
            boolean z7 = z6 && cl0VarG.g() != null;
            boolean zR = dc6.r(z3, z4);
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = kq2.M(Boolean.valueOf(dc6.j(context)));
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == obj) {
                objK3 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK3);
            }
            ob3 ob3Var3 = (ob3) objK3;
            Object objK4 = h02Var.K();
            if (objK4 == obj) {
                objK4 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK4);
            }
            ob3 ob3Var4 = (ob3) objK4;
            Object objK5 = h02Var.K();
            ih0 ih0Var = ih0.j;
            if (objK5 == obj) {
                objK5 = kq2.M(ih0Var);
                h02Var.i0(objK5);
            }
            ob3 ob3Var5 = (ob3) objK5;
            ih0 ih0Var2 = (ih0) ob3Var5.getValue();
            int i5 = i3 & 57344;
            boolean z8 = i5 == 16384;
            Object objK6 = h02Var.K();
            if (z8 || objK6 == obj) {
                objK6 = new mo(s30Var, ob3Var5, ob3Var4, mu0Var, (byte) 2, false);
                h02Var.i0(objK6);
            }
            k33.s(s30Var, ih0Var2, (bz1) objK6, h02Var);
            ob3 ob3VarA = v13.a(((gu2) h02Var.a(ix2.g)).a(), h02Var);
            wt2 wt2Var = (wt2) ob3VarA.getValue();
            Boolean boolValueOf = Boolean.valueOf(zR);
            boolean zL = h02Var.l(zR) | h02Var.x(ob3VarA) | (i5 == 16384) | h02Var.j(context);
            Object objK7 = h02Var.K();
            if (zL || objK7 == obj) {
                z5 = zR;
                ob3Var = ob3Var2;
                objK7 = new j81(z5, s30Var, context, ob3VarA, ob3Var5, ob3Var, ob3Var3, ob3Var4, null);
                ob3Var5 = ob3Var5;
                ob3Var4 = ob3Var4;
                h02Var.i0(objK7);
            } else {
                z5 = zR;
                ob3Var = ob3Var2;
            }
            k33.s(wt2Var, boolValueOf, (bz1) objK7, h02Var);
            boolean zP = yf2.p(objY, f71.g);
            boolean zJ = h02Var.j(cl0VarG);
            Object objK8 = h02Var.K();
            if (zJ || objK8 == obj) {
                objK8 = new qd((Object) cl0VarG, (byte) 16);
                h02Var.i0(objK8);
            }
            my1 my1Var3 = (my1) objK8;
            jh0 jh0VarN = dc6.n(((Boolean) ob3Var.getValue()).booleanValue(), ((Boolean) ob3Var4.getValue()).booleanValue());
            boolean z9 = ((ih0) ob3Var5.getValue()) != ih0Var;
            boolean zJ2 = (i5 == 16384) | ((i3 & 234881024) == 67108864) | h02Var.j(context);
            Object objK9 = h02Var.K();
            if (zJ2 || objK9 == obj) {
                Object qcVar = new qc(s30Var, my1Var2, context, ob3Var5, ob3Var3, (byte) 4);
                h02Var.i0(qcVar);
                objK9 = qcVar;
            }
            z(xy1Var, str, de4Var, zP, my1Var3, my1Var, z6, z7, z5, jh0VarN, z9, (xy1) objK9, h02Var, i4 | (i3 & 112) | ((i3 >> 9) & 896) | (458752 & (i3 >> 6)), 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z2, str, z3, z4, s30Var, de4Var, xy1Var, my1Var, my1Var2, i2) { // from class: z71
                public final /* synthetic */ boolean a;
                public final /* synthetic */ my1 b;
                public final /* synthetic */ xy1 c;
                public final /* synthetic */ my1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ s30 q;
                public final /* synthetic */ String t;
                public final /* synthetic */ de4 w;

                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(1);
                    gp4.a(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, (h02) obj2, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void b(we1 we1Var, h02 h02Var, int i2) {
        we1 we1Var2;
        h02Var.Z(-14377861);
        int i3 = (h02Var.x(we1Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = k33.E(h02Var);
                h02Var.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = pt4.y(new ie1(we1Var, b2));
                h02Var.i0(objK3);
            }
            boolean z2 = ((Boolean) ((bw4) objK3).getValue()).booleanValue() || ((Boolean) ob3Var.getValue()).booleanValue();
            boolean zJ = h02Var.j(ox0Var) | ((i3 & 14) == 4);
            Object objK4 = h02Var.K();
            if (zJ || objK4 == l76Var) {
                we1Var2 = we1Var;
                sg sgVar = new sg(ox0Var, ob3Var, we1Var2, null, (byte) 2);
                h02Var.i0(sgVar);
                objK4 = sgVar;
            } else {
                we1Var2 = we1Var;
            }
            sp2.g(0, (bz1) objK4, h02Var, z2);
        } else {
            we1Var2 = we1Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new f(we1Var2, i2, (byte) 16);
        }
    }

    public static final void c(String str, my1 my1Var, h02 h02Var, int i2) {
        int i3;
        byte b2;
        h02 h02Var2;
        sx1 sx1Var;
        my1 my1Var2 = my1Var;
        my1Var2.getClass();
        h02Var.Z(-805585705);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var.x(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(my1Var2) ? 32 : 16;
        }
        int i4 = i3;
        if (h02Var.N(i4 & 1, (i4 & 19) != 18)) {
            g73 g73Var = g73.g;
            j73 j73VarE0 = ue5.e0(mq4.r(g73Var, 1.0f), 16.0f);
            ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var, 48);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarE0);
            jo0.n.getClass();
            h02Var.b0();
            boolean z2 = h02Var.S;
            sx1 sx1Var2 = um2.Z;
            if (z2) {
                h02Var.m(sx1Var2);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, ek0VarG);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            Integer numValueOf = Integer.valueOf(iHashCode);
            on0 on0Var3 = tg1.c;
            xs2.E(on0Var3, h02Var, numValueOf);
            xs2.D(h02Var);
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            String strJ = xs2.J(io.appground.blek.R.string.connection_ongoing_title, new Object[]{str}, h02Var);
            vf1 vf1Var = of5.g;
            g75.y(strJ, ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).v, h02Var, 48, 0, 131068);
            mq2.y(h02Var, mq4.n(g73Var, 8.0f));
            g75.y(xs2.J(io.appground.blek.R.string.connection_ongoing_message, new Object[]{str}, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).m, h02Var, 48, 0, 130044);
            j00 j00Var = hi0.u;
            j73 j73VarG0 = ue5.g0(g73Var, 0.0f, 8.0f, 1);
            kb4 kb4VarG = jb4.g(v70.y, j00Var, h02Var, 48);
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarG0);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var = sx1Var2;
                h02Var.m(sx1Var);
            } else {
                sx1Var = sx1Var2;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            du4.k(iHashCode2, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW2);
            t92.g(uc6.n(), null, ue5.i0(g73Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), ((rj0) h02Var.a(tj0.g)).g, h02Var, 432, 0);
            sx1 sx1Var3 = sx1Var;
            g75.y(xs2.I(io.appground.blek.R.string.pin_required, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).j, h02Var, 0, 0, 131070);
            h02Var.b(true);
            j73 j73VarI0 = ue5.i0(mq4.r(g73Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            t33 t33VarR = z50.r(hi0.c, false);
            int iHashCode3 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarI0);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var3);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            du4.k(iHashCode3, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW3);
            my1Var2 = my1Var;
            c93.i(my1Var2, null, false, null, null, null, null, a11.p, h02Var, ((i4 >> 3) & 14) | 805306368, 510);
            h02Var2 = h02Var;
            b2 = 1;
            h02Var2.b(true);
            h02Var2.b(true);
        } else {
            b2 = 1;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new qs(str, my1Var2, i2, b2);
        }
    }

    public static final void f(py4 py4Var, j73 j73Var, bz1 bz1Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(py4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.j(bz1Var) ? 256 : 128;
        }
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(h02Var.T);
            f02 f02VarH = pw5.H(h02Var);
            j73 j73VarW = m50.W(h02Var, j73Var);
            tr3 tr3VarQ = h02Var.q();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(py4Var.r, h02Var, py4Var);
            xs2.E(py4Var.n, h02Var, f02VarH);
            xs2.E(py4Var.v, h02Var, bz1Var);
            jo0.n.getClass();
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            h02Var.b(true);
            if (h02Var.e()) {
                h02Var.X(-1259187287);
                h02Var.b(false);
            } else {
                h02Var.X(-1259245908);
                boolean zJ = h02Var.j(py4Var);
                Object objK = h02Var.K();
                if (zJ || objK == oo0.g) {
                    objK = new gd4(py4Var, (byte) 7);
                    h02Var.i0(objK);
                }
                k33.z((my1) objK, h02Var);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) py4Var, j73Var, (jz1) bz1Var, i2, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:135:0x0218  */
    /* JADX WARN: Code duplicated, block: B:138:0x022c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0230  */
    /* JADX WARN: Code duplicated, block: B:142:0x0240  */
    /* JADX WARN: Code duplicated, block: B:144:0x024e  */
    /* JADX WARN: Code duplicated, block: B:145:0x025a  */
    /* JADX WARN: Code duplicated, block: B:152:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0295  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c0 A[LOOP:0: B:160:0x02be->B:161:0x02c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:176:0x031e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0324  */
    /* JADX WARN: Code duplicated, block: B:182:0x0347  */
    /* JADX WARN: Code duplicated, block: B:191:0x037e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0384  */
    /* JADX WARN: Code duplicated, block: B:195:0x0396  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:200:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:210:0x0403  */
    /* JADX WARN: Code duplicated, block: B:211:0x040f  */
    /* JADX WARN: Code duplicated, block: B:213:0x041b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0459  */
    /* JADX WARN: Code duplicated, block: B:222:0x048d  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:234:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:244:0x0518  */
    /* JADX WARN: Code duplicated, block: B:245:0x051a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x052d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0552  */
    /* JADX WARN: Code duplicated, block: B:260:0x0568  */
    /* JADX WARN: Code duplicated, block: B:263:0x0570  */
    /* JADX WARN: Code duplicated, block: B:267:0x0577  */
    /* JADX WARN: Code duplicated, block: B:269:0x057a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0588  */
    /* JADX WARN: Code duplicated, block: B:273:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:277:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:279:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:281:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:283:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:285:0x0613  */
    /* JADX WARN: Code duplicated, block: B:287:0x0620  */
    /* JADX WARN: Code duplicated, block: B:290:0x0625  */
    /* JADX WARN: Code duplicated, block: B:300:0x0639  */
    /* JADX WARN: Code duplicated, block: B:302:0x0652  */
    /* JADX WARN: Code duplicated, block: B:304:0x0673  */
    /* JADX WARN: Code duplicated, block: B:307:0x068e  */
    /* JADX WARN: Code duplicated, block: B:312:0x069e  */
    /* JADX WARN: Code duplicated, block: B:316:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:321:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:323:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:325:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:327:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:329:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:331:0x0705  */
    /* JADX WARN: Code duplicated, block: B:333:0x071b  */
    /* JADX WARN: Code duplicated, block: B:335:0x072a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0743  */
    /* JADX WARN: Code duplicated, block: B:339:0x077a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x0783  */
    /* JADX WARN: Code duplicated, block: B:345:0x07af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:346:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:349:0x07d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:350:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:353:0x0821  */
    /* JADX WARN: Code duplicated, block: B:354:0x082c  */
    /* JADX WARN: Code duplicated, block: B:357:0x084a  */
    /* JADX WARN: Code duplicated, block: B:358:0x0850  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x01d6, please report this as an issue */
    public static final void g(nc5 nc5Var, xy1 xy1Var, j73 j73Var, ek1 ek1Var, dm1 dm1Var, bz1 bz1Var, nm0 nm0Var, h02 h02Var, int i2) {
        h02 h02Var2;
        nm0 nm0Var2;
        Object obj;
        int i3;
        boolean z2;
        Object obj2;
        nc5 nc5Var2;
        boolean zX;
        Object obj3;
        boolean zX2;
        Object obj4;
        ob3 ob3Var;
        tp3 tp3Var;
        Object objN;
        Object value;
        mj1 mj1Var;
        mj1 mj1Var2;
        ek1 ek1Var2;
        tp3 tp3Var2;
        g90 g90Var;
        boolean zX3;
        Object obj5;
        ob3 ob3Var2;
        hn1 hn1Var;
        hn1 hn1Var2;
        ae4 ae4Var;
        ae4 ae4Var2;
        vq4 vq4Var;
        Object objK;
        Object obj6;
        boolean z3;
        vq4 vq4Var2;
        wc0 wc0Var;
        Object objK2;
        Object obj7;
        wc0 wc0Var2;
        dm1 dm1Var2;
        ob3 ob3VarQ;
        boolean zX4;
        Object obj8;
        boolean z4;
        Object obj9;
        ei eiVar;
        ho4 ho4Var;
        te5 te5Var;
        Object objK3;
        Object obj10;
        my1 my1Var;
        boolean z5;
        boolean zJ;
        Object obj11;
        mc5 mc5Var;
        boolean zG;
        mc5 mc5Var2;
        vq4 vq4Var3;
        wc0 wc0Var3;
        ek1 ek1Var3;
        dm1 dm1Var3;
        te5 te5Var2;
        boolean z6;
        boolean z7;
        mc5 mc5Var3;
        te5 te5Var3;
        boolean z8;
        h02 h02Var3;
        cc5 cc5Var;
        h02 h02Var4;
        cc5 cc5Var2;
        cc5 cc5Var3;
        wc0 wc0Var4;
        boolean z9;
        c94 c94Var;
        g73 g73Var;
        j73 sj5Var;
        dm1 dm1Var4;
        te5 te5Var4;
        cc5 cc5Var4;
        boolean z10;
        boolean z11;
        ho4 ho4Var2;
        cc5 cc5Var5;
        cc5 cc5Var6;
        cc5 cc5VarB;
        boolean zJ2;
        Object objK4;
        ho4 ho4Var3;
        ek1 ek1Var4;
        dm1 dm1Var5;
        boolean zJ3;
        Object obj12;
        boolean zL;
        Object obj13;
        Object objK5;
        ei eiVar2;
        Object obj14;
        Object objK6;
        Object obj15;
        Object objK7;
        Object obj16;
        Object objK8;
        Object obj17;
        Object objK9;
        Object obj18;
        Object objK10;
        Object obj19;
        Object objK11;
        h02 h02Var5;
        nm0 nm0Var3;
        Object value2;
        mj1 mj1VarS;
        g90 g90Var2;
        tp3 tp3Var3;
        Object value3;
        boolean z12;
        st4 st4Var;
        int size;
        int i4;
        j73 j73Var2 = j73Var;
        nm0 nm0Var4 = nm0Var;
        h02 h02Var6 = h02Var;
        h02Var6.Z(-1310802509);
        int i5 = (i2 & 6) == 0 ? (h02Var6.x(nc5Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= h02Var6.j(xy1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= h02Var6.x(j73Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= h02Var6.x(ek1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= h02Var6.x(dm1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= h02Var6.j(bz1Var) ? 131072 : 65536;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= h02Var6.j(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= h02Var6.j(nm0Var4) ? 67108864 : 33554432;
        }
        int i7 = i6;
        if (h02Var6.N(i7 & 1, (38347923 & i7) != 38347922)) {
            tp3 tp3Var4 = nc5Var.v;
            tp3 tp3Var5 = nc5Var.n;
            g90 g90Var3 = nc5Var.g;
            Object value4 = tp3Var4.getValue();
            Object objK12 = h02Var6.K();
            l76 l76Var = oo0.g;
            if (objK12 == l76Var) {
                obj = objK12;
                tp3 tp3VarM = kq2.M(Boolean.FALSE);
                h02Var6.i0(tp3VarM);
                obj = tp3VarM;
            }
            obj = objK12;
            ob3 ob3Var3 = (ob3) obj;
            Object objK13 = h02Var6.K();
            Object obj20 = objK13;
            if (objK13 == l76Var) {
                xh xhVar = new xh(ob3Var3, (byte) 0);
                h02Var6.i0(xhVar);
                obj20 = xhVar;
            }
            int i8 = i7 & 14;
            int i9 = i8 | 48;
            yj1.g(nc5Var, (my1) obj20, h02Var6, i9);
            if (value4 != null && ((Boolean) xy1Var.a(value4)).booleanValue()) {
                ob3Var3.setValue(Boolean.TRUE);
            }
            if (((Boolean) xy1Var.a(tp3Var5.getValue())).booleanValue() || ((Boolean) xy1Var.a(g90Var3.n())).booleanValue() || ((value4 != null && ((Boolean) xy1Var.a(value4)).booleanValue()) || ((((Boolean) ob3Var3.getValue()).booleanValue() && !yf2.p(g90Var3.n(), tp3Var5.getValue())) || nc5Var.l() || nc5Var.n()))) {
                h02Var6.X(-273709037);
                int i10 = i9 & 14;
                boolean z13 = ((i10 ^ 6) > 4 && h02Var6.x(nc5Var)) || (i9 & 6) == 4;
                Object objK14 = h02Var6.K();
                if (z13 || objK14 == l76Var) {
                    objK14 = g90Var3.n();
                    h02Var6.i0(objK14);
                }
                if (nc5Var.l()) {
                    objK14 = g90Var3.n();
                }
                h02Var6.X(2016262395);
                mj1 mj1VarS2 = S(nc5Var, xy1Var, objK14, h02Var6);
                h02Var6.b(false);
                Object value5 = tp3Var5.getValue();
                h02Var6.X(2016262395);
                mj1 mj1VarS3 = S(nc5Var, xy1Var, value5, h02Var6);
                h02Var6.b(false);
                int i11 = i10 | 3072;
                int i12 = (i11 & 14) ^ 6;
                if (i12 <= 4 || !h02Var6.x(nc5Var)) {
                    i3 = i11;
                    if ((i3 & 6) != 4) {
                        z2 = false;
                    }
                    Object objK15 = h02Var6.K();
                    if (!z2 || objK15 == l76Var) {
                        nc5 nc5Var3 = new nc5(new pb3(mj1VarS2), nc5Var, nc5Var.r + " > EnterExitTransition");
                        h02Var6.i0(nc5Var3);
                        obj2 = nc5Var3;
                    } else {
                        obj2 = objK15;
                    }
                    nc5Var2 = (nc5) obj2;
                    zX = ((i12 <= 4 && h02Var6.x(nc5Var)) || (i3 & 6) == 4) | h02Var6.x(nc5Var2);
                    Object objK16 = h02Var6.K();
                    obj3 = objK16;
                    if (zX || objK16 == l76Var) {
                        pc5 pc5Var = new pc5(nc5Var, nc5Var2, (byte) 1);
                        h02Var6.i0(pc5Var);
                        obj3 = pc5Var;
                    }
                    k33.j(nc5Var2, (xy1) obj3, h02Var6);
                    if (nc5Var.l()) {
                        nc5Var2.m(mj1VarS2, mj1VarS3);
                    } else {
                        nc5Var2.s(mj1VarS3);
                        nc5Var2.q.setValue(Boolean.FALSE);
                    }
                    if (nc5Var.l()) {
                        h02Var6.X(782538635);
                        h02Var6.b(false);
                    } else {
                        h02Var6.X(782386797);
                        value2 = nc5Var.v.getValue();
                        if (value2 == null) {
                            h02Var6.X(782437481);
                            h02Var6.b(false);
                            mj1VarS = null;
                        } else {
                            h02Var6.X(782437482);
                            h02Var6.X(2016262395);
                            mj1VarS = S(nc5Var, xy1Var, value2, h02Var6);
                            h02Var6.b(false);
                            h02Var6.b(false);
                        }
                        g90Var2 = nc5Var2.g;
                        tp3Var3 = nc5Var2.n;
                        tp3 tp3Var6 = nc5Var2.v;
                        value3 = tp3Var6.getValue();
                        if (value3 == null && mj1VarS == null && yf2.p(tp3Var3.getValue(), g90Var2.n())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        tp3Var6.setValue(mj1VarS);
                        if (z12) {
                            nc5Var2.x.setValue(new gc5(value3, tp3Var3.getValue()));
                            g90Var2.i(value3);
                            if (nc5Var2.j.d() == Long.MIN_VALUE) {
                                nc5Var2.i(true);
                            }
                            st4Var = nc5Var2.a;
                            size = st4Var.size();
                            for (i4 = 0; i4 < size; i4++) {
                                ((hc5) st4Var.get(i4)).i.e(-2.0f);
                            }
                        }
                        h02Var6.b(false);
                    }
                    zX2 = h02Var6.x(nc5Var2);
                    Object objK17 = h02Var6.K();
                    obj4 = objK17;
                    if (zX2 || objK17 == l76Var) {
                        tp3 tp3VarM2 = kq2.M(ek1Var);
                        h02Var6.i0(tp3VarM2);
                        obj4 = tp3VarM2;
                    }
                    ob3Var = (ob3) obj4;
                    g90 g90Var4 = nc5Var2.g;
                    tp3Var = nc5Var2.n;
                    objN = g90Var4.n();
                    value = tp3Var.getValue();
                    mj1Var = mj1.a;
                    mj1Var2 = mj1.t;
                    if (objN == value || nc5Var2.g.n() != mj1Var2) {
                        if (tp3Var.getValue() != mj1Var) {
                            ob3Var.setValue(((ek1) ob3Var.getValue()).g(ek1Var));
                        }
                    } else if (nc5Var2.l()) {
                        ob3Var.setValue(ek1Var);
                    } else {
                        ob3Var.setValue(ek1.y);
                    }
                    ek1Var2 = (ek1) ob3Var.getValue();
                    tp3Var2 = nc5Var2.n;
                    g90Var = nc5Var2.g;
                    zX3 = h02Var6.x(nc5Var2);
                    Object objK18 = h02Var6.K();
                    obj5 = objK18;
                    if (zX3 || objK18 == l76Var) {
                        tp3 tp3VarM3 = kq2.M(dm1Var);
                        h02Var6.i0(tp3VarM3);
                        obj5 = tp3VarM3;
                    }
                    ob3Var2 = (ob3) obj5;
                    if (g90Var.n() != tp3Var2.getValue() && g90Var.n() == mj1Var2) {
                        h02Var6.X(-505142498);
                        h02Var6.b(false);
                        if (nc5Var2.l()) {
                            ob3Var2.setValue(dm1Var);
                        } else {
                            ob3Var2.setValue(dm1.y);
                        }
                    } else if (tp3Var2.getValue() != mj1Var2) {
                        h02Var6.X(-504838512);
                        hn1Var = ((dm1) ob3Var2.getValue()).g.g;
                        if (hn1Var != null) {
                            hn1Var2 = new hn1(1.0f, hn1Var.y);
                        } else {
                            hn1Var2 = null;
                        }
                        ae4Var = ((dm1) ob3Var2.getValue()).g.n;
                        if (ae4Var != null) {
                            ae4Var2 = new ae4(1.0f, ae4Var.y, ae4Var.r);
                        } else {
                            ae4Var2 = null;
                        }
                        vq4Var = ((dm1) ob3Var2.getValue()).g.y;
                        if (vq4Var == null) {
                            h02Var6.X(-504119809);
                            z3 = false;
                            h02Var6.b(false);
                            vq4Var2 = null;
                        } else {
                            h02Var6.X(-708998590);
                            objK = h02Var6.K();
                            if (objK == l76Var) {
                                obj6 = objK;
                                vg vgVar = vg.f;
                                h02Var6.i0(vgVar);
                                obj6 = vgVar;
                            }
                            obj6 = objK;
                            vq4 vq4Var4 = new vq4((xy1) obj6, vq4Var.y);
                            z3 = false;
                            h02Var6.b(false);
                            vq4Var2 = vq4Var4;
                        }
                        wc0Var = ((dm1) ob3Var2.getValue()).g.r;
                        if (wc0Var == null) {
                            h02Var6.X(-504024174);
                            h02Var6.b(z3);
                            wc0Var2 = null;
                        } else {
                            h02Var6.X(-708995505);
                            objK2 = h02Var6.K();
                            if (objK2 == l76Var) {
                                obj7 = objK2;
                                xj1 xj1Var = xj1.a;
                                h02Var6.i0(xj1Var);
                                obj7 = xj1Var;
                            }
                            obj7 = objK2;
                            wc0 wc0Var5 = new wc0(wc0Var.g, (xy1) obj7, wc0Var.r, wc0Var.n);
                            h02Var6.b(false);
                            wc0Var2 = wc0Var5;
                        }
                        mc5 mc5Var4 = ((dm1) ob3Var2.getValue()).g;
                        ob3Var2.setValue(new dm1(new mc5(hn1Var2, vq4Var2, wc0Var2, ae4Var2, (LinkedHashMap) null, 96)).g(dm1Var));
                        h02Var6.b(false);
                    } else {
                        h02Var6.X(-503833306);
                        h02Var6.b(false);
                    }
                    dm1Var2 = (dm1) ob3Var2.getValue();
                    ob3VarQ = kq2.Q(bz1Var, h02Var6);
                    Object objL = bz1Var.l(g90Var.n(), tp3Var2.getValue());
                    zX4 = h02Var6.x(nc5Var2) | h02Var6.x(ob3VarQ);
                    Object objK19 = h02Var6.K();
                    if (!zX4 || objK19 == l76Var) {
                        zh zhVar = new zh(nc5Var2, ob3VarQ, null, (byte) 0);
                        h02Var6.i0(zhVar);
                        obj8 = zhVar;
                    } else {
                        obj8 = objK19;
                    }
                    ob3 ob3VarE = aq2.e((bz1) obj8, h02Var6, objL);
                    if (g90Var.n() != mj1Var && tp3Var2.getValue() == mj1Var && ((Boolean) ob3VarE.getValue()).booleanValue()) {
                        h02Var6.X(-270520625);
                        h02Var6.b(false);
                        nm0Var3 = nm0Var;
                        z8 = false;
                        h02Var5 = h02Var6;
                    } else {
                        h02Var6.X(-272022668);
                        if (i8 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object objK20 = h02Var6.K();
                        obj9 = objK20;
                        if (z4 || objK20 == l76Var) {
                            ei eiVar3 = new ei();
                            h02Var6.i0(eiVar3);
                            obj9 = eiVar3;
                        }
                        eiVar = (ei) obj9;
                        ho4Var = eiVar.y;
                        te5Var = m50.u;
                        objK3 = h02Var6.K();
                        obj10 = objK3;
                        if (objK3 == l76Var) {
                            tj1 tj1Var = tj1.t;
                            h02Var6.i0(tj1Var);
                            obj10 = tj1Var;
                        }
                        my1Var = (my1) obj10;
                        h02Var6.X(-1491182875);
                        h02Var6.b(false);
                        h02Var6.X(-1491180092);
                        h02Var6.b(false);
                        h02Var6.X(-31257052);
                        h02Var6.b(false);
                        if (nc5Var2.v.getValue() != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ho4Var.r(z5);
                        zJ = h02Var6.j(ho4Var);
                        Object objK21 = h02Var6.K();
                        if (!zJ || objK21 == l76Var) {
                            uj1 uj1Var = new uj1(ho4Var, (byte) 1);
                            h02Var6.i0(uj1Var);
                            obj11 = uj1Var;
                        } else {
                            obj11 = objK21;
                        }
                        yj1.g(nc5Var2, (my1) obj11, h02Var6, 0);
                        mc5 mc5Var5 = ek1Var2.g;
                        mc5 mc5Var6 = dm1Var2.g;
                        mc5Var = dm1Var2.g;
                        zG = tf5.g(ho4Var.v, jj0.l);
                        mc5Var2 = ek1Var2.g;
                        vq4Var3 = mc5Var2.y;
                        wc0Var3 = mc5Var2.r;
                        if (vq4Var3 == null || mc5Var.y != null) {
                            ek1Var3 = ek1Var2;
                            dm1Var3 = dm1Var2;
                            te5Var2 = te5Var;
                        } else {
                            ek1Var3 = ek1Var2;
                            dm1Var3 = dm1Var2;
                            te5Var2 = te5Var;
                            if (je2.y(ho4Var.t, 0L)) {
                                z6 = false;
                            }
                            if (wc0Var3 == null || mc5Var.r != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                h02Var.X(1018653691);
                                objK11 = h02Var.K();
                                if (objK11 == l76Var) {
                                    objK11 = "Built-in slide";
                                    h02Var.i0("Built-in slide");
                                }
                                te5 te5Var5 = te5Var2;
                                h02 h02Var7 = h02Var;
                                mc5Var3 = mc5Var2;
                                z8 = false;
                                cc5 cc5VarB2 = ra.b(nc5Var2, te5Var5, (String) objK11, h02Var7, 384, 0);
                                te5Var3 = te5Var5;
                                h02Var7.b(false);
                                cc5Var = cc5VarB2;
                                h02Var4 = h02Var7;
                            } else {
                                mc5Var3 = mc5Var2;
                                te5Var3 = te5Var2;
                                z8 = false;
                                h02Var3 = h02Var;
                                h02Var3.X(1018759494);
                                h02Var3.b(false);
                                cc5Var = null;
                            }
                            if (z7) {
                                h02Var4 = h02Var3;
                                h02Var4.X(1018851285);
                                te5 te5Var6 = m50.z;
                                objK10 = h02Var4.K();
                                if (objK10 == l76Var) {
                                    obj19 = objK10;
                                    h02Var4.i0("Built-in shrink/expand");
                                    obj19 = "Built-in shrink/expand";
                                }
                                obj19 = objK10;
                                cc5 cc5VarB3 = ra.b(nc5Var2, te5Var6, (String) obj19, h02Var4, 384, 0);
                                h02Var4.b(z8);
                                cc5Var2 = cc5VarB3;
                            } else {
                                h02Var4 = h02Var3;
                                h02Var4.X(1018962109);
                                h02Var4.b(z8);
                                cc5Var2 = null;
                            }
                            if (z7) {
                                h02Var4.X(1019035735);
                                objK9 = h02Var4.K();
                                if (objK9 == l76Var) {
                                    obj18 = objK9;
                                    h02Var4.i0("Built-in InterruptionHandlingOffset");
                                    obj18 = "Built-in InterruptionHandlingOffset";
                                }
                                obj18 = objK9;
                                cc5 cc5VarB4 = ra.b(nc5Var2, te5Var3, (String) obj18, h02Var4, 384, 0);
                                h02Var4.b(z8);
                                cc5Var3 = cc5VarB4;
                            } else {
                                h02Var4.X(1019206141);
                                h02Var4.b(z8);
                                cc5Var3 = null;
                            }
                            z9 = ((wc0Var3 != 0 || wc0Var3.n) && ((wc0Var4 = mc5Var.r) == null || wc0Var4.n) && z7) ? z8 ? 1 : 0 : true;
                            c94Var = wj0.v;
                            g73Var = g73.g;
                            if (zG) {
                                h02Var4.X(1020031362);
                                h02Var4.b(z8);
                                sj5Var = g73Var;
                            } else {
                                h02Var4.X(1019733235);
                                te5 te5Var7 = new te5(vg.b, new zg(c94Var, (byte) 3));
                                objK8 = h02Var4.K();
                                if (objK8 == l76Var) {
                                    obj17 = objK8;
                                    h02Var4.i0("Built-in veil");
                                    obj17 = "Built-in veil";
                                }
                                obj17 = objK8;
                                sj5Var = new sj5(nc5Var2, ra.b(nc5Var2, te5Var7, (String) obj17, h02Var4, 384, 0), ek1Var3, dm1Var3, ho4Var);
                                h02Var4.b(z8);
                            }
                            mc5 mc5Var7 = dm1Var3.g;
                            dm1Var4 = dm1Var3;
                            te5Var4 = m50.w;
                            if (mc5Var3.g == null || mc5Var7.g != null) {
                                cc5Var4 = null;
                            } else {
                                cc5Var4 = null;
                                z10 = ho4Var.x == 1.0f ? z8 ? 1 : 0 : true;
                                if (mc5Var3.n != null && mc5Var7.n == null && ho4Var.l == 1.0f) {
                                    z11 = z8 ? 1 : 0;
                                } else {
                                    z11 = true;
                                }
                                if (z10) {
                                    h02Var4.X(-1511865571);
                                    objK7 = h02Var4.K();
                                    if (objK7 == l76Var) {
                                        obj16 = objK7;
                                        h02Var4.i0("Built-in alpha");
                                        obj16 = "Built-in alpha";
                                    }
                                    obj16 = objK7;
                                    ho4Var2 = ho4Var;
                                    cc5 cc5VarB5 = ra.b(nc5Var2, te5Var4, (String) obj16, h02Var4, 384, 0);
                                    h02Var4.b(z8);
                                    cc5Var5 = cc5VarB5;
                                } else {
                                    ho4Var2 = ho4Var;
                                    h02Var4.X(-1511696126);
                                    h02Var4.b(z8);
                                    cc5Var5 = cc5Var4;
                                }
                                if (z11 != 0) {
                                    h02Var4.X(-1511628483);
                                    objK6 = h02Var4.K();
                                    if (objK6 == l76Var) {
                                        obj15 = objK6;
                                        h02Var4.i0("Built-in scale");
                                        obj15 = "Built-in scale";
                                    }
                                    obj15 = objK6;
                                    cc5 cc5VarB6 = ra.b(nc5Var2, te5Var4, (String) obj15, h02Var4, 384, 0);
                                    h02Var4.b(z8);
                                    cc5Var6 = cc5VarB6;
                                } else {
                                    h02Var4.X(-1511459038);
                                    h02Var4.b(z8);
                                    cc5Var6 = cc5Var4;
                                }
                                if (z11) {
                                    h02Var4.X(-1511381382);
                                    cc5VarB = ra.b(nc5Var2, yj1.g, "TransformOriginInterruptionHandling", h02Var4, 384, 0);
                                    h02Var4.b(z8);
                                } else {
                                    h02Var4.X(-1511209054);
                                    h02Var4.b(z8);
                                    cc5VarB = cc5Var4;
                                }
                                zJ2 = h02Var4.j(cc5Var5) | h02Var4.x(ek1Var3) | h02Var4.x(dm1Var4) | h02Var4.j(ho4Var2) | h02Var4.j(cc5Var6) | h02Var4.x(nc5Var2) | h02Var4.j(cc5VarB);
                                objK4 = h02Var4.K();
                                if (!zJ2 || objK4 == l76Var) {
                                    ho4 ho4Var4 = ho4Var2;
                                    ek1 ek1Var5 = ek1Var3;
                                    objK4 = new oj1(cc5Var5, ho4Var4, cc5Var6, nc5Var2, ek1Var5, dm1Var4, cc5VarB);
                                    ho4Var3 = ho4Var4;
                                    ek1Var4 = ek1Var5;
                                    dm1Var5 = dm1Var4;
                                    h02Var4.i0(objK4);
                                } else {
                                    ho4Var3 = ho4Var2;
                                    ek1Var4 = ek1Var3;
                                    dm1Var5 = dm1Var4;
                                }
                                oj1 oj1Var = (oj1) objK4;
                                zJ3 = h02Var4.j(ho4Var3);
                                Object objK22 = h02Var4.K();
                                obj12 = objK22;
                                if (zJ3 || objK22 == l76Var) {
                                    uj1 uj1Var2 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                                    h02Var4.i0(uj1Var2);
                                    obj12 = uj1Var2;
                                }
                                j73 j73VarN = new m73((my1) obj12).n(g73Var);
                                zL = h02Var4.l(z9) | h02Var4.x(my1Var);
                                Object objK23 = h02Var4.K();
                                obj13 = objK23;
                                if (zL || objK23 == l76Var) {
                                    vj1 vj1Var = new vj1(z9, my1Var);
                                    h02Var4.i0(vj1Var);
                                    obj13 = vj1Var;
                                }
                                j73 j73VarN2 = j73VarN.n(yf2.L(g73Var, (xy1) obj13)).n(new nj1(nc5Var2, cc5Var2, cc5Var3, cc5Var, ek1Var4, dm1Var5, ho4Var3, my1Var, oj1Var)).n(sj5Var);
                                h02Var4.X(-1255657861);
                                h02Var4.b(z8);
                                j73Var2 = j73Var;
                                j73 j73VarN3 = j73Var2.n(j73VarN2.n(g73Var));
                                objK5 = h02Var4.K();
                                if (objK5 == l76Var) {
                                    eiVar2 = eiVar;
                                    ph phVar = new ph(eiVar2);
                                    h02Var4.i0(phVar);
                                    obj14 = phVar;
                                } else {
                                    eiVar2 = eiVar;
                                    obj14 = objK5;
                                }
                                ph phVar2 = (ph) obj14;
                                int iHashCode = Long.hashCode(h02Var4.T);
                                tr3 tr3VarQ = h02Var4.q();
                                j73 j73VarW = m50.W(h02Var4, j73VarN3);
                                jo0.n.getClass();
                                h02Var4.b0();
                                if (h02Var4.S) {
                                    h02Var4.m(um2.Z);
                                } else {
                                    h02Var4.l0();
                                }
                                xs2.E(tg1.w, h02Var4, phVar2);
                                xs2.E(tg1.q, h02Var4, tr3VarQ);
                                xs2.A(h02Var4, Integer.valueOf(iHashCode));
                                xs2.D(h02Var4);
                                xs2.E(tg1.m, h02Var4, j73VarW);
                                nm0 nm0Var5 = nm0Var;
                                nm0Var5.x(eiVar2, h02Var4, Integer.valueOf((i7 >> 21) & 112));
                                h02Var4.b(true);
                                h02Var4.b(z8);
                                nm0Var3 = nm0Var5;
                                h02Var5 = h02Var4;
                            }
                            if (mc5Var3.n != null) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (z10) {
                                h02Var4.X(-1511865571);
                                objK7 = h02Var4.K();
                                if (objK7 == l76Var) {
                                    obj16 = objK7;
                                    h02Var4.i0("Built-in alpha");
                                    obj16 = "Built-in alpha";
                                }
                                obj16 = objK7;
                                ho4Var2 = ho4Var;
                                cc5 cc5VarB7 = ra.b(nc5Var2, te5Var4, (String) obj16, h02Var4, 384, 0);
                                h02Var4.b(z8);
                                cc5Var5 = cc5VarB7;
                            } else {
                                ho4Var2 = ho4Var;
                                h02Var4.X(-1511696126);
                                h02Var4.b(z8);
                                cc5Var5 = cc5Var4;
                            }
                            if (z11 != 0) {
                                h02Var4.X(-1511628483);
                                objK6 = h02Var4.K();
                                if (objK6 == l76Var) {
                                    obj15 = objK6;
                                    h02Var4.i0("Built-in scale");
                                    obj15 = "Built-in scale";
                                }
                                obj15 = objK6;
                                cc5 cc5VarB8 = ra.b(nc5Var2, te5Var4, (String) obj15, h02Var4, 384, 0);
                                h02Var4.b(z8);
                                cc5Var6 = cc5VarB8;
                            } else {
                                h02Var4.X(-1511459038);
                                h02Var4.b(z8);
                                cc5Var6 = cc5Var4;
                            }
                            if (z11) {
                                h02Var4.X(-1511381382);
                                cc5VarB = ra.b(nc5Var2, yj1.g, "TransformOriginInterruptionHandling", h02Var4, 384, 0);
                                h02Var4.b(z8);
                            } else {
                                h02Var4.X(-1511209054);
                                h02Var4.b(z8);
                                cc5VarB = cc5Var4;
                            }
                            zJ2 = h02Var4.j(cc5Var5) | h02Var4.x(ek1Var3) | h02Var4.x(dm1Var4) | h02Var4.j(ho4Var2) | h02Var4.j(cc5Var6) | h02Var4.x(nc5Var2) | h02Var4.j(cc5VarB);
                            objK4 = h02Var4.K();
                            if (zJ2) {
                                ho4 ho4Var5 = ho4Var2;
                                ek1 ek1Var6 = ek1Var3;
                                objK4 = new oj1(cc5Var5, ho4Var5, cc5Var6, nc5Var2, ek1Var6, dm1Var4, cc5VarB);
                                ho4Var3 = ho4Var5;
                                ek1Var4 = ek1Var6;
                                dm1Var5 = dm1Var4;
                                h02Var4.i0(objK4);
                            } else {
                                ho4 ho4Var6 = ho4Var2;
                                ek1 ek1Var7 = ek1Var3;
                                objK4 = new oj1(cc5Var5, ho4Var6, cc5Var6, nc5Var2, ek1Var7, dm1Var4, cc5VarB);
                                ho4Var3 = ho4Var6;
                                ek1Var4 = ek1Var7;
                                dm1Var5 = dm1Var4;
                                h02Var4.i0(objK4);
                            }
                            oj1 oj1Var2 = (oj1) objK4;
                            zJ3 = h02Var4.j(ho4Var3);
                            Object objK24 = h02Var4.K();
                            obj12 = objK24;
                            if (zJ3) {
                                uj1 uj1Var3 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                                h02Var4.i0(uj1Var3);
                                obj12 = uj1Var3;
                            } else {
                                uj1 uj1Var4 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                                h02Var4.i0(uj1Var4);
                                obj12 = uj1Var4;
                            }
                            j73 j73VarN4 = new m73((my1) obj12).n(g73Var);
                            zL = h02Var4.l(z9) | h02Var4.x(my1Var);
                            Object objK25 = h02Var4.K();
                            obj13 = objK25;
                            if (zL) {
                                vj1 vj1Var2 = new vj1(z9, my1Var);
                                h02Var4.i0(vj1Var2);
                                obj13 = vj1Var2;
                            } else {
                                vj1 vj1Var3 = new vj1(z9, my1Var);
                                h02Var4.i0(vj1Var3);
                                obj13 = vj1Var3;
                            }
                            j73 j73VarN5 = j73VarN4.n(yf2.L(g73Var, (xy1) obj13)).n(new nj1(nc5Var2, cc5Var2, cc5Var3, cc5Var, ek1Var4, dm1Var5, ho4Var3, my1Var, oj1Var2)).n(sj5Var);
                            h02Var4.X(-1255657861);
                            h02Var4.b(z8);
                            j73Var2 = j73Var;
                            j73 j73VarN6 = j73Var2.n(j73VarN5.n(g73Var));
                            objK5 = h02Var4.K();
                            if (objK5 == l76Var) {
                                eiVar2 = eiVar;
                                ph phVar3 = new ph(eiVar2);
                                h02Var4.i0(phVar3);
                                obj14 = phVar3;
                            } else {
                                eiVar2 = eiVar;
                                obj14 = objK5;
                            }
                            ph phVar4 = (ph) obj14;
                            int iHashCode2 = Long.hashCode(h02Var4.T);
                            tr3 tr3VarQ2 = h02Var4.q();
                            j73 j73VarW2 = m50.W(h02Var4, j73VarN6);
                            jo0.n.getClass();
                            h02Var4.b0();
                            if (h02Var4.S) {
                                h02Var4.m(um2.Z);
                            } else {
                                h02Var4.l0();
                            }
                            xs2.E(tg1.w, h02Var4, phVar4);
                            xs2.E(tg1.q, h02Var4, tr3VarQ2);
                            xs2.A(h02Var4, Integer.valueOf(iHashCode2));
                            xs2.D(h02Var4);
                            xs2.E(tg1.m, h02Var4, j73VarW2);
                            nm0 nm0Var6 = nm0Var;
                            nm0Var6.x(eiVar2, h02Var4, Integer.valueOf((i7 >> 21) & 112));
                            h02Var4.b(true);
                            h02Var4.b(z8);
                            nm0Var3 = nm0Var6;
                            h02Var5 = h02Var4;
                        }
                        z6 = true;
                        if (wc0Var3 == null) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (z6) {
                            h02Var.X(1018653691);
                            objK11 = h02Var.K();
                            if (objK11 == l76Var) {
                                objK11 = "Built-in slide";
                                h02Var.i0("Built-in slide");
                            }
                            te5 te5Var8 = te5Var2;
                            h02 h02Var8 = h02Var;
                            mc5Var3 = mc5Var2;
                            z8 = false;
                            cc5 cc5VarB9 = ra.b(nc5Var2, te5Var8, (String) objK11, h02Var8, 384, 0);
                            te5Var3 = te5Var8;
                            h02Var8.b(false);
                            cc5Var = cc5VarB9;
                            h02Var4 = h02Var8;
                        } else {
                            mc5Var3 = mc5Var2;
                            te5Var3 = te5Var2;
                            z8 = false;
                            h02Var3 = h02Var;
                            h02Var3.X(1018759494);
                            h02Var3.b(false);
                            cc5Var = null;
                        }
                        if (z7) {
                            h02Var4 = h02Var3;
                            h02Var4.X(1018851285);
                            te5 te5Var9 = m50.z;
                            objK10 = h02Var4.K();
                            if (objK10 == l76Var) {
                                obj19 = objK10;
                                h02Var4.i0("Built-in shrink/expand");
                                obj19 = "Built-in shrink/expand";
                            }
                            obj19 = objK10;
                            cc5 cc5VarB10 = ra.b(nc5Var2, te5Var9, (String) obj19, h02Var4, 384, 0);
                            h02Var4.b(z8);
                            cc5Var2 = cc5VarB10;
                        } else {
                            h02Var4 = h02Var3;
                            h02Var4.X(1018962109);
                            h02Var4.b(z8);
                            cc5Var2 = null;
                        }
                        if (z7) {
                            h02Var4.X(1019035735);
                            objK9 = h02Var4.K();
                            if (objK9 == l76Var) {
                                obj18 = objK9;
                                h02Var4.i0("Built-in InterruptionHandlingOffset");
                                obj18 = "Built-in InterruptionHandlingOffset";
                            }
                            obj18 = objK9;
                            cc5 cc5VarB11 = ra.b(nc5Var2, te5Var3, (String) obj18, h02Var4, 384, 0);
                            h02Var4.b(z8);
                            cc5Var3 = cc5VarB11;
                        } else {
                            h02Var4.X(1019206141);
                            h02Var4.b(z8);
                            cc5Var3 = null;
                        }
                        if (wc0Var3 != 0) {
                        }
                        c94Var = wj0.v;
                        g73Var = g73.g;
                        if (zG) {
                            h02Var4.X(1019733235);
                            te5 te5Var10 = new te5(vg.b, new zg(c94Var, (byte) 3));
                            objK8 = h02Var4.K();
                            if (objK8 == l76Var) {
                                obj17 = objK8;
                                h02Var4.i0("Built-in veil");
                                obj17 = "Built-in veil";
                            }
                            obj17 = objK8;
                            sj5Var = new sj5(nc5Var2, ra.b(nc5Var2, te5Var10, (String) obj17, h02Var4, 384, 0), ek1Var3, dm1Var3, ho4Var);
                            h02Var4.b(z8);
                        } else {
                            h02Var4.X(1020031362);
                            h02Var4.b(z8);
                            sj5Var = g73Var;
                        }
                        mc5 mc5Var8 = dm1Var3.g;
                        dm1Var4 = dm1Var3;
                        te5Var4 = m50.w;
                        if (mc5Var3.g == null) {
                            cc5Var4 = null;
                        } else {
                            cc5Var4 = null;
                        }
                        if (mc5Var3.n != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z10) {
                            h02Var4.X(-1511865571);
                            objK7 = h02Var4.K();
                            if (objK7 == l76Var) {
                                obj16 = objK7;
                                h02Var4.i0("Built-in alpha");
                                obj16 = "Built-in alpha";
                            }
                            obj16 = objK7;
                            ho4Var2 = ho4Var;
                            cc5 cc5VarB12 = ra.b(nc5Var2, te5Var4, (String) obj16, h02Var4, 384, 0);
                            h02Var4.b(z8);
                            cc5Var5 = cc5VarB12;
                        } else {
                            ho4Var2 = ho4Var;
                            h02Var4.X(-1511696126);
                            h02Var4.b(z8);
                            cc5Var5 = cc5Var4;
                        }
                        if (z11 != 0) {
                            h02Var4.X(-1511628483);
                            objK6 = h02Var4.K();
                            if (objK6 == l76Var) {
                                obj15 = objK6;
                                h02Var4.i0("Built-in scale");
                                obj15 = "Built-in scale";
                            }
                            obj15 = objK6;
                            cc5 cc5VarB13 = ra.b(nc5Var2, te5Var4, (String) obj15, h02Var4, 384, 0);
                            h02Var4.b(z8);
                            cc5Var6 = cc5VarB13;
                        } else {
                            h02Var4.X(-1511459038);
                            h02Var4.b(z8);
                            cc5Var6 = cc5Var4;
                        }
                        if (z11) {
                            h02Var4.X(-1511381382);
                            cc5VarB = ra.b(nc5Var2, yj1.g, "TransformOriginInterruptionHandling", h02Var4, 384, 0);
                            h02Var4.b(z8);
                        } else {
                            h02Var4.X(-1511209054);
                            h02Var4.b(z8);
                            cc5VarB = cc5Var4;
                        }
                        zJ2 = h02Var4.j(cc5Var5) | h02Var4.x(ek1Var3) | h02Var4.x(dm1Var4) | h02Var4.j(ho4Var2) | h02Var4.j(cc5Var6) | h02Var4.x(nc5Var2) | h02Var4.j(cc5VarB);
                        objK4 = h02Var4.K();
                        if (zJ2) {
                            ho4 ho4Var7 = ho4Var2;
                            ek1 ek1Var8 = ek1Var3;
                            objK4 = new oj1(cc5Var5, ho4Var7, cc5Var6, nc5Var2, ek1Var8, dm1Var4, cc5VarB);
                            ho4Var3 = ho4Var7;
                            ek1Var4 = ek1Var8;
                            dm1Var5 = dm1Var4;
                            h02Var4.i0(objK4);
                        } else {
                            ho4 ho4Var8 = ho4Var2;
                            ek1 ek1Var9 = ek1Var3;
                            objK4 = new oj1(cc5Var5, ho4Var8, cc5Var6, nc5Var2, ek1Var9, dm1Var4, cc5VarB);
                            ho4Var3 = ho4Var8;
                            ek1Var4 = ek1Var9;
                            dm1Var5 = dm1Var4;
                            h02Var4.i0(objK4);
                        }
                        oj1 oj1Var3 = (oj1) objK4;
                        zJ3 = h02Var4.j(ho4Var3);
                        Object objK26 = h02Var4.K();
                        obj12 = objK26;
                        if (zJ3) {
                            uj1 uj1Var5 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                            h02Var4.i0(uj1Var5);
                            obj12 = uj1Var5;
                        } else {
                            uj1 uj1Var6 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                            h02Var4.i0(uj1Var6);
                            obj12 = uj1Var6;
                        }
                        j73 j73VarN7 = new m73((my1) obj12).n(g73Var);
                        zL = h02Var4.l(z9) | h02Var4.x(my1Var);
                        Object objK27 = h02Var4.K();
                        obj13 = objK27;
                        if (zL) {
                            vj1 vj1Var4 = new vj1(z9, my1Var);
                            h02Var4.i0(vj1Var4);
                            obj13 = vj1Var4;
                        } else {
                            vj1 vj1Var5 = new vj1(z9, my1Var);
                            h02Var4.i0(vj1Var5);
                            obj13 = vj1Var5;
                        }
                        j73 j73VarN8 = j73VarN7.n(yf2.L(g73Var, (xy1) obj13)).n(new nj1(nc5Var2, cc5Var2, cc5Var3, cc5Var, ek1Var4, dm1Var5, ho4Var3, my1Var, oj1Var3)).n(sj5Var);
                        h02Var4.X(-1255657861);
                        h02Var4.b(z8);
                        j73Var2 = j73Var;
                        j73 j73VarN9 = j73Var2.n(j73VarN8.n(g73Var));
                        objK5 = h02Var4.K();
                        if (objK5 == l76Var) {
                            eiVar2 = eiVar;
                            ph phVar5 = new ph(eiVar2);
                            h02Var4.i0(phVar5);
                            obj14 = phVar5;
                        } else {
                            eiVar2 = eiVar;
                            obj14 = objK5;
                        }
                        ph phVar6 = (ph) obj14;
                        int iHashCode3 = Long.hashCode(h02Var4.T);
                        tr3 tr3VarQ3 = h02Var4.q();
                        j73 j73VarW3 = m50.W(h02Var4, j73VarN9);
                        jo0.n.getClass();
                        h02Var4.b0();
                        if (h02Var4.S) {
                            h02Var4.m(um2.Z);
                        } else {
                            h02Var4.l0();
                        }
                        xs2.E(tg1.w, h02Var4, phVar6);
                        xs2.E(tg1.q, h02Var4, tr3VarQ3);
                        xs2.A(h02Var4, Integer.valueOf(iHashCode3));
                        xs2.D(h02Var4);
                        xs2.E(tg1.m, h02Var4, j73VarW3);
                        nm0 nm0Var7 = nm0Var;
                        nm0Var7.x(eiVar2, h02Var4, Integer.valueOf((i7 >> 21) & 112));
                        h02Var4.b(true);
                        h02Var4.b(z8);
                        nm0Var3 = nm0Var7;
                        h02Var5 = h02Var4;
                    }
                    h02Var5.b(z8);
                    nm0Var2 = nm0Var3;
                    h02Var2 = h02Var5;
                } else {
                    i3 = i11;
                }
                z2 = true;
                Object objK110 = h02Var6.K();
                if (z2) {
                    nc5 nc5Var4 = new nc5(new pb3(mj1VarS2), nc5Var, nc5Var.r + " > EnterExitTransition");
                    h02Var6.i0(nc5Var4);
                    obj2 = nc5Var4;
                } else {
                    nc5 nc5Var5 = new nc5(new pb3(mj1VarS2), nc5Var, nc5Var.r + " > EnterExitTransition");
                    h02Var6.i0(nc5Var5);
                    obj2 = nc5Var5;
                }
                nc5Var2 = (nc5) obj2;
                zX = ((i12 <= 4 && h02Var6.x(nc5Var)) || (i3 & 6) == 4) | h02Var6.x(nc5Var2);
                Object objK111 = h02Var6.K();
                obj3 = objK111;
                if (zX) {
                    pc5 pc5Var2 = new pc5(nc5Var, nc5Var2, (byte) 1);
                    h02Var6.i0(pc5Var2);
                    obj3 = pc5Var2;
                } else {
                    pc5 pc5Var3 = new pc5(nc5Var, nc5Var2, (byte) 1);
                    h02Var6.i0(pc5Var3);
                    obj3 = pc5Var3;
                }
                k33.j(nc5Var2, (xy1) obj3, h02Var6);
                if (nc5Var.l()) {
                    nc5Var2.m(mj1VarS2, mj1VarS3);
                } else {
                    nc5Var2.s(mj1VarS3);
                    nc5Var2.q.setValue(Boolean.FALSE);
                }
                if (nc5Var.l()) {
                    h02Var6.X(782386797);
                    value2 = nc5Var.v.getValue();
                    if (value2 == null) {
                        h02Var6.X(782437481);
                        h02Var6.b(false);
                        mj1VarS = null;
                    } else {
                        h02Var6.X(782437482);
                        h02Var6.X(2016262395);
                        mj1VarS = S(nc5Var, xy1Var, value2, h02Var6);
                        h02Var6.b(false);
                        h02Var6.b(false);
                    }
                    g90Var2 = nc5Var2.g;
                    tp3Var3 = nc5Var2.n;
                    tp3 tp3Var7 = nc5Var2.v;
                    value3 = tp3Var7.getValue();
                    if (value3 == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    tp3Var7.setValue(mj1VarS);
                    if (z12) {
                        nc5Var2.x.setValue(new gc5(value3, tp3Var3.getValue()));
                        g90Var2.i(value3);
                        if (nc5Var2.j.d() == Long.MIN_VALUE) {
                            nc5Var2.i(true);
                        }
                        st4Var = nc5Var2.a;
                        size = st4Var.size();
                        while (i4 < size) {
                            ((hc5) st4Var.get(i4)).i.e(-2.0f);
                        }
                    }
                    h02Var6.b(false);
                } else {
                    h02Var6.X(782538635);
                    h02Var6.b(false);
                }
                zX2 = h02Var6.x(nc5Var2);
                Object objK112 = h02Var6.K();
                obj4 = objK112;
                if (zX2) {
                    tp3 tp3VarM4 = kq2.M(ek1Var);
                    h02Var6.i0(tp3VarM4);
                    obj4 = tp3VarM4;
                } else {
                    tp3 tp3VarM5 = kq2.M(ek1Var);
                    h02Var6.i0(tp3VarM5);
                    obj4 = tp3VarM5;
                }
                ob3Var = (ob3) obj4;
                g90 g90Var5 = nc5Var2.g;
                tp3Var = nc5Var2.n;
                objN = g90Var5.n();
                value = tp3Var.getValue();
                mj1Var = mj1.a;
                mj1Var2 = mj1.t;
                if (objN == value) {
                    if (tp3Var.getValue() != mj1Var) {
                        ob3Var.setValue(((ek1) ob3Var.getValue()).g(ek1Var));
                    }
                } else if (tp3Var.getValue() != mj1Var) {
                    ob3Var.setValue(((ek1) ob3Var.getValue()).g(ek1Var));
                }
                ek1Var2 = (ek1) ob3Var.getValue();
                tp3Var2 = nc5Var2.n;
                g90Var = nc5Var2.g;
                zX3 = h02Var6.x(nc5Var2);
                Object objK113 = h02Var6.K();
                obj5 = objK113;
                if (zX3) {
                    tp3 tp3VarM6 = kq2.M(dm1Var);
                    h02Var6.i0(tp3VarM6);
                    obj5 = tp3VarM6;
                } else {
                    tp3 tp3VarM7 = kq2.M(dm1Var);
                    h02Var6.i0(tp3VarM7);
                    obj5 = tp3VarM7;
                }
                ob3Var2 = (ob3) obj5;
                if (g90Var.n() != tp3Var2.getValue()) {
                    if (tp3Var2.getValue() != mj1Var2) {
                        h02Var6.X(-504838512);
                        hn1Var = ((dm1) ob3Var2.getValue()).g.g;
                        if (hn1Var != null) {
                            hn1Var2 = new hn1(1.0f, hn1Var.y);
                        } else {
                            hn1Var2 = null;
                        }
                        ae4Var = ((dm1) ob3Var2.getValue()).g.n;
                        if (ae4Var != null) {
                            ae4Var2 = new ae4(1.0f, ae4Var.y, ae4Var.r);
                        } else {
                            ae4Var2 = null;
                        }
                        vq4Var = ((dm1) ob3Var2.getValue()).g.y;
                        if (vq4Var == null) {
                            h02Var6.X(-504119809);
                            z3 = false;
                            h02Var6.b(false);
                            vq4Var2 = null;
                        } else {
                            h02Var6.X(-708998590);
                            objK = h02Var6.K();
                            if (objK == l76Var) {
                                obj6 = objK;
                                vg vgVar2 = vg.f;
                                h02Var6.i0(vgVar2);
                                obj6 = vgVar2;
                            }
                            obj6 = objK;
                            vq4 vq4Var5 = new vq4((xy1) obj6, vq4Var.y);
                            z3 = false;
                            h02Var6.b(false);
                            vq4Var2 = vq4Var5;
                        }
                        wc0Var = ((dm1) ob3Var2.getValue()).g.r;
                        if (wc0Var == null) {
                            h02Var6.X(-504024174);
                            h02Var6.b(z3);
                            wc0Var2 = null;
                        } else {
                            h02Var6.X(-708995505);
                            objK2 = h02Var6.K();
                            if (objK2 == l76Var) {
                                obj7 = objK2;
                                xj1 xj1Var2 = xj1.a;
                                h02Var6.i0(xj1Var2);
                                obj7 = xj1Var2;
                            }
                            obj7 = objK2;
                            wc0 wc0Var6 = new wc0(wc0Var.g, (xy1) obj7, wc0Var.r, wc0Var.n);
                            h02Var6.b(false);
                            wc0Var2 = wc0Var6;
                        }
                        mc5 mc5Var9 = ((dm1) ob3Var2.getValue()).g;
                        ob3Var2.setValue(new dm1(new mc5(hn1Var2, vq4Var2, wc0Var2, ae4Var2, (LinkedHashMap) null, 96)).g(dm1Var));
                        h02Var6.b(false);
                    } else {
                        h02Var6.X(-503833306);
                        h02Var6.b(false);
                    }
                } else if (tp3Var2.getValue() != mj1Var2) {
                    h02Var6.X(-504838512);
                    hn1Var = ((dm1) ob3Var2.getValue()).g.g;
                    if (hn1Var != null) {
                        hn1Var2 = new hn1(1.0f, hn1Var.y);
                    } else {
                        hn1Var2 = null;
                    }
                    ae4Var = ((dm1) ob3Var2.getValue()).g.n;
                    if (ae4Var != null) {
                        ae4Var2 = new ae4(1.0f, ae4Var.y, ae4Var.r);
                    } else {
                        ae4Var2 = null;
                    }
                    vq4Var = ((dm1) ob3Var2.getValue()).g.y;
                    if (vq4Var == null) {
                        h02Var6.X(-504119809);
                        z3 = false;
                        h02Var6.b(false);
                        vq4Var2 = null;
                    } else {
                        h02Var6.X(-708998590);
                        objK = h02Var6.K();
                        if (objK == l76Var) {
                            obj6 = objK;
                            vg vgVar3 = vg.f;
                            h02Var6.i0(vgVar3);
                            obj6 = vgVar3;
                        }
                        obj6 = objK;
                        vq4 vq4Var6 = new vq4((xy1) obj6, vq4Var.y);
                        z3 = false;
                        h02Var6.b(false);
                        vq4Var2 = vq4Var6;
                    }
                    wc0Var = ((dm1) ob3Var2.getValue()).g.r;
                    if (wc0Var == null) {
                        h02Var6.X(-504024174);
                        h02Var6.b(z3);
                        wc0Var2 = null;
                    } else {
                        h02Var6.X(-708995505);
                        objK2 = h02Var6.K();
                        if (objK2 == l76Var) {
                            obj7 = objK2;
                            xj1 xj1Var3 = xj1.a;
                            h02Var6.i0(xj1Var3);
                            obj7 = xj1Var3;
                        }
                        obj7 = objK2;
                        wc0 wc0Var7 = new wc0(wc0Var.g, (xy1) obj7, wc0Var.r, wc0Var.n);
                        h02Var6.b(false);
                        wc0Var2 = wc0Var7;
                    }
                    mc5 mc5Var10 = ((dm1) ob3Var2.getValue()).g;
                    ob3Var2.setValue(new dm1(new mc5(hn1Var2, vq4Var2, wc0Var2, ae4Var2, (LinkedHashMap) null, 96)).g(dm1Var));
                    h02Var6.b(false);
                } else {
                    h02Var6.X(-503833306);
                    h02Var6.b(false);
                }
                dm1Var2 = (dm1) ob3Var2.getValue();
                ob3VarQ = kq2.Q(bz1Var, h02Var6);
                Object objL2 = bz1Var.l(g90Var.n(), tp3Var2.getValue());
                zX4 = h02Var6.x(nc5Var2) | h02Var6.x(ob3VarQ);
                Object objK114 = h02Var6.K();
                if (zX4) {
                    zh zhVar2 = new zh(nc5Var2, ob3VarQ, null, (byte) 0);
                    h02Var6.i0(zhVar2);
                    obj8 = zhVar2;
                } else {
                    zh zhVar3 = new zh(nc5Var2, ob3VarQ, null, (byte) 0);
                    h02Var6.i0(zhVar3);
                    obj8 = zhVar3;
                }
                ob3 ob3VarE2 = aq2.e((bz1) obj8, h02Var6, objL2);
                if (g90Var.n() != mj1Var) {
                    h02Var6.X(-272022668);
                    if (i8 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objK28 = h02Var6.K();
                    obj9 = objK28;
                    if (z4) {
                        ei eiVar4 = new ei();
                        h02Var6.i0(eiVar4);
                        obj9 = eiVar4;
                    } else {
                        ei eiVar5 = new ei();
                        h02Var6.i0(eiVar5);
                        obj9 = eiVar5;
                    }
                    eiVar = (ei) obj9;
                    ho4Var = eiVar.y;
                    te5Var = m50.u;
                    objK3 = h02Var6.K();
                    obj10 = objK3;
                    if (objK3 == l76Var) {
                        tj1 tj1Var2 = tj1.t;
                        h02Var6.i0(tj1Var2);
                        obj10 = tj1Var2;
                    }
                    my1Var = (my1) obj10;
                    h02Var6.X(-1491182875);
                    h02Var6.b(false);
                    h02Var6.X(-1491180092);
                    h02Var6.b(false);
                    h02Var6.X(-31257052);
                    h02Var6.b(false);
                    if (nc5Var2.v.getValue() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ho4Var.r(z5);
                    zJ = h02Var6.j(ho4Var);
                    Object objK29 = h02Var6.K();
                    if (zJ) {
                        uj1 uj1Var7 = new uj1(ho4Var, (byte) 1);
                        h02Var6.i0(uj1Var7);
                        obj11 = uj1Var7;
                    } else {
                        uj1 uj1Var8 = new uj1(ho4Var, (byte) 1);
                        h02Var6.i0(uj1Var8);
                        obj11 = uj1Var8;
                    }
                    yj1.g(nc5Var2, (my1) obj11, h02Var6, 0);
                    mc5 mc5Var11 = ek1Var2.g;
                    mc5 mc5Var12 = dm1Var2.g;
                    mc5Var = dm1Var2.g;
                    zG = tf5.g(ho4Var.v, jj0.l);
                    mc5Var2 = ek1Var2.g;
                    vq4Var3 = mc5Var2.y;
                    wc0Var3 = mc5Var2.r;
                    if (vq4Var3 == null) {
                        ek1Var3 = ek1Var2;
                        dm1Var3 = dm1Var2;
                        te5Var2 = te5Var;
                        z6 = true;
                    } else {
                        ek1Var3 = ek1Var2;
                        dm1Var3 = dm1Var2;
                        te5Var2 = te5Var;
                        z6 = true;
                    }
                    if (wc0Var3 == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z6) {
                        h02Var.X(1018653691);
                        objK11 = h02Var.K();
                        if (objK11 == l76Var) {
                            objK11 = "Built-in slide";
                            h02Var.i0("Built-in slide");
                        }
                        te5 te5Var11 = te5Var2;
                        h02 h02Var9 = h02Var;
                        mc5Var3 = mc5Var2;
                        z8 = false;
                        cc5 cc5VarB14 = ra.b(nc5Var2, te5Var11, (String) objK11, h02Var9, 384, 0);
                        te5Var3 = te5Var11;
                        h02Var9.b(false);
                        cc5Var = cc5VarB14;
                        h02Var4 = h02Var9;
                    } else {
                        mc5Var3 = mc5Var2;
                        te5Var3 = te5Var2;
                        z8 = false;
                        h02Var3 = h02Var;
                        h02Var3.X(1018759494);
                        h02Var3.b(false);
                        cc5Var = null;
                    }
                    if (z7) {
                        h02Var4 = h02Var3;
                        h02Var4.X(1018851285);
                        te5 te5Var12 = m50.z;
                        objK10 = h02Var4.K();
                        if (objK10 == l76Var) {
                            obj19 = objK10;
                            h02Var4.i0("Built-in shrink/expand");
                            obj19 = "Built-in shrink/expand";
                        }
                        obj19 = objK10;
                        cc5 cc5VarB15 = ra.b(nc5Var2, te5Var12, (String) obj19, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var2 = cc5VarB15;
                    } else {
                        h02Var4 = h02Var3;
                        h02Var4.X(1018962109);
                        h02Var4.b(z8);
                        cc5Var2 = null;
                    }
                    if (z7) {
                        h02Var4.X(1019035735);
                        objK9 = h02Var4.K();
                        if (objK9 == l76Var) {
                            obj18 = objK9;
                            h02Var4.i0("Built-in InterruptionHandlingOffset");
                            obj18 = "Built-in InterruptionHandlingOffset";
                        }
                        obj18 = objK9;
                        cc5 cc5VarB16 = ra.b(nc5Var2, te5Var3, (String) obj18, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var3 = cc5VarB16;
                    } else {
                        h02Var4.X(1019206141);
                        h02Var4.b(z8);
                        cc5Var3 = null;
                    }
                    if (wc0Var3 != 0) {
                    }
                    c94Var = wj0.v;
                    g73Var = g73.g;
                    if (zG) {
                        h02Var4.X(1019733235);
                        te5 te5Var13 = new te5(vg.b, new zg(c94Var, (byte) 3));
                        objK8 = h02Var4.K();
                        if (objK8 == l76Var) {
                            obj17 = objK8;
                            h02Var4.i0("Built-in veil");
                            obj17 = "Built-in veil";
                        }
                        obj17 = objK8;
                        sj5Var = new sj5(nc5Var2, ra.b(nc5Var2, te5Var13, (String) obj17, h02Var4, 384, 0), ek1Var3, dm1Var3, ho4Var);
                        h02Var4.b(z8);
                    } else {
                        h02Var4.X(1020031362);
                        h02Var4.b(z8);
                        sj5Var = g73Var;
                    }
                    mc5 mc5Var13 = dm1Var3.g;
                    dm1Var4 = dm1Var3;
                    te5Var4 = m50.w;
                    if (mc5Var3.g == null) {
                        cc5Var4 = null;
                    } else {
                        cc5Var4 = null;
                    }
                    if (mc5Var3.n != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z10) {
                        h02Var4.X(-1511865571);
                        objK7 = h02Var4.K();
                        if (objK7 == l76Var) {
                            obj16 = objK7;
                            h02Var4.i0("Built-in alpha");
                            obj16 = "Built-in alpha";
                        }
                        obj16 = objK7;
                        ho4Var2 = ho4Var;
                        cc5 cc5VarB17 = ra.b(nc5Var2, te5Var4, (String) obj16, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var5 = cc5VarB17;
                    } else {
                        ho4Var2 = ho4Var;
                        h02Var4.X(-1511696126);
                        h02Var4.b(z8);
                        cc5Var5 = cc5Var4;
                    }
                    if (z11 != 0) {
                        h02Var4.X(-1511628483);
                        objK6 = h02Var4.K();
                        if (objK6 == l76Var) {
                            obj15 = objK6;
                            h02Var4.i0("Built-in scale");
                            obj15 = "Built-in scale";
                        }
                        obj15 = objK6;
                        cc5 cc5VarB18 = ra.b(nc5Var2, te5Var4, (String) obj15, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var6 = cc5VarB18;
                    } else {
                        h02Var4.X(-1511459038);
                        h02Var4.b(z8);
                        cc5Var6 = cc5Var4;
                    }
                    if (z11) {
                        h02Var4.X(-1511381382);
                        cc5VarB = ra.b(nc5Var2, yj1.g, "TransformOriginInterruptionHandling", h02Var4, 384, 0);
                        h02Var4.b(z8);
                    } else {
                        h02Var4.X(-1511209054);
                        h02Var4.b(z8);
                        cc5VarB = cc5Var4;
                    }
                    zJ2 = h02Var4.j(cc5Var5) | h02Var4.x(ek1Var3) | h02Var4.x(dm1Var4) | h02Var4.j(ho4Var2) | h02Var4.j(cc5Var6) | h02Var4.x(nc5Var2) | h02Var4.j(cc5VarB);
                    objK4 = h02Var4.K();
                    if (zJ2) {
                        ho4 ho4Var9 = ho4Var2;
                        ek1 ek1Var10 = ek1Var3;
                        objK4 = new oj1(cc5Var5, ho4Var9, cc5Var6, nc5Var2, ek1Var10, dm1Var4, cc5VarB);
                        ho4Var3 = ho4Var9;
                        ek1Var4 = ek1Var10;
                        dm1Var5 = dm1Var4;
                        h02Var4.i0(objK4);
                    } else {
                        ho4 ho4Var10 = ho4Var2;
                        ek1 ek1Var11 = ek1Var3;
                        objK4 = new oj1(cc5Var5, ho4Var10, cc5Var6, nc5Var2, ek1Var11, dm1Var4, cc5VarB);
                        ho4Var3 = ho4Var10;
                        ek1Var4 = ek1Var11;
                        dm1Var5 = dm1Var4;
                        h02Var4.i0(objK4);
                    }
                    oj1 oj1Var4 = (oj1) objK4;
                    zJ3 = h02Var4.j(ho4Var3);
                    Object objK210 = h02Var4.K();
                    obj12 = objK210;
                    if (zJ3) {
                        uj1 uj1Var9 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                        h02Var4.i0(uj1Var9);
                        obj12 = uj1Var9;
                    } else {
                        uj1 uj1Var10 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                        h02Var4.i0(uj1Var10);
                        obj12 = uj1Var10;
                    }
                    j73 j73VarN10 = new m73((my1) obj12).n(g73Var);
                    zL = h02Var4.l(z9) | h02Var4.x(my1Var);
                    Object objK211 = h02Var4.K();
                    obj13 = objK211;
                    if (zL) {
                        vj1 vj1Var6 = new vj1(z9, my1Var);
                        h02Var4.i0(vj1Var6);
                        obj13 = vj1Var6;
                    } else {
                        vj1 vj1Var7 = new vj1(z9, my1Var);
                        h02Var4.i0(vj1Var7);
                        obj13 = vj1Var7;
                    }
                    j73 j73VarN11 = j73VarN10.n(yf2.L(g73Var, (xy1) obj13)).n(new nj1(nc5Var2, cc5Var2, cc5Var3, cc5Var, ek1Var4, dm1Var5, ho4Var3, my1Var, oj1Var4)).n(sj5Var);
                    h02Var4.X(-1255657861);
                    h02Var4.b(z8);
                    j73Var2 = j73Var;
                    j73 j73VarN12 = j73Var2.n(j73VarN11.n(g73Var));
                    objK5 = h02Var4.K();
                    if (objK5 == l76Var) {
                        eiVar2 = eiVar;
                        ph phVar7 = new ph(eiVar2);
                        h02Var4.i0(phVar7);
                        obj14 = phVar7;
                    } else {
                        eiVar2 = eiVar;
                        obj14 = objK5;
                    }
                    ph phVar8 = (ph) obj14;
                    int iHashCode4 = Long.hashCode(h02Var4.T);
                    tr3 tr3VarQ4 = h02Var4.q();
                    j73 j73VarW4 = m50.W(h02Var4, j73VarN12);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(um2.Z);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(tg1.w, h02Var4, phVar8);
                    xs2.E(tg1.q, h02Var4, tr3VarQ4);
                    xs2.A(h02Var4, Integer.valueOf(iHashCode4));
                    xs2.D(h02Var4);
                    xs2.E(tg1.m, h02Var4, j73VarW4);
                    nm0 nm0Var8 = nm0Var;
                    nm0Var8.x(eiVar2, h02Var4, Integer.valueOf((i7 >> 21) & 112));
                    h02Var4.b(true);
                    h02Var4.b(z8);
                    nm0Var3 = nm0Var8;
                    h02Var5 = h02Var4;
                } else {
                    h02Var6.X(-272022668);
                    if (i8 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objK212 = h02Var6.K();
                    obj9 = objK212;
                    if (z4) {
                        ei eiVar6 = new ei();
                        h02Var6.i0(eiVar6);
                        obj9 = eiVar6;
                    } else {
                        ei eiVar7 = new ei();
                        h02Var6.i0(eiVar7);
                        obj9 = eiVar7;
                    }
                    eiVar = (ei) obj9;
                    ho4Var = eiVar.y;
                    te5Var = m50.u;
                    objK3 = h02Var6.K();
                    obj10 = objK3;
                    if (objK3 == l76Var) {
                        tj1 tj1Var3 = tj1.t;
                        h02Var6.i0(tj1Var3);
                        obj10 = tj1Var3;
                    }
                    my1Var = (my1) obj10;
                    h02Var6.X(-1491182875);
                    h02Var6.b(false);
                    h02Var6.X(-1491180092);
                    h02Var6.b(false);
                    h02Var6.X(-31257052);
                    h02Var6.b(false);
                    if (nc5Var2.v.getValue() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ho4Var.r(z5);
                    zJ = h02Var6.j(ho4Var);
                    Object objK213 = h02Var6.K();
                    if (zJ) {
                        uj1 uj1Var11 = new uj1(ho4Var, (byte) 1);
                        h02Var6.i0(uj1Var11);
                        obj11 = uj1Var11;
                    } else {
                        uj1 uj1Var12 = new uj1(ho4Var, (byte) 1);
                        h02Var6.i0(uj1Var12);
                        obj11 = uj1Var12;
                    }
                    yj1.g(nc5Var2, (my1) obj11, h02Var6, 0);
                    mc5 mc5Var14 = ek1Var2.g;
                    mc5 mc5Var15 = dm1Var2.g;
                    mc5Var = dm1Var2.g;
                    zG = tf5.g(ho4Var.v, jj0.l);
                    mc5Var2 = ek1Var2.g;
                    vq4Var3 = mc5Var2.y;
                    wc0Var3 = mc5Var2.r;
                    if (vq4Var3 == null) {
                        ek1Var3 = ek1Var2;
                        dm1Var3 = dm1Var2;
                        te5Var2 = te5Var;
                        z6 = true;
                    } else {
                        ek1Var3 = ek1Var2;
                        dm1Var3 = dm1Var2;
                        te5Var2 = te5Var;
                        z6 = true;
                    }
                    if (wc0Var3 == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z6) {
                        h02Var.X(1018653691);
                        objK11 = h02Var.K();
                        if (objK11 == l76Var) {
                            objK11 = "Built-in slide";
                            h02Var.i0("Built-in slide");
                        }
                        te5 te5Var14 = te5Var2;
                        h02 h02Var10 = h02Var;
                        mc5Var3 = mc5Var2;
                        z8 = false;
                        cc5 cc5VarB19 = ra.b(nc5Var2, te5Var14, (String) objK11, h02Var10, 384, 0);
                        te5Var3 = te5Var14;
                        h02Var10.b(false);
                        cc5Var = cc5VarB19;
                        h02Var4 = h02Var10;
                    } else {
                        mc5Var3 = mc5Var2;
                        te5Var3 = te5Var2;
                        z8 = false;
                        h02Var3 = h02Var;
                        h02Var3.X(1018759494);
                        h02Var3.b(false);
                        cc5Var = null;
                    }
                    if (z7) {
                        h02Var4 = h02Var3;
                        h02Var4.X(1018851285);
                        te5 te5Var15 = m50.z;
                        objK10 = h02Var4.K();
                        if (objK10 == l76Var) {
                            obj19 = objK10;
                            h02Var4.i0("Built-in shrink/expand");
                            obj19 = "Built-in shrink/expand";
                        }
                        obj19 = objK10;
                        cc5 cc5VarB110 = ra.b(nc5Var2, te5Var15, (String) obj19, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var2 = cc5VarB110;
                    } else {
                        h02Var4 = h02Var3;
                        h02Var4.X(1018962109);
                        h02Var4.b(z8);
                        cc5Var2 = null;
                    }
                    if (z7) {
                        h02Var4.X(1019035735);
                        objK9 = h02Var4.K();
                        if (objK9 == l76Var) {
                            obj18 = objK9;
                            h02Var4.i0("Built-in InterruptionHandlingOffset");
                            obj18 = "Built-in InterruptionHandlingOffset";
                        }
                        obj18 = objK9;
                        cc5 cc5VarB111 = ra.b(nc5Var2, te5Var3, (String) obj18, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var3 = cc5VarB111;
                    } else {
                        h02Var4.X(1019206141);
                        h02Var4.b(z8);
                        cc5Var3 = null;
                    }
                    if (wc0Var3 != 0) {
                    }
                    c94Var = wj0.v;
                    g73Var = g73.g;
                    if (zG) {
                        h02Var4.X(1019733235);
                        te5 te5Var16 = new te5(vg.b, new zg(c94Var, (byte) 3));
                        objK8 = h02Var4.K();
                        if (objK8 == l76Var) {
                            obj17 = objK8;
                            h02Var4.i0("Built-in veil");
                            obj17 = "Built-in veil";
                        }
                        obj17 = objK8;
                        sj5Var = new sj5(nc5Var2, ra.b(nc5Var2, te5Var16, (String) obj17, h02Var4, 384, 0), ek1Var3, dm1Var3, ho4Var);
                        h02Var4.b(z8);
                    } else {
                        h02Var4.X(1020031362);
                        h02Var4.b(z8);
                        sj5Var = g73Var;
                    }
                    mc5 mc5Var16 = dm1Var3.g;
                    dm1Var4 = dm1Var3;
                    te5Var4 = m50.w;
                    if (mc5Var3.g == null) {
                        cc5Var4 = null;
                    } else {
                        cc5Var4 = null;
                    }
                    if (mc5Var3.n != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z10) {
                        h02Var4.X(-1511865571);
                        objK7 = h02Var4.K();
                        if (objK7 == l76Var) {
                            obj16 = objK7;
                            h02Var4.i0("Built-in alpha");
                            obj16 = "Built-in alpha";
                        }
                        obj16 = objK7;
                        ho4Var2 = ho4Var;
                        cc5 cc5VarB112 = ra.b(nc5Var2, te5Var4, (String) obj16, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var5 = cc5VarB112;
                    } else {
                        ho4Var2 = ho4Var;
                        h02Var4.X(-1511696126);
                        h02Var4.b(z8);
                        cc5Var5 = cc5Var4;
                    }
                    if (z11 != 0) {
                        h02Var4.X(-1511628483);
                        objK6 = h02Var4.K();
                        if (objK6 == l76Var) {
                            obj15 = objK6;
                            h02Var4.i0("Built-in scale");
                            obj15 = "Built-in scale";
                        }
                        obj15 = objK6;
                        cc5 cc5VarB113 = ra.b(nc5Var2, te5Var4, (String) obj15, h02Var4, 384, 0);
                        h02Var4.b(z8);
                        cc5Var6 = cc5VarB113;
                    } else {
                        h02Var4.X(-1511459038);
                        h02Var4.b(z8);
                        cc5Var6 = cc5Var4;
                    }
                    if (z11) {
                        h02Var4.X(-1511381382);
                        cc5VarB = ra.b(nc5Var2, yj1.g, "TransformOriginInterruptionHandling", h02Var4, 384, 0);
                        h02Var4.b(z8);
                    } else {
                        h02Var4.X(-1511209054);
                        h02Var4.b(z8);
                        cc5VarB = cc5Var4;
                    }
                    zJ2 = h02Var4.j(cc5Var5) | h02Var4.x(ek1Var3) | h02Var4.x(dm1Var4) | h02Var4.j(ho4Var2) | h02Var4.j(cc5Var6) | h02Var4.x(nc5Var2) | h02Var4.j(cc5VarB);
                    objK4 = h02Var4.K();
                    if (zJ2) {
                        ho4 ho4Var11 = ho4Var2;
                        ek1 ek1Var12 = ek1Var3;
                        objK4 = new oj1(cc5Var5, ho4Var11, cc5Var6, nc5Var2, ek1Var12, dm1Var4, cc5VarB);
                        ho4Var3 = ho4Var11;
                        ek1Var4 = ek1Var12;
                        dm1Var5 = dm1Var4;
                        h02Var4.i0(objK4);
                    } else {
                        ho4 ho4Var12 = ho4Var2;
                        ek1 ek1Var13 = ek1Var3;
                        objK4 = new oj1(cc5Var5, ho4Var12, cc5Var6, nc5Var2, ek1Var13, dm1Var4, cc5VarB);
                        ho4Var3 = ho4Var12;
                        ek1Var4 = ek1Var13;
                        dm1Var5 = dm1Var4;
                        h02Var4.i0(objK4);
                    }
                    oj1 oj1Var5 = (oj1) objK4;
                    zJ3 = h02Var4.j(ho4Var3);
                    Object objK214 = h02Var4.K();
                    obj12 = objK214;
                    if (zJ3) {
                        uj1 uj1Var13 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                        h02Var4.i0(uj1Var13);
                        obj12 = uj1Var13;
                    } else {
                        uj1 uj1Var14 = new uj1(ho4Var3, z8 ? (byte) 1 : (byte) 0);
                        h02Var4.i0(uj1Var14);
                        obj12 = uj1Var14;
                    }
                    j73 j73VarN13 = new m73((my1) obj12).n(g73Var);
                    zL = h02Var4.l(z9) | h02Var4.x(my1Var);
                    Object objK215 = h02Var4.K();
                    obj13 = objK215;
                    if (zL) {
                        vj1 vj1Var8 = new vj1(z9, my1Var);
                        h02Var4.i0(vj1Var8);
                        obj13 = vj1Var8;
                    } else {
                        vj1 vj1Var9 = new vj1(z9, my1Var);
                        h02Var4.i0(vj1Var9);
                        obj13 = vj1Var9;
                    }
                    j73 j73VarN14 = j73VarN13.n(yf2.L(g73Var, (xy1) obj13)).n(new nj1(nc5Var2, cc5Var2, cc5Var3, cc5Var, ek1Var4, dm1Var5, ho4Var3, my1Var, oj1Var5)).n(sj5Var);
                    h02Var4.X(-1255657861);
                    h02Var4.b(z8);
                    j73Var2 = j73Var;
                    j73 j73VarN15 = j73Var2.n(j73VarN14.n(g73Var));
                    objK5 = h02Var4.K();
                    if (objK5 == l76Var) {
                        eiVar2 = eiVar;
                        ph phVar9 = new ph(eiVar2);
                        h02Var4.i0(phVar9);
                        obj14 = phVar9;
                    } else {
                        eiVar2 = eiVar;
                        obj14 = objK5;
                    }
                    ph phVar10 = (ph) obj14;
                    int iHashCode5 = Long.hashCode(h02Var4.T);
                    tr3 tr3VarQ5 = h02Var4.q();
                    j73 j73VarW5 = m50.W(h02Var4, j73VarN15);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(um2.Z);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(tg1.w, h02Var4, phVar10);
                    xs2.E(tg1.q, h02Var4, tr3VarQ5);
                    xs2.A(h02Var4, Integer.valueOf(iHashCode5));
                    xs2.D(h02Var4);
                    xs2.E(tg1.m, h02Var4, j73VarW5);
                    nm0 nm0Var9 = nm0Var;
                    nm0Var9.x(eiVar2, h02Var4, Integer.valueOf((i7 >> 21) & 112));
                    h02Var4.b(true);
                    h02Var4.b(z8);
                    nm0Var3 = nm0Var9;
                    h02Var5 = h02Var4;
                }
                h02Var5.b(z8);
                nm0Var2 = nm0Var3;
                h02Var2 = h02Var5;
            } else {
                h02Var6.X(-270514673);
                h02Var6.b(false);
                nm0Var2 = nm0Var4;
                h02Var2 = h02Var6;
            }
        } else {
            h02Var6.Q();
            nm0Var2 = nm0Var4;
            h02Var2 = h02Var6;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new yg(nc5Var, xy1Var, j73Var2, ek1Var, dm1Var, bz1Var, nm0Var2, i2);
        }
    }

    public static final void h(g61 g61Var, cq0 cq0Var, my1 my1Var, my1 my1Var2, h02 h02Var, int i2) {
        int i3;
        h02 h02Var2 = h02Var;
        h02Var2.Z(930685742);
        int i4 = (h02Var2.j(g61Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= h02Var2.n(cq0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var2.j(my1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var2.j(my1Var2) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (h02Var2.N(i4 & 1, (i4 & 1171) != 1170)) {
            j73 j73VarN = ue5.e0(P(g73.g, O(h02Var2), true), 16.0f).n(mq4.r);
            ek0 ek0VarG = ck0.g(v70.n, hi0.o, h02Var2, 48);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarN);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            int iOrdinal = cq0Var.ordinal();
            if (iOrdinal == 0) {
                i3 = io.appground.blek.R.string.md_message_connection_failed;
            } else {
                if (iOrdinal != 1) {
                    uo1.g();
                    return;
                }
                i3 = io.appground.blek.R.string.md_message_pairing_failed;
            }
            y13.y(xs2.I(i3, h02Var2), null, ue5.m0(1777279022, new y71(g61Var, my1Var, b2), h02Var2), h02Var2, 384, 2);
            h02Var2 = h02Var;
            c93.x(my1Var2, null, false, null, null, null, null, null, a11.j, h02Var2, ((i4 >> 9) & 14) | 805306368, 510);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ws(g61Var, cq0Var, my1Var, my1Var2, i2);
        }
    }

    public static final void i(q81 q81Var, qr0 qr0Var, my1 my1Var, h02 h02Var, int i2) {
        q81Var.getClass();
        qr0Var.getClass();
        my1Var.getClass();
        h02Var.Z(215081773);
        int i3 = (h02Var.j(q81Var) ? 4 : 2) | i2 | (h02Var.j(qr0Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            y94.y(((p81) q81Var.r.getValue()).g, null, null, null, null, null, ue5.m0(1063633215, new m40(q81Var, qr0Var, (Context) h02Var.a(sa.y), kq2.Q(my1Var, h02Var), (byte) 1), h02Var), h02Var, 1572872, 62);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nn(q81Var, qr0Var, my1Var, i2, (byte) 5);
        }
    }

    public static final void j(final int i2, jh0 jh0Var, jh0 jh0Var2, boolean z2, my1 my1Var, h02 h02Var, int i3) {
        long jY;
        boolean z3;
        int i4;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1147565087);
        int i5 = i3 | (h02Var2.n(i2) ? 4 : 2) | (h02Var2.n(jh0Var.ordinal()) ? 32 : 16) | (h02Var2.n(jh0Var2.ordinal()) ? 256 : 128) | (h02Var2.l(z2) ? 2048 : 1024) | (h02Var2.j(my1Var) ? 16384 : 8192);
        if (h02Var2.N(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z4 = jh0Var.ordinal() < jh0Var2.ordinal();
            boolean z5 = jh0Var == jh0Var2;
            bw4 bw4VarY = ug.y(z5 ? 1.0f : 0.6f, null, "ClassicSetupStepAlpha", h02Var2, 3072, 22);
            if (z5) {
                h02Var2.X(828771272);
                jY = jr2.u(h02Var2).g;
                h02Var2.b(false);
            } else {
                h02Var2.X(828834760);
                jY = jj0.y(0.2f, jr2.u(h02Var2).t);
                h02Var2.b(false);
            }
            final boolean z6 = z5;
            bw4 bw4VarG = aq4.g(jY, null, "ClassicSetupStepBadge", h02Var, 384, 10);
            g73 g73Var = g73.g;
            j73 j73VarY = jg6.y(ue5.i0(mq4.r(g73Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), ((Number) bw4VarY.getValue()).floatValue());
            kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var, 0);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarY);
            jo0.n.getClass();
            h02Var.b0();
            boolean z7 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z7) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            boolean z8 = z4;
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, kb4VarG);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            Integer numValueOf = Integer.valueOf(iHashCode);
            on0 on0Var3 = tg1.c;
            xs2.E(on0Var3, h02Var, numValueOf);
            xs2.D(h02Var);
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            j73 j73VarA = og0.a(y94.h(mq4.j(g73Var, 24.0f), na4.g), ((jj0) bw4VarG.getValue()).g, yf2.b);
            t33 t33VarR = z50.r(hi0.w, false);
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarA);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            du4.k(iHashCode2, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW2);
            y94.l(Boolean.valueOf(z8), null, null, "ClassicSetupStepDone", ue5.m0(766504586, new cz1() { // from class: f81
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    long j2;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    h02 h02Var3 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= h02Var3.l(zBooleanValue) ? 4 : 2;
                    }
                    if (!h02Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        h02Var3.Q();
                    } else if (zBooleanValue) {
                        h02Var3.X(-1402942820);
                        t92.g(qb6.y(), xs2.I(io.appground.blek.R.string.classic_mode_setup_step_done, h02Var3), mq4.j(g73.g, 16.0f), 0L, h02Var3, 384, 8);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(-1402629937);
                        String strValueOf = String.valueOf(i2);
                        k85 k85Var = ((mf5) h02Var3.a(of5.g)).c;
                        if (z6) {
                            h02Var3.X(-1402469667);
                            j2 = ((rj0) h02Var3.a(tj0.g)).y;
                            h02Var3.b(false);
                        } else {
                            h02Var3.X(-1402373102);
                            j2 = ((rj0) h02Var3.a(tj0.g)).t;
                            h02Var3.b(false);
                        }
                        g75.y(strValueOf, null, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85Var, h02Var3, 0, 0, 131066);
                        h02Var3.b(false);
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 27648, 6);
            h02Var.b(true);
            j73 j73VarI0 = ue5.i0(g73Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
            int iHashCode3 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarI0);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, ek0VarG);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            du4.k(iHashCode3, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW3);
            int iOrdinal = jh0Var.ordinal();
            if (iOrdinal != 0) {
                z3 = true;
                if (iOrdinal == 1) {
                    i4 = io.appground.blek.R.string.classic_mode_setup_step_profile;
                } else {
                    if (iOrdinal != 2) {
                        uo1.g();
                        return;
                    }
                    i4 = io.appground.blek.R.string.classic_mode_setup_step_restart;
                }
            } else {
                z3 = true;
                i4 = io.appground.blek.R.string.classic_mode_setup_step_unlock;
            }
            boolean z9 = z3;
            g75.y(xs2.I(i4, h02Var), null, 0L, 0L, z6 ? qv1.f : qv1.z, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).t, h02Var, 0, 0, 131006);
            y(gk0.g, z6, null, null, null, null, ue5.m0(1172112403, new b81(jh0Var, z2, my1Var, z9 ? (byte) 1 : (byte) 0), h02Var), h02Var, 1572870, 30);
            h02Var2 = h02Var;
            h02Var2.b(z9);
            h02Var2.b(z9);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new g81(i2, jh0Var, jh0Var2, z2, my1Var, i3);
        }
    }

    public static o22 k(o22 o22Var, he heVar, mj0 mj0Var, int i2) {
        if ((i2 & 4) != 0) {
            mj0Var = null;
        }
        return o22Var.n(new nw(heVar, mj0Var));
    }

    public static final void l(final jh0 jh0Var, boolean z2, final my1 my1Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        jh0Var.getClass();
        my1Var.getClass();
        h02Var.Z(-414602270);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.n(jh0Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= h02Var.l(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.j(my1Var) ? 256 : 128;
        }
        byte b2 = 0;
        if (h02Var.N(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                z2 = false;
            }
            t(xs2.I(io.appground.blek.R.string.classic_mode_setup_label, h02Var), xs2.I(io.appground.blek.R.string.classic_mode_setup_title, h02Var), xs2.I(io.appground.blek.R.string.classic_mode_setup_subtitle, h02Var), ((rj0) h02Var.a(tj0.g)).j, ue5.m0(455095198, new b81(jh0Var, z2, my1Var, b2), h02Var), h02Var, 24576, 0);
        } else {
            h02Var.Q();
        }
        final boolean z3 = z2;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: c81
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gp4.l(jh0Var, z3, my1Var, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void m(String str, h02 h02Var, int i2) {
        int i3;
        byte b2;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1684966189);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var2.x(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (h02Var2.N(i3 & 1, (i3 & 3) != 2)) {
            g73 g73Var = g73.g;
            j73 j73VarN = ue5.e0(g73Var, 16.0f).n(mq4.r);
            ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarN);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            String strJ = xs2.J(io.appground.blek.R.string.connection_connecting_title, new Object[]{str}, h02Var2);
            j73 j73VarI0 = ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            g35 g35Var = new g35(3);
            vf1 vf1Var = of5.g;
            g75.y(strJ, j73VarI0, 0L, 0L, null, null, 0L, g35Var, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).v, h02Var, 48, 0, 130044);
            mq2.y(h02Var, mq4.n(g73Var, 8.0f));
            g75.y(xs2.J(io.appground.blek.R.string.connection_connecting_message, new Object[]{str}, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).m, h02Var, 48, 0, 130044);
            h02Var2 = h02Var;
            b04.g(ue5.e0(g73Var, 16.0f), 0L, 0.0f, 0L, 0, 0.0f, h02Var2, 6, 62);
            b2 = 1;
            h02Var2.b(true);
        } else {
            b2 = 1;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new nv0(str, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void n(boolean z2, j73 j73Var, ek1 ek1Var, dm1 dm1Var, String str, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        int i4;
        j73 j73Var2;
        int i5;
        ek1 ek1Var2;
        int i6;
        int i7;
        dm1 dm1Var2;
        int i8;
        int i9;
        nm0 nm0Var2;
        boolean z3;
        j73 j73Var3;
        ek1 ek1VarG;
        dm1 dm1VarG;
        String str2;
        u34 u34VarP;
        float f2;
        Object objK;
        int i10;
        k00 k00Var = hi0.s;
        h02Var.Z(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.l(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                j73Var2 = j73Var;
                i4 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    ek1Var2 = ek1Var;
                    if (h02Var.x(ek1Var2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        dm1Var2 = dm1Var;
                        if (h02Var.x(dm1Var2)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i4 | 24576;
                    if ((196608 & i2) == 0) {
                        nm0Var2 = nm0Var;
                        if (h02Var.j(nm0Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i9 |= i10;
                    } else {
                        nm0Var2 = nm0Var;
                    }
                    if ((74899 & i9) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h02Var.N(i9 & 1, z3)) {
                        if (i11 != 0) {
                            j73Var3 = g73.g;
                        } else {
                            j73Var3 = j73Var2;
                        }
                        if (i5 != 0) {
                            ek1 ek1VarV = yj1.v(null, 3);
                            Map map = ym5.g;
                            f2 = 0.0f;
                            ek1VarG = ek1VarV.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                        } else {
                            f2 = 0.0f;
                            ek1VarG = ek1Var2;
                        }
                        if (i7 != 0) {
                            te5 te5Var = yj1.g;
                            Map map2 = ym5.g;
                            dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                        } else {
                            dm1VarG = dm1Var2;
                        }
                        nc5 nc5VarV = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = vg.w;
                            h02Var.i0(objK);
                        }
                        int i12 = i9 << 3;
                        v(nc5VarV, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016));
                        str2 = "AnimatedVisibility";
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        ek1VarG = ek1Var2;
                        dm1VarG = dm1Var2;
                        str2 = str;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
                    }
                }
                i4 |= 3072;
                dm1Var2 = dm1Var;
                i9 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    nm0Var2 = nm0Var;
                    if (h02Var.j(nm0Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i9 |= i10;
                } else {
                    nm0Var2 = nm0Var;
                }
                if ((74899 & i9) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i9 & 1, z3)) {
                    if (i11 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    if (i5 != 0) {
                        ek1 ek1VarV2 = yj1.v(null, 3);
                        Map map3 = ym5.g;
                        f2 = 0.0f;
                        ek1VarG = ek1VarV2.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                    } else {
                        f2 = 0.0f;
                        ek1VarG = ek1Var2;
                    }
                    if (i7 != 0) {
                        te5 te5Var2 = yj1.g;
                        Map map4 = ym5.g;
                        dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                    } else {
                        dm1VarG = dm1Var2;
                    }
                    nc5 nc5VarV2 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = vg.w;
                        h02Var.i0(objK);
                    }
                    int i13 = i9 << 3;
                    v(nc5VarV2, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    ek1VarG = ek1Var2;
                    dm1VarG = dm1Var2;
                    str2 = str;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
                }
            }
            i4 |= 384;
            ek1Var2 = ek1Var;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    dm1Var2 = dm1Var;
                    if (h02Var.x(dm1Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    nm0Var2 = nm0Var;
                    if (h02Var.j(nm0Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i9 |= i10;
                } else {
                    nm0Var2 = nm0Var;
                }
                if ((74899 & i9) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i9 & 1, z3)) {
                    if (i11 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    if (i5 != 0) {
                        ek1 ek1VarV3 = yj1.v(null, 3);
                        Map map5 = ym5.g;
                        f2 = 0.0f;
                        ek1VarG = ek1VarV3.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                    } else {
                        f2 = 0.0f;
                        ek1VarG = ek1Var2;
                    }
                    if (i7 != 0) {
                        te5 te5Var3 = yj1.g;
                        Map map6 = ym5.g;
                        dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                    } else {
                        dm1VarG = dm1Var2;
                    }
                    nc5 nc5VarV3 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = vg.w;
                        h02Var.i0(objK);
                    }
                    int i14 = i9 << 3;
                    v(nc5VarV3, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    ek1VarG = ek1Var2;
                    dm1VarG = dm1Var2;
                    str2 = str;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
                }
            }
            i4 |= 3072;
            dm1Var2 = dm1Var;
            i9 = i4 | 24576;
            if ((196608 & i2) == 0) {
                nm0Var2 = nm0Var;
                if (h02Var.j(nm0Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i9 |= i10;
            } else {
                nm0Var2 = nm0Var;
            }
            if ((74899 & i9) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i9 & 1, z3)) {
                if (i11 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                if (i5 != 0) {
                    ek1 ek1VarV4 = yj1.v(null, 3);
                    Map map7 = ym5.g;
                    f2 = 0.0f;
                    ek1VarG = ek1VarV4.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                } else {
                    f2 = 0.0f;
                    ek1VarG = ek1Var2;
                }
                if (i7 != 0) {
                    te5 te5Var4 = yj1.g;
                    Map map8 = ym5.g;
                    dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                } else {
                    dm1VarG = dm1Var2;
                }
                nc5 nc5VarV4 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.w;
                    h02Var.i0(objK);
                }
                int i15 = i9 << 3;
                v(nc5VarV4, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                ek1VarG = ek1Var2;
                dm1VarG = dm1Var2;
                str2 = str;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
            }
        }
        i4 |= 48;
        j73Var2 = j73Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                ek1Var2 = ek1Var;
                if (h02Var.x(ek1Var2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    dm1Var2 = dm1Var;
                    if (h02Var.x(dm1Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    nm0Var2 = nm0Var;
                    if (h02Var.j(nm0Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i9 |= i10;
                } else {
                    nm0Var2 = nm0Var;
                }
                if ((74899 & i9) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i9 & 1, z3)) {
                    if (i11 != 0) {
                        j73Var3 = g73.g;
                    } else {
                        j73Var3 = j73Var2;
                    }
                    if (i5 != 0) {
                        ek1 ek1VarV5 = yj1.v(null, 3);
                        Map map9 = ym5.g;
                        f2 = 0.0f;
                        ek1VarG = ek1VarV5.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                    } else {
                        f2 = 0.0f;
                        ek1VarG = ek1Var2;
                    }
                    if (i7 != 0) {
                        te5 te5Var5 = yj1.g;
                        Map map10 = ym5.g;
                        dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                    } else {
                        dm1VarG = dm1Var2;
                    }
                    nc5 nc5VarV5 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = vg.w;
                        h02Var.i0(objK);
                    }
                    int i16 = i9 << 3;
                    v(nc5VarV5, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    ek1VarG = ek1Var2;
                    dm1VarG = dm1Var2;
                    str2 = str;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
                }
            }
            i4 |= 3072;
            dm1Var2 = dm1Var;
            i9 = i4 | 24576;
            if ((196608 & i2) == 0) {
                nm0Var2 = nm0Var;
                if (h02Var.j(nm0Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i9 |= i10;
            } else {
                nm0Var2 = nm0Var;
            }
            if ((74899 & i9) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i9 & 1, z3)) {
                if (i11 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                if (i5 != 0) {
                    ek1 ek1VarV6 = yj1.v(null, 3);
                    Map map11 = ym5.g;
                    f2 = 0.0f;
                    ek1VarG = ek1VarV6.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                } else {
                    f2 = 0.0f;
                    ek1VarG = ek1Var2;
                }
                if (i7 != 0) {
                    te5 te5Var6 = yj1.g;
                    Map map12 = ym5.g;
                    dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                } else {
                    dm1VarG = dm1Var2;
                }
                nc5 nc5VarV6 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.w;
                    h02Var.i0(objK);
                }
                int i17 = i9 << 3;
                v(nc5VarV6, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                ek1VarG = ek1Var2;
                dm1VarG = dm1Var2;
                str2 = str;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
            }
        }
        i4 |= 384;
        ek1Var2 = ek1Var;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                dm1Var2 = dm1Var;
                if (h02Var.x(dm1Var2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i4 | 24576;
            if ((196608 & i2) == 0) {
                nm0Var2 = nm0Var;
                if (h02Var.j(nm0Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i9 |= i10;
            } else {
                nm0Var2 = nm0Var;
            }
            if ((74899 & i9) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i9 & 1, z3)) {
                if (i11 != 0) {
                    j73Var3 = g73.g;
                } else {
                    j73Var3 = j73Var2;
                }
                if (i5 != 0) {
                    ek1 ek1VarV7 = yj1.v(null, 3);
                    Map map13 = ym5.g;
                    f2 = 0.0f;
                    ek1VarG = ek1VarV7.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
                } else {
                    f2 = 0.0f;
                    ek1VarG = ek1Var2;
                }
                if (i7 != 0) {
                    te5 te5Var7 = yj1.g;
                    Map map14 = ym5.g;
                    dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
                } else {
                    dm1VarG = dm1Var2;
                }
                nc5 nc5VarV7 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.w;
                    h02Var.i0(objK);
                }
                int i18 = i9 << 3;
                v(nc5VarV7, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                ek1VarG = ek1Var2;
                dm1VarG = dm1Var2;
                str2 = str;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
            }
        }
        i4 |= 3072;
        dm1Var2 = dm1Var;
        i9 = i4 | 24576;
        if ((196608 & i2) == 0) {
            nm0Var2 = nm0Var;
            if (h02Var.j(nm0Var2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        } else {
            nm0Var2 = nm0Var;
        }
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i9 & 1, z3)) {
            if (i11 != 0) {
                j73Var3 = g73.g;
            } else {
                j73Var3 = j73Var2;
            }
            if (i5 != 0) {
                ek1 ek1VarV8 = yj1.v(null, 3);
                Map map15 = ym5.g;
                f2 = 0.0f;
                ek1VarG = ek1VarV8.g(yj1.r(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1), k00Var, vg.h));
            } else {
                f2 = 0.0f;
                ek1VarG = ek1Var2;
            }
            if (i7 != 0) {
                te5 te5Var8 = yj1.g;
                Map map16 = ym5.g;
                dm1VarG = yj1.j(m50.b0(f2, 400.0f, new qe2(4294967297L), 1), k00Var, vg.o).g(yj1.x(null, 3));
            } else {
                dm1VarG = dm1Var2;
            }
            nc5 nc5VarV8 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, (i9 & 14) | ((i9 >> 9) & 112), 0);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = vg.w;
                h02Var.i0(objK);
            }
            int i19 = i9 << 3;
            v(nc5VarV8, (xy1) objK, j73Var3, ek1VarG, dm1VarG, nm0Var2, h02Var, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            ek1VarG = ek1Var2;
            dm1VarG = dm1Var2;
            str2 = str;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ai(z2, j73Var3, ek1VarG, dm1VarG, str2, nm0Var, i2, i3);
        }
    }

    public static final void o(j73 j73Var, bz1 bz1Var, h02 h02Var, int i2, int i3) {
        int i4;
        h02Var.Z(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (h02Var.x(j73Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.j(bz1Var) ? 32 : 16;
        }
        if (h02Var.N(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                j73Var = g73.g;
            }
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new py4(tg1.p);
                h02Var.i0(objK);
            }
            f((py4) objK, j73Var, bz1Var, h02Var, (i4 << 3) & 1008);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mx2(j73Var, bz1Var, i2, i3);
        }
    }

    public static final void p(xy1 xy1Var, boolean z2, h02 h02Var, int i2) {
        h02Var.Z(-1159898826);
        int i3 = (i2 & 6) == 0 ? (h02Var.j(xy1Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= h02Var.l(z2) ? 32 : 16;
        }
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = kq2.M("");
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            boolean zX = h02Var.x((String) ob3Var.getValue());
            Object objK2 = h02Var.K();
            if (zX || objK2 == obj) {
                String str = (String) ob3Var.getValue();
                str.getClass();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = str.charAt(i4);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String string = sb2.toString();
                vy3 vy3Var = new vy3((byte) 14);
                eg6.g(2, 2);
                int length2 = string.length();
                ArrayList arrayList = new ArrayList((length2 / 2) + (length2 % 2 == 0 ? 0 : 1));
                int i5 = 0;
                while (i5 >= 0 && i5 < length2) {
                    int i6 = i5 + 2;
                    arrayList.add(vy3Var.a(string.subSequence(i5, (i6 < 0 || i6 > length2) ? length2 : i6)));
                    i5 = i6;
                }
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    int i9 = i7 + 1;
                    if (i7 < 0) {
                        pw5.R();
                        throw null;
                    }
                    sb.append((String) obj2);
                    if (i7 < 5) {
                        sb.append(':');
                    }
                    i7 = i9;
                }
                String string2 = sb.toString();
                objK2 = BluetoothAdapter.checkBluetoothAddress(string2) ? string2 : null;
                h02Var.i0(objK2);
            }
            oy0.g(48, ue5.m0(532652201, new yw((String) objK2, xy1Var, ob3Var, z2), h02Var), h02Var, false);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new dw(xy1Var, z2, i2);
        }
    }

    public static final void q(String str, my1 my1Var, h02 h02Var, int i2) {
        int i3;
        String str2;
        my1 my1Var2 = my1Var;
        h02 h02Var2 = h02Var;
        my1Var2.getClass();
        h02Var2.Z(-825992530);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var2.x(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var2.j(my1Var2) ? 32 : 16;
        }
        int i4 = i3;
        if (h02Var2.N(i4 & 1, (i4 & 19) != 18)) {
            g73 g73Var = g73.g;
            j73 j73VarN = ue5.e0(g73Var, 16.0f).n(mq4.r);
            ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarN);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            String strI = xs2.I(io.appground.blek.R.string.connection_upgrade_required, h02Var2);
            j73 j73VarI0 = ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            g35 g35Var = new g35(3);
            vf1 vf1Var = of5.g;
            g75.y(strI, j73VarI0, 0L, 0L, null, null, 0L, g35Var, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).v, h02Var, 48, 0, 130044);
            g75.y(xs2.I(io.appground.blek.R.string.connection_upgrade_required_text, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(vf1Var)).m, h02Var, 48, 0, 130044);
            h02Var2 = h02Var;
            str2 = str;
            my1Var2 = my1Var;
            c93.i(my1Var2, null, false, null, null, null, null, ue5.m0(1603494854, new i80(str2, (byte) 1), h02Var2), h02Var2, ((i4 >> 3) & 14) | 805306368, 510);
            h02Var2.b(true);
        } else {
            str2 = str;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new qs(str2, my1Var2, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void r(lb4 lb4Var, boolean z2, j73 j73Var, ek1 ek1Var, dm1 dm1Var, String str, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        int i4;
        ek1 ek1VarG;
        int i5;
        dm1 dm1VarG;
        int i6;
        int i7;
        boolean z3;
        j73 j73Var2;
        String str2;
        dm1 dm1Var2;
        ek1 ek1Var2;
        u34 u34VarP;
        Object objK;
        int i8;
        h02Var.Z(234057107);
        if ((i2 & 48) == 0) {
            i4 = (h02Var.l(z2) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i4 | 384;
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                ek1VarG = ek1Var;
                i9 |= h02Var.x(ek1VarG) ? 2048 : 1024;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    dm1VarG = dm1Var;
                    if (h02Var.x(dm1VarG)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i9 |= i6;
                }
                i7 = i9 | 196608;
                if ((1572864 & i2) == 0) {
                    if (h02Var.j(nm0Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i7 |= i8;
                }
                if ((599185 & i7) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i7 & 1, z3)) {
                    if (i10 != 0) {
                        ek1VarG = yj1.v(null, 3).g(yj1.y(null, null, 15));
                    }
                    ek1 ek1Var3 = ek1VarG;
                    if (i5 != 0) {
                        dm1VarG = yj1.x(null, 3).g(yj1.l(null, null, 15));
                    }
                    nc5 nc5VarV = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = vg.c;
                        h02Var.i0(objK);
                    }
                    g73 g73Var = g73.g;
                    v(nc5VarV, (xy1) objK, g73Var, ek1Var3, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                    dm1Var2 = dm1VarG;
                    str2 = "AnimatedVisibility";
                    ek1Var2 = ek1Var3;
                    j73Var2 = g73Var;
                } else {
                    h02Var.Q();
                    j73Var2 = j73Var;
                    str2 = str;
                    dm1Var2 = dm1VarG;
                    ek1Var2 = ek1VarG;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bi(lb4Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 0);
                }
            }
            i9 |= 24576;
            dm1VarG = dm1Var;
            i7 = i9 | 196608;
            if ((1572864 & i2) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            }
            if ((599185 & i7) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i7 & 1, z3)) {
                if (i10 != 0) {
                    ek1VarG = yj1.v(null, 3).g(yj1.y(null, null, 15));
                }
                ek1 ek1Var4 = ek1VarG;
                if (i5 != 0) {
                    dm1VarG = yj1.x(null, 3).g(yj1.l(null, null, 15));
                }
                nc5 nc5VarV2 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.c;
                    h02Var.i0(objK);
                }
                g73 g73Var2 = g73.g;
                v(nc5VarV2, (xy1) objK, g73Var2, ek1Var4, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                dm1Var2 = dm1VarG;
                str2 = "AnimatedVisibility";
                ek1Var2 = ek1Var4;
                j73Var2 = g73Var2;
            } else {
                h02Var.Q();
                j73Var2 = j73Var;
                str2 = str;
                dm1Var2 = dm1VarG;
                ek1Var2 = ek1VarG;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bi(lb4Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 0);
            }
        }
        i9 = i4 | 3456;
        ek1VarG = ek1Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                dm1VarG = dm1Var;
                if (h02Var.x(dm1VarG)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i9 |= i6;
            }
            i7 = i9 | 196608;
            if ((1572864 & i2) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            }
            if ((599185 & i7) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i7 & 1, z3)) {
                if (i10 != 0) {
                    ek1VarG = yj1.v(null, 3).g(yj1.y(null, null, 15));
                }
                ek1 ek1Var5 = ek1VarG;
                if (i5 != 0) {
                    dm1VarG = yj1.x(null, 3).g(yj1.l(null, null, 15));
                }
                nc5 nc5VarV3 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.c;
                    h02Var.i0(objK);
                }
                g73 g73Var3 = g73.g;
                v(nc5VarV3, (xy1) objK, g73Var3, ek1Var5, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                dm1Var2 = dm1VarG;
                str2 = "AnimatedVisibility";
                ek1Var2 = ek1Var5;
                j73Var2 = g73Var3;
            } else {
                h02Var.Q();
                j73Var2 = j73Var;
                str2 = str;
                dm1Var2 = dm1VarG;
                ek1Var2 = ek1VarG;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bi(lb4Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 0);
            }
        }
        i9 |= 24576;
        dm1VarG = dm1Var;
        i7 = i9 | 196608;
        if ((1572864 & i2) == 0) {
            if (h02Var.j(nm0Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i7 |= i8;
        }
        if ((599185 & i7) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i7 & 1, z3)) {
            if (i10 != 0) {
                ek1VarG = yj1.v(null, 3).g(yj1.y(null, null, 15));
            }
            ek1 ek1Var6 = ek1VarG;
            if (i5 != 0) {
                dm1VarG = yj1.x(null, 3).g(yj1.l(null, null, 15));
            }
            nc5 nc5VarV4 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = vg.c;
                h02Var.i0(objK);
            }
            g73 g73Var4 = g73.g;
            v(nc5VarV4, (xy1) objK, g73Var4, ek1Var6, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
            dm1Var2 = dm1VarG;
            str2 = "AnimatedVisibility";
            ek1Var2 = ek1Var6;
            j73Var2 = g73Var4;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            str2 = str;
            dm1Var2 = dm1VarG;
            ek1Var2 = ek1VarG;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bi(lb4Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 0);
        }
    }

    public static final void s(xy1 xy1Var, h02 h02Var, int i2) {
        byte b2;
        ArrayList arrayList;
        h02 h02Var2 = h02Var;
        on0 on0Var = tg1.m;
        on0 on0Var2 = tg1.c;
        on0 on0Var3 = tg1.q;
        on0 on0Var4 = tg1.w;
        xy1Var.getClass();
        h02Var2.Z(-144485045);
        if (h02Var2.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M("");
                h02Var2.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            List listD = pw5.d("A", "B", "C", "D", "E", "F", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Clear", "0", "Back");
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            g73 g73Var = g73.g;
            j73 j73VarW = m50.W(h02Var2, g73Var);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z2 = h02Var2.S;
            sx1 sx1Var = um2.Z;
            if (z2) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var4, h02Var2, ek0VarG);
            xs2.E(on0Var3, h02Var2, tr3VarQ);
            xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(on0Var, h02Var2, j73VarW);
            h02Var2.X(-454731424);
            int i3 = 3;
            eg6.g(3, 3);
            if (listD instanceof RandomAccess) {
                int size = listD.size();
                arrayList = new ArrayList((size / 3) + (size % 3 == 0 ? 0 : 1));
                int i4 = 0;
                while (i4 >= 0 && i4 < size) {
                    int i5 = size - i4;
                    if (i3 <= i5) {
                        i5 = i3;
                    }
                    ArrayList arrayList2 = new ArrayList(i5);
                    int i6 = size;
                    int i7 = 0;
                    while (i7 < i5) {
                        int i8 = i7;
                        arrayList2.add(listD.get(i8 + i4));
                        i7 = i8 + 1;
                    }
                    arrayList.add(arrayList2);
                    i4 += 3;
                    size = i6;
                    i3 = 3;
                }
            } else {
                arrayList = new ArrayList();
                Iterator itV = eg6.v(listD.iterator());
                while (itV.hasNext()) {
                    arrayList.add((List) itV.next());
                }
            }
            ArrayList arrayList3 = arrayList;
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                int i10 = i9 + 1;
                List<String> list = (List) arrayList3.get(i9);
                j73 j73VarR = mq4.r(g73Var, 1.0f);
                ArrayList arrayList4 = arrayList3;
                kb4 kb4VarG = jb4.g(new yq(4.0f, true, new l0((byte) 2)), hi0.p, h02Var2, 6);
                g73 g73Var2 = g73Var;
                int iHashCode2 = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ2 = h02Var2.q();
                j73 j73VarW2 = m50.W(h02Var2, j73VarR);
                jo0.n.getClass();
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var4, h02Var2, kb4VarG);
                xs2.E(on0Var3, h02Var2, tr3VarQ2);
                xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode2));
                xs2.D(h02Var2);
                xs2.E(on0Var, h02Var2, j73VarW2);
                h02Var2.X(469557156);
                for (String str : list) {
                    boolean zX = h02Var2.x(str);
                    Object objK2 = h02Var2.K();
                    if (zX || objK2 == l76Var) {
                        objK2 = new lt((Object) str, (Object) xy1Var, (Object) ob3Var, (byte) 5);
                        h02Var2.i0(objK2);
                    }
                    tp2 tp2Var = new tp2(1.0f, true);
                    ma4 ma4VarY = na4.y(8.0f);
                    bo3 bo3Var = b80.g;
                    vf1 vf1Var = tj0.g;
                    c93.x((my1) objK2, tp2Var, false, ma4VarY, b80.g(((rj0) h02Var2.a(vf1Var)).j, ((rj0) h02Var2.a(vf1Var)).t, h02Var, 12), null, null, ue5.b(3, 0.0f), ue5.m0(-1766586662, new i80(str, (byte) 2), h02Var), h02Var, 817889280, 356);
                    h02Var2 = h02Var;
                    on0Var4 = on0Var4;
                    size2 = size2;
                    l76Var = l76Var;
                    ob3Var = ob3Var;
                    sx1Var = sx1Var;
                    on0Var3 = on0Var3;
                }
                h02Var2.b(false);
                h02Var2.b(true);
                i9 = i10;
                arrayList3 = arrayList4;
                g73Var = g73Var2;
                sx1Var = sx1Var;
            }
            b2 = 0;
            h02Var2.b(false);
            h02Var2.b(true);
        } else {
            b2 = 0;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new i81(xy1Var, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void t(final String str, final String str2, final String str3, long j2, final nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        final long j3;
        int i4;
        boolean z2;
        u34 u34VarP;
        str.getClass();
        str2.getClass();
        str3.getClass();
        h02Var.Z(-1096658203);
        int i5 = i2 | (h02Var.x(str) ? 4 : 2) | (h02Var.x(str2) ? 32 : 16) | (h02Var.x(str3) ? 256 : 128);
        if ((i3 & 8) == 0) {
            j3 = j2;
            int i6 = h02Var.v(j3) ? 2048 : 1024;
            i4 = i5 | i6;
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i4 & 1, z2)) {
                h02Var.S();
                if ((i2 & 1) == 0 && !h02Var.k()) {
                    h02Var.Q();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                } else if ((i3 & 8) != 0) {
                    j3 = ((rj0) h02Var.a(tj0.g)).F;
                    i4 &= -7169;
                }
                long j4 = j3;
                h02Var.s();
                uz4.g(ue5.e0(mq4.r(g73.g, 1.0f), 8.0f), na4.y(16.0f), j4, 0L, 0.0f, 0.0f, null, ue5.m0(-1073610944, new zy(str, str2, str3, nm0Var), h02Var), h02Var, ((i4 >> 3) & 896) | 12582918, 120);
                j3 = j4;
            } else {
                h02Var.Q();
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1(str, str2, str3, j3, nm0Var, i2, i3) { // from class: e81
                    public final /* synthetic */ String a;
                    public final /* synthetic */ String j;
                    public final /* synthetic */ long m;
                    public final /* synthetic */ nm0 q;
                    public final /* synthetic */ String t;
                    public final /* synthetic */ byte w;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.w = i3;
                    }

                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(24577);
                        gp4.t(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                        return og5.g;
                    }
                };
            }
        }
        j3 = j2;
        i4 = i5 | i6;
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i4 & 1, z2)) {
            h02Var.S();
            if ((i2 & 1) == 0) {
                if ((i3 & 8) != 0) {
                    j3 = ((rj0) h02Var.a(tj0.g)).F;
                    i4 &= -7169;
                }
            } else if ((i3 & 8) != 0) {
                j3 = ((rj0) h02Var.a(tj0.g)).F;
                i4 &= -7169;
            }
            long j5 = j3;
            h02Var.s();
            uz4.g(ue5.e0(mq4.r(g73.g, 1.0f), 8.0f), na4.y(16.0f), j5, 0L, 0.0f, 0.0f, null, ue5.m0(-1073610944, new zy(str, str2, str3, nm0Var), h02Var), h02Var, ((i4 >> 3) & 896) | 12582918, 120);
            j3 = j5;
        } else {
            h02Var.Q();
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, str2, str3, j3, nm0Var, i2, i3) { // from class: e81
                public final /* synthetic */ String a;
                public final /* synthetic */ String j;
                public final /* synthetic */ long m;
                public final /* synthetic */ nm0 q;
                public final /* synthetic */ String t;
                public final /* synthetic */ byte w;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.w = i3;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(24577);
                    gp4.t(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ, this.w);
                    return og5.g;
                }
            };
        }
    }

    public static final void u(String str, h02 h02Var, int i2) {
        long j2;
        boolean z2;
        h02 h02Var2 = h02Var;
        on0 on0Var = tg1.m;
        on0 on0Var2 = tg1.c;
        on0 on0Var3 = tg1.q;
        on0 on0Var4 = tg1.w;
        str.getClass();
        h02Var2.Z(-60153328);
        int i3 = i2 | (h02Var2.x(str) ? 4 : 2);
        boolean z3 = false;
        boolean z4 = true;
        if (h02Var2.N(i3 & 1, (i3 & 3) != 2)) {
            List listP0 = tx4.p0(str);
            d93 d93Var = v70.x;
            j00 j00Var = hi0.u;
            float f2 = 1.0f;
            j73 j73VarR = mq4.r(g73.g, 1.0f);
            kb4 kb4VarG = jb4.g(d93Var, j00Var, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarR);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z5 = h02Var2.S;
            sx1 sx1Var = um2.Z;
            if (z5) {
                h02Var2.m(sx1Var);
            } else {
                h02Var2.l0();
            }
            xs2.E(on0Var4, h02Var2, kb4VarG);
            xs2.E(on0Var3, h02Var2, tr3VarQ);
            xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(on0Var, h02Var2, j73VarW);
            h02Var2.X(1753813758);
            int i4 = 0;
            while (i4 < 12) {
                String strValueOf = i4 < listP0.size() ? String.valueOf(((Character) listP0.get(i4)).charValue()) : "";
                boolean z6 = i4 == listP0.size() ? z4 : z3;
                k00 k00Var = hi0.w;
                boolean z7 = z4;
                j73 j73VarN = mq4.n(ue5.e0(new tp2(f2, z4), f2), 40.0f);
                float f3 = i4 > listP0.size() + (-1) ? f2 : 0.0f;
                if (z6) {
                    h02Var2.X(1753829436);
                    j2 = jr2.u(h02Var2).r;
                } else {
                    h02Var2.X(1753830970);
                    j2 = jr2.u(h02Var2).B;
                }
                h02Var2.b(z3);
                j73 j73VarS = y94.s(j73VarN, f3, j2, na4.y(4.0f));
                t33 t33VarR = z50.r(k00Var, z3);
                int iHashCode2 = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ2 = h02Var2.q();
                j73 j73VarW2 = m50.W(h02Var2, j73VarS);
                jo0.n.getClass();
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var4, h02Var2, t33VarR);
                xs2.E(on0Var3, h02Var2, tr3VarQ2);
                xs2.E(on0Var2, h02Var2, Integer.valueOf(iHashCode2));
                xs2.D(h02Var2);
                xs2.E(on0Var, h02Var2, j73VarW2);
                on0 on0Var5 = on0Var;
                on0 on0Var6 = on0Var2;
                on0 on0Var7 = on0Var3;
                on0 on0Var8 = on0Var4;
                List list = listP0;
                sx1 sx1Var2 = sx1Var;
                int i5 = i4;
                g75.y(strValueOf, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var2).v, h02Var, 0, 0, 131070);
                h02Var2 = h02Var;
                h02Var2.b(z7);
                if (i5 % 2 != z7) {
                    z2 = false;
                    h02Var2.X(-1465418410);
                    h02Var2.b(false);
                } else if (i5 < 11) {
                    h02Var2.X(-1465504900);
                    i5 = i5;
                    g75.y(":", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var2).v, h02Var, 6, 0, 131070);
                    h02Var2 = h02Var;
                    z2 = false;
                    h02Var2.b(false);
                } else {
                    i5 = i5;
                    z2 = false;
                    h02Var2.X(-1465418410);
                    h02Var2.b(false);
                }
                i4 = i5 + 1;
                z4 = z7;
                z3 = z2;
                on0Var = on0Var5;
                on0Var2 = on0Var6;
                on0Var3 = on0Var7;
                on0Var4 = on0Var8;
                sx1Var = sx1Var2;
                f2 = 1.0f;
                listP0 = list;
            }
            h02Var2.b(z3);
            h02Var2.b(z4);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new wo(str, i2, (byte) 8);
        }
    }

    public static final void v(nc5 nc5Var, xy1 xy1Var, j73 j73Var, ek1 ek1Var, dm1 dm1Var, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        ek1 ek1Var2;
        dm1 dm1Var2;
        nm0 nm0Var2;
        h02Var.Z(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(nc5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ek1Var2 = ek1Var;
            i3 |= h02Var.x(ek1Var2) ? 2048 : 1024;
        } else {
            ek1Var2 = ek1Var;
        }
        if ((i2 & 24576) == 0) {
            dm1Var2 = dm1Var;
            i3 |= h02Var.x(dm1Var2) ? 16384 : 8192;
        } else {
            dm1Var2 = dm1Var;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            nm0Var2 = nm0Var;
            i4 |= h02Var.j(nm0Var2) ? 1048576 : 524288;
        } else {
            nm0Var2 = nm0Var;
        }
        if (h02Var.N(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z2 || objK == l76Var) {
                objK = new ci(xy1Var, nc5Var);
                h02Var.i0(objK);
            }
            j73 j73VarG = ra.G(j73Var, (cz1) objK);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = eh.m;
                h02Var.i0(objK2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            g(nc5Var, xy1Var, j73VarG, ek1Var2, dm1Var2, (bz1) objK2, nm0Var2, h02Var, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xg(nc5Var, xy1Var, j73Var, ek1Var, dm1Var, nm0Var, i2);
        }
    }

    public static final void w(final int i2, final my1 my1Var, final xy1 xy1Var, h02 h02Var, final List list) {
        h02 h02Var2 = h02Var;
        xy1Var.getClass();
        my1Var.getClass();
        h02Var2.Z(-1314226877);
        byte b2 = 4;
        int i3 = (h02Var.x(list) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= h02Var2.j(xy1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var2.j(my1Var) ? 256 : 128;
        }
        if (h02Var2.N(i3 & 1, (i3 & 147) != 146)) {
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            g73 g73Var = g73.g;
            j73 j73VarW = m50.W(h02Var2, g73Var);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, t33VarR);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            bo3 bo3VarS = ue5.s(0.0f, 0.0f, 0.0f, 88.0f, 7);
            i00 i00Var = hi0.f;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objK = h02Var2.K();
            if (z2 || objK == oo0.g) {
                objK = new xf(list, xy1Var, b2);
                h02Var2.i0(objK);
            }
            aq2.g(null, null, bo3VarS, null, i00Var, null, false, null, (xy1) objK, h02Var2, 196992, 475);
            h02Var2 = h02Var;
            m50.q(a11.m, a11.q, my1Var, e60.g.g(ue5.e0(g73Var, 16.0f), hi0.b), false, null, 0L, 0L, null, h02Var2, (i3 & 896) | 54, 1008);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: x71
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gp4.w(aq2.J(i2 | 1), my1Var, xy1Var, (h02) obj, list);
                    return og5.g;
                }
            };
        }
    }

    public static final z40 x(float f2, long j2) {
        return new z40(f2, new cu4(j2));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void y(gk0 gk0Var, boolean z2, j73 j73Var, ek1 ek1Var, dm1 dm1Var, String str, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        int i4;
        ek1 ek1VarG;
        int i5;
        dm1 dm1VarG;
        int i6;
        int i7;
        boolean z3;
        j73 j73Var2;
        String str2;
        dm1 dm1Var2;
        ek1 ek1Var2;
        u34 u34VarP;
        Object objK;
        int i8;
        h02Var.Z(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (h02Var.l(z2) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i4 | 384;
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                ek1VarG = ek1Var;
                i9 |= h02Var.x(ek1VarG) ? 2048 : 1024;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    dm1VarG = dm1Var;
                    if (h02Var.x(dm1VarG)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i9 |= i6;
                }
                i7 = i9 | 196608;
                if ((1572864 & i2) == 0) {
                    if (h02Var.j(nm0Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i7 |= i8;
                }
                if ((599185 & i7) != 599184) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h02Var.N(i7 & 1, z3)) {
                    if (i10 != 0) {
                        ek1VarG = yj1.v(null, 3).g(yj1.n(null, 15));
                    }
                    ek1 ek1Var3 = ek1VarG;
                    if (i5 != 0) {
                        dm1VarG = yj1.x(null, 3).g(yj1.t(null, 15));
                    }
                    nc5 nc5VarV = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = vg.i;
                        h02Var.i0(objK);
                    }
                    g73 g73Var = g73.g;
                    v(nc5VarV, (xy1) objK, g73Var, ek1Var3, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                    dm1Var2 = dm1VarG;
                    str2 = "AnimatedVisibility";
                    ek1Var2 = ek1Var3;
                    j73Var2 = g73Var;
                } else {
                    h02Var.Q();
                    j73Var2 = j73Var;
                    str2 = str;
                    dm1Var2 = dm1VarG;
                    ek1Var2 = ek1VarG;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bi(gk0Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 1);
                }
            }
            i9 |= 24576;
            dm1VarG = dm1Var;
            i7 = i9 | 196608;
            if ((1572864 & i2) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            }
            if ((599185 & i7) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i7 & 1, z3)) {
                if (i10 != 0) {
                    ek1VarG = yj1.v(null, 3).g(yj1.n(null, 15));
                }
                ek1 ek1Var4 = ek1VarG;
                if (i5 != 0) {
                    dm1VarG = yj1.x(null, 3).g(yj1.t(null, 15));
                }
                nc5 nc5VarV2 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.i;
                    h02Var.i0(objK);
                }
                g73 g73Var2 = g73.g;
                v(nc5VarV2, (xy1) objK, g73Var2, ek1Var4, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                dm1Var2 = dm1VarG;
                str2 = "AnimatedVisibility";
                ek1Var2 = ek1Var4;
                j73Var2 = g73Var2;
            } else {
                h02Var.Q();
                j73Var2 = j73Var;
                str2 = str;
                dm1Var2 = dm1VarG;
                ek1Var2 = ek1VarG;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bi(gk0Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 1);
            }
        }
        i9 = i4 | 3456;
        ek1VarG = ek1Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                dm1VarG = dm1Var;
                if (h02Var.x(dm1VarG)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i9 |= i6;
            }
            i7 = i9 | 196608;
            if ((1572864 & i2) == 0) {
                if (h02Var.j(nm0Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i7 |= i8;
            }
            if ((599185 & i7) != 599184) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i7 & 1, z3)) {
                if (i10 != 0) {
                    ek1VarG = yj1.v(null, 3).g(yj1.n(null, 15));
                }
                ek1 ek1Var5 = ek1VarG;
                if (i5 != 0) {
                    dm1VarG = yj1.x(null, 3).g(yj1.t(null, 15));
                }
                nc5 nc5VarV3 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = vg.i;
                    h02Var.i0(objK);
                }
                g73 g73Var3 = g73.g;
                v(nc5VarV3, (xy1) objK, g73Var3, ek1Var5, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
                dm1Var2 = dm1VarG;
                str2 = "AnimatedVisibility";
                ek1Var2 = ek1Var5;
                j73Var2 = g73Var3;
            } else {
                h02Var.Q();
                j73Var2 = j73Var;
                str2 = str;
                dm1Var2 = dm1VarG;
                ek1Var2 = ek1VarG;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bi(gk0Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 1);
            }
        }
        i9 |= 24576;
        dm1VarG = dm1Var;
        i7 = i9 | 196608;
        if ((1572864 & i2) == 0) {
            if (h02Var.j(nm0Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i7 |= i8;
        }
        if ((599185 & i7) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i7 & 1, z3)) {
            if (i10 != 0) {
                ek1VarG = yj1.v(null, 3).g(yj1.n(null, 15));
            }
            ek1 ek1Var6 = ek1VarG;
            if (i5 != 0) {
                dm1VarG = yj1.x(null, 3).g(yj1.t(null, 15));
            }
            nc5 nc5VarV4 = ra.V(Boolean.valueOf(z2), "AnimatedVisibility", h02Var, ((i7 >> 3) & 14) | ((i7 >> 12) & 112), 0);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = vg.i;
                h02Var.i0(objK);
            }
            g73 g73Var4 = g73.g;
            v(nc5VarV4, (xy1) objK, g73Var4, ek1Var6, dm1VarG, nm0Var, h02Var, (i7 & 3670016) | (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7));
            dm1Var2 = dm1VarG;
            str2 = "AnimatedVisibility";
            ek1Var2 = ek1Var6;
            j73Var2 = g73Var4;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            str2 = str;
            dm1Var2 = dm1VarG;
            ek1Var2 = ek1VarG;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bi(gk0Var, z2, j73Var2, ek1Var2, dm1Var2, str2, nm0Var, i2, i3, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v24 */
    public static final void z(final xy1 xy1Var, final String str, final de4 de4Var, final boolean z2, final my1 my1Var, final my1 my1Var2, final boolean z3, final boolean z4, boolean z5, jh0 jh0Var, boolean z6, xy1 xy1Var2, h02 h02Var, final int i2, final int i3) {
        int i4;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        final xy1 xy1Var3;
        final boolean z9;
        final boolean z10;
        final jh0 jh0Var2;
        int i7;
        jh0 jh0Var3;
        xy1 xy1Var4;
        ?? r0;
        boolean z11;
        h02 h02Var2;
        h02 h02Var3 = h02Var;
        xy1Var.getClass();
        str.getClass();
        de4Var.getClass();
        my1Var.getClass();
        my1Var2.getClass();
        h02Var3.Z(-349671505);
        if ((i2 & 6) == 0) {
            i4 = (h02Var3.j(xy1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var3.x(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var3.n(de4Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var3.l(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= h02Var3.j(my1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= h02Var3.j(my1Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= h02Var3.l(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= h02Var3.l(z4) ? 8388608 : 4194304;
        }
        int i8 = i3 & 256;
        if (i8 != 0) {
            i4 |= 100663296;
            z7 = z5;
        } else {
            z7 = z5;
            if ((i2 & 100663296) == 0) {
                i4 |= h02Var3.l(z7) ? 67108864 : 33554432;
            }
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 |= h02Var3.n(jh0Var == null ? -1 : jh0Var.ordinal()) ? 536870912 : 268435456;
        }
        int i10 = i4;
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = 6;
            z8 = z6;
        } else {
            z8 = z6;
            i5 = h02Var3.l(z8) ? 4 : 2;
        }
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i6 = i5 | 48;
        } else {
            i6 = i5 | (h02Var3.j(xy1Var2) ? 32 : 16);
        }
        if (h02Var3.N(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            boolean z12 = i8 != 0 ? false : z7;
            if (i9 != 0) {
                jh0Var3 = jh0.j;
                i7 = i11;
            } else {
                i7 = i11;
                jh0Var3 = jh0Var;
            }
            boolean z13 = i7 != 0 ? false : z8;
            Object obj = oo0.g;
            if (i12 != 0) {
                Object objK = h02Var3.K();
                if (objK == obj) {
                    objK = new wm0((byte) 20);
                    h02Var3.i0(objK);
                }
                xy1Var4 = (xy1) objK;
            } else {
                xy1Var4 = xy1Var2;
            }
            j73 j73VarP = P(rb6.y(mq4.r(g73.g, 1.0f), true, null), O(h02Var3), true);
            boolean z14 = z12;
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var3, 0);
            int iHashCode = Long.hashCode(h02Var3.T);
            tr3 tr3VarQ = h02Var3.q();
            j73 j73VarW = m50.W(h02Var3, j73VarP);
            jo0.n.getClass();
            h02Var3.b0();
            if (h02Var3.S) {
                h02Var3.m(um2.Z);
            } else {
                h02Var3.l0();
            }
            xs2.E(tg1.w, h02Var3, ek0VarG);
            xs2.E(tg1.q, h02Var3, tr3VarQ);
            xs2.E(tg1.c, h02Var3, Integer.valueOf(iHashCode));
            xs2.D(h02Var3);
            xs2.E(tg1.m, h02Var3, j73VarW);
            if (z14) {
                h02Var3.X(-1898359502);
                boolean z15 = ((i6 & 112) == 32) | ((i10 & 1879048192) == 536870912);
                Object objK2 = h02Var3.K();
                if (z15 || objK2 == obj) {
                    objK2 = new p2(xy1Var4, jh0Var3, (byte) 23);
                    h02Var3.i0(objK2);
                }
                r0 = 1;
                z11 = false;
                l(jh0Var3, z13, (my1) objK2, h02Var3, ((i10 >> 27) & 14) | ((i6 << 3) & 112), 0);
                h02Var3.b(false);
            } else {
                r0 = 1;
                z11 = false;
                h02Var3.X(-1898133667);
                h02Var3.b(false);
            }
            if (z3) {
                h02Var3.X(-1898073651);
                t(xs2.I(io.appground.blek.R.string.connection_option_a, h02Var3), xs2.I(io.appground.blek.R.string.connect_to_title, h02Var3), xs2.I(io.appground.blek.R.string.connect_to_subtitle, h02Var3), 0L, ue5.m0(-1965800005, new re(my1Var, z2, r0), h02Var3), h02Var, 24576, 8);
                h02 h02Var4 = h02Var;
                h02Var4.b(z11);
                h02Var2 = h02Var4;
            } else {
                h02Var3.X(-1897197219);
                h02Var3.b(z11);
                h02Var2 = h02Var3;
            }
            int i13 = i10 >> 6;
            y94.l(de4Var, null, null, "ScanModeChange", ue5.m0(-857301230, new ev0(str, my1Var2, (byte) 8), h02Var2), h02Var, (i13 & 14) | 27648, 6);
            if (z4) {
                h02Var.X(-1895349960);
                p(xy1Var, z2, h02Var, (i10 & 14) | (i13 & 112));
                h02Var.b(z11);
            } else {
                h02Var.X(-1895283651);
                h02Var.b(z11);
            }
            h02Var.b(r0);
            z9 = z14;
            jh0Var2 = jh0Var3;
            z10 = z13;
            xy1Var3 = xy1Var4;
        } else {
            h02Var3.Q();
            xy1Var3 = xy1Var2;
            z9 = z7;
            z10 = z8;
            jh0Var2 = jh0Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: a81
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(i2 | 1);
                    gp4.z(xy1Var, str, de4Var, z2, my1Var, my1Var2, z3, z4, z9, jh0Var2, z10, xy1Var3, (h02) obj2, iJ, i3);
                    return og5.g;
                }
            };
        }
    }

    public boolean A(h1 h1Var, g1 g1Var, g1 g1Var2) {
        synchronized (h1Var) {
            try {
                if (h1Var.a != g1Var) {
                    return false;
                }
                h1Var.a = g1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void K(g1 g1Var, g1 g1Var2) {
        g1Var.y = g1Var2;
    }

    public void L(g1 g1Var, Thread thread) {
        g1Var.g = thread;
    }

    public boolean d(h1 h1Var, d1 d1Var, d1 d1Var2) {
        synchronized (h1Var) {
            try {
                if (h1Var.t != d1Var) {
                    return false;
                }
                h1Var.t = d1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(h1 h1Var, Object obj, Object obj2) {
        synchronized (h1Var) {
            try {
                if (h1Var.j != obj) {
                    return false;
                }
                h1Var.j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
