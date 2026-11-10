package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j44 implements du2 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ j44(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.du2
    public final void b(gu2 gu2Var, vt2 vt2Var) {
        View view;
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                id4 id4Var = (id4) obj;
                if (vt2Var != vt2.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                gu2Var.a().x(this);
                Bundle bundleA = id4Var.r().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    l0.z("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, j44.class.getClassLoader()).asSubclass(ed4.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                ((kt2) ((ed4) objNewInstance)).g(id4Var);
                            } catch (Exception e) {
                                uo1.w(xi3.t("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        uo1.w(du4.i("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                yl0 yl0Var = (yl0) obj;
                if (yl0Var.q == null) {
                    tl0 tl0Var = (tl0) yl0Var.getLastNonConfigurationInstance();
                    if (tl0Var != null) {
                        yl0Var.q = tl0Var.g;
                    }
                    if (yl0Var.q == null) {
                        yl0Var.q = new vl5();
                    }
                }
                yl0Var.j.x(this);
                return;
            case 2:
                if (vt2Var != vt2.ON_STOP || (view = ((pw1) obj).O) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (vt2Var != vt2.ON_CREATE) {
                    uo1.p(vt2Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    gu2Var.a().x(this);
                    ((cd4) obj).y();
                    return;
                }
        }
    }
}
