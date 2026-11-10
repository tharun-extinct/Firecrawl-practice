package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl0 extends xl0 implements wl5, a52, id4, vj3, gf3, f5 {
    public final o05 A;
    public final o05 B;
    public final wl0 b;
    public final o05 c;
    public boolean d;
    public final o05 e;
    public final CopyOnWriteArrayList f;
    public final CopyOnWriteArrayList h;
    public final AtomicInteger i;
    public boolean k;
    public final ji m;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public vl5 q;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList u;
    public final ul0 w;
    public final CopyOnWriteArrayList z;
    public final eu0 t = new eu0();
    public final ro a = new ro(new ml0(this, (byte) 1));

    public yl0() {
        final byte b = 1;
        final byte b2 = 0;
        ji jiVar = new ji(new hd4(this, new gd4(this, b2)));
        this.m = jiVar;
        this.w = new ul0(this);
        this.c = new o05(new my1(this) { // from class: pl0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                yl0 yl0Var = this.t;
                switch (b3) {
                    case 0:
                        return new ly1(yl0Var.w, new qd((Object) yl0Var, (byte) 11));
                    case 1:
                        ca1 ca1Var = new ca1();
                        yl0Var.g().a(ca1Var);
                        return ca1Var;
                    case 2:
                        return new kd4(yl0Var.getApplication(), yl0Var, yl0Var.getIntent() != null ? yl0Var.getIntent().getExtras() : null);
                    default:
                        byte b4 = 0;
                        tj3 tj3Var = new tj3(new ml0(yl0Var, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (yf2.p(Looper.myLooper(), Looper.getMainLooper())) {
                                yl0Var.j.g(new ol0(tj3Var, yl0Var, b4));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new nl0(yl0Var, tj3Var, (byte) 0));
                            }
                        }
                        return tj3Var;
                }
            }
        });
        this.i = new AtomicInteger();
        this.b = new wl0(this);
        this.s = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.e = new o05(new my1(this) { // from class: pl0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b;
                yl0 yl0Var = this.t;
                switch (b3) {
                    case 0:
                        return new ly1(yl0Var.w, new qd((Object) yl0Var, (byte) 11));
                    case 1:
                        ca1 ca1Var = new ca1();
                        yl0Var.g().a(ca1Var);
                        return ca1Var;
                    case 2:
                        return new kd4(yl0Var.getApplication(), yl0Var, yl0Var.getIntent() != null ? yl0Var.getIntent().getExtras() : null);
                    default:
                        byte b4 = 0;
                        tj3 tj3Var = new tj3(new ml0(yl0Var, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (yf2.p(Looper.myLooper(), Looper.getMainLooper())) {
                                yl0Var.j.g(new ol0(tj3Var, yl0Var, b4));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new nl0(yl0Var, tj3Var, (byte) 0));
                            }
                        }
                        return tj3Var;
                }
            }
        });
        ju2 ju2Var = this.j;
        if (ju2Var == null) {
            l0.z("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        ju2Var.g(new du2(this) { // from class: ql0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.du2
            public final void b(gu2 gu2Var, vt2 vt2Var) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b2;
                yl0 yl0Var = this.t;
                switch (b3) {
                    case 0:
                        if (vt2Var == vt2.ON_STOP && (window = yl0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (vt2Var == vt2.ON_DESTROY) {
                            yl0Var.t.y = null;
                            if (!yl0Var.isChangingConfigurations()) {
                                yl0Var.t().g();
                            }
                            ul0 ul0Var = yl0Var.w;
                            yl0 yl0Var2 = ul0Var.m;
                            yl0Var2.getWindow().getDecorView().removeCallbacks(ul0Var);
                            yl0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ul0Var);
                        }
                        break;
                }
            }
        });
        this.j.g(new du2(this) { // from class: ql0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.du2
            public final void b(gu2 gu2Var, vt2 vt2Var) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b;
                yl0 yl0Var = this.t;
                switch (b3) {
                    case 0:
                        if (vt2Var == vt2.ON_STOP && (window = yl0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (vt2Var == vt2.ON_DESTROY) {
                            yl0Var.t.y = null;
                            if (!yl0Var.isChangingConfigurations()) {
                                yl0Var.t().g();
                            }
                            ul0 ul0Var = yl0Var.w;
                            yl0 yl0Var2 = ul0Var.m;
                            yl0Var2.getWindow().getDecorView().removeCallbacks(ul0Var);
                            yl0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ul0Var);
                        }
                        break;
                }
            }
        });
        this.j.g(new j44(this, b));
        jiVar.P();
        k33.G(this);
        ((ji) jiVar.a).T("android:support:activity-result", new rl0(this, b2));
        m(new sl0(this, b2));
        final byte b3 = 2;
        this.A = new o05(new my1(this) { // from class: pl0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b4 = b3;
                yl0 yl0Var = this.t;
                switch (b4) {
                    case 0:
                        return new ly1(yl0Var.w, new qd((Object) yl0Var, (byte) 11));
                    case 1:
                        ca1 ca1Var = new ca1();
                        yl0Var.g().a(ca1Var);
                        return ca1Var;
                    case 2:
                        return new kd4(yl0Var.getApplication(), yl0Var, yl0Var.getIntent() != null ? yl0Var.getIntent().getExtras() : null);
                    default:
                        byte b5 = 0;
                        tj3 tj3Var = new tj3(new ml0(yl0Var, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (yf2.p(Looper.myLooper(), Looper.getMainLooper())) {
                                yl0Var.j.g(new ol0(tj3Var, yl0Var, b5));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new nl0(yl0Var, tj3Var, (byte) 0));
                            }
                        }
                        return tj3Var;
                }
            }
        });
        final byte b4 = 3;
        this.B = new o05(new my1(this) { // from class: pl0
            public final /* synthetic */ yl0 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b5 = b4;
                yl0 yl0Var = this.t;
                switch (b5) {
                    case 0:
                        return new ly1(yl0Var.w, new qd((Object) yl0Var, (byte) 11));
                    case 1:
                        ca1 ca1Var = new ca1();
                        yl0Var.g().a(ca1Var);
                        return ca1Var;
                    case 2:
                        return new kd4(yl0Var.getApplication(), yl0Var, yl0Var.getIntent() != null ? yl0Var.getIntent().getExtras() : null);
                    default:
                        byte b6 = 0;
                        tj3 tj3Var = new tj3(new ml0(yl0Var, (byte) 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (yf2.p(Looper.myLooper(), Looper.getMainLooper())) {
                                yl0Var.j.g(new ol0(tj3Var, yl0Var, b6));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new nl0(yl0Var, tj3Var, (byte) 0));
                            }
                        }
                        return tj3Var;
                }
            }
        });
    }

    public static final void w(yl0 yl0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!yf2.p(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!yf2.p(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.gu2
    public final ju2 a() {
        return this.j;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.w.g(decorView);
        super.addContentView(view, layoutParams);
    }

    public final b5 c(s4 s4Var, pw5 pw5Var) {
        wl0 wl0Var = this.b;
        wl0Var.getClass();
        return wl0Var.r("activity_rq#" + this.i.getAndIncrement(), this, pw5Var, s4Var);
    }

    @Override // defpackage.gf3
    public final kb5 g() {
        return y().y().r;
    }

    @Override // defpackage.f5
    public final wl0 j() {
        return this.b;
    }

    @Override // defpackage.a52
    public final ea3 l() {
        ea3 ea3Var = new ea3(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = ea3Var.g;
        if (application != null) {
            linkedHashMap.put(sl5.n, getApplication());
        }
        linkedHashMap.put(k33.A, this);
        linkedHashMap.put(k33.B, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(k33.C, extras);
        }
        return ea3Var;
    }

    public final void m(yj3 yj3Var) {
        eu0 eu0Var = this.t;
        eu0Var.getClass();
        yl0 yl0Var = eu0Var.y;
        if (yl0Var != null) {
            yj3Var.g(yl0Var);
        }
        eu0Var.g.add(yj3Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.b.g(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((ca1) this.e.getValue()).g();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.xl0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.m.Q(bundle);
        eu0 eu0Var = this.t;
        eu0Var.y = this;
        Iterator it = eu0Var.g.iterator();
        while (it.hasNext()) {
            ((yj3) it.next()).g(this);
        }
        super.onCreate(bundle);
        int i = c74.t;
        a74.y(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.a.m).iterator();
        while (it.hasNext()) {
            ((dx1) it.next()).g.q(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.a.m).iterator();
            while (it.hasNext()) {
                if (((dx1) it.next()).g.s()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.k = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.k = false;
            Iterator it = this.z.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((et0) it.next()).accept(new p93(z, configuration));
            }
        } catch (Throwable th) {
            this.k = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.u.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.a.m).iterator();
        while (it.hasNext()) {
            ((dx1) it.next()).g.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.d = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.d = false;
            Iterator it = this.h.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((et0) it.next()).accept(new qs3(z, configuration));
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        bi6 bi6VarR = vc6.r(pictureInPictureUiState);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(bi6VarR);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.a.m).iterator();
        while (it.hasNext()) {
            ((dx1) it.next()).g.h();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.b.g(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        tl0 tl0Var;
        vl5 vl5Var = this.q;
        if (vl5Var == null && (tl0Var = (tl0) getLastNonConfigurationInstance()) != null) {
            vl5Var = tl0Var.g;
        }
        if (vl5Var == null) {
            return null;
        }
        tl0 tl0Var2 = new tl0();
        tl0Var2.g = vl5Var;
        return tl0Var2;
    }

    @Override // defpackage.xl0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        ju2 ju2Var = this.j;
        if (ju2Var != null) {
            ju2Var.l(wt2.a);
        }
        super.onSaveInstanceState(bundle);
        this.m.R(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void q() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.id4
    public final ji r() {
        return (ji) this.m.a;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (lr2.f()) {
                lr2.w("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((ly1) this.c.getValue()).g();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        q();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.w.g(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.wl5
    public final vl5 t() {
        if (getApplication() == null) {
            l0.z("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        vl5 vl5Var = this.q;
        if (vl5Var == null) {
            tl0 tl0Var = (tl0) getLastNonConfigurationInstance();
            if (tl0Var != null) {
                this.q = tl0Var.g;
            }
            vl5Var = this.q;
            if (vl5Var == null) {
                vl5Var = new vl5();
                this.q = vl5Var;
            }
        }
        vl5Var.getClass();
        return vl5Var;
    }

    public tl5 x() {
        return (tl5) this.A.getValue();
    }

    @Override // defpackage.vj3
    public final tj3 y() {
        return (tj3) this.B.getValue();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        q();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.w.g(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.w.g(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.k) {
            return;
        }
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(new p93(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.d) {
            return;
        }
        Iterator it = this.h.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((et0) it.next()).accept(new qs3(z));
        }
    }
}
