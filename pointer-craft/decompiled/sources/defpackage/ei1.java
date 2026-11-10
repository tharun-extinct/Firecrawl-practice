package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ei1 extends ra {
    public final TextView J;
    public final yh1 K;
    public boolean L = true;

    public ei1(TextView textView) {
        this.J = textView;
        this.K = new yh1(textView);
    }

    @Override // defpackage.ra
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.L) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof yh1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            yh1 yh1Var = this.K;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = yh1Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == yh1Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.ra
    public final void Q(boolean z) {
        if (z) {
            W();
        }
    }

    @Override // defpackage.ra
    public final void R(boolean z) {
        this.L = z;
        W();
        TextView textView = this.J;
        textView.setFilters(A(textView.getFilters()));
    }

    public final void W() {
        TextView textView = this.J;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.L) {
            if (!(transformationMethod instanceof ii1) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new ii1(transformationMethod);
            }
        } else if (transformationMethod instanceof ii1) {
            transformationMethod = ((ii1) transformationMethod).j;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
