package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bk5;
import defpackage.ck5;
import defpackage.l0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(bk5 bk5Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.g = -1;
        iconCompat.r = null;
        iconCompat.n = null;
        iconCompat.v = 0;
        iconCompat.x = 0;
        iconCompat.l = null;
        iconCompat.j = IconCompat.m;
        iconCompat.t = null;
        iconCompat.g = !bk5Var.v(1) ? -1 : ((ck5) bk5Var).v.readInt();
        byte[] bArr = iconCompat.r;
        if (bk5Var.v(2)) {
            Parcel parcel = ((ck5) bk5Var).v;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.r = bArr;
        iconCompat.n = bk5Var.x(iconCompat.n, 3);
        int i2 = iconCompat.v;
        if (bk5Var.v(4)) {
            i2 = ((ck5) bk5Var).v.readInt();
        }
        iconCompat.v = i2;
        int i3 = iconCompat.x;
        if (bk5Var.v(5)) {
            i3 = ((ck5) bk5Var).v.readInt();
        }
        iconCompat.x = i3;
        iconCompat.l = (ColorStateList) bk5Var.x(iconCompat.l, 6);
        String string = iconCompat.t;
        if (bk5Var.v(7)) {
            string = ((ck5) bk5Var).v.readString();
        }
        iconCompat.t = string;
        String string2 = iconCompat.a;
        if (bk5Var.v(8)) {
            string2 = ((ck5) bk5Var).v.readString();
        }
        iconCompat.a = string2;
        iconCompat.j = PorterDuff.Mode.valueOf(iconCompat.t);
        switch (iconCompat.g) {
            case -1:
                Parcelable parcelable = iconCompat.n;
                if (parcelable != null) {
                    iconCompat.y = parcelable;
                    return iconCompat;
                }
                l0.u("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.n;
                if (parcelable2 != null) {
                    iconCompat.y = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.r;
                iconCompat.y = bArr3;
                iconCompat.g = 3;
                iconCompat.v = 0;
                iconCompat.x = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.r, Charset.forName("UTF-16"));
                iconCompat.y = str;
                if (iconCompat.g == 2 && iconCompat.a == null) {
                    iconCompat.a = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.y = iconCompat.r;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, bk5 bk5Var) {
        bk5Var.getClass();
        iconCompat.t = iconCompat.j.name();
        switch (iconCompat.g) {
            case -1:
                iconCompat.n = (Parcelable) iconCompat.y;
                break;
            case 1:
            case 5:
                iconCompat.n = (Parcelable) iconCompat.y;
                break;
            case 2:
                iconCompat.r = ((String) iconCompat.y).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.r = (byte[]) iconCompat.y;
                break;
            case 4:
            case 6:
                iconCompat.r = iconCompat.y.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.g;
        if (-1 != i) {
            bk5Var.j(1);
            ((ck5) bk5Var).v.writeInt(i);
        }
        byte[] bArr = iconCompat.r;
        if (bArr != null) {
            bk5Var.j(2);
            Parcel parcel = ((ck5) bk5Var).v;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.n;
        if (parcelable != null) {
            bk5Var.j(3);
            ((ck5) bk5Var).v.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.v;
        if (i2 != 0) {
            bk5Var.j(4);
            ((ck5) bk5Var).v.writeInt(i2);
        }
        int i3 = iconCompat.x;
        if (i3 != 0) {
            bk5Var.j(5);
            ((ck5) bk5Var).v.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.l;
        if (colorStateList != null) {
            bk5Var.j(6);
            ((ck5) bk5Var).v.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.t;
        if (str != null) {
            bk5Var.j(7);
            ((ck5) bk5Var).v.writeString(str);
        }
        String str2 = iconCompat.a;
        if (str2 != null) {
            bk5Var.j(8);
            ((ck5) bk5Var).v.writeString(str2);
        }
    }
}
