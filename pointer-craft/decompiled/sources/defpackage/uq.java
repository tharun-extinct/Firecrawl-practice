package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uq implements TypeEvaluator {
    public static Integer g(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fY = du4.y(f3, f2, f, f2);
        float fY2 = du4.y(fPow4, fPow, f, fPow);
        float fY3 = du4.y(fPow5, fPow2, f, fPow2);
        float fY4 = du4.y(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fY2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fY3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fY4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fY * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
