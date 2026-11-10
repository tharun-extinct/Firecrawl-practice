package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq2 {
    public static ha2 g = null;
    public static final int l = 48;
    public static final int n = 10;
    public static final int r = 6;
    public static final int v = 5;
    public static final int x = 15;
    public static final int y = 9;

    public static final boolean A(int i, bc bcVar, cu1 cu1Var, k44 k44Var) {
        if (T(i, bcVar, cu1Var, k44Var)) {
            return true;
        }
        Boolean bool = (Boolean) ra.O(cu1Var, i, new dk0(((nt1) ((ba) k33.W(cu1Var)).getFocusOwner()).x(), cu1Var, k44Var, i, bcVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final wl5 B(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            wl5 wl5Var = tag instanceof wl5 ? (wl5) tag : null;
            if (wl5Var != null) {
                return wl5Var;
            }
            Object objS = sp2.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final float C(fx0 fx0Var) {
        w73 w73Var = (w73) fx0Var.h(d93.m);
        float F = w73Var != null ? w73Var.F() : 1.0f;
        if (F >= 0.0f) {
            return F;
        }
        cw3.y("negative scale factor");
        return F;
    }

    public static final float D(int i, float f) {
        float f2 = i;
        if (f2 >= 50.0f) {
            return du4.y(f, 1.0f, (f2 - 50.0f) / 50.0f, 1.0f);
        }
        float f3 = 1.0f / f;
        return ((f2 / 50.0f) * (1.0f - f3)) + f3;
    }

    public static final gb4 E(p33 p33Var) {
        Object objA = p33Var.a();
        if (objA instanceof gb4) {
            return (gb4) objA;
        }
        return null;
    }

    public static final long F(double d) {
        return O((float) d, 4294967296L);
    }

    public static final long G(int i) {
        return O(i, 4294967296L);
    }

    public static final float H(gb4 gb4Var) {
        if (gb4Var != null) {
            return gb4Var.g;
        }
        return 0.0f;
    }

    public static final boolean I(k44 k44Var, k44 k44Var2, k44 k44Var3, int i) {
        if (!J(i, k44Var, k44Var3)) {
            return false;
        }
        if (J(i, k44Var2, k44Var3) && !i(k44Var3, k44Var, k44Var2, i)) {
            return !i(k44Var3, k44Var2, k44Var, i) && K(i, k44Var3, k44Var) < K(i, k44Var3, k44Var2);
        }
        return true;
    }

    public static final boolean J(int i, k44 k44Var, k44 k44Var2) {
        if (i == 3) {
            float f = k44Var2.r;
            float f2 = k44Var2.g;
            float f3 = k44Var.r;
            return (f > f3 || f2 >= f3) && f2 > k44Var.g;
        }
        if (i == 4) {
            float f4 = k44Var2.g;
            float f5 = k44Var2.r;
            float f6 = k44Var.g;
            return (f4 < f6 || f5 <= f6) && f5 < k44Var.r;
        }
        if (i == 5) {
            float f7 = k44Var2.n;
            float f8 = k44Var2.y;
            float f9 = k44Var.n;
            return (f7 > f9 || f8 >= f9) && f8 > k44Var.y;
        }
        if (i != 6) {
            l0.z("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = k44Var2.y;
        float f11 = k44Var2.n;
        float f12 = k44Var.y;
        return (f10 < f12 || f11 <= f12) && f11 < k44Var.n;
    }

    public static final long K(int i, k44 k44Var, k44 k44Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = k44Var.g;
            f2 = k44Var2.r;
        } else if (i == 4) {
            f = k44Var2.g;
            f2 = k44Var.r;
        } else if (i == 5) {
            f = k44Var.y;
            f2 = k44Var2.n;
        } else {
            if (i != 6) {
                l0.z("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = k44Var2.y;
            f2 = k44Var.n;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = k44Var.y;
            f3 = ((k44Var.n - f7) / 2.0f) + f7;
            f4 = k44Var2.y;
            f5 = k44Var2.n;
        } else {
            if (i != 5 && i != 6) {
                l0.z("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = k44Var.g;
            f3 = ((k44Var.r - f8) / 2.0f) + f8;
            f4 = k44Var2.g;
            f5 = k44Var2.r;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean L(yl0 yl0Var) {
        aq2 vp5Var;
        if (yl0Var.isInMultiWindowMode()) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            return (yl0Var.getWindow().getDecorView().getSystemUiVisibility() & 2048) == 0;
        }
        Window window = yl0Var.getWindow();
        jy3 jy3Var = new jy3(yl0Var.getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            vp5Var = new xp5(window, jy3Var);
        } else if (i >= 30) {
            vp5Var = new wp5(window, jy3Var);
        } else {
            vp5Var = i >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        }
        return vp5Var.s() == 2;
    }

    public static tp3 M(Object obj) {
        return new tp3(obj, f73.w);
    }

    public static final void N(Context context) {
        context.getClass();
        try {
            Class.forName("android.app.StatusBarManager").getMethod("expandNotificationsPanel", null).invoke(context.getSystemService("statusbar"), null);
        } catch (Exception unused) {
        }
    }

    public static final long O(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        o85[] o85VarArr = n85.y;
        return jFloatToRawIntBits;
    }

    public static final xy1 P(xy1 xy1Var, h02 h02Var) {
        xy1Var.getClass();
        Context context = (Context) h02Var.a(sa.y);
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (objK == obj) {
            objK = k33.E(h02Var);
            h02Var.i0(objK);
        }
        ox0 ox0Var = (ox0) objK;
        u4 u4Var = new u4((byte) 2);
        Object objK2 = h02Var.K();
        if (objK2 == obj) {
            objK2 = new ue1(xy1Var, (byte) 3);
            h02Var.i0(objK2);
        }
        x03 x03VarL = ra.L(u4Var, (xy1) objK2, h02Var, 0);
        boolean zJ = h02Var.j(ox0Var) | h02Var.j(context) | h02Var.j(x03VarL);
        Object objK3 = h02Var.K();
        if (zJ || objK3 == obj) {
            objK3 = new cc2(ox0Var, context, x03VarL, xy1Var);
            h02Var.i0(objK3);
        }
        return (xy1) objK3;
    }

    public static final ob3 Q(Object obj, h02 h02Var) {
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = M(obj);
            h02Var.i0(objK);
        }
        ob3 ob3Var = (ob3) objK;
        ob3Var.setValue(obj);
        return ob3Var;
    }

    public static final my1 R(my1 my1Var, h02 h02Var) {
        my1Var.getClass();
        gu2 gu2Var = (gu2) h02Var.a(ix2.g);
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = new rp3(0L);
            h02Var.i0(objK);
        }
        rp3 rp3Var = (rp3) objK;
        boolean zJ = h02Var.j(gu2Var) | h02Var.x(my1Var);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == l76Var) {
            objK2 = new un(gu2Var, my1Var, rp3Var, (byte) 7);
            h02Var.i0(objK2);
        }
        return (my1) objK2;
    }

    public static final xy1 S(xy1 xy1Var, h02 h02Var) {
        xy1Var.getClass();
        gu2 gu2Var = (gu2) h02Var.a(ix2.g);
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = new rp3(0L);
            h02Var.i0(objK);
        }
        rp3 rp3Var = (rp3) objK;
        boolean zJ = h02Var.j(gu2Var) | h02Var.x(xy1Var);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == l76Var) {
            objK2 = new bc((Object) gu2Var, (Object) xy1Var, (Object) rp3Var, (byte) 5);
            h02Var.i0(objK2);
        }
        return (xy1) objK2;
    }

    public static final boolean T(int i, bc bcVar, cu1 cu1Var, k44 k44Var) {
        cu1 cu1VarD;
        rb3 rb3Var = new rb3(new cu1[16]);
        if (!cu1Var.j.h) {
            mc2.y("visitChildren called on an unattached node");
        }
        rb3 rb3Var2 = new rb3(new i73[16]);
        i73 i73Var = cu1Var.j;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 == null) {
            k33.o(rb3Var2, i73Var);
        } else {
            rb3Var2.y(i73Var2);
        }
        while (true) {
            int i2 = rb3Var2.a;
            if (i2 == 0) {
                break;
            }
            i73 i73VarQ = (i73) rb3Var2.w(i2 - 1);
            if ((i73VarQ.m & 1024) == 0) {
                k33.o(rb3Var2, i73VarQ);
            } else {
                while (i73VarQ != null) {
                    if ((i73VarQ.a & 1024) != 0) {
                        rb3 rb3Var3 = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ;
                                if (cu1Var2.h) {
                                    rb3Var.y(cu1Var2);
                                }
                            } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                int i3 = 0;
                                for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                    if ((i73Var3.a & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            i73VarQ = i73Var3;
                                        } else {
                                            if (rb3Var3 == null) {
                                                rb3Var3 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var3.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var3.y(i73Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var3);
                        }
                        break;
                    }
                    i73VarQ = i73VarQ.w;
                }
            }
        }
        while (rb3Var.a != 0 && (cu1VarD = d(rb3Var, k44Var, i)) != null) {
            if (cu1VarD.S0().g) {
                return ((Boolean) bcVar.a(cu1VarD)).booleanValue();
            }
            if (A(i, bcVar, cu1VarD, k44Var)) {
                return true;
            }
            rb3Var.q(cu1VarD);
        }
        return false;
    }

    public static final void U(Activity activity) {
        aq2 vp5Var;
        if (activity.isInMultiWindowMode()) {
            return;
        }
        Window window = activity.getWindow();
        jy3 jy3Var = new jy3(activity.getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            vp5Var = new xp5(window, jy3Var);
        } else if (i >= 30) {
            vp5Var = new wp5(window, jy3Var);
        } else {
            vp5Var = i >= 26 ? new vp5(window, jy3Var) : new up5(window, jy3Var);
        }
        vp5Var.G(2);
        vp5Var.p();
    }

    public static final void V(List list, ld ldVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        ld ldVar2 = ldVar;
        Path path = ldVar2.g;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        ldVar2.j();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        fr3 fr3Var = list2.isEmpty() ? nq3.r : (fr3) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i < size) {
            fr3 fr3Var2 = (fr3) list2.get(i);
            if (fr3Var2 instanceof nq3) {
                path.close();
                path = path;
                size = size;
                f11 = f11;
                i = i;
                fr3Var2 = fr3Var2;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (fr3Var2 instanceof zq3) {
                    zq3 zq3Var = (zq3) fr3Var2;
                    float f18 = zq3Var.r;
                    f14 += f18;
                    float f19 = zq3Var.n;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (fr3Var2 instanceof rq3) {
                    rq3 rq3Var = (rq3) fr3Var2;
                    float f20 = rq3Var.r;
                    float f21 = rq3Var.n;
                    path.moveTo(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (fr3Var2 instanceof yq3) {
                    yq3 yq3Var = (yq3) fr3Var2;
                    float f22 = yq3Var.n;
                    float f23 = yq3Var.r;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (fr3Var2 instanceof qq3) {
                    qq3 qq3Var = (qq3) fr3Var2;
                    float f24 = qq3Var.n;
                    float f25 = qq3Var.r;
                    ldVar2.v(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (fr3Var2 instanceof xq3) {
                    float f26 = ((xq3) fr3Var2).r;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (fr3Var2 instanceof pq3) {
                    float f27 = ((pq3) fr3Var2).r;
                    ldVar2.v(f27, f15);
                    f14 = f27;
                } else if (fr3Var2 instanceof dr3) {
                    float f28 = ((dr3) fr3Var2).r;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (fr3Var2 instanceof er3) {
                    float f29 = ((er3) fr3Var2).r;
                    ldVar2.v(f14, f29);
                    f15 = f29;
                } else {
                    if (fr3Var2 instanceof wq3) {
                        wq3 wq3Var = (wq3) fr3Var2;
                        path.rCubicTo(wq3Var.r, wq3Var.n, wq3Var.v, wq3Var.x, wq3Var.l, wq3Var.j);
                        f3 = wq3Var.v + f14;
                        f4 = wq3Var.x + f15;
                        f14 += wq3Var.l;
                        f10 = wq3Var.j;
                    } else {
                        if (fr3Var2 instanceof oq3) {
                            oq3 oq3Var = (oq3) fr3Var2;
                            path.cubicTo(oq3Var.r, oq3Var.n, oq3Var.v, oq3Var.x, oq3Var.l, oq3Var.j);
                            f3 = oq3Var.v;
                            f5 = oq3Var.x;
                            f6 = oq3Var.l;
                            f7 = oq3Var.j;
                        } else if (fr3Var2 instanceof br3) {
                            if (fr3Var.g) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            br3 br3Var = (br3) fr3Var2;
                            path.rCubicTo(f8, f9, br3Var.r, br3Var.n, br3Var.v, br3Var.x);
                            f3 = br3Var.r + f14;
                            f4 = br3Var.n + f15;
                            f14 += br3Var.v;
                            f10 = br3Var.x;
                        } else if (fr3Var2 instanceof tq3) {
                            if (fr3Var.g) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            tq3 tq3Var = (tq3) fr3Var2;
                            path.cubicTo(f14, f15, tq3Var.r, tq3Var.n, tq3Var.v, tq3Var.x);
                            f3 = tq3Var.r;
                            f5 = tq3Var.n;
                            f6 = tq3Var.v;
                            f7 = tq3Var.x;
                        } else if (fr3Var2 instanceof ar3) {
                            ar3 ar3Var = (ar3) fr3Var2;
                            float f30 = ar3Var.x;
                            float f31 = ar3Var.v;
                            float f32 = ar3Var.n;
                            float f33 = ar3Var.r;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (fr3Var2 instanceof sq3) {
                            sq3 sq3Var = (sq3) fr3Var2;
                            float f36 = sq3Var.x;
                            float f37 = sq3Var.v;
                            float f38 = sq3Var.n;
                            f3 = sq3Var.r;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (fr3Var2 instanceof cr3) {
                            if (fr3Var.y) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            cr3 cr3Var = (cr3) fr3Var2;
                            float f39 = cr3Var.n;
                            float f40 = cr3Var.r;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (fr3Var2 instanceof uq3) {
                            if (fr3Var.y) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            uq3 uq3Var = (uq3) fr3Var2;
                            float f41 = uq3Var.n;
                            float f42 = uq3Var.r;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            f13 = f15;
                            fr3Var2 = fr3Var2;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (fr3Var2 instanceof vq3) {
                            vq3 vq3Var = (vq3) fr3Var2;
                            float f43 = vq3Var.j + f14;
                            float f44 = vq3Var.t + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i = i;
                            f(ldVar, f14, f15, f43, f44, vq3Var.r, vq3Var.n, vq3Var.v, vq3Var.x, vq3Var.l);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            fr3Var2 = fr3Var2;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            if (!(fr3Var2 instanceof mq3)) {
                                uo1.g();
                                return;
                            }
                            mq3 mq3Var = (mq3) fr3Var2;
                            float f45 = mq3Var.t;
                            float f46 = mq3Var.j;
                            fr3Var2 = fr3Var2;
                            f(ldVar, f14, f15, f46, f45, mq3Var.r, mq3Var.n, mq3Var.v, mq3Var.x, mq3Var.l);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                fr3Var2 = fr3Var2;
            }
            i++;
            list2 = list;
            ldVar2 = ldVar;
            size = size;
            path = path;
            fr3Var = fr3Var2;
            f11 = f11;
        }
    }

    public static final void W(Context context) {
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(1, 0);
        }
    }

    public static final Boolean X(int i, bc bcVar, cu1 cu1Var, k44 k44Var) {
        int iOrdinal = cu1Var.V0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cu1 cu1VarK = og0.k(cu1Var);
                if (cu1VarK == null) {
                    l0.z("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = cu1VarK.V0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolX = X(i, bcVar, cu1VarK, k44Var);
                        if (!yf2.p(boolX, Boolean.FALSE)) {
                            return boolX;
                        }
                        if (k44Var == null) {
                            if (cu1VarK.V0() != xt1.t) {
                                l0.z("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            cu1 cu1VarH = og0.h(cu1VarK);
                            if (cu1VarH == null) {
                                l0.z("ActiveParent must have a focusedChild");
                                return null;
                            }
                            k44Var = og0.o(cu1VarH);
                        }
                        return Boolean.valueOf(A(i, bcVar, cu1Var, k44Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            uo1.g();
                            return null;
                        }
                        l0.z("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (k44Var == null) {
                    k44Var = og0.o(cu1VarK);
                }
                return Boolean.valueOf(A(i, bcVar, cu1Var, k44Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    uo1.g();
                    return null;
                }
                if (cu1Var.S0().g) {
                    return (Boolean) bcVar.a(cu1Var);
                }
                return k44Var == null ? Boolean.valueOf(e(cu1Var, i, bcVar)) : Boolean.valueOf(T(i, bcVar, cu1Var, k44Var));
            }
        }
        return Boolean.valueOf(e(cu1Var, i, bcVar));
    }

    public static final void Y(ni niVar, pi piVar) {
        piVar.t.setValue(niVar.v.getValue());
        vi viVar = piVar.a;
        vi viVar2 = niVar.x;
        int iY = viVar.y();
        for (int i = 0; i < iY; i++) {
            viVar.v(i, viVar2.g(i));
        }
        piVar.q = niVar.j;
        piVar.m = niVar.l;
        piVar.w = ((Boolean) niVar.t.getValue()).booleanValue();
    }

    public static final void Z(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011e A[Catch: CancellationException -> 0x0189, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0189, blocks: (B:50:0x0109, B:52:0x011e), top: B:91:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0152 A[Catch: CancellationException -> 0x003e, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:56:0x0142, B:58:0x0152, B:60:0x015c, B:61:0x0169, B:62:0x016e, B:63:0x016f), top: B:89:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015c A[Catch: CancellationException -> 0x003e, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:56:0x0142, B:58:0x0152, B:60:0x015c, B:61:0x0169, B:62:0x016e, B:63:0x016f), top: B:89:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0169 A[Catch: CancellationException -> 0x003e, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:56:0x0142, B:58:0x0152, B:60:0x015c, B:61:0x0169, B:62:0x016e, B:63:0x016f), top: B:89:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016f A[Catch: CancellationException -> 0x003e, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:56:0x0142, B:58:0x0152, B:60:0x015c, B:61:0x0169, B:62:0x016e, B:63:0x016f), top: B:89:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object a(defpackage.pi r24, defpackage.fi r25, long r26, final defpackage.xy1 r28, defpackage.ou0 r29) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq2.a(pi, fi, long, xy1, ou0):java.lang.Object");
    }

    public static /* synthetic */ boolean a0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, wh6 wh6Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(wh6Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(wh6Var) != obj && atomicReferenceFieldUpdater.get(wh6Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(int i, k44 k44Var, k44 k44Var2) {
        if (i == 3 || i == 4) {
            return k44Var.n > k44Var2.y && k44Var.y < k44Var2.n;
        }
        if (i == 5 || i == 6) {
            return k44Var.r > k44Var2.g && k44Var.g < k44Var2.r;
        }
        l0.z("This function should only be used for 2-D focus search");
        return false;
    }

    public static /* synthetic */ Object c(pi piVar, Float f, zu4 zu4Var, boolean z, xy1 xy1Var, ou0 ou0Var, int i) {
        if ((i & 2) != 0) {
            zu4Var = m50.b0(0.0f, 0.0f, null, 7);
        }
        zu4 zu4Var2 = zu4Var;
        if ((i & 8) != 0) {
            xy1Var = new vy3((byte) 15);
        }
        return w(piVar, f, zu4Var2, z, xy1Var, ou0Var);
    }

    public static final cu1 d(rb3 rb3Var, k44 k44Var, int i) {
        k44 k44VarJ;
        cu1 cu1Var = null;
        if (i == 3) {
            k44VarJ = k44Var.j((k44Var.r - k44Var.g) + 1.0f, 0.0f);
        } else if (i == 4) {
            k44VarJ = k44Var.j(-((k44Var.r - k44Var.g) + 1.0f), 0.0f);
        } else if (i == 5) {
            k44VarJ = k44Var.j(0.0f, (k44Var.n - k44Var.y) + 1.0f);
        } else {
            if (i != 6) {
                l0.z("This function should only be used for 2-D focus search");
                return null;
            }
            k44VarJ = k44Var.j(0.0f, -((k44Var.n - k44Var.y) + 1.0f));
        }
        Object[] objArr = rb3Var.j;
        int i2 = rb3Var.a;
        for (int i3 = 0; i3 < i2; i3++) {
            cu1 cu1Var2 = (cu1) objArr[i3];
            if (og0.C(cu1Var2)) {
                k44 k44VarO = og0.o(cu1Var2);
                if (I(k44VarO, k44VarJ, k44Var, i)) {
                    cu1Var = cu1Var2;
                    k44VarJ = k44VarO;
                }
            }
        }
        return cu1Var;
    }

    public static final boolean e(cu1 cu1Var, int i, xy1 xy1Var) {
        k44 k44Var;
        rb3 rb3Var = new rb3(new cu1[16]);
        u(cu1Var, rb3Var);
        int i2 = rb3Var.a;
        if (i2 <= 1) {
            cu1 cu1Var2 = (cu1) (i2 == 0 ? null : rb3Var.j[0]);
            if (cu1Var2 != null) {
                return ((Boolean) xy1Var.a(cu1Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                k44 k44VarO = og0.o(cu1Var);
                float f = k44VarO.g;
                float f2 = k44VarO.y;
                k44Var = new k44(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    l0.z("This function should only be used for 2-D focus search");
                    return false;
                }
                k44 k44VarO2 = og0.o(cu1Var);
                float f3 = k44VarO2.r;
                float f4 = k44VarO2.n;
                k44Var = new k44(f3, f4, f3, f4);
            }
            cu1 cu1VarD = d(rb3Var, k44Var, i);
            if (cu1VarD != null) {
                return ((Boolean) xy1Var.a(cu1VarD)).booleanValue();
            }
        }
        return false;
    }

    public static final void f(ld ldVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            f(ldVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            ldVar.g.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    public static final void g(int i, final long j, bz1 bz1Var, h02 h02Var, pq4 pq4Var) {
        ?? K;
        ?? K2;
        h02 h02Var2 = h02Var;
        pq4 pq4Var2 = pq4Var;
        h02Var2.Z(361732211);
        int i2 = i | (h02Var.x(pq4Var) ? 4 : 2) | (h02Var2.v(j) ? 32 : 16) | (h02Var2.j(bz1Var) ? 256 : 128);
        if ((i2 & 147) == 146 && h02Var2.e()) {
            h02Var2.Q();
        } else {
            if (pq4Var2 instanceof oq4) {
                K2 = pw5.k(new yb1(j));
            } else {
                if (!(pq4Var2 instanceof nq4)) {
                    uo1.g();
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    h02Var2.X(291633998);
                    Bundle bundle = (Bundle) h02Var2.a(fp0.g());
                    boolean z = (i2 & 112) == 32;
                    Object objK = h02Var2.K();
                    if (z || objK == oo0.g) {
                        objK = new my1() { // from class: hq4
                            @Override // defpackage.my1
                            public final Object g() {
                                return new yb1(j);
                            }
                        };
                        h02Var2.i0(objK);
                    }
                    my1 my1Var = (my1) objK;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        K = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? pw5.k(my1Var.g()) : pw5.d(new yb1(k33.m(i5, i4)), new yb1(k33.m(i6, i3)));
                    } else {
                        K = new ArrayList(dj0.Y(parcelableArrayList, 10));
                        int size = parcelableArrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = parcelableArrayList.get(i7);
                            i7++;
                            SizeF sizeF = (SizeF) obj;
                            K.add(new yb1(k33.m(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    h02Var2.b(false);
                    K2 = K;
                } else {
                    h02Var2.X(291738344);
                    Bundle bundle2 = (Bundle) h02Var2.a(fp0.g());
                    int i8 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i9 = bundle2.getInt("appWidgetMaxWidth", 0);
                    yb1 yb1Var = null;
                    yb1 yb1Var2 = (i8 == 0 || i9 == 0) ? null : new yb1(k33.m(i9, i8));
                    int i10 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i11 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i10 != 0 && i11 != 0) {
                        yb1Var = new yb1(k33.m(i11, i10));
                    }
                    ArrayList arrayListW = pr.W(new yb1[]{yb1Var2, yb1Var});
                    boolean zIsEmpty = arrayListW.isEmpty();
                    List listK = arrayListW;
                    if (zIsEmpty) {
                        listK = pw5.k(new yb1(j));
                    }
                    h02Var2.b(false);
                    K2 = listK;
                }
            }
            List listF0 = cj0.F0(cj0.I0(K2));
            ArrayList arrayList = new ArrayList(dj0.Y(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                l(((i2 << 3) & 112) | (i2 & 896), ((yb1) it.next()).g, bz1Var, h02Var2, pq4Var2);
                arrayList.add(og5.g);
                h02Var2 = h02Var;
                pq4Var2 = pq4Var;
            }
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new iq4(i, j, bz1Var, pq4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(Context context, String str, ou0 ou0Var) {
        ki5 ki5Var;
        String strD0;
        int length;
        String str2;
        Context context2;
        String str3;
        if (ou0Var instanceof ki5) {
            ki5Var = (ki5) ou0Var;
            int i = ki5Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                ki5Var.s = i - Integer.MIN_VALUE;
            } else {
                ki5Var = new ki5(ou0Var);
            }
        } else {
            ki5Var = new ki5(ou0Var);
        }
        Object obj = ki5Var.b;
        int i2 = ki5Var.s;
        byte b = 1;
        String str4 = null;
        if (i2 == 0) {
            js2.o(obj);
            PackageManager packageManager = context.getPackageManager();
            Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
            strD0 = signatureArr != null ? pr.d0(signatureArr, new m75((byte) 3), 31) : null;
            String installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            length = installerPackageName != null ? installerPackageName.length() : 0;
            String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
            string.getClass();
            String str5 = (String) cj0.l0(tx4.h0(string, new String[]{"/"}));
            dg0 dg0Var = new dg0(((ow3) q03.g(context)).g.y(), b);
            ki5Var.m = context;
            ki5Var.q = str;
            ki5Var.w = strD0;
            ki5Var.c = str5;
            ki5Var.i = length;
            ki5Var.s = 1;
            Object objM = ue5.M(dg0Var, ki5Var);
            px0 px0Var = px0.j;
            if (objM == px0Var) {
                return px0Var;
            }
            str2 = str5;
            obj = objM;
            context2 = context;
            str3 = str;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = ki5Var.i;
            str2 = ki5Var.c;
            strD0 = ki5Var.w;
            str3 = ki5Var.q;
            context2 = ki5Var.m;
            js2.o(obj);
        }
        String str6 = (String) obj;
        if (str6 != null) {
            if (ay4.P(str6, "custom:", false)) {
                str6 = "custom";
            }
            str4 = str6;
        }
        String strT = Build.VERSION.SDK_INT >= 31 ? xi3.t("/", Build.SOC_MODEL) : "";
        String packageName = context2.getPackageName();
        packageName.getClass();
        String strD1 = tx4.d0("io.appground.blek", packageName);
        String str7 = Build.BRAND;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        String str10 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        StringBuilder sbZ = du4.z("App version: ", strD1, " 6.25.2 (", strD0, "-");
        sbZ.append(length);
        sbZ.append(")\nDevice: ");
        sbZ.append(str7);
        sbZ.append(" ");
        du4.B(sbZ, str8, " (", str9, strT);
        sbZ.append(")  Android ");
        sbZ.append(str10);
        sbZ.append(" ");
        sbZ.append(locale);
        du4.B(sbZ, "\nKeyboard: ", str2, " ", str4);
        sbZ.append("\n\n");
        String string2 = sbZ.toString();
        if (str3 != null && !tx4.Y(str3)) {
            string2 = ((Object) string2) + "Debug log:\n\n" + str3;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        Uri uri = Uri.parse("mailto:");
        uri.getClass();
        intent.setData(uri);
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@appground.io"});
        intent.putExtra("android.intent.extra.SUBJECT", context2.getResources().getString(R.string.app_name) + " feedback");
        intent.putExtra("android.intent.extra.TEXT", string2);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.g - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.y - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.l0.z("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.l0.z("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(defpackage.k44 r18, defpackage.k44 r19, defpackage.k44 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = b(r3, r2, r0)
            float r5 = r2.y
            float r6 = r2.n
            float r7 = r2.g
            float r2 = r2.r
            float r8 = r0.n
            float r9 = r0.y
            float r10 = r0.r
            float r11 = r0.g
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = b(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.r
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.g
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.n
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.y
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.l0.z(r4)
            return r12
        L94:
            defpackage.l0.z(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.l0.z(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq2.i(k44, k44, k44, int):boolean");
    }

    public static final long j(long j) {
        float[] fArr = {0.0f, 0.0f, 0.0f};
        int iU = ra.U(j);
        ThreadLocal threadLocal = zj0.g;
        ya0.y(iU, rm5.m, null, fArr);
        float fI = y94.I(iU);
        fArr[2] = fI;
        return ra.n(ya0.n(fArr[0], fArr[1], xs2.q(fI + (fI > 50.0f ? 5.0f : -10.0f), 0.0f, 100.0f)));
    }

    public static final Object k(vz0 vz0Var, bz1 bz1Var, ou0 ou0Var) {
        return vz0Var.g(new nw3(bz1Var, null, (byte) 1), ou0Var);
    }

    public static final void l(final int i, final long j, final bz1 bz1Var, h02 h02Var, final pq4 pq4Var) {
        h02Var.Z(-771692794);
        int i2 = (h02Var.v(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? h02Var.x(pq4Var) : h02Var.j(pq4Var) ? 32 : 16;
        }
        if (((i2 | (h02Var.j(bz1Var) ? 256 : 128)) & 147) == 146 && h02Var.e()) {
            h02Var.Q();
        } else {
            og0.y(ep0.g.g(new yb1(j)), ue5.m0(-367769018, new iq4(bz1Var, j, pq4Var), h02Var), h02Var, 56);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: jq4
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kq2.l(aq2.J(i | 1), j, bz1Var, (h02) obj, pq4Var);
                    return og5.g;
                }
            };
        }
    }

    public static /* synthetic */ Object m(float f, float f2, oi oiVar, bz1 bz1Var, zz4 zz4Var, int i) {
        if ((i & 8) != 0) {
            oiVar = m50.b0(0.0f, 0.0f, null, 7);
        }
        return t(f, f2, 0.0f, oiVar, bz1Var, zz4Var);
    }

    public static final void n(qc4 qc4Var, nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(832919318);
        int i2 = (h02Var.j(qc4Var) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new pc3(b);
                h02Var.i0(objK);
            }
            xy1 xy1Var = (xy1) objK;
            wl5 wl5VarG = rx2.g(h02Var);
            if (wl5VarG == null) {
                l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            tf0 tf0VarG = v54.g(ew.class);
            jc2 jc2Var = new jc2((byte) 0);
            jc2Var.g(v54.g(ew.class), xy1Var);
            ew ewVar = (ew) js2.A(tf0VarG, wl5VarG, jc2Var.y(), xs2.k(wl5VarG), h02Var);
            ewVar.n = new jy3(qc4Var);
            qc4Var.y(ewVar.r, nm0Var, h02Var, ((i2 << 6) & 896) | 48);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn((byte) 16, i, qc4Var, nm0Var);
        }
    }

    public static final void o(ni niVar, long j, float f, fi fiVar, pi piVar, xy1 xy1Var) {
        long jR = f == 0.0f ? fiVar.r() : (long) ((j - niVar.r) / f);
        niVar.l = j;
        niVar.v.setValue(fiVar.y(jR));
        niVar.x = fiVar.x(jR);
        if (fiVar.l(jR)) {
            niVar.j = niVar.l;
            niVar.t.setValue(Boolean.FALSE);
        }
        Y(niVar, piVar);
        xy1Var.a(niVar);
    }

    public static final void p(long j) {
        o85[] o85VarArr = n85.y;
        if ((j & 1095216660480L) == 0) {
            oc2.g("Cannot perform operation for Unspecified type.");
        }
    }

    public static final Object q(pi piVar, c11 c11Var, boolean z, xy1 xy1Var, ou0 ou0Var) {
        Object objA = a(piVar, new b11(c11Var, piVar.j, piVar.t.getValue(), piVar.a), z ? piVar.m : Long.MIN_VALUE, xy1Var, ou0Var);
        return objA == px0.j ? objA : og5.g;
    }

    public static final k44 r(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new k44(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final ga3 s(yq2 yq2Var, mr2 mr2Var, y22 y22Var) {
        int iMin;
        y0 y0Var = yf2.J(mr2Var.j).r;
        rb3 rb3Var = (rb3) y22Var.t;
        int i = 1;
        if (!(rb3Var.a != 0) && y0Var.isEmpty()) {
            return ge2.g;
        }
        ga3 ga3Var = new ga3();
        if (((rb3) y22Var.t).a != 0) {
            int i2 = rb3Var.a;
            if (i2 == 0) {
                l0.s("MutableVector is empty.");
                return null;
            }
            Object[] objArr = rb3Var.j;
            int i3 = ((eq2) objArr[0]).g;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((eq2) objArr[i4]).g;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                pc2.g("negative minIndex");
            }
            int i6 = rb3Var.a;
            if (i6 == 0) {
                l0.s("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = rb3Var.j;
            int i7 = ((eq2) objArr2[0]).y;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((eq2) objArr2[i8]).y;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            iMin = Math.min(i7, yq2Var.g() - 1);
            i = i3;
        } else {
            iMin = 0;
        }
        int iG = y0Var.g();
        for (int i10 = 0; i10 < iG; i10++) {
            kr2 kr2Var = (kr2) y0Var.get(i10);
            int iW = zq2.w(kr2Var.r, yq2Var, kr2Var.g);
            if ((i > iW || iW > iMin) && iW >= 0 && iW < yq2Var.g()) {
                ga3Var.g(iW);
            }
        }
        if (i <= iMin) {
            while (true) {
                ga3Var.g(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        int i11 = ga3Var.y;
        if (i11 == 0) {
            return ga3Var;
        }
        int[] iArr = ga3Var.g;
        iArr.getClass();
        Arrays.sort(iArr, 0, i11);
        return ga3Var;
    }

    public static final Object t(float f, float f2, float f3, oi oiVar, bz1 bz1Var, zz4 zz4Var) {
        te5 te5Var = m50.w;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        xy1 xy1Var = te5Var.g;
        vi viVarR = (vi) xy1Var.a(f6);
        if (viVarR == null) {
            viVarR = ((vi) xy1Var.a(f4)).r();
        }
        vi viVar = viVarR;
        Object objA = a(new pi(te5Var, f4, viVar, 56), new t25(oiVar, te5Var, f4, f5, viVar), Long.MIN_VALUE, new s94(bz1Var, (byte) 10), zz4Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objA != px0Var) {
            objA = og5Var;
        }
        return objA == px0Var ? objA : og5Var;
    }

    public static final void u(cu1 cu1Var, rb3 rb3Var) {
        if (!cu1Var.j.h) {
            mc2.y("visitChildren called on an unattached node");
        }
        rb3 rb3Var2 = new rb3(new i73[16]);
        i73 i73Var = cu1Var.j;
        i73 i73Var2 = i73Var.w;
        if (i73Var2 == null) {
            k33.o(rb3Var2, i73Var);
        } else {
            rb3Var2.y(i73Var2);
        }
        while (true) {
            int i = rb3Var2.a;
            if (i == 0) {
                return;
            }
            i73 i73VarQ = (i73) rb3Var2.w(i - 1);
            if ((i73VarQ.m & 1024) == 0) {
                k33.o(rb3Var2, i73VarQ);
            } else {
                while (i73VarQ != null) {
                    if ((i73VarQ.a & 1024) != 0) {
                        rb3 rb3Var3 = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof cu1) {
                                cu1 cu1Var2 = (cu1) i73VarQ;
                                if (cu1Var2.h && !k33.V(cu1Var2).X) {
                                    if (cu1Var2.S0().g) {
                                        rb3Var.y(cu1Var2);
                                    } else {
                                        u(cu1Var2, rb3Var);
                                    }
                                }
                            } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                int i2 = 0;
                                for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                    if ((i73Var3.a & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            i73VarQ = i73Var3;
                                        } else {
                                            if (rb3Var3 == null) {
                                                rb3Var3 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var3.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var3.y(i73Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var3);
                        }
                        break;
                    }
                    i73VarQ = i73VarQ.w;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x015a  */
    /* JADX WARN: Code duplicated, block: B:107:0x016d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d A[PHI: r23
  0x017d: PHI (r23v7 int) = (r23v4 int), (r23v8 int) binds: [B:112:0x017b, B:110:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0180  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0213  */
    /* JADX WARN: Code duplicated, block: B:134:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [j73] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [j73] */
    /* JADX WARN: Type inference failed for: r35v0, types: [h02] */
    /* JADX WARN: Type inference failed for: r7v19, types: [g73] */
    public static final void v(j73 j73Var, bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3, bz1 bz1Var4, int i, long j, long j2, qo5 qo5Var, final nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        final bz1 bz1Var5;
        int i4;
        bz1 bz1Var6;
        int i5;
        int i6;
        bz1 bz1Var7;
        int i7;
        int i8;
        bz1 bz1Var8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        final ?? r1;
        final long j3;
        final bz1 bz1Var9;
        final bz1 bz1Var10;
        final bz1 bz1Var11;
        final int i16;
        final long j4;
        final qo5 qo5Var2;
        u34 u34VarP;
        long j5;
        long jY;
        int i17;
        int i18;
        qo5 qo5VarQ;
        int i19;
        ?? r15;
        int i20;
        int i21;
        boolean z2;
        Object objK;
        tb3 tb3Var;
        boolean zX;
        Object objK2;
        h02Var.Z(-1211482744);
        int i22 = i2 | 6;
        int i23 = i3 & 2;
        if (i23 == 0) {
            if ((i2 & 48) == 0) {
                bz1Var5 = bz1Var;
                i22 |= h02Var.j(bz1Var5) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    bz1Var6 = bz1Var2;
                    if (h02Var.j(bz1Var6)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i22 |= i5;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    if ((i2 & 3072) == 0) {
                        bz1Var7 = bz1Var3;
                        if (h02Var.j(bz1Var7)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i22 |= i7;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            bz1Var8 = bz1Var4;
                            if (h02Var.j(bz1Var8)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i22 |= i9;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i13 = i22 | 196608;
                            i11 = i;
                        } else {
                            i11 = i;
                            if (h02Var.n(i11)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i13 = i22 | i12;
                        }
                        int i24 = i13;
                        if ((i3 & 64) == 0) {
                            i14 = i23;
                            int i25 = h02Var.v(j) ? 1048576 : 524288;
                            i15 = i24 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                            if ((i15 & 306783379) != 306783378) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                if ((i2 & 1) != 0 || h02Var.k()) {
                                    if (i14 != 0) {
                                        bz1Var5 = jn0.g;
                                    }
                                    if (i4 != 0) {
                                        bz1Var6 = jn0.y;
                                    }
                                    if (i6 != 0) {
                                        bz1Var7 = jn0.r;
                                    }
                                    if (i8 != 0) {
                                        bz1Var8 = jn0.n;
                                    }
                                    if (i10 != 0) {
                                        i11 = 2;
                                    }
                                    if ((i3 & 64) != 0) {
                                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                                        i15 &= -3670017;
                                    } else {
                                        j5 = j;
                                    }
                                    jY = tj0.y(j5, h02Var);
                                    i17 = i15 & (-29360129);
                                    i18 = i3 & 256;
                                    g73 g73Var = g73.g;
                                    if (i18 != 0) {
                                        i19 = (-264241153) & i15;
                                        qo5VarQ = mq2.q(h02Var);
                                    } else {
                                        qo5VarQ = qo5Var;
                                        i19 = i17;
                                    }
                                    bz1Var5 = bz1Var5;
                                    r15 = g73Var;
                                } else {
                                    h02Var.Q();
                                    if ((i3 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    int i26 = i15 & (-29360129);
                                    if ((i3 & 256) != 0) {
                                        i26 = i15 & (-264241153);
                                    }
                                    r15 = j73Var;
                                    jY = j2;
                                    qo5VarQ = qo5Var;
                                    i19 = i26;
                                    j5 = j;
                                }
                                h02Var.s();
                                i20 = (234881024 & i19) ^ 100663296;
                                if (i20 > 67108864 || !h02Var.x(qo5VarQ)) {
                                    i21 = 100663296;
                                    if ((i19 & 100663296) != 67108864) {
                                        z2 = false;
                                    }
                                    objK = h02Var.K();
                                    long j6 = j5;
                                    Object obj = oo0.g;
                                    if (z2 || objK == obj) {
                                        objK = new tb3(qo5VarQ);
                                        h02Var.i0(objK);
                                    }
                                    tb3Var = (tb3) objK;
                                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                                    objK2 = h02Var.K();
                                    if (zX || objK2 == obj) {
                                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                        h02Var.i0(objK2);
                                    }
                                    bz1 bz1Var12 = bz1Var5;
                                    bz1 bz1Var13 = bz1Var6;
                                    bz1 bz1Var14 = bz1Var7;
                                    bz1 bz1Var15 = bz1Var8;
                                    int i27 = i11;
                                    long j7 = jY;
                                    qo5 qo5Var3 = qo5VarQ;
                                    uz4.g(yf2.U(r15, (xy1) objK2), null, j6, j7, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i27, bz1Var12, nm0Var, bz1Var14, bz1Var15, tb3Var, bz1Var13), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                                    j4 = j6;
                                    j3 = j7;
                                    r1 = r15;
                                    bz1Var5 = bz1Var12;
                                    bz1Var9 = bz1Var13;
                                    bz1Var10 = bz1Var14;
                                    bz1Var11 = bz1Var15;
                                    qo5Var2 = qo5Var3;
                                    i16 = i27;
                                } else {
                                    i21 = 100663296;
                                }
                                z2 = true;
                                objK = h02Var.K();
                                long j8 = j5;
                                Object obj2 = oo0.g;
                                if (z2) {
                                    objK = new tb3(qo5VarQ);
                                    h02Var.i0(objK);
                                } else {
                                    objK = new tb3(qo5VarQ);
                                    h02Var.i0(objK);
                                }
                                tb3Var = (tb3) objK;
                                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                                objK2 = h02Var.K();
                                if (zX) {
                                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                    h02Var.i0(objK2);
                                } else {
                                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                    h02Var.i0(objK2);
                                }
                                bz1 bz1Var16 = bz1Var5;
                                bz1 bz1Var17 = bz1Var6;
                                bz1 bz1Var18 = bz1Var7;
                                bz1 bz1Var19 = bz1Var8;
                                int i28 = i11;
                                long j9 = jY;
                                qo5 qo5Var4 = qo5VarQ;
                                uz4.g(yf2.U(r15, (xy1) objK2), null, j8, j9, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i28, bz1Var16, nm0Var, bz1Var18, bz1Var19, tb3Var, bz1Var17), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                                j4 = j8;
                                j3 = j9;
                                r1 = r15;
                                bz1Var5 = bz1Var16;
                                bz1Var9 = bz1Var17;
                                bz1Var10 = bz1Var18;
                                bz1Var11 = bz1Var19;
                                qo5Var2 = qo5Var4;
                                i16 = i28;
                            } else {
                                h02Var.Q();
                                r1 = j73Var;
                                j3 = j2;
                                bz1Var9 = bz1Var6;
                                bz1Var10 = bz1Var7;
                                bz1Var11 = bz1Var8;
                                i16 = i11;
                                j4 = j;
                                qo5Var2 = qo5Var;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: sd4
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj3, Object obj4) {
                                        ((Integer) obj4).getClass();
                                        int iJ = aq2.J(i2 | 1);
                                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj3, iJ, i3);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i14 = i23;
                        i15 = i24 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                        if ((i15 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            if ((i2 & 1) != 0) {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var2 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var2;
                            } else {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var3 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var3;
                            }
                            h02Var.s();
                            i20 = (234881024 & i19) ^ 100663296;
                            if (i20 > 67108864) {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            objK = h02Var.K();
                            long j10 = j5;
                            Object obj3 = oo0.g;
                            if (z2) {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            } else {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            }
                            tb3Var = (tb3) objK;
                            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                            objK2 = h02Var.K();
                            if (zX) {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            } else {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            }
                            bz1 bz1Var110 = bz1Var5;
                            bz1 bz1Var111 = bz1Var6;
                            bz1 bz1Var112 = bz1Var7;
                            bz1 bz1Var113 = bz1Var8;
                            int i29 = i11;
                            long j11 = jY;
                            qo5 qo5Var5 = qo5VarQ;
                            uz4.g(yf2.U(r15, (xy1) objK2), null, j10, j11, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i29, bz1Var110, nm0Var, bz1Var112, bz1Var113, tb3Var, bz1Var111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                            j4 = j10;
                            j3 = j11;
                            r1 = r15;
                            bz1Var5 = bz1Var110;
                            bz1Var9 = bz1Var111;
                            bz1Var10 = bz1Var112;
                            bz1Var11 = bz1Var113;
                            qo5Var2 = qo5Var5;
                            i16 = i29;
                        } else {
                            h02Var.Q();
                            r1 = j73Var;
                            j3 = j2;
                            bz1Var9 = bz1Var6;
                            bz1Var10 = bz1Var7;
                            bz1Var11 = bz1Var8;
                            i16 = i11;
                            j4 = j;
                            qo5Var2 = qo5Var;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: sd4
                                @Override // defpackage.bz1
                                public final Object l(Object obj4, Object obj5) {
                                    ((Integer) obj5).getClass();
                                    int iJ = aq2.J(i2 | 1);
                                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj4, iJ, i3);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i22 |= 24576;
                    bz1Var8 = bz1Var4;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        i13 = i22 | 196608;
                        i11 = i;
                    } else {
                        i11 = i;
                        if (h02Var.n(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i13 = i22 | i12;
                    }
                    int i210 = i13;
                    if ((i3 & 64) == 0) {
                        i14 = i23;
                        if (h02Var.v(j)) {
                        }
                        i15 = i210 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                        if ((i15 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            if ((i2 & 1) != 0) {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var4 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var4;
                            } else {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var5 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var5;
                            }
                            h02Var.s();
                            i20 = (234881024 & i19) ^ 100663296;
                            if (i20 > 67108864) {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            objK = h02Var.K();
                            long j12 = j5;
                            Object obj4 = oo0.g;
                            if (z2) {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            } else {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            }
                            tb3Var = (tb3) objK;
                            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                            objK2 = h02Var.K();
                            if (zX) {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            } else {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            }
                            bz1 bz1Var114 = bz1Var5;
                            bz1 bz1Var115 = bz1Var6;
                            bz1 bz1Var116 = bz1Var7;
                            bz1 bz1Var117 = bz1Var8;
                            int i211 = i11;
                            long j13 = jY;
                            qo5 qo5Var6 = qo5VarQ;
                            uz4.g(yf2.U(r15, (xy1) objK2), null, j12, j13, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211, bz1Var114, nm0Var, bz1Var116, bz1Var117, tb3Var, bz1Var115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                            j4 = j12;
                            j3 = j13;
                            r1 = r15;
                            bz1Var5 = bz1Var114;
                            bz1Var9 = bz1Var115;
                            bz1Var10 = bz1Var116;
                            bz1Var11 = bz1Var117;
                            qo5Var2 = qo5Var6;
                            i16 = i211;
                        } else {
                            h02Var.Q();
                            r1 = j73Var;
                            j3 = j2;
                            bz1Var9 = bz1Var6;
                            bz1Var10 = bz1Var7;
                            bz1Var11 = bz1Var8;
                            i16 = i11;
                            j4 = j;
                            qo5Var2 = qo5Var;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: sd4
                                @Override // defpackage.bz1
                                public final Object l(Object obj5, Object obj6) {
                                    ((Integer) obj6).getClass();
                                    int iJ = aq2.J(i2 | 1);
                                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj5, iJ, i3);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i14 = i23;
                    i15 = i210 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var6 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var6;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var7 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var7;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j14 = j5;
                        Object obj5 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var118 = bz1Var5;
                        bz1 bz1Var119 = bz1Var6;
                        bz1 bz1Var1110 = bz1Var7;
                        bz1 bz1Var1111 = bz1Var8;
                        int i212 = i11;
                        long j15 = jY;
                        qo5 qo5Var7 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j14, j15, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i212, bz1Var118, nm0Var, bz1Var1110, bz1Var1111, tb3Var, bz1Var119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j14;
                        j3 = j15;
                        r1 = r15;
                        bz1Var5 = bz1Var118;
                        bz1Var9 = bz1Var119;
                        bz1Var10 = bz1Var1110;
                        bz1Var11 = bz1Var1111;
                        qo5Var2 = qo5Var7;
                        i16 = i212;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj6, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i22 |= 3072;
                bz1Var7 = bz1Var3;
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i22 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        i13 = i22 | 196608;
                        i11 = i;
                    } else {
                        i11 = i;
                        if (h02Var.n(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i13 = i22 | i12;
                    }
                    int i213 = i13;
                    if ((i3 & 64) == 0) {
                        i14 = i23;
                        if (h02Var.v(j)) {
                        }
                        i15 = i213 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                        if ((i15 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            if ((i2 & 1) != 0) {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var8 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var8;
                            } else {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var9 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var9;
                            }
                            h02Var.s();
                            i20 = (234881024 & i19) ^ 100663296;
                            if (i20 > 67108864) {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            objK = h02Var.K();
                            long j16 = j5;
                            Object obj6 = oo0.g;
                            if (z2) {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            } else {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            }
                            tb3Var = (tb3) objK;
                            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                            objK2 = h02Var.K();
                            if (zX) {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            } else {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            }
                            bz1 bz1Var1112 = bz1Var5;
                            bz1 bz1Var1113 = bz1Var6;
                            bz1 bz1Var1114 = bz1Var7;
                            bz1 bz1Var1115 = bz1Var8;
                            int i214 = i11;
                            long j17 = jY;
                            qo5 qo5Var8 = qo5VarQ;
                            uz4.g(yf2.U(r15, (xy1) objK2), null, j16, j17, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i214, bz1Var1112, nm0Var, bz1Var1114, bz1Var1115, tb3Var, bz1Var1113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                            j4 = j16;
                            j3 = j17;
                            r1 = r15;
                            bz1Var5 = bz1Var1112;
                            bz1Var9 = bz1Var1113;
                            bz1Var10 = bz1Var1114;
                            bz1Var11 = bz1Var1115;
                            qo5Var2 = qo5Var8;
                            i16 = i214;
                        } else {
                            h02Var.Q();
                            r1 = j73Var;
                            j3 = j2;
                            bz1Var9 = bz1Var6;
                            bz1Var10 = bz1Var7;
                            bz1Var11 = bz1Var8;
                            i16 = i11;
                            j4 = j;
                            qo5Var2 = qo5Var;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: sd4
                                @Override // defpackage.bz1
                                public final Object l(Object obj7, Object obj8) {
                                    ((Integer) obj8).getClass();
                                    int iJ = aq2.J(i2 | 1);
                                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj7, iJ, i3);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i14 = i23;
                    i15 = i213 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var10 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var10;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var11 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var11;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j18 = j5;
                        Object obj7 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var1116 = bz1Var5;
                        bz1 bz1Var1117 = bz1Var6;
                        bz1 bz1Var1118 = bz1Var7;
                        bz1 bz1Var1119 = bz1Var8;
                        int i215 = i11;
                        long j19 = jY;
                        qo5 qo5Var9 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j18, j19, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i215, bz1Var1116, nm0Var, bz1Var1118, bz1Var1119, tb3Var, bz1Var1117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j18;
                        j3 = j19;
                        r1 = r15;
                        bz1Var5 = bz1Var1116;
                        bz1Var9 = bz1Var1117;
                        bz1Var10 = bz1Var1118;
                        bz1Var11 = bz1Var1119;
                        qo5Var2 = qo5Var9;
                        i16 = i215;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj8, Object obj9) {
                                ((Integer) obj9).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj8, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i22 |= 24576;
                bz1Var8 = bz1Var4;
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i216 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i216 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var12 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var12;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var13 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var13;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j110 = j5;
                        Object obj8 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var11110 = bz1Var5;
                        bz1 bz1Var11111 = bz1Var6;
                        bz1 bz1Var11112 = bz1Var7;
                        bz1 bz1Var11113 = bz1Var8;
                        int i217 = i11;
                        long j111 = jY;
                        qo5 qo5Var10 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j110, j111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i217, bz1Var11110, nm0Var, bz1Var11112, bz1Var11113, tb3Var, bz1Var11111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j110;
                        j3 = j111;
                        r1 = r15;
                        bz1Var5 = bz1Var11110;
                        bz1Var9 = bz1Var11111;
                        bz1Var10 = bz1Var11112;
                        bz1Var11 = bz1Var11113;
                        qo5Var2 = qo5Var10;
                        i16 = i217;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj9, Object obj10) {
                                ((Integer) obj10).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj9, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i216 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var14 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var14;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var15 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var15;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j112 = j5;
                    Object obj9 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var11114 = bz1Var5;
                    bz1 bz1Var11115 = bz1Var6;
                    bz1 bz1Var11116 = bz1Var7;
                    bz1 bz1Var11117 = bz1Var8;
                    int i218 = i11;
                    long j113 = jY;
                    qo5 qo5Var11 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j112, j113, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i218, bz1Var11114, nm0Var, bz1Var11116, bz1Var11117, tb3Var, bz1Var11115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j112;
                    j3 = j113;
                    r1 = r15;
                    bz1Var5 = bz1Var11114;
                    bz1Var9 = bz1Var11115;
                    bz1Var10 = bz1Var11116;
                    bz1Var11 = bz1Var11117;
                    qo5Var2 = qo5Var11;
                    i16 = i218;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj10, Object obj11) {
                            ((Integer) obj11).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj10, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 384;
            bz1Var6 = bz1Var2;
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    bz1Var7 = bz1Var3;
                    if (h02Var.j(bz1Var7)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i22 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i22 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        i13 = i22 | 196608;
                        i11 = i;
                    } else {
                        i11 = i;
                        if (h02Var.n(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i13 = i22 | i12;
                    }
                    int i219 = i13;
                    if ((i3 & 64) == 0) {
                        i14 = i23;
                        if (h02Var.v(j)) {
                        }
                        i15 = i219 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                        if ((i15 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            if ((i2 & 1) != 0) {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var16 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var16;
                            } else {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var17 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var17;
                            }
                            h02Var.s();
                            i20 = (234881024 & i19) ^ 100663296;
                            if (i20 > 67108864) {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            objK = h02Var.K();
                            long j114 = j5;
                            Object obj10 = oo0.g;
                            if (z2) {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            } else {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            }
                            tb3Var = (tb3) objK;
                            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                            objK2 = h02Var.K();
                            if (zX) {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            } else {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            }
                            bz1 bz1Var11118 = bz1Var5;
                            bz1 bz1Var11119 = bz1Var6;
                            bz1 bz1Var111110 = bz1Var7;
                            bz1 bz1Var111111 = bz1Var8;
                            int i2110 = i11;
                            long j115 = jY;
                            qo5 qo5Var12 = qo5VarQ;
                            uz4.g(yf2.U(r15, (xy1) objK2), null, j114, j115, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2110, bz1Var11118, nm0Var, bz1Var111110, bz1Var111111, tb3Var, bz1Var11119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                            j4 = j114;
                            j3 = j115;
                            r1 = r15;
                            bz1Var5 = bz1Var11118;
                            bz1Var9 = bz1Var11119;
                            bz1Var10 = bz1Var111110;
                            bz1Var11 = bz1Var111111;
                            qo5Var2 = qo5Var12;
                            i16 = i2110;
                        } else {
                            h02Var.Q();
                            r1 = j73Var;
                            j3 = j2;
                            bz1Var9 = bz1Var6;
                            bz1Var10 = bz1Var7;
                            bz1Var11 = bz1Var8;
                            i16 = i11;
                            j4 = j;
                            qo5Var2 = qo5Var;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: sd4
                                @Override // defpackage.bz1
                                public final Object l(Object obj11, Object obj12) {
                                    ((Integer) obj12).getClass();
                                    int iJ = aq2.J(i2 | 1);
                                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj11, iJ, i3);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i14 = i23;
                    i15 = i219 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var18 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var18;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var19 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var19;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j116 = j5;
                        Object obj11 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var111112 = bz1Var5;
                        bz1 bz1Var111113 = bz1Var6;
                        bz1 bz1Var111114 = bz1Var7;
                        bz1 bz1Var111115 = bz1Var8;
                        int i2111 = i11;
                        long j117 = jY;
                        qo5 qo5Var13 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j116, j117, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2111, bz1Var111112, nm0Var, bz1Var111114, bz1Var111115, tb3Var, bz1Var111113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j116;
                        j3 = j117;
                        r1 = r15;
                        bz1Var5 = bz1Var111112;
                        bz1Var9 = bz1Var111113;
                        bz1Var10 = bz1Var111114;
                        bz1Var11 = bz1Var111115;
                        qo5Var2 = qo5Var13;
                        i16 = i2111;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj12, Object obj13) {
                                ((Integer) obj13).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj12, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i22 |= 24576;
                bz1Var8 = bz1Var4;
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i2112 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i2112 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var110 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var110;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var111 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var111;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j118 = j5;
                        Object obj12 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var111116 = bz1Var5;
                        bz1 bz1Var111117 = bz1Var6;
                        bz1 bz1Var111118 = bz1Var7;
                        bz1 bz1Var111119 = bz1Var8;
                        int i2113 = i11;
                        long j119 = jY;
                        qo5 qo5Var14 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j118, j119, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2113, bz1Var111116, nm0Var, bz1Var111118, bz1Var111119, tb3Var, bz1Var111117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j118;
                        j3 = j119;
                        r1 = r15;
                        bz1Var5 = bz1Var111116;
                        bz1Var9 = bz1Var111117;
                        bz1Var10 = bz1Var111118;
                        bz1Var11 = bz1Var111119;
                        qo5Var2 = qo5Var14;
                        i16 = i2113;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj13, Object obj14) {
                                ((Integer) obj14).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj13, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i2112 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var112 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var112;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var113 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var113;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j1110 = j5;
                    Object obj13 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var1111110 = bz1Var5;
                    bz1 bz1Var1111111 = bz1Var6;
                    bz1 bz1Var1111112 = bz1Var7;
                    bz1 bz1Var1111113 = bz1Var8;
                    int i2114 = i11;
                    long j1111 = jY;
                    qo5 qo5Var15 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j1110, j1111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2114, bz1Var1111110, nm0Var, bz1Var1111112, bz1Var1111113, tb3Var, bz1Var1111111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j1110;
                    j3 = j1111;
                    r1 = r15;
                    bz1Var5 = bz1Var1111110;
                    bz1Var9 = bz1Var1111111;
                    bz1Var10 = bz1Var1111112;
                    bz1Var11 = bz1Var1111113;
                    qo5Var2 = qo5Var15;
                    i16 = i2114;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj14, Object obj15) {
                            ((Integer) obj15).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj14, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 3072;
            bz1Var7 = bz1Var3;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i22 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i2115 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i2115 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var114 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var114;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var115 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var115;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j1112 = j5;
                        Object obj14 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var1111114 = bz1Var5;
                        bz1 bz1Var1111115 = bz1Var6;
                        bz1 bz1Var1111116 = bz1Var7;
                        bz1 bz1Var1111117 = bz1Var8;
                        int i2116 = i11;
                        long j1113 = jY;
                        qo5 qo5Var16 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j1112, j1113, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2116, bz1Var1111114, nm0Var, bz1Var1111116, bz1Var1111117, tb3Var, bz1Var1111115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j1112;
                        j3 = j1113;
                        r1 = r15;
                        bz1Var5 = bz1Var1111114;
                        bz1Var9 = bz1Var1111115;
                        bz1Var10 = bz1Var1111116;
                        bz1Var11 = bz1Var1111117;
                        qo5Var2 = qo5Var16;
                        i16 = i2116;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj15, Object obj16) {
                                ((Integer) obj16).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj15, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i2115 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var116 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var116;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var117 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var117;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j1114 = j5;
                    Object obj15 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var1111118 = bz1Var5;
                    bz1 bz1Var1111119 = bz1Var6;
                    bz1 bz1Var11111110 = bz1Var7;
                    bz1 bz1Var11111111 = bz1Var8;
                    int i2117 = i11;
                    long j1115 = jY;
                    qo5 qo5Var17 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j1114, j1115, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2117, bz1Var1111118, nm0Var, bz1Var11111110, bz1Var11111111, tb3Var, bz1Var1111119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j1114;
                    j3 = j1115;
                    r1 = r15;
                    bz1Var5 = bz1Var1111118;
                    bz1Var9 = bz1Var1111119;
                    bz1Var10 = bz1Var11111110;
                    bz1Var11 = bz1Var11111111;
                    qo5Var2 = qo5Var17;
                    i16 = i2117;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj16, Object obj17) {
                            ((Integer) obj17).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj16, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 24576;
            bz1Var8 = bz1Var4;
            i10 = i3 & 32;
            if (i10 != 0) {
                i13 = i22 | 196608;
                i11 = i;
            } else {
                i11 = i;
                if (h02Var.n(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i22 | i12;
            }
            int i2118 = i13;
            if ((i3 & 64) == 0) {
                i14 = i23;
                if (h02Var.v(j)) {
                }
                i15 = i2118 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var118 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var118;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var119 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var119;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j1116 = j5;
                    Object obj16 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var11111112 = bz1Var5;
                    bz1 bz1Var11111113 = bz1Var6;
                    bz1 bz1Var11111114 = bz1Var7;
                    bz1 bz1Var11111115 = bz1Var8;
                    int i2119 = i11;
                    long j1117 = jY;
                    qo5 qo5Var18 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j1116, j1117, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2119, bz1Var11111112, nm0Var, bz1Var11111114, bz1Var11111115, tb3Var, bz1Var11111113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j1116;
                    j3 = j1117;
                    r1 = r15;
                    bz1Var5 = bz1Var11111112;
                    bz1Var9 = bz1Var11111113;
                    bz1Var10 = bz1Var11111114;
                    bz1Var11 = bz1Var11111115;
                    qo5Var2 = qo5Var18;
                    i16 = i2119;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj17, Object obj18) {
                            ((Integer) obj18).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj17, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i14 = i23;
            i15 = i2118 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
            if ((i15 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var1110 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var1110;
                } else {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var1111 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var1111;
                }
                h02Var.s();
                i20 = (234881024 & i19) ^ 100663296;
                if (i20 > 67108864) {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objK = h02Var.K();
                long j1118 = j5;
                Object obj17 = oo0.g;
                if (z2) {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                } else {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                }
                tb3Var = (tb3) objK;
                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                }
                bz1 bz1Var11111116 = bz1Var5;
                bz1 bz1Var11111117 = bz1Var6;
                bz1 bz1Var11111118 = bz1Var7;
                bz1 bz1Var11111119 = bz1Var8;
                int i21110 = i11;
                long j1119 = jY;
                qo5 qo5Var19 = qo5VarQ;
                uz4.g(yf2.U(r15, (xy1) objK2), null, j1118, j1119, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21110, bz1Var11111116, nm0Var, bz1Var11111118, bz1Var11111119, tb3Var, bz1Var11111117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                j4 = j1118;
                j3 = j1119;
                r1 = r15;
                bz1Var5 = bz1Var11111116;
                bz1Var9 = bz1Var11111117;
                bz1Var10 = bz1Var11111118;
                bz1Var11 = bz1Var11111119;
                qo5Var2 = qo5Var19;
                i16 = i21110;
            } else {
                h02Var.Q();
                r1 = j73Var;
                j3 = j2;
                bz1Var9 = bz1Var6;
                bz1Var10 = bz1Var7;
                bz1Var11 = bz1Var8;
                i16 = i11;
                j4 = j;
                qo5Var2 = qo5Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: sd4
                    @Override // defpackage.bz1
                    public final Object l(Object obj18, Object obj19) {
                        ((Integer) obj19).getClass();
                        int iJ = aq2.J(i2 | 1);
                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj18, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i22 = i2 | 54;
        bz1Var5 = bz1Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                bz1Var6 = bz1Var2;
                if (h02Var.j(bz1Var6)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i22 |= i5;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    bz1Var7 = bz1Var3;
                    if (h02Var.j(bz1Var7)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i22 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i22 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        i13 = i22 | 196608;
                        i11 = i;
                    } else {
                        i11 = i;
                        if (h02Var.n(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i13 = i22 | i12;
                    }
                    int i21111 = i13;
                    if ((i3 & 64) == 0) {
                        i14 = i23;
                        if (h02Var.v(j)) {
                        }
                        i15 = i21111 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                        if ((i15 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            if ((i2 & 1) != 0) {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var1112 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var1112;
                            } else {
                                if (i14 != 0) {
                                    bz1Var5 = jn0.g;
                                }
                                if (i4 != 0) {
                                    bz1Var6 = jn0.y;
                                }
                                if (i6 != 0) {
                                    bz1Var7 = jn0.r;
                                }
                                if (i8 != 0) {
                                    bz1Var8 = jn0.n;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if ((i3 & 64) != 0) {
                                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                                    i15 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                jY = tj0.y(j5, h02Var);
                                i17 = i15 & (-29360129);
                                i18 = i3 & 256;
                                g73 g73Var1113 = g73.g;
                                if (i18 != 0) {
                                    i19 = (-264241153) & i15;
                                    qo5VarQ = mq2.q(h02Var);
                                } else {
                                    qo5VarQ = qo5Var;
                                    i19 = i17;
                                }
                                bz1Var5 = bz1Var5;
                                r15 = g73Var1113;
                            }
                            h02Var.s();
                            i20 = (234881024 & i19) ^ 100663296;
                            if (i20 > 67108864) {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                i21 = 100663296;
                                if ((i19 & 100663296) != 67108864) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            objK = h02Var.K();
                            long j11110 = j5;
                            Object obj18 = oo0.g;
                            if (z2) {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            } else {
                                objK = new tb3(qo5VarQ);
                                h02Var.i0(objK);
                            }
                            tb3Var = (tb3) objK;
                            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                            objK2 = h02Var.K();
                            if (zX) {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            } else {
                                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                                h02Var.i0(objK2);
                            }
                            bz1 bz1Var111111110 = bz1Var5;
                            bz1 bz1Var111111111 = bz1Var6;
                            bz1 bz1Var111111112 = bz1Var7;
                            bz1 bz1Var111111113 = bz1Var8;
                            int i21112 = i11;
                            long j11111 = jY;
                            qo5 qo5Var110 = qo5VarQ;
                            uz4.g(yf2.U(r15, (xy1) objK2), null, j11110, j11111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21112, bz1Var111111110, nm0Var, bz1Var111111112, bz1Var111111113, tb3Var, bz1Var111111111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                            j4 = j11110;
                            j3 = j11111;
                            r1 = r15;
                            bz1Var5 = bz1Var111111110;
                            bz1Var9 = bz1Var111111111;
                            bz1Var10 = bz1Var111111112;
                            bz1Var11 = bz1Var111111113;
                            qo5Var2 = qo5Var110;
                            i16 = i21112;
                        } else {
                            h02Var.Q();
                            r1 = j73Var;
                            j3 = j2;
                            bz1Var9 = bz1Var6;
                            bz1Var10 = bz1Var7;
                            bz1Var11 = bz1Var8;
                            i16 = i11;
                            j4 = j;
                            qo5Var2 = qo5Var;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: sd4
                                @Override // defpackage.bz1
                                public final Object l(Object obj19, Object obj110) {
                                    ((Integer) obj110).getClass();
                                    int iJ = aq2.J(i2 | 1);
                                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj19, iJ, i3);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i14 = i23;
                    i15 = i21111 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var1114 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var1114;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var1115 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var1115;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j11112 = j5;
                        Object obj19 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var111111114 = bz1Var5;
                        bz1 bz1Var111111115 = bz1Var6;
                        bz1 bz1Var111111116 = bz1Var7;
                        bz1 bz1Var111111117 = bz1Var8;
                        int i21113 = i11;
                        long j11113 = jY;
                        qo5 qo5Var111 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j11112, j11113, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21113, bz1Var111111114, nm0Var, bz1Var111111116, bz1Var111111117, tb3Var, bz1Var111111115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j11112;
                        j3 = j11113;
                        r1 = r15;
                        bz1Var5 = bz1Var111111114;
                        bz1Var9 = bz1Var111111115;
                        bz1Var10 = bz1Var111111116;
                        bz1Var11 = bz1Var111111117;
                        qo5Var2 = qo5Var111;
                        i16 = i21113;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj110, Object obj111) {
                                ((Integer) obj111).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj110, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i22 |= 24576;
                bz1Var8 = bz1Var4;
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i21114 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i21114 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var1116 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var1116;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var1117 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var1117;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j11114 = j5;
                        Object obj110 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var111111118 = bz1Var5;
                        bz1 bz1Var111111119 = bz1Var6;
                        bz1 bz1Var1111111110 = bz1Var7;
                        bz1 bz1Var1111111111 = bz1Var8;
                        int i21115 = i11;
                        long j11115 = jY;
                        qo5 qo5Var112 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j11114, j11115, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21115, bz1Var111111118, nm0Var, bz1Var1111111110, bz1Var1111111111, tb3Var, bz1Var111111119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j11114;
                        j3 = j11115;
                        r1 = r15;
                        bz1Var5 = bz1Var111111118;
                        bz1Var9 = bz1Var111111119;
                        bz1Var10 = bz1Var1111111110;
                        bz1Var11 = bz1Var1111111111;
                        qo5Var2 = qo5Var112;
                        i16 = i21115;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj111, Object obj112) {
                                ((Integer) obj112).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj111, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i21114 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var1118 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var1118;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var1119 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var1119;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j11116 = j5;
                    Object obj111 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var1111111112 = bz1Var5;
                    bz1 bz1Var1111111113 = bz1Var6;
                    bz1 bz1Var1111111114 = bz1Var7;
                    bz1 bz1Var1111111115 = bz1Var8;
                    int i21116 = i11;
                    long j11117 = jY;
                    qo5 qo5Var113 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j11116, j11117, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21116, bz1Var1111111112, nm0Var, bz1Var1111111114, bz1Var1111111115, tb3Var, bz1Var1111111113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j11116;
                    j3 = j11117;
                    r1 = r15;
                    bz1Var5 = bz1Var1111111112;
                    bz1Var9 = bz1Var1111111113;
                    bz1Var10 = bz1Var1111111114;
                    bz1Var11 = bz1Var1111111115;
                    qo5Var2 = qo5Var113;
                    i16 = i21116;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj112, Object obj113) {
                            ((Integer) obj113).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj112, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 3072;
            bz1Var7 = bz1Var3;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i22 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i21117 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i21117 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var11110 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var11110;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var11111 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var11111;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j11118 = j5;
                        Object obj112 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var1111111116 = bz1Var5;
                        bz1 bz1Var1111111117 = bz1Var6;
                        bz1 bz1Var1111111118 = bz1Var7;
                        bz1 bz1Var1111111119 = bz1Var8;
                        int i21118 = i11;
                        long j11119 = jY;
                        qo5 qo5Var114 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j11118, j11119, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21118, bz1Var1111111116, nm0Var, bz1Var1111111118, bz1Var1111111119, tb3Var, bz1Var1111111117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j11118;
                        j3 = j11119;
                        r1 = r15;
                        bz1Var5 = bz1Var1111111116;
                        bz1Var9 = bz1Var1111111117;
                        bz1Var10 = bz1Var1111111118;
                        bz1Var11 = bz1Var1111111119;
                        qo5Var2 = qo5Var114;
                        i16 = i21118;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj113, Object obj114) {
                                ((Integer) obj114).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj113, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i21117 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var11112 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var11112;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var11113 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var11113;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j111110 = j5;
                    Object obj113 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var11111111110 = bz1Var5;
                    bz1 bz1Var11111111111 = bz1Var6;
                    bz1 bz1Var11111111112 = bz1Var7;
                    bz1 bz1Var11111111113 = bz1Var8;
                    int i21119 = i11;
                    long j111111 = jY;
                    qo5 qo5Var115 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j111110, j111111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i21119, bz1Var11111111110, nm0Var, bz1Var11111111112, bz1Var11111111113, tb3Var, bz1Var11111111111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j111110;
                    j3 = j111111;
                    r1 = r15;
                    bz1Var5 = bz1Var11111111110;
                    bz1Var9 = bz1Var11111111111;
                    bz1Var10 = bz1Var11111111112;
                    bz1Var11 = bz1Var11111111113;
                    qo5Var2 = qo5Var115;
                    i16 = i21119;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj114, Object obj115) {
                            ((Integer) obj115).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj114, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 24576;
            bz1Var8 = bz1Var4;
            i10 = i3 & 32;
            if (i10 != 0) {
                i13 = i22 | 196608;
                i11 = i;
            } else {
                i11 = i;
                if (h02Var.n(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i22 | i12;
            }
            int i211110 = i13;
            if ((i3 & 64) == 0) {
                i14 = i23;
                if (h02Var.v(j)) {
                }
                i15 = i211110 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var11114 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var11114;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var11115 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var11115;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j111112 = j5;
                    Object obj114 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var11111111114 = bz1Var5;
                    bz1 bz1Var11111111115 = bz1Var6;
                    bz1 bz1Var11111111116 = bz1Var7;
                    bz1 bz1Var11111111117 = bz1Var8;
                    int i211111 = i11;
                    long j111113 = jY;
                    qo5 qo5Var116 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j111112, j111113, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211111, bz1Var11111111114, nm0Var, bz1Var11111111116, bz1Var11111111117, tb3Var, bz1Var11111111115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j111112;
                    j3 = j111113;
                    r1 = r15;
                    bz1Var5 = bz1Var11111111114;
                    bz1Var9 = bz1Var11111111115;
                    bz1Var10 = bz1Var11111111116;
                    bz1Var11 = bz1Var11111111117;
                    qo5Var2 = qo5Var116;
                    i16 = i211111;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj115, Object obj116) {
                            ((Integer) obj116).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj115, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i14 = i23;
            i15 = i211110 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
            if ((i15 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var11116 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var11116;
                } else {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var11117 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var11117;
                }
                h02Var.s();
                i20 = (234881024 & i19) ^ 100663296;
                if (i20 > 67108864) {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objK = h02Var.K();
                long j111114 = j5;
                Object obj115 = oo0.g;
                if (z2) {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                } else {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                }
                tb3Var = (tb3) objK;
                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                }
                bz1 bz1Var11111111118 = bz1Var5;
                bz1 bz1Var11111111119 = bz1Var6;
                bz1 bz1Var111111111110 = bz1Var7;
                bz1 bz1Var111111111111 = bz1Var8;
                int i211112 = i11;
                long j111115 = jY;
                qo5 qo5Var117 = qo5VarQ;
                uz4.g(yf2.U(r15, (xy1) objK2), null, j111114, j111115, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211112, bz1Var11111111118, nm0Var, bz1Var111111111110, bz1Var111111111111, tb3Var, bz1Var11111111119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                j4 = j111114;
                j3 = j111115;
                r1 = r15;
                bz1Var5 = bz1Var11111111118;
                bz1Var9 = bz1Var11111111119;
                bz1Var10 = bz1Var111111111110;
                bz1Var11 = bz1Var111111111111;
                qo5Var2 = qo5Var117;
                i16 = i211112;
            } else {
                h02Var.Q();
                r1 = j73Var;
                j3 = j2;
                bz1Var9 = bz1Var6;
                bz1Var10 = bz1Var7;
                bz1Var11 = bz1Var8;
                i16 = i11;
                j4 = j;
                qo5Var2 = qo5Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: sd4
                    @Override // defpackage.bz1
                    public final Object l(Object obj116, Object obj117) {
                        ((Integer) obj117).getClass();
                        int iJ = aq2.J(i2 | 1);
                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj116, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i22 |= 384;
        bz1Var6 = bz1Var2;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                bz1Var7 = bz1Var3;
                if (h02Var.j(bz1Var7)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i22 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i22 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i13 = i22 | 196608;
                    i11 = i;
                } else {
                    i11 = i;
                    if (h02Var.n(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i13 = i22 | i12;
                }
                int i211113 = i13;
                if ((i3 & 64) == 0) {
                    i14 = i23;
                    if (h02Var.v(j)) {
                    }
                    i15 = i211113 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                    if ((i15 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var11118 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var11118;
                        } else {
                            if (i14 != 0) {
                                bz1Var5 = jn0.g;
                            }
                            if (i4 != 0) {
                                bz1Var6 = jn0.y;
                            }
                            if (i6 != 0) {
                                bz1Var7 = jn0.r;
                            }
                            if (i8 != 0) {
                                bz1Var8 = jn0.n;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if ((i3 & 64) != 0) {
                                j5 = ((rj0) h02Var.a(tj0.g)).c;
                                i15 &= -3670017;
                            } else {
                                j5 = j;
                            }
                            jY = tj0.y(j5, h02Var);
                            i17 = i15 & (-29360129);
                            i18 = i3 & 256;
                            g73 g73Var11119 = g73.g;
                            if (i18 != 0) {
                                i19 = (-264241153) & i15;
                                qo5VarQ = mq2.q(h02Var);
                            } else {
                                qo5VarQ = qo5Var;
                                i19 = i17;
                            }
                            bz1Var5 = bz1Var5;
                            r15 = g73Var11119;
                        }
                        h02Var.s();
                        i20 = (234881024 & i19) ^ 100663296;
                        if (i20 > 67108864) {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i21 = 100663296;
                            if ((i19 & 100663296) != 67108864) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        objK = h02Var.K();
                        long j111116 = j5;
                        Object obj116 = oo0.g;
                        if (z2) {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        } else {
                            objK = new tb3(qo5VarQ);
                            h02Var.i0(objK);
                        }
                        tb3Var = (tb3) objK;
                        zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                        objK2 = h02Var.K();
                        if (zX) {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        } else {
                            objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var111111111112 = bz1Var5;
                        bz1 bz1Var111111111113 = bz1Var6;
                        bz1 bz1Var111111111114 = bz1Var7;
                        bz1 bz1Var111111111115 = bz1Var8;
                        int i211114 = i11;
                        long j111117 = jY;
                        qo5 qo5Var118 = qo5VarQ;
                        uz4.g(yf2.U(r15, (xy1) objK2), null, j111116, j111117, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211114, bz1Var111111111112, nm0Var, bz1Var111111111114, bz1Var111111111115, tb3Var, bz1Var111111111113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                        j4 = j111116;
                        j3 = j111117;
                        r1 = r15;
                        bz1Var5 = bz1Var111111111112;
                        bz1Var9 = bz1Var111111111113;
                        bz1Var10 = bz1Var111111111114;
                        bz1Var11 = bz1Var111111111115;
                        qo5Var2 = qo5Var118;
                        i16 = i211114;
                    } else {
                        h02Var.Q();
                        r1 = j73Var;
                        j3 = j2;
                        bz1Var9 = bz1Var6;
                        bz1Var10 = bz1Var7;
                        bz1Var11 = bz1Var8;
                        i16 = i11;
                        j4 = j;
                        qo5Var2 = qo5Var;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: sd4
                            @Override // defpackage.bz1
                            public final Object l(Object obj117, Object obj118) {
                                ((Integer) obj118).getClass();
                                int iJ = aq2.J(i2 | 1);
                                kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj117, iJ, i3);
                                return og5.g;
                            }
                        };
                    }
                }
                i14 = i23;
                i15 = i211113 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111110 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111110;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111111 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111111;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j111118 = j5;
                    Object obj117 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var111111111116 = bz1Var5;
                    bz1 bz1Var111111111117 = bz1Var6;
                    bz1 bz1Var111111111118 = bz1Var7;
                    bz1 bz1Var111111111119 = bz1Var8;
                    int i211115 = i11;
                    long j111119 = jY;
                    qo5 qo5Var119 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j111118, j111119, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211115, bz1Var111111111116, nm0Var, bz1Var111111111118, bz1Var111111111119, tb3Var, bz1Var111111111117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j111118;
                    j3 = j111119;
                    r1 = r15;
                    bz1Var5 = bz1Var111111111116;
                    bz1Var9 = bz1Var111111111117;
                    bz1Var10 = bz1Var111111111118;
                    bz1Var11 = bz1Var111111111119;
                    qo5Var2 = qo5Var119;
                    i16 = i211115;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj118, Object obj119) {
                            ((Integer) obj119).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj118, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i22 |= 24576;
            bz1Var8 = bz1Var4;
            i10 = i3 & 32;
            if (i10 != 0) {
                i13 = i22 | 196608;
                i11 = i;
            } else {
                i11 = i;
                if (h02Var.n(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i22 | i12;
            }
            int i211116 = i13;
            if ((i3 & 64) == 0) {
                i14 = i23;
                if (h02Var.v(j)) {
                }
                i15 = i211116 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111112 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111112;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111113 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111113;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j1111110 = j5;
                    Object obj118 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var1111111111110 = bz1Var5;
                    bz1 bz1Var1111111111111 = bz1Var6;
                    bz1 bz1Var1111111111112 = bz1Var7;
                    bz1 bz1Var1111111111113 = bz1Var8;
                    int i211117 = i11;
                    long j1111111 = jY;
                    qo5 qo5Var1110 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j1111110, j1111111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211117, bz1Var1111111111110, nm0Var, bz1Var1111111111112, bz1Var1111111111113, tb3Var, bz1Var1111111111111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j1111110;
                    j3 = j1111111;
                    r1 = r15;
                    bz1Var5 = bz1Var1111111111110;
                    bz1Var9 = bz1Var1111111111111;
                    bz1Var10 = bz1Var1111111111112;
                    bz1Var11 = bz1Var1111111111113;
                    qo5Var2 = qo5Var1110;
                    i16 = i211117;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj119, Object obj1110) {
                            ((Integer) obj1110).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj119, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i14 = i23;
            i15 = i211116 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
            if ((i15 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var111114 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var111114;
                } else {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var111115 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var111115;
                }
                h02Var.s();
                i20 = (234881024 & i19) ^ 100663296;
                if (i20 > 67108864) {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objK = h02Var.K();
                long j1111112 = j5;
                Object obj119 = oo0.g;
                if (z2) {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                } else {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                }
                tb3Var = (tb3) objK;
                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                }
                bz1 bz1Var1111111111114 = bz1Var5;
                bz1 bz1Var1111111111115 = bz1Var6;
                bz1 bz1Var1111111111116 = bz1Var7;
                bz1 bz1Var1111111111117 = bz1Var8;
                int i211118 = i11;
                long j1111113 = jY;
                qo5 qo5Var1111 = qo5VarQ;
                uz4.g(yf2.U(r15, (xy1) objK2), null, j1111112, j1111113, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i211118, bz1Var1111111111114, nm0Var, bz1Var1111111111116, bz1Var1111111111117, tb3Var, bz1Var1111111111115), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                j4 = j1111112;
                j3 = j1111113;
                r1 = r15;
                bz1Var5 = bz1Var1111111111114;
                bz1Var9 = bz1Var1111111111115;
                bz1Var10 = bz1Var1111111111116;
                bz1Var11 = bz1Var1111111111117;
                qo5Var2 = qo5Var1111;
                i16 = i211118;
            } else {
                h02Var.Q();
                r1 = j73Var;
                j3 = j2;
                bz1Var9 = bz1Var6;
                bz1Var10 = bz1Var7;
                bz1Var11 = bz1Var8;
                i16 = i11;
                j4 = j;
                qo5Var2 = qo5Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: sd4
                    @Override // defpackage.bz1
                    public final Object l(Object obj1110, Object obj1111) {
                        ((Integer) obj1111).getClass();
                        int iJ = aq2.J(i2 | 1);
                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj1110, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i22 |= 3072;
        bz1Var7 = bz1Var3;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i2 & 24576) == 0) {
                bz1Var8 = bz1Var4;
                if (h02Var.j(bz1Var8)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i22 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                i13 = i22 | 196608;
                i11 = i;
            } else {
                i11 = i;
                if (h02Var.n(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i13 = i22 | i12;
            }
            int i211119 = i13;
            if ((i3 & 64) == 0) {
                i14 = i23;
                if (h02Var.v(j)) {
                }
                i15 = i211119 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
                if ((i15 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111116 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111116;
                    } else {
                        if (i14 != 0) {
                            bz1Var5 = jn0.g;
                        }
                        if (i4 != 0) {
                            bz1Var6 = jn0.y;
                        }
                        if (i6 != 0) {
                            bz1Var7 = jn0.r;
                        }
                        if (i8 != 0) {
                            bz1Var8 = jn0.n;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if ((i3 & 64) != 0) {
                            j5 = ((rj0) h02Var.a(tj0.g)).c;
                            i15 &= -3670017;
                        } else {
                            j5 = j;
                        }
                        jY = tj0.y(j5, h02Var);
                        i17 = i15 & (-29360129);
                        i18 = i3 & 256;
                        g73 g73Var111117 = g73.g;
                        if (i18 != 0) {
                            i19 = (-264241153) & i15;
                            qo5VarQ = mq2.q(h02Var);
                        } else {
                            qo5VarQ = qo5Var;
                            i19 = i17;
                        }
                        bz1Var5 = bz1Var5;
                        r15 = g73Var111117;
                    }
                    h02Var.s();
                    i20 = (234881024 & i19) ^ 100663296;
                    if (i20 > 67108864) {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i21 = 100663296;
                        if ((i19 & 100663296) != 67108864) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    objK = h02Var.K();
                    long j1111114 = j5;
                    Object obj1110 = oo0.g;
                    if (z2) {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    } else {
                        objK = new tb3(qo5VarQ);
                        h02Var.i0(objK);
                    }
                    tb3Var = (tb3) objK;
                    zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                    objK2 = h02Var.K();
                    if (zX) {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    } else {
                        objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                        h02Var.i0(objK2);
                    }
                    bz1 bz1Var1111111111118 = bz1Var5;
                    bz1 bz1Var1111111111119 = bz1Var6;
                    bz1 bz1Var11111111111110 = bz1Var7;
                    bz1 bz1Var11111111111111 = bz1Var8;
                    int i2111110 = i11;
                    long j1111115 = jY;
                    qo5 qo5Var1112 = qo5VarQ;
                    uz4.g(yf2.U(r15, (xy1) objK2), null, j1111114, j1111115, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2111110, bz1Var1111111111118, nm0Var, bz1Var11111111111110, bz1Var11111111111111, tb3Var, bz1Var1111111111119), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                    j4 = j1111114;
                    j3 = j1111115;
                    r1 = r15;
                    bz1Var5 = bz1Var1111111111118;
                    bz1Var9 = bz1Var1111111111119;
                    bz1Var10 = bz1Var11111111111110;
                    bz1Var11 = bz1Var11111111111111;
                    qo5Var2 = qo5Var1112;
                    i16 = i2111110;
                } else {
                    h02Var.Q();
                    r1 = j73Var;
                    j3 = j2;
                    bz1Var9 = bz1Var6;
                    bz1Var10 = bz1Var7;
                    bz1Var11 = bz1Var8;
                    i16 = i11;
                    j4 = j;
                    qo5Var2 = qo5Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: sd4
                        @Override // defpackage.bz1
                        public final Object l(Object obj1111, Object obj1112) {
                            ((Integer) obj1112).getClass();
                            int iJ = aq2.J(i2 | 1);
                            kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj1111, iJ, i3);
                            return og5.g;
                        }
                    };
                }
            }
            i14 = i23;
            i15 = i211119 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
            if ((i15 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var111118 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var111118;
                } else {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var111119 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var111119;
                }
                h02Var.s();
                i20 = (234881024 & i19) ^ 100663296;
                if (i20 > 67108864) {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objK = h02Var.K();
                long j1111116 = j5;
                Object obj1111 = oo0.g;
                if (z2) {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                } else {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                }
                tb3Var = (tb3) objK;
                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                }
                bz1 bz1Var11111111111112 = bz1Var5;
                bz1 bz1Var11111111111113 = bz1Var6;
                bz1 bz1Var11111111111114 = bz1Var7;
                bz1 bz1Var11111111111115 = bz1Var8;
                int i2111111 = i11;
                long j1111117 = jY;
                qo5 qo5Var1113 = qo5VarQ;
                uz4.g(yf2.U(r15, (xy1) objK2), null, j1111116, j1111117, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2111111, bz1Var11111111111112, nm0Var, bz1Var11111111111114, bz1Var11111111111115, tb3Var, bz1Var11111111111113), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                j4 = j1111116;
                j3 = j1111117;
                r1 = r15;
                bz1Var5 = bz1Var11111111111112;
                bz1Var9 = bz1Var11111111111113;
                bz1Var10 = bz1Var11111111111114;
                bz1Var11 = bz1Var11111111111115;
                qo5Var2 = qo5Var1113;
                i16 = i2111111;
            } else {
                h02Var.Q();
                r1 = j73Var;
                j3 = j2;
                bz1Var9 = bz1Var6;
                bz1Var10 = bz1Var7;
                bz1Var11 = bz1Var8;
                i16 = i11;
                j4 = j;
                qo5Var2 = qo5Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: sd4
                    @Override // defpackage.bz1
                    public final Object l(Object obj1112, Object obj1113) {
                        ((Integer) obj1113).getClass();
                        int iJ = aq2.J(i2 | 1);
                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj1112, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i22 |= 24576;
        bz1Var8 = bz1Var4;
        i10 = i3 & 32;
        if (i10 != 0) {
            i13 = i22 | 196608;
            i11 = i;
        } else {
            i11 = i;
            if (h02Var.n(i11)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i13 = i22 | i12;
        }
        int i2111112 = i13;
        if ((i3 & 64) == 0) {
            i14 = i23;
            if (h02Var.v(j)) {
            }
            i15 = i2111112 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
            if ((i15 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var1111110 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var1111110;
                } else {
                    if (i14 != 0) {
                        bz1Var5 = jn0.g;
                    }
                    if (i4 != 0) {
                        bz1Var6 = jn0.y;
                    }
                    if (i6 != 0) {
                        bz1Var7 = jn0.r;
                    }
                    if (i8 != 0) {
                        bz1Var8 = jn0.n;
                    }
                    if (i10 != 0) {
                        i11 = 2;
                    }
                    if ((i3 & 64) != 0) {
                        j5 = ((rj0) h02Var.a(tj0.g)).c;
                        i15 &= -3670017;
                    } else {
                        j5 = j;
                    }
                    jY = tj0.y(j5, h02Var);
                    i17 = i15 & (-29360129);
                    i18 = i3 & 256;
                    g73 g73Var1111111 = g73.g;
                    if (i18 != 0) {
                        i19 = (-264241153) & i15;
                        qo5VarQ = mq2.q(h02Var);
                    } else {
                        qo5VarQ = qo5Var;
                        i19 = i17;
                    }
                    bz1Var5 = bz1Var5;
                    r15 = g73Var1111111;
                }
                h02Var.s();
                i20 = (234881024 & i19) ^ 100663296;
                if (i20 > 67108864) {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    i21 = 100663296;
                    if ((i19 & 100663296) != 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                objK = h02Var.K();
                long j1111118 = j5;
                Object obj1112 = oo0.g;
                if (z2) {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                } else {
                    objK = new tb3(qo5VarQ);
                    h02Var.i0(objK);
                }
                tb3Var = (tb3) objK;
                zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
                objK2 = h02Var.K();
                if (zX) {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                } else {
                    objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                    h02Var.i0(objK2);
                }
                bz1 bz1Var11111111111116 = bz1Var5;
                bz1 bz1Var11111111111117 = bz1Var6;
                bz1 bz1Var11111111111118 = bz1Var7;
                bz1 bz1Var11111111111119 = bz1Var8;
                int i2111113 = i11;
                long j1111119 = jY;
                qo5 qo5Var1114 = qo5VarQ;
                uz4.g(yf2.U(r15, (xy1) objK2), null, j1111118, j1111119, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2111113, bz1Var11111111111116, nm0Var, bz1Var11111111111118, bz1Var11111111111119, tb3Var, bz1Var11111111111117), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
                j4 = j1111118;
                j3 = j1111119;
                r1 = r15;
                bz1Var5 = bz1Var11111111111116;
                bz1Var9 = bz1Var11111111111117;
                bz1Var10 = bz1Var11111111111118;
                bz1Var11 = bz1Var11111111111119;
                qo5Var2 = qo5Var1114;
                i16 = i2111113;
            } else {
                h02Var.Q();
                r1 = j73Var;
                j3 = j2;
                bz1Var9 = bz1Var6;
                bz1Var10 = bz1Var7;
                bz1Var11 = bz1Var8;
                i16 = i11;
                j4 = j;
                qo5Var2 = qo5Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: sd4
                    @Override // defpackage.bz1
                    public final Object l(Object obj1113, Object obj1114) {
                        ((Integer) obj1114).getClass();
                        int iJ = aq2.J(i2 | 1);
                        kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj1113, iJ, i3);
                        return og5.g;
                    }
                };
            }
        }
        i14 = i23;
        i15 = i2111112 | i25 | 4194304 | (((i3 & 256) == 0 || !h02Var.x(qo5Var)) ? 33554432 : 67108864);
        if ((i15 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i15 & 1, z)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    bz1Var5 = jn0.g;
                }
                if (i4 != 0) {
                    bz1Var6 = jn0.y;
                }
                if (i6 != 0) {
                    bz1Var7 = jn0.r;
                }
                if (i8 != 0) {
                    bz1Var8 = jn0.n;
                }
                if (i10 != 0) {
                    i11 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                    i15 &= -3670017;
                } else {
                    j5 = j;
                }
                jY = tj0.y(j5, h02Var);
                i17 = i15 & (-29360129);
                i18 = i3 & 256;
                g73 g73Var1111112 = g73.g;
                if (i18 != 0) {
                    i19 = (-264241153) & i15;
                    qo5VarQ = mq2.q(h02Var);
                } else {
                    qo5VarQ = qo5Var;
                    i19 = i17;
                }
                bz1Var5 = bz1Var5;
                r15 = g73Var1111112;
            } else {
                if (i14 != 0) {
                    bz1Var5 = jn0.g;
                }
                if (i4 != 0) {
                    bz1Var6 = jn0.y;
                }
                if (i6 != 0) {
                    bz1Var7 = jn0.r;
                }
                if (i8 != 0) {
                    bz1Var8 = jn0.n;
                }
                if (i10 != 0) {
                    i11 = 2;
                }
                if ((i3 & 64) != 0) {
                    j5 = ((rj0) h02Var.a(tj0.g)).c;
                    i15 &= -3670017;
                } else {
                    j5 = j;
                }
                jY = tj0.y(j5, h02Var);
                i17 = i15 & (-29360129);
                i18 = i3 & 256;
                g73 g73Var1111113 = g73.g;
                if (i18 != 0) {
                    i19 = (-264241153) & i15;
                    qo5VarQ = mq2.q(h02Var);
                } else {
                    qo5VarQ = qo5Var;
                    i19 = i17;
                }
                bz1Var5 = bz1Var5;
                r15 = g73Var1111113;
            }
            h02Var.s();
            i20 = (234881024 & i19) ^ 100663296;
            if (i20 > 67108864) {
                i21 = 100663296;
                if ((i19 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                i21 = 100663296;
                if ((i19 & 100663296) != 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            objK = h02Var.K();
            long j11111110 = j5;
            Object obj1113 = oo0.g;
            if (z2) {
                objK = new tb3(qo5VarQ);
                h02Var.i0(objK);
            } else {
                objK = new tb3(qo5VarQ);
                h02Var.i0(objK);
            }
            tb3Var = (tb3) objK;
            zX = h02Var.x(tb3Var) | ((i20 <= 67108864 && h02Var.x(qo5VarQ)) || (i19 & i21) == 67108864);
            objK2 = h02Var.K();
            if (zX) {
                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                h02Var.i0(objK2);
            } else {
                objK2 = new xf(tb3Var, qo5VarQ, (byte) 25);
                h02Var.i0(objK2);
            }
            bz1 bz1Var111111111111110 = bz1Var5;
            bz1 bz1Var111111111111111 = bz1Var6;
            bz1 bz1Var111111111111112 = bz1Var7;
            bz1 bz1Var111111111111113 = bz1Var8;
            int i2111114 = i11;
            long j11111111 = jY;
            qo5 qo5Var1115 = qo5VarQ;
            uz4.g(yf2.U(r15, (xy1) objK2), null, j11111110, j11111111, 0.0f, 0.0f, null, ue5.m0(848889571, new wd4(i2111114, bz1Var111111111111110, nm0Var, bz1Var111111111111112, bz1Var111111111111113, tb3Var, bz1Var111111111111111), h02Var), h02Var, ((i19 >> 12) & 896) | 12582912, 114);
            j4 = j11111110;
            j3 = j11111111;
            r1 = r15;
            bz1Var5 = bz1Var111111111111110;
            bz1Var9 = bz1Var111111111111111;
            bz1Var10 = bz1Var111111111111112;
            bz1Var11 = bz1Var111111111111113;
            qo5Var2 = qo5Var1115;
            i16 = i2111114;
        } else {
            h02Var.Q();
            r1 = j73Var;
            j3 = j2;
            bz1Var9 = bz1Var6;
            bz1Var10 = bz1Var7;
            bz1Var11 = bz1Var8;
            i16 = i11;
            j4 = j;
            qo5Var2 = qo5Var;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: sd4
                @Override // defpackage.bz1
                public final Object l(Object obj1114, Object obj1115) {
                    ((Integer) obj1115).getClass();
                    int iJ = aq2.J(i2 | 1);
                    kq2.v(r1, bz1Var5, bz1Var9, bz1Var10, bz1Var11, i16, j4, j3, qo5Var2, nm0Var, (h02) obj1114, iJ, i3);
                    return og5.g;
                }
            };
        }
    }

    public static final Object w(pi piVar, Float f, oi oiVar, boolean z, xy1 xy1Var, ou0 ou0Var) {
        Object objA = a(piVar, new t25(oiVar, piVar.j, piVar.t.getValue(), f, piVar.a), z ? piVar.m : Long.MIN_VALUE, xy1Var, ou0Var);
        return objA == px0.j ? objA : og5.g;
    }

    public static final void x(final int i, final bz1 bz1Var, final nm0 nm0Var, final bz1 bz1Var2, final bz1 bz1Var3, final qo5 qo5Var, final bz1 bz1Var4, h02 h02Var, final int i2) {
        int i3;
        int i4;
        h02Var.Z(-280287501);
        int i5 = i2 | (h02Var.n(i) ? 4 : 2) | (h02Var.j(bz1Var) ? 32 : 16) | (h02Var.j(nm0Var) ? 256 : 128) | (h02Var.j(bz1Var2) ? 2048 : 1024) | (h02Var.j(bz1Var3) ? 16384 : 8192) | (h02Var.x(qo5Var) ? 131072 : 65536) | (h02Var.j(bz1Var4) ? 1048576 : 524288);
        byte b = 1;
        if (h02Var.N(i5 & 1, (599187 & i5) != 599186)) {
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = new yd4();
                h02Var.i0(objK);
            }
            final yd4 yd4Var = (yd4) objK;
            boolean z = (i5 & 112) == 32;
            Object objK2 = h02Var.K();
            byte b2 = 3;
            if (z || objK2 == obj) {
                objK2 = new nm0(605195056, true, new xd4(bz1Var, b2));
                h02Var.i0(objK2);
            }
            final bz1 bz1Var5 = (bz1) objK2;
            boolean z2 = (i5 & 7168) == 2048;
            Object objK3 = h02Var.K();
            if (z2 || objK3 == obj) {
                objK3 = new nm0(418899191, true, new xd4(bz1Var2, (byte) 2));
                h02Var.i0(objK3);
            }
            final bz1 bz1Var6 = (bz1) objK3;
            boolean z3 = (57344 & i5) == 16384;
            Object objK4 = h02Var.K();
            if (z3 || objK4 == obj) {
                objK4 = new nm0(338600263, true, new xd4(bz1Var3, b));
                h02Var.i0(objK4);
            }
            final bz1 bz1Var7 = (bz1) objK4;
            boolean z4 = (i5 & 896) == 256;
            Object objK5 = h02Var.K();
            if (z4 || objK5 == obj) {
                objK5 = new nm0(-1776388365, true, new m90(nm0Var, yd4Var, (byte) 3));
                h02Var.i0(objK5);
            }
            final bz1 bz1Var8 = (bz1) objK5;
            boolean z5 = (i5 & 3670016) == 1048576;
            Object objK6 = h02Var.K();
            if (z5 || objK6 == obj) {
                objK6 = new nm0(-1731662488, true, new xd4(bz1Var4, (byte) 0));
                h02Var.i0(objK6);
            }
            final bz1 bz1Var9 = (bz1) objK6;
            boolean zX = ((i5 & 458752) == 131072) | h02Var.x(bz1Var5) | h02Var.x(bz1Var6) | h02Var.x(bz1Var7) | ((i5 & 14) == 4) | h02Var.x(bz1Var9) | h02Var.x(bz1Var8);
            Object objK7 = h02Var.K();
            if (zX || objK7 == obj) {
                i3 = 1;
                i4 = 0;
                Object obj2 = new bz1() { // from class: td4
                    @Override // defpackage.bz1
                    public final Object l(Object obj3, Object obj4) {
                        int i6;
                        int iV;
                        int iV2;
                        dn1 dn1Var;
                        Integer numValueOf;
                        int i7;
                        int iIntValue;
                        int iV3;
                        int iG;
                        final qy4 qy4Var = (qy4) obj3;
                        ws0 ws0Var = (ws0) obj4;
                        final int iT = ws0.t(ws0Var.g);
                        final int iJ = ws0.j(ws0Var.g);
                        long jY = ws0.y(ws0Var.g, 0, 0, 0, 0, 10);
                        fl2 layoutDirection = qy4Var.getLayoutDirection();
                        final qo5 qo5Var2 = qo5Var;
                        int iN = qo5Var2.n(qy4Var, layoutDirection);
                        int iR = qo5Var2.r(qy4Var, qy4Var.getLayoutDirection());
                        int iG2 = qo5Var2.g(qy4Var);
                        final us3 us3VarV = ((p33) cj0.j0(qy4Var.J(bz1Var5, zd4.j))).v(jY);
                        int i8 = (-iN) - iR;
                        int i9 = -iG2;
                        final us3 us3VarV2 = ((p33) cj0.j0(qy4Var.J(bz1Var6, zd4.a))).v(zs0.t(i8, i9, jY));
                        final us3 us3VarV3 = ((p33) cj0.j0(qy4Var.J(bz1Var7, zd4.m))).v(zs0.t(i8, i9, jY));
                        int i10 = us3VarV3.j;
                        byte b3 = i;
                        if (i10 == 0 && us3VarV3.t == 0) {
                            dn1Var = null;
                        } else {
                            int i11 = us3VarV3.t;
                            fl2 fl2Var = fl2.j;
                            if (b3 == 0) {
                                i6 = iN;
                                if (qy4Var.getLayoutDirection() == fl2Var) {
                                    iV = qy4Var.V(16.0f);
                                    iV2 = iV + i6;
                                } else {
                                    iV2 = ((iT - qy4Var.V(16.0f)) - i10) - iR;
                                }
                            } else {
                                i6 = iN;
                                if (b3 != 2 && b3 != 3) {
                                    iV2 = (((iT - i10) + i6) - iR) / 2;
                                } else if (qy4Var.getLayoutDirection() == fl2Var) {
                                    iV2 = ((iT - qy4Var.V(16.0f)) - i10) - iR;
                                } else {
                                    iV = qy4Var.V(16.0f);
                                    iV2 = iV + i6;
                                }
                            }
                            dn1Var = new dn1();
                            dn1Var.g = iV2;
                            dn1Var.y = i11;
                        }
                        final us3 us3VarV4 = ((p33) cj0.j0(qy4Var.J(bz1Var9, zd4.q))).v(jY);
                        boolean z6 = us3VarV4.j == 0 && us3VarV4.t == 0;
                        if (dn1Var != null) {
                            int i12 = dn1Var.y;
                            if (z6 || b3 == 3) {
                                iV3 = qy4Var.V(16.0f) + i12;
                                iG = qo5Var2.g(qy4Var);
                            } else {
                                iV3 = us3VarV4.t + i12;
                                iG = qy4Var.V(16.0f);
                            }
                            numValueOf = Integer.valueOf(iG + iV3);
                        } else {
                            numValueOf = null;
                        }
                        int i13 = us3VarV2.t;
                        if (i13 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(us3VarV4.t);
                                if (z6) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : qo5Var2.g(qy4Var);
                            }
                            i7 = i13 + iIntValue;
                        } else {
                            i7 = 0;
                        }
                        wd2 wd2Var = new wd2(qo5Var2, qy4Var);
                        final dn1 dn1Var2 = dn1Var;
                        yd4Var.g.setValue(new bo3(ue5.A(wd2Var, qy4Var.getLayoutDirection()), (us3VarV.j == 0 && us3VarV.t == 0) ? wd2Var.n() : qy4Var.y0(us3VarV.t), ue5.e(wd2Var, qy4Var.getLayoutDirection()), z6 ? wd2Var.r() : qy4Var.y0(us3VarV4.t)));
                        final us3 us3VarV5 = ((p33) cj0.j0(qy4Var.J(bz1Var8, zd4.t))).v(jY);
                        final Integer num = numValueOf;
                        final int i14 = i7;
                        return qy4Var.k0(iT, iJ, qi1.j, new xy1() { // from class: vd4
                            @Override // defpackage.xy1
                            public final Object a(Object obj5) {
                                ts3 ts3Var = (ts3) obj5;
                                ts3Var.j(us3VarV5, 0, 0, 0.0f);
                                ts3Var.j(us3VarV, 0, 0, 0.0f);
                                us3 us3Var = us3VarV2;
                                int i15 = iT - us3Var.j;
                                qy4 qy4Var2 = qy4Var;
                                fl2 layoutDirection2 = qy4Var2.getLayoutDirection();
                                qo5 qo5Var3 = qo5Var2;
                                int iN2 = ((qo5Var3.n(qy4Var2, layoutDirection2) + i15) - qo5Var3.r(qy4Var2, qy4Var2.getLayoutDirection())) / 2;
                                int i16 = iJ;
                                ts3Var.j(us3Var, iN2, i16 - i14, 0.0f);
                                us3 us3Var2 = us3VarV4;
                                ts3Var.j(us3Var2, 0, i16 - us3Var2.t, 0.0f);
                                dn1 dn1Var3 = dn1Var2;
                                if (dn1Var3 != null) {
                                    int i17 = dn1Var3.g;
                                    Integer num2 = num;
                                    num2.getClass();
                                    ts3Var.j(us3VarV3, i17, i16 - num2.intValue(), 0.0f);
                                }
                                return og5.g;
                            }
                        });
                    }
                };
                h02Var.i0(obj2);
                objK7 = obj2;
            } else {
                i3 = 1;
                i4 = 0;
            }
            gp4.o(null, (bz1) objK7, h02Var, i4, i3);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(i, bz1Var, nm0Var, bz1Var2, bz1Var3, qo5Var, bz1Var4, i2) { // from class: ud4
                public final /* synthetic */ nm0 a;
                public final /* synthetic */ bz1 c;
                public final /* synthetic */ byte j;
                public final /* synthetic */ bz1 m;
                public final /* synthetic */ bz1 q;
                public final /* synthetic */ bz1 t;
                public final /* synthetic */ qo5 w;

                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iJ = aq2.J(1);
                    kq2.x(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj3, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void y(mc3 mc3Var, qc4 qc4Var, nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(233973821);
        int i2 = (h02Var.j(mc3Var) ? 4 : 2) | i | (h02Var.j(qc4Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            og0.r(new m14[]{rx2.g.g(mc3Var), ix2.g.g(mc3Var), qx2.g.g(mc3Var)}, ue5.m0(1808964477, new oc3(qc4Var, mc3Var, nm0Var), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new oc3(mc3Var, qc4Var, nm0Var, i);
        }
    }

    public static ob3 z() {
        return new tp3(og5.g, hi0.B);
    }
}
