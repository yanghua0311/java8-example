/**
 * 
 */
package com.young.java8;

import java.util.Random;

/**
 * Created by youngwa on 2018��4��8��
 *
 */
public class TessOOM {
	
	   private void dontStop() {
	        while (true) {
	        }
	    }
	
    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
    	TessOOM oom = new TessOOM();
        oom.stackLeakByThread();
    }
    
}
