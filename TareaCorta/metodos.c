#include <stdio.h>
#include "jni.h"
#include "calculadora.h"
#include <conio.h> 


   JNIEXPORT jint JNICALL Java_calculadora_sumaC
  (JNIEnv * env, jobject jobj, jint num1, jint num2)
{
	int suma;
	suma = num1 + num2;
    return suma;
}

 JNIEXPORT jint JNICALL Java_calculadora_restaC
  (JNIEnv * env, jobject jobj, jint num1, jint num2)
{
	int resta;
	resta = num1 - num2;
    return resta;
}
   
   
  JNIEXPORT jint JNICALL Java_calculadora_multC
  (JNIEnv * env, jobject jobj, jint num1, jint num2)
{
	int mult;
	mult = num1 * num2;
    return mult;
}
   
   
  JNIEXPORT jint JNICALL Java_calculadora_divC
  (JNIEnv * env, jobject jobj, jint num1, jint num2)
{
	int div;
	div = num1 / num2;
    return div;
}
   
   