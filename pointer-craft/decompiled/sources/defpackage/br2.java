package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.appground.blek.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class br2 {
    public static ha2 g = null;
    public static final /* synthetic */ int r = 0;
    public static final float y = 0.38f;

    public static final Object A(ju2 ju2Var, wt2 wt2Var, bz1 bz1Var, zz4 zz4Var) {
        Object objB;
        if (wt2Var != wt2.t) {
            return (ju2Var.t != wt2.j && (objB = k33.B(new sg(ju2Var, wt2Var, bz1Var, null, (byte) 5), zz4Var)) == px0.j) ? objB : og5.g;
        }
        l0.u("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static void B(View view, g33 g33Var) {
        zg1 zg1Var = g33Var.t.y;
        if (zg1Var == null || !zg1Var.g) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        e33 e33Var = g33Var.t;
        if (e33Var.q != elevation) {
            e33Var.q = elevation;
            g33Var.d();
        }
    }

    public static final Object C(p95 p95Var, bz1 bz1Var) throws Throwable {
        v70.A(p95Var, new bb1(yf2.G(p95Var.q.v()).u(p95Var.w, p95Var, p95Var.m)));
        return lr2.G(p95Var, false, p95Var, bz1Var);
    }

    public static final Object D(long j, bz1 bz1Var, ou0 ou0Var) {
        if (j > 0) {
            return C(new p95(j, ou0Var), bz1Var);
        }
        throw new n95("Timed out immediately", null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E(long j, bz1 bz1Var, ou0 ou0Var) throws Throwable {
        q95 q95Var;
        u54 u54Var;
        if (ou0Var instanceof q95) {
            q95Var = (q95) ou0Var;
            int i = q95Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                q95Var.w = i - Integer.MIN_VALUE;
            } else {
                q95Var = new q95(ou0Var);
            }
        } else {
            q95Var = new q95(ou0Var);
        }
        Object obj = q95Var.q;
        int i2 = q95Var.w;
        if (i2 == 0) {
            js2.o(obj);
            if (j > 0) {
                u54 u54Var2 = new u54();
                try {
                    q95Var.m = u54Var2;
                    q95Var.w = 1;
                    p95 p95Var = new p95(j, q95Var);
                    u54Var2.j = p95Var;
                    Object objC = C(p95Var, bz1Var);
                    px0 px0Var = px0.j;
                    return objC == px0Var ? px0Var : objC;
                } catch (n95 e) {
                    e = e;
                    u54Var = u54Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        u54Var = q95Var.m;
        try {
            js2.o(obj);
            return obj;
        } catch (n95 e2) {
            e = e2;
        }
        if (e.j != u54Var.j) {
            throw e;
        }
        return null;
    }

    public static Object F(nj6 nj6Var) throws ExecutionException {
        if (nj6Var.t()) {
            return nj6Var.l();
        }
        if (nj6Var.n) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(nj6Var.x());
    }

    public static void G(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                l0.q(xi3.j("at index ", i2));
                return;
            }
        }
    }

    public static final void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            l0.j(i3, du4.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            l0.u(du4.m(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static nj6 b(Exception exc) {
        nj6 nj6Var = new nj6();
        nj6Var.w(exc);
        return nj6Var;
    }

    public static final k44 c(i73 i73Var, boolean z, boolean z2) {
        if (!i73Var.j.h) {
            return k44.v;
        }
        if (z) {
            return k33.T(i73Var, 8).v1();
        }
        gh3 gh3VarT = k33.T(i73Var, 8);
        return m50.K(gh3VarT).H(gh3VarT, z2);
    }

    public static final void d(ej4 ej4Var) {
        k33.V(ej4Var).H();
    }

    public static MappedByteBuffer e(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static File f(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, xi3.j(str, i));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final void g(my1 my1Var, j73 j73Var, pr2 pr2Var, cr2 cr2Var, h02 h02Var, int i) {
        cr2 cr2Var2;
        pr2 pr2Var2;
        j73 j73Var2;
        h02Var.Z(1055276397);
        int i2 = (h02Var.j(my1Var) ? 4 : 2) | i | (h02Var.x(j73Var) ? 32 : 16) | (h02Var.x(pr2Var) ? 256 : 128) | (h02Var.x(cr2Var) ? 2048 : 1024);
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            cr2Var2 = cr2Var;
            ar2 ar2Var = new ar2(pr2Var, j73Var, cr2Var2, kq2.Q(my1Var, h02Var), (byte) 0);
            pr2Var2 = pr2Var;
            j73Var2 = j73Var;
            xs2.g(ue5.m0(-933153643, ar2Var, h02Var), h02Var, 6);
        } else {
            cr2Var2 = cr2Var;
            pr2Var2 = pr2Var;
            j73Var2 = j73Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new k71(my1Var, j73Var2, pr2Var2, cr2Var2, i);
        }
    }

    public static final int h(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                l0.u("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static View i(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final void j(int i, int i2) {
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
        }
    }

    public static final int k(tb4 tb4Var) {
        cc4 cc4VarO = tb4Var.O("SELECT changes()");
        try {
            cc4VarO.H();
            int i = (int) cc4VarO.getLong(0);
            c93.h(cc4VarO, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    public static final void l(View view) {
        view.getClass();
        Iterator it = bb6.g(view).iterator();
        while (true) {
            ck4 ck4Var = (ck4) it;
            if (!ck4Var.hasNext()) {
                return;
            }
            ArrayList arrayList = z((View) ck4Var.next()).g;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((zk5) arrayList.get(size)).g.v();
                }
            }
        }
    }

    public static boolean m(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zQ = q(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zQ;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static Object n(nj6 nj6Var) {
        if (vc6.x()) {
            l0.z("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            l0.z("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        jr2.q(nj6Var, "Task must not be null");
        if (nj6Var.j()) {
            return F(nj6Var);
        }
        ha5 ha5Var = new ha5();
        Executor executor = y25.y;
        nj6Var.n(executor, ha5Var);
        nj6Var.r(executor, ha5Var);
        nj6Var.y.g(new w86(executor, (wj3) ha5Var));
        nj6Var.i();
        ha5Var.g();
        return F(nj6Var);
    }

    public static final ha2 o() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Smartphone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(17.0f, 1.01f);
        kq3Var.x(7.0f, 1.0f);
        kq3Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        kq3Var.w(18.0f);
        kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(10.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.q(3.0f);
        kq3Var.r(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        kq3Var.g();
        kq3Var.j(17.0f, 19.0f);
        kq3Var.n(7.0f);
        kq3Var.q(5.0f);
        kq3Var.v(10.0f);
        kq3Var.w(14.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static boolean q(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void r(final jd3 jd3Var, final String str, final j73 j73Var, u6 u6Var, final xy1 xy1Var, final xy1 xy1Var2, final xy1 xy1Var3, final xy1 xy1Var4, bz1 bz1Var, bz1 bz1Var2, final xy1 xy1Var5, h02 h02Var, final int i) {
        int i2;
        j73 j73Var2;
        xy1 xy1Var6;
        xy1 xy1Var7;
        final u6 u6Var2;
        final bz1 bz1Var3;
        final bz1 bz1Var4;
        u6 u6Var3;
        bz1 bz1Var5;
        bz1 bz1Var6;
        h02Var.Z(621695386);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(jd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j73Var2 = j73Var;
            i2 |= h02Var.x(j73Var2) ? 256 : 128;
        } else {
            j73Var2 = j73Var;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            xy1Var6 = xy1Var;
            i3 |= h02Var.j(xy1Var6) ? 131072 : 65536;
        } else {
            xy1Var6 = xy1Var;
        }
        if ((1572864 & i) == 0) {
            xy1Var7 = xy1Var2;
            i3 |= h02Var.j(xy1Var7) ? 1048576 : 524288;
        } else {
            xy1Var7 = xy1Var2;
        }
        if ((12582912 & i) == 0) {
            i3 |= h02Var.j(xy1Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= h02Var.j(xy1Var4) ? 67108864 : 33554432;
        }
        int i4 = i3 | 805306368;
        int i5 = (h02Var.j(xy1Var5) ? (char) 256 : (char) 128) | '6';
        if (h02Var.N(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                u6Var3 = hi0.t;
                bz1Var5 = yf2.w;
                bz1Var6 = yf2.c;
            } else {
                h02Var.Q();
                u6Var3 = u6Var;
                bz1Var5 = bz1Var;
                bz1Var6 = bz1Var2;
            }
            h02Var.s();
            boolean z = ((i4 & 112) == 32) | ((i4 & 57344) == 16384) | ((i5 & 896) == 256);
            Object objK = h02Var.K();
            if (z || objK == oo0.g) {
                ed3 ed3Var = new ed3(jd3Var.y.u, str);
                xy1Var5.a(ed3Var);
                objK = ed3Var.r();
                h02Var.i0(objK);
            }
            int i6 = i4 & 8078;
            int i7 = i4 >> 3;
            int i8 = (i7 & 234881024) | i6 | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | 805306368;
            u6 u6Var4 = u6Var3;
            y(jd3Var, (dd3) objK, j73Var2, u6Var4, xy1Var6, xy1Var7, xy1Var3, xy1Var4, bz1Var5, bz1Var6, h02Var, i8, 6);
            u6Var2 = u6Var4;
            bz1Var4 = bz1Var6;
            bz1Var3 = bz1Var5;
        } else {
            h02Var.Q();
            u6Var2 = u6Var;
            bz1Var3 = bz1Var;
            bz1Var4 = bz1Var2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: nd3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    br2.r(jd3Var, str, j73Var, u6Var2, xy1Var, xy1Var2, xy1Var3, xy1Var4, bz1Var3, bz1Var4, xy1Var5, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static nj6 s(Object obj) {
        nj6 nj6Var = new nj6();
        nj6Var.m(obj);
        return nj6Var;
    }

    public static final void t(int i, int i2) {
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
        }
    }

    public static final s73 u(fx0 fx0Var) {
        s73 s73Var = (s73) fx0Var.h(f73.m);
        if (s73Var != null) {
            return s73Var;
        }
        l0.z("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static Object v(nj6 nj6Var) throws TimeoutException {
        if (vc6.x()) {
            l0.z("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            l0.z("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        jr2.q(TimeUnit.MILLISECONDS, "TimeUnit must not be null");
        if (nj6Var.j()) {
            return F(nj6Var);
        }
        ha5 ha5Var = new ha5();
        Executor executor = y25.y;
        nj6Var.n(executor, ha5Var);
        nj6Var.r(executor, ha5Var);
        nj6Var.y.g(new w86(executor, (wj3) ha5Var));
        nj6Var.i();
        if (ha5Var.r()) {
            return F(nj6Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static og0 w(int i) {
        if (i != 0) {
            return i != 1 ? new oa4() : new az0();
        }
        return new oa4();
    }

    public static nj6 x(Executor executor, Callable callable) {
        jr2.q(executor, "Executor must not be null");
        nj6 nj6Var = new nj6();
        executor.execute(new tu2((byte) 13, nj6Var, callable, false));
        return nj6Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23011. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void y(defpackage.jd3 r40, defpackage.dd3 r41, defpackage.j73 r42, defpackage.u6 r43, defpackage.xy1 r44, defpackage.xy1 r45, defpackage.xy1 r46, defpackage.xy1 r47, defpackage.bz1 r48, defpackage.bz1 r49, defpackage.h02 r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 2301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br2.y(jd3, dd3, j73, u6, xy1, xy1, xy1, xy1, bz1, bz1, h02, int, int):void");
    }

    public static final pv3 z(View view) {
        pv3 pv3Var = (pv3) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (pv3Var != null) {
            return pv3Var;
        }
        pv3 pv3Var2 = new pv3();
        view.setTag(R.id.pooling_container_listener_holder_tag, pv3Var2);
        return pv3Var2;
    }

    public abstract k44 p();
}
