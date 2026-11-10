package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class bk extends i1 {
    public static final Parcelable.Creator<bk> CREATOR = new q4(25);
    public final String a;
    public final List j;
    public final String m;
    public final boolean t;

    public bk(ArrayList arrayList, boolean z, String str, String str2) {
        jr2.m(arrayList);
        this.j = arrayList;
        this.t = z;
        this.a = str;
        this.m = str2;
    }

    public static bk r(List list, boolean z) {
        TreeSet treeSet = new TreeSet(fu1.x);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((om3) it.next()).g());
        }
        return new bk(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return this.t == bkVar.t && lb6.g(this.j, bkVar.j) && lb6.g(this.a, bkVar.a) && lb6.g(this.m, bkVar.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.t), this.j, this.a, this.m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = ef6.l(parcel, 20293);
        ef6.v(parcel, 1, this.j);
        ef6.x(parcel, 2, 4);
        parcel.writeInt(this.t ? 1 : 0);
        ef6.r(parcel, 3, this.a);
        ef6.r(parcel, 4, this.m);
        ef6.j(parcel, iL);
    }
}
