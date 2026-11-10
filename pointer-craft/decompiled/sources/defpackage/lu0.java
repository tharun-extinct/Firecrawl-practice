package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 extends ContextWrapper {
    public static Configuration x;
    public int g;
    public Configuration n;
    public LayoutInflater r;
    public Resources v;
    public Resources.Theme y;

    public lu0(Context context, int i) {
        super(context);
        this.g = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void g(Configuration configuration) {
        if (this.v != null) {
            l0.z("getResources() or getAssets() has already been called");
        } else if (this.n == null) {
            this.n = new Configuration(configuration);
        } else {
            l0.z("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r0.equals(r1) != false) goto L16;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.v
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.n
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L23
            android.content.res.Configuration r1 = defpackage.lu0.x
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.lu0.x = r1
        L1c:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
            goto L30
        L23:
            android.content.res.Configuration r0 = r3.n
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.v = r0
            return r0
        L30:
            android.content.res.Resources r0 = super.getResources()
            r3.v = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu0.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.r;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.r = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.y;
        if (theme != null) {
            return theme;
        }
        if (this.g == 0) {
            this.g = R.style.Theme_AppCompat_Light;
        }
        y();
        return this.y;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.g != i) {
            this.g = i;
            y();
        }
    }

    public final void y() {
        if (this.y == null) {
            this.y = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.y.setTo(theme);
            }
        }
        this.y.applyStyle(this.g, true);
    }
}
