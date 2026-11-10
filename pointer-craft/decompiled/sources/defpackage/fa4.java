package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.g;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class fa4 implements e53, rt0, vv3, jj3, pq, r91, kk5, wl1, e3 {
    public static fa4 a;
    public static final ga4 m = new ga4(0, false, false, 0, 0);
    public static final Object q = new Object();
    public static volatile fa4 w;
    public final /* synthetic */ byte j;
    public Object t;

    public fa4(byte b) {
        this.j = b;
        switch (b) {
            case kq2.x /* 15 */:
                this.t = new ArrayList(20);
                break;
            case 24:
                this.t = new LinkedHashSet();
                break;
            default:
                this.t = new ConcurrentHashMap();
                break;
        }
    }

    public static fa4 A(yi0 yi0Var) {
        fa4 fa4Var = yi0Var.g;
        return fa4Var != null ? fa4Var : new fa4(yi0Var);
    }

    public static synchronized fa4 B() {
        fa4 fa4Var;
        fa4Var = a;
        if (fa4Var == null) {
            fa4Var = new fa4((byte) 0, false);
            a = fa4Var;
        }
        return fa4Var;
    }

    public static fa4 C() {
        if (w == null) {
            synchronized (q) {
                try {
                    if (w == null) {
                        w = new fa4((byte) 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        fa4 fa4Var = w;
        jr2.m(fa4Var);
        return fa4Var;
    }

    public static long H() {
        return System.nanoTime();
    }

    public static void b(b35 b35Var) {
        b35Var.getClass();
        b35Var.notify();
    }

    public static fa4 p(Context context, int i) {
        xs2.x("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, p24.u);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListB = zq2.b(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListB2 = zq2.b(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListB3 = zq2.b(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        l lVar = new l(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        fn4 fn4VarG = fn4.j(contextThemeWrapper.obtainStyledAttributes(p24.E), lVar).g();
        typedArrayObtainStyledAttributes.recycle();
        return new fa4(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, fn4VarG, rect);
    }

    public static void s(b35 b35Var, long j) throws InterruptedException {
        TimeZone timeZone = ws5.g;
        if (j > 0) {
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                b35Var.wait(j2, (int) j3);
            }
        }
    }

    public Long D(int i) {
        r04[] r04VarArr = ((p04) this.t).a;
        r04VarArr.getClass();
        r04 r04Var = (r04) pr.a0(i, r04VarArr);
        if (r04Var != null) {
            return Long.valueOf(r04Var.m);
        }
        return null;
    }

    public PackageInfo E(String str, int i) {
        return ((Context) this.t).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
    public int F(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        r04[] r04VarArr = ((p04) this.t).a;
        r04VarArr.getClass();
        int length = r04VarArr.length;
        int i = 0;
        while (i < length) {
            if (r04VarArr[i].m == jLongValue) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public u33 G(eg2 eg2Var, b21 b21Var, long j) {
        return ((lm2) this.t).v(eg2Var, b21Var, j);
    }

    public void I(x20 x20Var, String str) {
        el0 el0Var = (el0) this.t;
        x20Var.getClass();
        el0Var.f0(new bt0(x20Var, str));
    }

    public void J(String str) {
        ArrayList arrayList = (ArrayList) this.t;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void K(Object obj) {
        y41 y41Var = (y41) this.t;
        if (obj == null) {
            obj = h1.c;
        }
        if (h1.w.e(y41Var, null, obj)) {
            h1.v(y41Var);
        }
    }

    public void L(Exception exc) {
        y41 y41Var = (y41) this.t;
        if (h1.w.e(y41Var, null, new c1(exc))) {
            h1.v(y41Var);
        }
    }

    public void M(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.t;
        if ((serviceConnection instanceof sh6) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public void N(int i, boolean z) {
        ((yi0) this.t).F(i, z);
    }

    public void O(int i, List list, boolean z) {
        boolean z2 = list instanceof s40;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (z2) {
            if (z) {
                yi0Var.Q(i, 2);
                yi0Var.S(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                yi0Var.F(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        yi0Var.S(i3);
        while (i2 < list.size()) {
            yi0Var.E(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public void P(int i, ea0 ea0Var) {
        ((yi0) this.t).G(i, ea0Var);
    }

    public void Q(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((yi0) this.t).G(i, (ea0) list.get(i2));
        }
    }

    public void R(int i, double d) {
        ((yi0) this.t).J(i, Double.doubleToRawLongBits(d));
    }

    public void S(int i, List list, boolean z) {
        boolean z2 = list instanceof ob1;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (z2) {
            if (z) {
                yi0Var.Q(i, 2);
                yi0Var.S(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                yi0Var.J(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        yi0Var.S(i3);
        while (i2 < list.size()) {
            yi0Var.K(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public void T(int i) {
        ((yi0) this.t).Q(i, 4);
    }

    public void U(int i, int i2) {
        ((yi0) this.t).L(i, i2);
    }

    public void V(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += yi0.C(((Integer) list.get(i3)).intValue());
            }
            yi0Var.S(iC);
            while (i2 < list.size()) {
                yi0Var.M(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                yi0Var.L(i, ce2Var.v(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ce2Var.a; i4++) {
            iC2 += yi0.C(ce2Var.v(i4));
        }
        yi0Var.S(iC2);
        while (i2 < ce2Var.a) {
            yi0Var.M(ce2Var.v(i2));
            i2++;
        }
    }

    public void W(int i, int i2) {
        ((yi0) this.t).H(i, i2);
    }

    public void X(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.H(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yi0Var.S(i3);
            while (i2 < list.size()) {
                yi0Var.I(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                yi0Var.H(i, ce2Var.v(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ce2Var.a; i6++) {
            ce2Var.v(i6);
            i5 += 4;
        }
        yi0Var.S(i5);
        while (i2 < ce2Var.a) {
            yi0Var.I(ce2Var.v(i2));
            i2++;
        }
    }

    public void Y(int i, long j) {
        ((yi0) this.t).J(i, j);
    }

    public void Z(int i, List list, boolean z) {
        boolean z2 = list instanceof ly2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.J(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yi0Var.S(i3);
            while (i2 < list.size()) {
                yi0Var.K(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ly2 ly2Var = (ly2) list;
        if (!z) {
            while (i2 < 0) {
                yi0Var.J(i, ly2Var.n(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            ly2Var.n(i6);
            i5 += 8;
        }
        yi0Var.S(i5);
        while (i2 < 0) {
            yi0Var.K(ly2Var.n(i2));
            i2++;
        }
    }

    @Override // defpackage.rt0
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.t).setLinkUri(uri);
    }

    public void a0(int i, float f) {
        ((yi0) this.t).H(i, Float.floatToRawIntBits(f));
    }

    public void b0(int i, List list, boolean z) {
        boolean z2 = list instanceof hq1;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (z2) {
            if (z) {
                yi0Var.Q(i, 2);
                yi0Var.S(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                yi0Var.H(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        yi0Var.S(i3);
        while (i2 < list.size()) {
            yi0Var.I(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // defpackage.rt0
    public ut0 build() {
        return new ut0(new v92(((ContentInfo.Builder) this.t).build()));
    }

    @Override // defpackage.rt0
    public void c(int i) {
        ((ContentInfo.Builder) this.t).setFlags(i);
    }

    public void c0(int i, Object obj, le4 le4Var) {
        yi0 yi0Var = (yi0) this.t;
        yi0Var.Q(i, 3);
        le4Var.v((s0) obj, yi0Var.g);
        yi0Var.Q(i, 4);
    }

    @Override // defpackage.e53
    public boolean d(i43 i43Var) {
        switch (this.j) {
            case 2:
                z3 z3Var = (z3) this.t;
                if (i43Var != z3Var.a) {
                    n43 n43Var = ((ly4) i43Var).A;
                    e53 e53Var = z3Var.q;
                    if (e53Var != null) {
                        return e53Var.d(i43Var);
                    }
                }
                return false;
            default:
                Window.Callback callback = ((tl) this.t).u.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(108, i43Var);
                return true;
        }
    }

    public void d0(int i, List list, le4 le4Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0(i, list.get(i2), le4Var);
        }
    }

    public void e(b35 b35Var, ml mlVar) {
        ((ThreadPoolExecutor) this.t).execute(mlVar);
    }

    public void e0(int i, int i2) {
        ((yi0) this.t).L(i, i2);
    }

    @Override // defpackage.kk5
    public int f(View view) {
        return g.J(view) + ((ViewGroup.MarginLayoutParams) ((y44) view.getLayoutParams())).bottomMargin;
    }

    public void f0(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += yi0.C(((Integer) list.get(i3)).intValue());
            }
            yi0Var.S(iC);
            while (i2 < list.size()) {
                yi0Var.M(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                yi0Var.L(i, ce2Var.v(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < ce2Var.a; i4++) {
            iC2 += yi0.C(ce2Var.v(i4));
        }
        yi0Var.S(iC2);
        while (i2 < ce2Var.a) {
            yi0Var.M(ce2Var.v(i2));
            i2++;
        }
    }

    @Override // defpackage.pq
    public Object g(pf4 pf4Var, Float f, Float f2, xy1 xy1Var, ss4 ss4Var) {
        Object objA = lr2.a(pf4Var, f.floatValue(), v70.g(0.0f, f2.floatValue(), 28), (c11) this.t, xy1Var, ss4Var);
        return objA == px0.j ? objA : (li) objA;
    }

    public void g0(int i, long j) {
        ((yi0) this.t).T(i, j);
    }

    @Override // defpackage.kk5
    public int h() {
        return ((g) this.t).getPaddingTop();
    }

    public void h0(int i, List list, boolean z) {
        boolean z2 = list instanceof ly2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.T(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += yi0.C(((Long) list.get(i3)).longValue());
            }
            yi0Var.S(iC);
            while (i2 < list.size()) {
                yi0Var.U(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ly2 ly2Var = (ly2) list;
        if (!z) {
            while (i2 < 0) {
                yi0Var.T(i, ly2Var.n(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iC2 += yi0.C(ly2Var.n(i4));
        }
        yi0Var.S(iC2);
        while (i2 < 0) {
            yi0Var.U(ly2Var.n(i2));
            i2++;
        }
    }

    public int i() {
        return ((Context) this.t).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms");
    }

    public void i0(int i, Object obj, le4 le4Var) {
        ((yi0) this.t).O(i, (s0) obj, le4Var);
    }

    @Override // defpackage.r91
    public boolean j(float f) {
        if (f == 0.0f) {
            return false;
        }
        w();
        ((NestedScrollView) this.t).m((int) f);
        return true;
    }

    public void j0(int i, List list, le4 le4Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            i0(i, list.get(i2), le4Var);
        }
    }

    public void k(long j) {
        long jY = n85.y(j);
        byte b = 0;
        if (!o85.g(jY, 0L)) {
            if (o85.g(jY, 4294967296L)) {
                b = 1;
            } else if (o85.g(jY, 8589934592L)) {
                b = 2;
            }
        }
        z(b);
        if (o85.g(n85.y(j), 0L)) {
            return;
        }
        o(n85.r(j));
    }

    public void k0(int i, int i2) {
        ((yi0) this.t).H(i, i2);
    }

    @Override // defpackage.kk5
    public int l() {
        g gVar = (g) this.t;
        return gVar.o - gVar.getPaddingBottom();
    }

    public void l0(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.H(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yi0Var.S(i3);
            while (i2 < list.size()) {
                yi0Var.I(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                yi0Var.H(i, ce2Var.v(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ce2Var.a; i6++) {
            ce2Var.v(i6);
            i5 += 4;
        }
        yi0Var.S(i5);
        while (i2 < ce2Var.a) {
            yi0Var.I(ce2Var.v(i2));
            i2++;
        }
    }

    @Override // defpackage.kk5
    public int m(View view) {
        return g.P(view) - ((ViewGroup.MarginLayoutParams) ((y44) view.getLayoutParams())).topMargin;
    }

    public void m0(int i, long j) {
        ((yi0) this.t).J(i, j);
    }

    @Override // defpackage.wl1
    public m34 n() throws Throwable {
        IOException iOException = null;
        while (!((r34) this.t).q.k) {
            try {
                ra4 ra4VarY = ((r34) this.t).y();
                if (!ra4VarY.v()) {
                    qa4 qa4VarL = ra4VarY.l();
                    if (qa4VarL.y == null && qa4VarL.r == null) {
                        qa4VarL = ra4VarY.r();
                    }
                    ra4 ra4Var = qa4VarL.y;
                    Throwable th = qa4VarL.r;
                    if (th != null) {
                        throw th;
                    }
                    if (ra4Var != null) {
                        ((r34) this.t).s.addFirst(ra4Var);
                    }
                }
                return ra4VarY.n();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    kf6.g(iOException, e);
                }
                if (e instanceof fg1) {
                    throw iOException;
                }
                if (!((r34) this.t).g(null)) {
                    throw iOException;
                }
            }
        }
        uo1.t("Canceled");
        return null;
    }

    public void n0(int i, List list, boolean z) {
        boolean z2 = list instanceof ly2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.J(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yi0Var.S(i3);
            while (i2 < list.size()) {
                yi0Var.K(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ly2 ly2Var = (ly2) list;
        if (!z) {
            while (i2 < 0) {
                yi0Var.J(i, ly2Var.n(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            ly2Var.n(i6);
            i5 += 8;
        }
        yi0Var.S(i5);
        while (i2 < 0) {
            yi0Var.K(ly2Var.n(i2));
            i2++;
        }
    }

    public void o(float f) {
        ((Parcel) this.t).writeFloat(f);
    }

    public void o0(int i, int i2) {
        ((yi0) this.t).R(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void p0(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    yi0Var.R(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += yi0.z(((Integer) list.get(i3)).intValue());
            }
            yi0Var.S(iZ);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                yi0Var.S((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                int iV = ce2Var.v(i2);
                yi0Var.R(i, (iV >> 31) ^ (iV << 1));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < ce2Var.a; i4++) {
            iZ2 += yi0.z(ce2Var.v(i4));
        }
        yi0Var.S(iZ2);
        while (i2 < ce2Var.a) {
            int iV2 = ce2Var.v(i2);
            yi0Var.S((iV2 >> 31) ^ (iV2 << 1));
            i2++;
        }
    }

    @Override // defpackage.r91
    public float q() {
        return -((NestedScrollView) this.t).getVerticalScrollFactorCompat();
    }

    public void q0(int i, long j) {
        ((yi0) this.t).T(i, (j >> 63) ^ (j << 1));
    }

    @Override // defpackage.e3
    public boolean r(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.t;
        if (!swipeDismissBehavior.p(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        byte b = swipeDismissBehavior.n;
        int width = (!(b == 0 && z) && (b != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = xk5.g;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    public void r0(int i, List list, boolean z) {
        boolean z2 = list instanceof ly2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    yi0Var.T(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO += yi0.o(((Long) list.get(i3)).longValue());
            }
            yi0Var.S(iO);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                yi0Var.U((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        ly2 ly2Var = (ly2) list;
        if (!z) {
            while (i2 < 0) {
                long jN = ly2Var.n(i2);
                yi0Var.T(i, (jN >> 63) ^ (jN << 1));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iO2 += yi0.o(ly2Var.n(i4));
        }
        yi0Var.S(iO2);
        while (i2 < 0) {
            long jN2 = ly2Var.n(i2);
            yi0Var.U((jN2 >> 63) ^ (jN2 << 1));
            i2++;
        }
    }

    public void s0(int i) {
        ((yi0) this.t).Q(i, 3);
    }

    @Override // defpackage.rt0
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.t).setExtras(bundle);
    }

    @Override // defpackage.jj3
    public tp5 t(View view, tp5 tp5Var) {
        pp5 pp5Var = tp5Var.g;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.t;
        if (!Objects.equals(coordinatorLayout.h, tp5Var)) {
            coordinatorLayout.h = tp5Var;
            boolean z = tp5Var.n() > 0;
            coordinatorLayout.o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!pp5Var.u()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = xk5.g;
                    if (childAt.getFitsSystemWindows() && ((ew0) childAt.getLayoutParams()).g != null && pp5Var.u()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return tp5Var;
    }

    public void t0(String str, int i) {
        ((yi0) this.t).P(str, i);
    }

    @Override // defpackage.kk5
    public View u(int i) {
        return ((g) this.t).F(i);
    }

    public void u0(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((yi0) this.t).P((String) list.get(i2), i);
        }
    }

    @Override // defpackage.vv3
    public long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        long j3 = ((je2) ((my1) this.t).g()).g;
        int iY = jd6.y(ne2Var.g + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), fl2Var == fl2.j);
        return (((long) jd6.y(ne2Var.y + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iY) << 32);
    }

    public void v0(int i, int i2) {
        ((yi0) this.t).R(i, i2);
    }

    @Override // defpackage.r91
    public void w() {
        ((NestedScrollView) this.t).m.abortAnimation();
    }

    public void w0(int i, List list, boolean z) {
        boolean z2 = list instanceof ce2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.R(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += yi0.A(((Integer) list.get(i3)).intValue());
            }
            yi0Var.S(iA);
            while (i2 < list.size()) {
                yi0Var.S(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ce2 ce2Var = (ce2) list;
        if (!z) {
            while (i2 < ce2Var.a) {
                yi0Var.R(i, ce2Var.v(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < ce2Var.a; i4++) {
            iA2 += yi0.A(ce2Var.v(i4));
        }
        yi0Var.S(iA2);
        while (i2 < ce2Var.a) {
            yi0Var.S(ce2Var.v(i2));
            i2++;
        }
    }

    @Override // defpackage.wl1
    public r34 x() {
        return (r34) this.t;
    }

    public void x0(int i, long j) {
        ((yi0) this.t).T(i, j);
    }

    @Override // defpackage.e53
    public void y(i43 i43Var, boolean z) {
        switch (this.j) {
            case 2:
                if (i43Var instanceof ly4) {
                    ((ly4) i43Var).e.q().n(false);
                }
                e53 e53Var = ((z3) this.t).q;
                if (e53Var != null) {
                    e53Var.y(i43Var, z);
                }
                break;
            default:
                ((tl) this.t).b(i43Var);
                break;
        }
    }

    public void y0(int i, List list, boolean z) {
        boolean z2 = list instanceof ly2;
        yi0 yi0Var = (yi0) this.t;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    yi0Var.T(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yi0Var.Q(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += yi0.C(((Long) list.get(i3)).longValue());
            }
            yi0Var.S(iC);
            while (i2 < list.size()) {
                yi0Var.U(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ly2 ly2Var = (ly2) list;
        if (!z) {
            while (i2 < 0) {
                yi0Var.T(i, ly2Var.n(i2));
                i2++;
            }
            return;
        }
        yi0Var.Q(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iC2 += yi0.C(ly2Var.n(i4));
        }
        yi0Var.S(iC2);
        while (i2 < 0) {
            yi0Var.U(ly2Var.n(i2));
            i2++;
        }
    }

    public void z(byte b) {
        ((Parcel) this.t).writeByte(b);
    }

    public boolean z0(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.t;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) is5.g(context).t).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof sh6) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public /* synthetic */ fa4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public /* synthetic */ fa4(byte b, boolean z) {
        this.j = b;
    }

    public fa4(yi0 yi0Var) {
        this.j = (byte) 7;
        Charset charset = ff2.g;
        this.t = yi0Var;
        yi0Var.g = this;
    }

    public fa4(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, fn4 fn4Var, Rect rect) {
        this.j = (byte) 6;
        xs2.j(rect.left);
        xs2.j(rect.top);
        xs2.j(rect.right);
        xs2.j(rect.bottom);
        this.t = fn4Var;
    }

    public fa4(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.j = (byte) 16;
        if (Build.VERSION.SDK_INT >= 25) {
            this.t = new xc2(uri, clipDescription, uri2);
        } else {
            this.t = new q70(uri, clipDescription, uri2, (byte) 4);
        }
    }

    public fa4(vs5 vs5Var) {
        this.j = (byte) 28;
        this.t = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), vs5Var);
    }

    public fa4(ClipData clipData, int i) {
        this.j = (byte) 8;
        this.t = na.v(clipData, i);
    }
}
