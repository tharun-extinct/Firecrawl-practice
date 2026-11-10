package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class bf5 extends ye5 {
    public final Method a;
    public final Constructor j;
    public final Class l;
    public final Method m;
    public final Method q;
    public final Method t;
    public final Method w;

    public bf5() throws NoSuchMethodException {
        Method methodQ;
        Constructor<?> constructor;
        Method methodP;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodP = P(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodQ = Q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodQ = null;
            constructor = null;
            methodP = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.l = cls;
        this.j = constructor;
        this.t = methodP;
        this.a = method;
        this.m = method2;
        this.q = method3;
        this.w = methodQ;
    }

    public static Method P(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.t.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.l, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.w.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Q(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.ye5, defpackage.zq2
    public final Typeface r(Context context, tv1[] tv1VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceN;
        boolean zBooleanValue;
        if (tv1VarArr.length >= 1) {
            Method method = this.t;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (tv1 tv1Var : tv1VarArr) {
                        if (tv1Var.x == 0) {
                            Uri uri = tv1Var.g;
                            if (!map.containsKey(uri)) {
                                map.put(uri, br2.e(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.j.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = tv1VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.q;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!O(objNewInstance) || (typefaceN = N(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceN, i);
                            }
                            tv1 tv1Var2 = tv1VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(tv1Var2.g);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.a.invoke(objNewInstance, byteBuffer, Integer.valueOf(tv1Var2.y), null, Integer.valueOf(tv1Var2.r), Integer.valueOf(tv1Var2.n ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    tv1 tv1VarQ = zq2.q(tv1VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(tv1VarQ.g, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(tv1VarQ.r).setItalic(tv1VarQ.n).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.zq2
    public final Typeface v(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.t;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.v(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!M(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.q.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (O(objNewInstance)) {
                return N(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.ye5, defpackage.zq2
    public final Typeface y(Context context, fv1 fv1Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.t;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.y(context, fv1Var, resources, i);
        }
        try {
            objNewInstance = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            gv1[] gv1VarArr = fv1Var.g;
            int length = gv1VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                gv1 gv1Var = gv1VarArr[i2];
                String str = gv1Var.g;
                int i3 = gv1Var.v;
                int i4 = gv1Var.y;
                boolean z = gv1Var.r;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gv1Var.n);
                bf5 bf5Var = this;
                Context context2 = context;
                if (bf5Var.M(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i2++;
                    this = bf5Var;
                    context = context2;
                } else {
                    try {
                        bf5Var.q.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            bf5 bf5Var2 = this;
            if (bf5Var2.O(objNewInstance)) {
                return bf5Var2.N(objNewInstance);
            }
        }
        return null;
    }
}
