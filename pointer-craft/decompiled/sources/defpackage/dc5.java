package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dc5 {
    public static long g(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void y(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
