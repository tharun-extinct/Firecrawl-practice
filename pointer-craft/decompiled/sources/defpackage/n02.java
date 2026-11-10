package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n02 implements Runnable {
    public static final ThreadLocal q = new ThreadLocal();
    public static final fu1 w = new fu1((byte) 8);
    public long a;
    public final ArrayList j = new ArrayList();
    public final ArrayList m = new ArrayList();
    public long t;

    public static n54 r(RecyclerView recyclerView, int i, long j) {
        int iJ = recyclerView.w.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            n54 n54VarO = RecyclerView.O(recyclerView.w.l(i2));
            if (n54VarO.r == i && !n54VarO.j()) {
                return null;
            }
        }
        e54 e54Var = recyclerView.a;
        if (j == Long.MAX_VALUE) {
            try {
                if (ib5.g()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.X(false);
                Trace.endSection();
            }
        }
        recyclerView.W();
        n54 n54VarQ = e54Var.q(i, j);
        if (n54VarQ != null) {
            if (!n54VarQ.l() || n54VarQ.j()) {
                e54Var.g(n54VarQ, false);
            } else {
                e54Var.t(n54VarQ.g);
            }
        }
        return n54VarQ;
    }

    public final void g(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.e) {
            if (RecyclerView.J0 && !this.j.contains(recyclerView)) {
                l0.z("attempting to post unregistered view!");
                return;
            } else if (this.t == 0) {
                this.t = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        si0 si0Var = recyclerView.n0;
        si0Var.y = i;
        si0Var.r = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.j;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    y(TimeUnit.MILLISECONDS.toNanos(jMax) + this.a);
                }
            }
        } finally {
            this.t = 0L;
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void y(long j) {
        m02 m02Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        m02 m02Var2;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            si0 si0Var = recyclerView3.n0;
            if (windowVisibility == 0) {
                si0Var.r(recyclerView3, false);
                i += si0Var.n;
            }
        }
        ArrayList arrayList2 = this.m;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                si0 si0Var2 = recyclerView4.n0;
                int iAbs = Math.abs(si0Var2.r) + Math.abs(si0Var2.y);
                for (?? r11 = z; r11 < si0Var2.n * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        m02Var2 = new m02();
                        arrayList2.add(m02Var2);
                    } else {
                        m02Var2 = (m02) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) si0Var2.v;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    m02Var2.g = z;
                    m02Var2.y = iAbs;
                    m02Var2.r = i5;
                    m02Var2.n = recyclerView4;
                    m02Var2.v = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, w);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (m02Var = (m02) arrayList2.get(i6)).n) != null; i6++) {
            n54 n54VarR = r(recyclerView, m02Var.v, m02Var.g ? Long.MAX_VALUE : j);
            if (n54VarR != null && n54VarR.y != null && n54VarR.l() && !n54VarR.j() && (recyclerView2 = (RecyclerView) n54VarR.y.get()) != null) {
                if (recyclerView2.K && recyclerView2.w.j() != 0) {
                    e54 e54Var = recyclerView2.a;
                    v44 v44Var = recyclerView2.T;
                    if (v44Var != null) {
                        v44Var.v();
                    }
                    g gVar = recyclerView2.h;
                    if (gVar != null) {
                        gVar.w0(e54Var);
                        recyclerView2.h.x0(e54Var);
                    }
                    e54Var.g.clear();
                    e54Var.l();
                }
                si0 si0Var3 = recyclerView2.n0;
                si0Var3.r(recyclerView2, true);
                if (si0Var3.n != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        j54 j54Var = recyclerView2.o0;
                        p44 p44Var = recyclerView2.z;
                        j54Var.n = (byte) 1;
                        j54Var.v = p44Var.g();
                        j54Var.l = false;
                        j54Var.j = false;
                        j54Var.t = false;
                        for (int i7 = 0; i7 < si0Var3.n * 2; i7 += 2) {
                            r(recyclerView2, ((int[]) si0Var3.v)[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            m02Var.g = false;
            m02Var.y = 0;
            m02Var.r = 0;
            m02Var.n = null;
            m02Var.v = 0;
        }
    }
}
