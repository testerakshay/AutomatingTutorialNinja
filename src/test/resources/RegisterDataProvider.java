
public class RegisterDataProvider {
	
	@DataProvider(name = "registerDataForm")
	public static Object [][] getdata() {
	    return new Object[][] {
            {"Alice", "Smith"},
            {"Bob", "Johnson"},
            {"Charlie", "Brow"}
        };
		
		
	}

}
