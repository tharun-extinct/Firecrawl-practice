package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;
import io.appground.blek.ui.controls.TextInputView;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy extends pw1 {
    public tw1 j0;
    public vl k0;
    public final rv l0;
    public final rv m0 = new rv(v54.g(wm4.class), new fy(this, 3), new fy(this, 5), new fy(this, 4));
    public final rv n0 = new rv(v54.g(gp.class), new fy(this, 6), new fy(this, 8), new fy(this, 7));
    public boolean o0;
    public boolean p0;
    public iv4 q0;
    public final o05 r0;
    public final o05 s0;
    public iv4 t0;

    public gy() {
        final byte b = 0;
        final byte b2 = 1;
        this.l0 = new rv(v54.g(qr0.class), new fy(this, b), new fy(this, (byte) 2), new fy(this, b2));
        this.r0 = new o05(new my1(this) { // from class: lx
            public final /* synthetic */ gy t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b;
                gy gyVar = this.t;
                switch (b3) {
                    case 0:
                        return gy.R(gyVar, null, null, 3);
                    default:
                        return (ClipboardManager) gyVar.N().getSystemService(ClipboardManager.class);
                }
            }
        });
        this.s0 = new o05(new my1(this) { // from class: lx
            public final /* synthetic */ gy t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                gy gyVar = this.t;
                switch (b3) {
                    case 0:
                        return gy.R(gyVar, null, null, 3);
                    default:
                        return (ClipboardManager) gyVar.N().getSystemService(ClipboardManager.class);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [kx] */
    public static kx R(final gy gyVar, final TextInputEditText textInputEditText, final TextInputView textInputView, int i) {
        if ((i & 1) != 0) {
            textInputEditText = null;
        }
        if ((i & 2) != 0) {
            textInputView = null;
        }
        return new View.OnKeyListener() { // from class: kx
            /* JADX WARN: Code duplicated, block: B:34:0x005a  */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                String str;
                String str2;
                ql4 ql4Var;
                TextInputEditText textInputEditText2 = textInputEditText;
                mu0 mu0Var = null;
                Editable text = textInputEditText2 != null ? textInputEditText2.getText() : null;
                byte b = 0;
                boolean z = text == null || text.length() == 0;
                boolean z2 = !z;
                if (i2 != 4) {
                    gy gyVar2 = gyVar;
                    if (i2 != 66) {
                        if (i2 == 24 || i2 == 25) {
                            boolean z3 = keyEvent.getAction() == 0;
                            if (!gyVar2.X()) {
                                if (z3) {
                                    gyVar2.S().l(Integer.valueOf(R.string.premium_feature_volume_buttons), "volume_key");
                                    return true;
                                }
                                return true;
                            }
                            if (i2 == 24) {
                                ql4 ql4Var2 = (ql4) gyVar2.W().l.j.getValue();
                                if (ql4Var2 != null) {
                                    str = ql4Var2.C;
                                    str2 = str;
                                } else {
                                    str2 = null;
                                }
                            } else if (i2 == 25 && (ql4Var = (ql4) gyVar2.W().l.j.getValue()) != null) {
                                str = ql4Var.D;
                                str2 = str;
                            } else {
                                str2 = null;
                            }
                            if (!yf2.p(str2, "system")) {
                                m50.T(mq2.a(gyVar2), null, new ux(str2, gyVar2, z3, mu0Var, (byte) 0), 3);
                                return true;
                            }
                        } else if (z) {
                        }
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        m50.T(mq2.a(gyVar2), null, new rx(i2, z2, textInputEditText2, gyVar2, textInputView, keyEvent, null), 3);
                        return true;
                    }
                    if (action != 1) {
                        if (action == 2) {
                            if (!yf2.p(Settings.Secure.getString(gyVar2.N().getContentResolver(), "default_input_method"), "com.samsung.android.honeyboard/.service.HoneyBoardService")) {
                                String characters = keyEvent.getCharacters();
                                qr0 qr0VarT = gyVar2.T();
                                characters.getClass();
                                qr0.b(qr0VarT, characters);
                                m50.T(mq2.a(gyVar2), null, new tx(gyVar2, characters, mu0Var, b), 3);
                                return true;
                            }
                        }
                    } else if (keyEvent.getUnicodeChar() == 0) {
                        m50.T(mq2.a(gyVar2), null, new sx(gyVar2, gy.U(keyEvent), i2, null), 3);
                    }
                    return true;
                }
                return false;
            }
        };
    }

    public static int U(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed()) {
            return 59;
        }
        if (keyEvent.isAltPressed()) {
            return 57;
        }
        if (keyEvent.isCtrlPressed()) {
            return 113;
        }
        return keyEvent.isSymPressed() ? 63 : 0;
    }

    @Override // defpackage.pw1
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_base_control, viewGroup, false);
        int i = R.id.button_direct_mode;
        Button button = (Button) br2.i(viewInflate, R.id.button_direct_mode);
        mu0 mu0Var = null;
        if (button != null) {
            i = R.id.control;
            FrameLayout frameLayout = (FrameLayout) br2.i(viewInflate, R.id.control);
            if (frameLayout != null) {
                i = R.id.edit_text;
                TextInputEditText textInputEditText = (TextInputEditText) br2.i(viewInflate, R.id.edit_text);
                if (textInputEditText != null) {
                    i = R.id.enterTextField;
                    TextInputLayout textInputLayout = (TextInputLayout) br2.i(viewInflate, R.id.enterTextField);
                    if (textInputLayout != null) {
                        i = R.id.keyboard_bar;
                        LinearLayout linearLayout = (LinearLayout) br2.i(viewInflate, R.id.keyboard_bar);
                        if (linearLayout != null) {
                            i = R.id.keyboard_layout_switch;
                            MaterialButton materialButton = (MaterialButton) br2.i(viewInflate, R.id.keyboard_layout_switch);
                            if (materialButton != null) {
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                i = R.id.textInputView;
                                TextInputView textInputView = (TextInputView) br2.i(viewInflate, R.id.textInputView);
                                if (textInputView != null) {
                                    i = R.id.text_visibility;
                                    CheckBox checkBox = (CheckBox) br2.i(viewInflate, R.id.text_visibility);
                                    if (checkBox != null) {
                                        i = R.id.toggleButton;
                                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) br2.i(viewInflate, R.id.toggleButton);
                                        if (materialButtonToggleGroup != null) {
                                            i = R.id.tutorial;
                                            MaterialCardView materialCardView = (MaterialCardView) br2.i(viewInflate, R.id.tutorial);
                                            if (materialCardView != null) {
                                                i = R.id.tutorial_negative_button;
                                                MaterialButton materialButton2 = (MaterialButton) br2.i(viewInflate, R.id.tutorial_negative_button);
                                                if (materialButton2 != null) {
                                                    i = R.id.tutorial_positive_button;
                                                    MaterialButton materialButton3 = (MaterialButton) br2.i(viewInflate, R.id.tutorial_positive_button);
                                                    if (materialButton3 != null) {
                                                        i = R.id.tutorial_text_view;
                                                        TextView textView = (TextView) br2.i(viewInflate, R.id.tutorial_text_view);
                                                        if (textView != null) {
                                                            this.j0 = new tw1(linearLayout2, button, frameLayout, textInputEditText, textInputLayout, linearLayout, materialButton, linearLayout2, textInputView, checkBox, materialButtonToggleGroup, materialCardView, materialButton2, materialButton3, textView);
                                                            linearLayout2.getClass();
                                                            tw1 tw1Var = this.j0;
                                                            tw1Var.getClass();
                                                            if (Y(layoutInflater, tw1Var.r)) {
                                                                tw1 tw1Var2 = this.j0;
                                                                tw1Var2.getClass();
                                                                tw1Var2.c.setOnClickListener(new jx(this, b));
                                                                tw1 tw1Var3 = this.j0;
                                                                tw1Var3.getClass();
                                                                tw1Var3.w.setOnClickListener(new jx(this, (byte) 2));
                                                                m50.T(mq2.a(b()), null, new wx(this, mu0Var, b), 3);
                                                            }
                                                            return linearLayout2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        l0.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.pw1
    public final void C() {
        this.M = true;
        this.j0 = null;
    }

    @Override // defpackage.pw1
    public final void I(View view) {
        LinearLayout linearLayout;
        view.getClass();
        LayoutInflater layoutInflaterE = this.T;
        mu0 mu0Var = null;
        if (layoutInflaterE == null) {
            layoutInflaterE = E(null);
            this.T = layoutInflaterE;
        }
        layoutInflaterE.getClass();
        view.getClass();
        vl vlVar = new vl();
        vlVar.g = view;
        final byte b = 0;
        View viewInflate = layoutInflaterE.inflate(R.layout.text_input_popup, (ViewGroup) null, false);
        TextView textView = (TextView) br2.i(viewInflate, R.id.text);
        if (textView == null) {
            l0.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.text)));
            throw null;
        }
        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
        vlVar.y = new u65(materialCardView, textView);
        vlVar.r = new PopupWindow(materialCardView, -2, -2);
        vlVar.n = new StringBuffer();
        fh2 fh2VarV = v70.v();
        x21 x21Var = na1.g;
        vlVar.x = k33.x(a11.k(fh2VarV, p03.g));
        this.k0 = vlVar;
        tw1 tw1Var = this.j0;
        tw1Var.getClass();
        tw1Var.j.setOnKeyListener((View.OnKeyListener) this.r0.getValue());
        tw1 tw1Var2 = this.j0;
        tw1Var2.getClass();
        TextInputEditText textInputEditText = tw1Var2.n;
        tw1 tw1Var3 = this.j0;
        tw1Var3.getClass();
        byte b2 = 2;
        textInputEditText.setOnKeyListener(R(this, tw1Var3.n, null, 2));
        tw1 tw1Var4 = this.j0;
        tw1Var4.getClass();
        TextInputView textInputView = tw1Var4.t;
        tw1 tw1Var5 = this.j0;
        tw1Var5.getClass();
        final byte b3 = 1;
        textInputView.setOnKeyListener(R(this, null, tw1Var5.t, 1));
        tw1 tw1Var6 = this.j0;
        tw1Var6.getClass();
        tw1Var6.t.setTextInputListener(new y22((Object) this, (byte) 8));
        tw1 tw1Var7 = this.j0;
        tw1Var7.getClass();
        LinearLayout linearLayout2 = tw1Var7.j;
        linearLayout2.getClass();
        if (!linearLayout2.isLaidOut() || linearLayout2.isLayoutRequested()) {
            linearLayout2.addOnLayoutChangeListener(new xx(this));
        } else {
            tw1 tw1Var8 = this.j0;
            if (tw1Var8 != null && (linearLayout = tw1Var8.j) != null) {
                linearLayout.requestFocus();
            }
        }
        tw1 tw1Var9 = this.j0;
        tw1Var9.getClass();
        tw1Var9.a.setOnClickListener(new jx(this, (byte) 3));
        tw1 tw1Var10 = this.j0;
        tw1Var10.getClass();
        tw1Var10.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                compoundButton.getClass();
                gy gyVar = this.g;
                tw1 tw1Var11 = gyVar.j0;
                tw1Var11.getClass();
                tw1Var11.t.setVisibility(z);
                tw1 tw1Var12 = gyVar.j0;
                tw1Var12.getClass();
                TextInputEditText textInputEditText2 = tw1Var12.n;
                int i = rp2.g;
                textInputEditText2.setTransformationMethod(z ? PasswordTransformationMethod.getInstance() : null);
                textInputEditText2.setInputType(z ? 129 : 1);
                gyVar.W().x().edit().putBoolean("password_mode_enabled", z).apply();
            }
        });
        tw1 tw1Var11 = this.j0;
        tw1Var11.getClass();
        tw1Var11.y.setOnClickListener(new jx(this, (byte) 4));
        tw1 tw1Var12 = this.j0;
        tw1Var12.getClass();
        final TextInputLayout textInputLayout = tw1Var12.v;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new zx(this));
        }
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: nx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Editable editableText;
                ClipData primaryClip;
                ClipData.Item itemAt;
                CharSequence text;
                gy gyVar = this.j;
                if (!gyVar.X()) {
                    gyVar.S().l(null, "paste_button");
                    return;
                }
                EditText editText2 = textInputLayout.getEditText();
                if (editText2 == null || (editableText = editText2.getEditableText()) == null) {
                    return;
                }
                if (editableText.length() != 0) {
                    qr0.b(gyVar.T(), editableText.toString());
                    tw1 tw1Var13 = gyVar.j0;
                    tw1Var13.getClass();
                    tw1Var13.n.setText("");
                    return;
                }
                ClipboardManager clipboardManager = (ClipboardManager) gyVar.s0.getValue();
                if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
                    return;
                }
                tw1 tw1Var14 = gyVar.j0;
                tw1Var14.getClass();
                tw1Var14.n.setText(text);
            }
        });
        tw1 tw1Var13 = this.j0;
        tw1Var13.getClass();
        tw1Var13.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ox
            public final /* synthetic */ gy y;

            {
                this.y = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                byte b4 = b;
                gy gyVar = this.y;
                switch (b4) {
                    case 0:
                        if (z && !gyVar.X() && !yf2.p(gyVar.W().x().getString("keyboard_layout", ""), "korean")) {
                            gyVar.S().l(null, "text_field");
                            gyVar.b0();
                            break;
                        }
                        break;
                    default:
                        tw1 tw1Var14 = gyVar.j0;
                        if (!z) {
                            if (tw1Var14 != null) {
                                tw1Var14.m.q(R.id.button_direct_mode, false);
                            }
                        } else if (tw1Var14 != null) {
                            tw1Var14.m.q(R.id.button_direct_mode, true);
                        }
                        break;
                }
            }
        });
        tw1 tw1Var14 = this.j0;
        tw1Var14.getClass();
        tw1Var14.t.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ox
            public final /* synthetic */ gy y;

            {
                this.y = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                byte b4 = b3;
                gy gyVar = this.y;
                switch (b4) {
                    case 0:
                        if (z && !gyVar.X() && !yf2.p(gyVar.W().x().getString("keyboard_layout", ""), "korean")) {
                            gyVar.S().l(null, "text_field");
                            gyVar.b0();
                            break;
                        }
                        break;
                    default:
                        tw1 tw1Var15 = gyVar.j0;
                        if (!z) {
                            if (tw1Var15 != null) {
                                tw1Var15.m.q(R.id.button_direct_mode, false);
                            }
                        } else if (tw1Var15 != null) {
                            tw1Var15.m.q(R.id.button_direct_mode, true);
                        }
                        break;
                }
            }
        });
        tw1 tw1Var15 = this.j0;
        tw1Var15.getClass();
        tw1Var15.l.setOnClickListener(new jx(this, b3));
        m50.T(mq2.a(b()), null, new wx(this, mu0Var, b3), 3);
        m50.T(mq2.a(b()), null, new wx(this, mu0Var, b2), 3);
    }

    public final gp S() {
        return (gp) this.n0.getValue();
    }

    public final qr0 T() {
        return (qr0) this.l0.getValue();
    }

    public final k40 V() {
        x30 x30Var = T().r.l.y;
        if (x30Var == null) {
            return null;
        }
        Object obj = x30Var.g.get(v54.g(k40.class));
        return (k40) (obj instanceof k40 ? obj : null);
    }

    public final wm4 W() {
        return (wm4) this.m0.getValue();
    }

    public final boolean X() {
        return ((Boolean) S().r.j.getValue()).booleanValue();
    }

    public abstract boolean Y(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void Z(View view) {
        if (this.p0) {
            view.performHapticFeedback(3, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(TextInputEditText textInputEditText, ou0 ou0Var) {
        ay ayVar;
        if (ou0Var instanceof ay) {
            ayVar = (ay) ou0Var;
            int i = ayVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayVar.w = i - Integer.MIN_VALUE;
            } else {
                ayVar = new ay(this, ou0Var);
            }
        } else {
            ayVar = new ay(this, ou0Var);
        }
        Object obj = ayVar.m;
        int i2 = ayVar.w;
        byte b = 1;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            qr0.b(T(), String.valueOf(textInputEditText.getText()));
            x21 x21Var = na1.g;
            t42 t42Var = p03.g;
            qx qxVar = new qx(textInputEditText, mu0Var, b);
            ayVar.w = 1;
            Object objF0 = m50.f0(t42Var, qxVar, ayVar);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }

    public final void b0() {
        tw1 tw1Var = this.j0;
        if (tw1Var != null) {
            TextInputView textInputView = tw1Var.t;
            if (textInputView.hasFocus()) {
                return;
            }
            textInputView.requestFocus();
        }
    }

    @Override // defpackage.pw1
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (!this.K) {
            this.K = true;
            if (!u() || z()) {
                return;
            }
            this.B.A.invalidateOptionsMenu();
        }
    }
}
