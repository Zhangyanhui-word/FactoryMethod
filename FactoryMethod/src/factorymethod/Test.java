package factorymethod;

public class Test {
		public static void main(String[] args) {
							  //要换成'社区志愿者'，修改这里就可以
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

