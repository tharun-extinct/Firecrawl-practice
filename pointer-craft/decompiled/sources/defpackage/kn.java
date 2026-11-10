package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class kn {
    public final Object[] g = new Object[2];
    public static final Class[] y = {Context.class, AttributeSet.class};
    public static final int[] r = {R.attr.onClick};
    public static final int[] n = {R.attr.accessibilityHeading};
    public static final int[] v = {R.attr.accessibilityPaneTitle};
    public static final int[] x = {R.attr.screenReaderFocusable};
    public static final String[] l = {"android.widget.", "android.view.", "android.webkit."};
    public static final sp4 j = new sp4(0);

    public zk g(Context context, AttributeSet attributeSet) {
        return new zk(context, attributeSet);
    }

    public fm n(Context context, AttributeSet attributeSet) {
        return new fm(context, attributeSet);
    }

    public el r(Context context, AttributeSet attributeSet) {
        return new el(context, attributeSet, io.appground.blek.R.attr.checkboxStyle);
    }

    public en v(Context context, AttributeSet attributeSet) {
        return new en(context, attributeSet);
    }

    public final View x(Context context, String str, String str2) {
        String strConcat;
        sp4 sp4Var = j;
        Constructor constructor = (Constructor) sp4Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(y);
            sp4Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.g);
    }

    public cl y(Context context, AttributeSet attributeSet) {
        return new cl(context, attributeSet, io.appground.blek.R.attr.buttonStyle);
    }
}
