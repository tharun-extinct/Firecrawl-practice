package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e50 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte g;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.g) {
            case 0:
                return new f50(parcel, classLoader);
            case 1:
                return new gw0(parcel, classLoader);
            case 2:
                return new g54(parcel, classLoader);
            case 3:
                return new op4(parcel, classLoader);
            default:
                return new la5(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.g) {
            case 0:
                return new f50[i];
            case 1:
                return new gw0[i];
            case 2:
                return new g54[i];
            case 3:
                return new op4[i];
            default:
                return new la5[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.g) {
            case 0:
                return new f50(parcel, null);
            case 1:
                return new gw0(parcel, null);
            case 2:
                return new g54(parcel, null);
            case 3:
                return new op4(parcel, null);
            default:
                return new la5(parcel, null);
        }
    }
}
