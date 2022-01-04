import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClasseEleve 
{
	private Eleve e1, e2, e3; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		e1 = new Eleve("SOPHIE", "PAMIER", "5ème C");
		e2 = new Eleve("DuRanD", "PaTRICK", "4ème A");
		e3 = new Eleve("Bob", "NotDead", "3ème D");
	}
	
	@Test
	void testGetters() {
		assertEquals("Erreur dans le getter Nom", "Pamier", e1.getNom());
		assertEquals("Erreur dans le getter Classe", "5ème C", e1.getClasse());
	}
	
	@Test
	void testAjouterNote() {
		assertEquals("Erreur dans le nombre de notes", 0, e1.getNbrNotes());
		e1.ajouterNote(12.0);
		assertEquals("Erreur dans le nombre de notes", 1, e1.getNbrNotes());
		e1.ajouterNote(8.0);
		assertEquals("Erreur dans le nombre de notes", 2, e1.getNbrNotes());
		assertTrue(!e1.ajouterNote(21.2));
		assertTrue(e1.ajouterNote(12.0));
	}

	
	
	
	
	
	
	
	
	
	
	
		
}
