package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class sl5 extends ul5 {
    public static final l76 n = new l76((byte) 17);
    public static sl5 r;
    public final Application y;

    public sl5(Application application) {
        this.y = application;
    }

    @Override // defpackage.ul5, defpackage.tl5
    public final pl5 g(Class cls) {
        Application application = this.y;
        if (application != null) {
            return n(cls, application);
        }
        uo1.u("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final pl5 n(Class cls, Application application) {
        if (!fg.class.isAssignableFrom(cls)) {
            return a11.q(cls);
        }
        try {
            pl5 pl5Var = (pl5) cls.getConstructor(Application.class).newInstance(application);
            pl5Var.getClass();
            return pl5Var;
        } catch (IllegalAccessException e) {
            t94.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            t94.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            t94.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            t94.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.ul5, defpackage.tl5
    public final pl5 y(Class cls, ea3 ea3Var) {
        if (this.y != null) {
            return g(cls);
        }
        Application application = (Application) ea3Var.g.get(n);
        if (application != null) {
            return n(cls, application);
        }
        if (!fg.class.isAssignableFrom(cls)) {
            return a11.q(cls);
        }
        l0.u("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
