package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x52 {
    public static final h00 g = new h00(-1.0f);
    public static final h00 y = new h00(1.0f);
    public static final g00 r = new g00(-1.0f);
    public static final g00 n = new g00(1.0f);

    public static final k44 g(ts3 ts3Var, int i, wb5 wb5Var, j75 j75Var, boolean z, int i2) {
        k44 k44VarR = j75Var != null ? j75Var.r(wb5Var.y.j(i)) : k44.v;
        int iV = ts3Var.V(2.0f);
        float f = k44VarR.g;
        return new k44(z ? (i2 - f) - iV : f, k44VarR.y, z ? i2 - f : iV + f, k44VarR.n);
    }

    public static final ExtractedText n(k65 k65Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k65Var.g.t;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = k65Var.y;
        extractedText.selectionStart = u75.x(j);
        extractedText.selectionEnd = u75.v(j);
        extractedText.flags = !tx4.R(k65Var.g.t, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void r(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final wa0 y(Context context, BluetoothAdapter bluetoothAdapter, bz1 bz1Var) {
        context.getClass();
        bluetoothAdapter.getClass();
        return a11.v(new s3((Object) bluetoothAdapter, context, (Object) bz1Var, (mu0) null, (byte) 12));
    }
}
