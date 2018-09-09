public class ObjectMasterTest {

	public static void main(String[] args) {
        ObjectMasterHuman humi1 = new ObjectMasterHuman();
		ObjectMasterHuman humi2 = new ObjectMasterHuman();

        humi2 = humi1.attack(humi2);
        humi1.buffStr();
        humi2 = humi1.attack(humi2);

	}

}
