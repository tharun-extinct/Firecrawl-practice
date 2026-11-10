package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements zq, sb1, im0, gm0, cg1, st2 {
    public final /* synthetic */ byte j;

    public /* synthetic */ l0(byte b) {
        this.j = b;
    }

    public static /* synthetic */ void a(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void j(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void p(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void q(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void s(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void t(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void w(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void x() {
        throw new il0(false);
    }

    public static /* synthetic */ void z(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 20:
                Set setN = vlVar.n(e24.g(pu.class));
                y22 y22Var = y22.a;
                if (y22Var == null) {
                    synchronized (y22.class) {
                        try {
                            y22Var = y22.a;
                            if (y22Var == null) {
                                y22Var = new y22((byte) 0);
                                y22.a = y22Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new b41(setN, y22Var);
            case 21:
            case 22:
            case 23:
            default:
                xp2 xp2Var = ExecutorsRegistrar.g;
                return yf5.j;
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.g.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.r.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.y.get();
        }
    }

    @Override // defpackage.cg1
    public float g(float f) {
        return f;
    }

    @Override // defpackage.sb1
    public double n(double d) {
        switch (this.j) {
            case 12:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 13:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 14:
                float[] fArr = wj0.g;
                return wj0.y(wj0.r, d);
            case kq2.x /* 15 */:
                float[] fArr2 = wj0.g;
                return wj0.g(wj0.r, d);
            case 16:
                float[] fArr3 = wj0.g;
                return wj0.n(wj0.n, d);
            default:
                float[] fArr4 = wj0.g;
                return wj0.r(wj0.n, d);
        }
    }

    @Override // defpackage.im0
    public List r(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.zq
    public int v(int i, fl2 fl2Var) {
        return Math.round((1.0f + (fl2Var == fl2.j ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // defpackage.st2
    public String y(Context context) {
        switch (this.j) {
            case 28:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
        }
    }
}
