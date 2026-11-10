package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class pw1 implements ComponentCallbacks, View.OnCreateContextMenuListener, gu2, wl5, a52, id4 {
    public static final Object i0 = new Object();
    public kx1 A;
    public rw1 B;
    public pw1 D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean M;
    public ViewGroup N;
    public View O;
    public boolean P;
    public mw1 R;
    public boolean S;
    public LayoutInflater T;
    public boolean U;
    public String V;
    public wt2 W;
    public ju2 X;
    public final eu0 Y;
    public xx1 Z;
    public SparseArray a;
    public final ka3 a0;
    public int b;
    public kd4 b0;
    public pw1 c;
    public ji c0;
    public boolean d;
    public final y22 d0;
    public int e;
    public final AtomicInteger e0;
    public boolean f;
    public final ArrayList f0;
    public final kw1 g0;
    public boolean h;
    public final kw1 h0;
    public boolean k;
    public Bundle m;
    public boolean o;
    public boolean p;
    public Bundle t;
    public boolean u;
    public Bundle w;
    public boolean z;
    public int j = -1;
    public String q = UUID.randomUUID().toString();
    public String i = null;
    public Boolean s = null;
    public kx1 C = new kx1();
    public final boolean L = true;
    public boolean Q = true;

    public pw1() {
        new y9(this, (byte) 2);
        this.W = wt2.q;
        this.Y = new eu0();
        this.a0 = new ka3();
        this.d0 = new y22((Object) this, (byte) 19);
        this.e0 = new AtomicInteger();
        this.f0 = new ArrayList();
        this.g0 = new kw1(this, (byte) 0);
        this.h0 = new kw1(this, (byte) 1);
        s();
    }

    public View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void C() {
        this.M = true;
    }

    public void D() {
        this.M = true;
    }

    public LayoutInflater E(Bundle bundle) {
        rw1 rw1Var = this.B;
        if (rw1Var == null) {
            l0.z("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        yk ykVar = rw1Var.A;
        LayoutInflater layoutInflaterCloneInContext = ykVar.getLayoutInflater().cloneInContext(ykVar);
        layoutInflaterCloneInContext.setFactory2(this.C.x);
        return layoutInflaterCloneInContext;
    }

    public void G() {
        this.M = true;
    }

    public void H() {
        this.M = true;
    }

    public void J(Bundle bundle) {
        this.M = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.U();
        this.d = true;
        this.Z = new xx1(this, t(), new fw1(this, (byte) 11));
        this.d0.C(new v21(this, layoutInflater, viewGroup, bundle), "Fragment#onCreateView");
        View view = this.O;
        xx1 xx1Var = this.Z;
        if (view == null) {
            if (xx1Var.q == null) {
                this.Z = null;
                return;
            } else {
                l0.z("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        xx1Var.n();
        if (kx1.N(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.O + " for Fragment " + this);
        }
        View view2 = this.O;
        xx1 xx1Var2 = this.Z;
        view2.getClass();
        view2.setTag(R.id.view_tree_lifecycle_owner, xx1Var2);
        View view3 = this.O;
        xx1 xx1Var3 = this.Z;
        view3.getClass();
        view3.setTag(R.id.view_tree_view_model_store_owner, xx1Var3);
        View view4 = this.O;
        xx1 xx1Var4 = this.Z;
        view4.getClass();
        view4.setTag(R.id.view_tree_saved_state_registry_owner, xx1Var4);
        this.a0.r(this.Z);
    }

    public final void L() {
        Bundle bundle = this.t;
        this.d0.C(new fw1(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, (byte) 15), "Fragment#onViewCreated");
        this.C.o(2);
    }

    public final yk M() {
        rw1 rw1Var = this.B;
        yk ykVar = rw1Var == null ? null : rw1Var.f;
        if (ykVar != null) {
            return ykVar;
        }
        l0.z(du4.c("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Context N() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        l0.z(du4.c("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View O() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        l0.z(du4.c("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void P(int i, int i2, int i3, int i4) {
        if (this.R == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        v().y = i;
        v().r = i2;
        v().n = i3;
        v().v = i4;
    }

    public final void Q(Bundle bundle) {
        kx1 kx1Var = this.A;
        if (kx1Var != null) {
            if (kx1Var == null ? false : kx1Var.S()) {
                l0.z("Fragment already added and state has been saved");
                return;
            }
        }
        this.w = bundle;
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        return this.X;
    }

    public final xx1 b() {
        xx1 xx1Var = this.Z;
        if (xx1Var != null) {
            return xx1Var;
        }
        l0.z(du4.c("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final Resources c() {
        return N().getResources();
    }

    public void d(Activity activity) {
        this.M = true;
    }

    public void e(Bundle bundle) {
        Bundle bundle2;
        this.M = true;
        Bundle bundle3 = this.t;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.C.b0(bundle2);
            kx1 kx1Var = this.C;
            kx1Var.H = false;
            kx1Var.I = false;
            kx1Var.O.l = false;
            kx1Var.o(1);
        }
        kx1 kx1Var2 = this.C;
        if (kx1Var2.o >= 1) {
            return;
        }
        kx1Var2.H = false;
        kx1Var2.I = false;
        kx1Var2.O.l = false;
        kx1Var2.o(1);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public void f(int i, int i2, Intent intent) {
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public ue5 g() {
        return new lw1(this);
    }

    public final boolean h() {
        return this.e > 0;
    }

    public final String i(int i) {
        return c().getString(i);
    }

    public final kx1 j() {
        if (this.B != null) {
            return this.C;
        }
        l0.z(du4.c("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public void k(yk ykVar) {
        this.M = true;
        rw1 rw1Var = this.B;
        yk ykVar2 = rw1Var == null ? null : rw1Var.f;
        if (ykVar2 != null) {
            this.M = false;
            d(ykVar2);
        }
    }

    @Override // defpackage.a52
    public final ea3 l() {
        Application application;
        Context applicationContext = N().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && kx1.N(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + N().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ea3 ea3Var = new ea3(0);
        LinkedHashMap linkedHashMap = ea3Var.g;
        if (application != null) {
            linkedHashMap.put(sl5.n, application);
        }
        linkedHashMap.put(k33.A, this);
        linkedHashMap.put(k33.B, this);
        Bundle bundle = this.w;
        if (bundle != null) {
            linkedHashMap.put(k33.C, bundle);
        }
        return ea3Var;
    }

    public Context m() {
        rw1 rw1Var = this.B;
        if (rw1Var == null) {
            return null;
        }
        return rw1Var.k;
    }

    public void o() {
        this.M = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        M().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    public final void p() {
        s();
        this.V = this.q;
        this.q = UUID.randomUUID().toString();
        this.p = false;
        this.u = false;
        this.h = false;
        this.o = false;
        this.k = false;
        this.e = 0;
        this.A = null;
        this.C = new kx1();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    public final int q() {
        wt2 wt2Var = this.W;
        return (wt2Var == wt2.t || this.D == null) ? wt2Var.ordinal() : Math.min(wt2Var.ordinal(), this.D.q());
    }

    @Override // defpackage.id4
    public final ji r() {
        return (ji) this.c0.a;
    }

    public final void s() {
        this.X = new ju2(this, true);
        this.c0 = new ji(new hd4(this, new gd4(this, (byte) 0)));
        this.b0 = null;
        ArrayList arrayList = this.f0;
        kw1 kw1Var = this.g0;
        if (!arrayList.contains(kw1Var)) {
            if (this.j >= 0) {
                kw1Var.g();
            } else {
                arrayList.add(kw1Var);
            }
        }
        kw1 kw1Var2 = this.h0;
        if (arrayList.contains(kw1Var2)) {
            return;
        }
        if (this.j >= 0) {
            kw1Var2.g();
        } else {
            arrayList.add(kw1Var2);
        }
    }

    @Override // defpackage.wl5
    public final vl5 t() {
        if (this.A == null) {
            l0.z("Can't access ViewModels from detached fragment");
            return null;
        }
        if (q() == 1) {
            l0.z("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.A.O.n;
        vl5 vl5Var = (vl5) map.get(this.q);
        if (vl5Var != null) {
            return vl5Var;
        }
        vl5 vl5Var2 = new vl5();
        map.put(this.q, vl5Var2);
        return vl5Var2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.q);
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" tag=");
            sb.append(this.G);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.B != null && this.p;
    }

    public final mw1 v() {
        mw1 mw1Var = this.R;
        if (mw1Var != null) {
            return mw1Var;
        }
        mw1 mw1Var2 = new mw1();
        Object obj = i0;
        mw1Var2.l = obj;
        mw1Var2.j = obj;
        mw1Var2.t = obj;
        mw1Var2.a = 1.0f;
        mw1Var2.m = null;
        this.R = mw1Var2;
        return mw1Var2;
    }

    public final kx1 w() {
        kx1 kx1Var = this.A;
        if (kx1Var != null) {
            return kx1Var;
        }
        l0.z(du4.c("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    @Override // defpackage.a52
    public tl5 x() {
        Application application = null;
        if (this.A == null) {
            l0.z("Can't access ViewModels from detached fragment");
            return null;
        }
        kd4 kd4Var = this.b0;
        if (kd4Var != null) {
            return kd4Var;
        }
        for (Context applicationContext = N().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && kx1.N(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + N().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        kd4 kd4Var2 = new kd4(application, this, this.w);
        this.b0 = kd4Var2;
        return kd4Var2;
    }

    public final boolean z() {
        if (this.H) {
            return true;
        }
        kx1 kx1Var = this.A;
        if (kx1Var != null) {
            pw1 pw1Var = this.D;
            kx1Var.getClass();
            if (pw1Var == null ? false : pw1Var.z()) {
                return true;
            }
        }
        return false;
    }

    public void F(Bundle bundle) {
    }

    public void I(View view) {
    }

    public void A(Menu menu, MenuInflater menuInflater) {
    }
}
