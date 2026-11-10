package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class k21 implements Parcelable.Creator {
    public final /* synthetic */ byte g;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.g) {
            case 0:
                return new l21(parcel.readInt());
            case 1:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                boolean z3 = false;
                int i5 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                int i6 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = z3;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                int i7 = parcel.readInt();
                long j = parcel.readLong();
                boolean z4 = z;
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new g61(string, string2, i, i2, i3, i4, i5, z3, i6, z2, z, i7, j, j2, z4, z4, z4);
            case 2:
                wp1 wp1Var = new wp1(0, 0);
                wp1Var.j = 1;
                wp1Var.t = 0.0f;
                wp1Var.a = 1.0f;
                wp1Var.m = -1;
                wp1Var.q = -1.0f;
                wp1Var.w = -1;
                wp1Var.c = -1;
                wp1Var.i = 16777215;
                wp1Var.b = 16777215;
                wp1Var.j = parcel.readInt();
                wp1Var.t = parcel.readFloat();
                wp1Var.a = parcel.readFloat();
                wp1Var.m = parcel.readInt();
                wp1Var.q = parcel.readFloat();
                wp1Var.w = parcel.readInt();
                wp1Var.c = parcel.readInt();
                wp1Var.i = parcel.readInt();
                wp1Var.b = parcel.readInt();
                wp1Var.s = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) wp1Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wp1Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wp1Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wp1Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wp1Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wp1Var).width = parcel.readInt();
                return wp1Var;
            case 3:
                return new rx1(parcel);
            case 4:
                y23 y23Var = new y23(parcel);
                y23Var.j = ((Integer) parcel.readValue(y23.class.getClassLoader())).intValue();
                return y23Var;
            case 5:
                return new pp3(parcel.readFloat());
            case 6:
                return new qp3(parcel.readInt());
            default:
                return new rp3(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.g) {
            case 0:
                return new l21[i];
            case 1:
                return new g61[i];
            case 2:
                return new wp1[i];
            case 3:
                return new rx1[i];
            case 4:
                return new y23[i];
            case 5:
                return new pp3[i];
            case 6:
                return new qp3[i];
            default:
                return new rp3[i];
        }
    }
}
