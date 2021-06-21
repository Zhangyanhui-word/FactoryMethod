package factorymethod;
//社区志愿者工厂

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}

//学雷锋的大学生工厂
class UndergraduateFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
	
}