package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1 {
    public Object g;
    public Object y;

    public u1() {
        this.y = new int[2];
    }

    public abstract void a();

    public String j() {
        String str = (String) this.g;
        if (str != null) {
            return str;
        }
        yf2.Y("text");
        throw null;
    }

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.y;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public abstract int[] m(int i);

    public abstract IntentFilter n();

    public void q() {
        r();
        IntentFilter intentFilterN = n();
        if (intentFilterN.countActions() == 0) {
            return;
        }
        ql qlVar = (ql) this.g;
        if (qlVar == null) {
            qlVar = new ql(this, (byte) 0);
            this.g = qlVar;
        }
        ((tl) this.y).p.registerReceiver(qlVar, intentFilterN);
    }

    public void r() {
        ql qlVar = (ql) this.g;
        if (qlVar != null) {
            try {
                ((tl) this.y).p.unregisterReceiver(qlVar);
            } catch (IllegalArgumentException unused) {
            }
            this.g = null;
        }
    }

    public void t(String str) {
        this.g = str;
    }

    public abstract int[] v(int i);

    public MenuItem x(MenuItem menuItem) {
        if (!(menuItem instanceof ez4)) {
            return menuItem;
        }
        ez4 ez4Var = (ez4) menuItem;
        sp4 sp4Var = (sp4) this.y;
        if (sp4Var == null) {
            sp4Var = new sp4(0);
            this.y = sp4Var;
        }
        MenuItem menuItem2 = (MenuItem) sp4Var.get(ez4Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        r43 r43Var = new r43((Context) this.g, ez4Var);
        ((sp4) this.y).put(ez4Var, r43Var);
        return r43Var;
    }

    public u1(Context context) {
        this.g = context;
    }

    public u1(tl tlVar) {
        this.y = tlVar;
    }
}
