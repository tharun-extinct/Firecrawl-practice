package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import io.appground.blek.data.room.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class eq0 implements o14 {
    public final /* synthetic */ byte g;
    public final o14 y;

    public /* synthetic */ eq0(o14 o14Var, byte b) {
        this.g = b;
        this.y = o14Var;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        o14 o14Var = this.y;
        switch (b) {
            case 0:
                Context context = ((kq) o14Var).y.j;
                SharedPreferences sharedPreferencesD = y94.d(context);
                boolean z = false;
                if (sharedPreferencesD != null && !sharedPreferencesD.getBoolean("feature_refresh_service", true)) {
                    z = true;
                }
                return new l62(context, !z);
            default:
                AppDatabase appDatabase = (AppDatabase) ((e20) o14Var).get();
                appDatabase.getClass();
                el2 el2VarZ = appDatabase.z();
                if (el2VarZ != null) {
                    return el2VarZ;
                }
                l0.q("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
