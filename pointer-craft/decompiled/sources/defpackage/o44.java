package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class o44 implements r91 {
    public final /* synthetic */ RecyclerView j;

    public /* synthetic */ o44(RecyclerView recyclerView) {
        this.j = recyclerView;
    }

    public void g(o5 o5Var) {
        byte b = o5Var.g;
        RecyclerView recyclerView = this.j;
        if (b == 1) {
            recyclerView.h.j0(o5Var.y, o5Var.n);
            return;
        }
        if (b == 2) {
            recyclerView.h.m0(o5Var.y, o5Var.n);
        } else if (b == 4) {
            recyclerView.h.o0(recyclerView, o5Var.y, o5Var.n);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.h.l0(o5Var.y, o5Var.n);
        }
    }

    @Override // defpackage.r91
    public boolean j(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.j;
        if (recyclerView.h.b()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.h.i()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.s0();
        return recyclerView.K(i, i2, 0, Integer.MAX_VALUE);
    }

    public void n(int i, int i2) {
        RecyclerView recyclerView = this.j;
        int iJ = recyclerView.w.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            n54 n54VarO = RecyclerView.O(recyclerView.w.l(i3));
            if (n54VarO != null && !n54VarO.s() && n54VarO.r >= i) {
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + n54VarO + " now at position " + (n54VarO.r + i2));
                }
                n54VarO.c(i2, false);
                recyclerView.o0.x = true;
            }
        }
        ArrayList arrayList = recyclerView.a.r;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n54 n54Var = (n54) arrayList.get(i4);
            if (n54Var != null && n54Var.r >= i) {
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + n54Var + " now at position " + (n54Var.r + i2));
                }
                n54Var.c(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.r0 = true;
    }

    @Override // defpackage.r91
    public float q() {
        float f;
        RecyclerView recyclerView = this.j;
        if (recyclerView.h.b()) {
            f = recyclerView.j0;
        } else {
            if (!recyclerView.h.i()) {
                return 0.0f;
            }
            f = recyclerView.i0;
        }
        return -f;
    }

    public void r(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.j;
        int iJ = recyclerView.w.j();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewL = recyclerView.w.l(i6);
            n54 n54VarO = RecyclerView.O(viewL);
            if (n54VarO != null && !n54VarO.s() && (i4 = n54VarO.r) >= i && i4 < i5) {
                n54VarO.g(2);
                if (obj == null) {
                    n54VarO.g(1024);
                } else if ((1024 & n54VarO.a) == 0) {
                    if (n54VarO.m == null) {
                        ArrayList arrayList = new ArrayList();
                        n54VarO.m = arrayList;
                        n54VarO.q = Collections.unmodifiableList(arrayList);
                    }
                    n54VarO.m.add(obj);
                }
                ((y44) viewL.getLayoutParams()).a = true;
            }
        }
        e54 e54Var = recyclerView.a;
        ArrayList arrayList2 = e54Var.r;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            n54 n54Var = (n54) arrayList2.get(size);
            if (n54Var != null && (i3 = n54Var.r) >= i && i3 < i5) {
                n54Var.g(2);
                e54Var.j(size);
            }
        }
        recyclerView.s0 = true;
    }

    public void v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.j;
        int iJ = recyclerView.w.j();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iJ; i11++) {
            n54 n54VarO = RecyclerView.O(recyclerView.w.l(i11));
            if (n54VarO != null && (i9 = n54VarO.r) >= i4 && i9 <= i3) {
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + n54VarO);
                }
                if (n54VarO.r == i) {
                    n54VarO.c(i2 - i, false);
                } else {
                    n54VarO.c(i5, false);
                }
                recyclerView.o0.x = true;
            }
        }
        ArrayList arrayList = recyclerView.a.r;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n54 n54Var = (n54) arrayList.get(i12);
            if (n54Var != null && (i8 = n54Var.r) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    n54Var.c(i2 - i, false);
                } else {
                    n54Var.c(i10, false);
                }
                if (RecyclerView.K0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + n54Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.r0 = true;
    }

    @Override // defpackage.r91
    public void w() {
        this.j.s0();
    }

    public n54 y(int i) {
        RecyclerView recyclerView = this.j;
        int iJ = recyclerView.w.j();
        n54 n54Var = null;
        for (int i2 = 0; i2 < iJ; i2++) {
            n54 n54VarO = RecyclerView.O(recyclerView.w.l(i2));
            if (n54VarO != null && !n54VarO.a() && n54VarO.r == i) {
                if (!recyclerView.w.r.contains(n54VarO.g)) {
                    n54Var = n54VarO;
                    break;
                }
                n54Var = n54VarO;
            }
        }
        if (n54Var != null) {
            if (!recyclerView.w.r.contains(n54Var.g)) {
                return n54Var;
            }
            if (RecyclerView.K0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }
}
