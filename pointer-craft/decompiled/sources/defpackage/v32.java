package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v32 extends ig6 {
    public final BreakIterator t;

    public v32(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.t = characterInstance;
    }

    @Override // defpackage.ig6
    public final int g(int i) {
        return this.t.following(i);
    }

    @Override // defpackage.ig6
    public final int r(int i) {
        return this.t.preceding(i);
    }
}
