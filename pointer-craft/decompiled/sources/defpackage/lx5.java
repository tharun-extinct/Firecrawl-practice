package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lx5 {
    public static final float g = 0.12f;
    public static final sj0 y = sj0.i;
    public static final float r = 0.38f;
    public static final float n = 18.0f;

    public static final void g(EditorInfo editorInfo) {
        if (ph1.n()) {
            ph1.g().t(editorInfo);
        }
    }

    public static boolean n(yl ylVar, int i) {
        st0 st0Var;
        rt0 rt0Var;
        fa4 fa4Var;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 31 || xk5.x(ylVar) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) ylVar.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                fa4Var = new fa4(primaryClip, 1);
            } else {
                st0Var = new st0();
                st0Var.t = primaryClip;
                st0Var.a = (byte) 1;
            }
            if (i != 16908322) {
                rt0Var = st0Var;
                rt0Var = fa4Var;
                i3 = 1;
            }
            rt0Var = st0Var;
            rt0Var = fa4Var;
            rt0Var.c(i3);
            xk5.j(ylVar, rt0Var.build());
        }
        return true;
    }

    public static boolean r(yl ylVar, DragEvent dragEvent) {
        Activity activity;
        rt0 fa4Var;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && xk5.x(ylVar) != null) {
            Context context = ylVar.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + ylVar);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = ylVar.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                ylVar.beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) ylVar.getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        fa4Var = new fa4(clipData, 3);
                    } else {
                        st0 st0Var = new st0();
                        st0Var.t = clipData;
                        st0Var.a = (byte) 3;
                        fa4Var = st0Var;
                    }
                    xk5.j(ylVar, fa4Var.build());
                    return true;
                } finally {
                    ylVar.endBatchEdit();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public static final void v(EditorInfo editorInfo, ma2 ma2Var, k65 k65Var) {
        int i;
        int i2;
        int i3 = ma2Var.v;
        boolean z = ma2Var.g;
        int i4 = 4;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                l0.z("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i;
        int i5 = ma2Var.n;
        if (i5 != 1) {
            if (i5 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i5 == 3) {
                editorInfo.inputType = 2;
                i4 = 2;
            } else if (i5 == 4) {
                editorInfo.inputType = 3;
                i4 = 3;
            } else if (i5 == 5) {
                editorInfo.inputType = 17;
                i4 = 17;
            } else if (i5 == 6) {
                i4 = 33;
                editorInfo.inputType = 33;
            } else if (i5 == 7) {
                i4 = 129;
                editorInfo.inputType = 129;
            } else if (i5 == 8) {
                editorInfo.inputType = 18;
                i4 = 18;
            } else if (i5 == 9) {
                i4 = 8194;
                editorInfo.inputType = 8194;
            } else if (i5 == 10) {
                i4 = 145;
                editorInfo.inputType = 145;
            } else if (i5 == 11) {
                i4 = 113;
                editorInfo.inputType = 113;
            } else if (i5 == 12) {
                i4 = 97;
                editorInfo.inputType = 97;
            } else if (i5 == 13) {
                i4 = 49;
                editorInfo.inputType = 49;
            } else if (i5 == 14) {
                i4 = 65;
                editorInfo.inputType = 65;
            } else if (i5 == 15) {
                i4 = 81;
                editorInfo.inputType = 81;
            } else if (i5 == 16) {
                i4 = 177;
                editorInfo.inputType = 177;
            } else if (i5 == 17) {
                i4 = 193;
                editorInfo.inputType = 193;
            } else if (i5 == 18) {
                editorInfo.inputType = 4;
            } else {
                i4 = 20;
                if (i5 == 19) {
                    editorInfo.inputType = 20;
                } else if (i5 == 20) {
                    i4 = 36;
                    editorInfo.inputType = 36;
                } else if (i5 == 21) {
                    i4 = 4098;
                    editorInfo.inputType = 4098;
                } else if (i5 == 22) {
                    i4 = 12290;
                    editorInfo.inputType = 12290;
                } else if (i5 == 23) {
                    i4 = 8210;
                    editorInfo.inputType = 8210;
                } else if (i5 == 24) {
                    i4 = 4114;
                    editorInfo.inputType = 4114;
                } else if (i5 != 25) {
                    l0.z("Invalid Keyboard Type");
                    return;
                } else {
                    i4 = 12306;
                    editorInfo.inputType = 12306;
                }
            }
            if (!z && (i4 & 15) == 1) {
                i4 |= 131072;
                editorInfo.inputType = i4;
                if (i3 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i4 & 15) == 1) {
                i2 = ma2Var.y;
                if (i2 == 1) {
                    i4 |= 4096;
                    editorInfo.inputType = i4;
                } else if (i2 == 2) {
                    i4 |= 8192;
                    editorInfo.inputType = i4;
                } else if (i2 == 3) {
                    i4 |= 16384;
                    editorInfo.inputType = i4;
                }
                if (ma2Var.r) {
                    editorInfo.inputType = 32768 | i4;
                }
            }
            long j = k65Var.y;
            int i6 = u75.r;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            za6.q(editorInfo, k65Var.g.t);
            editorInfo.imeOptions |= 33554432;
        }
        editorInfo.inputType = 1;
        i4 = 1;
        if (!z) {
            i4 |= 131072;
            editorInfo.inputType = i4;
            if (i3 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i4 & 15) == 1) {
            i2 = ma2Var.y;
            if (i2 == 1) {
                i4 |= 4096;
                editorInfo.inputType = i4;
            } else if (i2 == 2) {
                i4 |= 8192;
                editorInfo.inputType = i4;
            } else if (i2 == 3) {
                i4 |= 16384;
                editorInfo.inputType = i4;
            }
            if (ma2Var.r) {
                editorInfo.inputType = 32768 | i4;
            }
        }
        long j2 = k65Var.y;
        int i7 = u75.r;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        za6.q(editorInfo, k65Var.g.t);
        editorInfo.imeOptions |= 33554432;
    }

    public static final boolean y(int i, int i2) {
        return i == i2;
    }
}
