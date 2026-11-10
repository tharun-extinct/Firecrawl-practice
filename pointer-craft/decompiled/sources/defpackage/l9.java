package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l9 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ba t;

    public /* synthetic */ l9(ba baVar, byte b) {
        this.j = b;
        this.t = baVar;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        int i = 0;
        ba baVar = this.t;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT > 28 && baVar.isAttachedToWindow()) {
                    if (ba.T0 == null) {
                        r9 r9Var = new r9();
                        ba.T0 = r9Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (ba.P0 == null) {
                                ba.P0 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = ba.R0;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = ba.P0;
                                declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                ba.R0 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, r9Var);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    xa3 xa3Var = ba.S0;
                    synchronized (xa3Var) {
                        xa3Var.g(baVar);
                    }
                }
                return og5.g;
            case 1:
                Boolean bool = (Boolean) baVar.f.getValue();
                bool.getClass();
                return bool;
            case 2:
                ux2 ux2VarN = ux2.n(baVar.getConfiguration().getLocales());
                if (ux2VarN.g.g.isEmpty()) {
                    ux2VarN = ux2.n(LocaleList.getDefault());
                }
                int iR = ux2VarN.r();
                ArrayList arrayList = new ArrayList(iR);
                while (i < iR) {
                    Locale localeY = ux2VarN.y(i);
                    localeY.getClass();
                    arrayList.add(new sx2(localeY));
                    i++;
                }
                return new tx2(arrayList);
            case 3:
                MotionEvent motionEvent = baVar.u0;
                if (motionEvent != null) {
                    boolean zContains = pw5.d(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = baVar.u0;
                    boolean z = motionEvent2 != null && motionEvent2.getButtonState() == 0;
                    if (zContains && z) {
                        baVar.v0 = SystemClock.uptimeMillis();
                        baVar.post(baVar.C0);
                    }
                }
                baVar.I0.g();
                return og5.g;
            default:
                kg kgVar = baVar.U;
                if (kgVar != null) {
                    int childCount = kgVar.getChildCount();
                    while (i < childCount) {
                        View childAt = kgVar.getChildAt(i);
                        dg dgVar = childAt instanceof dg ? (dg) childAt : null;
                        if (dgVar != null && dgVar.isLayoutRequested()) {
                            dgVar.layout(dgVar.getLeft(), dgVar.getTop(), dgVar.getRight(), dgVar.getBottom());
                        }
                        i++;
                    }
                }
                return og5.g;
        }
    }
}
