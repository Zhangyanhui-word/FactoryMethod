package factorymethod;

public class Test {
		public static void main(String[] args) {
							  //Ҫ����'����־Ը��'���޸�����Ϳ���
			IFactory factory = new UndergraduateFactory();
			LeiFeng student = factory.createLeiFeng();
			
			student.Sweep();
			student.Wash();
			student.BuyRice();
			System.out.println("\n --------------------------");
			
			IFactory factory2 = new VolunteerFactory();
			LeiFeng volunteer = factory2.createLeiFeng();
			
			volunteer.Sweep();
			volunteer.Wash();
			volunteer.BuyRice();
		}
	}

