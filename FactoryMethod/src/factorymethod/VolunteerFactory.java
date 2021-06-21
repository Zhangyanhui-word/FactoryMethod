package factorymethod;
//����־Ը�߹���

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}

//ѧ�׷�Ĵ�ѧ������
class UndergraduateFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
	
}