package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ze5 extends zq2 {
    public static final Method n;
    public static final Constructor r;
    public static final Method v;
    public static final Class y;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        r = constructor;
        y = cls;
        n = method2;
        v = method;
    }

    public static boolean K(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) n.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface L(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) y, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) v.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean M() {
        Method method = n;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.zq2
    public final Typeface r(Context context, tv1[] tv1VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = r.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            sp4 sp4Var = new sp4(0);
            for (tv1 tv1Var : tv1VarArr) {
                Uri uri = tv1Var.g;
                ByteBuffer byteBufferE = (ByteBuffer) sp4Var.get(uri);
                if (byteBufferE == null) {
                    byteBufferE = br2.e(context, uri);
                    sp4Var.put(uri, byteBufferE);
                }
                if (byteBufferE != null && K(objNewInstance, byteBufferE, tv1Var.y, tv1Var.r, tv1Var.n)) {
                }
            }
            Typeface typefaceL = L(objNewInstance);
            if (typefaceL != null) {
                return Typeface.create(typefaceL, i);
            }
        }
        return null;
    }

    @Override // defpackage.zq2
    public final Typeface y(Context context, fv1 fv1Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = r.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (gv1 gv1Var : fv1Var.g) {
                int i2 = gv1Var.x;
                File fileF = br2.f(context);
                if (fileF != null) {
                    try {
                        if (br2.m(fileF, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileF);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileF.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileF.delete();
                        }
                        if (map != null && K(objNewInstance, map, gv1Var.v, gv1Var.y, gv1Var.r)) {
                        }
                    } catch (Throwable th3) {
                        fileF.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return L(objNewInstance);
        }
        return null;
    }
}
