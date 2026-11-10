package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class f50 extends x {
    public static final Parcelable.Creator<f50> CREATOR = new e50((byte) 0);
    public final int a;
    public final boolean c;
    public final int m;
    public final boolean q;
    public final boolean w;

    public f50(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.m = parcel.readInt();
        this.q = parcel.readInt() == 1;
        this.w = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.m);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public f50(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.a = bottomSheetBehavior.P;
        this.m = bottomSheetBehavior.x;
        this.q = bottomSheetBehavior.y;
        this.w = bottomSheetBehavior.J;
        this.c = bottomSheetBehavior.K;
    }
}
