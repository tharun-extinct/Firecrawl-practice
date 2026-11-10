package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements Parcelable {
    public static final Parcelable.Creator<rx1> CREATOR = new k21((byte) 3);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int h;
    public final boolean i;
    public final String j;
    public final boolean m;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean s;
    public final String t;
    public final int u;
    public final int w;
    public final String z;

    public rx1(Parcel parcel) {
        this.j = parcel.readString();
        this.t = parcel.readString();
        this.a = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.q = parcel.readInt();
        this.w = parcel.readInt();
        this.c = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.b = parcel.readInt() != 0;
        this.s = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.u = parcel.readInt();
        this.z = parcel.readString();
        this.h = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.j);
        sb.append(" (");
        sb.append(this.t);
        sb.append(")}:");
        if (this.a) {
            sb.append(" fromLayout");
        }
        if (this.m) {
            sb.append(" dynamicContainer");
        }
        int i = this.w;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.c;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.b) {
            sb.append(" removing");
        }
        if (this.s) {
            sb.append(" detached");
        }
        if (this.p) {
            sb.append(" hidden");
        }
        String str2 = this.z;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.h);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.j);
        parcel.writeString(this.t);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.w);
        parcel.writeString(this.c);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeString(this.z);
        parcel.writeInt(this.h);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public rx1(pw1 pw1Var) {
        this.j = pw1Var.getClass().getName();
        this.t = pw1Var.q;
        this.a = pw1Var.h;
        this.m = pw1Var.f;
        this.q = pw1Var.E;
        this.w = pw1Var.F;
        this.c = pw1Var.G;
        this.i = pw1Var.J;
        this.b = pw1Var.u;
        this.s = pw1Var.I;
        this.p = pw1Var.H;
        this.u = pw1Var.W.ordinal();
        this.z = pw1Var.i;
        this.h = pw1Var.b;
        this.o = pw1Var.Q;
    }
}
