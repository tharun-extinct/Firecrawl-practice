package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm0 implements n14 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ fm0(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.n14
    public final Object get() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new kg2("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new kg2(du4.i("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new kg2(du4.i("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new kg2(xi3.t("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new kg2(xi3.t("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new z92((ro1) obj);
        }
    }
}
