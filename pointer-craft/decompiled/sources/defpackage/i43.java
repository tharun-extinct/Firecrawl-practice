package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class i43 implements Menu {
    public static final int[] d = {1, 4, 5, 3, 2, 0};
    public final ArrayList a;
    public Drawable c;
    public final Context g;
    public View i;
    public boolean j;
    public boolean k;
    public final ArrayList l;
    public boolean m;
    public final boolean n;
    public n43 o;
    public boolean r;
    public final ArrayList t;
    public g43 v;
    public CharSequence w;
    public final ArrayList x;
    public final Resources y;
    public boolean q = false;
    public boolean b = false;
    public boolean s = false;
    public boolean p = false;
    public boolean u = false;
    public final ArrayList z = new ArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public boolean f = false;

    public i43(Context context) {
        boolean zC;
        boolean z = false;
        this.g = context;
        Resources resources = context.getResources();
        this.y = resources;
        this.x = new ArrayList();
        this.l = new ArrayList();
        this.j = true;
        this.t = new ArrayList();
        this.a = new ArrayList();
        this.m = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = cl5.g;
            if (Build.VERSION.SDK_INT >= 28) {
                zC = ym.c(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zC = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zC) {
                z = true;
            }
        }
        this.n = z;
    }

    public final void a() {
        ArrayList arrayListW = w();
        if (this.m) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
            boolean zM = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                f53 f53Var = (f53) weakReference.get();
                if (f53Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zM |= f53Var.m();
                }
            }
            ArrayList arrayList = this.t;
            ArrayList arrayList2 = this.a;
            if (zM) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListW.size();
                for (int i = 0; i < size; i++) {
                    n43 n43Var = (n43) arrayListW.get(i);
                    if ((n43Var.k & 32) == 32) {
                        arrayList.add(n43Var);
                    } else {
                        arrayList2.add(n43Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(w());
            }
            this.m = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(0, 0, 0, this.y.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.g.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n43 n43VarG = g(i, i2, i3, resolveInfo.loadLabel(packageManager));
            n43VarG.setIcon(resolveInfo.loadIcon(packageManager));
            n43VarG.l = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = n43VarG;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        n43 n43VarG = g(i, i2, i3, charSequence);
        ly4 ly4Var = new ly4(this.g, this, n43VarG);
        n43VarG.i = ly4Var;
        ly4Var.setHeaderTitle(n43VarG.v);
        return ly4Var;
    }

    public boolean b() {
        return this.n;
    }

    public boolean c() {
        return this.f;
    }

    @Override // android.view.Menu
    public final void clear() {
        n43 n43Var = this.o;
        if (n43Var != null) {
            v(n43Var);
        }
        this.x.clear();
        s(true);
    }

    public final void clearHeader() {
        this.c = null;
        this.w = null;
        this.i = null;
        s(false);
    }

    @Override // android.view.Menu
    public final void close() {
        n(true);
    }

    public final void d() {
        this.b = false;
        if (this.s) {
            this.s = false;
            s(this.p);
        }
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.s = false;
        this.p = false;
    }

    public final void f(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.i = view;
            this.w = null;
            this.c = null;
        } else {
            if (i > 0) {
                this.w = this.y.getText(i);
            } else if (charSequence != null) {
                this.w = charSequence;
            }
            if (i2 > 0) {
                this.c = this.g.getDrawable(i2);
            } else if (drawable != null) {
                this.c = drawable;
            }
            this.i = null;
        }
        s(false);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n43 n43Var = (n43) arrayList.get(i2);
            if (n43Var.g == i) {
                return n43Var;
            }
            if (n43Var.hasSubMenu() && (menuItemFindItem = n43Var.i.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n43 g(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            l0.u("order does not contain a valid category.");
            return null;
        }
        int i6 = (d[i5] << 16) | (65535 & i3);
        n43 n43Var = new n43(this, i, i2, i3, i6, charSequence, this.q ? 1 : 0);
        ArrayList arrayList = this.x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n43) arrayList.get(size)).n <= i6) {
                i4 = size + 1;
                arrayList.add(i4, n43Var);
                s(true);
                return n43Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, n43Var);
        s(true);
        return n43Var;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.x.get(i);
    }

    public final void h(Bundle bundle) {
        int size = this.x.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ly4) item.getSubMenu()).h(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n43) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.r;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return j(i, keyEvent) != null;
    }

    public final n43 j(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.z;
        arrayList.clear();
        t(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n43) arrayList.get(0);
        }
        boolean zI = i();
        for (int i2 = 0; i2 < size; i2++) {
            n43 n43Var = (n43) arrayList.get(i2);
            char c = zI ? n43Var.a : n43Var.j;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zI && c == '\b' && i == 67))) {
                return n43Var;
            }
        }
        return null;
    }

    public final void k(boolean z) {
        this.k = z;
    }

    public boolean l(n43 n43Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
        boolean zX = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        e();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            f53 f53Var = (f53) weakReference.get();
            if (f53Var != null) {
                zX = f53Var.x(n43Var);
                if (zX) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        d();
        if (zX) {
            this.o = n43Var;
        }
        return zX;
    }

    public String m() {
        return "android:menu:actionviewstates";
    }

    public final void n(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            f53 f53Var = (f53) weakReference.get();
            if (f53Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                f53Var.y(this, z);
            }
        }
        this.u = false;
    }

    public void o(g43 g43Var) {
        this.v = g43Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean p(MenuItem menuItem, f53 f53Var, int i) {
        o43 o43Var;
        boolean zExpandActionView;
        o43 o43Var2;
        boolean z;
        ly4 ly4Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        f53 f53Var2;
        n43 n43Var = (n43) menuItem;
        boolean zA = false;
        if (n43Var == null || !n43Var.isEnabled()) {
            return false;
        }
        i43 i43Var = n43Var.c;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = n43Var.b;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(n43Var)) && !i43Var.x(i43Var, n43Var)) {
            Intent intent = n43Var.l;
            if (intent != null) {
                try {
                    i43Var.g.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    o43Var = n43Var.A;
                    if (o43Var == null) {
                    }
                    zExpandActionView = false;
                    o43Var2 = n43Var.A;
                    if (o43Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (n43Var.v()) {
                        zExpandActionView |= n43Var.expandActionView();
                        if (zExpandActionView) {
                            n(true);
                        }
                    } else if (n43Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            n(false);
                        }
                        if (!n43Var.hasSubMenu()) {
                            ly4 ly4Var2 = new ly4(this.g, this, n43Var);
                            n43Var.i = ly4Var2;
                            ly4Var2.setHeaderTitle(n43Var.v);
                        }
                        ly4Var = n43Var.i;
                        if (z) {
                            o43Var2.y.onPrepareSubMenu(ly4Var);
                        }
                        copyOnWriteArrayList = this.h;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (f53Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                f53Var2 = (f53) weakReference.get();
                                if (f53Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zA) {
                                    zA = f53Var2.a(ly4Var);
                                }
                            }
                        }
                        zExpandActionView |= zA;
                        if (!zExpandActionView) {
                            n(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            n(false);
                        }
                        if (!n43Var.hasSubMenu()) {
                            ly4 ly4Var3 = new ly4(this.g, this, n43Var);
                            n43Var.i = ly4Var3;
                            ly4Var3.setHeaderTitle(n43Var.v);
                        }
                        ly4Var = n43Var.i;
                        if (z) {
                            o43Var2.y.onPrepareSubMenu(ly4Var);
                        }
                        copyOnWriteArrayList = this.h;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zA = f53Var != null ? f53Var.a(ly4Var) : false;
                            while (r8.hasNext()) {
                                f53Var2 = (f53) weakReference.get();
                                if (f53Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zA) {
                                    zA = f53Var2.a(ly4Var);
                                }
                            }
                        }
                        zExpandActionView |= zA;
                        if (!zExpandActionView) {
                            n(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                o43Var = n43Var.A;
                if (o43Var == null && o43Var.y.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        o43Var2 = n43Var.A;
        if (o43Var2 == null && o43Var2.y.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (n43Var.v()) {
            zExpandActionView |= n43Var.expandActionView();
            if (zExpandActionView) {
                n(true);
            }
        } else if (n43Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                n(false);
            }
            if (!n43Var.hasSubMenu()) {
                ly4 ly4Var4 = new ly4(this.g, this, n43Var);
                n43Var.i = ly4Var4;
                ly4Var4.setHeaderTitle(n43Var.v);
            }
            ly4Var = n43Var.i;
            if (z) {
                o43Var2.y.onPrepareSubMenu(ly4Var);
            }
            copyOnWriteArrayList = this.h;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (f53Var != null) {
                }
                while (r8.hasNext()) {
                    f53Var2 = (f53) weakReference.get();
                    if (f53Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zA) {
                        zA = f53Var2.a(ly4Var);
                    }
                }
            }
            zExpandActionView |= zA;
            if (!zExpandActionView) {
                n(true);
            }
        } else if ((i & 1) == 0) {
            n(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return p(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        n43 n43VarJ = j(i, keyEvent);
        boolean zP = n43VarJ != null ? p(n43VarJ, null, i2) : false;
        if ((i2 & 2) != 0) {
            n(true);
        }
        return zP;
    }

    public final void r(f53 f53Var, Context context) {
        this.h.add(new WeakReference(f53Var));
        f53Var.t(context, this);
        this.m = true;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((n43) arrayList.get(i3)).y == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((n43) arrayList.get(i3)).y != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            s(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((n43) arrayList.get(i2)).g == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        s(true);
    }

    public final void s(boolean z) {
        if (this.b) {
            this.s = true;
            if (z) {
                this.p = true;
                return;
            }
            return;
        }
        if (z) {
            this.j = true;
            this.m = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        e();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            f53 f53Var = (f53) weakReference.get();
            if (f53Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                f53Var.l();
            }
        }
        d();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n43 n43Var = (n43) arrayList.get(i2);
            if (n43Var.y == i) {
                n43Var.k = (n43Var.k & (-5)) | (z2 ? 4 : 0);
                n43Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n43 n43Var = (n43) arrayList.get(i2);
            if (n43Var.y == i) {
                n43Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            n43 n43Var = (n43) arrayList.get(i2);
            if (n43Var.y == i) {
                int i3 = n43Var.k;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                n43Var.k = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            s(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.r = z;
        s(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.x.size();
    }

    public final void t(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zI = i();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.x;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n43 n43Var = (n43) arrayList2.get(i2);
                if (n43Var.hasSubMenu()) {
                    n43Var.i.t(arrayList, i, keyEvent);
                }
                char c = zI ? n43Var.a : n43Var.j;
                if ((modifiers & 69647) == ((zI ? n43Var.m : n43Var.t) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zI && c == '\b' && i == 67)) && n43Var.isEnabled()) {
                        arrayList.add(n43Var);
                    }
                }
            }
        }
    }

    public final void u(f53 f53Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            f53 f53Var2 = (f53) weakReference.get();
            if (f53Var2 == null || f53Var2 == f53Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public boolean v(n43 n43Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.h;
        boolean zN = false;
        if (!copyOnWriteArrayList.isEmpty() && this.o == n43Var) {
            e();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                f53 f53Var = (f53) weakReference.get();
                if (f53Var != null) {
                    zN = f53Var.n(n43Var);
                    if (zN) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            d();
            if (zN) {
                this.o = null;
            }
        }
        return zN;
    }

    public final ArrayList w() {
        boolean z = this.j;
        ArrayList arrayList = this.l;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            n43 n43Var = (n43) arrayList2.get(i);
            if (n43Var.isVisible()) {
                arrayList.add(n43Var);
            }
        }
        this.j = false;
        this.m = true;
        return arrayList;
    }

    public boolean x(i43 i43Var, MenuItem menuItem) {
        g43 g43Var = this.v;
        return g43Var != null && g43Var.j(i43Var, menuItem);
    }

    public final void y(f53 f53Var) {
        r(f53Var, this.g);
    }

    public final void z(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(m());
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ly4) item.getSubMenu()).z(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return g(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return g(i, i2, i3, this.y.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.y.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.y.getString(i4));
    }

    public i43 q() {
        return this;
    }
}
