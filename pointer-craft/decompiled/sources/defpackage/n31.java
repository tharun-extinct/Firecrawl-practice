package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class n31 extends g90 {
    public rk4 n;
    public boolean r;
    public final boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(qu4 qu4Var, boolean z) {
        super(qu4Var);
        qu4Var.getClass();
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[Catch: RuntimeException -> 0x00ec, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ec, blocks: (B:78:0x00e0, B:80:0x00e6), top: B:91:0x00e0 }] */
    public final rk4 u(Context context) {
        int i;
        rk4 rk4Var;
        Animator animatorLoadAnimator;
        int iT;
        if (this.r) {
            return this.n;
        }
        qu4 qu4Var = (qu4) this.g;
        pw1 pw1Var = qu4Var.r;
        boolean z = qu4Var.g == su4.a;
        mw1 mw1Var = pw1Var.R;
        int i2 = mw1Var == null ? 0 : mw1Var.x;
        if (this.y) {
            if (z) {
                if (mw1Var == null) {
                    i = 0;
                } else {
                    i = mw1Var.n;
                }
            } else if (mw1Var == null) {
                i = 0;
            } else {
                i = mw1Var.v;
            }
        } else if (z) {
            if (mw1Var == null) {
                i = 0;
            } else {
                i = mw1Var.y;
            }
        } else if (mw1Var == null) {
            i = 0;
        } else {
            i = mw1Var.r;
        }
        pw1Var.P(0, 0, 0, 0);
        ViewGroup viewGroup = pw1Var.N;
        rk4 rk4Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            pw1Var.N.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = pw1Var.N;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iT = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iT = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iT = z ? gp4.T(context, android.R.attr.activityCloseEnterAnimation) : gp4.T(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iT = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iT = -1;
                } else {
                    iT = z ? gp4.T(context, android.R.attr.activityOpenEnterAnimation) : gp4.T(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iT;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            rk4Var = new rk4(animationLoadAnimation);
                            rk4Var2 = rk4Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                rk4Var = new rk4(animatorLoadAnimator);
                                rk4Var2 = rk4Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                rk4Var2 = new rk4(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        rk4Var = new rk4(animatorLoadAnimator);
                        rk4Var2 = rk4Var;
                    }
                }
            }
        }
        this.n = rk4Var2;
        this.r = true;
        return rk4Var2;
    }
}
