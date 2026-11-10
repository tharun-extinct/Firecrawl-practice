package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import io.appground.blek.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class kx1 {
    public final ex1 A;
    public final l76 B;
    public b5 C;
    public b5 D;
    public b5 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public nx1 O;
    public final y9 P;
    public final CopyOnWriteArrayList b;
    public final ArrayList c;
    public pw1 d;
    public pw1 e;
    public rw1 f;
    public final dx1 h;
    public final ji i;
    public ue5 k;
    public tj3 l;
    public int o;
    public final bx1 p;
    public final bx1 s;
    public final bx1 u;
    public ArrayList v;
    public boolean y;
    public final bx1 z;
    public final ArrayList g = new ArrayList();
    public final kb5 r = new kb5((byte) 2);
    public ArrayList n = new ArrayList();
    public final ax1 x = new ax1(this);
    public fw j = null;
    public boolean t = false;
    public final uv a = new uv(this, 1);
    public final AtomicInteger m = new AtomicInteger();
    public final Map q = Collections.synchronizedMap(new HashMap());
    public final Map w = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [bx1] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bx1] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bx1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [bx1] */
    public kx1() {
        Collections.synchronizedMap(new HashMap());
        this.c = new ArrayList();
        this.i = new ji(this);
        this.b = new CopyOnWriteArrayList();
        final byte b = 0;
        this.s = new et0(this) { // from class: bx1
            public final /* synthetic */ kx1 y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b2 = b;
                kx1 kx1Var = this.y;
                switch (b2) {
                    case 0:
                        if (kx1Var.P()) {
                            kx1Var.a(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kx1Var.P() && num.intValue() == 80) {
                            kx1Var.c(false);
                            break;
                        }
                        break;
                    case 2:
                        p93 p93Var = (p93) obj;
                        if (kx1Var.P()) {
                            p93Var.getClass();
                            kx1Var.i(false);
                        }
                        break;
                    default:
                        qs3 qs3Var = (qs3) obj;
                        if (kx1Var.P()) {
                            qs3Var.getClass();
                            kx1Var.z(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.p = new et0(this) { // from class: bx1
            public final /* synthetic */ kx1 y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b3 = b2;
                kx1 kx1Var = this.y;
                switch (b3) {
                    case 0:
                        if (kx1Var.P()) {
                            kx1Var.a(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kx1Var.P() && num.intValue() == 80) {
                            kx1Var.c(false);
                            break;
                        }
                        break;
                    case 2:
                        p93 p93Var = (p93) obj;
                        if (kx1Var.P()) {
                            p93Var.getClass();
                            kx1Var.i(false);
                        }
                        break;
                    default:
                        qs3 qs3Var = (qs3) obj;
                        if (kx1Var.P()) {
                            qs3Var.getClass();
                            kx1Var.z(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.u = new et0(this) { // from class: bx1
            public final /* synthetic */ kx1 y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b4 = b3;
                kx1 kx1Var = this.y;
                switch (b4) {
                    case 0:
                        if (kx1Var.P()) {
                            kx1Var.a(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kx1Var.P() && num.intValue() == 80) {
                            kx1Var.c(false);
                            break;
                        }
                        break;
                    case 2:
                        p93 p93Var = (p93) obj;
                        if (kx1Var.P()) {
                            p93Var.getClass();
                            kx1Var.i(false);
                        }
                        break;
                    default:
                        qs3 qs3Var = (qs3) obj;
                        if (kx1Var.P()) {
                            qs3Var.getClass();
                            kx1Var.z(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.z = new et0(this) { // from class: bx1
            public final /* synthetic */ kx1 y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b5 = b4;
                kx1 kx1Var = this.y;
                switch (b5) {
                    case 0:
                        if (kx1Var.P()) {
                            kx1Var.a(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kx1Var.P() && num.intValue() == 80) {
                            kx1Var.c(false);
                            break;
                        }
                        break;
                    case 2:
                        p93 p93Var = (p93) obj;
                        if (kx1Var.P()) {
                            p93Var.getClass();
                            kx1Var.i(false);
                        }
                        break;
                    default:
                        qs3 qs3Var = (qs3) obj;
                        if (kx1Var.P()) {
                            qs3Var.getClass();
                            kx1Var.z(false);
                        }
                        break;
                }
            }
        };
        this.h = new dx1(this);
        this.o = -1;
        this.A = new ex1(this);
        this.B = new l76((byte) 11);
        this.F = new ArrayDeque();
        this.P = new y9(this, (byte) 3);
    }

    public static kx1 F(View view) {
        yk ykVar;
        pw1 pw1VarG = G(view);
        if (pw1VarG != null) {
            if (pw1VarG.u()) {
                return pw1VarG.j();
            }
            throw new IllegalStateException("The Fragment " + pw1VarG + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                ykVar = null;
                break;
            }
            if (context instanceof yk) {
                ykVar = (yk) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (ykVar != null) {
            return ((rw1) ykVar.C.t).e;
        }
        uo1.l(view, " is not within a subclass of FragmentActivity.", "View ");
        return null;
    }

    public static pw1 G(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            pw1 pw1Var = tag instanceof pw1 ? (pw1) tag : null;
            if (pw1Var != null) {
                return pw1Var;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet I(fw fwVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < fwVar.g.size(); i++) {
            pw1 pw1Var = ((wx1) fwVar.g.get(i)).y;
            if (pw1Var != null && fwVar.l) {
                hashSet.add(pw1Var);
            }
        }
        return hashSet;
    }

    public static boolean N(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean O(pw1 pw1Var) {
        if (pw1Var.K && pw1Var.L) {
            return true;
        }
        ArrayList arrayListP = pw1Var.C.r.p();
        int size = arrayListP.size();
        boolean zO = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListP.get(i);
            i++;
            pw1 pw1Var2 = (pw1) obj;
            if (pw1Var2 != null) {
                zO = O(pw1Var2);
            }
            if (zO) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(pw1 pw1Var) {
        if (pw1Var == null) {
            return true;
        }
        if (pw1Var.L) {
            return pw1Var.A == null || Q(pw1Var.D);
        }
        return false;
    }

    public static boolean R(pw1 pw1Var) {
        if (pw1Var == null) {
            return true;
        }
        kx1 kx1Var = pw1Var.A;
        return pw1Var == kx1Var.e && R(kx1Var.d);
    }

    public static void i0(pw1 pw1Var) {
        if (N(2)) {
            Log.v("FragmentManager", "show: " + pw1Var);
        }
        if (pw1Var.H) {
            pw1Var.H = false;
            pw1Var.S = !pw1Var.S;
        }
    }

    public final boolean A(boolean z) {
        boolean zG;
        ArrayList arrayList;
        fw fwVar;
        e(z);
        if (!this.t && (fwVar = this.j) != null) {
            fwVar.p = false;
            fwVar.n();
            if (N(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.j + " as part of execPendingActions for actions " + this.g);
            }
            this.j.v(false, false);
            this.g.add(0, this.j);
            ArrayList arrayList2 = this.j.g;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                pw1 pw1Var = ((wx1) obj).y;
                if (pw1Var != null) {
                    pw1Var.z = false;
                }
            }
            this.j = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.M;
            synchronized (this.g) {
                if (this.g.isEmpty()) {
                    zG = false;
                } else {
                    try {
                        int size2 = this.g.size();
                        int i2 = 0;
                        zG = false;
                        while (true) {
                            arrayList = this.g;
                            if (i2 >= size2) {
                                break;
                            }
                            zG |= ((hx1) arrayList.get(i2)).g(arrayList3, arrayList4);
                            i2++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f.d.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.g.clear();
                        this.f.d.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zG) {
                break;
            }
            z2 = true;
            this.y = true;
            try {
                a0(this.L, this.M);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        l0();
        if (this.K) {
            this.K = false;
            j0();
        }
        ((HashMap) this.r.t).values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void B(fw fwVar, boolean z) {
        if (z && (this.f == null || this.J)) {
            return;
        }
        e(z);
        fw fwVar2 = this.j;
        if (fwVar2 != null) {
            fwVar2.p = false;
            fwVar2.n();
            if (N(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.j + " as part of execSingleAction for action " + fwVar);
            }
            this.j.v(false, false);
            this.j.g(this.L, this.M);
            ArrayList arrayList = this.j.g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pw1 pw1Var = ((wx1) obj).y;
                if (pw1Var != null) {
                    pw1Var.z = false;
                }
            }
            this.j = null;
        }
        fwVar.g(this.L, this.M);
        this.y = true;
        try {
            a0(this.L, this.M);
            v();
            l0();
            if (this.K) {
                this.K = false;
                j0();
            }
            ((HashMap) this.r.t).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            v();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021c A[PHI: r15
  0x021c: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:103:0x0209, B:107:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        kb5 kb5Var = this.r;
        ArrayList arrayList3 = this.c;
        boolean z4 = ((fw) arrayList.get(i)).i;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(kb5Var.u());
        pw1 pw1Var = this.e;
        int i5 = i;
        boolean z5 = false;
        while (i5 < i2) {
            fw fwVar = (fw) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (zBooleanValue) {
                z = z4;
                i3 = i5;
                z2 = z5;
                int i6 = 1;
                ArrayList arrayList6 = fwVar.g;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    wx1 wx1Var = (wx1) arrayList6.get(size);
                    int i7 = wx1Var.g;
                    if (i7 != i6) {
                        if (i7 != 3) {
                            switch (i7) {
                                case 6:
                                    arrayList5.add(wx1Var.y);
                                    break;
                                case 8:
                                    pw1Var = null;
                                    break;
                                case 9:
                                    pw1Var = wx1Var.y;
                                    break;
                                case 10:
                                    wx1Var.t = wx1Var.j;
                                    break;
                            }
                        } else {
                            arrayList5.add(wx1Var.y);
                        }
                        size--;
                        i6 = 1;
                    }
                    arrayList5.remove(wx1Var.y);
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = fwVar.g;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    wx1 wx1Var2 = (wx1) arrayList7.get(i8);
                    boolean z6 = z4;
                    int i9 = wx1Var2.g;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 != 1) {
                        z3 = z5;
                        if (i9 != 2) {
                            if (i9 == 3 || i9 == 6) {
                                arrayList5.remove(wx1Var2.y);
                                pw1 pw1Var2 = wx1Var2.y;
                                if (pw1Var2 == pw1Var) {
                                    arrayList7.add(i8, new wx1(9, pw1Var2));
                                    i8++;
                                    pw1Var = null;
                                }
                            } else if (i9 == 7) {
                                i11 = 1;
                            } else if (i9 == 8) {
                                arrayList7.add(i8, new wx1(9, pw1Var, 0));
                                wx1Var2.r = true;
                                i8++;
                                pw1Var = wx1Var2.y;
                            }
                            i11 = 1;
                        } else {
                            pw1 pw1Var3 = wx1Var2.y;
                            int i12 = pw1Var3.F;
                            int size2 = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i13 = size2;
                                pw1 pw1Var4 = (pw1) arrayList5.get(size2);
                                if (pw1Var4.F != i12) {
                                    i12 = i12;
                                } else if (pw1Var4 == pw1Var3) {
                                    i12 = i12;
                                    z7 = true;
                                } else {
                                    if (pw1Var4 == pw1Var) {
                                        arrayList7.add(i8, new wx1(9, pw1Var4, 0));
                                        i8++;
                                        i4 = 0;
                                        pw1Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    wx1 wx1Var3 = new wx1(3, pw1Var4, i4);
                                    wx1Var3.n = wx1Var2.n;
                                    wx1Var3.x = wx1Var2.x;
                                    wx1Var3.v = wx1Var2.v;
                                    wx1Var3.l = wx1Var2.l;
                                    arrayList7.add(i8, wx1Var3);
                                    arrayList5.remove(pw1Var4);
                                    i8++;
                                    pw1Var = pw1Var;
                                }
                                size2 = i13 - 1;
                                i12 = i12;
                            }
                            i11 = 1;
                            if (z7) {
                                arrayList7.remove(i8);
                                i8--;
                            } else {
                                wx1Var2.g = 1;
                                wx1Var2.r = true;
                                arrayList5.add(pw1Var3);
                            }
                        }
                        i8 += i11;
                        z4 = z6;
                        i5 = i10;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(wx1Var2.y);
                    i8 += i11;
                    z4 = z6;
                    i5 = i10;
                    z5 = z3;
                }
                z = z4;
                i3 = i5;
                z2 = z5;
            }
            z5 = z2 || fwVar.l;
            i5 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.o >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((fw) arrayList.get(i14)).g;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    pw1 pw1Var5 = ((wx1) obj).y;
                    if (pw1Var5 != null && pw1Var5.A != null) {
                        kb5Var.o(j(pw1Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            fw fwVar2 = (fw) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                fwVar2.r(-1);
                kx1 kx1Var = fwVar2.s;
                ArrayList arrayList9 = fwVar2.g;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    wx1 wx1Var4 = (wx1) arrayList9.get(size4);
                    pw1 pw1Var6 = wx1Var4.y;
                    if (pw1Var6 != null) {
                        if (pw1Var6.R != null) {
                            pw1Var6.v().g = z10;
                        }
                        int i17 = fwVar2.x;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (pw1Var6.R != null || i18 != 0) {
                            pw1Var6.v();
                            pw1Var6.R.x = i18;
                        }
                        pw1Var6.v();
                        pw1Var6.R.getClass();
                    }
                    switch (wx1Var4.g) {
                        case 1:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            z10 = true;
                            kx1Var.e0(pw1Var6, true);
                            kx1Var.Z(pw1Var6);
                            break;
                        case 2:
                        default:
                            uo1.a(str, wx1Var4.g);
                            return;
                        case 3:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            kx1Var.g(pw1Var6);
                            z10 = true;
                            break;
                        case 4:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            kx1Var.getClass();
                            i0(pw1Var6);
                            z10 = true;
                            break;
                        case 5:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            kx1Var.e0(pw1Var6, true);
                            kx1Var.M(pw1Var6);
                            z10 = true;
                            break;
                        case 6:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            kx1Var.r(pw1Var6);
                            z10 = true;
                            break;
                        case 7:
                            pw1Var6.P(wx1Var4.n, wx1Var4.v, wx1Var4.x, wx1Var4.l);
                            kx1Var.e0(pw1Var6, true);
                            kx1Var.t(pw1Var6);
                            z10 = true;
                            break;
                        case 8:
                            kx1Var.g0(null);
                            z10 = true;
                            break;
                        case 9:
                            kx1Var.g0(pw1Var6);
                            z10 = true;
                            break;
                        case 10:
                            wx1Var4.t = pw1Var6.W;
                            kx1Var.f0(pw1Var6, wx1Var4.j);
                            z10 = true;
                            break;
                    }
                }
            } else {
                fwVar2.r(1);
                kx1 kx1Var2 = fwVar2.s;
                ArrayList arrayList10 = fwVar2.g;
                int size5 = arrayList10.size();
                int i20 = 0;
                while (i20 < size5) {
                    wx1 wx1Var5 = (wx1) arrayList10.get(i20);
                    pw1 pw1Var7 = wx1Var5.y;
                    if (pw1Var7 != null) {
                        if (pw1Var7.R != null) {
                            pw1Var7.v().g = false;
                        }
                        int i21 = fwVar2.x;
                        if (pw1Var7.R != null || i21 != 0) {
                            pw1Var7.v();
                            pw1Var7.R.x = i21;
                        }
                        pw1Var7.v();
                        pw1Var7.R.getClass();
                    }
                    switch (wx1Var5.g) {
                        case 1:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.e0(pw1Var7, false);
                            kx1Var2.g(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            uo1.a(str, wx1Var5.g);
                            return;
                        case 3:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.Z(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.M(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.e0(pw1Var7, false);
                            i0(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.t(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            pw1Var7.P(wx1Var5.n, wx1Var5.v, wx1Var5.x, wx1Var5.l);
                            kx1Var2.e0(pw1Var7, false);
                            kx1Var2.r(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            kx1Var2.g0(pw1Var7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            kx1Var2.g0(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            wx1Var5.j = pw1Var7.W;
                            kx1Var2.f0(pw1Var7, wx1Var5.t);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i22 = 0;
            while (i22 < size6) {
                Object obj2 = arrayList.get(i22);
                i22++;
                linkedHashSet.addAll(I((fw) obj2));
            }
            if (this.j == null) {
                int size7 = arrayList3.size();
                int i23 = 0;
                while (i23 < size7) {
                    Object obj3 = arrayList3.get(i23);
                    i23++;
                    if (obj3 != null) {
                        uo1.B();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i24 = 0;
                while (i24 < size8) {
                    Object obj4 = arrayList3.get(i24);
                    i24++;
                    if (obj4 != null) {
                        uo1.B();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i25 = i; i25 < i2; i25++) {
            fw fwVar3 = (fw) arrayList.get(i25);
            if (zBooleanValue2) {
                for (int size9 = fwVar3.g.size() - 1; size9 >= 0; size9--) {
                    pw1 pw1Var8 = ((wx1) fwVar3.g.get(size9)).y;
                    if (pw1Var8 != null) {
                        j(pw1Var8).m();
                    }
                }
            } else {
                ArrayList arrayList11 = fwVar3.g;
                int size10 = arrayList11.size();
                int i26 = 0;
                while (i26 < size10) {
                    Object obj5 = arrayList11.get(i26);
                    i26++;
                    pw1 pw1Var9 = ((wx1) obj5).y;
                    if (pw1Var9 != null) {
                        j(pw1Var9).m();
                    }
                }
            }
        }
        T(this.o, true);
        int i27 = i;
        for (r31 r31Var : l(arrayList, i27, i2)) {
            r31Var.v = zBooleanValue2;
            synchronized (r31Var.y) {
                try {
                    r31Var.q();
                    ArrayList arrayList12 = r31Var.y;
                    ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            qu4 qu4Var = (qu4) objPrevious;
                            d93 d93Var = su4.j;
                            View view = qu4Var.r.O;
                            view.getClass();
                            d93Var.getClass();
                            su4 su4VarS = d93.s(view);
                            su4 su4Var = qu4Var.g;
                            su4 su4Var2 = su4.a;
                            if (su4Var != su4Var2 || su4VarS == su4Var2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    r31Var.x = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            r31Var.v();
        }
        while (i27 < i2) {
            fw fwVar4 = (fw) arrayList.get(i27);
            if (((Boolean) arrayList2.get(i27)).booleanValue() && fwVar4.u >= 0) {
                fwVar4.u = -1;
            }
            if (fwVar4.b != null) {
                for (int i28 = 0; i28 < fwVar4.b.size(); i28++) {
                    ((Runnable) fwVar4.b.get(i28)).run();
                }
                fwVar4.b = null;
            }
            i27++;
        }
        if (!z9 || arrayList3.size() <= 0) {
            return;
        }
        fj.w(arrayList3.get(0));
        throw null;
    }

    public final pw1 D(int i) {
        kb5 kb5Var = this.r;
        ArrayList arrayList = (ArrayList) kb5Var.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pw1 pw1Var = (pw1) arrayList.get(size);
            if (pw1Var != null && pw1Var.E == i) {
                return pw1Var;
            }
        }
        for (tx1 tx1Var : ((HashMap) kb5Var.t).values()) {
            if (tx1Var != null) {
                pw1 pw1Var2 = tx1Var.r;
                if (pw1Var2.E == i) {
                    return pw1Var2;
                }
            }
        }
        return null;
    }

    public final pw1 E(String str) {
        kb5 kb5Var = this.r;
        ArrayList arrayList = (ArrayList) kb5Var.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pw1 pw1Var = (pw1) arrayList.get(size);
            if (pw1Var != null && str.equals(pw1Var.G)) {
                return pw1Var;
            }
        }
        for (tx1 tx1Var : ((HashMap) kb5Var.t).values()) {
            if (tx1Var != null) {
                pw1 pw1Var2 = tx1Var.r;
                if (str.equals(pw1Var2.G)) {
                    return pw1Var2;
                }
            }
        }
        return null;
    }

    public final void H() {
        for (r31 r31Var : x()) {
            if (r31Var.x) {
                if (N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r31Var.x = false;
                r31Var.v();
            }
        }
    }

    public final ViewGroup J(pw1 pw1Var) {
        ViewGroup viewGroup = pw1Var.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pw1Var.F <= 0 || !this.k.b0()) {
            return null;
        }
        View viewA0 = this.k.a0(pw1Var.F);
        if (viewA0 instanceof ViewGroup) {
            return (ViewGroup) viewA0;
        }
        return null;
    }

    public final ex1 K() {
        pw1 pw1Var = this.d;
        return pw1Var != null ? pw1Var.A.K() : this.A;
    }

    public final l76 L() {
        pw1 pw1Var = this.d;
        return pw1Var != null ? pw1Var.A.L() : this.B;
    }

    public final void M(pw1 pw1Var) {
        if (N(2)) {
            Log.v("FragmentManager", "hide: " + pw1Var);
        }
        if (pw1Var.H) {
            return;
        }
        pw1Var.H = true;
        pw1Var.S = true ^ pw1Var.S;
        h0(pw1Var);
    }

    public final boolean P() {
        pw1 pw1Var = this.d;
        if (pw1Var == null) {
            return true;
        }
        return pw1Var.u() && this.d.w().P();
    }

    public final boolean S() {
        return this.H || this.I;
    }

    public final void T(int i, boolean z) {
        rw1 rw1Var;
        if (this.f == null && i != -1) {
            l0.z("No activity");
            return;
        }
        if (z || i != this.o) {
            this.o = i;
            kb5 kb5Var = this.r;
            HashMap map = (HashMap) kb5Var.t;
            ArrayList arrayList = (ArrayList) kb5Var.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tx1 tx1Var = (tx1) map.get(((pw1) obj).q);
                if (tx1Var != null) {
                    tx1Var.m();
                }
            }
            for (tx1 tx1Var2 : map.values()) {
                if (tx1Var2 != null) {
                    tx1Var2.m();
                    pw1 pw1Var = tx1Var2.r;
                    if (pw1Var.u && !pw1Var.h()) {
                        kb5Var.f(tx1Var2);
                    }
                }
            }
            j0();
            if (this.G && (rw1Var = this.f) != null && this.o == 7) {
                rw1Var.A.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void U() {
        if (this.f == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.l = false;
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null) {
                pw1Var.C.U();
            }
        }
    }

    public final void V(FragmentContainerView fragmentContainerView) {
        View view;
        ArrayList arrayListS = this.r.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            tx1 tx1Var = (tx1) obj;
            pw1 pw1Var = tx1Var.r;
            if (pw1Var.F == fragmentContainerView.getId() && (view = pw1Var.O) != null && view.getParent() == null) {
                pw1Var.N = fragmentContainerView;
                tx1Var.y();
                tx1Var.m();
            }
        }
    }

    public final boolean W() {
        return X(-1, 0);
    }

    public final boolean X(int i, int i2) {
        A(false);
        e(true);
        pw1 pw1Var = this.e;
        if (pw1Var != null && i < 0 && pw1Var.j().W()) {
            return true;
        }
        boolean zY = Y(this.L, this.M, i, i2);
        if (zY) {
            this.y = true;
            try {
                a0(this.L, this.M);
                v();
            } catch (Throwable th) {
                v();
                throw th;
            }
        }
        l0();
        if (this.K) {
            this.K = false;
            j0();
        }
        ((HashMap) this.r.t).values().removeAll(Collections.singleton(null));
        return zY;
    }

    public final boolean Y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.n.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.n.size() - 1;
            } else {
                int size2 = this.n.size() - 1;
                while (size2 >= 0) {
                    fw fwVar = (fw) this.n.get(size2);
                    if (i >= 0 && i == fwVar.u) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        fw fwVar2 = (fw) this.n.get(size - 1);
                        if (i < 0 || i != fwVar2.u) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.n.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.n.size() - 1; size3 >= size; size3--) {
            arrayList.add((fw) this.n.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Z(pw1 pw1Var) {
        if (N(2)) {
            Log.v("FragmentManager", "remove: " + pw1Var + " nesting=" + pw1Var.e);
        }
        boolean zH = pw1Var.h();
        if (pw1Var.I && zH) {
            return;
        }
        kb5 kb5Var = this.r;
        synchronized (((ArrayList) kb5Var.j)) {
            ((ArrayList) kb5Var.j).remove(pw1Var);
        }
        pw1Var.p = false;
        if (O(pw1Var)) {
            this.G = true;
        }
        pw1Var.u = true;
        h0(pw1Var);
    }

    public final void a(boolean z) {
        if (z && this.f != null) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null) {
                pw1Var.M = true;
                if (z) {
                    pw1Var.C.a(true);
                }
            }
        }
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            l0.z("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((fw) arrayList.get(i)).i) {
                if (i2 != i) {
                    C(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((fw) arrayList.get(i2)).i) {
                        i2++;
                    }
                }
                C(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(arrayList, arrayList2, i2, size);
        }
    }

    public final void b() {
        ArrayList arrayListP = this.r.p();
        int size = arrayListP.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListP.get(i);
            i++;
            pw1 pw1Var = (pw1) obj;
            if (pw1Var != null) {
                pw1Var.z();
                pw1Var.C.b();
            }
        }
    }

    public final void b0(Bundle bundle) {
        ji jiVar;
        Bundle bundle2;
        tx1 tx1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f.k.getClassLoader());
                this.w.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f.k.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        kb5 kb5Var = this.r;
        HashMap map2 = (HashMap) kb5Var.a;
        HashMap map3 = (HashMap) kb5Var.t;
        map2.clear();
        map2.putAll(map);
        lx1 lx1Var = (lx1) bundle.getParcelable("state");
        if (lx1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = lx1Var.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            jiVar = this.i;
            int i2 = 2;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Bundle bundleD = kb5Var.d((String) obj, null);
            if (bundleD != null) {
                pw1 pw1Var = (pw1) this.O.y.get(((rx1) bundleD.getParcelable("state")).t);
                if (pw1Var != null) {
                    if (N(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pw1Var);
                    }
                    tx1Var = new tx1(jiVar, kb5Var, pw1Var, bundleD);
                    bundle2 = bundleD;
                } else {
                    i2 = 2;
                    bundle2 = bundleD;
                    tx1Var = new tx1(this.i, this.r, this.f.k.getClassLoader(), K(), bundleD);
                }
                pw1 pw1Var2 = tx1Var.r;
                pw1Var2.t = bundle2;
                pw1Var2.A = this;
                if (N(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + pw1Var2.q + "): " + pw1Var2);
                }
                tx1Var.w(this.f.k.getClassLoader());
                kb5Var.o(tx1Var);
                tx1Var.v = this.o;
            }
        }
        nx1 nx1Var = this.O;
        nx1Var.getClass();
        ArrayList arrayList2 = new ArrayList(nx1Var.y.values());
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            pw1 pw1Var3 = (pw1) obj2;
            if (map3.get(pw1Var3.q) == null) {
                if (N(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + pw1Var3 + " that was not found in the set of active Fragments " + lx1Var.j);
                }
                this.O.j(pw1Var3);
                pw1Var3.A = this;
                tx1 tx1Var2 = new tx1(jiVar, kb5Var, pw1Var3);
                tx1Var2.v = 1;
                tx1Var2.m();
                pw1Var3.u = true;
                tx1Var2.m();
            }
        }
        ArrayList arrayList3 = lx1Var.t;
        ((ArrayList) kb5Var.j).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                String str3 = (String) obj3;
                pw1 pw1VarI = kb5Var.i(str3);
                if (pw1VarI == null) {
                    l0.z(du4.i("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (N(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + pw1VarI);
                }
                kb5Var.r(pw1VarI);
            }
        }
        if (lx1Var.a != null) {
            this.n = new ArrayList(lx1Var.a.length);
            int i5 = 0;
            while (true) {
                gw[] gwVarArr = lx1Var.a;
                if (i5 >= gwVarArr.length) {
                    break;
                }
                fw fwVarR = gwVarArr[i5].r(this);
                if (N(2)) {
                    StringBuilder sbP = du4.p(i5, "restoreAllState: back stack #", " (index ");
                    sbP.append(fwVarR.u);
                    sbP.append("): ");
                    sbP.append(fwVarR);
                    Log.v("FragmentManager", sbP.toString());
                    PrintWriter printWriter = new PrintWriter(new hy2());
                    fwVarR.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.n.add(fwVarR);
                i5++;
            }
        } else {
            this.n = new ArrayList();
        }
        this.m.set(lx1Var.m);
        String str4 = lx1Var.q;
        if (str4 != null) {
            pw1 pw1VarI2 = kb5Var.i(str4);
            this.e = pw1VarI2;
            u(pw1VarI2);
        }
        ArrayList arrayList4 = lx1Var.w;
        if (arrayList4 != null) {
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                this.q.put((String) arrayList4.get(i6), (hw) lx1Var.c.get(i6));
            }
        }
        this.F = new ArrayDeque(lx1Var.i);
    }

    public final void c(boolean z) {
        if (z && this.f != null) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null) {
                pw1Var.M = true;
                if (z) {
                    pw1Var.C.c(true);
                }
            }
        }
    }

    public final Bundle c0() {
        int i;
        gw[] gwVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        H();
        k();
        A(true);
        this.H = true;
        this.O.l = true;
        kb5 kb5Var = this.r;
        kb5Var.getClass();
        HashMap map = (HashMap) kb5Var.t;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (tx1 tx1Var : map.values()) {
            if (tx1Var != null) {
                pw1 pw1Var = tx1Var.r;
                kb5Var.d(pw1Var.q, tx1Var.i());
                arrayList2.add(pw1Var.q);
                if (N(2)) {
                    Log.v("FragmentManager", "Saved state of " + pw1Var + ": " + pw1Var.t);
                }
            }
        }
        HashMap map2 = (HashMap) this.r.a;
        if (!map2.isEmpty()) {
            kb5 kb5Var2 = this.r;
            synchronized (((ArrayList) kb5Var2.j)) {
                try {
                    gwVarArr = null;
                    if (((ArrayList) kb5Var2.j).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) kb5Var2.j).size());
                        ArrayList arrayList3 = (ArrayList) kb5Var2.j;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            pw1 pw1Var2 = (pw1) obj;
                            arrayList.add(pw1Var2.q);
                            if (N(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + pw1Var2.q + "): " + pw1Var2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.n.size();
            if (size2 > 0) {
                gwVarArr = new gw[size2];
                for (i = 0; i < size2; i++) {
                    gwVarArr[i] = new gw((fw) this.n.get(i));
                    if (N(2)) {
                        StringBuilder sbP = du4.p(i, "saveAllState: adding back stack #", ": ");
                        sbP.append(this.n.get(i));
                        Log.v("FragmentManager", sbP.toString());
                    }
                }
            }
            lx1 lx1Var = new lx1();
            lx1Var.j = arrayList2;
            lx1Var.t = arrayList;
            lx1Var.a = gwVarArr;
            lx1Var.m = this.m.get();
            pw1 pw1Var3 = this.e;
            if (pw1Var3 != null) {
                lx1Var.q = pw1Var3.q;
            }
            lx1Var.w.addAll(this.q.keySet());
            lx1Var.c.addAll(this.q.values());
            lx1Var.i = new ArrayList(this.F);
            bundle.putParcelable("state", lx1Var);
            for (String str : this.w.keySet()) {
                bundle.putBundle(xi3.t("result_", str), (Bundle) this.w.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(xi3.t("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (N(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void d(hx1 hx1Var, boolean z) {
        if (!z) {
            if (this.f == null) {
                if (this.J) {
                    l0.z("FragmentManager has been destroyed");
                    return;
                } else {
                    l0.z("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (S()) {
                l0.z("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.g) {
            try {
                if (this.f == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.g.add(hx1Var);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0() {
        synchronized (this.g) {
            try {
                if (this.g.size() == 1) {
                    this.f.d.removeCallbacks(this.P);
                    this.f.d.post(this.P);
                    l0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z) {
        if (this.y) {
            l0.z("FragmentManager is already executing transactions");
            return;
        }
        if (this.f == null) {
            if (this.J) {
                l0.z("FragmentManager has been destroyed");
                return;
            } else {
                l0.z("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f.d.getLooper()) {
            l0.z("Must be called from main thread of fragment host");
            return;
        }
        if (!z && S()) {
            l0.z("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final void e0(pw1 pw1Var, boolean z) {
        ViewGroup viewGroupJ = J(pw1Var);
        if (viewGroupJ == null || !(viewGroupJ instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupJ).setDrawDisappearingViewsLast(!z);
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String str3 = str + "    ";
        kb5 kb5Var = this.r;
        ArrayList arrayList = (ArrayList) kb5Var.j;
        String str4 = str + "    ";
        HashMap map = (HashMap) kb5Var.t;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (tx1 tx1Var : map.values()) {
                printWriter.print(str);
                if (tx1Var != null) {
                    pw1 pw1Var = tx1Var.r;
                    printWriter.println(pw1Var);
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(pw1Var.E));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(pw1Var.F));
                    printWriter.print(" mTag=");
                    printWriter.println(pw1Var.G);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(pw1Var.j);
                    printWriter.print(" mWho=");
                    printWriter.print(pw1Var.q);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(pw1Var.e);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(pw1Var.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(pw1Var.u);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(pw1Var.h);
                    printWriter.print(" mInLayout=");
                    printWriter.println(pw1Var.o);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(pw1Var.H);
                    printWriter.print(" mDetached=");
                    printWriter.print(pw1Var.I);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(pw1Var.L);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(pw1Var.K);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(pw1Var.J);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(pw1Var.Q);
                    if (pw1Var.A != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(pw1Var.A);
                    }
                    if (pw1Var.B != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(pw1Var.B);
                    }
                    if (pw1Var.D != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(pw1Var.D);
                    }
                    if (pw1Var.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(pw1Var.w);
                    }
                    if (pw1Var.t != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(pw1Var.t);
                    }
                    if (pw1Var.a != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(pw1Var.a);
                    }
                    if (pw1Var.m != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(pw1Var.m);
                    }
                    Object objI = pw1Var.c;
                    if (objI == null) {
                        kx1 kx1Var = pw1Var.A;
                        objI = (kx1Var == null || (str2 = pw1Var.i) == null) ? null : kx1Var.r.i(str2);
                    }
                    if (objI != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objI);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(pw1Var.b);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    mw1 mw1Var = pw1Var.R;
                    printWriter.println(mw1Var == null ? false : mw1Var.g);
                    mw1 mw1Var2 = pw1Var.R;
                    if ((mw1Var2 == null ? 0 : mw1Var2.y) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        mw1 mw1Var3 = pw1Var.R;
                        printWriter.println(mw1Var3 == null ? 0 : mw1Var3.y);
                    }
                    mw1 mw1Var4 = pw1Var.R;
                    if ((mw1Var4 == null ? 0 : mw1Var4.r) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        mw1 mw1Var5 = pw1Var.R;
                        printWriter.println(mw1Var5 == null ? 0 : mw1Var5.r);
                    }
                    mw1 mw1Var6 = pw1Var.R;
                    if ((mw1Var6 == null ? 0 : mw1Var6.n) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        mw1 mw1Var7 = pw1Var.R;
                        printWriter.println(mw1Var7 == null ? 0 : mw1Var7.n);
                    }
                    mw1 mw1Var8 = pw1Var.R;
                    if ((mw1Var8 == null ? 0 : mw1Var8.v) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        mw1 mw1Var9 = pw1Var.R;
                        printWriter.println(mw1Var9 == null ? 0 : mw1Var9.v);
                    }
                    if (pw1Var.N != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(pw1Var.N);
                    }
                    if (pw1Var.O != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(pw1Var.O);
                    }
                    if (pw1Var.m() != null) {
                        vl5 vl5VarT = pw1Var.t();
                        mx1 mx1Var = gx2.r;
                        vl5VarT.getClass();
                        xx0 xx0Var = xx0.y;
                        xx0Var.getClass();
                        kb5 kb5Var2 = new kb5(vl5VarT, mx1Var, xx0Var);
                        tf0 tf0VarG = v54.g(gx2.class);
                        String strY = tf0VarG.y();
                        if (strY != null) {
                            nu4 nu4Var = ((gx2) kb5Var2.h(tf0VarG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY))).y;
                            if (nu4Var.v() > 0) {
                                printWriter.print(str4);
                                printWriter.println("Loaders:");
                                if (nu4Var.v() > 0) {
                                    fj.w(nu4Var.x(0));
                                    printWriter.print(str4);
                                    printWriter.print("  #");
                                    printWriter.print(nu4Var.r(0));
                                    printWriter.print(": ");
                                    throw null;
                                }
                            }
                        } else {
                            l0.u("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + pw1Var.C + ":");
                    pw1Var.C.f(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                pw1 pw1Var2 = (pw1) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(pw1Var2.toString());
            }
        }
        ArrayList arrayList2 = this.v;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                pw1 pw1Var3 = (pw1) this.v.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(pw1Var3.toString());
            }
        }
        int size3 = this.n.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                fw fwVar = (fw) this.n.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fwVar.toString());
                fwVar.l(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.m.get());
        synchronized (this.g) {
            try {
                int size4 = this.g.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (hx1) this.g.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.k);
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.d);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void f0(pw1 pw1Var, wt2 wt2Var) {
        if (pw1Var == this.r.i(pw1Var.q) && (pw1Var.B == null || pw1Var.A == this)) {
            pw1Var.W = wt2Var;
        } else {
            l0.w("Fragment ", pw1Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final tx1 g(pw1 pw1Var) {
        String str = pw1Var.V;
        if (str != null) {
            vx1.r(pw1Var, str);
        }
        if (N(2)) {
            Log.v("FragmentManager", "add: " + pw1Var);
        }
        tx1 tx1VarJ = j(pw1Var);
        pw1Var.A = this;
        kb5 kb5Var = this.r;
        kb5Var.o(tx1VarJ);
        if (!pw1Var.I) {
            kb5Var.r(pw1Var);
            pw1Var.u = false;
            if (pw1Var.O == null) {
                pw1Var.S = false;
            }
            if (O(pw1Var)) {
                this.G = true;
            }
        }
        return tx1VarJ;
    }

    public final void g0(pw1 pw1Var) {
        if (pw1Var != null) {
            if (pw1Var != this.r.i(pw1Var.q) || (pw1Var.B != null && pw1Var.A != this)) {
                l0.w("Fragment ", pw1Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        pw1 pw1Var2 = this.e;
        this.e = pw1Var;
        u(pw1Var2);
        u(this.e);
    }

    public final boolean h() {
        if (this.o < 1) {
            return false;
        }
        boolean z = false;
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null && Q(pw1Var)) {
                if (pw1Var.H ? false : pw1Var.C.h() | (pw1Var.K && pw1Var.L)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void h0(pw1 pw1Var) {
        ViewGroup viewGroupJ = J(pw1Var);
        if (viewGroupJ != null) {
            mw1 mw1Var = pw1Var.R;
            if ((mw1Var == null ? 0 : mw1Var.v) + (mw1Var == null ? 0 : mw1Var.n) + (mw1Var == null ? 0 : mw1Var.r) + (mw1Var == null ? 0 : mw1Var.y) > 0) {
                if (viewGroupJ.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupJ.setTag(R.id.visible_removing_fragment_view_tag, pw1Var);
                }
                pw1 pw1Var2 = (pw1) viewGroupJ.getTag(R.id.visible_removing_fragment_view_tag);
                mw1 mw1Var2 = pw1Var.R;
                boolean z = mw1Var2 != null ? mw1Var2.g : false;
                if (pw1Var2.R == null) {
                    return;
                }
                pw1Var2.v().g = z;
            }
        }
    }

    public final void i(boolean z) {
        if (z && this.f != null) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null && z) {
                pw1Var.C.i(true);
            }
        }
    }

    public final tx1 j(pw1 pw1Var) {
        String str = pw1Var.q;
        kb5 kb5Var = this.r;
        tx1 tx1Var = (tx1) ((HashMap) kb5Var.t).get(str);
        if (tx1Var != null) {
            return tx1Var;
        }
        tx1 tx1Var2 = new tx1(this.i, kb5Var, pw1Var);
        tx1Var2.w(this.f.k.getClassLoader());
        tx1Var2.v = this.o;
        return tx1Var2;
    }

    public final void j0() {
        ArrayList arrayListS = this.r.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            tx1 tx1Var = (tx1) obj;
            pw1 pw1Var = tx1Var.r;
            if (pw1Var.P) {
                if (this.y) {
                    this.K = true;
                } else {
                    pw1Var.P = false;
                    tx1Var.m();
                }
            }
        }
    }

    public final void k() {
        Iterator it = x().iterator();
        while (it.hasNext()) {
            ((r31) it.next()).j();
        }
    }

    public final void k0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new hy2());
        rw1 rw1Var = this.f;
        if (rw1Var == null) {
            try {
                f("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            rw1Var.A.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final HashSet l(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((fw) arrayList.get(i)).g;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                pw1 pw1Var = ((wx1) obj).y;
                if (pw1Var != null && (viewGroup = pw1Var.N) != null) {
                    hashSet.add(r31.t(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void l0() {
        synchronized (this.g) {
            try {
                if (!this.g.isEmpty()) {
                    this.a.x(true);
                    if (N(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.n.size() + (this.j != null ? 1 : 0) > 0 && R(this.d);
                if (N(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.a.x(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m() {
        if (this.o >= 1) {
            for (pw1 pw1Var : this.r.u()) {
                if (pw1Var != null) {
                    if (!pw1Var.H ? pw1Var.C.m() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        if (N(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.j);
        }
        fw fwVar = this.j;
        if (fwVar != null) {
            fwVar.p = false;
            fwVar.n();
            fw fwVar2 = this.j;
            j4 j4Var = new j4(this, (byte) 7);
            ArrayList arrayList = fwVar2.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                fwVar2.b = arrayList;
            }
            arrayList.add(j4Var);
            this.j.v(false, true);
            this.t = true;
            A(true);
            H();
            this.t = false;
            this.j = null;
        }
    }

    public final void o(int i) {
        try {
            this.y = true;
            for (tx1 tx1Var : ((HashMap) this.r.t).values()) {
                if (tx1Var != null) {
                    tx1Var.v = i;
                }
            }
            T(i, false);
            Iterator it = x().iterator();
            while (it.hasNext()) {
                ((r31) it.next()).j();
            }
            this.y = false;
            A(true);
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    public final void p() {
        if (this.o < 1) {
            return;
        }
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null && !pw1Var.H) {
                pw1Var.C.p();
            }
        }
    }

    public final boolean q(Menu menu, MenuInflater menuInflater) {
        boolean zQ;
        boolean z;
        if (this.o < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null && Q(pw1Var)) {
                if (pw1Var.H) {
                    zQ = false;
                } else {
                    if (pw1Var.K && pw1Var.L) {
                        pw1Var.A(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zQ = z | pw1Var.C.q(menu, menuInflater);
                }
                if (zQ) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pw1Var);
                    z2 = true;
                }
            }
        }
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                pw1 pw1Var2 = (pw1) this.v.get(i);
                if (arrayList == null || !arrayList.contains(pw1Var2)) {
                    pw1Var2.getClass();
                }
            }
        }
        this.v = arrayList;
        return z2;
    }

    public final void r(pw1 pw1Var) {
        if (N(2)) {
            Log.v("FragmentManager", "attach: " + pw1Var);
        }
        if (pw1Var.I) {
            pw1Var.I = false;
            if (pw1Var.p) {
                return;
            }
            this.r.r(pw1Var);
            if (N(2)) {
                Log.v("FragmentManager", "add from attach: " + pw1Var);
            }
            if (O(pw1Var)) {
                this.G = true;
            }
        }
    }

    public final boolean s() {
        if (this.o >= 1) {
            for (pw1 pw1Var : this.r.u()) {
                if (pw1Var != null) {
                    if (!pw1Var.H ? pw1Var.C.s() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void t(pw1 pw1Var) {
        if (N(2)) {
            Log.v("FragmentManager", "detach: " + pw1Var);
        }
        if (pw1Var.I) {
            return;
        }
        pw1Var.I = true;
        if (pw1Var.p) {
            if (N(2)) {
                Log.v("FragmentManager", "remove from detach: " + pw1Var);
            }
            kb5 kb5Var = this.r;
            synchronized (((ArrayList) kb5Var.j)) {
                ((ArrayList) kb5Var.j).remove(pw1Var);
            }
            pw1Var.p = false;
            if (O(pw1Var)) {
                this.G = true;
            }
            h0(pw1Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        pw1 pw1Var = this.d;
        if (pw1Var != null) {
            sb.append(pw1Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.d)));
            sb.append("}");
        } else {
            rw1 rw1Var = this.f;
            if (rw1Var != null) {
                sb.append(rw1Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(pw1 pw1Var) {
        if (pw1Var != null) {
            if (pw1Var != this.r.i(pw1Var.q)) {
                return;
            }
            pw1Var.A.getClass();
            boolean zR = R(pw1Var);
            Boolean bool = pw1Var.s;
            if (bool == null || bool.booleanValue() != zR) {
                pw1Var.s = Boolean.valueOf(zR);
                kx1 kx1Var = pw1Var.C;
                kx1Var.l0();
                kx1Var.u(kx1Var.e);
            }
        }
    }

    public final void v() {
        this.y = false;
        this.M.clear();
        this.L.clear();
    }

    public final void w() throws Exception {
        this.J = true;
        A(true);
        k();
        rw1 rw1Var = this.f;
        kb5 kb5Var = this.r;
        if (rw1Var != null ? ((nx1) kb5Var.m).x : true ^ rw1Var.k.isChangingConfigurations()) {
            Iterator it = this.q.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((hw) it.next()).j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((nx1) kb5Var.m).x((String) obj, false);
                }
            }
        }
        o(-1);
        rw1 rw1Var2 = this.f;
        if (rw1Var2 != null) {
            yk ykVar = rw1Var2.A;
            bx1 bx1Var = this.p;
            bx1Var.getClass();
            ykVar.p.remove(bx1Var);
        }
        rw1 rw1Var3 = this.f;
        if (rw1Var3 != null) {
            yk ykVar2 = rw1Var3.A;
            bx1 bx1Var2 = this.s;
            bx1Var2.getClass();
            ykVar2.s.remove(bx1Var2);
        }
        rw1 rw1Var4 = this.f;
        if (rw1Var4 != null) {
            yk ykVar3 = rw1Var4.A;
            bx1 bx1Var3 = this.u;
            bx1Var3.getClass();
            ykVar3.z.remove(bx1Var3);
        }
        rw1 rw1Var5 = this.f;
        if (rw1Var5 != null) {
            yk ykVar4 = rw1Var5.A;
            bx1 bx1Var4 = this.z;
            bx1Var4.getClass();
            ykVar4.h.remove(bx1Var4);
        }
        rw1 rw1Var6 = this.f;
        if (rw1Var6 != null && this.d == null) {
            yk ykVar5 = rw1Var6.A;
            dx1 dx1Var = this.h;
            dx1Var.getClass();
            ro roVar = ykVar5.a;
            ((CopyOnWriteArrayList) roVar.m).remove(dx1Var);
            fj.w(((HashMap) roVar.t).remove(dx1Var));
            ((Runnable) roVar.a).run();
        }
        this.f = null;
        this.k = null;
        this.d = null;
        if (this.l != null) {
            this.a.v();
            this.l = null;
        }
        b5 b5Var = this.C;
        if (b5Var != null) {
            b5Var.y();
            this.D.y();
            this.E.y();
        }
    }

    public final HashSet x() {
        r31 r31Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayListS = this.r.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            ViewGroup viewGroup = ((tx1) obj).r.N;
            if (viewGroup != null) {
                L().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof r31) {
                    r31Var = (r31) tag;
                } else {
                    r31Var = new r31(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, r31Var);
                }
                hashSet.add(r31Var);
            }
        }
        return hashSet;
    }

    public final void y(rw1 rw1Var, ue5 ue5Var, pw1 pw1Var) {
        nx1 nx1Var;
        if (this.f != null) {
            l0.z("Already attached");
            return;
        }
        this.f = rw1Var;
        this.k = ue5Var;
        this.d = pw1Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (pw1Var != null) {
            copyOnWriteArrayList.add(new fx1(pw1Var));
        } else if (rw1Var != null) {
            copyOnWriteArrayList.add(rw1Var);
        }
        if (this.d != null) {
            l0();
        }
        if (rw1Var != null) {
            tj3 tj3VarY = rw1Var.A.y();
            this.l = tj3VarY;
            tj3VarY.g(pw1Var != null ? pw1Var : rw1Var, this.a);
        }
        byte b = 0;
        if (pw1Var != null) {
            nx1 nx1Var2 = pw1Var.A.O;
            HashMap map = nx1Var2.r;
            nx1Var = (nx1) map.get(pw1Var.q);
            if (nx1Var == null) {
                nx1Var = new nx1(nx1Var2.v);
                map.put(pw1Var.q, nx1Var);
            }
            this.O = nx1Var;
        } else if (rw1Var != null) {
            vl5 vl5VarT = rw1Var.A.t();
            xx0 xx0Var = xx0.y;
            xx0Var.getClass();
            kb5 kb5Var = new kb5(vl5VarT, nx1.j, xx0Var);
            tf0 tf0VarG = v54.g(nx1.class);
            String strY = tf0VarG.y();
            if (strY == null) {
                l0.u("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                nx1Var = (nx1) kb5Var.h(tf0VarG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY));
                this.O = nx1Var;
            }
        } else {
            nx1Var = new nx1(false);
            this.O = nx1Var;
        }
        nx1Var.l = S();
        this.r.m = this.O;
        rw1 rw1Var2 = this.f;
        byte b2 = 3;
        if (rw1Var2 != null && pw1Var == null) {
            ji jiVarR = rw1Var2.r();
            jiVarR.T("android:support:fragments", new rl0(this, b2));
            Bundle bundleA = jiVarR.a("android:support:fragments");
            if (bundleA != null) {
                b0(bundleA);
            }
        }
        rw1 rw1Var3 = this.f;
        if (rw1Var3 != null) {
            wl0 wl0Var = rw1Var3.A.b;
            String strConcat = "FragmentManager:".concat(pw1Var != null ? du4.b(new StringBuilder(), pw1Var.q, ":") : "");
            this.C = wl0Var.n(strConcat.concat("StartActivityForResult"), new u4((byte) 2), new y22((Object) this, (byte) 18));
            this.D = wl0Var.n(strConcat.concat("StartIntentSenderForResult"), new u4(b2), new cx1(this, (byte) 1));
            this.E = wl0Var.n(strConcat.concat("RequestPermissions"), new u4(b), new cx1(this, b));
        }
        rw1 rw1Var4 = this.f;
        if (rw1Var4 != null) {
            yk ykVar = rw1Var4.A;
            bx1 bx1Var = this.s;
            bx1Var.getClass();
            ykVar.s.add(bx1Var);
        }
        rw1 rw1Var5 = this.f;
        if (rw1Var5 != null) {
            yk ykVar2 = rw1Var5.A;
            bx1 bx1Var2 = this.p;
            bx1Var2.getClass();
            ykVar2.p.add(bx1Var2);
        }
        rw1 rw1Var6 = this.f;
        if (rw1Var6 != null) {
            yk ykVar3 = rw1Var6.A;
            bx1 bx1Var3 = this.u;
            bx1Var3.getClass();
            ykVar3.z.add(bx1Var3);
        }
        rw1 rw1Var7 = this.f;
        if (rw1Var7 != null) {
            yk ykVar4 = rw1Var7.A;
            bx1 bx1Var4 = this.z;
            bx1Var4.getClass();
            ykVar4.h.add(bx1Var4);
        }
        rw1 rw1Var8 = this.f;
        if (rw1Var8 == null || pw1Var != null) {
            return;
        }
        yk ykVar5 = rw1Var8.A;
        dx1 dx1Var = this.h;
        dx1Var.getClass();
        ro roVar = ykVar5.a;
        ((CopyOnWriteArrayList) roVar.m).add(dx1Var);
        ((Runnable) roVar.a).run();
    }

    public final void z(boolean z) {
        if (z && this.f != null) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (pw1 pw1Var : this.r.u()) {
            if (pw1Var != null && z) {
                pw1Var.C.z(true);
            }
        }
    }
}
