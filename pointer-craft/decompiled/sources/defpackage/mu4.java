package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mu4 extends SpannableStringBuilder {
    public final Class j;
    public final ArrayList t;

    public mu4(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.t = new ArrayList();
        xs2.t(cls, "watcherClass cannot be null");
        this.j = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return;
            }
            ((lu4) arrayList.get(i)).t.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        lu4 lu4VarR;
        if (n(obj) && (lu4VarR = r(obj)) != null) {
            obj = lu4VarR;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        lu4 lu4VarR;
        if (n(obj) && (lu4VarR = r(obj)) != null) {
            obj = lu4VarR;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        lu4 lu4VarR;
        if (n(obj) && (lu4VarR = r(obj)) != null) {
            obj = lu4VarR;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.j != cls) {
            return super.getSpans(i, i2, cls);
        }
        lu4[] lu4VarArr = (lu4[]) super.getSpans(i, i2, lu4.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, lu4VarArr.length);
        for (int i3 = 0; i3 < lu4VarArr.length; i3++) {
            objArr[i3] = lu4VarArr[i3].j;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final boolean n(Object obj) {
        if (obj != null) {
            return this.j == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.j == cls) {
            cls = lu4.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final lu4 r(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return null;
            }
            lu4 lu4Var = (lu4) arrayList.get(i);
            if (lu4Var.j == obj) {
                return lu4Var;
            }
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        lu4 lu4VarR;
        if (n(obj)) {
            lu4VarR = r(obj);
            if (lu4VarR != null) {
                obj = lu4VarR;
            }
        } else {
            lu4VarR = null;
        }
        super.removeSpan(obj);
        if (lu4VarR != null) {
            this.t.remove(lu4VarR);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        g();
        super.replace(i, i2, charSequence);
        v();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (n(obj)) {
            lu4 lu4Var = new lu4(obj);
            this.t.add(lu4Var);
            obj = lu4Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new mu4(this.j, this, i, i2);
    }

    public final void v() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return;
            }
            ((lu4) arrayList.get(i)).t.decrementAndGet();
            i++;
        }
    }

    public final void y() {
        v();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return;
            }
            ((lu4) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        g();
        super.replace(i, i2, charSequence, i3, i4);
        v();
        return this;
    }

    public mu4(Class cls, mu4 mu4Var, int i, int i2) {
        super(mu4Var, i, i2);
        this.t = new ArrayList();
        xs2.t(cls, "watcherClass cannot be null");
        this.j = cls;
    }
}
