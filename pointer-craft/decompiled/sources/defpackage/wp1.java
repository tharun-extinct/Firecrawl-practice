package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 extends ViewGroup.MarginLayoutParams implements sp1 {
    public static final Parcelable.Creator<wp1> CREATOR = new k21((byte) 2);
    public float a;
    public int b;
    public int c;
    public int i;
    public int j;
    public int m;
    public float q;
    public boolean s;
    public float t;
    public int w;

    public wp1(int i) {
        super(new ViewGroup.LayoutParams(-2, i));
        this.j = 1;
        this.t = 0.0f;
        this.a = 1.0f;
        this.m = -1;
        this.q = -1.0f;
        this.w = -1;
        this.c = -1;
        this.i = 16777215;
        this.b = 16777215;
    }

    @Override // defpackage.sp1
    public final int a() {
        return this.m;
    }

    @Override // defpackage.sp1
    public final int c() {
        return this.w;
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
        return this.j;
    }

    @Override // defpackage.sp1
    public final int h() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // defpackage.sp1
    public final boolean i() {
        return this.s;
    }

    @Override // defpackage.sp1
    public final float j() {
        return this.q;
    }

    @Override // defpackage.sp1
    public final float m() {
        return this.a;
    }

    @Override // defpackage.sp1
    public final int o() {
        return this.i;
    }

    @Override // defpackage.sp1
    public final void p(int i) {
        this.w = i;
    }

    @Override // defpackage.sp1
    public final int q() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // defpackage.sp1
    public final int s() {
        return this.b;
    }

    @Override // defpackage.sp1
    public final int u() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // defpackage.sp1
    public final void v(int i) {
        this.c = i;
    }

    @Override // defpackage.sp1
    public final int w() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeFloat(this.t);
        parcel.writeFloat(this.a);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.q);
        parcel.writeInt(this.w);
        parcel.writeInt(this.c);
        parcel.writeInt(this.i);
        parcel.writeInt(this.b);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }

    @Override // defpackage.sp1
    public final float x() {
        return this.t;
    }

    @Override // defpackage.sp1
    public final int y() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }
}
