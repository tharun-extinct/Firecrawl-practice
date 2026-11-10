package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class hg3 {
    public ViewParent g;
    public boolean n;
    public final ViewGroup r;
    public int[] v;
    public ViewParent y;

    public hg3(ViewGroup viewGroup) {
        this.r = viewGroup;
    }

    public final boolean g(float f, float f2, boolean z) {
        ViewParent viewParentV;
        if (this.n && (viewParentV = v(0)) != null) {
            try {
                return viewParentV.onNestedFling(this.r, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentV + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final void j(int i) {
        ViewParent viewParentV = v(i);
        if (viewParentV != null) {
            boolean z = viewParentV instanceof ig3;
            ViewGroup viewGroup = this.r;
            if (z) {
                ((ig3) viewParentV).y(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentV.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentV + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.g = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.y = null;
            }
        }
    }

    public final boolean l(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!x(i2)) {
            if (this.n) {
                View view = this.r;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof ig3;
                    if (z) {
                        zOnStartNestedScroll = ((ig3) parent).a(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.g = parent;
                        } else if (i2 == 1) {
                            this.y = parent;
                        }
                        if (z) {
                            ((ig3) parent).g(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentV;
        int i6;
        int i7;
        int[] iArr3;
        if (this.n && (viewParentV = v(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.r;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.v;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.v = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentV instanceof jg3) {
                    ((jg3) viewParentV).l(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentV instanceof ig3) {
                        ((ig3) viewParentV).j(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentV.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentV + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentV;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.n || (viewParentV = v(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.r;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            int[] iArr4 = this.v;
            if (iArr4 == null) {
                iArr4 = new int[2];
                this.v = iArr4;
            }
            iArr3 = iArr4;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentV instanceof ig3) {
            ((ig3) viewParentV).r(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentV.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentV + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup = viewGroup;
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        viewGroup = viewGroup;
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final ViewParent v(int i) {
        if (i == 0) {
            return this.g;
        }
        if (i != 1) {
            return null;
        }
        return this.y;
    }

    public final boolean x(int i) {
        return v(i) != null;
    }

    public final boolean y(float f, float f2) {
        ViewParent viewParentV;
        if (this.n && (viewParentV = v(0)) != null) {
            try {
                return viewParentV.onNestedPreFling(this.r, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentV + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }
}
