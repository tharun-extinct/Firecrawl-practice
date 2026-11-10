package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class cz4 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ dz4 E;
    public int a;
    public char b;
    public char c;
    public String d;
    public o43 e;
    public int f;
    public final Menu g;
    public boolean h;
    public int i;
    public boolean j;
    public String k;
    public CharSequence m;
    public int o;
    public int p;
    public CharSequence q;
    public int s;
    public int t;
    public boolean u;
    public int w;
    public boolean z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int y = 0;
    public int r = 0;
    public int n = 0;
    public int v = 0;
    public boolean x = true;
    public boolean l = true;

    public cz4(dz4 dz4Var, Menu menu) {
        this.E = dz4Var;
        this.g = menu;
    }

    public final Object g(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.r.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void y(MenuItem menuItem) {
        dz4 dz4Var = this.E;
        Context context = dz4Var.r;
        boolean z = false;
        menuItem.setChecked(this.u).setVisible(this.z).setEnabled(this.h).setCheckable(this.p >= 1).setTitleCondensed(this.q).setIcon(this.w);
        int i = this.o;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.d != null) {
            if (context.isRestricted()) {
                l0.z("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objG = dz4Var.n;
            if (objG == null) {
                objG = dz4.g(context);
                dz4Var.n = objG;
            }
            String str = this.d;
            bz4 bz4Var = new bz4();
            bz4Var.y = objG;
            Class<?> cls = objG.getClass();
            try {
                bz4Var.r = cls.getMethod(str, bz4.n);
                menuItem.setOnMenuItemClickListener(bz4Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.p >= 2) {
            if (menuItem instanceof n43) {
                n43 n43Var = (n43) menuItem;
                n43Var.k = (n43Var.k & (-5)) | 4;
            } else if (menuItem instanceof r43) {
                r43 r43Var = (r43) menuItem;
                ez4 ez4Var = r43Var.r;
                try {
                    Method declaredMethod = r43Var.n;
                    if (declaredMethod == null) {
                        declaredMethod = ez4Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        r43Var.n = declaredMethod;
                    }
                    declaredMethod.invoke(ez4Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.k;
        if (str2 != null) {
            menuItem.setActionView((View) g(str2, dz4.v, dz4Var.g));
            z = true;
        }
        int i2 = this.f;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        o43 o43Var = this.e;
        if (o43Var != null) {
            if (menuItem instanceof ez4) {
                ((ez4) menuItem).g(o43Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof ez4;
        if (z2) {
            ((ez4) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.w(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((ez4) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.o(menuItem, charSequence2);
        }
        char c = this.c;
        int i3 = this.i;
        if (z2) {
            ((ez4) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.m(menuItem, c, i3);
        }
        char c2 = this.b;
        int i4 = this.s;
        if (z2) {
            ((ez4) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.p(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((ez4) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                tm.s(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((ez4) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                tm.b(menuItem, colorStateList);
            }
        }
    }
}
