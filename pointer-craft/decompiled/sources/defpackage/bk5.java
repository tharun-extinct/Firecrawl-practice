package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bk5 {
    public final mr g;
    public final mr r;
    public final mr y;

    public bk5(mr mrVar, mr mrVar2, mr mrVar3) {
        this.g = mrVar;
        this.y = mrVar2;
        this.r = mrVar3;
    }

    public abstract ck5 g();

    public abstract void j(int i);

    public final dk5 l() {
        String string = ((ck5) this).v.readString();
        if (string == null) {
            return null;
        }
        try {
            return (dk5) r(string).invoke(null, g());
        } catch (ClassNotFoundException e) {
            uo1.w("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            uo1.w("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            uo1.w("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            uo1.w("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public final Method n(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        mr mrVar = this.y;
        Method method = (Method) mrVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsY = y(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsY.getDeclaredMethod("write", cls, bk5.class);
        mrVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Method r(String str) throws NoSuchMethodException {
        mr mrVar = this.g;
        Method method = (Method) mrVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, bk5.class.getClassLoader()).getDeclaredMethod("read", bk5.class);
        mrVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final void t(dk5 dk5Var) {
        if (dk5Var == null) {
            ((ck5) this).v.writeString(null);
            return;
        }
        try {
            ((ck5) this).v.writeString(y(dk5Var.getClass()).getName());
            ck5 ck5VarG = g();
            try {
                n(dk5Var.getClass()).invoke(null, dk5Var, ck5VarG);
                Parcel parcel = ck5VarG.v;
                int i = ck5VarG.t;
                if (i >= 0) {
                    int i2 = ck5VarG.n.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                uo1.w("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                uo1.w("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                uo1.w("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                uo1.w("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            uo1.w(dk5Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract boolean v(int i);

    public final Parcelable x(Parcelable parcelable, int i) {
        if (!v(i)) {
            return parcelable;
        }
        return ((ck5) this).v.readParcelable(ck5.class.getClassLoader());
    }

    public final Class y(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        mr mrVar = this.r;
        Class cls2 = (Class) mrVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        mrVar.put(cls.getName(), cls3);
        return cls3;
    }
}
