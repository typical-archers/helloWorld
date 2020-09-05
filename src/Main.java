import charactor.ADHero;
import charactor.AP;
import charactor.APHero;
import charactor.Hero;
import property.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World!");
//        ADHero ad = new ADHero();
//        APHero ap = new APHero();
//        Hero h = new Hero();
////        h = ad;
//        ad = (ADHero) h;
//        ad = (APHero)ap;

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.setName("Good thread");
//        System.out.println(t.getName());

//        NewThread ob1 =  new NewThread("one");
//        NewThread ob2 = new NewThread("two");
//        NewThread ob3 = new NewThread("three");
//
//        System.out.println("One thread :" + ob1.t.isAlive());
//        System.out.println("Two thread :" + ob2.t.isAlive());
//        System.out.println("Three thread :" + ob3.t.isAlive());
//
//
//        System.out.println("Wait to all thread finished!");
//
//        try {
//            ob1.t.join();
//            ob2.t.join();
//            ob3.t.join();
//
//            System.out.println("One thread :" + ob1.t.isAlive());
//            System.out.println("Two thread :" + ob2.t.isAlive());
//            System.out.println("Three thread :" + ob3.t.isAlive());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//        for (int i = 5; i > 0; i--) {
//            System.out.println("Main thread: "+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
//        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
//        lo.start();
//        hi.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        lo.stop();
//        hi.stop();
//        try {
//            hi.t.join();
//            lo.t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Low priority thread " + lo.clicker);
//        System.out.println("High priority thread " + hi.clicker);

//        CallMe target = new CallMe();
//        Caller obj1 = new Caller(target,"hello");
//        Caller obj2 = new Caller(target,"world");
//
//        try {
//            obj1.t.join();
//            obj2.t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Q q = new Q();
//
//        new Producer(q);
//        new Consumer(q);
//        System.out.println("Press contol-c to stop");
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str[] = new String[10];
//        System.out.println("Enter lines of text");
//        System.out.println("Enter stop to quit");
//        for (int i = 0; i < 10; i++) {
//            try {
//                str[i] = br.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            if (str[i].equals("stop")) break;
//        }
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equals("stop")){
//                break;
//            }
//            System.out.println(str[i]);
//        }

//
//        PrintWriter pw = new PrintWriter(System.out,true);
//
//        pw.println("this is a string");
//
//        int i = -7;
//        pw.println(i);
//        double d = 4.5e-7;
////        pw.println(d);
//        A a = new A();
//        C c = new C();
//        D d = new D();
//
//        if (a instanceof A){
//            System.out.println("a is instance A");
//
//        }
//        if (c instanceof A){
//            System.out.println("c is instance A");
//        }
//        if (a instanceof D){
//            System.out.println("a is instance D");
//        }
//        A ob = d;
//        if (ob instanceof D){
//            System.out.println("ob is instance D");
//        }
//        ob = c;
//        System.out.println("Now ob is c");
//
//        if (ob instanceof D){
//            System.out.println("ob is instance D");
//        }
//        else {
//            System.out.println("Ob can not be D");
//        }
//
//        if (ob instanceof A){
//            System.out.println("ob is instance A");
//        }

        int a = 10;
        Solution solution = new Solution();
        boolean result = solution.isValid1("{[]}(){{}}");
        System.out.println(result);

    }
}
