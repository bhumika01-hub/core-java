package Tutorial1;

import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int n = 6;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//                System.out.println("");
//        }

//        for(int i=1;i<=4;i++){
//            for(int j=i;j<=4;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int i=1;i<=4;i++){
//            for(int j=i;j<4;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<i;k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//            for(int i=1;i<n;i++){
//            for(int j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<i;k++){
//                System.out.print("*");
//            }
//            for(int l=i;l<n;l++){
//                System.out.print(" ");
//            }
//                System.out.println(" ");
//        }


//        int i, j, row = 6;
////Outer loop work for rows
//        for (i=0; i<row; i++)
//        {
////inner loop work for space
//            for (j=row-i; j>1; j--)
//            {
////prints space between two stars
//                System.out.print(" ");
//            }
////inner loop for columns
//            for (j=0; j<=i; j++ )
//            {
////prints star
//                System.out.print("* ");
//            }
////throws the cursor in a new line after printing each line
//            System.out.println();
//        }


//        for(int i=0;i<4;i++){
//            for(int j=i;j<4;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println(" ");
//        }


//        for(int i=0;i<4;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<4-i;k++){
//                System.out.print("*" + " ");
//            }
//            System.out.println(" ");
//        }


//        int num=11 ;
//        if(num%2==0){
//            System.out.println("No. is Even");
//        }else{
//            System.out.println("No. is Odd");
//
//        }

//        Scanner sc = new Scanner(System.in);
//       String scanned = sc.next();
//       //int x = Integer.parseInt(scanned);
//        System.out.println(scanned);
//
//        int x=5;
//        int y=10;
//        int z=6;
//        boolean compare= x<y;
//        System.out.println(compare);

//        System.out.println("Input your Age: ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int age = Integer.parseInt(s);
//        if(age>13){
//            System.out.println("You can ride..");
//        }else{
//            System.out.println("You cannot ride..");
//        }

//        int arr[] ={1,5,2,4,5};
//        String[] names = new String[5];

//        int count = 0;
//        for(int element:arr){
//            if(element == 5){
//                System.out.println("found 5! at index " + " "+count);
//            }
//            System.out.println(element + " " +count);
//            count++;
//        }

//        Scanner sc = new Scanner(System.in);
//
//        for(int i=0;i<names.length;i++){
//            System.out.print("Input : ");
//            String input = sc.nextLine();
//            names[i]=input;
//        }
//        for (String n1:names){
//            System.out.println(n1);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Type a Number: ");
//        int x = sc.nextInt();
//
//        int count =0;
//        while (x!=10){
//            System.out.println("Type 10 ..");
//            System.out.print("Type a Number: ");
//            x = sc.nextInt();
//            count++;
//        }
//        System.out.println("You Tried : " + count + " times");

//        ArrayList<Integer> t = new ArrayList<Integer>();
//        t.add(1);
//        t.get(0);
//        t.add(2);
//        t.add(11);
//        t.add(22);
//        t.add(45);
//        t.add(21);
//
//        t.set(1,5);

        //int x =t.size();
//        t.subList(1,4);
//
//        System.out.println(t);


//        Map m = new HashMap();
//        String str = "My name is Bhumi and I am strong lady";
//
//        for(char x : str.toCharArray()){
//            if(m.containsKey(x)){
//                int old = (int)m.get(x);
//                m.put(x,old+1);
//            }else{
//                m.put(x,1);
//            }
//        }
//        System.out.println(m);

//        int x[]= {12,16,11,56,33,22,1,7,0};
//
//        Arrays.sort(x,1,4);
//        for(int i:x){
//            System.out.print(i + ",");
//        }

//        Dog tim = new Dog("tim", 4);
//        tim.speak();
//        Dog bhumi = new Dog("bhumi", 7);
//        bhumi.speak();
//        Dog bill = new Dog("bill", 11);
//        bill.speak();
//
////        int x = tim.getAge();
////        System.out.println(x);
//
//        tim.setAge(12);
////        tim.speak();
//       int x= tim.add2();
//        System.out.println(x);
//        tim.speak();


