package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class gx5 extends sx5 implements kx5 {
    public final Bundle a(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelY = y(parcelG, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle;
    }

    public final void c(String str, Bundle bundle, x06 x06Var) {
        Parcel parcelG = g();
        parcelG.writeInt(12);
        parcelG.writeString(str);
        int i = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        parcelG.writeStrongBinder(x06Var);
        n(parcelG, 1201);
    }

    public final Bundle j(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        Parcel parcelY = y(parcelG, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle;
    }

    public final Bundle l(String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(9);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle2;
    }

    public final Bundle m(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        int i2 = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle2;
    }

    public final Bundle q(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelG = g();
        parcelG.writeInt(i);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i2 = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        parcelG.writeInt(1);
        bundle2.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle3;
    }

    public final Bundle t(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        int i2 = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle2;
    }

    public final int v(int i, String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i2 = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 10);
        int i3 = parcelY.readInt();
        parcelY.recycle();
        return i3;
    }

    public final void w(String str, Bundle bundle, o06 o06Var) {
        Parcel parcelG = g();
        parcelG.writeInt(18);
        parcelG.writeString(str);
        int i = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        parcelG.writeStrongBinder(o06Var);
        n(parcelG, 1301);
    }

    public final Bundle x(String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(9);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i = wx5.g;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelY = y(parcelG, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) wx5.g(parcelY);
        parcelY.recycle();
        return bundle2;
    }
}
