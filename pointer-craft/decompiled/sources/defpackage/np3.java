package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class np3 implements Parcelable {
    public volatile int j = -1;

    public static final void l(np3 np3Var, byte[] bArr) throws jg2 {
        try {
            ni0 ni0VarN = ni0.n(bArr.length, bArr);
            np3Var.n(ni0VarN);
            ni0VarN.g(0);
        } catch (jg2 e) {
            throw e;
        } catch (IOException unused) {
            t94.v("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final byte[] t(np3 np3Var) {
        int iR = np3Var.r();
        np3Var.j = iR;
        byte[] bArr = new byte[iR];
        try {
            y22 y22Var = new y22(iR, bArr);
            np3Var.b(y22Var);
            if (((ByteBuffer) y22Var.t).remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            uo1.w("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public abstract void b(y22 y22Var);

    public final Object clone() {
        return (np3) super.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract np3 n(ni0 ni0Var);

    public abstract int r();

    public final String toString() {
        return zz5.n(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getClass().getName());
        parcel.writeByteArray(t(this));
    }
}
