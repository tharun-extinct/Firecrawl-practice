package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class il0 extends RuntimeException {
    public il0(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(iDataPosition);
        sb.append(" size=");
        sb.append(iDataSize);
        super(sb.toString());
    }

    public /* synthetic */ il0(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ il0(boolean z) {
    }

    public /* synthetic */ il0(String str) {
        super(str);
    }

    public il0() {
        super("Context cannot be null");
    }

    public il0(Throwable th) {
        super(th);
    }
}
