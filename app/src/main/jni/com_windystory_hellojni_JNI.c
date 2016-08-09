#include "com_windystory_hellojni_JNI.h"
/*
 * Class:     com_windystory_hellojni_JNI
 * Method:    Hello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_windystory_hellojni_JNI_Hello
  (JNIEnv *evn, jobject obj)
{
   return (*evn)->NewStringUTF(evn, "Hello from My-JNI !");

}
