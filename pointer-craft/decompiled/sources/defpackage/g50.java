package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g50 {
    public final /* synthetic */ byte g;
    public final Object n;
    public int r;
    public final Object v;
    public boolean y;

    public g50(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.g = (byte) 1;
        this.n = jArr;
        this.v = remoteViewsArr;
        this.y = false;
        this.r = 1;
        if (jArr.length != remoteViewsArr.length) {
            l0.u("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = cj0.F0(cj0.I0(arrayList)).size();
        if (size <= 1) {
            return;
        }
        l0.t(du4.w(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
        throw null;
    }

    public void g(int i) {
        byte b = this.g;
        Object obj = this.n;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.r = i;
                    if (!this.y) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((ml) obj);
                        this.y = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.b;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.r = i;
                    if (!this.y) {
                        ((View) sideSheetBehavior.b.get()).postOnAnimation((j4) obj);
                        this.y = true;
                    }
                    break;
                }
                break;
        }
    }

    public g50(Parcel parcel) {
        this.g = (byte) 1;
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.n = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                up.m("null element found in ", remoteViewsArr, 46);
                throw null;
            }
        }
        this.v = remoteViewsArr;
        this.y = parcel.readInt() == 1;
        this.r = parcel.readInt();
    }

    public g50(SideSheetBehavior sideSheetBehavior) {
        this.g = (byte) 2;
        this.v = sideSheetBehavior;
        this.n = new j4(this, (byte) 12);
    }

    public g50(BottomSheetBehavior bottomSheetBehavior) {
        this.g = (byte) 0;
        this.v = bottomSheetBehavior;
        this.n = new ml((Object) this, (byte) 2);
    }
}
