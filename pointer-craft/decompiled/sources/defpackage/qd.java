package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qd implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ qd(nm1 nm1Var, yt4 yt4Var) {
        this.j = (byte) 17;
        this.t = nm1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        e62 e62Var;
        boolean z;
        byte b;
        boolean z2;
        boolean z3;
        tv2 tv2Var;
        yo0 yo0Var;
        boolean z4 = true;
        boolean z5 = true;
        mu0 mu0Var = null;
        boolean z6 = false;
        switch (this.j) {
            case 0:
                k33.d(((td) this.t).a, null);
                return og5.g;
            case 1:
                c93.A((ie) this.t);
                return og5.g;
            case 2:
                return ((w35) this.t).z0();
            case 3:
                return og5.g;
            case 4:
                ((eq) this.t).j.getValue();
                return og5.g;
            case 5:
                h62 h62Var = ((qr0) this.t).j;
                if (h62Var.n && (e62Var = h62Var.r) != null) {
                    e62Var.f(false);
                }
                return og5.g;
            case 6:
                ci0 ci0Var = (ci0) this.t;
                String str = "appground.io/keyboard";
                cj cjVar = new cj(str);
                ClipboardManager clipboardManagerG = ((h9) ci0Var).g();
                String str2 = "plain text";
                List list = pi1.j;
                ArrayList arrayList = cjVar.a;
                CharSequence charSequence = str;
                if (!(arrayList == null ? list : arrayList).isEmpty()) {
                    SpannableString spannableString = new SpannableString("appground.io/keyboard");
                    v92 v92Var = new v92((byte) 15, z6);
                    v92Var.t = Parcel.obtain();
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    int i = 0;
                    for (int size = list.size(); i < size; size = size) {
                        bj bjVar = (bj) list.get(i);
                        ju4 ju4Var = (ju4) bjVar.g;
                        int i2 = bjVar.y;
                        int i3 = bjVar.r;
                        ((Parcel) v92Var.t).recycle();
                        v92Var.t = Parcel.obtain();
                        m65 m65Var = ju4Var.g;
                        String str3 = str2;
                        long j = ju4Var.q;
                        long j2 = ju4Var.j;
                        long j3 = ju4Var.y;
                        List list2 = list;
                        SpannableString spannableString2 = spannableString;
                        long jY = m65Var.y();
                        int i4 = i;
                        long j4 = jj0.j;
                        if (!tf5.g(jY, j4)) {
                            v92Var.B((byte) 1);
                            ((Parcel) v92Var.t).writeLong(a11.D(ju4Var.g.y()));
                        }
                        long j5 = n85.r;
                        if (!n85.g(j3, j5)) {
                            v92Var.B((byte) 2);
                            v92Var.D(j3);
                        }
                        qv1 qv1Var = ju4Var.r;
                        if (qv1Var != null) {
                            v92Var.B((byte) 3);
                            ((Parcel) v92Var.t).writeInt(qv1Var.j);
                        }
                        lv1 lv1Var = ju4Var.n;
                        if (lv1Var != null) {
                            int i5 = lv1Var.g;
                            v92Var.B((byte) 4);
                            v92Var.B((i5 != 0 && i5 == 1) ? (byte) 1 : (byte) 0);
                        }
                        mv1 mv1Var = ju4Var.v;
                        if (mv1Var != null) {
                            int i6 = mv1Var.g;
                            v92Var.B((byte) 5);
                            if (i6 == 0) {
                                b = 0;
                            } else {
                                if (i6 == 65535) {
                                    b = 1;
                                } else {
                                    z = true;
                                    b = i6 == 1 ? (byte) 2 : i6 == 2 ? (byte) 3 : (byte) 0;
                                }
                                v92Var.B(b);
                            }
                            z = true;
                            v92Var.B(b);
                        } else {
                            z = true;
                        }
                        String str4 = ju4Var.l;
                        if (str4 != null) {
                            v92Var.B((byte) 6);
                            ((Parcel) v92Var.t).writeString(str4);
                        }
                        if (!n85.g(j2, j5)) {
                            v92Var.B((byte) 7);
                            v92Var.D(j2);
                        }
                        ry ryVar = ju4Var.t;
                        if (ryVar != null) {
                            float f = ryVar.g;
                            v92Var.B((byte) 8);
                            v92Var.C(f);
                        }
                        n65 n65Var = ju4Var.a;
                        if (n65Var != null) {
                            v92Var.B((byte) 9);
                            v92Var.C(n65Var.g);
                            v92Var.C(n65Var.y);
                        }
                        if (!tf5.g(j, j4)) {
                            v92Var.B((byte) 10);
                            ((Parcel) v92Var.t).writeLong(a11.D(j));
                        }
                        l45 l45Var = ju4Var.w;
                        if (l45Var != null) {
                            v92Var.B((byte) 11);
                            ((Parcel) v92Var.t).writeInt(l45Var.g);
                        }
                        ym4 ym4Var = ju4Var.c;
                        if (ym4Var != null) {
                            v92Var.B((byte) 12);
                            ((Parcel) v92Var.t).writeLong(a11.D(ym4Var.g));
                            long j6 = ym4Var.y;
                            v92Var.C(Float.intBitsToFloat((int) (j6 >> 32)));
                            v92Var.C(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                            v92Var.C(ym4Var.r);
                        }
                        spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) v92Var.t).marshall(), 0)), i2, i3, 33);
                        i = i4 + 1;
                        str2 = str3;
                        spannableString = spannableString2;
                        list = list2;
                    }
                    charSequence = spannableString;
                }
                clipboardManagerG.setPrimaryClip(ClipData.newPlainText(str2, charSequence));
                return og5.g;
            case 7:
                ((rw) this.t).o.getClass();
                throw new ClassCastException();
            case 8:
                return (cj) this.t;
            case 9:
                return (k44) this.t;
            case 10:
                return (ad2) ((pc0) this.t).y.getValue();
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((yl0) this.t).reportFullyDrawn();
                return og5.g;
            case 12:
                return ((cd2) this.t).r(":memory:");
            case 13:
                return ((mt2) this.t).n();
            case 14:
                return new s55((um3) this.t, 0.0f);
            case kq2.x /* 15 */:
                ((xy) this.t).close();
                return og5.g;
            case 16:
                ((cl0) this.t).r();
                return og5.g;
            case 17:
                ((nm1) this.t).g();
                return Boolean.TRUE;
            case 18:
                p82 p82Var = (p82) this.t;
                p82Var.getClass();
                try {
                    p82Var.E.i(2, 0, false);
                    break;
                } catch (IOException e) {
                    kk1 kk1Var = kk1.m;
                    p82Var.y(kk1Var, kk1Var, e);
                }
                return og5.g;
            case 19:
                Object systemService = ((View) ((cd2) this.t).t).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 20:
                af2 af2Var = (af2) this.t;
                long jLongValue = ((Number) af2Var.t.g()).longValue();
                t54 t54Var = new t54();
                t54 t54Var2 = new t54();
                synchronized (af2Var.m) {
                    t54Var.j = jLongValue - af2Var.w;
                    t54Var2.j = 1000000000 / ((long) af2Var.q);
                }
                m50.T(af2Var.j, null, new i(t54Var, t54Var2, af2Var, jLongValue, (mu0) null), 3);
                return og5.g;
            case 21:
                ((vi2) this.t).u0.g();
                return og5.g;
            case 22:
                st4 st4Var = (st4) this.t;
                if (st4Var == null || !st4Var.isEmpty()) {
                    ListIterator listIterator = st4Var.listIterator();
                    while (true) {
                        tv2 tv2Var2 = (tv2) listIterator;
                        if (tv2Var2.hasNext()) {
                            i63 i63Var = ((j63) tv2Var2.next()).g;
                            if (i63Var == i63.t || i63Var == i63.q) {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (st4Var == null || !st4Var.isEmpty()) {
                    ListIterator listIterator2 = st4Var.listIterator();
                    while (true) {
                        tv2 tv2Var3 = (tv2) listIterator2;
                        if (!tv2Var3.hasNext()) {
                            z3 = false;
                        } else if (((j63) tv2Var3.next()).g == i63.w) {
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
                if (st4Var == null || !st4Var.isEmpty()) {
                    ListIterator listIterator3 = st4Var.listIterator();
                    do {
                        tv2Var = (tv2) listIterator3;
                        if (!tv2Var.hasNext()) {
                            z4 = false;
                        }
                    } while (((j63) tv2Var.next()).g != i63.a);
                } else {
                    z4 = false;
                }
                return new uj2(z2, z3, z4);
            case 23:
                return (bl2) ((ob3) ((u54) this.t).j).getValue();
            case 24:
                an2 an2Var = (an2) this.t;
                if (!((Boolean) an2Var.l.getValue()).booleanValue() && (yo0Var = an2Var.r) != null) {
                    yo0Var.w();
                }
                return og5.g;
            case 25:
                ao2 ao2Var = (ao2) this.t;
                sk2 sk2Var = new sk2(0, null, true, null, null, null, null, null);
                ao2Var.getClass();
                ji0 ji0VarD = v70.d(ao2Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new yn2(ao2Var, sk2Var, mu0Var, z5 ? 1 : 0), 2);
                return og5.g;
            case 26:
                ((x03) this.t).g("application/octet-stream");
                return og5.g;
            case 27:
                ta1 ta1Var = ((uq2) this.t).a;
                if (ta1Var != null) {
                    c93.A(ta1Var);
                }
                return og5.g;
            case 28:
                return new BaseInputConnection(((nt2) this.t).g, false);
            default:
                gp gpVar = (gp) this.t;
                gpVar.x(ip.g(gpVar.v(), null, false, false, 6));
                return og5.g;
        }
    }

    public /* synthetic */ qd(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
