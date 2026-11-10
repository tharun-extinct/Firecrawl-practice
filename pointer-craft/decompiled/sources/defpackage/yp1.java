package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class yp1 extends y44 implements sp1 {
    public static final Parcelable.Creator<yp1> CREATOR = new q4((byte) 6);
    public int b;
    public int c;
    public float i;
    public int p;
    public float q;
    public int s;
    public int u;
    public float w;
    public boolean z;

    public yp1(int i) {
        super(-2, i);
        this.q = 0.0f;
        this.w = 1.0f;
        this.c = -1;
        this.i = -1.0f;
        this.p = 16777215;
        this.u = 16777215;
    }

    @Override // defpackage.sp1
    public final int a() {
        return this.c;
    }

    @Override // defpackage.sp1
    public final int c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.sp1
    public final int f() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // defpackage.sp1
    public final int g() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // defpackage.sp1
    public final int getOrder() {
        return 1;
    }

    @Override // defpackage.sp1
    public final int h() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // defpackage.sp1
    public final boolean i() {
        return this.z;
    }

    @Override // defpackage.sp1
    public final float j() {
        return this.i;
    }

    public final void l(float f) {
        this.q = f;
    }

    @Override // defpackage.sp1
    public final float m() {
        return this.w;
    }

    public final void n(float f) {
        this.i = f;
    }

    @Override // defpackage.sp1
    public final int o() {
        return this.p;
    }

    @Override // defpackage.sp1
    public final void p(int i) {
        this.b = i;
    }

    @Override // defpackage.sp1
    public final int q() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final void r(int i) {
        this.c = i;
    }

    @Override // defpackage.sp1
    public final int s() {
        return this.u;
    }

    public final void t(boolean z) {
        this.z = z;
    }

    @Override // defpackage.sp1
    public final int u() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // defpackage.sp1
    public final void v(int i) {
        this.s = i;
    }

    @Override // defpackage.sp1
    public final int w() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.q);
        parcel.writeFloat(this.w);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.s);
        parcel.writeInt(this.p);
        parcel.writeInt(this.u);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }

    @Override // defpackage.sp1
    public final float x() {
        return this.q;
    }

    @Override // defpackage.sp1
    public final int y() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }
}
