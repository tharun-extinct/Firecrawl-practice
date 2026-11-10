package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes2.dex */
public class i53 extends u1 implements Menu {
    public final i43 r;

    public i53(Context context, i43 i43Var) {
        super(context);
        if (i43Var != null) {
            this.r = i43Var;
        } else {
            l0.u("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return x(this.r.g(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.r.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = x(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.r.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        sp4 sp4Var = (sp4) this.y;
        if (sp4Var != null) {
            sp4Var.clear();
        }
        this.r.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.r.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return x(this.r.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return x(this.r.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.r.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.r.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.r.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.r.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((sp4) this.y) != null) {
            int i2 = 0;
            while (true) {
                sp4 sp4Var = (sp4) this.y;
                if (i2 >= sp4Var.a) {
                    break;
                }
                if (((ez4) sp4Var.x(i2)).getGroupId() == i) {
                    ((sp4) this.y).l(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.r.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((sp4) this.y) != null) {
            int i2 = 0;
            while (true) {
                sp4 sp4Var = (sp4) this.y;
                if (i2 >= sp4Var.a) {
                    break;
                }
                if (((ez4) sp4Var.x(i2)).getItemId() == i) {
                    ((sp4) this.y).l(i2);
                    break;
                }
                i2++;
            }
        }
        this.r.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.r.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.r.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.r.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.r.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.r.x.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.r.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.r.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.r.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return x(this.r.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return x(this.r.g(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return x(this.r.add(i, i2, i3, i4));
    }
}
