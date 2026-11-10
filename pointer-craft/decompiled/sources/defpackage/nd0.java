package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nd0 implements CharacterIterator {
    public int a = 0;
    public final CharSequence j;
    public final int t;

    public nd0(CharSequence charSequence, int i) {
        this.j = charSequence;
        this.t = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.a;
        if (i == this.t) {
            return (char) 65535;
        }
        return this.j.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.a = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.t;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.a;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.t;
        if (i == 0) {
            this.a = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.a = i2;
        return this.j.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.a + 1;
        this.a = i;
        int i2 = this.t;
        if (i < i2) {
            return this.j.charAt(i);
        }
        this.a = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.a;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.a = i2;
        return this.j.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.t || i < 0) {
            l0.u("invalid position");
            return (char) 0;
        }
        this.a = i;
        return current();
    }
}
