package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol0 implements du2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ ol0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        byte b = this.j;
        Object obj = this.a;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                tj3 tj3Var = (tj3) obj2;
                yl0 yl0Var = (yl0) obj;
                if (vt2Var == vt2.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = yl0Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    tj3Var.r(onBackInvokedDispatcher);
                }
                break;
            case 1:
                b30 b30Var = (b30) obj2;
                Context context = (Context) obj;
                if (vt2Var == vt2.ON_START) {
                    final yl0 yl0VarF = gp4.F(context);
                    b30Var.getClass();
                    v20 v20Var = b30Var.r;
                    v20Var.getClass();
                    w10 w10Var = v20Var.g;
                    w10Var.getClass();
                    HashSet hashSet = new HashSet();
                    hashSet.add(2);
                    ArrayList<Integer> arrayList = new ArrayList<>(Collections.unmodifiableList(new ArrayList(hashSet)));
                    final o00 o00Var = w10Var.a;
                    q00 q00Var = new q00(w10Var);
                    if (!o00Var.A()) {
                        i06.j("BillingClient", "Service disconnected.");
                        x20 x20Var = b36.g;
                    } else if (o00Var.s) {
                        View viewFindViewById = yl0VarF.findViewById(R.id.content);
                        IBinder windowToken = viewFindViewById.getWindowToken();
                        Rect rect = new Rect();
                        viewFindViewById.getGlobalVisibleRect(rect);
                        final Bundle bundle = new Bundle();
                        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
                        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
                        bundle.putInt("KEY_DIMEN_TOP", rect.top);
                        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
                        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
                        bundle.putString("playBillingLibraryVersion", o00Var.r);
                        String str = o00Var.n;
                        if (str != null) {
                            bundle.putString("playBillingLibraryWrapperVersion", str);
                        }
                        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", arrayList);
                        Handler handler = o00Var.v;
                        final nz5 nz5Var = new nz5(o00Var, handler, q00Var);
                        o00.l(new Callable() { // from class: ez5
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                kx5 kx5Var;
                                o00 o00Var2 = o00Var;
                                Bundle bundle2 = bundle;
                                yl0 yl0Var2 = yl0VarF;
                                nz5 nz5Var2 = nz5Var;
                                o00Var2.getClass();
                                try {
                                    synchronized (o00Var2.g) {
                                        kx5Var = o00Var2.t;
                                    }
                                    if (kx5Var == null) {
                                        o00Var2.z(-1, 107, null);
                                        return null;
                                    }
                                    ((gx5) kx5Var).c(o00Var2.l.getPackageName(), bundle2, new x06(new WeakReference(yl0Var2), nz5Var2));
                                    return null;
                                } catch (DeadObjectException e) {
                                    o00Var2.z(-1, 106, e);
                                    return null;
                                } catch (Exception e2) {
                                    o00Var2.z(6, 106, e2);
                                    return null;
                                }
                            }
                        }, 5000L, null, handler, o00Var.x());
                        x20 x20Var2 = b36.g;
                    } else {
                        i06.j("BillingClient", "Current client doesn't support showing in-app messages.");
                        x20 x20Var3 = b36.g;
                    }
                }
                break;
            default:
                List<cb3> list = (List) obj;
                if (vt2Var == ((vt2) obj2)) {
                    for (cb3 cb3Var : list) {
                        if (!yf2.p(cb3Var.g(), qr3.g)) {
                            cb3Var.n.setValue(cb3Var.r());
                        }
                    }
                }
                break;
        }
    }
}
