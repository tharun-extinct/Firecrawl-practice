package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g61 implements Parcelable {
    public static final Parcelable.Creator<g61> CREATOR = new k21((byte) 1);
    public final int a;
    public final int b;
    public final int c;
    public final boolean f;
    public final long h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final int m;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean s;
    public final String t;
    public final int u;
    public final int w;
    public final long z;

    public /* synthetic */ g61(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, 0, 0, 0, (i2 & 64) != 0 ? 0 : 2, (i2 & 128) == 0, 0, false, (i2 & 1024) != 0 ? false : z, 0, 0L, 0L, false, false, false);
    }

    public static g61 r(g61 g61Var, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6, long j, long j2, boolean z2, boolean z3, boolean z4, int i7) {
        String str2 = (i7 & 1) != 0 ? g61Var.j : str;
        String str3 = g61Var.t;
        int i8 = g61Var.a;
        int i9 = (i7 & 8) != 0 ? g61Var.m : i;
        int i10 = (i7 & 16) != 0 ? g61Var.q : i2;
        int i11 = (i7 & 32) != 0 ? g61Var.w : i3;
        int i12 = (i7 & 64) != 0 ? g61Var.c : i4;
        boolean z5 = (i7 & 128) != 0 ? g61Var.i : z;
        int i13 = (i7 & 256) != 0 ? g61Var.b : i5;
        boolean z6 = g61Var.s;
        boolean z7 = g61Var.p;
        int i14 = (i7 & 2048) != 0 ? g61Var.u : i6;
        long j3 = (i7 & 4096) != 0 ? g61Var.z : j;
        long j4 = (i7 & 8192) != 0 ? g61Var.h : j2;
        boolean z8 = (i7 & 16384) != 0 ? g61Var.o : z2;
        boolean z9 = (32768 & i7) != 0 ? g61Var.f : z3;
        boolean z10 = (i7 & 65536) != 0 ? g61Var.k : z4;
        g61Var.getClass();
        str3.getClass();
        return new g61(str2, str3, i8, i9, i10, i11, i12, z5, i13, z6, z7, i14, j3, j4, z8, z9, z10);
    }

    public static g61 t(g61 g61Var, int i, int i2, int i3) {
        int iMax;
        fp3 fp3Var;
        int i4 = (i3 & 1) != 0 ? g61Var.q : i;
        int i5 = (i3 & 2) != 0 ? g61Var.c : i2;
        long j = g61Var.z;
        int i6 = g61Var.c;
        int i7 = 1;
        if (g61Var.q == 0 && i6 == 0 && (i4 != 0 || i5 != 0)) {
            if (i5 == 2) {
                i7 = 2;
            } else if (i4 != 2) {
                i7 = 0;
            }
            return r(g61Var, null, 0, i4, 0, i5, false, 0, i7, 0L, 0L, false, false, false, 1967);
        }
        if (i5 == 2) {
            iMax = 2;
        } else {
            iMax = g61Var.u;
            if (i4 == 2) {
                iMax = Math.max(1, iMax);
            }
        }
        if (i5 != 2 || i6 == 2) {
            fp3Var = (i5 >= 2 || i6 != 2) ? new fp3(Long.valueOf(j), Long.valueOf(g61Var.h)) : new fp3(0L, Long.valueOf(System.currentTimeMillis() - j));
        } else {
            fp3Var = new fp3(Long.valueOf(System.currentTimeMillis()), 0L);
        }
        return r(g61Var, null, 0, i4, 0, i5, i5 != 2 ? g61Var.i : true, 0, iMax, ((Number) fp3Var.j).longValue(), ((Number) fp3Var.t).longValue(), i5 == 2 ? false : g61Var.o, i5 == 2 ? false : g61Var.f, i5 != 2 ? g61Var.k : false, 1839);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g61)) {
            return false;
        }
        g61 g61Var = (g61) obj;
        return yf2.p(this.j, g61Var.j) && yf2.p(this.t, g61Var.t) && this.a == g61Var.a && this.m == g61Var.m && this.q == g61Var.q && this.w == g61Var.w && this.c == g61Var.c && this.i == g61Var.i && this.b == g61Var.b && this.s == g61Var.s && this.p == g61Var.p && this.u == g61Var.u && this.z == g61Var.z && this.h == g61Var.h && this.o == g61Var.o && this.f == g61Var.f && this.k == g61Var.k;
    }

    public final int hashCode() {
        String str = this.j;
        return Boolean.hashCode(this.k) + xi3.l(xi3.l(xi3.v(xi3.v(du4.r(this.u, xi3.l(xi3.l(du4.r(this.b, xi3.l(du4.r(this.c, du4.r(this.w, du4.r(this.q, du4.r(this.m, du4.r(this.a, xi3.x((str == null ? 0 : str.hashCode()) * 31, 31, this.t), 31), 31), 31), 31), 31), 31, this.i), 31), 31, this.s), 31, this.p), 31), 31, this.z), 31, this.h), 31, this.o), 31, this.f);
    }

    public final boolean l() {
        return this.c == 2;
    }

    public final f61 n() {
        if (this.f) {
            return f61.w;
        }
        int i = this.u;
        if (i == 0) {
            return f61.j;
        }
        if (i == 1) {
            return f61.t;
        }
        boolean z = this.o;
        f61 f61Var = f61.q;
        if (z) {
            return f61Var;
        }
        long j = this.h;
        if (1 > j || j >= 1000) {
            return j >= 5000 ? f61Var : f61.m;
        }
        return f61.a;
    }

    public final String toString() {
        StringBuilder sbZ = du4.z("Device(name=", this.j, ", address=", this.t, ", deviceClass=");
        sbZ.append(this.a);
        sbZ.append(", bondState=");
        sbZ.append(this.m);
        sbZ.append(", aclState=");
        sbZ.append(this.q);
        sbZ.append(", connectionState=");
        sbZ.append(this.w);
        sbZ.append(", deviceState=");
        sbZ.append(this.c);
        sbZ.append(", reportRead=");
        sbZ.append(this.i);
        sbZ.append(", reportVersion=");
        sbZ.append(this.b);
        sbZ.append(", notificationEnabled=");
        sbZ.append(this.s);
        sbZ.append(", supported=");
        sbZ.append(this.p);
        sbZ.append(", highestAchievedState=");
        sbZ.append(this.u);
        sbZ.append(", profileConnectTimestamp=");
        sbZ.append(this.z);
        sbZ.append(", profileConnectDuration=");
        sbZ.append(this.h);
        sbZ.append(", disconnectRequested=");
        sbZ.append(this.o);
        sbZ.append(", keyMissing=");
        sbZ.append(this.f);
        sbZ.append(", pairingRequested=");
        sbZ.append(this.k);
        sbZ.append(")");
        return sbZ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.j);
        parcel.writeString(this.t);
        parcel.writeInt(this.a);
        parcel.writeInt(this.m);
        parcel.writeInt(this.q);
        parcel.writeInt(this.w);
        parcel.writeInt(this.c);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeLong(this.z);
        parcel.writeLong(this.h);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
    }

    public g61(String str, String str2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2, boolean z3, int i7, long j, long j2, boolean z4, boolean z5, boolean z6) {
        str2.getClass();
        this.j = str;
        this.t = str2;
        this.a = i;
        this.m = i2;
        this.q = i3;
        this.w = i4;
        this.c = i5;
        this.i = z;
        this.b = i6;
        this.s = z2;
        this.p = z3;
        this.u = i7;
        this.z = j;
        this.h = j2;
        this.o = z4;
        this.f = z5;
        this.k = z6;
    }
}
