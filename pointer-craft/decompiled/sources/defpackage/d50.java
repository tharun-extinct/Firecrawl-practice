package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class d50 extends ya6 {
    public final /* synthetic */ bw0 n;
    public final /* synthetic */ byte r;

    public /* synthetic */ d50(bw0 bw0Var, byte b) {
        this.r = b;
        this.n = bw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    @Override // defpackage.ya6
    public final boolean c(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        byte b = this.r;
        bw0 bw0Var = this.n;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bw0Var;
                int i2 = bottomSheetBehavior.P;
                if (i2 != 1 && !bottomSheetBehavior.f0) {
                    if (i2 == 3 && bottomSheetBehavior.c0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.v) {
                            WeakReference weakReference3 = bottomSheetBehavior.e0;
                            if (weakReference3 != null) {
                                view2 = (View) weakReference3.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.Y;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.Y;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bw0Var;
                return (sideSheetBehavior.j == 1 || (weakReference2 = sideSheetBehavior.b) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // defpackage.ya6
    public final int g(View view, int i) {
        int iG;
        int i2;
        switch (this.r) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                et2 et2Var = sideSheetBehavior.g;
                switch (et2Var.g) {
                    case 0:
                        iG = -et2Var.y.q;
                        break;
                    default:
                        iG = et2Var.g();
                        break;
                }
                et2 et2Var2 = sideSheetBehavior.g;
                switch (et2Var2.g) {
                    case 0:
                        i2 = et2Var2.y.i;
                        break;
                    default:
                        i2 = et2Var2.y.w;
                        break;
                }
                return js2.l(i, iG, i2);
        }
    }

    @Override // defpackage.ya6
    public int j(View view) {
        switch (this.r) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                return sideSheetBehavior.q + sideSheetBehavior.i;
            default:
                return super.j(view);
        }
    }

    @Override // defpackage.ya6
    public final void m(int i) {
        byte b = this.r;
        bw0 bw0Var = this.n;
        switch (b) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bw0Var;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.F(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bw0Var;
                    if (sideSheetBehavior.l) {
                        sideSheetBehavior.p(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.ya6
    public final void q(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        byte b = this.r;
        bw0 bw0Var = this.n;
        switch (b) {
            case 0:
                ((BottomSheetBehavior) bw0Var).o(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bw0Var;
                WeakReference weakReference = sideSheetBehavior.s;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    et2 et2Var = sideSheetBehavior.g;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (et2Var.g) {
                        case 0:
                            if (left <= et2Var.y.w) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i3 = et2Var.y.w;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.h;
                if (!linkedHashSet.isEmpty()) {
                    et2 et2Var2 = sideSheetBehavior.g;
                    switch (et2Var2.g) {
                        case 0:
                            et2Var2.y();
                            et2Var2.g();
                            break;
                        default:
                            int i4 = et2Var2.y.w;
                            et2Var2.g();
                            break;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        uo1.B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ya6
    public int t() {
        switch (this.r) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.n;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b A[PHI: r2
  0x013b: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:106:0x01c5, B:98:0x01a6, B:90:0x0176, B:93:0x018c, B:75:0x0139, B:73:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    @Override // defpackage.ya6
    public final void w(View view, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        et2 et2Var;
        byte b = this.r;
        int i = 3;
        int i2 = 5;
        bw0 bw0Var = this.n;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bw0Var;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.y) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top > bottomSheetBehavior.F) {
                            i = 6;
                        }
                    }
                } else if (!bottomSheetBehavior.J || !bottomSheetBehavior.G(view, f2)) {
                    i2 = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (!bottomSheetBehavior.y) {
                            int i3 = bottomSheetBehavior.F;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                                }
                            } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.H)) {
                                i = i2;
                            }
                            i = 6;
                        } else if (Math.abs(top2 - bottomSheetBehavior.E) >= Math.abs(top2 - bottomSheetBehavior.H)) {
                            i = i2;
                        }
                    } else {
                        if (!bottomSheetBehavior.y) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                                i = 6;
                            }
                        }
                        i = i2;
                    }
                } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.n) {
                    if (view.getTop() > (bottomSheetBehavior.d() + bottomSheetBehavior.X) / 2) {
                        i = i2;
                    } else if (!bottomSheetBehavior.y && Math.abs(view.getTop() - bottomSheetBehavior.d()) >= Math.abs(view.getTop() - bottomSheetBehavior.F)) {
                        i = 6;
                    }
                } else {
                    i = i2;
                }
                bottomSheetBehavior.H(view, i, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bw0Var;
                boolean z4 = false;
                switch (sideSheetBehavior.g.g) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (!z) {
                    et2 et2Var2 = sideSheetBehavior.g;
                    switch (et2Var2.g) {
                        case 0:
                            if (Math.abs((et2Var2.y.m * f) + view.getLeft()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            if (Math.abs((et2Var2.y.m * f) + view.getRight()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.g.g) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                }
                                if (z3) {
                                    et2Var = sideSheetBehavior.g;
                                    switch (et2Var.g) {
                                        case 0:
                                            if (view.getRight() < (et2Var.g() - et2Var.y()) / 2) {
                                                z4 = true;
                                            }
                                            break;
                                        default:
                                            if (view.getLeft() > (et2Var.g() + et2Var.y.w) / 2) {
                                                z4 = true;
                                            }
                                            break;
                                    }
                                    if (z4) {
                                        i = 5;
                                    }
                                } else {
                                    i = 5;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                }
                                if (z3) {
                                    i = 5;
                                } else {
                                    et2Var = sideSheetBehavior.g;
                                    switch (et2Var.g) {
                                        case 0:
                                            if (view.getRight() < (et2Var.g() - et2Var.y()) / 2) {
                                                z4 = true;
                                            }
                                            break;
                                        default:
                                            if (view.getLeft() > (et2Var.g() + et2Var.y.w) / 2) {
                                                z4 = true;
                                            }
                                            break;
                                    }
                                    if (z4) {
                                        i = 5;
                                    }
                                }
                                break;
                        }
                        z3 = false;
                        if (z3) {
                            et2Var = sideSheetBehavior.g;
                            switch (et2Var.g) {
                                case 0:
                                    if (view.getRight() < (et2Var.g() - et2Var.y()) / 2) {
                                        z4 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() > (et2Var.g() + et2Var.y.w) / 2) {
                                        z4 = true;
                                    }
                                    break;
                            }
                            if (z4) {
                                i = 5;
                            }
                        } else {
                            i = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.g.g()) >= Math.abs(left - sideSheetBehavior.g.y())) {
                            i = 5;
                        }
                    } else {
                        i = 5;
                    }
                }
                sideSheetBehavior.z(view, i, true);
                break;
        }
    }

    @Override // defpackage.ya6
    public final int y(View view, int i) {
        switch (this.r) {
            case 0:
                return js2.l(i, ((BottomSheetBehavior) this.n).d(), t());
            default:
                return view.getTop();
        }
    }
}
