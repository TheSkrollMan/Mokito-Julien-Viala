package org.exemple.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculateurTest {

    Calculateur c = null;
    
    Calculateur service = Mockito.mock(Calculateur.class);
    
    
    @Before
    public void setUp() {
        c = new Calculateur();
    }
    
    @Test
    public void testAdd() {
        assertEquals(7, c.add(4, 3));
        
        when(service.add(4, 8)).thenReturn(5);
        assertEquals(5, service.add(4, 8));
        assertEquals(5, service.add(4, 8));
        
        verify(service, times(2)).add(4, 8);
    }

}
