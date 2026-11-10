package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jv5 extends i1 {
    public static final Parcelable.Creator<jv5> CREATOR = new q4((byte) 26);
    public final List j;
    public final String t;

    public jv5(String str, ArrayList arrayList) {
        this.j = arrayList;
        this.t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        List<String> list = this.j;
        if (list != null) {
            int iL2 = ef6.l(parcel, 1);
            parcel.writeStringList(list);
            ef6.j(parcel, iL2);
        }
        ef6.r(parcel, 2, this.t);
        ef6.j(parcel, iL);
    }
}
