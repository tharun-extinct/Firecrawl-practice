package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ew0 extends ViewGroup.MarginLayoutParams {
    public int a;
    public boolean c;
    public bw0 g;
    public final Rect i;
    public int j;
    public final int l;
    public View m;
    public final int n;
    public View q;
    public final int r;
    public int t;
    public final int v;
    public boolean w;
    public final int x;
    public boolean y;

    public ew0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = false;
        this.r = 0;
        this.n = 0;
        this.v = -1;
        this.x = -1;
        this.l = 0;
        this.j = 0;
        this.i = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k24.y);
        this.r = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.n = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.v = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.l = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.y = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.A;
            bw0 bw0Var = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.A;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.C;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.B);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bw0Var = (bw0) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    uo1.w("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.g = bw0Var;
        }
        typedArrayObtainStyledAttributes.recycle();
        bw0 bw0Var2 = this.g;
        if (bw0Var2 != null) {
            bw0Var2.r(this);
        }
    }

    public final boolean g(int i) {
        if (i == 0) {
            return this.w;
        }
        if (i != 1) {
            return false;
        }
        return this.c;
    }

    public ew0() {
        super(-2, -2);
        this.y = false;
        this.r = 0;
        this.n = 0;
        this.v = -1;
        this.x = -1;
        this.l = 0;
        this.j = 0;
        this.i = new Rect();
    }

    public ew0(ew0 ew0Var) {
        super((ViewGroup.MarginLayoutParams) ew0Var);
        this.y = false;
        this.r = 0;
        this.n = 0;
        this.v = -1;
        this.x = -1;
        this.l = 0;
        this.j = 0;
        this.i = new Rect();
    }

    public ew0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.y = false;
        this.r = 0;
        this.n = 0;
        this.v = -1;
        this.x = -1;
        this.l = 0;
        this.j = 0;
        this.i = new Rect();
    }

    public ew0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.y = false;
        this.r = 0;
        this.n = 0;
        this.v = -1;
        this.x = -1;
        this.l = 0;
        this.j = 0;
        this.i = new Rect();
    }
}
