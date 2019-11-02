import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameters {

@Test (dataProvider = "Data Provider1")
	public void doLogin (String name, String password) {
	System.out.println(name+ "       "+ password);
}


/*
@DataProvider (name = "Data Provider1")
public String[][] getdata() {
	String[][] k = new Object [2][2];
	k[0][0] = "Mohan ";
	k[0][1] = "Sohan ";
	return k;
}
*/


@DataProvider (name = "Data Provider1")
public Object[][] getdata() {
	Object[][] k = new Object [2][2];
	k[0][0] = "Mohan ";
	k[0][1] = "Sohan ";
	return k;
}
}