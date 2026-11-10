package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sb6 extends ot5 implements IInterface {
    public final int n;

    public sb6(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 2);
        if (bArr.length == 25) {
            this.n = Arrays.hashCode(bArr);
        } else {
            t94.g();
            throw null;
        }
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sb6) {
            try {
                sb6 sb6Var = (sb6) obj;
                if (sb6Var.n == this.n) {
                    return Arrays.equals(l(), (byte[]) pi3.j(new pi3(sb6Var.l())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n;
    }

    public abstract byte[] l();

    @Override // defpackage.ot5
    public final boolean x(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            pi3 pi3Var = new pi3(l());
            parcel2.writeNoException();
            h06.y(parcel2, pi3Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.n);
        return true;
    }
}
