package Junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by admin on 2016-10-25.
 */
public class demo {
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Set up before class");
    }

    @Test
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @Test
    public void LocalIp(){
        InetAddress inetAddress=null;

        try {
            inetAddress=inetAddress.getLocalHost();

            String localName=inetAddress.getHostName();
            String localIp=inetAddress.getHostAddress();
            System.out.println(localName+":"+localIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demandService(){
        Thread current=Thread.currentThread();
        System.out.println(current.getPriority());
        System.out.println(current.getName());
        System.out.println(current.activeCount());
        System.out.println(current.getId());
        System.out.println(current.getThreadGroup());
        System.out.println(current.getStackTrace());
        System.out.println(current.hashCode());
        System.out.println(current.toString());
    }
}
