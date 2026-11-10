package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class et4 implements iq1, kz4, wi {
    public final /* synthetic */ byte j;
    public Object t;

    public et4(j51 j51Var) {
        this.j = (byte) 2;
        float f = vu4.g;
        j jVar = new j();
        jVar.j = f;
        float fY = j51Var.y();
        float f2 = dq1.g;
        jVar.t = fY * 386.0878f * 160.0f * 0.84f;
        this.t = jVar;
    }

    public void g() {
        View view = (View) this.t;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.wi
    public gq1 get(int i) {
        switch (this.j) {
            case 4:
                return ((lq1[]) this.t)[i];
            default:
                return (gq1) this.t;
        }
    }

    @Override // defpackage.iq1
    public float j(float f, float f2) {
        j jVar = (j) this.t;
        float[] fArr = yb.g;
        float f3 = jVar.j;
        float f4 = jVar.t;
        double dG = yb.g(f2, f3 * f4);
        double d = dq1.g;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dG) * ((double) (f3 * f4))))) + f;
    }

    public void l(int i, Object obj, r96 r96Var) {
        u56 u56Var = (u56) this.t;
        v46 v46Var = (v46) obj;
        u56Var.t(i, 2);
        u56Var.m(v46Var.r(r96Var));
        r96Var.r(v46Var, this);
    }

    @Override // defpackage.iq1
    public float m(float f, long j) {
        return ((j) this.t).g(f).y(j / 1000000);
    }

    public void n() {
        View viewFindViewById;
        View view = (View) this.t;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new zt4(viewFindViewById, (byte) 0));
    }

    @Override // defpackage.iq1
    public float q(float f, float f2, long j) {
        return ((j) this.t).g(f2).g(j / 1000000) + f;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[LOOP:0: B:22:0x004b->B:32:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0083 A[EDGE_INSN: B:51:0x0083->B:33:0x0083 BREAK  A[LOOP:0: B:22:0x004b->B:32:0x0080], SYNTHETIC] */
    public Object r(yc0 yc0Var, my1 my1Var) {
        zp4 zp4Var;
        wj4 wj4Var;
        if (((g90) this.t) == null) {
            aw3.y("Called runAndWatch on a manager that has been disposed of");
        }
        g90 g90Var = (g90) this.t;
        if ((g90Var instanceof zp4) && (wj4Var = (zp4Var = (zp4) g90Var).x) != null && !wj4Var.equals(yc0Var)) {
            n93 n93Var = new n93();
            wj4 wj4Var2 = zp4Var.x;
            if (wj4Var2 == null) {
                aw3.y("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            ib3 ib3Var = zp4Var.n;
            if (ib3Var != null) {
                Object[] objArr = ib3Var.y;
                long[] jArr = ib3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    n93Var.u(wj4Var2, objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = zp4Var.y;
                obj.getClass();
                n93Var.u(wj4Var2, obj);
            }
            n93Var.y();
            zp4Var.r();
            this.t = n93Var;
        }
        g90 g90Var2 = (g90) this.t;
        g90Var2.getClass();
        at4 at4VarH = it4.j().h(g90Var2.l(yc0Var));
        g90Var2.g(yc0Var);
        try {
            at4 at4VarA = at4VarH.a();
            try {
                Object objG = my1Var.g();
                at4.s(at4VarA);
                at4VarH.r();
                g90Var2.y();
                return objG;
            } catch (Throwable th) {
                at4.s(at4VarA);
                throw th;
            }
        } catch (Throwable th2) {
            at4VarH.r();
            throw th2;
        }
    }

    @Override // defpackage.kz4
    public void t(jz4 jz4Var) {
        oz4 oz4Var = (oz4) this.t;
        int length = oz4Var.m.length;
        for (int i = 1; i < length; i++) {
            int i2 = oz4Var.m[i];
            if (i2 == 1) {
                jz4Var.n(i, oz4Var.q[i]);
            } else if (i2 == 2) {
                jz4Var.c(i, oz4Var.w[i]);
            } else if (i2 == 3) {
                String str = oz4Var.c[i];
                str.getClass();
                jz4Var.G(str, i);
            } else if (i2 == 4) {
                byte[] bArr = oz4Var.i[i];
                bArr.getClass();
                jz4Var.l(i, bArr);
            } else if (i2 == 5) {
                jz4Var.g(i);
            }
        }
    }

    @Override // defpackage.iq1
    public long v(float f) {
        j jVar = (j) this.t;
        float[] fArr = yb.g;
        return ((long) (Math.exp(yb.g(f, jVar.j * jVar.t) / (((double) dq1.g) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.iq1
    public float x() {
        return 0.0f;
    }

    @Override // defpackage.kz4
    public String y() {
        return ((oz4) this.t).t;
    }

    public /* synthetic */ et4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    public et4(u56 u56Var) {
        this.j = (byte) 7;
        Charset charset = m76.g;
        this.t = u56Var;
        u56Var.g = this;
    }

    public et4(gu2 gu2Var) {
        this.j = (byte) 6;
        gu2Var.getClass();
        this.t = new WeakReference(gu2Var);
    }

    public et4(float f, float f2, vi viVar) {
        this.j = (byte) 4;
        int iY = viVar.y();
        lq1[] lq1VarArr = new lq1[iY];
        for (int i = 0; i < iY; i++) {
            lq1VarArr[i] = new lq1(f, f2, viVar.g(i));
        }
        this.t = lq1VarArr;
    }
}
