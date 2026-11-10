package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 {
    public final List g;
    public final int n;
    public final int r;
    public final int v;
    public int x;
    public final mf2 y;

    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    public ju3(List list, mf2 mf2Var) {
        MotionEvent motionEventG;
        this.g = list;
        this.y = mf2Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.r = (i < 29 || (motionEventG = g()) == null) ? 0 : motionEventG.getClassification();
        MotionEvent motionEventG2 = g();
        this.n = motionEventG2 != null ? motionEventG2.getButtonState() : 0;
        MotionEvent motionEventG3 = g();
        this.v = motionEventG3 != null ? motionEventG3.getMetaState() : 0;
        MotionEvent motionEventG4 = g();
        if (motionEventG4 != null) {
            boolean z = i >= 34 && motionEventG4.getClassification() == 3;
            boolean z2 = i >= 34 && motionEventG4.getClassification() == 5;
            int actionMasked = motionEventG4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (z2) {
                                    i2 = 7;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (z2) {
                                    i2 = 9;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (!z2 || z2) {
                    i2 = 2;
                } else {
                    i2 = 9;
                }
            } else if (z) {
                i2 = 10;
            } else if (!z2 || z2) {
                i2 = 1;
            } else {
                i2 = 7;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    qu3 qu3Var = (qu3) list.get(i2);
                    if (fd6.n(qu3Var)) {
                        i2 = 2;
                    } else if (fd6.y(qu3Var)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.x = i2;
    }

    public final MotionEvent g() {
        mf2 mf2Var = this.y;
        if (mf2Var != null) {
            return mf2Var.n();
        }
        return null;
    }
}
