package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class bz4 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] n = {MenuItem.class};
    public final /* synthetic */ byte g = 0;
    public Object r;
    public Object y;

    public bz4(r43 r43Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.r = r43Var;
        this.y = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.g) {
            case 0:
                Object obj = this.y;
                Method method = (Method) this.r;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.y).onMenuItemClick(((r43) this.r).x(menuItem));
        }
    }

    public /* synthetic */ bz4() {
    }
}
