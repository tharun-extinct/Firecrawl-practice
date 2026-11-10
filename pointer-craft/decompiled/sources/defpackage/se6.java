package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.DragEvent;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public abstract class se6 {
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static Field j;
    public static boolean l;
    public static Class n;
    public static boolean r;
    public static boolean t;
    public static boolean v;
    public static Field x;
    public static Field y;

    public static void g(Resources resources) {
        Object obj;
        Object obj2;
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        if (!t) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                j = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            t = true;
        }
        Field field = j;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!r) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                y = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            r = true;
        }
        Field field2 = y;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            if (!v) {
                try {
                    n = Class.forName("android.content.res.ThemedResourceCache");
                } catch (ClassNotFoundException e5) {
                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                }
                v = true;
            }
            Class cls = n;
            if (cls == null) {
                return;
            }
            if (!l) {
                try {
                    Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                    x = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (NoSuchFieldException e6) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                }
                l = true;
            }
            Field field3 = x;
            if (field3 == null) {
                return;
            }
            try {
                longSparseArray = (LongSparseArray) field3.get(obj2);
            } catch (IllegalAccessException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
            }
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    public static final long y(v92 v92Var) {
        DragEvent dragEvent = (DragEvent) v92Var.t;
        float x2 = dragEvent.getX();
        float y2 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y2)) & 4294967295L);
    }
}
