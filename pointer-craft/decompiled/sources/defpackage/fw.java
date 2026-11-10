package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fw implements hx1 {
    public CharSequence a;
    public ArrayList b;
    public ArrayList c;
    public final ArrayList g;
    public boolean i;
    public String j;
    public boolean l;
    public int m;
    public int n;
    public boolean p;
    public CharSequence q;
    public int r;
    public final kx1 s;
    public int t;
    public int u;
    public int v;
    public ArrayList w;
    public int x;
    public int y;

    public fw(kx1 kx1Var) {
        kx1Var.K();
        rw1 rw1Var = kx1Var.f;
        if (rw1Var != null) {
            rw1Var.k.getClassLoader();
        }
        this.g = new ArrayList();
        this.i = false;
        this.u = -1;
        this.s = kx1Var;
    }

    @Override // defpackage.hx1
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.l) {
            return true;
        }
        this.s.n.add(this);
        return true;
    }

    public final void j(pw1 pw1Var) {
        kx1 kx1Var = pw1Var.A;
        if (kx1Var == null || kx1Var == this.s) {
            y(new wx1(3, pw1Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + pw1Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.p);
            if (this.x != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.x));
            }
            if (this.y != 0 || this.r != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.y));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.r));
            }
            if (this.n != 0 || this.v != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.v));
            }
            if (this.t != 0 || this.a != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.t));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.a);
            }
            if (this.m != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wx1 wx1Var = (wx1) arrayList.get(i);
            switch (wx1Var.g) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + wx1Var.g;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(wx1Var.y);
            if (z) {
                if (wx1Var.n != 0 || wx1Var.v != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(wx1Var.n));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(wx1Var.v));
                }
                if (wx1Var.x != 0 || wx1Var.l != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(wx1Var.x));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(wx1Var.l));
                }
            }
        }
    }

    public final void n() {
        ArrayList arrayList = this.g;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            wx1 wx1Var = (wx1) arrayList.get(size);
            if (wx1Var.r) {
                if (wx1Var.g == 8) {
                    wx1Var.r = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = wx1Var.y.F;
                    wx1Var.g = 2;
                    wx1Var.r = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        wx1 wx1Var2 = (wx1) arrayList.get(i2);
                        if (wx1Var2.r && wx1Var2.y.F == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void r(int i) {
        if (this.l) {
            if (kx1.N(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                wx1 wx1Var = (wx1) arrayList.get(i2);
                pw1 pw1Var = wx1Var.y;
                if (pw1Var != null) {
                    pw1Var.e += i;
                    if (kx1.N(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + wx1Var.y + " to " + wx1Var.y.e);
                    }
                }
            }
        }
    }

    public final void t(pw1 pw1Var, wt2 wt2Var) {
        kx1 kx1Var = pw1Var.A;
        kx1 kx1Var2 = this.s;
        if (kx1Var != kx1Var2) {
            l0.m(kx1Var2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (wt2Var == wt2.t && pw1Var.j > -1) {
            t94.r(wt2Var, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
            return;
        }
        if (wt2Var == wt2.j) {
            t94.r(wt2Var, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
            return;
        }
        wx1 wx1Var = new wx1();
        wx1Var.g = 10;
        wx1Var.y = pw1Var;
        wx1Var.r = false;
        wx1Var.j = pw1Var.W;
        wx1Var.t = wt2Var;
        y(wx1Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public final int v(boolean z, boolean z2) {
        if (this.p) {
            l0.z("commit already called");
            return 0;
        }
        if (kx1.N(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new hy2());
            l("  ", printWriter, true);
            printWriter.close();
        }
        this.p = true;
        boolean z3 = this.l;
        kx1 kx1Var = this.s;
        if (z3) {
            this.u = kx1Var.m.getAndIncrement();
        } else {
            this.u = -1;
        }
        if (z2) {
            kx1Var.d(this, z);
        }
        return this.u;
    }

    public final void x(int i, pw1 pw1Var, String str, int i2) {
        String str2 = pw1Var.V;
        if (str2 != null) {
            vx1.r(pw1Var, str2);
        }
        Class<?> cls = pw1Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            l0.a(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = pw1Var.G;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(pw1Var);
                String str4 = pw1Var.G;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            pw1Var.G = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + pw1Var + " with tag " + str + " to container view with no id");
            }
            int i3 = pw1Var.E;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(pw1Var);
                int i4 = pw1Var.E;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            pw1Var.E = i;
            pw1Var.F = i;
        }
        y(new wx1(i2, pw1Var));
        pw1Var.A = this.s;
    }

    public final void y(wx1 wx1Var) {
        this.g.add(wx1Var);
        wx1Var.n = this.y;
        wx1Var.v = this.r;
        wx1Var.x = this.n;
        wx1Var.l = this.v;
    }
}
