package org.exemple.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HelloWorldTest {

    HelloWorld c = null;
    
    HelloWorld service = Mockito.mock(HelloWorld.class);
    
    
    @Before
    public void setUp() {
        c = new HelloWorld();
    }
    
    @Test
    public void testHelloWorld() {
        
        when(service.helloWorld()).thenReturn(System.getProperty("user.name"));
        assertEquals(System.getProperty("user.name"), service.helloWorld());
    }

}
