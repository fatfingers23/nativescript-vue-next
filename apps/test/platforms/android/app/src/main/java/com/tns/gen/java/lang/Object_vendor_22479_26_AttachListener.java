/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.java.lang;

public class Object_vendor_22479_26_AttachListener extends java.lang.Object
    implements com.tns.NativeScriptHashCodeProvider, android.view.View.OnAttachStateChangeListener {
  public Object_vendor_22479_26_AttachListener() {
    super();
    com.tns.Runtime.initInstance(this);
  }

  public void onViewAttachedToWindow(android.view.View param_0) {
    java.lang.Object[] args = new java.lang.Object[1];
    args[0] = param_0;
    com.tns.Runtime.callJSMethod(this, "onViewAttachedToWindow", void.class, args);
  }

  public void onViewDetachedFromWindow(android.view.View param_0) {
    java.lang.Object[] args = new java.lang.Object[1];
    args[0] = param_0;
    com.tns.Runtime.callJSMethod(this, "onViewDetachedFromWindow", void.class, args);
  }

  public int hashCode__super() {
    return super.hashCode();
  }

  public boolean equals__super(java.lang.Object other) {
    return super.equals(other);
  }
}
