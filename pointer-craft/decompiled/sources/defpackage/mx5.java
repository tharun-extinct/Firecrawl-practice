package defpackage;

import android.os.LocaleList;
import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mx5 {
    public static final i72 g = new i72(null, (byte) 0);
    public static final i72 y = new i72(null, (byte) 1);

    public static final void g(final String str, o22 o22Var, j85 j85Var, int i, h02 h02Var, final int i2, final int i3) {
        int i4;
        h02Var.Z(-192911377);
        int i5 = (h02Var.x(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (h02Var.x(o22Var) ? 32 : 16);
        }
        int i7 = i4 | (((i3 & 4) == 0 && h02Var.x(j85Var)) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= h02Var.n(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && h02Var.e()) {
            h02Var.Q();
        } else {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                if (i6 != 0) {
                    o22Var = m22.g;
                }
                if ((i3 & 4) != 0) {
                    j85Var = n45.g;
                }
                if (i8 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                h02Var.Q();
            }
            h02Var.s();
            h02Var.Y(1849434622);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = f75.i;
                h02Var.i0(objK);
            }
            byte b = 0;
            h02Var.b(false);
            my1 my1Var = (my1) ((nz1) objK);
            h02Var.Y(-1115894518);
            h02Var.Y(1886828752);
            if (!(h02Var.g instanceof lq)) {
                pw5.f();
                throw null;
            }
            h02Var.V();
            if (h02Var.S) {
                h02Var.m(new p22(my1Var, b));
            } else {
                h02Var.l0();
            }
            xs2.E(new vq0((byte) 27), h02Var, str);
            xs2.E(new vq0((byte) 28), h02Var, o22Var);
            xs2.E(new vq0((byte) 29), h02Var, j85Var);
            c75 c75Var = new c75();
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(i))) {
                h02Var.i0(Integer.valueOf(i));
                h02Var.y(c75Var, Integer.valueOf(i));
            }
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        final o22 o22Var2 = o22Var;
        final j85 j85Var2 = j85Var;
        final int i9 = i;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: d75
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mx5.g(str, o22Var2, j85Var2, i9, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static void l(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    public static final int n(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final long r(KeyEvent keyEvent) {
        return vx5.n(keyEvent.getKeyCode());
    }

    public static final boolean v(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean x(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static LocaleList y(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
