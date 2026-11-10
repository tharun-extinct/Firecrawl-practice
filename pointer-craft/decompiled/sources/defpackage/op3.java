package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class op3 implements Parcelable.Creator {
    public final Class g;

    public op3(Class cls) {
        this.g = cls;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        np3 np3Var = null;
        try {
            np3 np3Var2 = (np3) Class.forName(string).newInstance();
            try {
                np3.l(np3Var2, bArrCreateByteArray);
                return np3Var2;
            } catch (ClassNotFoundException e) {
                e = e;
                np3Var = np3Var2;
                Log.e("PMNCreator", "Exception trying to create proto from parcel", e);
                return np3Var;
            } catch (IllegalAccessException e2) {
                e = e2;
                np3Var = np3Var2;
                Log.e("PMNCreator", "Exception trying to create proto from parcel", e);
                return np3Var;
            } catch (InstantiationException e3) {
                e = e3;
                np3Var = np3Var2;
                Log.e("PMNCreator", "Exception trying to create proto from parcel", e);
                return np3Var;
            } catch (jg2 e4) {
                e = e4;
                np3Var = np3Var2;
                Log.e("PMNCreator", "Exception trying to create proto from parcel", e);
                return np3Var;
            }
        } catch (ClassNotFoundException e5) {
            e = e5;
        } catch (IllegalAccessException e6) {
            e = e6;
        } catch (InstantiationException e7) {
            e = e7;
        } catch (jg2 e8) {
            e = e8;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return (np3[]) Array.newInstance((Class<?>) this.g, i);
    }
}
