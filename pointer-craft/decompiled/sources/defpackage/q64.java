package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class q64 implements jj3, bn, h23 {
    public static final v02 a = new v02(1);
    public static final hi0 m = new hi0(19);
    public final /* synthetic */ byte j;
    public Object t;

    public q64(byte b) {
        k53 k53Var;
        this.j = b;
        Object obj = null;
        switch (b) {
            case 2:
                int i = z46.g;
                jy3 jy3Var = new jy3(new s86[]{d52.i, m});
                Charset charset = m76.g;
                this.t = jy3Var;
                break;
            case 7:
                this.t = new AtomicInteger(0);
                break;
            case 10:
                this.t = new rb3(new ot0[16]);
                break;
            case kq2.x /* 15 */:
                this.t = y94.w(dg5.y);
                break;
            case 16:
                this.t = k33.D(Looper.getMainLooper());
                break;
            case 20:
                this.t = null;
                break;
            case 29:
                this.t = new uy2(obj);
                break;
            default:
                z04 z04Var = z04.r;
                try {
                    k53Var = (k53) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    k53Var = a;
                }
                k53[] k53VarArr = {v02.y, k53Var};
                z03 z03Var = new z03();
                z03Var.g = k53VarArr;
                Charset charset2 = ff2.g;
                this.t = z03Var;
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList j(defpackage.q64 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q64.j(q64, java.lang.String):java.util.ArrayList");
    }

    public static or2 q(q64 q64Var, int i) {
        ss2 ss2Var = (ss2) q64Var.t;
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            ls2 ls2Var = (ls2) ss2Var.x.getValue();
            return ss2Var.s.g(i, ls2Var.a, ss2Var.n, new m92(i, ls2Var));
        } finally {
            js2.z(at4VarM, at4VarB, xy1VarV);
        }
    }

    public mf2 a(rk4 rk4Var, ba baVar) {
        long jR;
        boolean zG;
        long jN;
        uy2 uy2Var = (uy2) this.t;
        uy2 uy2Var2 = new uy2(((ArrayList) rk4Var.k()).size());
        ArrayList arrayList = (ArrayList) rk4Var.k();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            su3 su3Var = (su3) arrayList.get(i);
            ru3 ru3Var = (ru3) uy2Var.y(su3Var.r());
            if (ru3Var == null) {
                zG = false;
                jR = su3Var.q();
                jN = su3Var.x();
            } else {
                jR = ru3Var.r();
                zG = ru3Var.g();
                jN = baVar.N(ru3Var.y());
            }
            uy2Var2.v(su3Var.r(), new qu3(su3Var.r(), su3Var.q(), su3Var.x(), su3Var.g(), su3Var.j(), jR, jN, zG, su3Var.m(), su3Var.y(), su3Var.a(), su3Var.t(), su3Var.v(), su3Var.n(), 0));
            if (su3Var.g()) {
                uy2Var.v(su3Var.r(), new ru3(su3Var.q(), su3Var.l(), su3Var.g()));
            } else {
                uy2Var.x(su3Var.r());
            }
        }
        return new mf2(uy2Var2, rk4Var);
    }

    public void c(int i, Object obj, me4 me4Var) {
        xi0 xi0Var = (xi0) this.t;
        xi0Var.B(i, 3);
        me4Var.l((t0) obj, xi0Var.g);
        xi0Var.B(i, 4);
    }

    public Typeface l(p74 p74Var) {
        Context context = (Context) this.t;
        if (!(p74Var instanceof p74)) {
            return null;
        }
        Typeface typefaceG = x74.g(context, p74Var.g);
        typefaceG.getClass();
        ov1 ov1Var = p74Var.n;
        if (Build.VERSION.SDK_INT >= 26) {
            ThreadLocal threadLocal = af5.g;
            if (typefaceG == null) {
                return null;
            }
            if (!ov1Var.g.isEmpty()) {
                ThreadLocal threadLocal2 = af5.g;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(typefaceG);
                paint.setFontVariationSettings(yc6.y(ov1Var, context));
                return paint.getTypeface();
            }
        }
        return typefaceG;
    }

    public void m() {
        rb3 rb3Var = (rb3) this.t;
        me2 me2VarK = xs2.K(0, rb3Var.a);
        int i = me2VarK.j;
        int i2 = me2VarK.t;
        if (i <= i2) {
            while (true) {
                ((ot0) rb3Var.j[i]).y.j(og5.g);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        rb3Var.j();
    }

    public void n(CancellationException cancellationException) {
        rb3 rb3Var = (rb3) this.t;
        int i = rb3Var.a;
        hb0[] hb0VarArr = new hb0[i];
        for (int i2 = 0; i2 < i; i2++) {
            hb0VarArr[i2] = ((ot0) rb3Var.j[i2]).y;
        }
        for (int i3 = 0; i3 < i; i3++) {
            hb0VarArr[i3].s(cancellationException);
        }
        if (rb3Var.a == 0) {
            return;
        }
        pc2.r("uncancelled requests present");
    }

    @Override // defpackage.jj3
    public tp5 t(View view, tp5 tp5Var) {
        tp5 tp5VarY;
        gp5 ap5Var;
        int iN = tp5Var.n();
        tl tlVar = (tl) this.t;
        int iN2 = tp5Var.n();
        ActionBarContextView actionBarContextView = tlVar.B;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tlVar.B.getLayoutParams();
            boolean z = false;
            if (tlVar.B.isShown()) {
                if (tlVar.h0 == null) {
                    tlVar.h0 = new Rect();
                    tlVar.i0 = new Rect();
                }
                Rect rect = tlVar.h0;
                Rect rect2 = tlVar.i0;
                rect.set(tp5Var.y(), tp5Var.n(), tp5Var.r(), tp5Var.g());
                nd2 nd2VarT = tp5Var.g.t(2);
                ViewGroup viewGroup = tlVar.G;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = km5.g;
                    sj.y(viewGroup, rect, rect2);
                } else {
                    if (!km5.g) {
                        km5.g = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            km5.y = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                km5.y.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = km5.y;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                nd2 nd2VarR = nd2.r(Math.max(0, nd2VarT.g - rect2.left), Math.max(0, nd2VarT.y - rect2.top), Math.max(0, nd2VarT.r - rect2.right), Math.max(0, nd2VarT.n - rect2.bottom));
                int i = nd2VarR.r;
                int i2 = marginLayoutParams.leftMargin;
                int i3 = nd2VarR.g;
                if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                }
                tlVar.B.t(rect.left - i3, rect.top, rect.right - i);
                if (!tlVar.M && rect.top > 0) {
                    iN2 = 0;
                }
                z = z2;
            }
            if (z) {
                tlVar.B.setLayoutParams(marginLayoutParams);
            }
        }
        if (iN != iN2) {
            int iY = tp5Var.y();
            int iR = tp5Var.r();
            int iG = tp5Var.g();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 36) {
                ap5Var = new fp5(tp5Var);
            } else if (i4 >= 35) {
                ap5Var = new ep5(tp5Var);
            } else if (i4 >= 34) {
                ap5Var = new dp5(tp5Var);
            } else if (i4 >= 31) {
                ap5Var = new cp5(tp5Var);
            } else if (i4 >= 30) {
                ap5Var = new bp5(tp5Var);
            } else {
                ap5Var = i4 >= 29 ? new ap5(tp5Var) : new zo5(tp5Var);
            }
            ap5Var.j(nd2.r(iY, iN2, iR, iG));
            tp5VarY = ap5Var.y();
        } else {
            tp5VarY = tp5Var;
        }
        WeakHashMap weakHashMap = xk5.g;
        WindowInsets windowInsetsX = tp5VarY.x();
        if (windowInsetsX == null) {
            return tp5VarY;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsX);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsX) ? tp5.l(view, windowInsetsOnApplyWindowInsets) : tp5VarY;
    }

    public String toString() {
        switch (this.j) {
            case 26:
                return "NavControllerViewModel(provider=" + ((zl5) this.t) + ")";
            default:
                return super.toString();
        }
    }

    public void v(String str) {
        yl5 yl5Var = (yl5) ((o05) ((zl5) this.t).r).getValue();
        xl5 xl5Var = (xl5) yl5Var.y.l(str);
        if (xl5Var == null) {
            return;
        }
        xl5Var.r = true;
        xl5 xl5Var2 = (xl5) yl5Var.y.q(str);
        if (xl5Var2 != null) {
            xl5Var2.y.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public void w(zv4 zv4Var) {
        Object value;
        zv4 zv4Var2;
        zv4Var.getClass();
        ew4 ew4Var = (ew4) this.t;
        do {
            value = ew4Var.getValue();
            zv4Var2 = (zv4) value;
            if (zv4Var2 instanceof b34 ? true : yf2.p(zv4Var2, dg5.y)) {
                zv4Var2 = zv4Var;
            } else if (zv4Var2 instanceof rz0) {
                if (zv4Var.g > zv4Var2.g) {
                    zv4Var2 = zv4Var;
                }
            } else if (!(zv4Var2 instanceof lo1)) {
                uo1.g();
                return;
            }
        } while (!ew4Var.t(value, zv4Var2));
    }

    public zv4 x() {
        return (zv4) ((ew4) this.t).getValue();
    }

    public void g(int i) {
    }

    public void y(int i) {
    }

    public void r(int i, float f) {
    }

    public /* synthetic */ q64(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public q64(Set set) {
        this.j = (byte) 0;
        this.t = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            p64 p64Var = (p64) it.next();
            HashMap map = (HashMap) this.t;
            p64Var.getClass();
            map.put(oy0.class, p64Var.g);
        }
    }

    public q64(xi0 xi0Var) {
        this.j = (byte) 12;
        gf2.g(xi0Var, "output");
        this.t = xi0Var;
        xi0Var.g = this;
    }

    public q64(Context context) {
        this.j = (byte) 3;
        this.t = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029 A[PHI: r10
  0x0029: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public q64(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.j = (byte) 6;
        int i2 = 1;
        int length = fArr.length - 1;
        rq[][] rqVarArr = new rq[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            rq[] rqVarArr2 = new rq[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                rqVarArr2[i11] = new rq(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            rqVarArr[i5] = rqVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.t = rqVarArr;
    }

    public /* synthetic */ q64(byte b, boolean z) {
        this.j = b;
    }

    public q64(EditText editText) {
        this.j = (byte) 18;
        this.t = new ji(editText, (byte) 6);
    }

    public q64(nz0 nz0Var, lz0 lz0Var) {
        this.j = (byte) 14;
        this.t = nz0Var;
    }
}