//        Cat tim = new Cat("tim", 4,100);
//        tim.speak();
//        int no=3;
//        int sum = 0;
//        for(int i=1;i<=no;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        //Take size of array from user
//        System.out.println("enter the size of an array : ");
//        int arr_size = 0;
//        if (sc.hasNextInt()) {
//            arr_size = sc.nextInt();
//        }
//
//        int arr[] = new int[arr_size];
//        System.out.println("Enter the array Elements: ");
//        for (int i = 0; i < arr_size; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //print array
//
//        for (int i = 0; i < arr_size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//        //find max in the array elements
//        int max = arr[0];
//        for (int i = 0; i < arr_size; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Max is : " +max);

//        int a=10;
//        int b= 20;
//        int c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println("a: "+a+ " "+ "b: "+b);
//
//        System.out.println("8744");

//        Scanner sc = new Scanner(System.in);
//        int no = sc.nextInt();
//        findNumber(no);


//        int a =10;
//        int b=15;
//        int c= 20;
//
//
//        if (a>=b && a>=c){
//            System.out.println("largest No. "+a);
//        }else if (b>=a && b>=c){
//            System.out.println("largest No. "+b);
//        }else {
//            System.out.println("largest No. "+c);
//
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the input for year: ");
//        int year = sc.nextInt();
//        if(year%4 == 0 && year%100!=0){
//            System.out.println("YES it is a leap year");
//        }else if(year%400==0){
//            System.out.println("YES it is a leap year");
//        }else{
//            System.out.println("NO it is NOT a leap year");
//
//        }

        //count digit
//        int counter = 0;
//        int no = 9753;
//        while(no>0){
//            no=no/10;
//            counter++;
//        }
//        System.out.println("NO. : "+ counter);

        //Table of a number
//        Scanner sc = new Scanner(System.in);
//        int no = sc.nextInt();
//
//        int result = 0;
//        for(int i=1;i<=10;i++){
//            result=no*i;
//            System.out.print(result + " ");
//        }

        //PATTERNS
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                System.out.print("*"+" "); // System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Input: ");
//        int num = sc.nextInt();
//        System.out.println("Factorial Of Given Input Number:"+fact(num));

        //GCD of 2 Numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 1st NUmber: ");
//        int a = sc.nextInt();
//        System.out.print("Enter 2nd NUmber: ");
//        int b = sc.nextInt();
//
//        int ans =1;
//        int x = Math.min(a,b);
//        for(int i=1;i<=x;i++) {
//            if (a % i == 0 && b % i == 0) {
//                ans = i;
//            }
//        }
//        System.out.println(ans);

        // Print All Divisor of Number N
//        Scanner sc = new Scanner(System.in);
//        int no = sc.nextInt();
//        for(int i=1;i<=no;i++){
//            if(no%i==0)
//                System.out.print(i+ " ");
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int flag=0;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                System.out.print("NoT prime");
//                flag = 1;
//                break;
//            }
//        }
//        if(flag==0){
//            System.out.println("Prime");
//        }

//        Scanner  sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(firstDigit(x));
        
//        Scanner sc = new Scanner(System.in);
//        //size of an array
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<a.length;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("Distinct Elements: " +findDistinctElement(a,n));

       // int a[]= new int[5];
//        int flag=0;
//        int a[] ={10,20,30,40,50};
//        for(int i=1;i<a.length;i++){
//            if(a[i]<=a[i-1]){
//                flag=1;
//            }
//
//        }
//        if(flag==1){
//            System.out.println("Array is not not sorted");
//        }
//        else{
//            System.out.println("Array is sorted");
//        }
//

        
//        LinkedList list = new LinkedList();
//        list.addNode(10);
//        list.addNode(20);
//
//        System.out.println();

//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(1);
//        System.out.println(list);


//        LinkedList1 list = new LinkedList1();
//        list.insert(10);
//        list.insert(45);
//        list.insert(12);
//        list.insertAtStart(25);
//        list.insertAt(0,55);
//        list.deleteAt(2);
//
//        list.show();


