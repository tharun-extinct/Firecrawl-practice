package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n54 {
    public static final List z = Collections.EMPTY_LIST;
    public int a;
    public final View g;
    public RecyclerView p;
    public p44 u;
    public WeakReference y;
    public int r = -1;
    public int n = -1;
    public long v = -1;
    public int x = -1;
    public int l = -1;
    public n54 j = null;
    public n54 t = null;
    public ArrayList m = null;
    public List q = null;
    public int w = 0;
    public e54 c = null;
    public boolean i = false;
    public int b = 0;
    public int s = -1;

    public n54(View view) {
        if (view != null) {
            this.g = view;
        } else {
            l0.u("itemView may not be null");
            throw null;
        }
    }

    public final boolean a() {
        return (this.a & 8) != 0;
    }

    public final void b(boolean z2) {
        int i = this.w;
        int i2 = z2 ? i - 1 : i + 1;
        this.w = i2;
        if (i2 < 0) {
            this.w = 0;
            if (RecyclerView.J0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.a |= 16;
        } else if (z2 && i2 == 0) {
            this.a &= -17;
        }
        if (RecyclerView.K0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final void c(int i, boolean z2) {
        if (this.n == -1) {
            this.n = this.r;
        }
        int i2 = this.l;
        if (i2 == -1) {
            i2 = this.r;
            this.l = i2;
        }
        if (z2) {
            this.l = i2 + i;
        }
        this.r += i;
        View view = this.g;
        if (view.getLayoutParams() != null) {
            ((y44) view.getLayoutParams()).a = true;
        }
    }

    public final void g(int i) {
        this.a = i | this.a;
    }

    public final void i() {
        if (RecyclerView.J0 && q()) {
            uo1.l(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.a = 0;
        this.r = -1;
        this.n = -1;
        this.v = -1L;
        this.l = -1;
        this.w = 0;
        this.j = null;
        this.t = null;
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.a &= -1025;
        this.b = 0;
        this.s = -1;
        RecyclerView.q(this);
    }

    public final boolean j() {
        return (this.a & 4) != 0;
    }

    public final boolean l() {
        return (this.a & 1) != 0;
    }

    public final boolean m() {
        return this.c != null;
    }

    public final int n() {
        int i = this.l;
        return i == -1 ? this.r : i;
    }

    public final boolean p() {
        return (this.a & 32) != 0;
    }

    public final boolean q() {
        return (this.a & 256) != 0;
    }

    public final int r() {
        RecyclerView recyclerView;
        p44 adapter;
        int iL;
        if (this.u == null || (recyclerView = this.p) == null || (adapter = recyclerView.getAdapter()) == null || (iL = this.p.L(this)) == -1 || this.u != adapter) {
            return -1;
        }
        return iL;
    }

    public final boolean s() {
        return (this.a & 128) != 0;
    }

    public final boolean t() {
        if ((this.a & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = xk5.g;
        return !this.g.hasTransientState();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.r + " id=" + this.v + ", oldPos=" + this.n + ", pLpos:" + this.l);
        if (m()) {
            sb.append(" scrap ");
            sb.append(this.i ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        if ((this.a & 2) != 0) {
            sb.append(" update");
        }
        if (a()) {
            sb.append(" removed");
        }
        if (s()) {
            sb.append(" ignored");
        }
        if (q()) {
            sb.append(" tmpDetached");
        }
        if (!t()) {
            sb.append(" not recyclable(" + this.w + ")");
        }
        if ((this.a & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.g.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final List v() {
        ArrayList arrayList;
        return ((this.a & 1024) != 0 || (arrayList = this.m) == null || arrayList.size() == 0) ? z : this.q;
    }

    public final boolean w() {
        return (this.a & 2) != 0;
    }

    public final boolean x() {
        View view = this.g;
        return (view.getParent() == null || view.getParent() == this.p) ? false : true;
    }

    public final int y() {
        RecyclerView recyclerView = this.p;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.L(this);
    }
}
