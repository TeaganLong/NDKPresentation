#include <jni.h>
#include <string>

/**
 * Macro to make method declaration less cumbersome
 */
#define JNI_METHOD(RETURN, METHOD_NAME) \
    extern "C" JNIEXPORT RETURN JNICALL Java_com_example_ndkpresentation_MainActivity_##METHOD_NAME

/**
 * Addition Function
 */
JNI_METHOD(jint, add)(JNIEnv *, jobject, jint x, jint y) {
    return x + y;
}

/**
 * Subtraction Function
 */
 JNI_METHOD(jint, subtract)(JNIEnv *, jobject, jint x, jint y) {
     return x - y;
 }

 /**
  * Multiply Function
  */
  JNI_METHOD(jint, multiply)(JNIEnv *, jobject, jint x, jint y) {
      return x * y;
  }

  /**
   * Divide Function
   */
   JNI_METHOD(jint, divide)(JNIEnv *, jobject, jint x, jint y) {
       return x / y;
   }