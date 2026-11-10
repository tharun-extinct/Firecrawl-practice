package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rt4 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte g;

    public /* synthetic */ rt4(byte b) {
        this.g = b;
    }

    public static st4 g(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = rt4.class.getClassLoader();
        }
        int i = parcel.readInt();
        kn2 kn2Var = new kn2(parcel, classLoader, (byte) 17);
        if (i == 0) {
            return new st4();
        }
        js3 js3VarX = rr4.t.x();
        for (int i2 = 0; i2 < i; i2++) {
            js3VarX.add(kn2Var.a(Integer.valueOf(i2)));
        }
        return new st4(js3VarX.n());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.g) {
            case 0:
                return g(parcel, null);
            case 1:
                return new sd0(parcel, null);
            default:
                return new i23(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.g) {
            case 0:
                return new st4[i];
            case 1:
                return new sd0[i];
            default:
                return new i23[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.g) {
            case 0:
                return g(parcel, classLoader);
            case 1:
                return new sd0(parcel, classLoader);
            default:
                return new i23(parcel, classLoader);
        }
    }
}
