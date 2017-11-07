package com.iammybest.springcloud.synclock;

public class ThreadLockTest {

    //使用RedisLock
    static class Outputer {
        //创建一个名为redisLock的RedisLock类型的锁
        RedisLock redisLock = new RedisLock("redisLock");

        public void output(String name) {
            //上锁
            redisLock.lock();
            try {
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
            } finally {
                //任何情况下都要释放锁
                redisLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final Outputer output = new Outputer();
        //线程1打印zhangsan
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    output.output("zhangsan");
                }
            }
        }).start();

        //线程2打印lingsi
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    output.output("lingsi");
                }
            }
        }).start();

        //线程3打印wangwu
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    output.output("huangwu");
                }
            }
        }).start();
    }
}
