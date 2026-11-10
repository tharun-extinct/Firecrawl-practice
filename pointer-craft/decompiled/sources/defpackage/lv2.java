package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lv2 implements Iterator, vh2 {
    public int a;
    public final CharSequence j;
    public int m;
    public int q;
    public byte t;

    public lv2(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.t;
        if (b != 0) {
            return b == 1;
        }
        if (this.q < 0) {
            this.t = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.j;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.a; i3 < length2; i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.t = (byte) 1;
                this.q = i;
                this.m = length;
                return true;
            }
        }
        i = -1;
        this.t = (byte) 1;
        this.q = i;
        this.m = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uo1.b();
            return null;
        }
        this.t = (byte) 0;
        int i = this.m;
        int i2 = this.a;
        this.a = this.q + i;
        return this.j.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
