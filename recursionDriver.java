public class recursionDriver
{
 public static int count(int n)
 /* Task 1
 {
     if (n <1)
      return 0;
  
      return 4+count(n-1);
 }
 */
  {
      /*
    if (n<= 1)
        return 20;
        return 20 +count(n-1);
    */
   if (n<= 1)
    return 0;
    
    return 5+count(n-1);
   
  }
 
 
 public static void main(String[] args)
 {
 /*
 * Count 
 * 1. Number of legs 10 elephant have
 * 2. Number of students in a school if each
 * class has 20 students and there are 12 rooms
 * 3. Number of fingers if there are 8 people
 * 4. Find the sum of odd numbers from 0 to N
 * 5. Find the sum of even numbers from 0 to N
*/ 
/*
 int counted=0;
 // Task 1.
 counted = count(10);
 System.out.println(counted);
 */
/*
 int counted=0;
 // Task 2.
 counted = count(12);
 System.out.println(counted);
 */
/*
 int counted=0;
 // Task 2.
 counted = count(9);
 System.out.println(counted);
 */
 }
}