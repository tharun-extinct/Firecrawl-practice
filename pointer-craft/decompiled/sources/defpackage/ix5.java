package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ix5 {
    public static final bi6 g;
    public static Method n = null;
    public static boolean r = false;
    public static boolean v = false;
    public static Field x;
    public static final aj6 y;

    static {
        byte b = 12;
        g = new bi6(b);
        y = new aj6(b);
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = xk5.g;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        wk5 wk5VarG = wk5.g(view);
        WeakReference weakReference2 = wk5VarG.r;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            wk5VarG.r = new WeakReference(keyEvent);
            SparseArray sparseArray = wk5VarG.y;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                wk5VarG.y = sparseArray;
            }
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                sparseArray.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                uo1.B();
                return false;
            }
        }
        return false;
    }

    public static void n(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final boolean r(int i, int i2) {
        return i == i2;
    }

    public static yq v(float f) {
        return new yq(f, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    public static boolean y(li2 li2Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        if (li2Var != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return li2Var.v(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!r) {
                            try {
                                n = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            r = true;
                        }
                        Method method = n;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                WeakHashMap weakHashMap = xk5.g;
                if (Build.VERSION.SDK_INT < 28 ? wk5.g(decorView).y(decorView, keyEvent) : false) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    WeakHashMap weakHashMap2 = xk5.g;
                    if (!(i >= 28 ? false : wk5.g(view).y(view, keyEvent))) {
                        if (li2Var.v(keyEvent)) {
                        }
                    }
                } else if (li2Var.v(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!v) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    x = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                v = true;
            }
            Field field = x;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            WeakHashMap weakHashMap3 = xk5.g;
            if (Build.VERSION.SDK_INT < 28 ? wk5.g(decorView2).y(decorView2, keyEvent) : false) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }
}
