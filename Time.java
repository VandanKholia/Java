// Source code is decompiled from a .class file using FernFlower decompiler.
public class Time {
   int hr;
   int min;

   Time() {
      this.hr = 12;
      this.min = 45;
   }

   Time(int var1, int var2) {
      this.hr = var1;
      this.min = var2;
   }

   void addition(int var1, int var2, int var3, int var4) {
      int var5 = var1 + var2;
      int var6 = var3 + var4;
      if (var6 > 60) {
         ++var5;
         var6 -= 60;
      }

      System.out.println("" + var5 + " " + var6);
   }
}
