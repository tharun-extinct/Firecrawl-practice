package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s64 implements RemoteViewsService.RemoteViewsFactory {
    public static final g50 v = new g50(new long[0], new RemoteViews[0]);
    public final RemoteViewsCompatService g;
    public g50 n = v;
    public final int r;
    public final int y;

    public s64(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.g = remoteViewsCompatService;
        this.y = i;
        this.r = i2;
    }

    public final void g() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.g;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.y;
        sb.append(i);
        sb.append(':');
        sb.append(this.r);
        g50 g50Var = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            bArrDecode.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                byte[] bArr = new byte[parcelObtain.readInt()];
                parcelObtain.readByteArray(bArr);
                String string2 = parcelObtain.readString();
                string2.getClass();
                long j = parcelObtain.readLong();
                parcelObtain.recycle();
                if (yf2.p(Build.VERSION.INCREMENTAL, string2)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? ym.v(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else if (lValueOf.longValue() != j) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.getClass();
                            try {
                                parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                parcelObtain2.setDataPosition(0);
                                g50 g50Var2 = new g50(parcelObtain2);
                                parcelObtain2.recycle();
                                g50Var = g50Var2;
                            } catch (Throwable th) {
                                parcelObtain2.recycle();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th2);
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            } catch (Throwable th3) {
                parcelObtain.recycle();
                throw th3;
            }
        }
        if (g50Var == null) {
            g50Var = v;
        }
        this.n = g50Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.n.n).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.n.n)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.n.v)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.g.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.n.r;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.n.y;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        g();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        g();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
