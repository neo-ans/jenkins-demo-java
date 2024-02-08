
public class TestSample {  
  Sample sample=new Sample();   
  @Test  
  public void testSum() {  
      assertEquals(25, sample.sum(10, 15));  
  }  
}  
