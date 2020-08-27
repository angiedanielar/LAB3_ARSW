package edu.eci.arsw.springdemo;


import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

public class GrammarTest {
    
    @Autowired
    GrammarChecker gc;
    
    @Autowired
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    
    //Pruebas con GrammarCheck configurado con EnglishSpellChecker
    
    @Test
    public void shouldCheckInEnglish(){        
	gc=ac.getBean(GrammarChecker.class);
	assertTrue(gc.check("la la la ").equals("Spell checking output:Checked with english checker:la la la Plagiarism checking output: Not available yet"));        
    }
    
    @Test
    public void shouldNotCheckInSpanish(){
        gc=ac.getBean(GrammarChecker.class);
	assertFalse(gc.check("la la la ").equals("revisando la la la con el verificador de sintaxis del espanol  Plagiarism checking output: Not available yet"));        
    }
    
    //Pruebas con GrammarCheck configurado con SpanishSpellChecker
    /**
    @Test
    public void shouldNotCheckInEnglish(){        
	gc=ac.getBean(GrammarChecker.class);
	assertFalse(gc.check("la la la ").equals("Spell checking output:Checked with english checker:la la la Plagiarism checking output: Not available yet"));        
    }
    
    @Test
    public void shouldNotCheckSpanish(){
        gc=ac.getBean(GrammarChecker.class);
	assertTrue(gc.check("la la la ").equals("revisando la la la con el verificador de sintaxis del espanol  Plagiarism checking output: Not available yet"));        
    }    
    */
      
}
