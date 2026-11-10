package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends kl implements g43, LayoutInflater.Factory2 {
    public static final sp4 m0 = new sp4(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public d4 A;
    public ActionBarContextView B;
    public PopupWindow C;
    public ml D;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public sl[] Q;
    public sl R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public pl b0;
    public pl c0;
    public fa4 d;
    public boolean d0;
    public v92 e;
    public int e0;
    public CharSequence f;
    public boolean g0;
    public no5 h;
    public Rect h0;
    public Rect i0;
    public kn j0;
    public ActionBarOverlayLayout k;
    public OnBackInvokedDispatcher k0;
    public wj l0;
    public dz4 o;
    public final Context p;
    public final Object s;
    public Window u;
    public ol z;
    public bm5 E = null;
    public final y9 f0 = new y9(this, 1);

    public tl(Context context, Window window, dl dlVar, Object obj) {
        yk ykVar = null;
        this.X = -100;
        this.p = context;
        this.s = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof yk)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    ykVar = (yk) context;
                    break;
                }
            }
            if (ykVar != null) {
                this.X = ((tl) ykVar.i()).X;
            }
        }
        if (this.X == -100) {
            String name = this.s.getClass().getName();
            sp4 sp4Var = m0;
            Integer num = (Integer) sp4Var.get(name);
            if (num != null) {
                this.X = num.intValue();
                sp4Var.remove(this.s.getClass().getName());
            }
        }
        if (window != null) {
            w(window);
        }
        wl.n();
    }

    public static ux2 c(Context context) {
        ux2 ux2Var;
        if (Build.VERSION.SDK_INT >= 33 || (ux2Var = kl.a) == null) {
            return null;
        }
        ux2 ux2VarG = ux2.g(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        ux2 ux2VarY = lz5.y(ux2Var, ux2VarG);
        return ux2VarY.g.g.isEmpty() ? ux2VarG : ux2VarY;
    }

    public static Configuration p(Context context, int i, ux2 ux2Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ux2Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(ux2Var.g.g.toLanguageTags()));
        }
        return configuration2;
    }

    public final int A(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            l0.z("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        pl plVar = this.c0;
                        if (plVar == null) {
                            plVar = new pl(this, context);
                            this.c0 = plVar;
                        }
                        return plVar.w();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    pl plVar2 = this.b0;
                    if (plVar2 == null) {
                        plVar2 = new pl(this, q70.o(context));
                        this.b0 = plVar2;
                    }
                    return plVar2.w();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean B() {
        boolean z = this.S;
        this.S = false;
        sl slVarK = k(0);
        if (!slVarK.w) {
            d4 d4Var = this.A;
            if (d4Var != null) {
                d4Var.g();
                return true;
            }
            d();
            no5 no5Var = this.h;
            if (no5Var == null || !no5Var.y()) {
                return false;
            }
        } else if (!z) {
            s(slVarK, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x019e  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final void C(sl slVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = slVar.w;
        int i2 = slVar.g;
        if (z || this.V) {
            return;
        }
        byte b = 4;
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.u.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, slVar.j)) {
            s(slVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && E(slVar, keyEvent)) {
            rl rlVar = slVar.v;
            if (rlVar != null && !slVar.c) {
                View view = slVar.l;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                slVar.q = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = slVar.r;
                layoutParams2.windowAnimations = slVar.n;
                windowManager.addView(slVar.v, layoutParams2);
                slVar.w = true;
                if (i2 == 0) {
                    G();
                }
            }
            if (rlVar == null) {
                d();
                no5 no5Var = this.h;
                Context contextV = no5Var != null ? no5Var.v() : null;
                if (contextV != null) {
                    context = contextV;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(io.appground.blek.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(io.appground.blek.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(io.appground.blek.R.style.Theme_AppCompat_CompactMenu, true);
                }
                lu0 lu0Var = new lu0(context, 0);
                lu0Var.getTheme().setTo(themeNewTheme);
                slVar.a = lu0Var;
                TypedArray typedArrayObtainStyledAttributes = lu0Var.obtainStyledAttributes(r24.a);
                slVar.y = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                slVar.n = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                slVar.v = new rl(this, slVar.a);
                slVar.r = (byte) 81;
            } else if (slVar.c && rlVar.getChildCount() > 0) {
                slVar.v.removeAllViews();
            }
            View view2 = slVar.l;
            if (view2 == null) {
                if (slVar.j != null) {
                    v92 v92Var = this.e;
                    if (v92Var == null) {
                        v92Var = new v92(this, b);
                        this.e = v92Var;
                    }
                    if (slVar.t == null) {
                        mw2 mw2Var = new mw2(slVar.a);
                        slVar.t = mw2Var;
                        mw2Var.v(v92Var);
                        slVar.j.y(slVar.t);
                    }
                    View view3 = (View) slVar.t.r(slVar.v);
                    slVar.x = view3;
                    if (view3 != null) {
                    }
                }
                slVar.c = true;
                return;
            }
            slVar.x = view2;
            if (slVar.l != null || slVar.t.g().getCount() > 0) {
                ViewGroup.LayoutParams layoutParams3 = slVar.x.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                slVar.v.setBackgroundResource(slVar.y);
                ViewParent parent = slVar.x.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(slVar.x);
                }
                slVar.v.addView(slVar.x, layoutParams3);
                if (!slVar.x.hasFocus()) {
                    slVar.x.requestFocus();
                }
            }
            slVar.c = true;
            return;
            i = -2;
            slVar.q = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = slVar.r;
            layoutParams4.windowAnimations = slVar.n;
            windowManager.addView(slVar.v, layoutParams4);
            slVar.w = true;
            if (i2 == 0) {
                G();
            }
        }
    }

    public final boolean D(sl slVar, int i, KeyEvent keyEvent) {
        i43 i43Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((slVar.m || E(slVar, keyEvent)) && (i43Var = slVar.j) != null) {
            return i43Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[PHI: r6
  0x00c7: PHI (r6v2 i43) = (r6v1 i43), (r6v8 i43) binds: [B:31:0x0046, B:57:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0103  */
    public final boolean E(sl slVar, KeyEvent keyEvent) {
        i43 i43Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        fa4 fa4Var;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.V) {
            boolean z = slVar.m;
            int i = slVar.g;
            if (z) {
                return true;
            }
            sl slVar2 = this.R;
            if (slVar2 != null && slVar2 != slVar) {
                s(slVar2, false);
            }
            Window.Callback callback = this.u.getCallback();
            if (callback != null) {
                slVar.l = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.k) != null) {
                actionBarOverlayLayout4.p();
            }
            if (slVar.l == null) {
                i43 i43Var2 = slVar.j;
                if (i43Var2 == null || slVar.i) {
                    if (i43Var2 == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.k != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(io.appground.blek.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(io.appground.blek.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(io.appground.blek.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                lu0 lu0Var = new lu0(context, 0);
                                lu0Var.getTheme().setTo(themeNewTheme);
                                context = lu0Var;
                            }
                        }
                        i43 i43Var3 = new i43(context);
                        i43Var3.o(this);
                        i43 i43Var4 = slVar.j;
                        if (i43Var3 != i43Var4) {
                            if (i43Var4 != null) {
                                i43Var4.u(slVar.t);
                            }
                            slVar.j = i43Var3;
                            mw2 mw2Var = slVar.t;
                            if (mw2Var != null) {
                                i43Var3.y(mw2Var);
                            }
                        }
                        i43Var2 = slVar.j;
                        if (i43Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.k) != null) {
                                fa4Var = this.d;
                                if (fa4Var == null) {
                                    fa4Var = new fa4((Object) this, (byte) 3);
                                    this.d = fa4Var;
                                }
                                actionBarOverlayLayout2.s(i43Var2, fa4Var);
                            }
                            slVar.j.e();
                            if (callback.onCreatePanelMenu(i, slVar.j)) {
                                slVar.i = false;
                            } else {
                                i43Var = slVar.j;
                                if (i43Var != null) {
                                    if (i43Var != null) {
                                        i43Var.u(slVar.t);
                                    }
                                    slVar.j = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.k) != null) {
                                    actionBarOverlayLayout.s(null, this.d);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            fa4Var = this.d;
                            if (fa4Var == null) {
                                fa4Var = new fa4((Object) this, (byte) 3);
                                this.d = fa4Var;
                            }
                            actionBarOverlayLayout2.s(i43Var2, fa4Var);
                        }
                        slVar.j.e();
                        if (callback.onCreatePanelMenu(i, slVar.j)) {
                            i43Var = slVar.j;
                            if (i43Var != null) {
                                if (i43Var != null) {
                                    i43Var.u(slVar.t);
                                }
                                slVar.j = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.s(null, this.d);
                            }
                        } else {
                            slVar.i = false;
                        }
                    }
                }
                slVar.j.e();
                Bundle bundle = slVar.b;
                if (bundle != null) {
                    slVar.j.z(bundle);
                    slVar.b = null;
                }
                if (!callback.onPreparePanel(0, slVar.l, slVar.j)) {
                    if (z2 && (actionBarOverlayLayout3 = this.k) != null) {
                        actionBarOverlayLayout3.s(null, this.d);
                    }
                    slVar.j.d();
                    return false;
                }
                slVar.j.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                slVar.j.d();
            }
            slVar.m = true;
            slVar.q = false;
            this.R = slVar;
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        wj wjVar;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.k0 != null && (k(0).w || this.A != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.k0;
                wj wjVar2 = new wj(this, (byte) 1);
                e2.t(onBackInvokedDispatcher).registerOnBackInvokedCallback(1000000, wjVar2);
                this.l0 = wjVar2;
                return;
            }
            if (z || (wjVar = this.l0) == null) {
                return;
            }
            e2.t(this.k0).unregisterOnBackInvokedCallback(e2.l(wjVar));
            this.l0 = null;
        }
    }

    @Override // defpackage.kl
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.z.g(this.u.getCallback());
    }

    public final void b(i43 i43Var) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.k.v();
        Window.Callback callback = this.u.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, i43Var);
        }
        this.P = false;
    }

    public final void d() {
        no5 no5Var;
        o();
        if (this.K && (no5Var = this.h) == null) {
            Object obj = this.s;
            if (obj instanceof Activity) {
                no5Var = new no5((Activity) obj, this.L);
                this.h = no5Var;
            } else if (obj instanceof Dialog) {
                no5Var = new no5((Dialog) obj);
                this.h = no5Var;
            }
            if (no5Var != null) {
                no5Var.t(this.g0);
            }
        }
    }

    public final void e(int i) {
        this.e0 = (1 << i) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.u.getDecorView();
        WeakHashMap weakHashMap = xk5.g;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final void f() {
        if (this.u == null) {
            Object obj = this.s;
            if (obj instanceof Activity) {
                w(((Activity) obj).getWindow());
            }
        }
        if (this.u != null) {
            return;
        }
        l0.z("We have not been given a Window");
    }

    @Override // defpackage.kl
    public final void g() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof tl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void h(int i) {
        sl slVarK = k(i);
        if (slVarK.j != null) {
            Bundle bundle = new Bundle();
            slVarK.j.h(bundle);
            if (bundle.size() > 0) {
                slVarK.b = bundle;
            }
            slVarK.j.e();
            slVarK.j.clear();
        }
        slVarK.i = true;
        slVarK.c = true;
        if ((i == 108 || i == 0) && this.k != null) {
            sl slVarK2 = k(0);
            slVarK2.m = false;
            E(slVarK2, null);
        }
    }

    public final void i(int i, sl slVar, i43 i43Var) {
        if (i43Var == null) {
            if (slVar == null && i >= 0) {
                sl[] slVarArr = this.Q;
                if (i < slVarArr.length) {
                    slVar = slVarArr[i];
                }
            }
            if (slVar != null) {
                i43Var = slVar.j;
            }
        }
        if ((slVar == null || slVar.w) && !this.V) {
            ol olVar = this.z;
            Window.Callback callback = this.u.getCallback();
            olVar.getClass();
            try {
                olVar.m = true;
                callback.onPanelClosed(i, i43Var);
            } finally {
                olVar.m = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.g43
    public final boolean j(i43 i43Var, MenuItem menuItem) {
        sl slVar;
        Window.Callback callback = this.u.getCallback();
        if (callback != null && !this.V) {
            i43 i43VarQ = i43Var.q();
            sl[] slVarArr = this.Q;
            int length = slVarArr != null ? slVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                slVar = slVarArr[i];
                if (slVar != null && slVar.j == i43VarQ) {
                    if (slVar != null) {
                        return callback.onMenuItemSelected(slVar.g, menuItem);
                    }
                }
            }
            slVar = null;
            if (slVar != null) {
                return callback.onMenuItemSelected(slVar.g, menuItem);
            }
        }
        return false;
    }

    public final sl k(int i) {
        sl[] slVarArr = this.Q;
        if (slVarArr == null || slVarArr.length <= i) {
            sl[] slVarArr2 = new sl[i + 1];
            if (slVarArr != null) {
                System.arraycopy(slVarArr, 0, slVarArr2, 0, slVarArr.length);
            }
            this.Q = slVarArr2;
            slVarArr = slVarArr2;
        }
        sl slVar = slVarArr[i];
        if (slVar != null) {
            return slVar;
        }
        sl slVar2 = new sl();
        slVar2.g = i;
        slVar2.c = false;
        slVarArr[i] = slVar2;
        return slVar2;
    }

    @Override // defpackage.kl
    public final void l(int i) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.z.g(this.u.getCallback());
    }

    @Override // defpackage.kl
    public final void m(CharSequence charSequence) {
        this.f = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.k;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        no5 no5Var = this.h;
        if (no5Var != null) {
            no5Var.q(charSequence);
            return;
        }
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.kl
    public final void n() {
        if (this.s instanceof Activity) {
            synchronized (kl.i) {
                kl.v(this);
            }
        }
        if (this.d0) {
            this.u.getDecorView().removeCallbacks(this.f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.s;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                m0.put(this.s.getClass().getName(), Integer.valueOf(this.X));
            } else {
                m0.remove(this.s.getClass().getName());
            }
        } else {
            m0.remove(this.s.getClass().getName());
        }
        pl plVar = this.b0;
        if (plVar != null) {
            plVar.r();
        }
        pl plVar2 = this.c0;
        if (plVar2 != null) {
            plVar2.r();
        }
    }

    public final void o() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.p;
        int[] iArr = r24.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            l0.z("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            x(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            x(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            x(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            x(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        f();
        this.u.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        byte b = 5;
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(io.appground.blek.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(io.appground.blek.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(io.appground.blek.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(io.appground.blek.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new lu0(context, typedValue.resourceId) : context).inflate(io.appground.blek.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(io.appground.blek.R.id.decor_content_parent);
            this.k = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.u.getCallback());
            if (this.L) {
                this.k.q(109);
            }
            if (this.I) {
                this.k.q(2);
            }
            if (this.J) {
                this.k.q(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        q64 q64Var = new q64((Object) this, (byte) 4);
        WeakHashMap weakHashMap = xk5.g;
        pk5.r(viewGroup, q64Var);
        if (this.k == null) {
            this.H = (TextView) viewGroup.findViewById(io.appground.blek.R.id.title);
        }
        boolean z = km5.g;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(io.appground.blek.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.u.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.u.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new y22(this, b));
        this.G = viewGroup;
        Object obj = this.s;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.k;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                no5 no5Var = this.h;
                if (no5Var != null) {
                    no5Var.q(title);
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.u.getDecorView();
        contentFrameLayout2.c.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.F = true;
        sl slVarK = k(0);
        if (this.V || slVarK.j != null) {
            return;
        }
        e(108);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View gmVar;
        kn knVar = this.j0;
        View view2 = null;
        if (knVar == null) {
            int[] iArr = r24.a;
            Context context2 = this.p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                knVar = new kn();
                this.j0 = knVar;
            } else {
                try {
                    knVar = (kn) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.j0 = knVar;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    knVar = new kn();
                    this.j0 = knVar;
                }
            }
        }
        knVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r24.k, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context lu0Var = (resourceId == 0 || ((context instanceof lu0) && ((lu0) context).g == resourceId)) ? context : new lu0(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                gmVar = new gm(lu0Var, attributeSet);
                break;
            case 1:
                gmVar = new fl(lu0Var, attributeSet);
                break;
            case 2:
                gmVar = new dm(lu0Var, attributeSet);
                break;
            case 3:
                gmVar = knVar.v(lu0Var, attributeSet);
                break;
            case 4:
                gmVar = new am(lu0Var, attributeSet, io.appground.blek.R.attr.imageButtonStyle);
                break;
            case 5:
                gmVar = new hm(lu0Var, attributeSet);
                break;
            case 6:
                gmVar = new sm(lu0Var, attributeSet);
                break;
            case 7:
                gmVar = knVar.n(lu0Var, attributeSet);
                break;
            case 8:
                gmVar = new in(lu0Var, attributeSet);
                break;
            case 9:
                gmVar = new cm(lu0Var, attributeSet, 0);
                break;
            case 10:
                gmVar = knVar.g(lu0Var, attributeSet);
                break;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                gmVar = knVar.r(lu0Var, attributeSet);
                break;
            case 12:
                gmVar = new yl(lu0Var, attributeSet);
                break;
            case 13:
                gmVar = knVar.y(lu0Var, attributeSet);
                break;
            default:
                gmVar = null;
                break;
        }
        if (gmVar == null && context != lu0Var) {
            Object[] objArr = knVar.g;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = lu0Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = kn.l;
                        if (i < 3) {
                            View viewX = knVar.x(lu0Var, str, strArr[i]);
                            if (viewX != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewX;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewX2 = knVar.x(lu0Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewX2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            gmVar = view2;
        }
        if (gmVar != null) {
            Context context3 = gmVar.getContext();
            if ((context3 instanceof ContextWrapper) && gmVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, kn.r);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    gmVar.setOnClickListener(new jn(gmVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = lu0Var.obtainStyledAttributes(attributeSet, kn.n);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = xk5.g;
                    new lk5((byte) 3).y(gmVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = lu0Var.obtainStyledAttributes(attributeSet, kn.v);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    xk5.w(gmVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = lu0Var.obtainStyledAttributes(attributeSet, kn.x);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = xk5.g;
                    new lk5((byte) 0).y(gmVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return gmVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(boolean z, boolean z2) {
        int i;
        boolean z3;
        byte b = 0;
        if (this.V) {
            return false;
        }
        int i2 = this.X;
        if (i2 == -100) {
            i2 = kl.t;
        }
        Context context = this.p;
        int iA = A(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        ux2 ux2VarC = i3 < 33 ? c(context) : null;
        if (!z2 && ux2VarC != null) {
            ux2VarC = ux2.g(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationP = p(context, iA, ux2VarC, null, false);
        boolean z4 = this.a0;
        boolean z5 = true;
        Object obj = this.s;
        if (z4 || !(obj instanceof Activity)) {
            this.a0 = true;
            i = this.Z;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.Z = 0;
                }
                this.a0 = true;
                i = this.Z;
            }
        }
        Configuration configuration = this.W;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationP.uiMode & 48;
        ux2 ux2VarG = ux2.g(configuration.getLocales().toLanguageTags());
        ux2 ux2VarG2 = ux2VarC == null ? null : ux2.g(configurationP.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? 512 : 0;
        if (ux2VarG2 != null && !ux2VarG.equals(ux2VarG2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.T && ((o0 || this.U) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationP.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new j4(activity, b));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            b = (i6 & i) == i6 ? (byte) 1 : (byte) 0;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (ux2VarG2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(ux2VarG2.g.g.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            if (Build.VERSION.SDK_INT < 26) {
                se6.g(resources);
            }
            int i8 = this.Y;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.Y, true);
            }
            if (b != 0 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof gu2) {
                    if (((gu2) activity2).a().t.compareTo(wt2.a) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.u.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.U && !this.V) {
                    activity2.onConfigurationChanged(configuration2);
                    this.u.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (ux2VarG2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(ux2.g(context.getResources().getConfiguration().getLocales().toLanguageTags()).g.g.toLanguageTags()));
        }
        pl plVar = this.b0;
        if (i2 == 0) {
            if (plVar == null) {
                plVar = new pl(this, q70.o(context));
                this.b0 = plVar;
            }
            plVar.q();
        } else if (plVar != null) {
            plVar.r();
        }
        pl plVar2 = this.c0;
        if (i2 == 3) {
            if (plVar2 == null) {
                plVar2 = new pl(this, context);
                this.c0 = plVar2;
            }
            plVar2.q();
        } else if (plVar2 != null) {
            plVar2.r();
        }
        return z5;
    }

    @Override // defpackage.kl
    public final void r() {
        String strD;
        this.T = true;
        q(false, true);
        f();
        Object obj = this.s;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = jr2.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                no5 no5Var = this.h;
                if (no5Var == null) {
                    this.g0 = true;
                } else {
                    no5Var.t(true);
                }
            }
            synchronized (kl.i) {
                kl.v(this);
                kl.c.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.p.getResources().getConfiguration());
        this.U = true;
    }

    public final void s(sl slVar, boolean z) {
        rl rlVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && slVar.g == 0 && (actionBarOverlayLayout = this.k) != null && actionBarOverlayLayout.c()) {
            b(slVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && slVar.w && (rlVar = slVar.v) != null) {
            windowManager.removeView(rlVar);
            if (z) {
                i(slVar.g, slVar, null);
            }
        }
        slVar.m = false;
        slVar.q = false;
        slVar.w = false;
        slVar.x = null;
        slVar.c = true;
        if (this.R == slVar) {
            this.R = null;
        }
        if (slVar.g == 0) {
            G();
        }
    }

    @Override // defpackage.kl
    public final void t(View view) {
        o();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.z.g(this.u.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        sl slVarK;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zT;
        boolean zE;
        AudioManager audioManager;
        sl slVarK2;
        Object obj = this.s;
        if ((!(obj instanceof li2) && !(obj instanceof d6)) || (decorView = this.u.getDecorView()) == null || !ix5.g(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ol olVar = this.z;
                Window.Callback callback = this.u.getCallback();
                olVar.getClass();
                try {
                    olVar.a = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    olVar.a = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.S = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    slVarK2 = k(0);
                                    if (!slVarK2.w) {
                                        E(slVarK2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.A == null) {
                                    slVarK = k(0);
                                    actionBarOverlayLayout = this.k;
                                    context = this.p;
                                    if (actionBarOverlayLayout != null || !actionBarOverlayLayout.n() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = slVarK.w;
                                        if (!z || slVarK.q) {
                                            s(slVarK, true);
                                            zT = z;
                                        } else if (slVarK.m) {
                                            if (slVarK.i) {
                                                slVarK.m = false;
                                                zE = E(slVarK, keyEvent);
                                            } else {
                                                zE = true;
                                            }
                                            if (zE) {
                                                C(slVarK, keyEvent);
                                                zT = true;
                                            } else {
                                                zT = false;
                                            }
                                        } else {
                                            zT = false;
                                        }
                                    } else if (this.k.c()) {
                                        zT = this.k.t();
                                    } else if (this.V || !E(slVarK, keyEvent)) {
                                        zT = false;
                                    } else {
                                        zT = this.k.u();
                                    }
                                    if (zT) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (B()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    olVar.a = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.S = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            slVarK2 = k(0);
                            if (!slVarK2.w) {
                                E(slVarK2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.A == null) {
                            slVarK = k(0);
                            actionBarOverlayLayout = this.k;
                            context = this.p;
                            if (actionBarOverlayLayout != null) {
                                z = slVarK.w;
                                if (z) {
                                    s(slVarK, true);
                                    zT = z;
                                } else {
                                    s(slVarK, true);
                                    zT = z;
                                }
                            } else {
                                z = slVarK.w;
                                if (z) {
                                    s(slVarK, true);
                                    zT = z;
                                } else {
                                    s(slVarK, true);
                                    zT = z;
                                }
                            }
                            if (zT) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (B()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    public final void w(Window window) {
        Drawable drawableN;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        wj wjVar;
        int resourceId;
        if (this.u != null) {
            l0.z("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof ol) {
            l0.z("AppCompat has already installed itself into the Window");
            return;
        }
        ol olVar = new ol(this, callback);
        this.z = olVar;
        window.setCallback(olVar);
        Context context = this.p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableN = null;
        } else {
            wl wlVarG = wl.g();
            synchronized (wlVarG) {
                drawableN = wlVarG.g.n(context, resourceId, true);
            }
        }
        if (drawableN != null) {
            window.setBackgroundDrawable(drawableN);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.u = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.k0) != null) {
            return;
        }
        Object obj = this.s;
        if (onBackInvokedDispatcher != null && (wjVar = this.l0) != null) {
            e2.t(onBackInvokedDispatcher).unregisterOnBackInvokedCallback(e2.l(wjVar));
            this.l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.k0 = activity.getOnBackInvokedDispatcher();
            } else {
                this.k0 = null;
            }
        } else {
            this.k0 = null;
        }
        G();
    }

    @Override // defpackage.kl
    public final boolean x(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.O && i == 108) {
            return false;
        }
        if (this.K && i == 1) {
            this.K = false;
        }
        if (i == 1) {
            F();
            this.O = true;
            return true;
        }
        if (i == 2) {
            F();
            this.I = true;
            return true;
        }
        if (i == 5) {
            F();
            this.J = true;
            return true;
        }
        if (i == 10) {
            F();
            this.M = true;
            return true;
        }
        if (i == 108) {
            F();
            this.K = true;
            return true;
        }
        if (i != 109) {
            return this.u.requestFeature(i);
        }
        F();
        this.L = true;
        return true;
    }

    @Override // defpackage.g43
    public final void z(i43 i43Var) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.k;
        if (actionBarOverlayLayout == null || !actionBarOverlayLayout.n() || (ViewConfiguration.get(this.p).hasPermanentMenuKey() && !this.k.w())) {
            sl slVarK = k(0);
            slVarK.c = true;
            s(slVarK, false);
            C(slVarK, null);
            return;
        }
        Window.Callback callback = this.u.getCallback();
        if (this.k.c()) {
            this.k.t();
            if (this.V) {
                return;
            }
            callback.onPanelClosed(108, k(0).j);
            return;
        }
        if (callback == null || this.V) {
            return;
        }
        if (this.d0 && (1 & this.e0) != 0) {
            View decorView = this.u.getDecorView();
            y9 y9Var = this.f0;
            decorView.removeCallbacks(y9Var);
            y9Var.run();
        }
        sl slVarK2 = k(0);
        i43 i43Var2 = slVarK2.j;
        if (i43Var2 == null || slVarK2.i || !callback.onPreparePanel(0, slVarK2.l, i43Var2)) {
            return;
        }
        callback.onMenuOpened(108, slVarK2.j);
        this.k.u();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
