package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g44 implements InputConnection {
    public final fa4 g;
    public k65 n;
    public int r;
    public int v;
    public boolean x;
    public final boolean y;
    public final ArrayList l = new ArrayList();
    public boolean j = true;

    public g44(k65 k65Var, fa4 fa4Var, boolean z) {
        this.g = fa4Var;
        this.y = z;
        this.n = k65Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        this.r++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.j;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.l.clear();
        this.r = 0;
        this.j = false;
        ArrayList arrayList = ((x65) this.g.t).t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (yf2.p(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.j;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.j;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.j;
        return z ? this.y : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.j;
        if (z) {
            g(new rk0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        g(new e51(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        g(new f51(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return y();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        g(new mo1());
        return true;
    }

    public final void g(ug1 ug1Var) {
        this.r++;
        try {
            this.l.add(ug1Var);
        } finally {
            y();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        k65 k65Var = this.n;
        return TextUtils.getCapsMode(k65Var.g.t, u75.x(k65Var.y), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.x = z;
        if (z) {
            this.v = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return x52.n(this.n);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (u75.r(this.n.y)) {
            return null;
        }
        return mu5.a(this.n).t;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return mu5.m(this.n, i).t;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return mu5.q(this.n, i).t;
    }

    public final void n(k65 k65Var) {
        this.n = k65Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.j;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    g(new ml4(0, this.n.g.t.length()));
                    break;
                case R.id.cut:
                    r(277);
                    return false;
                case R.id.copy:
                    r(278);
                    return false;
                case R.id.paste:
                    r(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.j;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((x65) this.g.t).x.a(new la2(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.j;
        if (z) {
            return true;
        }
        return z;
    }

    public final void r(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        iy0 iy0Var;
        boolean z4 = this.j;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            iy0Var = ((x65) this.g.t).q;
            synchronized (iy0Var.r) {
                try {
                    iy0Var.x = z2;
                    iy0Var.l = z3;
                    iy0Var.j = z5;
                    iy0Var.t = z;
                    if (z6) {
                        iy0Var.v = true;
                        if (iy0Var.a != null) {
                            iy0Var.g();
                        }
                    }
                    iy0Var.n = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        iy0Var = ((x65) this.g.t).q;
        synchronized (iy0Var.r) {
            iy0Var.x = z2;
            iy0Var.l = z3;
            iy0Var.j = z5;
            iy0Var.t = z;
            if (z6) {
                iy0Var.v = true;
                if (iy0Var.a != null) {
                    iy0Var.g();
                }
            }
            iy0Var.n = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((x65) this.g.t).a.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.j;
        if (z) {
            g(new kl4(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.j;
        if (z) {
            g(new ll4(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.j;
        if (!z) {
            return z;
        }
        g(new ml4(i, i2));
        return true;
    }

    public final void v(k65 k65Var, ro roVar) {
        if (this.j) {
            this.n = k65Var;
            if (this.x) {
                ((InputMethodManager) ((wp2) roVar.a).getValue()).updateExtractedText((View) roVar.t, this.v, x52.n(k65Var));
            }
            u75 u75Var = k65Var.r;
            long j = k65Var.y;
            int iX = u75Var != null ? u75.x(u75Var.g) : -1;
            u75 u75Var2 = k65Var.r;
            int iV = u75Var2 != null ? u75.v(u75Var2.g) : -1;
            ((InputMethodManager) ((wp2) roVar.a).getValue()).updateSelection((View) roVar.t, u75.x(j), u75.v(j), iX, iV);
        }
    }

    public final boolean y() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            ArrayList arrayList = this.l;
            if (!arrayList.isEmpty()) {
                ((x65) this.g.t).v.a(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.r > 0;
    }
}
