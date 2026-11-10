package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gc6 {
    public static final int g(mo3 mo3Var) {
        return (int) (mo3Var.v == um3.j ? mo3Var.t() & 4294967295L : mo3Var.t() >> 32);
    }

    public static final j73 n(j73 j73Var, tf2 tf2Var) {
        return j73Var.n(new vf2(tf2Var));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    public static final ai0 r(cj cjVar) {
        List list = cjVar.a;
        pi1 pi1Var = pi1.j;
        List list2 = list == null ? pi1Var : list;
        CharSequence charSequence = cjVar.t;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            fa4 fa4Var = new fa4((byte) 14, false);
            fa4Var.t = Parcel.obtain();
            if (list == null) {
                list = pi1Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                bj bjVar = (bj) list.get(i);
                ju4 ju4Var = (ju4) bjVar.g;
                int i2 = bjVar.y;
                int i3 = bjVar.r;
                ((Parcel) fa4Var.t).recycle();
                fa4Var.t = Parcel.obtain();
                m65 m65Var = ju4Var.g;
                long j = ju4Var.q;
                long j2 = ju4Var.j;
                long j3 = ju4Var.y;
                List list3 = list;
                int i4 = size;
                long jY = m65Var.y();
                SpannableString spannableString2 = spannableString;
                int i5 = i;
                long j4 = jj0.j;
                if (!tf5.g(jY, j4)) {
                    fa4Var.z((byte) 1);
                    ((Parcel) fa4Var.t).writeLong(ju4Var.g.y());
                }
                long j5 = n85.r;
                byte b = 2;
                if (!n85.g(j3, j5)) {
                    fa4Var.z((byte) 2);
                    fa4Var.k(j3);
                }
                qv1 qv1Var = ju4Var.r;
                if (qv1Var != null) {
                    fa4Var.z((byte) 3);
                    ((Parcel) fa4Var.t).writeInt(qv1Var.j);
                }
                lv1 lv1Var = ju4Var.n;
                if (lv1Var != null) {
                    int i6 = lv1Var.g;
                    fa4Var.z((byte) 4);
                    fa4Var.z((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                mv1 mv1Var = ju4Var.v;
                if (mv1Var != null) {
                    int i7 = mv1Var.g;
                    fa4Var.z((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    fa4Var.z(b);
                }
                String str = ju4Var.l;
                if (str != null) {
                    fa4Var.z((byte) 6);
                    ((Parcel) fa4Var.t).writeString(str);
                }
                if (!n85.g(j2, j5)) {
                    fa4Var.z((byte) 7);
                    fa4Var.k(j2);
                }
                ry ryVar = ju4Var.t;
                if (ryVar != null) {
                    float f = ryVar.g;
                    fa4Var.z((byte) 8);
                    fa4Var.o(f);
                }
                n65 n65Var = ju4Var.a;
                if (n65Var != null) {
                    fa4Var.z((byte) 9);
                    fa4Var.o(n65Var.g);
                    fa4Var.o(n65Var.y);
                }
                if (!tf5.g(j, j4)) {
                    fa4Var.z((byte) 10);
                    ((Parcel) fa4Var.t).writeLong(j);
                }
                l45 l45Var = ju4Var.w;
                if (l45Var != null) {
                    fa4Var.z((byte) 11);
                    ((Parcel) fa4Var.t).writeInt(l45Var.g);
                }
                ym4 ym4Var = ju4Var.c;
                if (ym4Var != null) {
                    fa4Var.z((byte) 12);
                    ((Parcel) fa4Var.t).writeLong(ym4Var.g);
                    long j6 = ym4Var.y;
                    fa4Var.o(Float.intBitsToFloat((int) (j6 >> 32)));
                    fa4Var.o(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    fa4Var.o(ym4Var.r);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) fa4Var.t).marshall(), 0)), i2, i3, 33);
                i = i5 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i4;
            }
            charSequence = spannableString;
        }
        return new ai0(ClipData.newPlainText("plain text", charSequence));
    }

    public static boolean v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final j73 y(j73 j73Var) {
        return j73Var.n(new pf2());
    }
}
