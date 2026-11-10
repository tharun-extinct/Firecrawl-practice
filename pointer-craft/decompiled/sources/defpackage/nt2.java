package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class nt2 {
    public final View g;
    public bl5 l;
    public Rect q;
    public mt2 v;
    public final ht2 w;
    public b65 x;
    public final cd2 y;
    public xy1 r = new m92((byte) 7);
    public xy1 n = new m92((byte) 8);
    public k65 j = new k65("", u75.y, 4);
    public ma2 t = ma2.l;
    public final ArrayList a = new ArrayList();
    public final wp2 m = v13.u(bt2.t, new qd((Object) this, (byte) 28));

    public nt2(View view, sc scVar, cd2 cd2Var) {
        this.g = view;
        this.y = cd2Var;
        this.w = new ht2(scVar, cd2Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[PHI: r15
  0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final h44 g(EditorInfo editorInfo) {
        int i;
        int i2;
        k65 k65Var = this.j;
        String str = k65Var.g.t;
        long j = k65Var.y;
        ma2 ma2Var = this.t;
        int i3 = ma2Var.v;
        int i4 = ma2Var.n;
        boolean z = ma2Var.g;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                l0.z("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        tx2 tx2Var = ma2Var.x;
        if (yf2.p(tx2Var, tx2.a)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(dj0.Y(tx2Var, 10));
            Iterator it = tx2Var.j.iterator();
            while (it.hasNext()) {
                arrayList.add(((sx2) it.next()).g);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        byte b = 19;
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    l0.z("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (ma2Var.v == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i6 = ma2Var.y;
            if (i6 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i6 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i6 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (ma2Var.r) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i7 = u75.r;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        za6.q(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!gy4.g || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                xg1.y(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                xg1.y(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(pw5.d(oc.w(), oc.d(), oc.h(), oc.f(), oc.e(), oc.A(), oc.B()));
            editorInfo.setSupportedHandwritingGesturePreviews(pr.l0(new Class[]{oc.w(), oc.d(), oc.h(), oc.f()}));
        }
        it2 it2Var = jt2.g;
        if (ph1.n()) {
            ph1.g().t(editorInfo);
        }
        h44 h44Var = new h44(this.j, new fa4(this, b), this.t.r, this.v, this.x, this.l);
        this.a.add(new WeakReference(h44Var));
        return h44Var;
    }
}
