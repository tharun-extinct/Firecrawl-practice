package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xh1 extends mh1 implements Runnable {
    public final WeakReference j;
    public final WeakReference t;

    public xh1(TextView textView, yh1 yh1Var) {
        this.j = new WeakReference(textView);
        this.t = new WeakReference(yh1Var);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.j.get();
        InputFilter inputFilter = (InputFilter) this.t.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    ph1 ph1VarG = ph1.g();
                    if (text == null) {
                        length = 0;
                    } else {
                        ph1VarG.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceL = ph1VarG.l(0, length, 0, text);
                    if (text == charSequenceL) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceL);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceL);
                    textView.setText(charSequenceL);
                    if (charSequenceL instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceL;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.mh1
    public final void y() {
        Handler handler;
        TextView textView = (TextView) this.j.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
