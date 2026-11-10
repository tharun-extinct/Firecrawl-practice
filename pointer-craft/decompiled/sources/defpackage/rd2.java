package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rd2 extends ri0 implements Runnable, jj3, View.OnAttachStateChangeListener {
    public boolean a;
    public final st4 b;
    public final qp3 c;
    public final xa3 i;
    public int m;
    public tp5 q;
    public final hb3 w;

    public rd2() {
        super(1);
        hb3 hb3Var = new hb3(9);
        aq5.g.getClass();
        hb3Var.c(zp5.y, new qq5("caption bar"));
        hb3Var.c(zp5.r, new qq5("display cutout"));
        hb3Var.c(zp5.n, new qq5("ime"));
        hb3Var.c(zp5.v, new qq5("mandatory system gestures"));
        hb3Var.c(zp5.x, new qq5("navigation bars"));
        hb3Var.c(zp5.l, new qq5("status bars"));
        hb3Var.c(zp5.j, new qq5("system gestures"));
        hb3Var.c(zp5.t, new qq5("tappable element"));
        hb3Var.c(zp5.a, new qq5("waterfall"));
        this.w = hb3Var;
        this.c = new qp3(0);
        this.i = new xa3(4);
        this.b = new st4();
    }

    public final void H(tp5 tp5Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        ha3 ha3Var = cq5.g;
        int[] iArr2 = ha3Var.y;
        Object[] objArr3 = ha3Var.r;
        long[] jArr2 = ha3Var.g;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            aq5 aq5Var = (aq5) objArr3[i6];
                            nd2 nd2VarT = tp5Var.g.t(i7);
                            long j3 = (((long) nd2VarT.g) << 48) | (((long) nd2VarT.y) << 32) | (((long) nd2VarT.r) << 16) | ((long) nd2VarT.n);
                            Object objL = this.w.l(aq5Var);
                            objL.getClass();
                            qq5 qq5Var = (qq5) objL;
                            if (!xq2.m(j3, qq5Var.j)) {
                                qq5Var.j = j3;
                                z2 = true;
                                if (!xq2.m(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                nd2 nd2VarA = tp5Var.g.a(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) nd2VarA.y) << 32) | (((long) nd2VarA.g) << 48) | (((long) nd2VarA.r) << 16) | ((long) nd2VarA.n);
                                if (!xq2.m(qq5Var.t, j4)) {
                                    qq5Var.t = j4;
                                    z2 = true;
                                    if (!xq2.m(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            qq5Var.g.setValue(Boolean.valueOf(tp5Var.g.h(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        pa1 pa1VarJ = tp5Var.g.j();
        if (pa1VarJ == null) {
            j = 0;
        } else {
            nd2 nd2VarG = pa1VarJ.g();
            j = (((long) nd2VarG.g) << c3) | (((long) nd2VarG.y) << c2) | (((long) nd2VarG.r) << c) | ((long) nd2VarG.n);
        }
        hb3 hb3Var = this.w;
        aq5.g.getClass();
        Object objL2 = hb3Var.l(zp5.a);
        objL2.getClass();
        qq5 qq5Var2 = (qq5) objL2;
        qq5Var2.g.setValue(Boolean.valueOf(!xq2.m(j, 0L)));
        if (!xq2.m(qq5Var2.j, j)) {
            qq5Var2.j = j;
            qq5Var2.t = j;
            z2 = z;
            if (!xq2.m(j, 0L)) {
                z3 = z2;
            }
        }
        if (pa1VarJ == null) {
            xa3 xa3Var = this.i;
            if (xa3Var.y > 0) {
                xa3Var.n();
                this.b.clear();
                z2 = z;
            }
        } else {
            List listY = Build.VERSION.SDK_INT >= 28 ? oa1.y(pa1VarJ.g) : Collections.EMPTY_LIST;
            int size = listY.size();
            xa3 xa3Var2 = this.i;
            if (size < xa3Var2.y) {
                xa3Var2.w(listY.size(), this.i.y);
                this.b.k(listY.size(), this.b.size());
                z2 = z;
            } else {
                int size2 = listY.size() - this.i.y;
                int i8 = 0;
                while (i8 < size2) {
                    xa3 xa3Var3 = this.i;
                    xa3Var3.g(kq2.M(listY.get(xa3Var3.y)));
                    this.b.add(new tc2(xi3.j("display cutout rect ", this.i.y)));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listY.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listY.get(i9);
                ob3 ob3Var = (ob3) this.i.l(i9);
                if (!yf2.p(ob3Var.getValue(), rect)) {
                    ob3Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listY.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.c.d() != 0) && z2) {
            qp3 qp3Var = this.c;
            qp3Var.e(qp3Var.d() + 1);
            synchronized (it4.r) {
                ib3 ib3Var = it4.a.j;
                z4 = (ib3Var == null || ib3Var.j() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                it4.r();
            }
        }
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        tp5 tp5Var = this.q;
        boolean z = false;
        this.a = false;
        this.q = null;
        if (yo5Var.g.y() > 0 && tp5Var != null) {
            int iN = yo5Var.g.n();
            this.m |= iN;
            aq5 aq5Var = (aq5) cq5.g.y(iN);
            if (aq5Var != null) {
                Object objL = this.w.l(aq5Var);
                objL.getClass();
                qq5 qq5Var = (qq5) objL;
                nd2 nd2VarT = tp5Var.g.t(iN);
                long j = (((long) nd2VarT.g) << 48) | (((long) nd2VarT.y) << 32) | (((long) nd2VarT.r) << 16) | ((long) nd2VarT.n);
                long j2 = qq5Var.j;
                if (!xq2.m(j, j2)) {
                    qq5Var.a = j2;
                    qq5Var.m = j;
                    qq5Var.y.setValue(Boolean.TRUE);
                    xo5 xo5Var = yo5Var.g;
                    qq5Var.r.e(xo5Var.r());
                    qq5Var.v.e(xo5Var.g());
                    qq5Var.n.e(xo5Var.y());
                    qp3 qp3Var = this.c;
                    qp3Var.e(qp3Var.d() + 1);
                    synchronized (it4.r) {
                        ib3 ib3Var = it4.a.j;
                        if (ib3Var != null && ib3Var.j()) {
                            z = true;
                        }
                    }
                    if (z) {
                        it4.r();
                        return cd2Var;
                    }
                }
            }
        }
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yo5 yo5Var = (yo5) list.get(i);
            aq5 aq5Var = (aq5) cq5.g.y(yo5Var.g.n());
            if (aq5Var != null) {
                Object objL = this.w.l(aq5Var);
                objL.getClass();
                qq5 qq5Var = (qq5) objL;
                if (((Boolean) qq5Var.y.getValue()).booleanValue()) {
                    xo5 xo5Var = yo5Var.g;
                    qq5Var.r.e(xo5Var.r());
                    qq5Var.v.e(xo5Var.g());
                    qq5Var.n.e(xo5Var.y());
                }
            }
        }
        H(tp5Var);
        return tp5Var;
    }

    @Override // defpackage.ri0
    public final void l(yo5 yo5Var) {
        this.a = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = xk5.g;
        pk5.r(view, this);
        yo5.g(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = xk5.g;
        pk5.r(view, null);
        yo5.g(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.m = 0;
            this.a = false;
            tp5 tp5Var = this.q;
            if (tp5Var != null) {
                H(tp5Var);
                this.q = null;
            }
        }
    }

    @Override // defpackage.jj3
    public final tp5 t(View view, tp5 tp5Var) {
        if (this.a) {
            this.q = tp5Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return tp5Var;
            }
        } else if (this.m == 0) {
            H(tp5Var);
        }
        return tp5Var;
    }

    @Override // defpackage.ri0
    public final void x(yo5 yo5Var) {
        boolean z = false;
        this.a = false;
        int iN = yo5Var.g.n();
        this.m &= ~iN;
        this.q = null;
        aq5 aq5Var = (aq5) cq5.g.y(iN);
        if (aq5Var != null) {
            Object objL = this.w.l(aq5Var);
            objL.getClass();
            qq5 qq5Var = (qq5) objL;
            qq5Var.r.e(0.0f);
            qq5Var.v.e(1.0f);
            qq5Var.n.e(0L);
            qq5Var.r.e(0.0f);
            qq5Var.y.setValue(Boolean.FALSE);
            qq5Var.a = -1L;
            qq5Var.m = -1L;
            qp3 qp3Var = this.c;
            qp3Var.e(qp3Var.d() + 1);
            synchronized (it4.r) {
                ib3 ib3Var = it4.a.j;
                if (ib3Var != null && ib3Var.j()) {
                    z = true;
                }
            }
            if (z) {
                it4.r();
            }
        }
    }
}
