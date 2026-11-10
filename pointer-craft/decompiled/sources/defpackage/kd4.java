package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kd4 implements tl5 {
    public final Application g;
    public final ju2 n;
    public final Bundle r;
    public final ji v;
    public final sl5 y;

    public kd4(Application application, id4 id4Var, Bundle bundle) {
        sl5 sl5Var;
        this.v = id4Var.r();
        this.n = id4Var.a();
        this.r = bundle;
        this.g = application;
        if (application != null) {
            sl5Var = sl5.r;
            if (sl5Var == null) {
                sl5Var = new sl5(application);
                sl5.r = sl5Var;
            }
        } else {
            sl5Var = new sl5(null);
        }
        this.y = sl5Var;
    }

    @Override // defpackage.tl5
    public final pl5 g(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, canonicalName);
        }
        l0.u("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final pl5 n(Class cls, String str) {
        ju2 ju2Var = this.n;
        if (ju2Var == null) {
            uo1.u("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = fg.class.isAssignableFrom(cls);
        Application application = this.g;
        Constructor constructorG = (!zIsAssignableFrom || application == null) ? ld4.g(cls, ld4.y) : ld4.g(cls, ld4.g);
        if (constructorG != null) {
            ji jiVar = this.v;
            jiVar.getClass();
            zc4 zc4VarY = dz5.y(jiVar, ju2Var, str, this.r);
            pl5 pl5VarY = (!zIsAssignableFrom || application == null) ? ld4.y(cls, constructorG, zc4VarY.u()) : ld4.y(cls, constructorG, application, zc4VarY.u());
            pl5VarY.g("androidx.lifecycle.savedstate.vm.tag", zc4VarY);
            return pl5VarY;
        }
        if (application != null) {
            return this.y.g(cls);
        }
        ul5 ul5Var = ul5.g;
        if (ul5Var == null) {
            ul5Var = new ul5();
            ul5.g = ul5Var;
        }
        return ul5Var.g(cls);
    }

    @Override // defpackage.tl5
    public final pl5 r(tf0 tf0Var, ea3 ea3Var) {
        Class cls = tf0Var.g;
        cls.getClass();
        return y(cls, ea3Var);
    }

    @Override // defpackage.tl5
    public final pl5 y(Class cls, ea3 ea3Var) {
        hi0 hi0Var = og0.f;
        LinkedHashMap linkedHashMap = ea3Var.g;
        String str = (String) linkedHashMap.get(hi0Var);
        if (str == null) {
            l0.z("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(k33.A) == null || linkedHashMap.get(k33.B) == null) {
            if (this.n != null) {
                return n(cls, str);
            }
            l0.z("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(sl5.n);
        boolean zIsAssignableFrom = fg.class.isAssignableFrom(cls);
        Constructor constructorG = (!zIsAssignableFrom || application == null) ? ld4.g(cls, ld4.y) : ld4.g(cls, ld4.g);
        if (constructorG == null) {
            return this.y.y(cls, ea3Var);
        }
        return (!zIsAssignableFrom || application == null) ? ld4.y(cls, constructorG, k33.F(ea3Var)) : ld4.y(cls, constructorG, application, k33.F(ea3Var));
    }

    public kd4() {
        this.y = new sl5(null);
    }
}
