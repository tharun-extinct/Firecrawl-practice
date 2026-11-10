package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gw implements Parcelable {
    public static final Parcelable.Creator<gw> CREATOR = new q4((byte) 2);
    public final int[] a;
    public final CharSequence b;
    public final int c;
    public final boolean h;
    public final int i;
    public final int[] j;
    public final int[] m;
    public final CharSequence p;
    public final int q;
    public final int s;
    public final ArrayList t;
    public final ArrayList u;
    public final String w;
    public final ArrayList z;

    public gw(fw fwVar) {
        int size = fwVar.g.size();
        this.j = new int[size * 6];
        if (!fwVar.l) {
            l0.z("Not on back stack");
            throw null;
        }
        this.t = new ArrayList(size);
        this.a = new int[size];
        this.m = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            wx1 wx1Var = (wx1) fwVar.g.get(i2);
            int i3 = i + 1;
            this.j[i] = wx1Var.g;
            ArrayList arrayList = this.t;
            pw1 pw1Var = wx1Var.y;
            arrayList.add(pw1Var != null ? pw1Var.q : null);
            int[] iArr = this.j;
            iArr[i3] = wx1Var.r ? 1 : 0;
            iArr[i + 2] = wx1Var.n;
            iArr[i + 3] = wx1Var.v;
            int i4 = i + 5;
            iArr[i + 4] = wx1Var.x;
            i += 6;
            iArr[i4] = wx1Var.l;
            this.a[i2] = wx1Var.j.ordinal();
            this.m[i2] = wx1Var.t.ordinal();
        }
        this.q = fwVar.x;
        this.w = fwVar.j;
        this.c = fwVar.u;
        this.i = fwVar.t;
        this.b = fwVar.a;
        this.s = fwVar.m;
        this.p = fwVar.q;
        this.u = fwVar.w;
        this.z = fwVar.c;
        this.h = fwVar.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final fw r(kx1 kx1Var) {
        fw fwVar = new fw(kx1Var);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.j;
            boolean z = true;
            if (i2 >= iArr.length) {
                break;
            }
            wx1 wx1Var = new wx1();
            int i4 = i2 + 1;
            wx1Var.g = iArr[i2];
            if (kx1.N(2)) {
                Log.v("FragmentManager", "Instantiate " + fwVar + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            wx1Var.j = wt2.values()[this.a[i3]];
            wx1Var.t = wt2.values()[this.m[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            wx1Var.r = z;
            int i6 = iArr[i5];
            wx1Var.n = i6;
            int i7 = iArr[i2 + 3];
            wx1Var.v = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            wx1Var.x = i9;
            i2 += 6;
            int i10 = iArr[i8];
            wx1Var.l = i10;
            fwVar.y = i6;
            fwVar.r = i7;
            fwVar.n = i9;
            fwVar.v = i10;
            fwVar.y(wx1Var);
            i3++;
        }
        fwVar.x = this.q;
        fwVar.j = this.w;
        fwVar.l = true;
        fwVar.t = this.i;
        fwVar.a = this.b;
        fwVar.m = this.s;
        fwVar.q = this.p;
        fwVar.w = this.u;
        fwVar.c = this.z;
        fwVar.i = this.h;
        fwVar.u = this.c;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                fwVar.r(1);
                return fwVar;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((wx1) fwVar.g.get(i)).y = kx1Var.r.i(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.j);
        parcel.writeStringList(this.t);
        parcel.writeIntArray(this.a);
        parcel.writeIntArray(this.m);
        parcel.writeInt(this.q);
        parcel.writeString(this.w);
        parcel.writeInt(this.c);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.b, parcel, 0);
        parcel.writeInt(this.s);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.u);
        parcel.writeStringList(this.z);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public gw(Parcel parcel) {
        this.j = parcel.createIntArray();
        this.t = parcel.createStringArrayList();
        this.a = parcel.createIntArray();
        this.m = parcel.createIntArray();
        this.q = parcel.readInt();
        this.w = parcel.readString();
        this.c = parcel.readInt();
        this.i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.b = (CharSequence) creator.createFromParcel(parcel);
        this.s = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.u = parcel.createStringArrayList();
        this.z = parcel.createStringArrayList();
        this.h = parcel.readInt() != 0;
    }
}