//        Queue q = new Queue();
//        q.enQueue(1);
//        q.enQueue(2);
//        q.enQueue(30);
//        q.enQueue(40);
//
//        q.deQueue();
//
//        q.enQueue(400);
//        q.enQueue(4000);
//
//       // q.enQueue(19);
//       // q.enQueue(15);
//
//        System.out.println("Size of Queue: "+q.getSize());
//        System.out.println(q.isEmpty());
//        System.out.println(q.isFull());
//
//        q.show();

        //Reverse the String
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String str1 = " ";
//
//        int ptr = str.length()-1;
//        while(ptr>=0){
//            str1 = str1 + str.charAt(ptr);
//            ptr--;
//        }
//        System.out.println(str1);

        //Check String is Palindrome or not
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        boolean isPal = true;
//        int start = 0;
//        int end = str.length()-1;
//
//        while(start<end){
//            if(str.charAt(start)!=str.charAt(end)){
//                isPal=false;
//                break;
//            }
//            start++;
//            end--;
//        }
//        if(isPal==true){
//            System.out.println("Given String Is Palindrome");
//        }else {
//            System.out.println("Given String Is NOT Palindrome");
//        }
//



//        int arr[] = new int[]{2,9,4,6,1,7,5,3,0};
//        for(int i=0;i<arr.length;i++){
//            arr[i/2]=arr[arr[arr[i/3]/3]/3];
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        char chars[] = {'a','b','c'};
//        String str = new String(chars);
//        System.out.println(str);

//        int arr[] = {65,66,67,68};
//        String s = new String(arr,1,3);
//        System.out.println(s);

//        float f1[],f2[];
//        f1 = new float[10];
//        f2=f1;
//        System.out.println("f2[0] = "+ f2[0]);

//        String s1 = args[1];
//        String s2 = args[2];
//        String s3 = args[3];
//        System.out.println("args[2] = "+ s2);

//        A a = new A();
//        //System.out.println(a.x); // bacasue in class A we declare x as private data member
//        System.out.println(a.getX());


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Input Number :  " );
//        int a = sc.nextInt();
//        System.out.println("Big Integer factorial of a given no. :"+ factorial(a));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int a = sc.nextInt();
//        BigInteger b = BigInteger.valueOf(a);
//        System.out.println("whether given number is prime or not: "+isprime(a));
//        System.out.println("Find the next prime from given Input : "+nextPrime(a));

        //fun(() -> System.out.println("Hello"));
        //fun((p1,p2)-> System.out.println(p1 + " "+p2),10,20);
//        fun(p -> {if(p%2 == 0)
//            System.out.println("Even");
//            else
//            System.out.println("ODD");
//        });

//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            break;
//           // System.out.println("Hi");
//        }






    }

//    static void fun(Test1 t,Integer p){
//        //t.print(p1,p2);
//        t.print(p);
//    }


//    public static boolean isprime(int a){
//        BigInteger b = BigInteger.valueOf(a);
//        return b.isProbablePrime(1);
//    }
//    public static int nextPrime(int a){
//        BigInteger b = BigInteger.valueOf(a);
//        String n = b.nextProbablePrime().toString();
//        return Integer.parseInt(n);
//    }

//    public static BigInteger factorial(int a){
//        BigInteger f = new BigInteger("1");
//        for(int i=2;i<=a;i++){
//            BigInteger x = BigInteger.valueOf(i);
//            f = f.multiply(x);
//        }
//        return f;
//    }

//    public static int findDistinctElement(int[] a, int n) {
//        int count=0;boolean isDistinct=true;
//        for(int i=0;i<n;i++){
//            for(int j=i-1;j>=0;j--){
//                if(a[i]==a[j]){
//                    isDistinct=false;
//                    break;
//                }
//            }
//            if(isDistinct==true){
//                count++;
//            }
//            isDistinct=true;
//        }
//        return count;
//    }

//    private static int firstDigit(int x) {
//        while(x>10) {
//            x = x / 10;
//        }
//        return x;
//    }


//    static int fact(int n){
//          if(n==0)
//              return 1;
//          else
//              return n * fact(n-1);
//    }


//   public static int findNumber(int n){
//        int flag = 0;
//        if(n%2==0){
//            System.out.println("Even");
//            flag =1;
//        }
//        else
//            System.out.println("ODD");
//
//        return flag;
//    }
}
