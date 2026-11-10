package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gf6 {
    public static final fu1 g = new fu1(16);

    public static int g(Editable editable, int i, int i2) {
        int length = editable.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                i--;
                if (i < 0) {
                    return z ? -1 : 0;
                }
                char cCharAt = editable.charAt(i);
                if (z) {
                    if (!Character.isHighSurrogate(cCharAt)) {
                        return -1;
                    }
                    i2--;
                } else if (!Character.isSurrogate(cCharAt)) {
                    i2--;
                } else {
                    if (Character.isHighSurrogate(cCharAt)) {
                        return -1;
                    }
                    z = true;
                }
            }
            return i;
        }
    }

    public static final void n(String str) {
        str.getClass();
        throw new IllegalArgumentException(du4.i("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static ArrayList r(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static int y(Editable editable, int i, int i2) {
        int length = editable.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                if (i >= length) {
                    if (z) {
                        return -1;
                    }
                    return length;
                }
                char cCharAt = editable.charAt(i);
                if (z) {
                    if (!Character.isLowSurrogate(cCharAt)) {
                        return -1;
                    }
                    i2--;
                    i++;
                } else if (!Character.isSurrogate(cCharAt)) {
                    i2--;
                    i++;
                } else {
                    if (Character.isLowSurrogate(cCharAt)) {
                        return -1;
                    }
                    i++;
                    z = true;
                }
            }
            return i;
        }
    }
}
