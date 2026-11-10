package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ye5 extends zq2 {
    public static Method n = null;
    public static Constructor r = null;
    public static Method v = null;
    public static boolean x = false;
    public static Class y;

    public static boolean K(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        L();
        try {
            return ((Boolean) n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void L() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (x) {
            return;
        }
        x = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        r = constructor;
        y = cls;
        n = method2;
        v = method;
    }

    @Override // defpackage.zq2
    public Typeface r(Context context, tv1[] tv1VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (tv1VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(zq2.q(tv1VarArr, i).g, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileF = br2.f(context);
                        if (fileF == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (br2.q(fileF, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileF.getPath());
                                    fileF.delete();
                                } else {
                                    fileF.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileF.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.zq2
    public Typeface y(Context context, fv1 fv1Var, Resources resources, int i) throws NoSuchMethodException {
        L();
        try {
            Object objNewInstance = r.newInstance(null);
            for (gv1 gv1Var : fv1Var.g) {
                File fileF = br2.f(context);
                if (fileF == null) {
                    return null;
                }
                try {
                    if (!br2.m(fileF, resources, gv1Var.x)) {
                        return null;
                    }
                    if (!K(objNewInstance, fileF.getPath(), gv1Var.y, gv1Var.r)) {
                        return null;
                    }
                    fileF.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileF.delete();
                }
            }
            L();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) y, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) v.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
