package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ck5 extends bk5 {
    public int a;
    public final String j;
    public final int l;
    public int m;
    public final SparseIntArray n;
    public int t;
    public final Parcel v;
    public final int x;

    public ck5(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new mr(0), new mr(0), new mr(0));
    }

    @Override // defpackage.bk5
    public final ck5 g() {
        Parcel parcel = this.v;
        int iDataPosition = parcel.dataPosition();
        int i = this.a;
        if (i == this.x) {
            i = this.l;
        }
        return new ck5(parcel, iDataPosition, i, du4.b(new StringBuilder(), this.j, "  "), this.g, this.y, this.r);
    }

    @Override // defpackage.bk5
    public final void j(int i) {
        int i2 = this.t;
        SparseIntArray sparseIntArray = this.n;
        Parcel parcel = this.v;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.t = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.bk5
    public final boolean v(int i) {
        while (true) {
            int i2 = this.a;
            int i3 = this.m;
            if (i2 >= this.l) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.a;
            Parcel parcel = this.v;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.m = parcel.readInt();
            this.a += i5;
        }
    }

    public ck5(Parcel parcel, int i, int i2, String str, mr mrVar, mr mrVar2, mr mrVar3) {
        super(mrVar, mrVar2, mrVar3);
        this.n = new SparseIntArray();
        this.t = -1;
        this.m = -1;
        this.v = parcel;
        this.x = i;
        this.l = i2;
        this.a = i;
        this.j = str;
    }
}
